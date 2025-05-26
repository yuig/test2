package j1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: s, reason: collision with root package name */
    public static float[] f74256s;

    /* renamed from: a, reason: collision with root package name */
    public final float f74257a;

    /* renamed from: b, reason: collision with root package name */
    public final float f74258b;

    /* renamed from: c, reason: collision with root package name */
    public final float f74259c;

    /* renamed from: d, reason: collision with root package name */
    public final float f74260d;

    /* renamed from: e, reason: collision with root package name */
    public final float f74261e;

    /* renamed from: f, reason: collision with root package name */
    public final float f74262f;

    /* renamed from: g, reason: collision with root package name */
    public final float f74263g;

    /* renamed from: h, reason: collision with root package name */
    public float f74264h;

    /* renamed from: i, reason: collision with root package name */
    public float f74265i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f74266j;

    /* renamed from: k, reason: collision with root package name */
    public final float f74267k;

    /* renamed from: l, reason: collision with root package name */
    public final float f74268l;

    /* renamed from: m, reason: collision with root package name */
    public final float f74269m;

    /* renamed from: n, reason: collision with root package name */
    public final float f74270n;

    /* renamed from: o, reason: collision with root package name */
    public final float f74271o;

    /* renamed from: p, reason: collision with root package name */
    public final float f74272p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f74273q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f74274r;

    public v(int i13, float f13, float f14, float f15, float f16, float f17, float f18) {
        boolean z13;
        float f19;
        float f23;
        float f24 = f15;
        this.f74257a = f13;
        this.f74258b = f14;
        this.f74259c = f24;
        this.f74260d = f16;
        this.f74261e = f17;
        this.f74262f = f18;
        float f25 = f17 - f24;
        float f26 = f18 - f16;
        int i14 = 1;
        boolean z14 = i13 == 1 || (i13 == 4 ? f26 > 0.0f : !(i13 != 5 || f26 >= 0.0f));
        this.f74273q = z14;
        float f27 = f14 - f13;
        float f28 = 1 / f27;
        this.f74267k = f28;
        boolean z15 = 3 == i13;
        if (z15 || Math.abs(f25) < 0.001f || Math.abs(f26) < 0.001f) {
            float hypot = (float) Math.hypot(f26, f25);
            this.f74263g = hypot;
            this.f74272p = hypot * f28;
            this.f74270n = f25 / f27;
            this.f74271o = f26 / f27;
            this.f74266j = new float[RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE];
            this.f74268l = Float.NaN;
            this.f74269m = Float.NaN;
            z13 = true;
        } else {
            this.f74266j = new float[RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE];
            this.f74268l = (z14 ? -1 : 1) * f25;
            this.f74269m = f26 * (z14 ? 1 : -1);
            this.f74270n = z14 ? f17 : f24;
            this.f74271o = z14 ? f16 : f18;
            float f29 = f16 - f18;
            int length = d0.o.e().length;
            float f33 = 0.0f;
            float f34 = 0.0f;
            float f35 = 0.0f;
            int i15 = 0;
            while (i15 < length) {
                double radians = (float) Math.toRadians((i15 * 90.0d) / (d0.o.e().length - i14));
                float sin = ((float) Math.sin(radians)) * f25;
                float cos = ((float) Math.cos(radians)) * f29;
                if (i15 > 0) {
                    f19 = f29;
                    f23 = cos;
                    f33 += (float) Math.hypot(sin - f34, cos - f35);
                    d0.o.e()[i15] = f33;
                } else {
                    f19 = f29;
                    f23 = cos;
                }
                i15++;
                f29 = f19;
                f35 = f23;
                f34 = sin;
                i14 = 1;
            }
            this.f74263g = f33;
            int length2 = d0.o.e().length;
            for (int i16 = 0; i16 < length2; i16++) {
                float[] e13 = d0.o.e();
                e13[i16] = e13[i16] / f33;
            }
            float[] fArr = this.f74266j;
            int length3 = fArr.length;
            for (int i17 = 0; i17 < length3; i17++) {
                float length4 = i17 / (fArr.length - 1);
                float[] e14 = d0.o.e();
                int length5 = e14.length;
                Intrinsics.checkNotNullParameter(e14, "<this>");
                int binarySearch = Arrays.binarySearch(e14, 0, length5, length4);
                if (binarySearch >= 0) {
                    fArr[i17] = binarySearch / (d0.o.e().length - 1);
                } else if (binarySearch == -1) {
                    fArr[i17] = 0.0f;
                } else {
                    int i18 = -binarySearch;
                    int i19 = i18 - 2;
                    fArr[i17] = (((length4 - d0.o.e()[i19]) / (d0.o.e()[i18 - 1] - d0.o.e()[i19])) + i19) / (d0.o.e().length - 1);
                }
            }
            this.f74272p = this.f74263g * this.f74267k;
            z13 = z15;
        }
        this.f74274r = z13;
    }

    public final float a() {
        float f13 = this.f74268l * this.f74265i;
        float hypot = this.f74272p / ((float) Math.hypot(f13, (-this.f74269m) * this.f74264h));
        if (this.f74273q) {
            f13 = -f13;
        }
        return f13 * hypot;
    }

    public final float b() {
        float f13 = this.f74268l * this.f74265i;
        float f14 = (-this.f74269m) * this.f74264h;
        float hypot = this.f74272p / ((float) Math.hypot(f13, f14));
        return this.f74273q ? (-f14) * hypot : f14 * hypot;
    }

    public final void c(float f13) {
        float f14 = (this.f74273q ? this.f74258b - f13 : f13 - this.f74257a) * this.f74267k;
        float f15 = 0.0f;
        if (f14 > 0.0f) {
            f15 = 1.0f;
            if (f14 < 1.0f) {
                float[] fArr = this.f74266j;
                float length = f14 * (fArr.length - 1);
                int i13 = (int) length;
                float f16 = fArr[i13];
                f15 = ep.b.a(fArr[i13 + 1], f16, length - i13, f16);
            }
        }
        double d2 = f15 * 1.5707964f;
        this.f74264h = (float) Math.sin(d2);
        this.f74265i = (float) Math.cos(d2);
    }
}
