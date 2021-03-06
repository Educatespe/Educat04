/*
 * The MIT License
 *
 * Copyright 2017 pablo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ec.edu.espe.isi.educat04;

//import ec.edu.espe.isi.educat04.model.Alumno;
import ec.edu.espe.isi.educat04.model.Docente;
//import ec.edu.espe.isi.educat04.service.AlumnoService;
import ec.edu.espe.isi.educat04.service.DocenteService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Cristhian Arevalo
 * Lista de docentes
 * creacion de el metodo inicio que nos obtiene una lista de docentes.
 */

@ManagedBean
@ViewScoped
public class IndexBean {
    
    @EJB
    private DocenteService docenteService;
    private List<Docente> docente;
    //private AlumnoService alumnoService;
    //private List<Alumno> alumno;
    
    @PostConstruct
    public void inicio(){
       this.docente = this.docenteService.obtenerDocentes();
       //this.alumno = this.alumnoService.obtenerAlumnos();
    }

    public List<Docente> getDocente() {
        return docente;
    }
       
    //public List<Alumno> getAlumno() {
      //  return alumno;
    //}
    
}
