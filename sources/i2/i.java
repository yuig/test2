package i2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.view.Choreographer;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkerStoppedException;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.engage.GoogleEngageWorker;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.text.GestaltText;
import ey.x4;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import t3.c5;
import t3.d5;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71125i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f71126j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f71127k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, Object obj, Object obj2) {
        super(1);
        this.f71125i = i13;
        this.f71126j = obj;
        this.f71127k = obj2;
    }

    public final ek1.r b(ek1.r it) {
        int i13 = this.f71125i;
        Object obj = this.f71127k;
        Object obj2 = this.f71126j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return ek1.r.e(it, CollectionsKt.m0((yi1.l) obj2, it.f59328a), (az.b) obj, null, false, null, 28);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                az.b bVar = it.f59329b;
                h32.z1 source = (h32.z1) obj2;
                Intrinsics.checkNotNullParameter(source, "source");
                ek1.b0 b0Var = (ek1.b0) ((ek1.g0) obj);
                return ek1.r.e(it, null, az.b.e(bVar, null, new h32.z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, Double.valueOf(b0Var.f59215b), Double.valueOf(b0Var.f59214a), source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0), null, 5), null, false, null, 29);
        }
    }

    public final s0 e() {
        int i13 = this.f71125i;
        Object obj = this.f71127k;
        Object obj2 = this.f71126j;
        switch (i13) {
            case 5:
                Context context = (Context) obj2;
                t3.g1 g1Var = (t3.g1) obj;
                context.getApplicationContext().registerComponentCallbacks(g1Var);
                return new j1.j2(2, context, g1Var);
            default:
                Context context2 = (Context) obj2;
                t3.h1 h1Var = (t3.h1) obj;
                context2.getApplicationContext().registerComponentCallbacks(h1Var);
                return new j1.j2(3, context2, h1Var);
        }
    }

    public final void f(Throwable it) {
        switch (this.f71125i) {
            case 0:
                j jVar = (j) this.f71126j;
                Object obj = jVar.f71133b;
                h hVar = (h) this.f71127k;
                synchronized (obj) {
                    try {
                        jVar.f71135d.remove(hVar);
                        if (jVar.f71135d.isEmpty()) {
                            jVar.f71137f.set(0);
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 7:
                t3.p1 p1Var = (t3.p1) this.f71126j;
                Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.f71127k;
                synchronized (p1Var.f116131e) {
                    p1Var.f116133g.remove(frameCallback);
                }
                return;
            case 10:
                if (it instanceof WorkerStoppedException) {
                    ((kb.a0) this.f71126j).h(((WorkerStoppedException) it).f20012a);
                }
                ((com.google.common.util.concurrent.c0) this.f71127k).cancel(false);
                return;
            case 11:
                mc.i iVar = (mc.i) this.f71126j;
                uk2.o oVar = iVar.f86902a;
                String str = (String) this.f71127k;
                Intrinsics.f(it);
                oVar.onSuccess(new mc.b(str, it));
                iVar.f86903b = false;
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                lh0.g1 g1Var = (lh0.g1) this.f71126j;
                String str2 = (String) this.f71127k;
                synchronized (g1Var.f83363o) {
                    g1Var.f83362n.remove(str2);
                }
                return;
        }
    }

    public final void h(q3.b1 b1Var) {
        int i13 = this.f71125i;
        Object obj = this.f71127k;
        Object obj2 = this.f71126j;
        switch (i13) {
            case 2:
                q3.c1 c1Var = (q3.c1) obj2;
                float f13 = ((u2.x) obj).f120063n;
                b1Var.getClass();
                long a13 = d7.b.a(0, 0);
                q3.b1.c(b1Var, c1Var);
                c1Var.u0(n4.h.c(a13, c1Var.f102182e), f13, null);
                break;
            case 3:
                q3.b1.i(b1Var, (q3.c1) obj2, 0, 0, ((b3.r) obj).f21348n, 4);
                break;
            default:
                q3.b1.i(b1Var, (q3.c1) obj2, 0, 0, ((b3.y0) obj).D, 4);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Drawable f03;
        BitmapDrawable bitmapDrawable;
        int i13 = 6;
        int i14 = 1;
        int i15 = 0;
        switch (this.f71125i) {
            case 0:
                f((Throwable) obj);
                return Unit.f80348a;
            case 1:
                ((z) ((i0) this.f71126j)).A(obj);
                g1.g0 g0Var = (g1.g0) this.f71127k;
                if (g0Var != null) {
                    g0Var.d(obj);
                }
                return Unit.f80348a;
            case 2:
                h((q3.b1) obj);
                return Unit.f80348a;
            case 3:
                h((q3.b1) obj);
                return Unit.f80348a;
            case 4:
                h((q3.b1) obj);
                return Unit.f80348a;
            case 5:
                return e();
            case 6:
                return e();
            case 7:
                f((Throwable) obj);
                return Unit.f80348a;
            case 8:
                t3.n nVar = (t3.n) obj;
                d5 d5Var = (d5) this.f71126j;
                if (!d5Var.f115944c) {
                    androidx.lifecycle.s lifecycle = nVar.f116095a.getLifecycle();
                    Function2 function2 = (Function2) this.f71127k;
                    d5Var.f115946e = function2;
                    if (d5Var.f115945d == null) {
                        d5Var.f115945d = lifecycle;
                        lifecycle.a(d5Var);
                    } else if (((androidx.lifecycle.b0) lifecycle).f18588d.isAtLeast(androidx.lifecycle.r.CREATED)) {
                        v vVar = d5Var.f115943b;
                        c5 c5Var = new c5(d5Var, function2, i14);
                        Object obj2 = q2.i.f102113a;
                        vVar.d(new q2.h(c5Var, true, -2000640158));
                    }
                }
                return Unit.f80348a;
            case 9:
                ((s3.k0) this.f71126j).f0(((u2.q) obj).j((u2.q) this.f71127k));
                return Unit.f80348a;
            case 10:
                f((Throwable) obj);
                return Unit.f80348a;
            case 11:
                f((Throwable) obj);
                return Unit.f80348a;
            case 12:
                y02.a aVar = (y02.a) obj;
                dy.a aVar2 = (dy.a) this.f71126j;
                Intrinsics.f(aVar);
                Context context = (Context) this.f71127k;
                aVar2.getClass();
                boolean z13 = aVar.f136511a;
                if (z13) {
                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                    ((m60.d) aVar2.f56516i).f85896f.getClass();
                    HashMap hashMap = new HashMap();
                    String a13 = vb0.b.f125448a.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "getInstallId(...)");
                    hashMap.put("unauth_id", a13);
                    boolean z14 = aVar.f136512b;
                    if (!z14) {
                        hashMap.put("san_gate", "true");
                    }
                    appsFlyerLib.setAdditionalData(hashMap);
                    if (aVar.f136513c) {
                        appsFlyerLib.setSharingFilterForPartners("");
                    } else {
                        appsFlyerLib.setSharingFilterForPartners("all");
                    }
                    appsFlyerLib.init("aegQVj5ZHCCGo3mJm6GfKX", aVar2, context);
                    b60.d dVar = (b60.d) aVar2.f56515h;
                    wy0 f13 = dVar.f();
                    String G2 = f13 != null ? f13.G2() : null;
                    if (G2 == null || G2.length() == 0) {
                        appsFlyerLib.setConsentData(AppsFlyerConsent.INSTANCE.forNonGDPRUser());
                    } else {
                        String[] strArr = dy.e.f56536a;
                        String lowerCase = G2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (kotlin.collections.c0.y(strArr, lowerCase)) {
                            appsFlyerLib.setConsentData(AppsFlyerConsent.INSTANCE.forGDPRUser(z13, z14));
                        } else {
                            appsFlyerLib.setConsentData(AppsFlyerConsent.INSTANCE.forNonGDPRUser());
                        }
                    }
                    wy0 f14 = dVar.f();
                    String uid = f14 != null ? f14.getUid() : null;
                    if (uid != null && uid.length() != 0) {
                        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
                        if (string == null || string.length() == 0) {
                            appsFlyerLib.setCustomerIdAndLogSession(uid, context);
                        }
                        appsFlyerLib.logEvent(context, AFInAppEventType.CONTENT_VIEW, null);
                        dy.d dVar2 = aVar2.f56518k;
                        if (dVar2 == null) {
                            Intrinsics.r("firebaseAnalyticsEvents");
                            throw null;
                        }
                        FirebaseAnalytics firebaseAnalytics = dVar2.f56534g;
                        if (firebaseAnalytics != null) {
                            wy0 f15 = ((b60.d) dVar2.f56533f).f();
                            String G22 = f15 != null ? f15.G2() : null;
                            oc.a c13 = dVar2.f56531d.c(new y30.w());
                            d7.b.E(c13, vc.f.NetworkOnly);
                            com.bumptech.glide.d.u0(c13).l(wj2.c.a()).o(new mc.h(i13, new i1.a1(dVar2, G22, firebaseAnalytics, 6)), new mc.h(7, new dy.b(dVar2, i14)));
                        }
                    }
                    appsFlyerLib.start(bs1.c.k0(context).getApplication());
                    nx.d0.v(aVar2.f56508a, h32.f1.APP_START_ATTRIBUTED, appsFlyerLib.getAppsFlyerUID(context), false, 12);
                    int i16 = at1.d.f20439o;
                    nl.b.e().c();
                    FirebaseMessaging c14 = FirebaseMessaging.c();
                    c14.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    c14.f33735f.execute(new e5.k(23, c14, taskCompletionSource));
                    taskCompletionSource.getTask().addOnSuccessListener(new dl1.b0(i14, new i(13, appsFlyerLib, context)));
                }
                return Unit.f80348a;
            case 13:
                ((AppsFlyerLib) this.f71126j).updateServerUninstallToken(((Context) this.f71127k).getApplicationContext(), (String) obj);
                return Unit.f80348a;
            case 14:
                String c15 = ((Response) this.f71126j).f95725f.c("link");
                if (c15 != null) {
                    tk2.e.f118017c.b(new e5.k(26, c15, (qz.v) this.f71127k));
                }
                return Unit.f80348a;
            case 15:
                dl1.s sVar = (dl1.s) obj;
                u00.k kVar = (u00.k) this.f71126j;
                u00.d dVar3 = (u00.d) this.f71127k;
                Intrinsics.f(sVar);
                synchronized (kVar) {
                    List list = (List) kVar.f119856j.get(dVar3);
                    if (list != null) {
                        final u00.e eVar = new u00.e(sVar, i15);
                        list.removeIf(new Predicate() { // from class: u00.b
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj3) {
                                Function1 tmp0 = eVar;
                                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                return ((Boolean) tmp0.invoke(obj3)).booleanValue();
                            }
                        });
                        list.add(sVar);
                    }
                }
                kVar.f119858l.c(Boolean.TRUE);
                return Unit.f80348a;
            case 16:
                Boolean serviceAvailable = (Boolean) obj;
                Intrinsics.checkNotNullParameter(serviceAvailable, "serviceAvailable");
                if (!serviceAvailable.booleanValue()) {
                    return uj2.b0.j(kb.z.a());
                }
                GoogleEngageWorker googleEngageWorker = (GoogleEngageWorker) this.f71126j;
                boolean i17 = ((b60.d) googleEngageWorker.f45041i).i();
                Object obj3 = this.f71127k;
                if (i17) {
                    oc.a c16 = googleEngageWorker.f45040h.c(new s30.t());
                    d7.b.E(c16, vc.f.NetworkOnly);
                    kk2.m k13 = com.bumptech.glide.d.u0(c16).r(tk2.e.f118017c).k(new lb0.c(21, lg0.e.f83213i)).k(new lb0.c(22, new lg0.f((rd.j) obj3, i15)));
                    Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                    return k13;
                }
                oc.a c17 = googleEngageWorker.f45039g.c(new s30.i());
                d7.b.E(c17, vc.f.NetworkOnly);
                kk2.m k14 = com.bumptech.glide.d.u0(c17).r(tk2.e.f118017c).k(new lb0.c(20, new lg0.f((rd.j) obj3, i14)));
                Intrinsics.checkNotNullExpressionValue(k14, "map(...)");
                return k14;
            case 17:
                f((Throwable) obj);
                return Unit.f80348a;
            case 18:
                ((pr0.g) this.f71126j).p((RecyclerView) this.f71127k, false);
                return Unit.f80348a;
            case 19:
                DynamicFeed dynamicFeed = (DynamicFeed) obj;
                Intrinsics.checkNotNullParameter(dynamicFeed, "dynamicFeed");
                com.pinterest.feature.home.model.g gVar = (com.pinterest.feature.home.model.g) this.f71126j;
                if (gVar.a()) {
                    os0.b bVar = os0.b.f97497a;
                    new ny.b0(se.l.f112378a).i();
                }
                boolean z15 = gVar.f45794g;
                Object obj4 = this.f71127k;
                if (z15 && dl2.b.f55293b) {
                    ac2.f fVar = ac2.f.f1945a;
                    ac2.i cronetEngineOwner = ((com.pinterest.feature.home.model.j) obj4).f45809i;
                    Intrinsics.checkNotNullParameter(dynamicFeed, "dynamicFeed");
                    Intrinsics.checkNotNullParameter(cronetEngineOwner, "cronetEngineOwner");
                    vb0.j.f125466a.O("maybePreWarmVideoConnection", tb0.p.VIDEO_PLAYER);
                    List a14 = dynamicFeed.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "getItems(...)");
                    if (!a14.isEmpty()) {
                        List<dl1.s> list2 = a14;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (dl1.s sVar2 : list2) {
                                if ((sVar2 instanceof f30) && b40.X0((f30) sVar2)) {
                                    ac2.f.e(cronetEngineOwner);
                                }
                            }
                        }
                        new x4(48, 0L, ey.b0.TAG_WARM_UP_VIDEO_CONNECTION, (Runnable) new sq0.a(cronetEngineOwner, 8), false, false).c();
                    }
                } else if (dl2.b.f55294c) {
                    dl2.b.f55294c = false;
                    ((com.pinterest.feature.home.model.j) obj4).f(dynamicFeed, null);
                } else {
                    com.pinterest.feature.home.model.j jVar = (com.pinterest.feature.home.model.j) obj4;
                    qb0.e eVar2 = jVar.f45806f;
                    ConnectivityManager connectivityManager = eVar2.f103403g;
                    if (connectivityManager == null) {
                        Context context2 = kb0.a.f79058b;
                        connectivityManager = (ConnectivityManager) m60.f0.X().getSystemService("connectivity");
                        eVar2.f103403g = connectivityManager;
                    }
                    if (connectivityManager == null || !connectivityManager.isActiveNetworkMetered()) {
                        boolean z16 = ff0.j.f62103a;
                        if (gVar.a()) {
                            jVar.f(dynamicFeed, null);
                        } else {
                            jVar.f(dynamicFeed, 6);
                        }
                    }
                }
                return dynamicFeed;
            case 20:
                ni1.u0 it = (ni1.u0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ni1.u0.e(it, 0, null, null, false, null, null, ((wa2.m) this.f71126j).f128889u0, (h32.g0) this.f71127k, null, null, false, null, null, null, null, null, null, null, null, null, 2096767);
            case 21:
                return b((ek1.r) obj);
            case 22:
                return b((ek1.r) obj);
            case 23:
                yl1.b newState = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                GestaltButton gestaltButton = (GestaltButton) this.f71126j;
                yl1.b bVar2 = (yl1.b) this.f71127k;
                ps0.y yVar = GestaltButton.f49319h;
                gestaltButton.i(bVar2, newState);
                return Unit.f80348a;
            case 24:
                am1.d variant = (am1.d) obj;
                Intrinsics.checkNotNullParameter(variant, "variant");
                GestaltButtonSocial gestaltButtonSocial = (GestaltButtonSocial) this.f71126j;
                u50.i0 text = ((am1.b) this.f71127k).f15524b.getText();
                Context context3 = gestaltButtonSocial.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                CharSequence a15 = text.a(context3);
                u50.i0 serviceName = variant.getServiceName();
                Context context4 = gestaltButtonSocial.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                gestaltButtonSocial.setText(((Object) a15) + " " + ((Object) serviceName.a(context4)));
                int G0 = dl2.b.G0(gestaltButtonSocial, eo1.a.comp_buttonsocial_icon_size);
                if (variant == am1.d.EMAIL) {
                    rm1.q qVar = rm1.q.GMAIL;
                    Context context5 = gestaltButtonSocial.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    f03 = bs1.c.f0(gestaltButtonSocial, qVar.drawableRes(context5), null, null, 6);
                    f03.setTint(gestaltButtonSocial.getCurrentTextColor());
                } else {
                    f03 = variant.getServiceIcon() != null ? bs1.c.f0(gestaltButtonSocial, variant.getServiceIcon().intValue(), null, null, 6) : null;
                }
                if (f03 != null) {
                    Resources resources = gestaltButtonSocial.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    bitmapDrawable = d7.b.p0(f03, resources, G0, G0);
                } else {
                    bitmapDrawable = null;
                }
                gestaltButtonSocial.setCompoundDrawablesRelativeWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                int G02 = dl2.b.G0(gestaltButtonSocial, eo1.a.comp_buttonsocial_horizontal_padding);
                gestaltButtonSocial.setPaddingRelative(G02, 0, dl2.b.G0(gestaltButtonSocial, eo1.a.space_200) + (bitmapDrawable != null ? bitmapDrawable.getIntrinsicWidth() : 0) + G02, 0);
                return Unit.f80348a;
            case 25:
                jm1.b newState2 = (jm1.b) obj;
                Intrinsics.checkNotNullParameter(newState2, "newState");
                GestaltDivider gestaltDivider = (GestaltDivider) this.f71126j;
                jm1.b bVar3 = (jm1.b) this.f71127k;
                fm1.c cVar = GestaltDivider.f49365d;
                gestaltDivider.c(bVar3, newState2);
                return Unit.f80348a;
            case 26:
                rm1.d newState3 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(newState3, "newState");
                GestaltIcon gestaltIcon = (GestaltIcon) this.f71126j;
                rm1.d dVar4 = (rm1.d) this.f71127k;
                ps0.y yVar2 = GestaltIcon.f49400b;
                gestaltIcon.i2(dVar4, newState3);
                return Unit.f80348a;
            case 27:
                um1.b newState4 = (um1.b) obj;
                Intrinsics.checkNotNullParameter(newState4, "newState");
                GestaltIndicator gestaltIndicator = (GestaltIndicator) this.f71126j;
                um1.b bVar4 = (um1.b) this.f71127k;
                fm1.c cVar2 = GestaltIndicator.f49407b;
                gestaltIndicator.j(bVar4, newState4);
                return Unit.f80348a;
            case 28:
                rn1.a newState5 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(newState5, "newState");
                GestaltText gestaltText = (GestaltText) this.f71126j;
                rn1.a aVar3 = (rn1.a) this.f71127k;
                rn1.b bVar5 = GestaltText.f49638g;
                gestaltText.m(aVar3, newState5);
                return Unit.f80348a;
            default:
                vn1.g variant2 = (vn1.g) obj;
                Intrinsics.checkNotNullParameter(variant2, "variant");
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f71126j;
                rn1.e eVar3 = (rn1.e) this.f71127k;
                appCompatTextView.setTextAppearance(variant2.style$text_release(eVar3.r()));
                Context context6 = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                appCompatTextView.setTypeface(bs1.c.u0(context6, variant2.getFont(eVar3.r())));
                return Unit.f80348a;
        }
    }
}
