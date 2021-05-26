package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {

        theForumUsersList.add(new ForumUser(1, "firstUser", 'M', LocalDate.of(1999, 5, 15), 0));
        theForumUsersList.add(new ForumUser(2, "secondUser", 'F', LocalDate.of(1998, 6, 20), 9));
        theForumUsersList.add(new ForumUser(3, "thirdUser", 'M', LocalDate.of(2005, 7, 25), 150));
        theForumUsersList.add(new ForumUser(4, "fourthUser", 'F', LocalDate.of(2006, 3, 7), 2332));
        theForumUsersList.add(new ForumUser(5, "fifthUser", 'M', LocalDate.of(2000, 12, 9), 65));
        theForumUsersList.add(new ForumUser(6, "sixthUser", 'M', LocalDate.of(1995, 11, 10), 133));
        theForumUsersList.add(new ForumUser(7, "seventhUser", 'F', LocalDate.of(2020, 10, 11), 25));
        theForumUsersList.add(new ForumUser(8, "eighthUser", 'F', LocalDate.of(2019, 6, 18), 100));
        theForumUsersList.add(new ForumUser(9, "ninthUser", 'F', LocalDate.of(2004, 1, 29), 1000));
        theForumUsersList.add(new ForumUser(10, "tenthUser", 'M', LocalDate.of(2001, 2, 14), 6765));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
