package JMOCK_test.DP;

import JMOCK_test.IDATA.IData;

/**
 * @Author Aiyuan
 * @Create 2020-10-18-19:17
 */
public class DP implements IData {
    private static String[][] rooms;
    public void iniRooms() {
        rooms = new String[1][2];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                rooms[i][j] = "EMPTY";
            }
        }

    }
    public int roomNo(int roomNo){
        if("EMPTY".equals(rooms[roomNo/100-1][roomNo%100-1])){
            return roomNo;
        }else{
            return 0;
        }
    }

    public String inRoom(int roomNo, String name) {
        if(roomNo(roomNo)==0){
            return "该房间已经有客人入住！";
        }else{
            rooms[roomNo/100-1][roomNo%100-1]=name;
            return name+"住"+roomNo+"房间！";
        }
    }
    public String[][] getRooms(){
        return rooms;
    }

    public String getStation(int roomNo) {
        return rooms[roomNo/100-1][roomNo%100-1];
    }


}
