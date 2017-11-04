public class MeetingMerger {
    public static void main(String[] args) {
        Meeting[] meetings = new Meeting[]{
                new Meeting(9, 10),
                new Meeting(3, 5),
                new Meeting(4, 8),
                new Meeting(5, 6),
                new Meeting(10, 12),
                new Meeting(4, 15),
                new Meeting(3, 6),
                new Meeting(0, 1)
        };

        Meeting[] orderedMeetings = orderMeetings(meetings, 0, 1, meetings.length);
        String resp = "";
        for (Meeting m : meetings) {
            if (m.getStartTime() == -1) continue;
            resp += m.getStartTime() + "/" + m.getEndTime() + "->";
        }
        System.out.println(resp);
    }

    public static Meeting[] orderMeetings(Meeting[] meetings, int baseIndex, int targetIndex, int limit) {
        if (baseIndex == limit-1) return meetings;

        if (targetIndex == limit) {
            orderMeetings(meetings, baseIndex + 1, baseIndex + 2, limit);
        } else {
            if (meetings[baseIndex].getStartTime() > meetings[targetIndex].getStartTime()) {
                // swap the two if base start time is larger than target start time
                Meeting temp = meetings[baseIndex];
                meetings[baseIndex] = meetings[targetIndex];
                meetings[targetIndex] = temp;
            } else {
                int baseEndTime = meetings[baseIndex].getEndTime();
                int targEndTime = meetings[targetIndex].getEndTime();
                if (baseEndTime != -1 && targEndTime != -1) {
                    System.out.println("Comparing: " + meetings[baseIndex].getStartTime() + "/" + meetings[baseIndex].getEndTime() + " and " + meetings[targetIndex].getStartTime() + "/" + meetings[targetIndex].getEndTime());
                    meetings[baseIndex].setEndTime(Math.max(baseEndTime, targEndTime));
                    System.out.println("Resulting: " + meetings[baseIndex].getStartTime() + "/" + meetings[baseIndex].getEndTime());
                    meetings[targetIndex] = new Meeting(-1, -1);
                }
            }


            orderMeetings(meetings, baseIndex, targetIndex + 1, limit);
        }

        return meetings;
    }
}
