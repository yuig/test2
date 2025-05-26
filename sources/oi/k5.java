package oi;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.i9;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.ua;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.x8;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k5 extends k2 {

    /* renamed from: c, reason: collision with root package name */
    public u5 f94906c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.x f94907d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f94908e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94909f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f94910g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f94911h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94912i;

    /* renamed from: j, reason: collision with root package name */
    public PriorityQueue f94913j;

    /* renamed from: k, reason: collision with root package name */
    public g5 f94914k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicLong f94915l;

    /* renamed from: m, reason: collision with root package name */
    public long f94916m;

    /* renamed from: n, reason: collision with root package name */
    public final v4 f94917n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f94918o;

    /* renamed from: p, reason: collision with root package name */
    public r5 f94919p;

    /* renamed from: q, reason: collision with root package name */
    public final bb.p f94920q;

    public k5(u4 u4Var) {
        super(u4Var);
        this.f94908e = new CopyOnWriteArraySet();
        this.f94911h = new Object();
        this.f94912i = false;
        this.f94918o = true;
        this.f94920q = new bb.p(this, 29);
        this.f94910g = new AtomicReference();
        this.f94914k = g5.f94790c;
        this.f94916m = -1L;
        this.f94915l = new AtomicLong(0L);
        this.f94917n = new v4(u4Var);
    }

    public static void O(k5 k5Var, g5 g5Var, long j13, boolean z13, boolean z14) {
        k5Var.p();
        k5Var.w();
        g5 y13 = k5Var.n().y();
        if (j13 <= k5Var.f94916m) {
            if (y13.f94792b <= g5Var.f94792b) {
                k5Var.zzj().f95274l.b(g5Var, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        g4 n13 = k5Var.n();
        n13.p();
        int i13 = g5Var.f94792b;
        if (!n13.t(i13)) {
            y3 zzj = k5Var.zzj();
            zzj.f95274l.b(Integer.valueOf(g5Var.f94792b), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = n13.w().edit();
        edit.putString("consent_settings", g5Var.i());
        edit.putInt("consent_source", i13);
        edit.apply();
        k5Var.f94916m = j13;
        k5Var.u().D(z13);
        if (z14) {
            k5Var.u().B(new AtomicReference());
        }
    }

    public static void P(k5 k5Var, g5 g5Var, g5 g5Var2) {
        f5[] f5VarArr = {f5.ANALYTICS_STORAGE, f5.AD_STORAGE};
        g5Var.getClass();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            f5 f5Var = f5VarArr[i13];
            if (!g5Var2.e(f5Var) && g5Var.e(f5Var)) {
                z13 = true;
                break;
            }
            i13++;
        }
        boolean h10 = g5Var.h(g5Var2, f5.ANALYTICS_STORAGE, f5.AD_STORAGE);
        if (z13 || h10) {
            k5Var.q().B();
        }
    }

    public final void A(long j13, boolean z13) {
        p();
        w();
        zzj().f95275m.c("Resetting analytics data (FE)");
        q6 v13 = v();
        v13.p();
        j9.c cVar = v13.f95074f;
        ((l) cVar.f74963c).a();
        cVar.f74961a = 0L;
        cVar.f74962b = 0L;
        ua.a();
        if (l().x(null, s.f95122r0)) {
            q().B();
        }
        boolean e13 = ((u4) this.f24333a).e();
        g4 n13 = n();
        n13.f94770e.b(j13);
        if (!TextUtils.isEmpty(n13.n().f94786u.l())) {
            n13.f94786u.m(null);
        }
        ((i9) j9.f31483b.get()).getClass();
        e l13 = n13.l();
        s3 s3Var = s.f95112m0;
        if (l13.x(null, s3Var)) {
            n13.f94780o.b(0L);
        }
        n13.f94781p.b(0L);
        Boolean y13 = n13.l().y("firebase_analytics_collection_deactivated");
        if (y13 == null || !y13.booleanValue()) {
            n13.v(!e13);
        }
        n13.f94787v.m(null);
        n13.f94788w.b(0L);
        n13.f94789x.T(null);
        if (z13) {
            d6 u13 = u();
            u13.p();
            u13.w();
            zzo L = u13.L(false);
            u13.r().B();
            u13.A(new f6(u13, L, 0));
        }
        ((i9) j9.f31483b.get()).getClass();
        if (l().x(null, s3Var)) {
            v().f95073e.G();
        }
        this.f94918o = !e13;
    }

    public final void B(Bundle bundle, int i13, long j13) {
        f5[] f5VarArr;
        String str;
        w();
        g5 g5Var = g5.f94790c;
        f5VarArr = e5.STORAGE.zzd;
        int length = f5VarArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                str = null;
                break;
            }
            f5 f5Var = f5VarArr[i14];
            if (bundle.containsKey(f5Var.zze) && (str = bundle.getString(f5Var.zze)) != null && g5.f(str) == null) {
                break;
            } else {
                i14++;
            }
        }
        if (str != null) {
            zzj().f95273k.b(str, "Ignoring invalid consent setting");
            zzj().f95273k.c("Valid consent values are 'granted', 'denied'");
        }
        g5 b13 = g5.b(i13, bundle);
        r8.a();
        if (!l().x(null, s.I0)) {
            N(b13, j13);
            return;
        }
        Iterator it = b13.f94791a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((Boolean) it.next()) != null) {
                N(b13, j13);
                break;
            }
        }
        m a13 = m.a(i13, bundle);
        Iterator it2 = a13.f94946e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((Boolean) it2.next()) != null) {
                L(a13);
                break;
            }
        }
        Boolean f13 = bundle != null ? g5.f(bundle.getString("ad_personalization")) : null;
        if (f13 != null) {
            K(f13.toString(), "app", "allow_personalized_ads", false);
        }
    }

    public final void C(Bundle bundle, long j13) {
        com.bumptech.glide.d.t(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().f95271i.c("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        kh2.m0.a1(bundle2, "app_id", String.class, null);
        kh2.m0.a1(bundle2, "origin", String.class, null);
        kh2.m0.a1(bundle2, "name", String.class, null);
        kh2.m0.a1(bundle2, "value", Object.class, null);
        kh2.m0.a1(bundle2, "trigger_event_name", String.class, null);
        kh2.m0.a1(bundle2, "trigger_timeout", Long.class, 0L);
        kh2.m0.a1(bundle2, "timed_out_event_name", String.class, null);
        kh2.m0.a1(bundle2, "timed_out_event_params", Bundle.class, null);
        kh2.m0.a1(bundle2, "triggered_event_name", String.class, null);
        kh2.m0.a1(bundle2, "triggered_event_params", Bundle.class, null);
        kh2.m0.a1(bundle2, "time_to_live", Long.class, 0L);
        kh2.m0.a1(bundle2, "expired_event_name", String.class, null);
        kh2.m0.a1(bundle2, "expired_event_params", Bundle.class, null);
        com.bumptech.glide.d.o(bundle2.getString("name"));
        com.bumptech.glide.d.o(bundle2.getString("origin"));
        com.bumptech.glide.d.t(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j13);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (o().f0(string) != 0) {
            y3 zzj = zzj();
            zzj.f95268f.b(m().g(string), "Invalid conditional user property name");
            return;
        }
        if (o().t(obj, string) != 0) {
            y3 zzj2 = zzj();
            zzj2.f95268f.a(m().g(string), obj, "Invalid conditional user property value");
            return;
        }
        Object m03 = o().m0(obj, string);
        if (m03 == null) {
            y3 zzj3 = zzj();
            zzj3.f95268f.a(m().g(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        kh2.m0.b1(bundle2, m03);
        long j14 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j14 > 15552000000L || j14 < 1)) {
            y3 zzj4 = zzj();
            zzj4.f95268f.a(m().g(string), Long.valueOf(j14), "Invalid conditional user property timeout");
            return;
        }
        long j15 = bundle2.getLong("time_to_live");
        if (j15 <= 15552000000L && j15 >= 1) {
            zzl().y(new n5(this, bundle2, 2));
            return;
        }
        y3 zzj5 = zzj();
        zzj5.f95268f.a(m().g(string), Long.valueOf(j15), "Invalid conditional user property time to live");
    }

    public final void D(Boolean bool, boolean z13) {
        p();
        w();
        zzj().f95275m.b(bool, "Setting app measurement enabled (FE)");
        g4 n13 = n();
        n13.p();
        SharedPreferences.Editor edit = n13.w().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z13) {
            g4 n14 = n();
            n14.p();
            SharedPreferences.Editor edit2 = n14.w().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        u4 u4Var = (u4) this.f24333a;
        o4 o4Var = u4Var.f95206j;
        u4.d(o4Var);
        o4Var.p();
        if (u4Var.D || !(bool == null || bool.booleanValue())) {
            V();
        }
    }

    public final void E(String str) {
        this.f94910g.set(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r2v69, types: [int] */
    /* JADX WARN: Type inference failed for: r30v1, types: [int] */
    /* JADX WARN: Type inference failed for: r30v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    public final void F(String str, String str2, long j13, Bundle bundle, boolean z13, boolean z14, boolean z15, String str3) {
        boolean z16;
        boolean g13;
        String str4;
        ArrayList arrayList;
        long j14;
        boolean A;
        boolean z17;
        Bundle[] bundleArr;
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.t(bundle);
        p();
        w();
        if (!((u4) this.f24333a).e()) {
            zzj().f95275m.c("Event not sent since app measurement is disabled");
            return;
        }
        List list = q().f95189i;
        if (list != null && !list.contains(str2)) {
            zzj().f95275m.a(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f94909f) {
            this.f94909f = true;
            try {
                try {
                    (!((u4) this.f24333a).f95201e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e13) {
                    zzj().f95271i.b(e13, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                zzj().f95274l.c("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                ((oh.b) zzb()).getClass();
                z16 = false;
                I("auto", "_lgclid", string, System.currentTimeMillis());
            } else {
                z16 = false;
            }
            k9.a();
            if (l().x(null, s.P0) && bundle.containsKey("gbraid")) {
                String string2 = bundle.getString("gbraid");
                ((oh.b) zzb()).getClass();
                I("auto", "_gbraid", string2, System.currentTimeMillis());
            }
        } else {
            z16 = false;
        }
        if (z13 && (!f7.f94754j[z16 ? 1 : 0].equals(str2))) {
            o().G(bundle, n().f94789x.N());
        }
        bb.p pVar = this.f94920q;
        if (!z15 && !"_iap".equals(str2)) {
            f7 f7Var = ((u4) this.f24333a).f95208l;
            u4.c(f7Var);
            int i13 = 2;
            if (f7Var.o0("event", str2)) {
                if (!f7Var.c0("event", h5.f94811a, h5.f94812b, str2)) {
                    i13 = 13;
                } else if (f7Var.U(40, "event", str2)) {
                    i13 = z16 ? 1 : 0;
                }
            }
            if (i13 != 0) {
                zzj().f95270h.b(m().c(str2), "Invalid public event name. Event will not be logged (FE)");
                ((u4) this.f24333a).n();
                String D = f7.D(str2, 40, true);
                if (str2 != null) {
                    z16 = str2.length();
                }
                ((u4) this.f24333a).n();
                f7.S(pVar, null, i13, "_ev", D, z16);
                return;
            }
        }
        b6 A2 = t().A(z16);
        if (A2 != null && !bundle.containsKey("_sc")) {
            A2.f94700d = true;
        }
        f7.R(A2, bundle, (!z13 || z15) ? z16 ? 1 : 0 : true);
        boolean equals = "am".equals(str);
        boolean s03 = f7.s0(str2);
        if (z13 && this.f94907d != null && !s03 && !equals) {
            zzj().f95275m.a(m().c(str2), m().a(bundle), "Passing event to registered event handler (FE)");
            com.bumptech.glide.d.t(this.f94907d);
            com.google.android.gms.internal.measurement.x xVar = this.f94907d;
            xVar.getClass();
            try {
                com.google.android.gms.internal.measurement.z0 z0Var = (com.google.android.gms.internal.measurement.z0) ((com.google.android.gms.internal.measurement.x0) xVar.f31694b);
                Parcel j15 = z0Var.j();
                j15.writeString(str);
                j15.writeString(str2);
                com.google.android.gms.internal.measurement.h0.c(j15, bundle);
                j15.writeLong(j13);
                z0Var.H(j15, 1);
                return;
            } catch (RemoteException e14) {
                u4 u4Var = ((AppMeasurementDynamiteService) xVar.f31695c).f32015a;
                if (u4Var != null) {
                    y3 y3Var = u4Var.f95205i;
                    u4.d(y3Var);
                    y3Var.f95271i.b(e14, "Event interceptor threw exception");
                    return;
                }
                return;
            }
        }
        if (((u4) this.f24333a).f()) {
            int u13 = o().u(str2);
            if (u13 != 0) {
                zzj().f95270h.b(m().c(str2), "Invalid event name. Event will not be logged (FE)");
                o();
                String D2 = f7.D(str2, 40, true);
                if (str2 != null) {
                    z16 = str2.length();
                }
                ((u4) this.f24333a).n();
                f7.S(pVar, str3, u13, "_ev", D2, z16);
                return;
            }
            Bundle z18 = o().z(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z15);
            com.bumptech.glide.d.t(z18);
            if (t().A(z16) != null && "_ae".equals(str2)) {
                j9.c cVar = v().f95074f;
                ((oh.b) ((q6) cVar.f74964d).zzb()).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j16 = elapsedRealtime - cVar.f74962b;
                cVar.f74962b = elapsedRealtime;
                if (j16 > 0) {
                    o().F(z18, j16);
                }
            }
            ((w8) x8.f31706b.get()).getClass();
            if (l().x(null, s.f95110l0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    f7 o13 = o();
                    String string3 = z18.getString("_ffr");
                    if (oh.e.a(string3)) {
                        string3 = null;
                    } else if (string3 != null) {
                        string3 = string3.trim();
                    }
                    String l13 = o13.n().f94786u.l();
                    if (string3 == l13 || (string3 != null && string3.equals(l13))) {
                        o13.zzj().f95275m.c("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    o13.n().f94786u.m(string3);
                } else if ("_ae".equals(str2)) {
                    String l14 = o().n().f94786u.l();
                    if (!TextUtils.isEmpty(l14)) {
                        z18.putString("_ffr", l14);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(z18);
            if (l().x(null, s.G0)) {
                q6 v13 = v();
                v13.p();
                g13 = v13.f95072d;
            } else {
                g13 = n().f94783r.g();
            }
            if (n().f94780o.a() > 0 && n().u(j13) && g13) {
                zzj().f95276n.c("Current session is expired, remove the session number, ID, and engagement time");
                ((oh.b) zzb()).getClass();
                arrayList = arrayList2;
                j14 = 0;
                str4 = "_o";
                I("auto", "_sid", null, System.currentTimeMillis());
                ((oh.b) zzb()).getClass();
                I("auto", "_sno", null, System.currentTimeMillis());
                ((oh.b) zzb()).getClass();
                I("auto", "_se", null, System.currentTimeMillis());
                n().f94781p.b(0L);
            } else {
                str4 = "_o";
                arrayList = arrayList2;
                j14 = 0;
            }
            if (z18.getLong("extend_session", j14) == 1) {
                zzj().f95276n.c("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                q6 q6Var = ((u4) this.f24333a).f95207k;
                u4.b(q6Var);
                q6Var.f95073e.H(j13, true);
            }
            ArrayList arrayList3 = new ArrayList(z18.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList3.get(i14);
                i14++;
                String str5 = (String) obj;
                if (str5 != null) {
                    o();
                    Object obj2 = z18.get(str5);
                    if (obj2 instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj2};
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj2;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        z18.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            int i15 = 0;
            while (i15 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i15);
                String str6 = i15 != 0 ? "_ep" : str2;
                bundle2.putString(str4, str);
                if (z14) {
                    bundle2 = o().g0(bundle2);
                }
                Bundle bundle3 = bundle2;
                arrayList = arrayList5;
                zzbg zzbgVar = new zzbg(str6, new zzbb(bundle3), str, j13);
                d6 u14 = u();
                u14.getClass();
                u14.p();
                u14.w();
                w3 r13 = u14.r();
                r13.getClass();
                Parcel obtain = Parcel.obtain();
                zzbgVar.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                if (marshall.length > 131072) {
                    r13.zzj().f95269g.c("Event is too long for local database. Sending event directly to service");
                    z17 = true;
                    A = false;
                } else {
                    A = r13.A(0, marshall);
                    z17 = true;
                }
                u14.A(new h6(u14, u14.L(z17), A, zzbgVar, str3));
                if (!equals) {
                    Iterator it = this.f94908e.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        Bundle bundle4 = new Bundle(bundle3);
                        aVar.getClass();
                        try {
                            com.google.android.gms.internal.measurement.z0 z0Var2 = (com.google.android.gms.internal.measurement.z0) aVar.f94631a;
                            Parcel j17 = z0Var2.j();
                            j17.writeString(str);
                            j17.writeString(str2);
                            com.google.android.gms.internal.measurement.h0.c(j17, bundle4);
                            j17.writeLong(j13);
                            z0Var2.H(j17, 1);
                        } catch (RemoteException e15) {
                            u4 u4Var2 = aVar.f94632b.f32015a;
                            if (u4Var2 != null) {
                                y3 y3Var2 = u4Var2.f95205i;
                                u4.d(y3Var2);
                                y3Var2.f95271i.b(e15, "Event listener threw exception");
                            }
                        }
                    }
                }
                i15++;
            }
            if (t().A(false) == null || !"_ae".equals(str2)) {
                return;
            }
            q6 v14 = v();
            ((oh.b) zzb()).getClass();
            v14.f95074f.a(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void G(String str, String str2, Bundle bundle) {
        ((oh.b) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        com.bumptech.glide.d.o(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().y(new n5(this, bundle2, 1));
    }

    public final void H(String str, String str2, Bundle bundle, boolean z13, boolean z14, long j13) {
        String str3;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            boolean z15 = !z14 || this.f94907d == null || f7.s0(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str5 : bundle3.keySet()) {
                Object obj = bundle3.get(str5);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str5, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i13 = 0; i13 < parcelableArr.length; i13++) {
                        if (parcelableArr[i13] instanceof Bundle) {
                            parcelableArr[i13] = new Bundle((Bundle) parcelableArr[i13]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        Object obj2 = list.get(i14);
                        if (obj2 instanceof Bundle) {
                            list.set(i14, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            zzl().y(new q5(this, str4, str2, j13, bundle3, z14, z15, z13));
            return;
        }
        a6 t13 = t();
        synchronized (t13.f94654l) {
            try {
                if (!t13.f94653k) {
                    t13.zzj().f95273k.c("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > t13.l().t(null))) {
                    t13.zzj().f95273k.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > t13.l().t(null))) {
                    t13.zzj().f95273k.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = t13.f94649g;
                    str3 = activity != null ? t13.z(activity.getClass()) : "Activity";
                } else {
                    str3 = string2;
                }
                b6 b6Var = t13.f94645c;
                if (t13.f94650h && b6Var != null) {
                    t13.f94650h = false;
                    boolean N1 = kh2.j1.N1(b6Var.f94698b, str3);
                    boolean N12 = kh2.j1.N1(b6Var.f94697a, string);
                    if (N1 && N12) {
                        t13.zzj().f95273k.c("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                t13.zzj().f95276n.a(string == null ? "null" : string, str3 == null ? "null" : str3, "Logging screen view with name, class");
                b6 b6Var2 = t13.f94645c == null ? t13.f94646d : t13.f94645c;
                b6 b6Var3 = new b6(string, str3, t13.o().x0(), true, j13);
                t13.f94645c = b6Var3;
                t13.f94646d = b6Var2;
                t13.f94651i = b6Var3;
                ((oh.b) t13.zzb()).getClass();
                t13.zzl().y(new y4(t13, bundle2, b6Var3, b6Var2, SystemClock.elapsedRealtime(), 2));
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.bumptech.glide.d.o(r9)
            com.bumptech.glide.d.o(r10)
            r8.p()
            r8.w()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L5c
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L4d
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4d
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            oi.g4 r0 = r8.n()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L45
            java.lang.String r11 = "true"
        L45:
            e2.g0 r0 = r0.f94777l
            r0.m(r11)
            r5 = r10
        L4b:
            r6 = r1
            goto L5e
        L4d:
            if (r11 != 0) goto L5c
            oi.g4 r10 = r8.n()
            e2.g0 r10 = r10.f94777l
            java.lang.String r0 = "unset"
            r10.m(r0)
            r5 = r11
            goto L4b
        L5c:
            r6 = r10
            r5 = r11
        L5e:
            java.lang.Object r10 = r8.f24333a
            oi.u4 r10 = (oi.u4) r10
            boolean r10 = r10.e()
            if (r10 != 0) goto L74
            oi.y3 r9 = r8.zzj()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            oi.a4 r9 = r9.f95276n
            r9.c(r10)
            return
        L74:
            java.lang.Object r10 = r8.f24333a
            oi.u4 r10 = (oi.u4) r10
            boolean r10 = r10.f()
            if (r10 != 0) goto L7f
            return
        L7f:
            com.google.android.gms.measurement.internal.zznc r10 = new com.google.android.gms.measurement.internal.zznc
            r2 = r10
            r3 = r12
            r7 = r9
            r2.<init>(r3, r5, r6, r7)
            oi.d6 r9 = r8.u()
            r9.p()
            r9.w()
            oi.w3 r11 = r9.r()
            r11.getClass()
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r13 = 0
            r10.writeToParcel(r12, r13)
            byte[] r0 = r12.marshall()
            r12.recycle()
            int r12 = r0.length
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = 1
            if (r12 <= r1) goto Lb9
            oi.y3 r11 = r11.zzj()
            java.lang.String r12 = "User property too long for local database. Sending directly to service"
            oi.a4 r11 = r11.f95269g
            r11.c(r12)
            goto Lbd
        Lb9:
            boolean r13 = r11.A(r2, r0)
        Lbd:
            com.google.android.gms.measurement.internal.zzo r11 = r9.L(r2)
            oi.g6 r12 = new oi.g6
            r12.<init>(r9, r11, r13, r10)
            r9.A(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.k5.I(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            r11 = this;
            r8 = r11
            r3 = r13
            r0 = r14
            if (r12 != 0) goto L9
            java.lang.String r1 = "app"
            r2 = r1
            goto La
        L9:
            r2 = r12
        La:
            r1 = 0
            r4 = 24
            if (r15 == 0) goto L19
            oi.f7 r5 = r11.o()
            int r5 = r5.f0(r13)
        L17:
            r9 = r5
            goto L3b
        L19:
            oi.f7 r5 = r11.o()
            java.lang.String r6 = "user property"
            boolean r7 = r5.o0(r6, r13)
            r9 = 6
            if (r7 != 0) goto L27
            goto L3b
        L27:
            java.lang.String[] r7 = oi.h5.f94815e
            r10 = 0
            boolean r7 = r5.c0(r6, r7, r10, r13)
            if (r7 != 0) goto L33
            r5 = 15
            goto L17
        L33:
            boolean r5 = r5.U(r4, r6, r13)
            if (r5 != 0) goto L3a
            goto L3b
        L3a:
            r9 = r1
        L3b:
            bb.p r5 = r8.f94920q
            r6 = 1
            if (r9 == 0) goto L63
            r11.o()
            java.lang.String r0 = oi.f7.D(r13, r4, r6)
            if (r3 == 0) goto L4d
            int r1 = r13.length()
        L4d:
            java.lang.Object r2 = r8.f24333a
            oi.u4 r2 = (oi.u4) r2
            r2.n()
            r2 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r2
            r14 = r9
            r15 = r3
            r16 = r0
            r17 = r1
            oi.f7.S(r12, r13, r14, r15, r16, r17)
            return
        L63:
            if (r0 == 0) goto Lb9
            oi.f7 r7 = r11.o()
            int r7 = r7.t(r14, r13)
            if (r7 == 0) goto L9c
            r11.o()
            java.lang.String r2 = oi.f7.D(r13, r4, r6)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7e
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L86
        L7e:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r1 = r0.length()
        L86:
            java.lang.Object r0 = r8.f24333a
            oi.u4 r0 = (oi.u4) r0
            r0.n()
            r0 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r0
            r14 = r7
            r15 = r3
            r16 = r2
            r17 = r1
            oi.f7.S(r12, r13, r14, r15, r16, r17)
            return
        L9c:
            oi.f7 r1 = r11.o()
            java.lang.Object r4 = r1.m0(r14, r13)
            if (r4 == 0) goto Lb8
            oi.o4 r9 = r11.zzl()
            oi.y4 r10 = new oi.y4
            r7 = 1
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.y(r10)
        Lb8:
            return
        Lb9:
            oi.o4 r9 = r11.zzl()
            oi.y4 r10 = new oi.y4
            r7 = 1
            r4 = 0
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.k5.J(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void K(String str, String str2, String str3, boolean z13) {
        ((oh.b) zzb()).getClass();
        J(str2, str3, str, z13, System.currentTimeMillis());
    }

    public final void L(m mVar) {
        zzl().y(new androidx.appcompat.widget.j(27, this, mVar));
    }

    public final void M(g5 g5Var) {
        p();
        g5Var.getClass();
        boolean z13 = (g5Var.e(f5.ANALYTICS_STORAGE) && g5Var.e(f5.AD_STORAGE)) || u().H();
        u4 u4Var = (u4) this.f24333a;
        o4 o4Var = u4Var.f95206j;
        u4.d(o4Var);
        o4Var.p();
        if (z13 != u4Var.D) {
            u4 u4Var2 = (u4) this.f24333a;
            o4 o4Var2 = u4Var2.f95206j;
            u4.d(o4Var2);
            o4Var2.p();
            u4Var2.D = z13;
            g4 n13 = n();
            n13.p();
            Boolean valueOf = n13.w().contains("measurement_enabled_from_api") ? Boolean.valueOf(n13.w().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z13 || valueOf == null || valueOf.booleanValue()) {
                D(Boolean.valueOf(z13), false);
            }
        }
    }

    public final void N(g5 g5Var, long j13) {
        g5 g5Var2;
        boolean z13;
        g5 g5Var3;
        boolean z14;
        boolean z15;
        w();
        int i13 = g5Var.f94792b;
        if (i13 != -10 && ((Boolean) g5Var.f94791a.get(f5.AD_STORAGE)) == null && ((Boolean) g5Var.f94791a.get(f5.ANALYTICS_STORAGE)) == null) {
            zzj().f95273k.c("Discarding empty consent settings");
            return;
        }
        synchronized (this.f94911h) {
            try {
                g5Var2 = this.f94914k;
                z13 = false;
                if (i13 <= g5Var2.f94792b) {
                    z15 = g5Var.h(g5Var2, (f5[]) g5Var.f94791a.keySet().toArray(new f5[0]));
                    f5 f5Var = f5.ANALYTICS_STORAGE;
                    if (g5Var.e(f5Var)) {
                        g5 g5Var4 = this.f94914k;
                        g5Var4.getClass();
                        if (!g5Var4.e(f5Var)) {
                            z13 = true;
                        }
                    }
                    g5 g13 = g5Var.g(this.f94914k);
                    this.f94914k = g13;
                    g5Var3 = g13;
                    z14 = z13;
                    z13 = true;
                } else {
                    g5Var3 = g5Var;
                    z14 = false;
                    z15 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z13) {
            zzj().f95274l.b(g5Var3, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f94915l.getAndIncrement();
        if (z15) {
            E(null);
            zzl().z(new t5(this, g5Var3, j13, andIncrement, z14, g5Var2));
            return;
        }
        v5 v5Var = new v5(this, g5Var3, andIncrement, z14, g5Var2);
        if (i13 == 30 || i13 == -10) {
            zzl().z(v5Var);
        } else {
            zzl().y(v5Var);
        }
    }

    public final void Q() {
        Boolean y13;
        p();
        w();
        if (((u4) this.f24333a).f()) {
            int i13 = 1;
            if (l().x(null, s.f95100g0) && (y13 = l().y("google_analytics_deferred_deep_link_enabled")) != null && y13.booleanValue()) {
                zzj().f95275m.c("Deferred Deep Link feature enabled.");
                zzl().y(new t4(this, i13));
            }
            d6 u13 = u();
            u13.p();
            u13.w();
            zzo L = u13.L(true);
            u13.r().A(3, new byte[0]);
            u13.A(new f6(u13, L, i13));
            this.f94918o = false;
            g4 n13 = n();
            n13.p();
            String string = n13.w().getString("previous_os_version", null);
            ((u4) n13.f24333a).j().q();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = n13.w().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ((u4) this.f24333a).j().q();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            W("auto", "_ou", bundle);
        }
    }

    public final void R() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f94906c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f94906c);
    }

    public final void S() {
        ia.a();
        if (l().x(null, s.D0)) {
            if (zzl().A()) {
                zzj().f95268f.c("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (q8.m0.d()) {
                zzj().f95268f.c("Cannot get trigger URIs from main thread");
                return;
            }
            w();
            zzj().f95276n.c("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzl().t(atomicReference, 5000L, "get trigger URIs", new l5(this, atomicReference, 0));
            List list = (List) atomicReference.get();
            if (list == null) {
                zzj().f95268f.c("Timed out waiting for get trigger URIs");
            } else {
                zzl().y(new androidx.appcompat.widget.j(this, list, 23));
            }
        }
    }

    public final void T() {
        zzmh zzmhVar;
        ea.h y03;
        p();
        if (U().isEmpty() || this.f94912i || (zzmhVar = (zzmh) U().poll()) == null || (y03 = o().y0()) == null) {
            return;
        }
        this.f94912i = true;
        a4 a4Var = zzj().f95276n;
        String str = zzmhVar.f32034f;
        a4Var.b(str, "Registering trigger URI");
        com.google.common.util.concurrent.c0 e13 = y03.e(Uri.parse(str));
        if (e13 == null) {
            this.f94912i = false;
            U().add(zzmhVar);
            return;
        }
        SparseArray x13 = n().x();
        x13.put(zzmhVar.f32036h, Long.valueOf(zzmhVar.f32035g));
        g4 n13 = n();
        int[] iArr = new int[x13.size()];
        long[] jArr = new long[x13.size()];
        for (int i13 = 0; i13 < x13.size(); i13++) {
            iArr[i13] = x13.keyAt(i13);
            jArr[i13] = ((Long) x13.valueAt(i13)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        n13.f94778m.T(bundle);
        dl2.b.n(e13, new com.google.android.gms.internal.measurement.x(this, zzmhVar, 5), new f0.c(this));
    }

    public final PriorityQueue U() {
        if (this.f94913j == null) {
            this.f94913j = new PriorityQueue(Comparator.comparing(j5.f94877a, m5.f94952a));
        }
        return this.f94913j;
    }

    public final void V() {
        p();
        String l13 = n().f94777l.l();
        if (l13 != null) {
            if ("unset".equals(l13)) {
                ((oh.b) zzb()).getClass();
                I("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf("true".equals(l13) ? 1L : 0L);
                ((oh.b) zzb()).getClass();
                I("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        int i13 = 2;
        if (!((u4) this.f24333a).e() || !this.f94918o) {
            zzj().f95275m.c("Updating Scion state (FE)");
            d6 u13 = u();
            u13.p();
            u13.w();
            u13.A(new f6(u13, u13.L(true), i13));
            return;
        }
        zzj().f95275m.c("Recording app launch after enabling measurement for the first time (FE)");
        Q();
        ((i9) j9.f31483b.get()).getClass();
        if (l().x(null, s.f95112m0)) {
            v().f95073e.G();
        }
        zzl().y(new t4(this, i13));
    }

    public final void W(String str, String str2, Bundle bundle) {
        p();
        ((oh.b) zzb()).getClass();
        z(System.currentTimeMillis(), bundle, str, str2);
    }

    @Override // oi.k2
    public final boolean y() {
        return false;
    }

    public final void z(long j13, Bundle bundle, String str, String str2) {
        p();
        F(str, str2, j13, bundle, true, this.f94907d == null || f7.s0(str2), true, null);
    }
}
