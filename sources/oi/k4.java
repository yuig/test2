package oi;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzji;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k4 extends y6 implements f {

    /* renamed from: d, reason: collision with root package name */
    public final g1.g f94895d;

    /* renamed from: e, reason: collision with root package name */
    public final g1.g f94896e;

    /* renamed from: f, reason: collision with root package name */
    public final g1.g f94897f;

    /* renamed from: g, reason: collision with root package name */
    public final g1.g f94898g;

    /* renamed from: h, reason: collision with root package name */
    public final g1.g f94899h;

    /* renamed from: i, reason: collision with root package name */
    public final g1.g f94900i;

    /* renamed from: j, reason: collision with root package name */
    public final m4 f94901j;

    /* renamed from: k, reason: collision with root package name */
    public final bb.p f94902k;

    /* renamed from: l, reason: collision with root package name */
    public final g1.g f94903l;

    /* renamed from: m, reason: collision with root package name */
    public final g1.g f94904m;

    /* renamed from: n, reason: collision with root package name */
    public final g1.g f94905n;

    public k4(a7 a7Var) {
        super(a7Var);
        this.f94895d = new g1.g(0);
        this.f94896e = new g1.g(0);
        this.f94897f = new g1.g(0);
        this.f94898g = new g1.g(0);
        this.f94899h = new g1.g(0);
        this.f94903l = new g1.g(0);
        this.f94904m = new g1.g(0);
        this.f94905n = new g1.g(0);
        this.f94900i = new g1.g(0);
        this.f94901j = new m4(this);
        this.f94902k = new bb.p(this, 28);
    }

    public static g1.g y(com.google.android.gms.internal.measurement.s2 s2Var) {
        g1.g gVar = new g1.g(0);
        for (com.google.android.gms.internal.measurement.v2 v2Var : s2Var.H()) {
            gVar.put(v2Var.s(), v2Var.t());
        }
        return gVar;
    }

    public static f5 z(com.google.android.gms.internal.measurement.l2 l2Var) {
        int i13 = n4.f94968b[l2Var.ordinal()];
        if (i13 == 1) {
            return f5.AD_STORAGE;
        }
        if (i13 == 2) {
            return f5.ANALYTICS_STORAGE;
        }
        if (i13 == 3) {
            return f5.AD_USER_DATA;
        }
        if (i13 != 4) {
            return null;
        }
        return f5.AD_PERSONALIZATION;
    }

    public final void A(String str, com.google.android.gms.internal.measurement.r2 r2Var) {
        HashSet hashSet = new HashSet();
        g1.g gVar = new g1.g(0);
        g1.g gVar2 = new g1.g(0);
        g1.g gVar3 = new g1.g(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.s2) r2Var.f31718b).F()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.o2) it.next()).s());
        }
        for (int i13 = 0; i13 < ((com.google.android.gms.internal.measurement.s2) r2Var.f31718b).v(); i13++) {
            com.google.android.gms.internal.measurement.p2 p2Var = (com.google.android.gms.internal.measurement.p2) ((com.google.android.gms.internal.measurement.s2) r2Var.f31718b).s(i13).m();
            if (p2Var.i().isEmpty()) {
                zzj().f95271i.c("EventConfig contained null event name");
            } else {
                String i14 = p2Var.i();
                String I0 = kh2.a1.I0(p2Var.i(), h5.f94811a, h5.f94813c);
                if (!TextUtils.isEmpty(I0)) {
                    p2Var.g();
                    com.google.android.gms.internal.measurement.q2.s((com.google.android.gms.internal.measurement.q2) p2Var.f31718b, I0);
                    r2Var.g();
                    com.google.android.gms.internal.measurement.s2.u((com.google.android.gms.internal.measurement.s2) r2Var.f31718b, i13, (com.google.android.gms.internal.measurement.q2) p2Var.b());
                }
                if (((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).w() && ((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).u()) {
                    gVar.put(i14, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).x() && ((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).v()) {
                    gVar2.put(p2Var.i(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).y()) {
                    if (((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).r() < 2 || ((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).r() > 65535) {
                        y3 zzj = zzj();
                        zzj.f95271i.a(p2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).r()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        gVar3.put(p2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.q2) p2Var.f31718b).r()));
                    }
                }
            }
        }
        this.f94896e.put(str, hashSet);
        this.f94897f.put(str, gVar);
        this.f94898g.put(str, gVar2);
        this.f94900i.put(str, gVar3);
    }

    public final void B(String key, com.google.android.gms.internal.measurement.s2 s2Var) {
        Object j13;
        int i13 = 0;
        if (s2Var.r() == 0) {
            m4 m4Var = this.f94901j;
            m4Var.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (m4Var.f63307c) {
                try {
                    j13 = m4Var.f63306b.j(key);
                    if (j13 != null) {
                        int i14 = m4Var.f63308d;
                        g1.r.e(key, j13);
                        m4Var.f63308d = i14 - 1;
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (j13 != null) {
                m4Var.b(false, key, j13, null);
                return;
            }
            return;
        }
        zzj().f95276n.b(Integer.valueOf(s2Var.r()), "EES programs found");
        com.google.android.gms.internal.measurement.f4 f4Var = (com.google.android.gms.internal.measurement.f4) s2Var.G().get(0);
        try {
            com.google.android.gms.internal.measurement.w wVar = new com.google.android.gms.internal.measurement.w();
            ((androidx.lifecycle.k0) wVar.f31678a.f85200e).f18655a.put("internal.remoteConfig", new l4(this, key, i13));
            ((androidx.lifecycle.k0) wVar.f31678a.f85200e).f18655a.put("internal.appMetadata", new l4(this, key, 2));
            ((androidx.lifecycle.k0) wVar.f31678a.f85200e).f18655a.put("internal.logger", new y6.d(this, 3));
            wVar.a(f4Var);
            this.f94901j.d(key, wVar);
            zzj().f95276n.a(key, Integer.valueOf(f4Var.r().r()), "EES program loaded for appId, activities");
            Iterator it = f4Var.r().u().iterator();
            while (it.hasNext()) {
                zzj().f95276n.b(((com.google.android.gms.internal.measurement.e4) it.next()).s(), "EES program activity");
            }
        } catch (zzc unused) {
            zzj().f95268f.b(key, "Failed to load EES program. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x039e A[Catch: SQLiteException -> 0x03ae, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x03ae, blocks: (B:123:0x0387, B:125:0x039e), top: B:122:0x0387 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.lang.String r22, java.lang.String r23, java.lang.String r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.k4.C(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final int D(String str, String str2) {
        Integer num;
        p();
        L(str);
        Map map = (Map) this.f94900i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.n2 E(String str) {
        p();
        L(str);
        com.google.android.gms.internal.measurement.s2 G = G(str);
        if (G == null || !G.J()) {
            return null;
        }
        return G.x();
    }

    public final boolean F(String str, f5 f5Var) {
        p();
        L(str);
        com.google.android.gms.internal.measurement.n2 E = E(str);
        if (E == null) {
            return false;
        }
        Iterator it = E.u().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.i2 i2Var = (com.google.android.gms.internal.measurement.i2) it.next();
            if (f5Var == z(i2Var.t())) {
                if (i2Var.s() == com.google.android.gms.internal.measurement.k2.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.s2 G(String str) {
        t();
        p();
        com.bumptech.glide.d.o(str);
        L(str);
        return (com.google.android.gms.internal.measurement.s2) this.f94899h.get(str);
    }

    public final boolean H(String str, String str2) {
        Boolean bool;
        p();
        L(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f94898g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean I(String str, String str2) {
        Boolean bool;
        p();
        L(str);
        if (SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(a(str, "measurement.upload.blacklist_internal")) && f7.s0(str2)) {
            return true;
        }
        if (SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(a(str, "measurement.upload.blacklist_public")) && f7.u0(str2)) {
            return true;
        }
        Map map = (Map) this.f94897f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean J(String str) {
        p();
        L(str);
        g1.g gVar = this.f94896e;
        return gVar.get(str) != null && ((Set) gVar.get(str)).contains("app_instance_id");
    }

    public final boolean K(String str) {
        p();
        L(str);
        g1.g gVar = this.f94896e;
        if (gVar.get(str) != null) {
            return ((Set) gVar.get(str)).contains("os_version") || ((Set) gVar.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0079: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:32:0x0079 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.k4.L(java.lang.String):void");
    }

    @Override // oi.f
    public final String a(String str, String str2) {
        p();
        L(str);
        Map map = (Map) this.f94895d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // oi.y6
    public final boolean v() {
        return false;
    }

    public final long w(String str) {
        String a13 = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(a13)) {
            return 0L;
        }
        try {
            return Long.parseLong(a13);
        } catch (NumberFormatException e13) {
            y3 zzj = zzj();
            zzj.f95271i.a(y3.v(str), e13, "Unable to parse timezone offset. appId");
            return 0L;
        }
    }

    public final com.google.android.gms.internal.measurement.s2 x(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.s2.z();
        }
        try {
            com.google.android.gms.internal.measurement.s2 s2Var = (com.google.android.gms.internal.measurement.s2) ((com.google.android.gms.internal.measurement.r2) c7.B(com.google.android.gms.internal.measurement.s2.y(), bArr)).b();
            zzj().f95276n.a(s2Var.L() ? Long.valueOf(s2Var.w()) : null, s2Var.K() ? s2Var.A() : null, "Parsed config. version, gmp_app_id");
            return s2Var;
        } catch (zzji e13) {
            zzj().f95271i.a(y3.v(str), e13, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.s2.z();
        } catch (RuntimeException e14) {
            zzj().f95271i.a(y3.v(str), e14, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.s2.z();
        }
    }
}
