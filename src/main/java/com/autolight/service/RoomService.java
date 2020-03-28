package com.autolight.service;

import java.util.List;

import com.autolight.entity.Room;
import com.autolight.entity.User;

public interface RoomService {

	public List<Room> findRoomAll();

	public void saveRoom(Room room);

	public Room findRoomByID(Integer room_id);

	public void deleteRoom(Integer[] id);

	public void updateRoomdianlustatusofconnect(Integer[] id);

	public void updateRoomdianlustatusofdisconnect(Integer[] id);

}
