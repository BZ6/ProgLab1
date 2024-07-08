public class Main {
        public static void main(String[] args){
                short[] a = new short[11];
                double[] x = new double[19];
                double[][] d = new double[11][19];
                for (int i = 0; i < 11; i++){
                        a[i] = (short) (i + 5);
                }
                for (int i = 0; i < 19; i++){
                        x[i] = Math.random() * 17 - 5;
                }
                for (int i = 0; i < 11; i++){
                        for (int j = 0; j < 19; j++){
                                switch (a[i]){
                                        case 7:
                                        d[i][j] = Math.pow(Math.pow((x[j] / 6) * (x[j] / 6), (Math.log(Math.abs(x[j])) + 0.5) / Math.pow(0.25 / (1 / 3 - x[j]), 3)), 3);
                                        break;
                                        case 5:
                                        d[i][j] = Math.log(Math.pow(Math.sin(Math.log(Math.pow(Math.abs(x[j]) / (2 * Math.PI + Math.abs(x[j])),2))), 2));
                                        break;
                                        case 6:
                                        d[i][j] = Math.log(Math.pow(Math.sin(Math.log(Math.pow(Math.abs(x[j]) / (2 * Math.PI + Math.abs(x[j])),2))), 2));
                                        break;
                                        case 11:
                                        d[i][j] = Math.log(Math.pow(Math.sin(Math.log(Math.pow(Math.abs(x[j]) / (2 * Math.PI + Math.abs(x[j])),2))), 2));
                                        break;
                                        case 12:
                                        d[i][j] = Math.log(Math.pow(Math.sin(Math.log(Math.pow(Math.abs(x[j]) / (2 * Math.PI + Math.abs(x[j])),2))), 2));
                                        break;
                                        case 13:
                                        d[i][j] = Math.log(Math.pow(Math.sin(Math.log(Math.pow(Math.abs(x[j]) / (2 * Math.PI + Math.abs(x[j])),2))), 2));
                                        break;
                                        default:
                                        d[i][j] = Math.log(Math.exp(Math.log(Math.acos(1 / Math.exp(Math.abs(x[j]))))));
                                        break;
                                }
                        }
                }
                for (int i = 0; i < 11; i++, System.out.println("")){
                        for (int j = 0; j < 19; j++, System.out.printf(" ")){
                                System.out.printf("%7.3f", d[i][j]);
                        }
                }
        }
}