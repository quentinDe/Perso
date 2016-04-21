import fr.imie.videodb.dao.IFilmDAO;

class FilmService(){


    public void List<video> createSequels(FilmDTO){
        try{
            list<FilmDTO> films = filmDAO.findFilmByExample(filmDTO);
            for (FilmDTO filmDTOFinded : films){
                FilmDTO = new FilmDTO();
                newFilm.setLibelle(filmDTOFinded.getLibelle()+" II");
                filmDAO.createFilm(newFilm);
            }
         return films = filmDAO.findByExample(filmDTO);
        }catch{

        }
    }
}
