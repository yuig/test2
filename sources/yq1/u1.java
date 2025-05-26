package yq1;

import android.content.Intent;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hx;
import com.pinterest.api.model.o4;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.identity.password.StrongPasswordTextField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes4.dex */
public final class u1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140045i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f140046j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Object obj, int i13) {
        super(1);
        this.f140045i = i13;
        this.f140046j = obj;
    }

    public final en1.d b(en1.d state) {
        kg.p d0Var;
        int i13 = this.f140045i;
        Object obj = this.f140046j;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(state, "state");
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    d0Var = en1.e0.f59666a;
                } else {
                    ArrayList arrayList = new ArrayList(iArr.length);
                    for (int i14 : iArr) {
                        arrayList.add(new u50.f(i14));
                    }
                    d0Var = new en1.d0(arrayList, new u50.e(eo1.a.comp_text_color_dark));
                }
                return en1.d.e(state, null, null, null, false, null, d0Var, false, 0, 447);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                return en1.d.e(state, null, null, null, false, (en1.b0) obj, null, false, 0, 479);
        }
    }

    public final yl1.b e(yl1.b it) {
        int i13 = this.f140045i;
        Object obj = this.f140046j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, ((vr1.b) obj).f126458b, null, null, null, null, null, null, 0, null, 1021);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], ((eu1.b) obj).f60181c), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    public final void f(int i13) {
        ViewGroup viewGroup;
        int i14 = this.f140045i;
        Object obj = this.f140046j;
        switch (i14) {
            case 10:
                jc0.n nVar = (jc0.n) obj;
                ViewGroup viewGroup2 = nVar.f44753e;
                float elevation = viewGroup2 != null ? viewGroup2.getElevation() : 0.0f;
                if (i13 == 0 && elevation > 0.0f) {
                    ViewGroup viewGroup3 = nVar.f44753e;
                    if (viewGroup3 != null) {
                        viewGroup3.setElevation(0.0f);
                        break;
                    }
                } else if (i13 != 0 && elevation == 0.0f && (viewGroup = nVar.f44753e) != null) {
                    viewGroup.setElevation(5.0f);
                    break;
                }
                break;
            case 18:
                ((xv1.e) obj).f136040f = i13;
                break;
            default:
                a.c.y(((gw1.f) obj).f66227b);
                break;
        }
    }

    public final void h(Throwable th3) {
        int i13 = this.f140045i;
        Object obj = this.f140046j;
        switch (i13) {
            case 3:
                com.pinterest.identity.authentication.a aVar = ((zq1.y) obj).f142741b;
                Intrinsics.f(th3);
                aVar.a(false, th3);
                break;
            case 8:
                tb0.h hVar = ((is1.l) obj).f73621b;
                String message = th3.getMessage();
                if (message == null) {
                    message = "";
                }
                hVar.o(message, th3);
                break;
            default:
                ((fw1.i) ((fw1.c) ((fw1.d) obj).getView())).C(fw1.e.ERROR);
                break;
        }
    }

    public final void i(l82.n buildAndStart) {
        int i13 = this.f140045i;
        Object obj = this.f140046j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                l82.n.b(buildAndStart, (du1.a) obj);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                gu1.p pVar = (gu1.p) obj;
                du1.a aVar = pVar.f66152c;
                buildAndStart.a(aVar, new rb1.w(22), aVar.a());
                hu1.j jVar = pVar.f66153d;
                buildAndStart.a(jVar, new rb1.w(21), jVar.a());
                break;
            case 15:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                iu1.u uVar = (iu1.u) obj;
                du1.a aVar2 = uVar.f73719c;
                buildAndStart.a(aVar2, new rb1.w(23), aVar2.a());
                l82.n.b(buildAndStart, uVar.f73720d);
                break;
            case 25:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                hw1.v vVar = (hw1.v) obj;
                l82.n.b(buildAndStart, vVar.f70493c);
                ws.q qVar = vVar.f70494d;
                buildAndStart.a(qVar, new rb1.w(24), qVar.a());
                break;
            case 27:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                rw1.h hVar = (rw1.h) obj;
                l82.n.b(buildAndStart, hVar.f110119c);
                sw1.b bVar = hVar.f110120d;
                buildAndStart.a(bVar, new rb1.w(25), bVar.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                bx1.s sVar = (bx1.s) obj;
                l82.n.b(buildAndStart, sVar.f24116c);
                sw1.b bVar2 = sVar.f24117d;
                buildAndStart.a(bVar2, new rb1.w(26), bVar2.a());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List y53;
        uo0 uo0Var;
        vv1.h hVar;
        long j13;
        Long l13;
        int i13 = this.f140045i;
        ?? items = 0;
        px.h hVar2 = null;
        Object obj2 = this.f140046j;
        switch (i13) {
            case 0:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                v1 v1Var = (v1) obj2;
                String str = v1Var.C0;
                if (str == null) {
                    Intrinsics.r("emailTypoSuggestion");
                    throw null;
                }
                u50.f0 x13 = ep.b.x(str, "string", str);
                String str2 = v1Var.C0;
                if (str2 != null) {
                    return ao1.b.e(it, x13, null, null, null, null, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(str2.length()), null, null, null, null, 0, 4161534);
                }
                Intrinsics.r("emailTypoSuggestion");
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter((xl1.a) obj, "it");
                h2 h2Var = (h2) obj2;
                StrongPasswordTextField strongPasswordTextField = h2Var.f139914t0;
                if (strongPasswordTextField == null) {
                    Intrinsics.r("strongPasswordField");
                    throw null;
                }
                vr1.b i14 = strongPasswordTextField.i();
                lh0.y1 y1Var = h2Var.f139906l0;
                if (y1Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 activate = a4.f83298b;
                Intrinsics.checkNotNullParameter("enabled_remote", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                if (((lh0.g1) y1Var.f83514a).o("android_strong_password", "enabled_remote", activate)) {
                    androidx.lifecycle.z viewLifecycleOwner = h2Var.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new g2(h2Var, i14, null), 3);
                } else {
                    ar1.a aVar = h2Var.f139907m0;
                    if (aVar != null) {
                        aVar.I0(i14.f126457a, ar1.d.PASSWORD_STEP);
                    }
                }
                return Unit.f80348a;
            case 2:
                return e((yl1.b) obj);
            case 3:
                h((Throwable) obj);
                return Unit.f80348a;
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                Intent intent = ((qr1.b) obj2).f104976c;
                if (intent == null) {
                    return LineLoginResult.b("Callback intent is null");
                }
                int i15 = LineAuthenticationActivity.f34082d;
                LineLoginResult lineLoginResult = (LineLoginResult) intent.getParcelableExtra("authentication_result");
                return lineLoginResult == null ? LineLoginResult.b("Authentication result is not found.") : lineLoginResult;
            case 5:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return ((rr1.g) obj2).e(it2);
            case 6:
                xn1.j event = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.i) {
                    StrongPasswordTextField strongPasswordTextField2 = (StrongPasswordTextField) obj2;
                    String password = ((xn1.i) event).f135454c;
                    vr1.f fVar = StrongPasswordTextField.f49845m;
                    strongPasswordTextField2.getClass();
                    boolean j14 = kotlin.text.z.j(password);
                    int i16 = j14 ^ true ? 0 : 8;
                    LinearProgressIndicator linearProgressIndicator = strongPasswordTextField2.f49852i;
                    linearProgressIndicator.setVisibility(i16);
                    GestaltButton gestaltButton = strongPasswordTextField2.f49854k;
                    GestaltText gestaltText = strongPasswordTextField2.f49853j;
                    if (j14) {
                        pk.a0.k0(gestaltText);
                        pk.a0.l0(gestaltButton);
                    } else {
                        pk.a0.w1(gestaltText);
                        pk.a0.v1(gestaltButton);
                    }
                    rr1.g gVar = strongPasswordTextField2.f49847d;
                    if (gVar == null) {
                        Intrinsics.r("passwordValidationUtils");
                        throw null;
                    }
                    rr1.a e13 = gVar.e(password);
                    if (strongPasswordTextField2.f49847d == null) {
                        Intrinsics.r("passwordValidationUtils");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(password, "password");
                    Intrinsics.checkNotNullParameter(password, "password");
                    int i17 = password.length() >= 8 ? e13.f109934a : 0;
                    vr1.d dVar = (vr1.d) strongPasswordTextField2.f49855l.get(Integer.valueOf(i17));
                    if (dVar == null) {
                        dVar = StrongPasswordTextField.f49846n;
                    }
                    linearProgressIndicator.setProgress(i17 + 1, true);
                    linearProgressIndicator.e(bs1.c.B(strongPasswordTextField2, dVar.f126460a));
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    pk.a0.q(gestaltText, new u50.k0(dVar.f126461b, new ArrayList(0)));
                    vr1.c cVar = strongPasswordTextField2.f49850g;
                    if (cVar != null) {
                        rr1.g gVar2 = strongPasswordTextField2.f49847d;
                        if (gVar2 == null) {
                            Intrinsics.r("passwordValidationUtils");
                            throw null;
                        }
                        boolean c13 = gVar2.c(password, true);
                        rr1.g gVar3 = strongPasswordTextField2.f49847d;
                        if (gVar3 == null) {
                            Intrinsics.r("passwordValidationUtils");
                            throw null;
                        }
                        cVar.m(new vr1.b(password, c13, gVar3.e(password)));
                    }
                }
                return Unit.f80348a;
            case 7:
                wr1.q it3 = (wr1.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                se0.f fVar2 = se0.f.LOADED;
                String z43 = ((wr1.a1) obj2).f130939b.z4();
                if (z43 == null) {
                    z43 = "";
                }
                return wr1.q.e(it3, fVar2, new wr1.o(z43), null, null, null, 28);
            case 8:
                h((Throwable) obj);
                return Unit.f80348a;
            case 9:
                f30 f30Var = (f30) obj;
                Intrinsics.f(f30Var);
                if (b40.Q0(f30Var)) {
                    Integer num = (Integer) ((ed1.f) obj2).f58577d;
                    if (num != null) {
                        int intValue = num.intValue();
                        dl0 v63 = f30Var.v6();
                        if (v63 != null) {
                            Intrinsics.checkNotNullParameter(v63, "<this>");
                            List s13 = v63.s();
                            if (s13 == null) {
                                s13 = v63.t();
                            }
                            if (s13 == null) {
                                s13 = kotlin.collections.q0.f80391a;
                            }
                            if (s13 != null && (uo0Var = (uo0) s13.get(intValue)) != null) {
                                y53 = uo0Var.s();
                            }
                        }
                    }
                    y53 = null;
                } else {
                    y53 = f30Var.y5();
                }
                if (y53 != null) {
                    List<hx> list = y53;
                    items = new ArrayList(kotlin.collections.g0.q(list, 10));
                    for (hx hxVar : list) {
                        String g13 = hxVar.g();
                        Intrinsics.checkNotNullExpressionValue(g13, "getArtist(...)");
                        String l14 = hxVar.l();
                        Intrinsics.checkNotNullExpressionValue(l14, "getTitle(...)");
                        items.add(new au1.a(g13, l14, hxVar.k()));
                    }
                }
                if (items == 0) {
                    items = kotlin.collections.q0.f80391a;
                }
                if (items.isEmpty()) {
                    ((zt1.g) ((yt1.a) ((ed1.f) obj2).getView())).f142779a.getClass();
                    a.c.y(m60.u.f85943a);
                } else {
                    zt1.g gVar4 = (zt1.g) ((yt1.a) ((ed1.f) obj2).getView());
                    gVar4.getClass();
                    Intrinsics.checkNotNullParameter(items, "items");
                    zt1.b bVar = gVar4.f142782d;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(items, "items");
                    ArrayList arrayList = bVar.f142769d;
                    arrayList.clear();
                    arrayList.addAll((Collection) items);
                    bVar.h();
                }
                return Unit.f80348a;
            case 10:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 11:
                ts1.b withNavigationControllerOnMain = (ts1.b) obj;
                Intrinsics.checkNotNullParameter(withNavigationControllerOnMain, "$this$withNavigationControllerOnMain");
                ts1.b.a(withNavigationControllerOnMain, ((du1.b) obj2).f56277a);
                return Unit.f80348a;
            case 12:
                return e((yl1.b) obj);
            case 13:
                i((l82.n) obj);
                return Unit.f80348a;
            case 14:
                i((l82.n) obj);
                return Unit.f80348a;
            case 15:
                i((l82.n) obj);
                return Unit.f80348a;
            case 16:
                wy0 wy0Var = (wy0) obj;
                Intrinsics.f(wy0Var);
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = ru1.i.f110045x;
                kh2.m0.V0(((ru1.i) obj2).f110064t, wy0Var);
                return Unit.f80348a;
            case 17:
                bm1.t event2 = (bm1.t) obj;
                Intrinsics.checkNotNullParameter(event2, "event");
                if (event2 instanceof bm1.r) {
                    vv1.h hVar3 = ((uv1.e) obj2).f123193a;
                    if (hVar3 != null) {
                        hVar3.R1(true);
                    }
                } else if ((event2 instanceof bm1.s) && (hVar = ((uv1.e) obj2).f123193a) != null) {
                    hVar.R1(false);
                }
                return Unit.f80348a;
            case 18:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 19:
                return b((en1.d) obj);
            case 20:
                return b((en1.d) obj);
            case 21:
                en1.k0 bind = (en1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                en1.a0 startItem = (en1.a0) obj2;
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind.f59684f = startItem;
                return Unit.f80348a;
            case 22:
                h((Throwable) obj);
                return Unit.f80348a;
            case 23:
                rn1.a it4 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                f0.h x14 = kh2.m0.x(ww1.a.NUMBER);
                px.i iVar = ((gw1.g) ((gw1.a) obj2)).f66229b;
                Iterator it5 = iVar.f101571b.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        ?? next = it5.next();
                        if (Intrinsics.d(((px.h) next).f101562a, "all")) {
                            hVar2 = next;
                        }
                    }
                }
                px.h hVar4 = hVar2;
                if (hVar4 == null || (l13 = hVar4.f101563b) == null) {
                    Iterator it6 = iVar.f101571b.iterator();
                    long j15 = 0;
                    while (it6.hasNext()) {
                        Long l15 = ((px.h) it6.next()).f101563b;
                        j15 += l15 != null ? l15.longValue() : 0L;
                    }
                    j13 = j15;
                } else {
                    j13 = l13.longValue();
                }
                String G = x14.G(j13);
                Intrinsics.checkNotNullExpressionValue(G, "getFormattedValue(...)");
                return rn1.a.y(it4, bs1.c.h2(G), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 24:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 25:
                i((l82.n) obj);
                return Unit.f80348a;
            case 26:
                o4 analyticsMetrics = (o4) obj;
                Intrinsics.checkNotNullParameter(analyticsMetrics, "analyticsMetrics");
                nw1.e eVar = (nw1.e) obj2;
                int i18 = nw1.e.f92370s;
                tw1.a aVar2 = new tw1.a(analyticsMetrics, eVar.f97963d, 0);
                Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
                eVar.f97966g = aVar2;
                eVar.v3(analyticsMetrics);
                zx.l filter = eVar.f97962c.c().c();
                Intrinsics.checkNotNullParameter(filter, "filter");
                ArrayList metrics = kotlin.collections.f0.l(ww1.c.IMPRESSION, ww1.c.ENGAGEMENT, ww1.c.TOTAL_AUDIENCE, ww1.c.ENGAGERS, ww1.c.PIN_CLICK, ww1.c.OUTBOUND_CLICK, ww1.c.SAVE, ww1.c.ENGAGEMENT_RATE, ww1.c.PIN_CLICK_RATE, ww1.c.OUTBOUND_CLICK_RATE, ww1.c.SAVE_RATE);
                if (dn.c.n(filter)) {
                    metrics.addAll(kotlin.collections.f0.j(ww1.c.VIDEO_MRC_VIEW, ww1.c.VIDEO_AVG_WATCH_TIME, ww1.c.VIDEO_V50_WATCH_TIME, ww1.c.QUARTILE_95_PERCENT_VIEW, ww1.c.VIDEO_10S_VIEW));
                }
                ow1.g gVar5 = (ow1.g) ((uw1.b) eVar.getView());
                gVar5.getClass();
                Intrinsics.checkNotNullParameter(metrics, "metrics");
                gVar5.f97950s0 = metrics;
                gVar5.o8(gVar5.g8());
                return Unit.f80348a;
            case 27:
                i((l82.n) obj);
                return Unit.f80348a;
            case 28:
                ww1.c it7 = (ww1.c) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                int i19 = ax1.e.f20647h0;
                ((ax1.e) obj2).Y7().f24120g.e().a(new bx1.i(it7.name()));
                return Unit.f80348a;
            default:
                i((l82.n) obj);
                return Unit.f80348a;
        }
    }
}
