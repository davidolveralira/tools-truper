package com.entrevista.truper.api.consumer;

import com.entrevista.truper.api.model.Herramientas;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/truper/")
public class HerramientasController {

    private List<Herramientas> herramientas;

    public HerramientasController() {

        /**
         * Mock:  Tabla Herramienta
         */
        herramientas = new ArrayList<>();
        herramientas.add(new Herramientas("ROTO12A7","ROTO-1/2A7-clave","TRUPER","Rotomartillo 1/2 650 W, profesional","15679"));
        herramientas.add(new Herramientas("HILA1800","HILA-1800-clave","TRUPER","Hidrolavadora eléctrica 1800 PSI","101594"));
        herramientas.add(new Herramientas("COMPKIT20P","COMP-KIT20P-clave","PRETUL","Kit, compresor 20 L , 2-1/2 HP, manguera PVC y pistola , Pretul","24357"));
        herramientas.add(new Herramientas("PRO5MEC","PRO-5MEC-clave","PRETUL","Flexómetros 5 m, cinta 13 mm en display box, 12 pzas, Pretul","21608"));

    }

    /**
     * Verbo:  GET
     */
    @RequestMapping("herramientas/")
    public List<Herramientas> getHerramientas() {
        return herramientas;
    }

    /**
     * Verbo: POST
     */
    @RequestMapping("herramienta/{idHerramienta}")
    public Herramientas serchHerramienta(@PathVariable("idHerramienta") String idHerramienta) {
        return herramientas.stream()
                .filter(h -> h.getIdHerramienta().equals(idHerramienta))
                .findFirst()
                .orElse(null);
    }
}
