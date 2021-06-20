package ex41;

public class Sorter {
    public String[][] sort(String[][] people, int length) {
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if(people[j][0].compareTo(people[j + 1][0]) > 0)
                {
                    String temp = people[j][1];
                    people[j][1] = people[j + 1][1];
                    people[j + 1][1] = temp;
                    temp = people[j][0];
                    people[j][0] = people[j + 1][0];
                    people[j + 1][0] = temp;
                }
                else if((people[j][0].compareTo(people[j + 1][0]) == 0))
                    if((people[j][1].compareTo(people[j + 1][1]) > 0))
                    {
                        String temp = people[j][1];
                        people[j][1] = people[j + 1][1];
                        people[j + 1][1] = temp;
                        temp = people[j][0];
                        people[j][0] = people[j + 1][0];
                        people[j + 1][0] = temp;
                    }
        return people;
    }
}
