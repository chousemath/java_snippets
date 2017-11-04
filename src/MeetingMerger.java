import java.util.ArrayList;
import java.util.List;

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
        System.out.println("After ordering");
        String resp = "";
        for (Meeting m : meetings) {
            if (m.getStartTime() == -1) continue;
            resp += m.getStartTime() + "/" + m.getEndTime() + "->";
        }
        System.out.println(resp);

        System.out.println("After merging");

        orderedMeetings = mergeMeetings(orderedMeetings);
        System.out.println("After ordering");
        resp = "";
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
            }
            orderMeetings(meetings, baseIndex, targetIndex + 1, limit);
        }

        return meetings;
    }

    public static Meeting[] mergeMeetings(Meeting[] meetings) {
        List<Meeting> meetingList = new ArrayList<>();
        for (int i = 0; i < meetings.length - 1; i++) {
            if (meetings[i].getStartTime() == -1) continue;

            int startA = meetings[i].getStartTime();
            int endA = meetings[i].getEndTime();
            int startB = meetings[i].getStartTime();
            int endB = meetings[i+1].getEndTime();

            if (startA == startB) {
                System.out.println("startA and startB equal, comparing end: " + endA + " with end:" + endB);
                meetings[i].setEndTime(Math.max(endA, endB));
                meetings[i+1].setStartTime(-1);
                meetings[i+1].setEndTime(-1);
                i++;
            } else if (endA > endB) {
                System.out.println("A merge should have happened");
                meetings[i].setEndTime(endB);
                meetings[i+1].setStartTime(-1);
                meetings[i+1].setEndTime(-1);
                i++;
            }
        }

        System.out.println("After merging...");

        String resp = "";
        for (Meeting m : meetings) {
            if (m.getStartTime() == -1) continue;
            resp += m.getStartTime() + "/" + m.getEndTime() + "->";
        }
        System.out.println(resp);

        for (Meeting m : meetings) {
            if (m.getStartTime() != -1) {
                meetingList.add(m);
            }
        }

        Meeting[] meetingArr = new Meeting[meetingList.size()];

        for (int i = 0; i < meetingArr.length; i++) meetingArr[i] = meetingList.get(i);

        return meetingArr;
    }
}
