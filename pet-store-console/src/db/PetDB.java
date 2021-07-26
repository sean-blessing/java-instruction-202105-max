package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Pet;
import interfaces.DAO;

public class PetDB implements DAO<Pet>{
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/petstore";
		String username = "pet_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}

	@Override
	public Pet get(int id) {
		Pet pet = null;
		String sql = "select * from pet where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				pet = getPetFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pet;
	}

	@Override
	public List<Pet> getAll() {
		List<Pet> pets = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from pet order by id");
			while (rs.next()) {
				Pet pet = getPetFromRow(rs);
				pets.add(pet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pets;
	}

	private Pet getPetFromRow(ResultSet rs) throws SQLException {
		// for each row, parse an pet
		int id = rs.getInt(1);
		String t = rs.getString(2);
		String b = rs.getString(3);
		String n = rs.getString(4);
		String bdStr = rs.getString(5);
		LocalDate bd = LocalDate.parse(bdStr);
		String g = rs.getString(6);
		String d = rs.getString(7);
		boolean a = rs.getBoolean(8);
		Pet pet = new Pet(id,t,b,n,bd,g,d,a);
		return pet;
	}

	@Override
	public boolean add(Pet pet) {
		boolean success = false;
		String sql = "insert into pet (type, breed, name, "
				+ "birthDate, gender, disposition, "
				+ "available) values (?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, pet.getType());
			stmt.setString(2, pet.getBreed());
			stmt.setString(3, pet.getName());
			stmt.setString(4, pet.getBirthDate().toString());
			stmt.setString(5, pet.getGender());
			stmt.setString(6, pet.getDisposition());
			stmt.setBoolean(7, pet.isAvailable());
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
	public boolean update(Pet pet) {
		// you may skip update as console update functionality is tedious
		boolean success = false;
//		String sql = "update pet set description = ?, "
//				+ ""	
//				+ " where id = ?";
//		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
//			stmt.setString(1, pet.getDescription());
//			stmt.setInt(2, pet.getId());
//			int rowsAffected = stmt.executeUpdate();
//			if (rowsAffected == 1) {
//				success = true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return success;
	}

	@Override
	public boolean delete(Pet pet) {
		boolean success = false;
		String sql = "delete from pet where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, pet.getId());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

}
