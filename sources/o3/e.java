package o3;

import jk.r;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import ql2.s;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92852a = false;

    /* renamed from: b, reason: collision with root package name */
    public final c f92853b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92854c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f92855d;

    /* renamed from: e, reason: collision with root package name */
    public int f92856e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f92857f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f92858g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f92859h;

    public e(c cVar) {
        this.f92853b = cVar;
        int i13 = d.f92851a[cVar.ordinal()];
        int i14 = 2;
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = 3;
        }
        this.f92854c = i14;
        this.f92855d = new a[20];
        this.f92857f = new float[20];
        this.f92858g = new float[20];
        this.f92859h = new float[3];
    }

    public final void a(long j13, float f13) {
        int i13 = (this.f92856e + 1) % 20;
        this.f92856e = i13;
        a[] aVarArr = this.f92855d;
        a aVar = aVarArr[i13];
        if (aVar != null) {
            aVar.f92847a = j13;
            aVar.f92848b = f13;
        } else {
            a aVar2 = new a();
            aVar2.f92847a = j13;
            aVar2.f92848b = f13;
            aVarArr[i13] = aVar2;
        }
    }

    public final float b(float f13) {
        c cVar;
        float[] fArr;
        float[] fArr2;
        boolean z13;
        float f14;
        float signum;
        float f15 = 0.0f;
        if (f13 <= 0.0f) {
            r.y("maximumVelocity should be a positive value. You specified=" + f13);
            throw null;
        }
        int i13 = this.f92856e;
        a[] aVarArr = this.f92855d;
        a aVar = aVarArr[i13];
        if (aVar == null) {
            f14 = 0.0f;
        } else {
            int i14 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i13];
                boolean z14 = this.f92852a;
                cVar = this.f92853b;
                fArr = this.f92857f;
                fArr2 = this.f92858g;
                if (aVar3 != null) {
                    long j13 = aVar.f92847a;
                    int i15 = i13;
                    long j14 = aVar3.f92847a;
                    float f16 = j13 - j14;
                    z13 = z14;
                    float abs = Math.abs(j14 - aVar2.f92847a);
                    aVar2 = (cVar == c.Lsq2 || z13) ? aVar3 : aVar;
                    if (f16 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i14] = aVar3.f92848b;
                    fArr2[i14] = -f16;
                    i13 = (i15 == 0 ? 20 : i15) - 1;
                    i14++;
                    if (i14 >= 20) {
                        break;
                    }
                } else {
                    z13 = z14;
                    break;
                }
            }
            if (i14 >= this.f92854c) {
                int i16 = d.f92851a[cVar.ordinal()];
                if (i16 == 1) {
                    int i17 = i14 - 1;
                    float f17 = fArr2[i17];
                    int i18 = i17;
                    float f18 = 0.0f;
                    while (i18 > 0) {
                        int i19 = i18 - 1;
                        float f19 = fArr2[i19];
                        if (f17 != f19) {
                            float f23 = (z13 ? -fArr[i19] : fArr[i18] - fArr[i19]) / (f17 - f19);
                            f18 += Math.abs(f23) * (f23 - (Math.signum(f18) * ((float) Math.sqrt(Math.abs(f18) * 2))));
                            if (i18 == i17) {
                                f18 *= 0.5f;
                            }
                        }
                        i18--;
                        f17 = f19;
                    }
                    signum = Math.signum(f18) * ((float) Math.sqrt(Math.abs(f18) * 2));
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        float[] fArr3 = this.f92859h;
                        n.h(fArr2, fArr, i14, fArr3);
                        signum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        signum = 0.0f;
                    }
                }
                f15 = signum * 1000;
            } else {
                f15 = 0.0f;
            }
            f14 = 0.0f;
        }
        return (f15 == f14 || Float.isNaN(f15)) ? f14 : f15 > f14 ? s.c(f15, f13) : s.a(f15, -f13);
    }
}
