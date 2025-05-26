package r1;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f105873a;

    /* renamed from: b, reason: collision with root package name */
    public final b0[] f105874b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f105875c;

    /* renamed from: d, reason: collision with root package name */
    public final List f105876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f105877e;

    /* renamed from: f, reason: collision with root package name */
    public final int f105878f;

    /* renamed from: g, reason: collision with root package name */
    public final int f105879g;

    /* renamed from: h, reason: collision with root package name */
    public final int f105880h;

    public d0(int i13, b0[] b0VarArr, g0 g0Var, List list, boolean z13, int i14) {
        this.f105873a = i13;
        this.f105874b = b0VarArr;
        this.f105875c = g0Var;
        this.f105876d = list;
        this.f105877e = z13;
        this.f105878f = i14;
        int i15 = 0;
        for (b0 b0Var : b0VarArr) {
            i15 = Math.max(i15, b0Var.f105862m);
        }
        this.f105879g = i15;
        int i16 = i15 + this.f105878f;
        this.f105880h = i16 >= 0 ? i16 : 0;
    }

    public final b0[] a(int i13, int i14, int i15) {
        b0[] b0VarArr = this.f105874b;
        int length = b0VarArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            b0 b0Var = b0VarArr[i16];
            int i19 = i17 + 1;
            int i23 = (int) ((d) this.f105876d.get(i17)).f105872a;
            int i24 = this.f105875c.f105895b[i18];
            int i25 = this.f105873a;
            boolean z13 = this.f105877e;
            b0Var.h(i13, i24, i14, i15, z13 ? i25 : i18, z13 ? i18 : i25);
            Unit unit = Unit.f80348a;
            i18 += i23;
            i16++;
            i17 = i19;
        }
        return b0VarArr;
    }
}
