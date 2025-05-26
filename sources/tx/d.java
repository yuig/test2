package tx;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import df.j1;
import ey.j3;
import h32.d4;
import h32.f1;
import h32.i0;
import h32.q0;
import h32.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import k1.s2;
import kk2.k;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import ny1.p;
import ny1.q;
import pk.a0;
import so.na;
import tb0.h;
import vy.i;
import vy.m;
import wo2.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f119623a;

    /* renamed from: b, reason: collision with root package name */
    public final h f119624b;

    /* renamed from: c, reason: collision with root package name */
    public final m f119625c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f119626d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.e f119627e;

    /* renamed from: f, reason: collision with root package name */
    public final f30.b f119628f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f119629g;

    /* renamed from: h, reason: collision with root package name */
    public long f119630h;

    public d(na dauAlphaAllAndProdEmployeeLogger, h crashReporting, m analyticsApi, b60.b activeUserManager, m60.e applicationInfoProvider, f30.b apiUtils, n1 experiments) {
        j3 perfLogUtils = j3.f60510a;
        Intrinsics.checkNotNullParameter(dauAlphaAllAndProdEmployeeLogger, "dauAlphaAllAndProdEmployeeLogger");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(perfLogUtils, "perfLogUtils");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f119623a = dauAlphaAllAndProdEmployeeLogger;
        this.f119624b = crashReporting;
        this.f119625c = analyticsApi;
        this.f119626d = activeUserManager;
        this.f119627e = applicationInfoProvider;
        this.f119628f = apiUtils;
        this.f119630h = System.currentTimeMillis();
    }

    public final void a(Context context, i0 i0Var) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Network activeNetwork2;
        NetworkCapabilities networkCapabilities2;
        h hVar = this.f119624b;
        if (this.f119629g) {
            i0 i0Var2 = i0Var == null ? new i0(d4.UNKNOWN_VIEW, null, null, null, null, null) : i0Var;
            HashMap hashMap = new HashMap();
            int i13 = 4;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                ArrayList l03 = CollectionsKt.l0(f0.j("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.POST_NOTIFICATIONS"), p.f92686d);
                ArrayList arrayList = new ArrayList();
                for (Object obj : l03) {
                    if (a0.G0(context, (String) obj)) {
                        arrayList.add(obj);
                    }
                }
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                hashMap.put("permissions_granted", CollectionsKt.Z(arrayList, ",", null, null, 0, null, q.f92689j, 30));
                Object obj2 = d5.a.f53679a;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                hashMap.put("vpn_enabled", String.valueOf((connectivityManager == null || (activeNetwork2 = connectivityManager.getActiveNetwork()) == null || (networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork2)) == null) ? false : networkCapabilities2.hasTransport(4)));
            }
            String g13 = c60.d.a() == null ? null : dl2.b.g1(((b60.d) this.f119626d).f());
            ((m60.d) this.f119628f.f60982b).g();
            z0.d();
            Boolean bool = Boolean.FALSE;
            z0.d();
            f1 f1Var = f1.USER_ACTIVE;
            Long f13 = ep.b.f(1000000L);
            j3 j3Var = j3.f60510a;
            q0 e13 = j3.e();
            h32.m a13 = hf0.b.a();
            m60.d dVar = (m60.d) this.f119627e;
            String c13 = dVar.c(bool);
            dVar.b();
            w0 w0Var = new w0(f13, f1Var, null, null, hashMap, null, null, i0Var2, a13, null, j1.U("version=%s;build=%d;environment=%s", new Object[]{c13, 13198010, "Release", Locale.US}), e13, null, null, null, null, g13, null, null, dVar.f85891a.getContextEnum(), null, null, null, null, null, bool, null, null, null, null, null, null, null, null, null, null, null);
            int i14 = 1;
            try {
                j jVar = new j();
                fo.b protocol = new fo.b(new go.a(jVar));
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                w0.L.h(protocol, w0Var);
                byte[] data = jVar.A(jVar.f130711b);
                m mVar = this.f119625c;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                fk2.c cVar = new fk2.c(4, new k(new vy.a(data, i14), 1), new ir.j(i13, new i(mVar)));
                Intrinsics.checkNotNullExpressionValue(cVar, "flatMapCompletable(...)");
                fk2.c l13 = cVar.l(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                nl.b.n(l13, c.f119622i, new s2(this, 27));
            } catch (Exception e14) {
                tb0.k kVar = new tb0.k();
                kVar.b("SerialException", e14);
                hVar.k("DAU-Ping", kVar.f117102a);
            }
            if (context != null) {
                Object obj3 = d5.a.f53679a;
                ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                hVar.b("vpn_enabled", String.valueOf((connectivityManager2 == null || (activeNetwork = connectivityManager2.getActiveNetwork()) == null || (networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasTransport(4)));
            }
            b bVar = (b) this.f119623a.get();
            bVar.getClass();
            int i15 = at1.d.f20439o;
            nl.b.f().a(1, new a(bVar), false);
        }
    }
}
