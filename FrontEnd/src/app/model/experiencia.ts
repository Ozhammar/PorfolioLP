export class Experiencia {
  id?: number;
  nombreExp: string;
  inicioExp: string;
  finExp: string;
  cargoExp: string;
  descripcionExp: string;
  imgExp: string;

  constructor(
    nombreExp: string,
    inicioExp: string,
    finExp: string,
    cargoExp: string,
    descripcionExp: string,
    imgExp: string
  ) {
    this.nombreExp = nombreExp;
    this.inicioExp = inicioExp;
    this.finExp = finExp;
    this.cargoExp = cargoExp;
    this.descripcionExp = descripcionExp;
    this.imgExp = imgExp;
  }
}
