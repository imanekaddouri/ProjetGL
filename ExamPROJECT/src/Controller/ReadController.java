package Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.ProduitDAOImp;

public class ReadController {


@RequestMapping("/ReadProduct.do")
public String ChercherProduit(@RequestParam(name = "id") int id, Model model) {
	
ProduitDAOImp dao= new ProduitDAOImp();
dao.select(id);
model.addAttribute("msg", "Produit a �t� trouv� dans la base de donn�es");
 return "HelloWorld";
}
}
