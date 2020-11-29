package hotel;

/**
 * @Author Aiyuan
 * @Create 2020-10-26-10:50
 */
public class Search {
    MainRun mr=new MainRun();
    public String status(int homeNo){
        String homeStatus=mr.getRoom()[homeNo/100-1][homeNo%100-1];
        if(homeStatus.equals("EMPTY")){
            homeStatus="该房间为空";
        }else{
            homeStatus="该房间已经有人入住："+homeStatus;
        }
        return homeStatus;
    }
}
