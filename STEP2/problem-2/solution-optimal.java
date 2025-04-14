class Solution {
    public int getMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        return hours * 60 + minutes;
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        int startTimeA = getMinutes(event1[0]);
        int endTimeA = getMinutes(event1[1]);
        
        int startTimeB = getMinutes(event2[0]);
        int endTimeB = getMinutes(event2[1]);
        
        return !(endTimeA < startTimeB || endTimeB < startTimeA);
    }
}

