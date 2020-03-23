package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.RoomMapper;
import com.autolight.entity.Room;

@Service
@Transactional
public class RoomServiceImpl implements RoomService{
	@Resource
	private RoomMapper roomMapper;

	public List<Room> findRoomAll() {
		// TODO Auto-generated method stub
		return roomMapper.findRoomAll();
	}

	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		if(room.getRoom_id()!=null)
		{
			roomMapper.updateRoom(room);
		}else {
			 roomMapper.saveRoom(room);
		}
		
	}

	public Room findRoomByID(Integer room_id) {
		// TODO Auto-generated method stub
		return roomMapper.findRoomByID(room_id);
	}

	public void deleteRoom(Integer[] id) {
		// TODO Auto-generated method stub
		roomMapper.deleteRoom(id);
	}

}
