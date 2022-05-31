/***Walid Esse***/
#include <stdio.h>

int main()
{
    //2d array that will hold the names of the candidates
    char cand[100][1000];
    //The following code has the user enter the names of the
    //candidates. It places a \0 character at the end of each name
    printf("How many candidates are in the race? ");
    //Holds the number of candidates in the race
    int numCand;
    scanf("%i",&numCand);
    //get rid of the return from the scanf above
    getchar();
    //Get the names of the candidates
    int row = 0;
    //one name per row and go until we have the number of candidates
    while(row < numCand)
    {
        printf("Please enter the name candidate number %i: ",row+1);
        //get the first character of the name
        char cur = getchar();
        int col = 0;
        //while they haven't hit enter get the next character
        while(cur != '\n')
        {
            cand[row][col] = cur;
            cur = getchar();
            col = col +1;
        }
        //add the \0 character at the end of the useful info in the array
        cand[row][col]='\0';
        row = row + 1;
    }

    //Finally ask them how many people will be voting
    printf("How many people will be voting? ");
    int numVoters;
    scanf("%i",&numVoters);
    printf("\n**********VOTING WILL COMMENCE NOW***********\n");


    // create array "booth" to hold votes as they are taken
    int booth[100];

    // use array to set number of votes of each candidate = 0
    int i;
    i = 0;
    while (i < numCand)
    {
        booth[i] = 0;
        i = i+1;
    }
    i = 0;

    // gather votes for each candidate
    int j;
    j = 0;

    while (i < numVoters)
    {
        // print out voter id number
        printf ("Hello Voter %i. The candidates are: \n",i+1);

        // print out list of available candidates and voting directions
        while (j < numCand)
        {
            printf("\t%i = %s\n", j+1, &cand[j]);
            j = j+1;
        }
                printf("Please select the number of the candidate you wish to vote for: ");
        j = 0;
        i = i+1;

    }

    // count votes per candidate
}
