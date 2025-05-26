package kb0;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.pinterest.design.brio.widget.progress.LoadingView;
import ff0.j;
import hs1.m;
import hs1.q;
import hs1.r;
import hs1.s;
import hs1.t;
import hs1.u;
import hs1.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import lb.l0;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.d;
import m60.e;
import m60.l;
import m60.m0;
import md.b;
import nx.d0;
import nx.g0;
import okhttp3.Call;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;
import qz.b0;
import qz.y;
import so.oa;
import vu1.a0;

/* loaded from: classes.dex */
public abstract class a extends Application {

    /* renamed from: b, reason: collision with root package name */
    public static Context f79058b;

    /* renamed from: c, reason: collision with root package name */
    public static a f79059c;

    /* renamed from: d, reason: collision with root package name */
    public static Context f79060d;

    /* renamed from: a, reason: collision with root package name */
    public e f79061a;

    public final e a() {
        e eVar = this.f79061a;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("applicationInfoProvider");
        throw null;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        f79060d = base;
        f79059c = this;
    }

    @Override // android.app.Application
    public void onCreate() {
        List split$default;
        b bVar;
        super.onCreate();
        f79058b = getApplicationContext();
        m0 m0Var = (m0) this;
        ((oa) m0Var.i().f()).f2().a();
        ((d) m0Var.a()).g();
        n1 j13 = m0Var.j();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) j13.f83439a;
        boolean z13 = g1Var.o("android_cronet_client_for_images", "enabled", z3Var) || g1Var.l("android_cronet_client_for_images");
        String str = (String) ((f30.b) ((bf2.b) ((se2.a) m0Var.i().C.getValue())).get()).f60987g.getValue();
        uk2.d dVar = t.f70074a;
        a0 baseCronetClient = (a0) m0Var.A.getValue();
        OkHttpClient baseClient = (OkHttpClient) m0Var.f85931z.getValue();
        Context context = f79058b;
        if (context == null && (context = f79060d) == null) {
            throw new IllegalStateException("CommonApplication.attachBaseContext has not been called".toString());
        }
        Context context2 = context;
        y eventListener = new y();
        b0 b0Var = new b0();
        g0 g0Var = new g0((d0) m0Var.f85928w.getValue());
        boolean z14 = j.f62105c;
        l lVar = new l(m0Var, z13);
        u imageCacheParams = new u(context2, str, eventListener, b0Var, g0Var, z13, z14, lVar);
        Intrinsics.checkNotNullParameter(baseCronetClient, "baseCronetClient");
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        Intrinsics.checkNotNullParameter(imageCacheParams, "imageCacheParams");
        q a13 = t.a();
        Intrinsics.g(a13, "null cannot be cast to non-null type com.pinterest.kit.network.image.ImageCacheBase");
        r rVar = (r) a13;
        Intrinsics.checkNotNullParameter(baseCronetClient, "baseCronetClient");
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        Intrinsics.checkNotNullParameter(imageCacheParams, "imageCacheParams");
        if (rVar.f70071a == null) {
            OkHttpClient.Builder newBuilder = baseClient.newBuilder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            newBuilder.c(15000L, timeUnit);
            ArrayList connectionSpecs = new ArrayList();
            connectionSpecs.add(ConnectionSpec.f95571e);
            connectionSpecs.add(ConnectionSpec.f95572f);
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!Intrinsics.d(connectionSpecs, newBuilder.f95692s)) {
                newBuilder.D = null;
            }
            newBuilder.f95692s = Util.A(connectionSpecs);
            newBuilder.e(20000L, timeUnit);
            newBuilder.f(20000L, timeUnit);
            newBuilder.a(new v(str));
            newBuilder.a(b0Var);
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            Intrinsics.checkNotNullParameter(eventListener, "<this>");
            newBuilder.f95678e = new uo2.a(eventListener);
            lVar.invoke(newBuilder);
            newBuilder.f95684k = null;
            rVar.f70071a = new OkHttpClient(newBuilder);
        }
        rVar.f70072b = baseCronetClient;
        m mVar = (m) rVar;
        Intrinsics.checkNotNullParameter(imageCacheParams, "imageCacheParams");
        mVar.f70062l = z14;
        mVar.f70073c = false;
        OkHttpClient okHttpClient = mVar.f70071a;
        if (okHttpClient != null) {
            com.bumptech.glide.j a14 = com.bumptech.glide.b.a(context2).f29743d.a();
            if (z13) {
                a0 a0Var = mVar.f70072b;
                Call.Factory factory = okHttpClient;
                if (a0Var != null) {
                    factory = a0Var.a(okHttpClient, null);
                }
                bVar = new b(factory);
            } else {
                bVar = new b(okHttpClient);
            }
            a14.i(bVar);
        }
        mVar.f70060j = com.bumptech.glide.b.a(context2);
        mVar.f70059i = com.bumptech.glide.b.f(context2);
        mVar.f70063m = g0Var;
        t.f70074a.c(new s());
        LinkedList linkedList = ac2.g1.f1964a;
        lb0.q prefsManagerPersisted = (lb0.q) ((oa) m0Var.i().f()).O0.get();
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        String d2 = prefsManagerPersisted.d("PREF_APP_START_VIDEO_FORMAT", null);
        if (d2 == null) {
            d2 = "";
        }
        split$default = StringsKt__StringsKt.split$default(d2, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ac2.g1.f1964a.add(Integer.valueOf(((Number) it2.next()).intValue()));
            }
        }
        n1 j14 = m0Var.j();
        z3 z3Var2 = a4.f83298b;
        g1 g1Var2 = (g1) j14.f83439a;
        ao2.m0.f20172b = g1Var2.o("android_measure_feed_image_load_in_image_base_classes_cleanup", "enabled", z3Var2) || g1Var2.l("android_measure_feed_image_load_in_image_base_classes_cleanup");
        ao2.m0.f20173c = m0Var.j().a("no_xy");
        ao2.m0.f20174d = m0Var.j().a("no_video");
        g1 g1Var3 = (g1) m0Var.j().f83439a;
        d7.b.f53785b = g1Var3.o("android_log_generic_feed_pwt", "enabled", z3Var2) || g1Var3.l("android_log_generic_feed_pwt");
        g1 g1Var4 = (g1) m0Var.j().f83439a;
        LoadingView.f44862d = g1Var4.o("android_delay_bottom_spinner_initial_display", "enabled", z3Var2) || g1Var4.l("android_delay_bottom_spinner_initial_display");
        g1 g1Var5 = (g1) m0Var.j().f83439a;
        l0.f82618a = g1Var5.o("android_warmup_connections_upon_deeplinking", "enabled", z3Var2) || g1Var5.l("android_warmup_connections_upon_deeplinking");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        try {
            super.unregisterReceiver(receiver);
        } catch (IllegalArgumentException unused) {
        }
    }
}
