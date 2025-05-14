#include <stdio.h>
#include <string.h>

struct SoccerPlayer {
    char name[50];
    int matches;
    int goals;
    int assists;
};


// Setter methods
void setName(struct SoccerPlayer* player, const char* name) {
    strncpy(player->name, name, sizeof(player->name) - 1);
    player->name[sizeof(player->name) - 1] = '\0';
}

void setMatches(struct SoccerPlayer* player, int matches) {
    player->matches = matches;
}

void setGoals(struct SoccerPlayer* player, int goals) {
    player->goals = goals;
}

void setAssists(struct SoccerPlayer* player, int assists) {
    player->assists = assists;
}


// Print all player data
void printData(struct SoccerPlayer* player) {
    printf("NAME: %s | MATCHES: %d | GOALS: %d | ASSISTS: %d\n", 
    player->name, player->matches, player->goals, player->assists);
}


// Sum 2 players statistics
void sumPlayerData(struct SoccerPlayer* player1, struct SoccerPlayer* player2) {
    int totalMatches = player1->matches + player2->matches;
    int totalGoals = player1->goals + player2->goals;
    int totalAssists = player1->assists + player2->assists;

    printf("%s + %s | MATCHES: %d | GOALS: %d | ASSISTS: %d\n",
    player1->name, player2->name, totalMatches, totalGoals, totalAssists);
}


// Tests if a soccer player is good
int goodPlayer(struct SoccerPlayer* player) {
    if (strcmp(player->name, "CR7") == 0) {
        return 1;
    } else {
        return 0;
    }
}


int main() {
    struct SoccerPlayer cr7;
    struct SoccerPlayer messi;

    setName(&cr7, "CR7");
    setMatches(&cr7, 1270);
    setGoals(&cr7, 926);
    setAssists(&cr7, 728);

    setName(&messi, "Messi");
    setMatches(&messi, 1086);
    setGoals(&messi, 862);
    setAssists(&messi, 580);

    sumPlayerData(&cr7, &messi);

    // Print if CR7 is a good player
    if (goodPlayer(&cr7)) {
        printf("True\n");
    } else {
        printf("False\n");
    }

    // Print if Messi is a good player (we already know the answer)
    if (goodPlayer(&messi)) {
        printf("True\n");
    } else {
        printf("False\n");
    }
}