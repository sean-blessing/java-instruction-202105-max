package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;
import interfaces.DAO;

public class MovieDB implements DAO<Movie>{
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}

	@Override
	public Movie get(int id) {
		Movie movie = null;
		String sql = "select * from movie where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				movie = getMovieFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movie;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from movie order by id");
			while (rs.next()) {
				Movie movie = getMovieFromRow(rs);
				movies.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movies;
	}

	private Movie getMovieFromRow(ResultSet rs) throws SQLException {
		// for each row, parse an movie
		int id = rs.getInt(1);
		String title = rs.getString(2);
		int year = rs.getInt(3);
		String rating = rs.getString(3);
		String director = rs.getString(4);
		Movie movie = new Movie(id, title, year, rating, director);
		return movie;
	}

	@Override
	public boolean add(Movie movie) {
		boolean success = false;
		String sql = "insert into movie (title, year, rating, director) "
				+ "values (?, ?, ?, ?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, movie.getTitle());
			stmt.setInt(2, movie.getYear());
			stmt.setString(3, movie.getRating());
			stmt.setString(4, movie.getDirector());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Movie movie) {
		// you may skip update as console update functionality is tedious
		boolean success = false;
		return success;
	}

	@Override
	public boolean delete(Movie movie) {
		boolean success = false;
		String sql = "delete from movie where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, movie.getId());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}
	
	/*
	 * Return all movies for given year
	 */
	public List<Movie> getMoviesByYear(int year) {
		List<Movie> movies = new ArrayList<>();
		return movies;
	}

}
