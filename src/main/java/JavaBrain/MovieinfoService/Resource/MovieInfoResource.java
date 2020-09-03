package JavaBrain.MovieinfoService.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaBrain.MovieinfoService.Model.Movie;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId)
	{
		return new Movie(movieId,"Dil Bachera");
	}

}
