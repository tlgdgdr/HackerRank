//TimeConversion


public static String timeConversion(String s) {
    
        String[] arr = s.split(":",3);
        int h;
        if(arr[2].contains("PM")){
            h = Integer.parseInt(arr[0])%12 + 12;
        }
        else {
            h = Integer.parseInt(arr[0])%12;
        }
        String newHour = String.format("%02d", h);
        s = newHour + ":" + arr[1] + ":" + arr[2].substring(0, 2);
        return s;
}
