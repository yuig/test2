package b3;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface o0 {
    static void a(o0 o0Var, a3.d dVar) {
        n0 n0Var = n0.CounterClockwise;
        k kVar = (k) o0Var;
        float f13 = dVar.f484a;
        if (!Float.isNaN(f13)) {
            float f14 = dVar.f485b;
            if (!Float.isNaN(f14)) {
                float f15 = dVar.f486c;
                if (!Float.isNaN(f15)) {
                    float f16 = dVar.f487d;
                    if (!Float.isNaN(f16)) {
                        if (kVar.f21335b == null) {
                            kVar.f21335b = new RectF();
                        }
                        RectF rectF = kVar.f21335b;
                        Intrinsics.f(rectF);
                        rectF.set(f13, f14, f15, f16);
                        RectF rectF2 = kVar.f21335b;
                        Intrinsics.f(rectF2);
                        kVar.f21334a.addRect(rectF2, androidx.compose.ui.graphics.a.k(n0Var));
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    static void b(o0 o0Var, a3.e eVar) {
        n0 n0Var = n0.CounterClockwise;
        k kVar = (k) o0Var;
        if (kVar.f21335b == null) {
            kVar.f21335b = new RectF();
        }
        RectF rectF = kVar.f21335b;
        Intrinsics.f(rectF);
        rectF.set(eVar.f488a, eVar.f489b, eVar.f490c, eVar.f491d);
        if (kVar.f21336c == null) {
            kVar.f21336c = new float[8];
        }
        float[] fArr = kVar.f21336c;
        Intrinsics.f(fArr);
        long j13 = eVar.f492e;
        fArr[0] = a3.a.b(j13);
        fArr[1] = a3.a.c(j13);
        long j14 = eVar.f493f;
        fArr[2] = a3.a.b(j14);
        fArr[3] = a3.a.c(j14);
        long j15 = eVar.f494g;
        fArr[4] = a3.a.b(j15);
        fArr[5] = a3.a.c(j15);
        long j16 = eVar.f495h;
        fArr[6] = a3.a.b(j16);
        fArr[7] = a3.a.c(j16);
        RectF rectF2 = kVar.f21335b;
        Intrinsics.f(rectF2);
        float[] fArr2 = kVar.f21336c;
        Intrinsics.f(fArr2);
        kVar.f21334a.addRoundRect(rectF2, fArr2, androidx.compose.ui.graphics.a.k(n0Var));
    }
}
