package cuiaba.mt.eventosgratuitos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cuiaba.mt.eventosgratuitos.model.Evento;
import cuiaba.mt.eventosgratuitos.repository.Eventos;

@Controller
@RequestMapping ("/eventos") //mapeamento da URL
class EventosController {

	@Autowired
	private Eventos eventos;

	@RequestMapping("/novo")//mapeamento da url
	//metodo que retorna uma String com a nome da view
	public String novo (){
		return "CadastroEvento";
	}

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Evento evento){
		eventos.save(evento);
		ModelAndView mv = new ModelAndView("CadastroEvento");
		mv.addObject("mensagem", "Foi salvo com sucesso");
		return mv;
	}
}



