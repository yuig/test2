package tq;

import android.view.View;
import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.ads.feature.owc.presenter.showcase.ShowcaseException;
import com.pinterest.ads.feature.owc.view.collection.AdsProductView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.design.components.images.ImageStack;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.education.view.EducationToolTipView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import rq.a4;
import rr.n0;
import rr.r2;
import rr.s2;
import y90.c1;
import y90.d1;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f118860b;

    public /* synthetic */ j(Object obj, int i13) {
        this.f118859a = i13;
        this.f118860b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f30 f30Var;
        String url;
        ih ihVar;
        String deepLink;
        int i13 = this.f118859a;
        int i14 = 0;
        int i15 = 1;
        HashMap hashMap = null;
        Object obj = this.f118860b;
        switch (i13) {
            case 0:
                n this$0 = (n) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h hVar = this$0.f118912v;
                if (hVar != null) {
                    hVar.j3(this$0.b().f35051h);
                    return;
                }
                return;
            case 1:
                j0 this$02 = (j0) obj;
                int i16 = j0.A;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                b11.d.d(this$02.f118874q);
                boolean a13 = this$02.f118874q.a();
                GestaltText gestaltText = this$02.f118870m;
                GestaltText gestaltText2 = this$02.f118864g;
                if (!a13) {
                    this$02.f118861d.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLOSEUP_PDP_METADATA_COLLAPSE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    gestaltText2.i(g.f118847u);
                    pk.a0.w1(gestaltText);
                    return;
                }
                f30 pin = this$02.getPin();
                if (pin != null) {
                    String c43 = pin.c4();
                    if (c43 == null) {
                        c43 = pin.N3();
                    }
                    Pair[] pairArr = new Pair[2];
                    String str = this$02.f118830c;
                    pairArr[0] = new Pair("pin_closeup_title_length", String.valueOf(str != null ? Integer.valueOf(str.length()) : null));
                    pairArr[1] = new Pair("pin_closeup_description_length", String.valueOf(c43 != null ? Integer.valueOf(c43.length()) : null));
                    hashMap = bs1.c.o(pairArr);
                }
                this$02.f118861d.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLOSEUP_PDP_METADATA_EXPAND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                gestaltText2.i(g.f118846t);
                Intrinsics.checkNotNullParameter(gestaltText, "<this>");
                gestaltText.i(rn1.j.f108883j);
                return;
            case 2:
                k0 this$03 = (k0) obj;
                int i17 = k0.f118886h;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.getClass();
                HashMap<String, String> hashMap2 = new HashMap<>();
                nx.d0 viewPinalytics = this$03.getViewPinalytics();
                if (viewPinalytics != null) {
                    f1 f1Var = f1.TAP;
                    h32.g0 g0Var = h32.g0.PIN_CLOSEUP_PRODUCT_TITLE;
                    this$03.getPinAuxHelper().e(this$03.getPin(), hashMap2, new nx.q());
                    Unit unit = Unit.f80348a;
                    nx.d0.B(viewPinalytics, f1Var, g0Var, null, hashMap2, 20);
                }
                f30 pin2 = this$03.getPin();
                this$03.handleWebsiteClicked(pin2 != null ? com.bumptech.glide.c.D(pin2) : null, Boolean.FALSE, hashMap2);
                return;
            case 3:
                vq.c this$04 = (vq.c) obj;
                int i18 = vq.c.f126398p0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                lp.a aVar = this$04.f126404k0;
                if (aVar == null) {
                    Intrinsics.r("adapter");
                    throw null;
                }
                List list = (List) aVar.f84205f;
                if (list == null) {
                    list = q0.f80391a;
                }
                boolean z13 = !list.isEmpty();
                xj2.b bVar = this$04.f126405l0;
                if (z13) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((z40.d0) it.next()).a());
                    }
                    k22.m mVar = this$04.f126406m0;
                    if (mVar == null) {
                        Intrinsics.r("userService");
                        throw null;
                    }
                    String Z = CollectionsKt.Z(arrayList, ",", null, null, 0, null, null, 62);
                    String str2 = this$04.f126402i0;
                    if (str2 == null) {
                        Intrinsics.r("blockSource");
                        throw null;
                    }
                    String str3 = this$04.f126400g0;
                    if (str3 == null) {
                        Intrinsics.r("conversationId");
                        throw null;
                    }
                    bVar.a(mVar.y(Z, str2, str3).l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.b(8), new a4(20, vq.a.f126396i)));
                }
                no1.d dVar = this$04.f126407n0;
                if (dVar == null) {
                    Intrinsics.r("contactRequestRemoteDataSource");
                    throw null;
                }
                String str4 = this$04.f126399f0;
                if (str4 == null) {
                    Intrinsics.r("contactRequestId");
                    throw null;
                }
                String str5 = this$04.f126401h0;
                if (str5 != null) {
                    bVar.a(dVar.c(str4, str5, new vq.b(this$04)));
                    return;
                } else {
                    Intrinsics.r("reportReason");
                    throw null;
                }
            case 4:
                vq.e this$05 = (vq.e) obj;
                int i19 = vq.e.f126409f0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                lp.a aVar2 = this$05.f126411d0;
                if (aVar2 == null) {
                    Intrinsics.r("adapter");
                    throw null;
                }
                List list2 = (List) aVar2.f84205f;
                List list3 = list2;
                if (list3 == null || list3.isEmpty()) {
                    this$05.N6(false, false);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((z40.d0) it2.next()).a());
                }
                Intrinsics.r("userService");
                throw null;
            case 5:
                cr.b this$06 = (cr.b) obj;
                int i23 = cr.b.f53064g;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.a();
                return;
            case 6:
                s2 this$07 = (s2) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                new kk2.h(new kk2.g(this$07.f109853g.a().r(tk2.e.f118017c).l(wj2.c.a()), new n0(5, rr.k.f109767w), 2), new xo.b(12), 0).o(new n0(6, new r2(this$07, i14)), new n0(7, new r2(this$07, i15)));
                return;
            case 7:
                SbaAdsLeadGenExpandView this$08 = (SbaAdsLeadGenExpandView) obj;
                int i24 = SbaAdsLeadGenExpandView.f35271w;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                u50.r rVar = this$08.f35285n;
                if (rVar != null) {
                    rVar.a(new nt.a0(this$08.f35283l));
                    return;
                } else {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
            case 8:
                cu.i this$09 = (cu.i) obj;
                int i25 = cu.i.f53198p;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                this$09.o();
                return;
            case 9:
                AdsProductView adsProductView = (AdsProductView) obj;
                rl2.u[] uVarArr = AdsProductView.f35340s;
                m60.w wVar = adsProductView.f35341d;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar.d(new eu.y(adsProductView.f35352o, adsProductView.i()));
                wVar.d(new eu.u(adsProductView.i(), adsProductView.f35355r, false));
                return;
            case 10:
                lu.f this$010 = (lu.f) obj;
                int i26 = lu.f.M;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.getClass();
                return;
            case 11:
                lu.k this$011 = (lu.k) obj;
                int i27 = lu.k.Y0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                this$011.d5();
                return;
            case 12:
                lu.y this$012 = (lu.y) obj;
                int i28 = lu.y.I0;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                fu.c cVar = this$012.f35327n0;
                if (cVar != null) {
                    cVar.d5();
                    return;
                }
                return;
            case 13:
                vu.k this$013 = (vu.k) obj;
                int i29 = vu.k.P0;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                nx.d0 d0Var = this$013.E0;
                if (d0Var == null) {
                    Intrinsics.r("analytics");
                    throw null;
                }
                d0Var.b0(u0.VIRTUAL_TRY_ON_ICON, h32.g0.PIN_CLOSEUP_GALLERY, this$013.Y0().getUid(), false);
                vu.h hVar2 = this$013.J0;
                if (hVar2 != null) {
                    String pinId = this$013.Y0().getUid();
                    Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
                    Intrinsics.checkNotNullParameter(pinId, "pinId");
                    vu.i iVar = hVar2.f126650a;
                    c91.e eVar = iVar.S0;
                    if (eVar != null) {
                        eVar.a(iVar.E4(), iVar.s7()).a(new zp.j0(17, iVar, pinId), pinId, c91.a.f26973a);
                        return;
                    } else {
                        Intrinsics.r("onDemandModuleControllerFactory");
                        throw null;
                    }
                }
                return;
            case 14:
                zu.f this$014 = (zu.f) obj;
                int i33 = zu.f.f142796k;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                au.b bVar2 = this$014.f142806j;
                if (bVar2 == null || (f30Var = bVar2.f20467b) == null || (url = com.bumptech.glide.c.D(f30Var)) == null) {
                    return;
                }
                xt.f fVar = bVar2.f20466a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                fVar.f135871n = xt.d.SUBPIN;
                fVar.f135875r.c(new xt.g(url));
                if (fVar.f135874q) {
                    return;
                }
                fVar.f135874q = true;
                fVar.f135873p = System.currentTimeMillis() * 1000000;
                int i34 = xt.e.f135857a[fVar.f135871n.ordinal()];
                if (i34 == 1) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.q(new ShowcaseException(), "Attempting to clickthrough without a ClickthroughSource defined!", tb0.p.SHOWCASE_ADS);
                    return;
                }
                if (i34 == 2) {
                    f30 f30Var2 = fVar.f135861d;
                    fVar.f135872o = f30Var2;
                    if (f30Var2 != null) {
                        fVar.f135858a.H(f1.SHOWCASE_PIN_CLICKTHROUGH, f30Var2.getUid(), null, null, null, false);
                        return;
                    }
                    return;
                }
                if (i34 != 3) {
                    if (i34 != 4) {
                        return;
                    }
                    fVar.f135872o = f30Var;
                    fVar.f135858a.H(f1.SHOWCASE_SUBPIN_CLICKTHROUGH, f30Var.getUid(), xt.f.a(fVar.f135861d, fVar.f135860c, f30Var), null, null, false);
                    return;
                }
                f30 f30Var3 = fVar.f135860c;
                fVar.f135872o = f30Var3;
                if (f30Var3 != null) {
                    fVar.f135858a.H(f1.SHOWCASE_SUBPAGE_CLICKTHROUGH, f30Var3.getUid(), xt.f.a(fVar.f135861d, fVar.f135860c, null), null, null, false);
                    return;
                }
                return;
            case 15:
                gx.m this$015 = (gx.m) obj;
                int i35 = gx.m.f66260l;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                u50.r rVar2 = this$015.f66267g;
                if (rVar2 != null) {
                    rVar2.a(gx.b.f66243a);
                    return;
                }
                return;
            case 16:
                g60.f this$016 = (g60.f) obj;
                int i36 = g60.f.f63707c;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                u50.r rVar3 = this$016.f63709b;
                if (rVar3 != null) {
                    rVar3.a(g60.b.f63697a);
                    return;
                } else {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
            case 17:
                n70.w this$017 = (n70.w) obj;
                int i37 = n70.w.f89690k1;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.P7();
                this$017.k9().f89683i.e().a(n70.e.f89606a);
                return;
            case 18:
                k90.c this$018 = (k90.c) obj;
                int i38 = k90.c.f78723v1;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                this$018.E9();
                return;
            case 19:
                d1 this$019 = (d1) obj;
                int i39 = c1.f138140u;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                y90.x xVar = this$019.f138167e;
                return;
            case 20:
                ModalContainer this$020 = (ModalContainer) obj;
                jc0.p pVar = ModalContainer.f44758l;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                if (this$020.i()) {
                    a.c.y(m60.u.f85943a);
                    return;
                }
                return;
            case 21:
                xe0.d item = (xe0.d) obj;
                int i43 = ImageStack.f44923j;
                Intrinsics.checkNotNullParameter(item, "$item");
                ((xe0.c) item).f134664c.invoke();
                return;
            case 22:
                xe0.b item2 = (xe0.b) obj;
                int i44 = ImageStack.f44923j;
                Intrinsics.checkNotNullParameter(item2, "$item");
                item2.f134661j.invoke();
                return;
            case 23:
                EducationNewContainerView this$021 = (EducationNewContainerView) obj;
                HashSet hashSet2 = EducationNewContainerView.A;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.j(null);
                return;
            case 24:
                EducationToolTipView this$022 = (EducationToolTipView) obj;
                int i45 = EducationToolTipView.f45022m;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                this$022.b();
                return;
            case 25:
                ah0.d this$023 = (ah0.d) obj;
                int i46 = ah0.d.f15176o;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                zg0.a aVar3 = this$023.f15186j;
                if (aVar3 != null) {
                    rg0.n nVar = aVar3.f141953b;
                    if (nVar != null) {
                        nVar.a(null, null);
                    }
                    vh vhVar = aVar3.f141952a;
                    if (vhVar == null || (ihVar = vhVar.f42857o) == null || (deepLink = ihVar.e()) == null) {
                        return;
                    }
                    ah0.d dVar2 = (ah0.d) ((yg0.a) aVar3.getView());
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                    a11.n nVar2 = dVar2.f15189m;
                    ek2.j e13 = nVar2 != null ? a11.e.e(nVar2, deepLink, null, 6) : null;
                    if (e13 != null) {
                        aVar3.addDisposable(e13);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ki0.c this$024 = (ki0.c) obj;
                int i47 = ki0.c.f79783s0;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.P7();
                return;
            case 27:
                ui0.e this$025 = (ui0.e) obj;
                int i48 = ui0.e.O0;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                rg0.n nVar3 = this$025.J0;
                if (nVar3 != null) {
                    if (nVar3.f108060b == i32.l.ANDROID_EASY_GIFT_GUIDE_SAVING_UPSELL.value()) {
                        this$025.f7().d(h11.b.f66452a);
                    }
                }
                rg0.n nVar4 = this$025.J0;
                if (nVar4 != null) {
                    nVar4.c(null, null);
                }
                this$025.J0 = null;
                this$025.X8();
                ca2.e.i(this$025.W8(), "navigation", hf0.b.f69003c - this$025.W8().g(), null, 4);
                return;
            case 28:
                xi0.f this$026 = (xi0.f) obj;
                int i49 = xi0.f.f135010l;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                wi0.b bVar3 = this$026.f135011h;
                if (bVar3 != null) {
                    bVar3.q3();
                    return;
                }
                return;
            default:
                bj0.g this$027 = (bj0.g) obj;
                int i53 = bj0.g.f22953e;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                aj0.b bVar4 = this$027.f22954a;
                if (bVar4 != null) {
                    bVar4.p3();
                    return;
                }
                return;
        }
    }
}
