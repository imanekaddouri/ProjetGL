package Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Model.Produit;
import Model.ProduitDAOImp;

import org.springframework.ui.Model;

@Controller

public class AddController {


@RequestMapping("/AddProduct.do")
public String AjouterProduit(@RequestParam(name = "nomProduit") String nomProduit,
		@RequestParam(name = "prixProduit") String prixProduit
		,@RequestParam(name = "idFournisseur") String idFournisseur, Model model) {
	
ProduitDAOImp dao= new ProduitDAOImp();
dao.create(new Produit(nomProduit,Double.parseDouble(prixProduit), Integer.parseInt(idFournisseur)));
model.addAttribute("msg", "Produit a été ajouté à la base de données");
 return "HelloWorld";
}
  
}