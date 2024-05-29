#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STUDENTS 20
#define NAME_LENGTH 30

char stuName[MAX_STUDENTS][NAME_LENGTH];
int presentAttendance[MAX_STUDENTS] = {0};
int absentAttendance[MAX_STUDENTS] = {0};
int indexNumber = 0;

void checkAttendance() {
    printf("\nTotal Present | Total Absent\n");
    for (int i = 0; i < indexNumber; i++) {
        printf("%s ", stuName[i]);
        printf("%d %d\n", presentAttendance[i], absentAttendance[i]);
    }
}

void addStudent() {
    int num;
    if (indexNumber == MAX_STUDENTS) {
        printf("Attendance register is full!\n");
        return;
    }
    printf("Enter how many students you want to add: ");
    scanf("%d", &num);
    getchar(); 

    if (num + indexNumber > MAX_STUDENTS) {
        printf("Cannot add more than %d students.\n", MAX_STUDENTS - indexNumber);
        return;
    }

    for (int i = 0; i < num; i++) {
        printf("\nEnter %d student name to add in attendance register: ", i + 1);
        fgets(stuName[indexNumber], NAME_LENGTH, stdin);
        stuName[indexNumber][strcspn(stuName[indexNumber], "\n")] = '\0'; 
        indexNumber++;
    }
}

void removeStudent() {
    char name[NAME_LENGTH];
    printf("Enter student name to remove: ");
    getchar(); 
    fgets(name, NAME_LENGTH, stdin);
    name[strcspn(name, "\n")] = '\0';

    for (int i = 0; i < indexNumber; i++) {
        if (strcmp(name, stuName[i]) == 0) {
            for (int j = i; j < indexNumber - 1; j++) {
                strcpy(stuName[j], stuName[j + 1]);
                presentAttendance[j] = presentAttendance[j + 1];
                absentAttendance[j] = absentAttendance[j + 1];
            }
            indexNumber--;
            printf("\n%s student is removed\n", name);
            return;
        }
    }
    printf("This name does not exist\n");
}

void takeAttendance() {
    char ch;
    printf("\nEnter Y for present and N for absent\n");
    for (int i = 0; i < indexNumber; i++) {
        while (1) {
            printf("%d. %s is present: ", i + 1, stuName[i]);
            ch = getchar();
            getchar();

            if (ch == 'Y' || ch == 'y') {
                presentAttendance[i]++;
                break;
            } else if (ch == 'N' || ch == 'n') {
                absentAttendance[i]++;
                break;
            } else {
                printf("Invalid character. Try again\n");
            }
        }
    }
}

int main() {
    int choose;
    do {
        printf("\n********** Main Menu ***********\n");
        printf("Enter 1 to add student\n");
        printf("Enter 2 to take attendance\n");
        printf("Enter 3 to check attendance\n");
        printf("Enter 4 to remove student\n");
        printf("Enter 5 to exit\n");
        printf("Please choose any menu: ");
        scanf("%d", &choose);
        getchar();

        switch (choose) {
            case 1:
                addStudent();
                break;
            case 2:
                takeAttendance();
                break;
            case 3:
                checkAttendance();
                break;
            case 4:
                removeStudent();
                break;
            case 5:
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choose != 5);

    return 0;
}
