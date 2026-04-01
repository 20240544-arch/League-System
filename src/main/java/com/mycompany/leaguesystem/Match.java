/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leaguesystem;

import java.util.List;

public class Match {
    private Integer duration;
    
    // Associations
    private List<Player> players; // 1..* (played by)
    private List<Refree> refrees; // 2 (has a)
    private List<Goalie> goalies; // 2..*
}