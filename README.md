# BlendedLearningPortal-CORE-LOGIC
LOGIN logic - 7th October

1. the student data and the staff data is put into a constructor class and is checked from there.
2. the sign up page in triggered if the entered reg.no does not exist in the database
   {the initial idea was to keep a boolean flag, this idea can be worked upon GUI implementation}.
3. a boolean flag variable is kept so that if the login is successfull the flag is true and if it is unsuccesful it is false.
   This flag helps us to go to the next page.

STUDENT FRONT PAGE AND STAFF FRONT PAGE AND STUDENT SELECTION logic - 8th October

1. Seperate functions were created to display student front page and staff front page( DB is required to implement full logic )
2. A function was created to check if the login-ed register number exists in the teams DB or not. If not the function asks the reg.no and the team mates' reg.no and    
   adds it into the DB. If the team already exists, the function proceeds to the next page.
