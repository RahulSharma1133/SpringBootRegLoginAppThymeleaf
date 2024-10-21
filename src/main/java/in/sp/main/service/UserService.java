package in.sp.main.service;

import in.sp.main.entities.User;

public interface UserService {

	public boolean registerUser(User user);
	public User loginUser(String email, String password);
}
