export class Skills {
    id?: number;
    nombreS: string;
    valueSk: string;
    imgS: string;

    constructor(nombreS: string, valueSk: string, imgS: string) {
        this.nombreS = nombreS;
        this.valueSk = valueSk;
        this.imgS = imgS;
    }
}
