package oi;

import com.google.android.gms.internal.measurement.d9;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f94704g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i7 f94705h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.a6 f94706i;

    public c(i7 i7Var, String str, int i13, com.google.android.gms.internal.measurement.a6 a6Var, int i14) {
        this.f94704g = i14;
        this.f94705h = i7Var;
        this.f94715a = str;
        this.f94716b = i13;
        this.f94706i = a6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.Long r17, java.lang.Long r18, com.google.android.gms.internal.measurement.h3 r19, long r20, oi.q r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.c.e(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.h3, long, oi.q, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(Long l13, Long l14, com.google.android.gms.internal.measurement.y3 y3Var, boolean z13) {
        d9.a();
        i7 i7Var = this.f94705h;
        boolean x13 = i7Var.l().x(this.f94715a, s.f95094d0);
        com.google.android.gms.internal.measurement.c2 c2Var = (com.google.android.gms.internal.measurement.c2) this.f94706i;
        boolean w13 = c2Var.w();
        boolean x14 = c2Var.x();
        boolean y13 = c2Var.y();
        byte b13 = w13 || x14 || y13;
        Boolean bool = null;
        r5 = null;
        Boolean bool2 = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean d2 = null;
        bool = null;
        if (z13 && b13 != true) {
            i7Var.zzj().f95276n.a(Integer.valueOf(this.f94716b), c2Var.z() ? Integer.valueOf(c2Var.r()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        com.google.android.gms.internal.measurement.w1 t13 = c2Var.t();
        boolean w14 = t13.w();
        if (y3Var.I()) {
            if (t13.y()) {
                bool = d.b(d.a(y3Var.A(), t13.t()), w14);
            } else {
                i7Var.zzj().f95271i.b(i7Var.m().g(y3Var.E()), "No number filter for long property. property");
            }
        } else if (y3Var.G()) {
            if (t13.y()) {
                double r13 = y3Var.r();
                try {
                    bool2 = d.d(new BigDecimal(r13), t13.t(), Math.ulp(r13));
                } catch (NumberFormatException unused) {
                }
                bool = d.b(bool2, w14);
            } else {
                i7Var.zzj().f95271i.b(i7Var.m().g(y3Var.E()), "No number filter for double property. property");
            }
        } else if (!y3Var.K()) {
            i7Var.zzj().f95271i.b(i7Var.m().g(y3Var.E()), "User property has no value, property");
        } else if (t13.A()) {
            bool = d.b(d.c(y3Var.F(), t13.u(), i7Var.zzj()), w14);
        } else if (!t13.y()) {
            i7Var.zzj().f95271i.b(i7Var.m().g(y3Var.E()), "No string or number filter defined. property");
        } else if (c7.W(y3Var.F())) {
            String F = y3Var.F();
            com.google.android.gms.internal.measurement.a2 t14 = t13.t();
            if (c7.W(F)) {
                try {
                    d2 = d.d(new BigDecimal(F), t14, 0.0d);
                } catch (NumberFormatException unused2) {
                }
            }
            bool = d.b(d2, w14);
        } else {
            i7Var.zzj().f95271i.a(i7Var.m().g(y3Var.E()), y3Var.F(), "Invalid user property value for Numeric number filter. property, value");
        }
        i7Var.zzj().f95276n.b(bool == null ? "null" : bool, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.f94717c = Boolean.TRUE;
        if (y13 && !bool.booleanValue()) {
            return true;
        }
        if (!z13 || c2Var.w()) {
            this.f94718d = bool;
        }
        if (bool.booleanValue() && b13 != false && y3Var.J()) {
            long C = y3Var.C();
            if (l13 != null) {
                C = l13.longValue();
            }
            if (x13 && c2Var.w() && !c2Var.x() && l14 != null) {
                C = l14.longValue();
            }
            if (c2Var.x()) {
                this.f94720f = Long.valueOf(C);
            } else {
                this.f94719e = Long.valueOf(C);
            }
        }
        return true;
    }
}
