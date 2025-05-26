package f5;

import android.graphics.Path;
import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.k3;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public char f61088a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f61089b;

    public h(char c13, float[] fArr) {
        this.f61088a = c13;
        this.f61089b = fArr;
    }

    public static void a(Path path, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z13, boolean z14) {
        double d2;
        double d13;
        double radians = Math.toRadians(f19);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d14 = f13;
        double d15 = f14;
        double d16 = (d15 * sin) + (d14 * cos);
        double d17 = d14;
        double d18 = f17;
        double d19 = d16 / d18;
        double d23 = f18;
        double d24 = ((d15 * cos) + ((-f13) * sin)) / d23;
        double d25 = d15;
        double d26 = f16;
        double d27 = ((d26 * sin) + (f15 * cos)) / d18;
        double d28 = ((d26 * cos) + ((-f15) * sin)) / d23;
        double d29 = d19 - d27;
        double d33 = d24 - d28;
        double d34 = (d19 + d27) / 2.0d;
        double d35 = (d24 + d28) / 2.0d;
        double d36 = (d33 * d33) + (d29 * d29);
        if (d36 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d37 = (1.0d / d36) - 0.25d;
        if (d37 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d36);
            float sqrt = (float) (Math.sqrt(d36) / 1.99999d);
            a(path, f13, f14, f15, f16, f17 * sqrt, f18 * sqrt, f19, z13, z14);
            return;
        }
        double sqrt2 = Math.sqrt(d37);
        double d38 = d29 * sqrt2;
        double d39 = sqrt2 * d33;
        if (z13 == z14) {
            d2 = d34 - d39;
            d13 = d35 + d38;
        } else {
            d2 = d34 + d39;
            d13 = d35 - d38;
        }
        double atan2 = Math.atan2(d24 - d13, d19 - d2);
        double atan22 = Math.atan2(d28 - d13, d27 - d2) - atan2;
        if (z14 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d43 = d2 * d18;
        double d44 = d13 * d23;
        double d45 = (d43 * cos) - (d44 * sin);
        double d46 = (d44 * cos) + (d43 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d47 = -d18;
        double d48 = d47 * cos2;
        double d49 = d23 * sin2;
        double d53 = (d48 * sin3) - (d49 * cos3);
        double d54 = d47 * sin2;
        double d55 = d23 * cos2;
        double d56 = (cos3 * d55) + (sin3 * d54);
        double d57 = d55;
        double d58 = atan22 / ceil;
        int i13 = 0;
        while (i13 < ceil) {
            double d59 = atan2 + d58;
            double sin4 = Math.sin(d59);
            double cos4 = Math.cos(d59);
            double d63 = d58;
            double d64 = (((d18 * cos2) * cos4) + d45) - (d49 * sin4);
            double d65 = d57;
            double d66 = d45;
            double d67 = (d65 * sin4) + (d18 * sin2 * cos4) + d46;
            double d68 = (d48 * sin4) - (d49 * cos4);
            double d69 = (cos4 * d65) + (sin4 * d54);
            double d73 = d59 - atan2;
            double tan = Math.tan(d73 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d73)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d53 * sqrt3) + d17), (float) ((d56 * sqrt3) + d25), (float) (d64 - (sqrt3 * d68)), (float) (d67 - (sqrt3 * d69)), (float) d64, (float) d67);
            i13++;
            atan2 = d59;
            d54 = d54;
            cos2 = cos2;
            ceil = ceil;
            d56 = d69;
            d18 = d18;
            d53 = d68;
            d17 = d64;
            d25 = d67;
            d45 = d66;
            d58 = d63;
            d57 = d65;
        }
    }

    public static void b(h[] hVarArr, Path path) {
        int i13;
        int i14;
        char c13;
        int i15;
        int i16;
        h hVar;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        h[] hVarArr2 = hVarArr;
        int i17 = 6;
        float[] fArr = new float[6];
        int length = hVarArr2.length;
        int i18 = 0;
        char c14 = 'm';
        while (i18 < length) {
            h hVar2 = hVarArr2[i18];
            char c15 = hVar2.f61088a;
            float f28 = fArr[0];
            float f29 = fArr[1];
            float f33 = fArr[2];
            float f34 = fArr[3];
            float f35 = fArr[4];
            float f36 = fArr[5];
            switch (c15) {
                case 'A':
                case 'a':
                    i13 = 7;
                    break;
                case 'C':
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                    i13 = i17;
                    break;
                case 'H':
                case 'V':
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                    i13 = 1;
                    break;
                case 'Q':
                case 'S':
                case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                    i13 = 4;
                    break;
                case 'Z':
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                    path.close();
                    path.moveTo(f35, f36);
                    f28 = f35;
                    f33 = f28;
                    f29 = f36;
                    f34 = f29;
                default:
                    i13 = 2;
                    break;
            }
            float f37 = f35;
            float f38 = f36;
            float f39 = f28;
            float f41 = f29;
            int i19 = 0;
            while (true) {
                float[] fArr2 = hVar2.f61089b;
                if (i19 < fArr2.length) {
                    if (c15 != 'A') {
                        if (c15 != 'C') {
                            if (c15 == 'H') {
                                i14 = i19;
                                c13 = c15;
                                i15 = i18;
                                i16 = length;
                                hVar = hVar2;
                                path.lineTo(fArr2[i14], f41);
                                f39 = fArr2[i14];
                            } else if (c15 == 'Q') {
                                i14 = i19;
                                c13 = c15;
                                i15 = i18;
                                i16 = length;
                                hVar = hVar2;
                                float f43 = fArr2[i14];
                                int i23 = i14 + 1;
                                float f44 = fArr2[i23];
                                int i24 = i14 + 2;
                                int i25 = i14 + 3;
                                path.quadTo(f43, f44, fArr2[i24], fArr2[i25]);
                                f13 = fArr2[i14];
                                f14 = fArr2[i23];
                                f39 = fArr2[i24];
                                f41 = fArr2[i25];
                            } else if (c15 == 'V') {
                                i14 = i19;
                                c13 = c15;
                                i15 = i18;
                                i16 = length;
                                hVar = hVar2;
                                path.lineTo(f39, fArr2[i14]);
                                f41 = fArr2[i14];
                            } else if (c15 != 'a') {
                                if (c15 != 'c') {
                                    if (c15 != 'h') {
                                        if (c15 == 'q') {
                                            i14 = i19;
                                            float f45 = f41;
                                            float f46 = f39;
                                            int i26 = i14 + 1;
                                            int i27 = i14 + 2;
                                            int i28 = i14 + 3;
                                            path.rQuadTo(fArr2[i14], fArr2[i26], fArr2[i27], fArr2[i28]);
                                            float f47 = f46 + fArr2[i14];
                                            float f48 = fArr2[i26] + f45;
                                            float f49 = f46 + fArr2[i27];
                                            f41 = f45 + fArr2[i28];
                                            f34 = f48;
                                            f33 = f47;
                                            c13 = c15;
                                            i15 = i18;
                                            i16 = length;
                                            f39 = f49;
                                        } else if (c15 == 'v') {
                                            i14 = i19;
                                            path.rLineTo(0.0f, fArr2[i14]);
                                            f41 += fArr2[i14];
                                        } else if (c15 == 'L') {
                                            i14 = i19;
                                            int i29 = i14 + 1;
                                            path.lineTo(fArr2[i14], fArr2[i29]);
                                            f39 = fArr2[i14];
                                            f41 = fArr2[i29];
                                        } else if (c15 == 'M') {
                                            i14 = i19;
                                            f39 = fArr2[i14];
                                            f41 = fArr2[i14 + 1];
                                            if (i14 > 0) {
                                                path.lineTo(f39, f41);
                                            } else {
                                                path.moveTo(f39, f41);
                                                f38 = f41;
                                                f37 = f39;
                                            }
                                        } else if (c15 == 'S') {
                                            i14 = i19;
                                            float f53 = f41;
                                            float f54 = f39;
                                            if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                f19 = (f53 * 2.0f) - f34;
                                                f23 = (f54 * 2.0f) - f33;
                                            } else {
                                                f23 = f54;
                                                f19 = f53;
                                            }
                                            int i33 = i14 + 1;
                                            int i34 = i14 + 2;
                                            int i35 = i14 + 3;
                                            path.cubicTo(f23, f19, fArr2[i14], fArr2[i33], fArr2[i34], fArr2[i35]);
                                            float f55 = fArr2[i14];
                                            float f56 = fArr2[i33];
                                            f39 = fArr2[i34];
                                            f41 = fArr2[i35];
                                            f34 = f56;
                                            f33 = f55;
                                        } else if (c15 == 'T') {
                                            i14 = i19;
                                            float f57 = f41;
                                            float f58 = f39;
                                            if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                f15 = (f58 * 2.0f) - f33;
                                                f16 = (f57 * 2.0f) - f34;
                                            } else {
                                                f15 = f58;
                                                f16 = f57;
                                            }
                                            int i36 = i14 + 1;
                                            path.quadTo(f15, f16, fArr2[i14], fArr2[i36]);
                                            f17 = fArr2[i14];
                                            f18 = fArr2[i36];
                                        } else if (c15 == 'l') {
                                            i14 = i19;
                                            int i37 = i14 + 1;
                                            path.rLineTo(fArr2[i14], fArr2[i37]);
                                            f39 += fArr2[i14];
                                            f41 += fArr2[i37];
                                        } else if (c15 == 'm') {
                                            i14 = i19;
                                            float f59 = fArr2[i14];
                                            f39 += f59;
                                            float f63 = fArr2[i14 + 1];
                                            f41 += f63;
                                            if (i14 > 0) {
                                                path.rLineTo(f59, f63);
                                            } else {
                                                path.rMoveTo(f59, f63);
                                                f38 = f41;
                                                f37 = f39;
                                            }
                                        } else if (c15 == 's') {
                                            if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                float f64 = f39 - f33;
                                                f24 = f41 - f34;
                                                f25 = f64;
                                            } else {
                                                f24 = 0.0f;
                                                f25 = 0.0f;
                                            }
                                            int i38 = i19 + 1;
                                            int i39 = i19 + 2;
                                            int i43 = i19 + 3;
                                            i14 = i19;
                                            float f65 = f41;
                                            float f66 = f39;
                                            path.rCubicTo(f25, f24, fArr2[i19], fArr2[i38], fArr2[i39], fArr2[i43]);
                                            f15 = f66 + fArr2[i14];
                                            f16 = f65 + fArr2[i38];
                                            f17 = f66 + fArr2[i39];
                                            f18 = fArr2[i43] + f65;
                                        } else if (c15 != 't') {
                                            i14 = i19;
                                        } else {
                                            if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                f26 = f39 - f33;
                                                f27 = f41 - f34;
                                            } else {
                                                f27 = 0.0f;
                                                f26 = 0.0f;
                                            }
                                            int i44 = i19 + 1;
                                            path.rQuadTo(f26, f27, fArr2[i19], fArr2[i44]);
                                            float f67 = f26 + f39;
                                            float f68 = f27 + f41;
                                            f39 += fArr2[i19];
                                            f41 += fArr2[i44];
                                            f34 = f68;
                                            i14 = i19;
                                            c13 = c15;
                                            i15 = i18;
                                            i16 = length;
                                            f33 = f67;
                                        }
                                        hVar = hVar2;
                                    } else {
                                        i14 = i19;
                                        path.rLineTo(fArr2[i14], 0.0f);
                                        f39 += fArr2[i14];
                                    }
                                    c13 = c15;
                                    i15 = i18;
                                    i16 = length;
                                    hVar = hVar2;
                                } else {
                                    i14 = i19;
                                    float f69 = f41;
                                    float f73 = f39;
                                    int i45 = i14 + 2;
                                    int i46 = i14 + 3;
                                    int i47 = i14 + 4;
                                    int i48 = i14 + 5;
                                    path.rCubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i45], fArr2[i46], fArr2[i47], fArr2[i48]);
                                    f15 = f73 + fArr2[i45];
                                    f16 = f69 + fArr2[i46];
                                    f17 = f73 + fArr2[i47];
                                    f18 = fArr2[i48] + f69;
                                }
                                f34 = f16;
                                f33 = f15;
                                c13 = c15;
                                i15 = i18;
                                i16 = length;
                                f39 = f17;
                                f41 = f18;
                                hVar = hVar2;
                            } else {
                                i14 = i19;
                                float f74 = f41;
                                float f75 = f39;
                                int i49 = i14 + 5;
                                int i53 = i14 + 6;
                                c13 = c15;
                                i16 = length;
                                hVar = hVar2;
                                i15 = i18;
                                a(path, f75, f74, fArr2[i49] + f75, fArr2[i53] + f74, fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != 0.0f, fArr2[i14 + 4] != 0.0f);
                                f39 = f75 + fArr2[i49];
                                f41 = f74 + fArr2[i53];
                            }
                            i19 = i14 + i13;
                            hVar2 = hVar;
                            length = i16;
                            c14 = c13;
                            c15 = c14;
                            i18 = i15;
                        } else {
                            i14 = i19;
                            c13 = c15;
                            i15 = i18;
                            i16 = length;
                            hVar = hVar2;
                            int i54 = i14 + 2;
                            int i55 = i14 + 3;
                            int i56 = i14 + 4;
                            int i57 = i14 + 5;
                            path.cubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i54], fArr2[i55], fArr2[i56], fArr2[i57]);
                            f39 = fArr2[i56];
                            f41 = fArr2[i57];
                            f13 = fArr2[i54];
                            f14 = fArr2[i55];
                        }
                        f33 = f13;
                        f34 = f14;
                        i19 = i14 + i13;
                        hVar2 = hVar;
                        length = i16;
                        c14 = c13;
                        c15 = c14;
                        i18 = i15;
                    } else {
                        i14 = i19;
                        c13 = c15;
                        i15 = i18;
                        i16 = length;
                        hVar = hVar2;
                        int i58 = i14 + 5;
                        int i59 = i14 + 6;
                        a(path, f39, f41, fArr2[i58], fArr2[i59], fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != 0.0f, fArr2[i14 + 4] != 0.0f);
                        f39 = fArr2[i58];
                        f41 = fArr2[i59];
                    }
                    f34 = f41;
                    f33 = f39;
                    i19 = i14 + i13;
                    hVar2 = hVar;
                    length = i16;
                    c14 = c13;
                    c15 = c14;
                    i18 = i15;
                }
            }
            fArr[0] = f39;
            fArr[1] = f41;
            fArr[2] = f33;
            fArr[3] = f34;
            fArr[4] = f37;
            fArr[5] = f38;
            c14 = hVar2.f61088a;
            i18++;
            hVarArr2 = hVarArr;
            length = length;
            i17 = 6;
        }
    }

    public h(h hVar) {
        this.f61088a = hVar.f61088a;
        float[] fArr = hVar.f61089b;
        this.f61089b = k3.H(fArr.length, fArr);
    }
}
