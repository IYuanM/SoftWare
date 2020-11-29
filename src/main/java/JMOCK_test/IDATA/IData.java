package JMOCK_test.IDATA;

/**
 * @Author Aiyuan
 * @Create 2020-10-18-19:12
 */
public interface IData {
    public void iniRooms();
    public String inRoom(int roomNo,String name);
    public String getStation(int roomNo);
    //public String search();
    public String[][] getRooms();
    public int roomNo(int roomNo);
}
