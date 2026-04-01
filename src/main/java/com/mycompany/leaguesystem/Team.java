/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leaguesystem;

import java.util.List;

public class Team {
    private League league;        // 1
    private Coach coach;          // 1
    private Stadium stadium;      // 1
    private List<Player> players; // 1..*
    private List<Match> matches;  // 1..* (plays)
}