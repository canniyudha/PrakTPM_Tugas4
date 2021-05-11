package com.example.tugas5;

import java.util.ArrayList;

public class FootballData {
    private static String[] title = new String[]{"Minecraft","League of Legends","Counter Strike : Global Offensive", "Call of Duty : Wazone","Valorant","Grand Theft Auto V","Fortnite","Apex Legend","Roblox","Rocket League"};
    private static int[] thumbnail = new
            int[]{R.drawable.gambar1,R.drawable.gambar2,R.drawable.gambar3, R.drawable.gambar4,R.drawable.gambar5,R.drawable.gambar6,R.drawable.gambar7,R.drawable.gambar8,R.drawable.gambar9,R.drawable.gambar10};
    public static ArrayList<FootballModel> getListData(){
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            footballModel = new FootballModel();
            footballModel.setLogoTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            list.add(footballModel);
        }
        return list;
    }
}
