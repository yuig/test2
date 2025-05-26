package ku1;

import android.app.Activity;
import com.pinterest.api.model.f30;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.s;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.w1;
import ey.l2;
import h32.c1;
import h32.d4;
import h32.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.g1;
import m60.w;
import to0.y;
import x02.i2;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public Activity f80903a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f80904b;

    /* renamed from: c, reason: collision with root package name */
    public final w f80905c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f80906d;

    /* renamed from: e, reason: collision with root package name */
    public final wk2.a f80907e;

    /* renamed from: f, reason: collision with root package name */
    public final mr1.a f80908f;

    /* renamed from: g, reason: collision with root package name */
    public final lu1.b f80909g;

    /* renamed from: h, reason: collision with root package name */
    public final lu1.d f80910h;

    /* renamed from: i, reason: collision with root package name */
    public final i2 f80911i;

    /* renamed from: j, reason: collision with root package name */
    public final es.a f80912j;

    /* renamed from: k, reason: collision with root package name */
    public ModalContainer f80913k;

    /* renamed from: l, reason: collision with root package name */
    public s f80914l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f80915m;

    /* renamed from: n, reason: collision with root package name */
    public final v f80916n;

    /* renamed from: o, reason: collision with root package name */
    public final g f80917o;

    /* renamed from: p, reason: collision with root package name */
    public final h f80918p;

    public j(Activity activity, g1 experimentsManager, w eventManager, tb0.h crashReporting, bf2.d chromeTabHelperProvider, mr1.a accountSwitcher, lu1.b baseActivityHelper, lu1.d activityIntentFactory, i2 pinRepository, es.a adFormats) {
        Intrinsics.checkNotNullParameter(experimentsManager, "experimentsManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(chromeTabHelperProvider, "chromeTabHelperProvider");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f80903a = activity;
        this.f80904b = experimentsManager;
        this.f80905c = eventManager;
        this.f80906d = crashReporting;
        this.f80907e = chromeTabHelperProvider;
        this.f80908f = accountSwitcher;
        this.f80909g = baseActivityHelper;
        this.f80910h = activityIntentFactory;
        this.f80911i = pinRepository;
        this.f80912j = adFormats;
        this.f80916n = m.b(f.f80899i);
        this.f80917o = new g(this);
        this.f80918p = new h(this);
    }

    public static final void a(j jVar, Navigation navigation) {
        ModalContainer modalContainer = jVar.f80913k;
        if (modalContainer != null && modalContainer.i()) {
            jVar.f80905c.d(new jc0.s());
        }
        jVar.m(navigation);
    }

    public static boolean k(Navigation navigation) {
        if (!navigation.S("com.pinterest.EXTRA_FORCE_WEBVIEW", false)) {
            String f49940b = navigation.getF49940b();
            Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
            if (!z.h(f49940b, "/billing/simplest/", false)) {
                String f49940b2 = navigation.getF49940b();
                Intrinsics.checkNotNullExpressionValue(f49940b2, "getId(...)");
                if (!z.p(f49940b2, "https://analytics.pinterest.com", false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(Navigation navigation) {
        if (!Intrinsics.d(navigation.getF49939a(), (ScreenLocation) w1.f51514z.getValue())) {
            String f49940b = navigation.getF49940b();
            Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
            if (!z.p(f49940b, "https://www.pinterest.com/oauth/", false)) {
                String f49940b2 = navigation.getF49940b();
                Intrinsics.checkNotNullExpressionValue(f49940b2, "getId(...)");
                if (!z.p(f49940b2, "https://www.pinterest.com/app-factory-oauth/", false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final nl1.d b() {
        s sVar = this.f80914l;
        com.pinterest.framework.screens.m j13 = sVar != null ? sVar.j() : null;
        if (j13 instanceof nl1.d) {
            return (nl1.d) j13;
        }
        return null;
    }

    public final List c() {
        return (List) this.f80916n.getValue();
    }

    public final boolean d(String str) {
        if (str == null) {
            return false;
        }
        return ((es.c) this.f80912j).M((f30) this.f80911i.O(str));
    }

    public final boolean e(Navigation navigation) {
        c1 c1Var;
        c1 source;
        e32.b bVar;
        try {
            String v03 = navigation.v0("com.pinterest.CLOSEUP_PIN_ID");
            if (f0.d(w1.a(), (ScreenLocation) w1.f51514z.getValue()).contains(navigation.getF49939a())) {
                if (l(navigation)) {
                    Activity activity = this.f80903a;
                    if (activity != null) {
                        String f49940b = navigation.getF49940b();
                        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
                        return ((lu1.c) this.f80909g).u(f49940b, activity);
                    }
                } else if (!k(navigation)) {
                    z70.m mVar = (z70.m) this.f80907e.get();
                    mVar.a();
                    if (mVar.d() && this.f80903a != null) {
                        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                        f0Var.f80424a = true;
                        Object i03 = navigation.i0("com.pinterest.PIN_LOGGING_EVENT_DATA");
                        to0.z zVar = i03 instanceof to0.z ? (to0.z) i03 : null;
                        if (zVar == null || (source = zVar.a()) == null) {
                            c1Var = null;
                        } else {
                            Intrinsics.checkNotNullParameter(source, "source");
                            h32.e eVar = source.f66908e0;
                            if (eVar != null && (bVar = eVar.f66961d) != null) {
                                e32.a aVar = new e32.a(bVar);
                                aVar.f57126g = Integer.valueOf(n0.WEB.getValue());
                                aVar.f57127h = navigation.getF49940b();
                                e32.b a13 = aVar.a();
                                h32.d dVar = new h32.d(eVar);
                                dVar.f66941d = a13;
                                eVar = dVar.a();
                            }
                            c1Var = new c1(source.f66899a, source.f66901b, source.f66903c, source.f66905d, source.f66907e, source.f66909f, source.f66911g, source.f66912h, source.f66913i, source.f66914j, source.f66915k, source.f66916l, source.f66917m, source.f66918n, source.f66919o, source.f66920p, source.f66921q, source.f66922r, source.f66923s, source.f66924t, source.f66925u, source.f66926v, source.f66927w, source.f66928x, source.f66929y, source.f66930z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f66898J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f66900a0, source.f66902b0, source.f66904c0, source.f66906d0, eVar, source.f66910f0);
                        }
                        String f49940b2 = navigation.getF49940b();
                        String v04 = navigation.v0("com.pinterest.EXTRA_REFERRER");
                        String v05 = navigation.v0("IDEA_STREAM_EXTRAS_KEY_FEATURED_AGGREGATED_PIN_DATA_ID");
                        boolean d2 = d(v03);
                        Object i04 = navigation.i0("com.pinterest.PIN_LOGGING_AUX_DATA");
                        y yVar = i04 instanceof y ? (y) i04 : null;
                        HashMap a14 = yVar != null ? yVar.a() : null;
                        String v06 = navigation.v0("com.pinterest.CLIENT_TRACKING_PARAMETER");
                        boolean S = navigation.S("com.pinterest.EXTRA_LOG_PIN_CLICKTHROUGH_END", false);
                        Object i05 = navigation.i0("com.pinterest.EXTRA_PIN_DL_COLLECTION_EVENT_DATA");
                        to0.z zVar2 = i05 instanceof to0.z ? (to0.z) i05 : null;
                        c1 a15 = zVar2 != null ? zVar2.a() : null;
                        boolean S2 = navigation.S("com.pinterest.EXTRA_PIN_IS_DL_COLLECTION", false);
                        boolean S3 = navigation.S("com.pinterest.EXTRA_ENABLE_BOTTOM_TOOLBAR", true);
                        Intrinsics.f(f49940b2);
                        z70.m.f(mVar, f49940b2, v04, v03, v05, d2, a14, v06, S, c1Var, S3, false, a15, S2, null, new yj1.d(f0Var, 24), 9216);
                        return f0Var.f80424a;
                    }
                }
            }
            return false;
        } catch (RuntimeException e13) {
            String name = navigation.getF49939a().getName();
            d4 f49944f = navigation.getF49944f();
            throw new RuntimeException("ScreenLocation: " + name + ", navigatingFrom: " + (f49944f != null ? Integer.valueOf(f49944f.getValue()) : null), e13);
        }
    }

    public final boolean f() {
        Navigation navigation;
        s sVar;
        Navigation navigation2;
        s sVar2 = this.f80914l;
        if (sVar2 == null) {
            return false;
        }
        if (hf0.b.q()) {
            List c13 = c();
            s sVar3 = this.f80914l;
            ScreenDescription k13 = sVar3 != null ? sVar3.k() : null;
            if (CollectionsKt.L(c13, (k13 == null || (navigation = (Navigation) k13.getF49207c().getParcelable("NAVIGATION_MODEL_BUNDLE_KEY")) == null) ? null : navigation.getF49939a()) && (sVar = this.f80914l) != null) {
                Iterator it = sVar.i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ScreenDescription screenDescription = (ScreenDescription) it.next();
                        if (CollectionsKt.L(c(), (screenDescription == null || (navigation2 = (Navigation) screenDescription.getF49207c().getParcelable("NAVIGATION_MODEL_BUNDLE_KEY")) == null) ? null : navigation2.getF49939a())) {
                            break;
                        }
                    } else {
                        com.pinterest.framework.screens.m j13 = sVar.j();
                        nl1.d dVar = j13 instanceof nl1.d ? (nl1.d) j13 : null;
                        if (dVar != null) {
                            dVar.Q = new i(this);
                        }
                    }
                }
            }
        }
        return sVar2.p();
    }

    public final void g(ModalContainer dialogContainer, s screenManager) {
        Intrinsics.checkNotNullParameter(dialogContainer, "dialogContainer");
        Intrinsics.checkNotNullParameter(screenManager, "screenManager");
        this.f80913k = dialogContainer;
        this.f80914l = screenManager;
    }

    public final void h() {
        this.f80905c.d(new l2("BACKGROUND"));
        s sVar = this.f80914l;
        if (sVar != null) {
            sVar.g();
        }
        this.f80915m = true;
    }

    public final void i() {
        w wVar = this.f80905c;
        wVar.h(this.f80918p);
        wVar.h(this.f80917o);
    }

    public final void j() {
        w wVar = this.f80905c;
        wVar.j(this.f80917o);
        wVar.j(this.f80918p);
    }

    public final void m(Navigation... items) {
        s sVar;
        Activity activity;
        Intrinsics.checkNotNullParameter(items, "items");
        List<Navigation> j13 = f0.j(Arrays.copyOf(items, items.length));
        if (j13.isEmpty() || (sVar = this.f80914l) == null) {
            return;
        }
        this.f80905c.d(new of0.a(null));
        int size = j13.size();
        ScreenLocation f49939a = ((Navigation) j13.get(size - 1)).getF49939a();
        if (size > 1) {
            ArrayList arrayList = new ArrayList();
            for (Navigation navigation : j13) {
                if (!e(navigation)) {
                    arrayList.add(navigation.b1());
                }
            }
            sVar.d(arrayList);
        } else {
            for (Navigation navigation2 : j13) {
                if (!e(navigation2)) {
                    ScreenModel screenDescription = navigation2.b1();
                    Intrinsics.checkNotNullExpressionValue(screenDescription, "toScreenDescription(...)");
                    boolean r13 = navigation2.r1();
                    Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
                    sVar.c(screenDescription, true, false, true, r13);
                }
            }
        }
        if (Intrinsics.d(f49939a, (ScreenLocation) w1.A.getValue()) || !CollectionsKt.L(c(), f49939a) || (activity = this.f80903a) == null) {
            return;
        }
        dl2.b.Z1(activity);
    }
}
