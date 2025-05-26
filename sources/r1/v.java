package r1;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f105997a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f105998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105999c;

    /* renamed from: d, reason: collision with root package name */
    public final int f106000d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f106001e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f106002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f106003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f106004h;

    public v(boolean z13, g0 g0Var, int i13, int i14, u uVar, k0 k0Var) {
        this.f106003g = z13;
        this.f106004h = g0Var;
        this.f105997a = z13;
        this.f105998b = g0Var;
        this.f105999c = i13;
        this.f106000d = i14;
        this.f106001e = uVar;
        this.f106002f = k0Var;
    }

    public final long a(int i13, int i14) {
        int i15;
        g0 g0Var = this.f105998b;
        if (i14 == 1) {
            i15 = g0Var.f105894a[i13];
        } else {
            int i16 = (i14 + i13) - 1;
            int[] iArr = g0Var.f105895b;
            i15 = (iArr[i16] + g0Var.f105894a[i16]) - iArr[i13];
        }
        if (i15 < 0) {
            i15 = 0;
        }
        if (this.f105997a) {
            if (i15 >= 0) {
                return bs1.c.N(i15, i15, 0, Integer.MAX_VALUE);
            }
            kh2.n.i0("width(" + i15 + ") must be >= 0");
            throw null;
        }
        if (i15 >= 0) {
            return bs1.c.N(0, Integer.MAX_VALUE, i15, i15);
        }
        kh2.n.i0("height(" + i15 + ") must be >= 0");
        throw null;
    }

    public final d0 b(int i13) {
        ho.i b13 = this.f106002f.b(i13);
        List list = b13.f69676b;
        int size = list.size();
        int i14 = b13.f69675a;
        int i15 = (size == 0 || i14 + size == this.f105999c) ? 0 : this.f106000d;
        b0[] b0VarArr = new b0[size];
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            int i18 = (int) ((d) list.get(i17)).f105872a;
            b0 a13 = this.f106001e.a(i14 + i17, i16, i18, i15, a(i16, i18));
            i16 += i18;
            Unit unit = Unit.f80348a;
            b0VarArr[i17] = a13;
        }
        return new d0(i13, b0VarArr, this.f106004h, b13.f69676b, this.f106003g, i15);
    }
}
