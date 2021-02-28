package Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.Produit;
import Model.ProduitDAOImp;

public class UpdateController {

	@RequestMapping("/UpdateProduct.do")
	public String UpdProduit(@RequestParam(name = "nomProduit") String nomProduit,
			@RequestParam(name = "prixProduit") String prixProduit
			,@RequestParam(name = "idFournisseur") String idFournisseur, Model model) {
		
	ProduitDAOImp dao= new ProduitDAOImp();
	dao.update(new Produit(nomProduit,Double.parseDouble(prixProduit), Integer.parseInt(idFournisseur)));
	model.addAttribute("msg", "Produit a été mise à jour dans la base de données");
	 return "HelloWorld";
	}
	  

}
