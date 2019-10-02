# SpotTunes
A Spotify Clone

# Team Members
Iqbal Anwar (@<a href = "https://github.com/iqbalanwar">iqbalanwar</a>)<br/>
Christine Le (@<a href="https://github.com/le-christine">le-christine</a>)<br/>
  
# Design Decisions
<img alt = "database design" src="images/spot-tunes-erd-v3.jpeg"/><br/>
- Our SpotTunes app has four data models: `User`, `User_role`, `Song` and `Playlist`.
- The `User` has the fields id, username and password.
- The `Song` table has the fields id, title and length.
- The `User` and `User_role` are mapped to each other (one-to-many relationship)
- The `User` and `Song` tables are mapped to each other.
- The `Playlist` JOIN table connects user_id and song_id with a many-to-many relationship. 

We wanted to have user roles to limit database alteration permissions. The ROLE_ADMIN can only be set by the database administrator (is only allowed in Postgres). Our users have an id, username, password, and role. By default, upon sign up all users are participants noted by ROLE_PARTICIPANT. For our songs, songs have a title and length. Songs can only be added to the database by a ROLE_ADMIN. This is because we don't want users to modify our total database of songs. Users, however, can add and delete songs from their playlist. Our playlist is a JOIN table of user_id and song_id. 


# Completions

| Day            | 1                                    | 2                                            | 3                                                   | 4                                                     |5|
|----------------|--------------------------------------|----------------------------------------------|-----------------------------------------------------|-------------------------------------------------------|------|
| Goals  |Handled login/signup <br/> Created User table |  Created Songs and<br/> User Role tables | Create Playlist JOIN Table & map</br>Attach roles to users<br/>Add Security<br/>  | Delete Song<br/>View Roles</br>Debug Playlist Mapping<br/>Testing (add/delete song, signup/in| Thymeleaf & front-end |
| Task Completed?  | Y  | Y  | Y | Y  | Y |

# Challenges

We flag our issues on Github. 

Testing our methods was challenging because it required us to think granularly what aspect of the object we were testing (e.g. when we add a song, do we compare User objects or just the songs in the object). 

# Reflection 

There isn't a single requirement we enjoyed working on more than the other. It was sastifying to know that after each step, from database population to generating a token, it all worked as we intended. This meant that Java was communicating to Postgres, and the dependencies were working as expected. Thankfully that meant that our MVC was functional. 
