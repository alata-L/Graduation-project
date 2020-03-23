package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Room;

public interface RoomMapper {

	public List<Room> findRoomAll();

	public void saveRoom(Room room);

	public void updateRoom(Room room);

	public Room findRoomByID(Integer room_id);

	public void deleteRoom(Integer[] id);

}
