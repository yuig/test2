package oi;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o extends l3 {

    /* renamed from: b, reason: collision with root package name */
    public final g1.g f94978b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.g f94979c;

    /* renamed from: d, reason: collision with root package name */
    public long f94980d;

    public o(u4 u4Var) {
        super(u4Var);
        this.f94979c = new g1.g(0);
        this.f94978b = new g1.g(0);
    }

    public final void A(long j13) {
        g1.g gVar = this.f94978b;
        Iterator it = ((g1.c) gVar.keySet()).iterator();
        while (it.hasNext()) {
            gVar.put((String) it.next(), Long.valueOf(j13));
        }
        if (gVar.isEmpty()) {
            return;
        }
        this.f94980d = j13;
    }

    public final void B(long j13, String str) {
        if (str == null || str.length() == 0) {
            zzj().f95268f.c("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new b(this, str, j13, 1));
        }
    }

    public final void w(long j13) {
        b6 A = t().A(false);
        g1.g gVar = this.f94978b;
        Iterator it = ((g1.c) gVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            z(str, j13 - ((Long) gVar.get(str)).longValue(), A);
        }
        if (!gVar.isEmpty()) {
            y(j13 - this.f94980d, A);
        }
        A(j13);
    }

    public final void x(long j13, String str) {
        if (str == null || str.length() == 0) {
            zzj().f95268f.c("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new b(this, str, j13, 0));
        }
    }

    public final void y(long j13, b6 b6Var) {
        if (b6Var == null) {
            zzj().f95276n.c("Not logging ad exposure. No active activity");
            return;
        }
        if (j13 < 1000) {
            y3 zzj = zzj();
            zzj.f95276n.b(Long.valueOf(j13), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j13);
            f7.R(b6Var, bundle, true);
            s().W("am", "_xa", bundle);
        }
    }

    public final void z(String str, long j13, b6 b6Var) {
        if (b6Var == null) {
            zzj().f95276n.c("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j13 < 1000) {
            y3 zzj = zzj();
            zzj.f95276n.b(Long.valueOf(j13), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j13);
            f7.R(b6Var, bundle, true);
            s().W("am", "_xu", bundle);
        }
    }
}
