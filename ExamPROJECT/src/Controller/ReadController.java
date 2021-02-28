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
model.addAttribute("msg", "Produit a été trouvé dans la base de données");
 return "HelloWorld";
}
}
