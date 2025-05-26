package mb0;

import ab1.o;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import ao2.j0;
import ao2.v0;
import bx0.t;
import c61.q0;
import ck2.i;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.qcm.analytics.AdsQcmAnalytics$QcmItemClickPayload;
import com.pinterest.feature.qcm.analytics.AdsQcmAnalytics$QcmItemImpressionPayload;
import fz0.n;
import fz0.s;
import hp0.a0;
import hp0.x;
import hp0.y;
import hp0.z;
import i01.r0;
import i32.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk2.d0;
import ko2.e;
import ko2.f;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import ku1.l;
import l82.g;
import l82.h;
import l82.k;
import lb0.q;
import lh0.h2;
import m60.x0;
import o82.d2;
import o82.h0;
import so.da;
import tx0.b0;
import tx0.u;
import u50.r;
import x02.e0;
import x02.w1;
import x02.x2;
import xs0.d;
import y01.a1;
import y01.z0;
import y52.p;
import z01.m;

/* loaded from: classes5.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86861a = 12;

    /* renamed from: b, reason: collision with root package name */
    public final Object f86862b;

    public a(h2 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f86862b = experiments;
    }

    @Override // l82.g
    public final void e(j0 scope, h request, r eventIntake) {
        int i13 = 14;
        int i14 = this.f86861a;
        int i15 = 1;
        int i16 = 21;
        Object obj = this.f86862b;
        switch (i14) {
            case 0:
                c request2 = (c) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof b) {
                    b bVar = (b) request2;
                    bVar.getClass();
                    ((q) obj).b("PREF_LAST_TIME_USER_LAND_ON_SEARCH", bVar.f86863a);
                    return;
                }
                return;
            case 1:
                a0 request3 = (a0) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request3 instanceof y) {
                    ((l51.a) obj).b("STLV3_DRAWER_ITEM_IMPRESSION");
                    return;
                }
                if (!(request3 instanceof x)) {
                    if (request3 instanceof z) {
                        l51.a aVar = (l51.a) obj;
                        if (aVar.d()) {
                            wr.c.a(aVar.f81587d, new AdsQcmAnalytics$QcmItemImpressionPayload("STLV3_DRAWER_IMPRESSION"), null, null, 14);
                            return;
                        }
                        return;
                    }
                    return;
                }
                l51.a aVar2 = (l51.a) obj;
                boolean z13 = ((x) request3).f69887a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter("STLV3_DRAWER_ITEM_CLICK", "eventName");
                if (aVar2.d()) {
                    wr.c.a(aVar2.f81587d, new AdsQcmAnalytics$QcmItemClickPayload("STLV3_DRAWER_ITEM_CLICK", z13), null, null, 14);
                    return;
                }
                return;
            case 2:
                d request4 = (d) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request4 instanceof d) {
                    j.z(scope, null, null, new gt0.c(this, request4, null), 3);
                    return;
                }
                return;
            case 3:
                t request5 = (t) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request5 instanceof t) {
                    l.b((l) obj, request5.f24087a, request5.f24088b, true, true, null, null, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
                    return;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter((tx0.t) request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                j.z(scope, null, null, new b0(this, eventIntake, null), 3);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter((u) request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ((h2) obj).a();
                return;
            case 6:
                s request6 = (s) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request6, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request6 instanceof n) {
                    j.z(scope, null, null, new gz0.a(this, request6, eventIntake, null), 3);
                    return;
                }
                return;
            case 7:
                y01.j request7 = (y01.j) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request7, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request7 instanceof y01.j) {
                    j.z(scope, null, null, new m(request7, this, eventIntake, null), 3);
                    return;
                }
                return;
            case 8:
                a1 request8 = (a1) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request8, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request8 instanceof z0) {
                    ((dh0.d) ((rg0.s) obj)).k(y0.ANDROID_PIN_CLOSEUP_AFTER_SCREENSHOT);
                    return;
                }
                return;
            case 9:
                q0 request9 = (q0) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request9, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                for (vh vhVar : request9.f26635a) {
                    if (vhVar.d0()) {
                        hs1.q imageCache = (hs1.q) obj;
                        Intrinsics.checkNotNullParameter(vhVar, "<this>");
                        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
                        List list = vhVar.f42865w;
                        Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof xk) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((hs1.m) imageCache).q(n10.b.a((xk) it.next()), null, null);
                        }
                    } else {
                        hs1.q imageCache2 = (hs1.q) obj;
                        Intrinsics.checkNotNullParameter(vhVar, "<this>");
                        Intrinsics.checkNotNullParameter(imageCache2, "imageCache");
                        List list2 = vhVar.f42865w;
                        Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof xk) {
                                arrayList2.add(obj3);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((hs1.m) imageCache2).q(n10.b.b((xk) it2.next()), null, null);
                        }
                    }
                }
                return;
            case 10:
                sb1.r request10 = (sb1.r) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request10, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request10 instanceof sb1.n) {
                    try {
                        ((x2) obj).d0().Q(((sb1.n) request10).f112263a).d(new d0(new hk2.b(new o(14, new fa1.g(eventIntake, 11)), new o(15, new fa1.g(eventIntake, 12)), i.f27923c), 0L));
                        return;
                    } catch (NullPointerException e13) {
                        throw e13;
                    } catch (Throwable th3) {
                        throw n60.o.g(th3, "subscribeActual failed", th3);
                    }
                }
                return;
            case 11:
                od1.a0 request11 = (od1.a0) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request11, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                j.z(scope, null, null, new qd1.d(this, request11, eventIntake, null), 3);
                return;
            case 12:
                p request12 = (p) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request12, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                String str = request12.f137833a;
                gs1.d dVar = (gs1.d) ((gs1.a) obj);
                dVar.getClass();
                new fk2.g(new uv0.a(i13, dVar, str), 0).i(new r0(i16), new e0(26, y52.a.f137775j));
                return;
            case 13:
                y52.q request13 = (y52.q) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request13, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                request13.getClass();
                if (Intrinsics.d("instagram_stories", "instagram_stories")) {
                    x52.t tVar = (x52.t) obj;
                    tVar.getClass();
                    String videoUri = request13.f137836a;
                    Intrinsics.checkNotNullParameter(videoUri, "videoUri");
                    Uri parse = Uri.parse(videoUri);
                    Context context = tVar.f133913a;
                    context.grantUriPermission("com.instagram.android", parse, 1);
                    Intrinsics.f(parse);
                    Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
                    intent.setFlags(276824065);
                    intent.putExtra("source_application", context.getString(x0.facebook_app_id));
                    intent.putExtra("android.intent.extra.STREAM", parse);
                    String type = context.getContentResolver().getType(parse);
                    if (type == null) {
                        type = "video/mp4";
                    }
                    intent.setDataAndType(parse, type);
                    intent.setPackage("com.instagram.android");
                    if (intent.resolveActivity(context.getPackageManager()) == null) {
                        tVar.f133914b.i(context.getString(x0.generic_error));
                        return;
                    } else {
                        context.startActivity(intent);
                        eventIntake.a(y52.l.f137825a);
                        return;
                    }
                }
                return;
            case 14:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                Iterator it3 = c0.A((g[]) obj).iterator();
                while (it3.hasNext()) {
                    ((g) it3.next()).e(scope, request, eventIntake);
                }
                return;
            case 15:
                h0 request14 = (h0) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request14, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                List list3 = (List) obj;
                list3.isEmpty();
                g gVar = (g) CollectionsKt.U(request14.f93607a, list3);
                for (d2 d2Var : request14.f93608b) {
                    if (gVar != null) {
                        gVar.e(scope, d2Var, new k(eventIntake, request14, i15));
                    }
                }
                return;
            default:
                wc2.n request15 = (wc2.n) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request15, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request15 instanceof wc2.l) {
                    AssetManager assetManager = ((wc2.l) request15).f129141a;
                    f fVar = v0.f20219a;
                    j.z(scope, e.f80326c, null, new wc2.k(assetManager, eventIntake, null), 2);
                    return;
                } else {
                    if (request15 instanceof wc2.m) {
                        ((ri1.c) obj).e(scope, ((wc2.m) request15).f129142a, new kd1.j(eventIntake, i16));
                        return;
                    }
                    return;
                }
        }
    }

    public a(gs1.a clipboardProvider) {
        Intrinsics.checkNotNullParameter(clipboardProvider, "clipboardProvider");
        this.f86862b = clipboardProvider;
    }

    public a(List sectionSEPs) {
        Intrinsics.checkNotNullParameter(sectionSEPs, "sectionSEPs");
        this.f86862b = sectionSEPs;
    }

    public a(l uriNavigator) {
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        this.f86862b = uriNavigator;
    }

    public a(hs1.q imageCache) {
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f86862b = imageCache;
    }

    public a(w1 newsHubRepository) {
        Intrinsics.checkNotNullParameter(newsHubRepository, "newsHubRepository");
        this.f86862b = newsHubRepository;
    }

    public a(x52.t storiesExporter) {
        Intrinsics.checkNotNullParameter(storiesExporter, "storiesExporter");
        this.f86862b = storiesExporter;
    }

    public a(l51.a adsQcmAnalytics) {
        Intrinsics.checkNotNullParameter(adsQcmAnalytics, "adsQcmAnalytics");
        this.f86862b = adsQcmAnalytics;
    }

    public a(rg0.s experiences) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        this.f86862b = experiences;
    }

    public a(q preferencesManager) {
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        this.f86862b = preferencesManager;
    }

    public a(pd1.e pageLoader) {
        Intrinsics.checkNotNullParameter(pageLoader, "pageLoader");
        this.f86862b = pageLoader;
    }

    public a(s20.a pearService) {
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        this.f86862b = pearService;
    }

    public a(x02.x0 boardRepository) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        this.f86862b = boardRepository;
    }

    public a(x2 userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f86862b = userRepository;
    }

    public a(zw.a pinActionHandlerSEP, da pinRepSEPFactory) {
        Intrinsics.checkNotNullParameter(pinActionHandlerSEP, "pinActionHandlerSEP");
        Intrinsics.checkNotNullParameter(pinRepSEPFactory, "pinRepSEPFactory");
        this.f86862b = pinRepSEPFactory.a(pinActionHandlerSEP);
    }

    public a(z12.c pinFeedPagingServiceV2) {
        Intrinsics.checkNotNullParameter(pinFeedPagingServiceV2, "pinFeedPagingServiceV2");
        this.f86862b = pinFeedPagingServiceV2;
    }

    public a(g[] gVarArr) {
        this.f86862b = gVarArr;
    }
}
