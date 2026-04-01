package com.mycompany.leaguesystem;

import java.util.Date;
import java.util.List;

public class League {
    private Date startDate;
    private Date endDate;
    
    // Associations
    private List<Team> teams;    // 1..* private List<Match> matches; // 1..38
}