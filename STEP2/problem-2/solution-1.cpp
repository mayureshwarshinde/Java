class Solution {
public:
    bool haveConflict(vector<string>& event1, vector<string>& event2) {
        
        int a_start_hour = ((event1[0][0] - '0') * 10) + event1[0][1] - '0';
        int a_start_min = ((event1[0][3] - '0') * 10) +  event1[0][4] - '0';
        int a_start_time = (a_start_hour * 60) +  a_start_min;
        
        int a_end_hour = ((event1[1][0] - '0') * 10) + event1[1][1] - '0';
        int a_end_min = ((event1[1][3] - '0') * 10) +  event1[1][4] - '0';
        int a_end_time = (a_end_hour * 60) + a_end_min;
        
        int b_start_hour = ((event2[0][0] - '0') * 10) + event2[0][1] - '0';
        int b_start_min = ((event2[0][3] - '0') * 10) +  event2[0][4] - '0';
        int b_start_time = (b_start_hour * 60) + b_start_min;
        
        int b_end_hour = ((event2[1][0] - '0') * 10) + event2[1][1] - '0';
        int b_end_min = ((event2[1][3] - '0') * 10) +  event2[1][4] - '0';
        int b_end_time = (b_end_hour * 60) + b_end_min;
        
        return !(a_end_time < b_start_time || b_end_time < a_start_time);
    }
};

