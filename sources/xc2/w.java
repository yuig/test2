package xc2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.pinterest.widget.WidgetRefreshWorker;
import df.j1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import jk2.i1;
import jk2.x;
import kb.m0;
import kb.n0;
import kb.u0;
import kb.w0;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.f0;
import uj2.a0;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final m f134586a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f134587b;

    /* renamed from: c, reason: collision with root package name */
    public final com.pinterest.widget.configuration.h f134588c;

    /* renamed from: d, reason: collision with root package name */
    public final vy.m f134589d;

    public w(o widgetRepository, b60.b activeUserManager, com.pinterest.widget.configuration.h widgetConfigurationDataSource, vy.m analyticsApi) {
        Intrinsics.checkNotNullParameter(widgetRepository, "widgetRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(widgetConfigurationDataSource, "widgetConfigurationDataSource");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f134586a = widgetRepository;
        this.f134587b = activeUserManager;
        this.f134588c = widgetConfigurationDataSource;
        this.f134589d = analyticsApi;
    }

    public static final Bitmap a(w wVar, int i13, String pinImageUrl, Function1 function1) {
        wVar.getClass();
        Pair pair = (Pair) function1.invoke(Integer.valueOf(i13));
        int intValue = ((Number) pair.f80346a).intValue();
        int intValue2 = ((Number) pair.f80347b).intValue();
        o oVar = (o) wVar.f134586a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
        if (!z.j(pinImageUrl)) {
            try {
                return ((hs1.m) oVar.f134569b).l(Integer.valueOf(intValue), Integer.valueOf(intValue2), pinImageUrl);
            } catch (Exception e13) {
                Log.e("Widget Debug", "Error getting bitmap", e13);
            }
        }
        return null;
    }

    public final void b(p widgetType, int[] totalAppWidgetIds, int[] appWidgetIdsToUpdate) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(totalAppWidgetIds, "totalAppWidgetIds");
        Intrinsics.checkNotNullParameter(appWidgetIdsToUpdate, "appWidgetIdsToUpdate");
        for (int i13 : appWidgetIdsToUpdate) {
            if (c0.w(totalAppWidgetIds, i13)) {
                this.f134588c.getClass();
                long g13 = ((lb0.b) lb0.n.f82725d.a()).g(j1.U("widget_refresh_interval_id_%d", new Object[]{Integer.valueOf(i13)}), 14400000L);
                l widgetRefreshWorkerParams = new l(g13, i13, widgetType);
                Intrinsics.checkNotNullParameter(widgetRefreshWorkerParams, "widgetRefreshWorkerParams");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter("widget_id", "key");
                linkedHashMap.put("widget_id", Integer.valueOf(i13));
                String name = widgetType.name();
                Intrinsics.checkNotNullParameter("widget_type", "key");
                linkedHashMap.put("widget_type", name);
                kb.l lVar = new kb.l(linkedHashMap);
                bk.f.e0(lVar);
                kb.c0 c0Var = kb.c0.NOT_REQUIRED;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                kb.c0 networkType = kb.c0.CONNECTED;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                kb.g gVar = new kb.g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet));
                String U = j1.U("app_widget_periodic_job_%s_%d", new Object[]{widgetType, Integer.valueOf(i13)});
                n0 n0Var = (n0) ((m0) ((m0) ((m0) ((m0) new m0(WidgetRefreshWorker.class, g13 == 86400000 ? TimeUnit.DAYS : TimeUnit.HOURS).a("app_widget_periodic_job_%s_%d_" + widgetType)).h(lVar)).f(gVar)).e(kb.a.EXPONENTIAL, 30000L, TimeUnit.MILLISECONDS)).b();
                u0 u0Var = w0.f79048a;
                Context context = kb0.a.f79058b;
                u0Var.a(f0.j0()).e(U, kb.p.KEEP, n0Var);
            } else {
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                u0 u0Var2 = w0.f79048a;
                Context context2 = kb0.a.f79058b;
                u0Var2.a(f0.j0()).c(j1.U("app_widget_periodic_job_%s_%d", new Object[]{widgetType, Integer.valueOf(i13)}));
            }
        }
    }

    public final uj2.q c(int[] appWidgetIds, Function1 getWidgetImageSizes, int i13, int i14, String widgetStyle) {
        uj2.t H;
        String j13;
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        Intrinsics.checkNotNullParameter(getWidgetImageSizes, "getWidgetImageSizes");
        Intrinsics.checkNotNullParameter(widgetStyle, "widgetStyle");
        if (!((b60.d) this.f134587b).i()) {
            i1 y13 = uj2.q.y(s.f134580a);
            Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
            return y13;
        }
        int length = appWidgetIds.length;
        ArrayList appWidgetIds2 = new ArrayList();
        ArrayList appWidgetIds3 = new ArrayList();
        for (int i15 : appWidgetIds) {
            this.f134588c.getClass();
            lb0.o a13 = lb0.n.f82725d.a();
            Intrinsics.checkNotNullExpressionValue(a13, "user(...)");
            j13 = ((lb0.b) a13).j(j1.U("widget_content_source_key_%d", new Object[]{Integer.valueOf(i15)}), null);
            if ((j13 != null ? com.pinterest.widget.configuration.r.valueOf(j13) : null) == com.pinterest.widget.configuration.r.BOARD) {
                appWidgetIds2.add(Integer.valueOf(i15));
            } else {
                appWidgetIds3.add(Integer.valueOf(i15));
            }
        }
        Intrinsics.checkNotNullParameter(q0.f80391a, "appWidgetIds");
        Intrinsics.checkNotNullParameter(widgetStyle, "widgetStyle");
        Intrinsics.checkNotNullParameter(getWidgetImageSizes, "getWidgetImageSizes");
        int size = appWidgetIds3.size() * i13;
        Intrinsics.checkNotNullParameter(appWidgetIds3, "appWidgetIds");
        Intrinsics.checkNotNullParameter(widgetStyle, "widgetStyle");
        Intrinsics.checkNotNullParameter(getWidgetImageSizes, "getWidgetImageSizes");
        q qVar = new q(appWidgetIds3, size, i13, widgetStyle, i14, getWidgetImageSizes);
        if (qVar.f134572a.isEmpty()) {
            H = uj2.q.y(new t(null, z0.d()));
            Intrinsics.checkNotNullExpressionValue(H, "just(...)");
        } else {
            o oVar = (o) this.f134586a;
            oVar.getClass();
            String widgetStyle2 = qVar.f134575d;
            Intrinsics.checkNotNullParameter(widgetStyle2, "widgetStyle");
            oc.a c13 = oVar.f134568a.c(new p50.q(qVar.f134573b, new pc.q0(Integer.valueOf(qVar.f134576e)), new pc.q0(widgetStyle2)));
            d7.b.E(c13, vc.f.NetworkOnly);
            kk2.m k13 = com.bumptech.glide.d.u0(c13).n().k(new a.z0(n.f134563k, 15));
            a0 a0Var = tk2.e.f118017c;
            kk2.t r13 = k13.r(a0Var);
            Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
            H = new kk2.m(new kk2.m(r13, new a.z0(new v(qVar, this, 1), 20), 0), new a.z0(new v(qVar, this, 2), 21), 2).u().H(a0Var);
            Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        }
        uj2.t tVar = H;
        int size2 = appWidgetIds2.size() * i13;
        Intrinsics.checkNotNullParameter(appWidgetIds2, "appWidgetIds");
        Intrinsics.checkNotNullParameter(widgetStyle, "widgetStyle");
        Intrinsics.checkNotNullParameter(getWidgetImageSizes, "getWidgetImageSizes");
        q qVar2 = new q(appWidgetIds2, size2, i13, widgetStyle, i14, getWidgetImageSizes);
        x H2 = new jk2.n0(new jk2.n0(new jk2.u0(uj2.q.y(qVar2), new a.z0(n.f134564l, 17), 0), new a.z0(new v(this, qVar2), 18), 0 == true ? 1 : 0, 2), new a.z0(n.f134565m, 19), 0 == true ? 1 : 0, 3).H(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(H2, "subscribeOn(...)");
        jk2.a0 p13 = uj2.q.v(tVar, H2).u(ck2.i.f27921a, false, 2, uj2.h.f122339a).p(new lb2.r(17, new ha2.i(18, this, widgetStyle)));
        Intrinsics.checkNotNullExpressionValue(p13, "doOnEach(...)");
        return p13;
    }
}
