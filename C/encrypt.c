#include <stdio.h>

int main()
{
    // variables
    char msg[1000];
    int task = 0;

    // scanning for input
    printf("Please enter your message: ");
    int i = 0;

    msg[i] = getchar();
    while(msg[i] != '\n')
    {
        i = i + 1;
        msg[i] = getchar();
    }

    msg[i] = '\0';
    while(task != 1 && task != 2)
    {
        printf("Would you like to <1> encrypt this message or <2> decrypt it: ");
        scanf(" %i", &task);
    }

    // encryption
    if (task == 1)
    {
        i = 0;
        while(msg[i] != '\0')
        {
            if(msg[i] >= 65 && msg[i] <= 90)
        {
                msg[i] = (msg[i] - 64 + i % 26) % 26 + 65;
        }
            else if(msg[i] >= 97 && msg[i] <= 122)
            {
                msg[i] >= (msg[i] - 96 + i % 26) % 26 + 97;
            }
            i = i + 1;
        }

    printf("\nYour encrypted message is: \n%s\n", msg);
    }

    // decryption
    if (task == 2)
    {
        i = 0;
        while(msg[i] != '\0')
        {
            if(msg[i] >= 65 && msg[i] <= 90)
            {
                msg[i] = (msg[i] - 40 - i % 26) % 26 + 65;
            }
            else if(msg[i] >= 97 && msg[i] <= 122)
            {
                msg[i] >= (msg[i] - 72 - i % 26) % 26 + 97;
            }
            i = i + 1;
        }
    printf("\nYour decrypted message is: \n%s\n", msg);
    }

}
