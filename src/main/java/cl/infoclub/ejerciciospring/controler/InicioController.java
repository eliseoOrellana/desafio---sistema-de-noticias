package cl.infoclub.ejerciciospring.controler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.infoclub.ejerciciospring.modelo.Noticia;

@Controller

public class InicioController {
	private final static Logger logger = LoggerFactory.getLogger(InicioController.class);

	@RequestMapping("/")
	public String Inicio(Model model) {
		String file="src/main/resources/static/data.txt";
		ArrayList<Noticia> listadoNoticia=new ArrayList<Noticia>();
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String datoLinea=br.readLine();
			logger.info("La noticia está lista para ser desplegada");
			while (datoLinea!=null) {		
				String[] noticia = datoLinea.split("@@");
				Noticia news = new Noticia(noticia[0], noticia[1], noticia[2]);
				listadoNoticia.add(news);
				datoLinea=br.readLine();
				datoLinea=br.readLine();
			}
			br.close();
			fr.close();			
			
			
			
		} catch (Exception e) {			
			logger.error("Mi log con error "+e);
			System.out.println(listadoNoticia.size());
		}
		
	
		model.addAttribute("listadoNoticia",listadoNoticia);
		return "inicio";
	}
	
	
}
