package w4;

import android.view.View;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class q extends t4.p {
    public q() {
        this.f116402c = new float[3];
        this.f116403d = false;
        this.f116405f = Float.NaN;
    }

    public final float b(float f13, long j13, View view, t4.f fVar) {
        float[] fArr = this.f116402c;
        this.f116400a.H(f13, fArr);
        boolean z13 = true;
        float f14 = fArr[1];
        if (f14 == 0.0f) {
            this.f116403d = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f116405f)) {
            float a13 = fVar.a(this.f116401b, view);
            this.f116405f = a13;
            if (Float.isNaN(a13)) {
                this.f116405f = 0.0f;
            }
        }
        float f15 = (float) (((((j13 - this.f116404e) * 1.0E-9d) * f14) + this.f116405f) % 1.0d);
        this.f116405f = f15;
        String str = this.f116401b;
        if (fVar.f116354a.containsKey(view)) {
            HashMap hashMap = (HashMap) fVar.f116354a.get(view);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            if (hashMap.containsKey(str)) {
                float[] fArr2 = (float[]) hashMap.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f15;
                hashMap.put(str, fArr2);
            } else {
                hashMap.put(str, new float[]{f15});
                fVar.f116354a.put(view, hashMap);
            }
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, new float[]{f15});
            fVar.f116354a.put(view, hashMap2);
        }
        this.f116404e = j13;
        float f16 = fArr[0];
        float sin = (((float) Math.sin(this.f116405f * 6.2831855f)) * f16) + fArr[2];
        if (f16 == 0.0f && f14 == 0.0f) {
            z13 = false;
        }
        this.f116403d = z13;
        return sin;
    }

    public abstract boolean c(float f13, long j13, View view, t4.f fVar);
}
