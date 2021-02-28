package Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Model.ProduitDAOImp;

import org.springframework.ui.Model;

@Controller

public class DeleteController {


@RequestMapping("/DeleteProduct.do")
public String SupprimerProduit(@RequestParam(name = "id") int id, Model model) {
	
ProduitDAOImp dao= new ProduitDAOImp();
dao.delete(id);
model.addAttribute("msg", "Produit a été supprimé la base de données");
 return "produit";
}
  
}