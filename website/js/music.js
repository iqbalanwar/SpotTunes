function loadAllSongs() {
    fetch("http://localhost:8181/song/list", {
      headers: {
        "Authorization" : "Bearer " + localStorage.getItem('user')
        }
      })
      .then((res) => {
          return res.json();
      })
      .then((res) => {
            const allSongs = document.querySelector('.allSongs');

            for (let i = 0; i<res.length; i++) {
              const song = document.createElement('div');
              song.innerText = res[i].title + res[i].length;
              allSongs.append(song);
            }
        })
        .catch((error) => {
            console.log(error);
        })
}

loadAllSongs();
function changeWelcomeMsg() {
  document.querySelector('.usernameHere').innerText = localStorage.getItem('username');
}

changeWelcomeMsg();
