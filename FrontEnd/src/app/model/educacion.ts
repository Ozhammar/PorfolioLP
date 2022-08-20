export class Educacion {
  id?: number;
  nombreEdu: string;
  urlEdu: string;
  descripcionEdu: string;
  inicioEdu: string;
  finEdu: string;
  tituloEdu: string;
  imgEdu: string;

  constructor(
    nombreEdu: string,
    urlEdu: string,
    descripcionEdu: string,
    inicioEdu: string,
    finEdu: string,
    tituloEdu: string,
    imgEdu: string
  ) {
    this.nombreEdu = nombreEdu;
    this.urlEdu = urlEdu;
    this.descripcionEdu = descripcionEdu;
    this.inicioEdu = inicioEdu;
    this.finEdu = finEdu;
    this.tituloEdu = tituloEdu;
    this.imgEdu = imgEdu;
  }
}
