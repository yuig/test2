package o4;

import g1.p0;
import kg.o;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f92870a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile p0 f92871b = new p0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f92872c;

    static {
        Object[] objArr = new Object[0];
        f92872c = objArr;
        synchronized (objArr) {
            f92871b.j((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f92871b.j((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f92871b.j((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f92871b.j((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f92871b.j((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.f80348a;
        }
        if ((f92871b.i(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static c a(a aVar, a aVar2, float f13) {
        float[] fArr = new float[9];
        int i13 = 0;
        while (true) {
            float[] fArr2 = f92870a;
            if (i13 >= 9) {
                return new c(fArr2, fArr);
            }
            float f14 = fArr2[i13];
            fArr[i13] = o.E(aVar.b(f14), aVar2.b(f14), f13);
            i13++;
        }
    }

    public static a b(float f13) {
        a aVar;
        if (f13 < 1.03f) {
            return null;
        }
        a c13 = c(f13);
        if (c13 != null) {
            return c13;
        }
        int h10 = f92871b.h((int) (f13 * 100.0f));
        if (h10 >= 0) {
            return (a) f92871b.l(h10);
        }
        int i13 = -(h10 + 1);
        int i14 = i13 - 1;
        float f14 = 1.0f;
        if (i13 >= f92871b.k()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f13});
            d(f13, cVar);
            return cVar;
        }
        if (i14 < 0) {
            float[] fArr = f92870a;
            aVar = new c(fArr, fArr);
        } else {
            f14 = f92871b.i(i14) / 100.0f;
            aVar = (a) f92871b.l(i14);
        }
        c a13 = a(aVar, (a) f92871b.l(i13), o.h(f14, f92871b.i(i13) / 100.0f, f13));
        d(f13, a13);
        return a13;
    }

    public static a c(float f13) {
        return (a) f92871b.g((int) (f13 * 100.0f));
    }

    public static void d(float f13, c cVar) {
        synchronized (f92872c) {
            p0 clone = f92871b.clone();
            clone.j((int) (f13 * 100.0f), cVar);
            f92871b = clone;
            Unit unit = Unit.f80348a;
        }
    }
}
