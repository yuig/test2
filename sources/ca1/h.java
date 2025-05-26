package ca1;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import androidx.recyclerview.widget.b2;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.feature.sharesheet.view.PostIdeaPinCreateShareUpsellHeader;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.f4;
import ed1.y;
import ed1.z;
import fd1.h0;
import fd1.i0;
import fd1.t0;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.v0;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import nx.d0;
import org.greenrobot.eventbus.EventBusException;
import rc0.z0;
import re1.x;
import rf1.p0;
import sf1.c1;
import sf1.e1;
import sf1.j1;
import sf1.k1;
import sf1.u1;
import va1.m1;
import we1.c2;
import x02.a2;
import y01.l1;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27201b;

    public /* synthetic */ h(Object obj, int i13) {
        this.f27200a = i13;
        this.f27201b = obj;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        cd1.e eVar;
        Object adapter;
        v0 v0Var;
        com.pinterest.feature.todaytab.articlefeed.g gVar;
        int i13 = this.f27200a;
        int i14 = 1;
        Object obj = this.f27201b;
        switch (i13) {
            case 0:
                o this$0 = (o) obj;
                int i15 = o.f27214k0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    kh2.j.x2((v) this$0.f27215c0.getValue(), c.f27196a);
                    this$0.D5();
                    return;
                }
                return;
            case 1:
                la1.h this$02 = (la1.h) obj;
                int i16 = la1.h.f82521f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    this$02.f82522a.invoke();
                    return;
                }
                return;
            case 2:
                la1.l this$03 = (la1.l) obj;
                int i17 = la1.l.f82535e;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                m60.w wVar = this$03.f82539d;
                if (wVar != null) {
                    a.c.y(wVar);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 3:
                mb1.b this$04 = (mb1.b) obj;
                int i18 = mb1.b.f86866e0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$04.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$04.f7().d(Navigation.w1(f4.a()));
                return;
            case 4:
                nb1.b this$05 = (nb1.b) obj;
                int i19 = nb1.b.f90340e0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$05.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.DONE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$05.z(new l1(i14, Navigation.w1(f4.b())));
                this$05.f7().d(new p91.k(bd1.b.IS_PARENTAL_CONTROL_PASSCODE_VERIFICATION_PENDING, "true"));
                return;
            case 5:
                sb1.l this$06 = (sb1.l) obj;
                int i23 = sb1.l.f112255j0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((sb1.t) this$06.f112258e0.getValue()).f112273g.e().a(sb1.c.f112241a);
                return;
            case 6:
                tb1.j this$07 = (tb1.j) obj;
                int i24 = tb1.j.f117156u0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$07.s7().X(u0.EXTERNAL_LINK);
                return;
            case 7:
                wb1.o this$08 = (wb1.o) obj;
                int i25 = wb1.o.f129043c;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof an1.p) {
                    this$08.a().t(new z0(4, it));
                    this$08.f129044a.invoke(Integer.valueOf(((an1.p) it).f15758c));
                    return;
                }
                return;
            case 8:
                hc1.n this$09 = (hc1.n) obj;
                int i26 = hc1.n.O0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                jc1.g gVar2 = this$09.I0;
                if (gVar2 != null) {
                    gVar2.u3();
                    return;
                }
                return;
            case 9:
                lc1.i this$010 = (lc1.i) obj;
                int i27 = lc1.i.f82876g;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.a) {
                    xn1.a aVar = (xn1.a) it;
                    this$010.f82881e = String.valueOf(aVar.f135436c);
                    if (this$010.f82879c == null) {
                        Intrinsics.r("previousValue");
                        throw null;
                    }
                    if (!Intrinsics.d(r2, r3)) {
                        bd1.b bVar = this$010.f82880d;
                        if (bVar == null) {
                            Intrinsics.r("apiFieldName");
                            throw null;
                        }
                        String str = this$010.f82881e;
                        if (str == null) {
                            Intrinsics.r("updatedValue");
                            throw null;
                        }
                        this$010.f82882f.c(new yc1.c(bVar, str));
                    } else {
                        String str2 = this$010.f82881e;
                        if (str2 == null) {
                            Intrinsics.r("updatedValue");
                            throw null;
                        }
                        String str3 = this$010.f82879c;
                        if (str3 == null) {
                            Intrinsics.r("previousValue");
                            throw null;
                        }
                        if (Intrinsics.d(str2, str3)) {
                            bd1.b fieldName = this$010.f82880d;
                            if (fieldName == null) {
                                Intrinsics.r("apiFieldName");
                                throw null;
                            }
                            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
                            this$010.f82877a.invoke(new yc1.b(fieldName));
                        }
                    }
                    bd1.b bVar2 = this$010.f82880d;
                    if (bVar2 == null) {
                        Intrinsics.r("apiFieldName");
                        throw null;
                    }
                    Editable editable = aVar.f135436c;
                    r5 = (editable == null || editable.length() == 0) ? 1 : 0;
                    int dimensionPixelOffset = this$010.getResources().getDimensionPixelOffset(r0.margin_half);
                    int dimensionPixelOffset2 = this$010.getResources().getDimensionPixelOffset(r0.margin);
                    bd1.b bVar3 = bd1.b.FIRSTNAME_FIELD;
                    GestaltTextField gestaltTextField = this$010.f82878b;
                    if ((bVar3 == bVar2 || bd1.b.BUSINESS_NAME_FIELD == bVar2) && r5 != 0) {
                        gestaltTextField.X(lc1.g.f82865k);
                        gestaltTextField.setPaddingRelative(gestaltTextField.getPaddingStart(), gestaltTextField.getPaddingTop(), gestaltTextField.getPaddingEnd(), dimensionPixelOffset);
                        return;
                    } else if (bd1.b.USERNAME_FIELD != bVar2 || r5 == 0) {
                        gestaltTextField.X(lc1.g.f82867m);
                        gestaltTextField.setPaddingRelative(gestaltTextField.getPaddingStart(), gestaltTextField.getPaddingTop(), gestaltTextField.getPaddingEnd(), dimensionPixelOffset2);
                        return;
                    } else {
                        gestaltTextField.X(lc1.g.f82866l);
                        gestaltTextField.setPaddingRelative(gestaltTextField.getPaddingStart(), gestaltTextField.getPaddingTop(), gestaltTextField.getPaddingEnd(), dimensionPixelOffset);
                        return;
                    }
                }
                return;
            case 10:
                lc1.l this$011 = (lc1.l) obj;
                int i28 = lc1.l.f82889f;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.a) {
                    String valueOf = String.valueOf(((xn1.a) it).f135436c);
                    this$011.getClass();
                    boolean z13 = !Intrinsics.d(valueOf, kh2.r.f79662c);
                    this$011.f82893d = z13;
                    jc1.g gVar3 = this$011.f82890a;
                    if (z13 && (z13 || this$011.f82894e)) {
                        Intrinsics.checkNotNullParameter(valueOf, "<set-?>");
                        kh2.r.f79663d = valueOf;
                        if (gVar3 != null) {
                            gVar3.w3(new yc1.c(bd1.b.CONTACT_PHONE_FIELD, valueOf));
                            return;
                        }
                        return;
                    }
                    if (!Intrinsics.d(valueOf, kh2.r.f79662c) || this$011.f82893d || this$011.f82894e || gVar3 == null) {
                        return;
                    }
                    gVar3.w3(new yc1.b(bd1.b.CONTACT_PHONE_FIELD));
                    return;
                }
                return;
            case 11:
                lc1.o this$012 = (lc1.o) obj;
                int i29 = lc1.o.f82898c;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((Function0) this$012.f82900b).invoke();
                return;
            case 12:
                sc1.b this$013 = (sc1.b) obj;
                int i33 = sc1.b.f112293p0;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                d0.B(this$013.s7(), f1.CLICK, g0.REQUEST_DATA_UI, null, null, 28);
                rc1.a aVar2 = this$013.f112297m0;
                if (aVar2 != null) {
                    aVar2.p3();
                    return;
                }
                return;
            case 13:
                SettingsToggleItemView this$014 = (SettingsToggleItemView) obj;
                int i34 = SettingsToggleItemView.f48364h;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                boolean z14 = it instanceof on1.g;
                m1 m1Var = this$014.f48370f;
                if (m1Var != null) {
                    m1Var.f125210e = z14;
                    kl2.l lVar = this$014.f48365a;
                    if (lVar != null) {
                        lVar.invoke(m1Var, Boolean.valueOf(z14), this$014.f48369e);
                    }
                }
                this$014.b();
                return;
            case 14:
                PostIdeaPinCreateShareUpsellHeader this$015 = (PostIdeaPinCreateShareUpsellHeader) obj;
                int i35 = PostIdeaPinCreateShareUpsellHeader.f48403d;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    m60.w wVar2 = this$015.f48406c;
                    if (wVar2 != null) {
                        a.c.y(wVar2);
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            case 15:
                i0 this$016 = (i0) obj;
                int i36 = i0.f61945g;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$016.f61948c.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEND_MESSAGE, (r18 & 4) != 0 ? null : g0.PRIVATE_PROFILE_POST_FOLLOW_MODAL_SEND_MESSAGE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                TypeAheadItem l13 = oo1.j.l((wy0) this$016.f61949d);
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                Intrinsics.g(f13, "null cannot be cast to non-null type com.pinterest.api.model.User");
                TypeAheadItem l14 = oo1.j.l(f13);
                HashSet hashSet = new HashSet();
                hashSet.addAll(h1.c(l13, l14));
                new kk2.m(oo1.j.j(hashSet), new ic1.a(6, new h0(this$016, r5)), 0).l(wj2.c.a()).o(new ed1.g(22, new h0(this$016, i14)), new ed1.g(23, fd1.i.f61938u));
                return;
            case 16:
                SharesheetBoardPreviewContainer this$017 = (SharesheetBoardPreviewContainer) obj;
                int i37 = SharesheetBoardPreviewContainer.f48407w;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof om1.l) || (eVar = this$017.f48408s) == null) {
                    return;
                }
                ((ed1.v) eVar).t3();
                return;
            case 17:
                cd1.d listener = (cd1.d) obj;
                int i38 = t0.f61995i;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    z zVar = (z) listener;
                    zVar.getClass();
                    TypeAheadItem typeAheadItem = kg.a.f79364a;
                    if ((typeAheadItem != null ? typeAheadItem.f35153n : null) == er.d.SENDING) {
                        d0 pinalytics = zVar.getPinalytics();
                        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                        Context context = zVar.f58744c;
                        Intrinsics.checkNotNullParameter(context, "context");
                        ap.o uploadContactsUtil = zVar.f58745d;
                        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
                        z70.m chromeTabHelper = zVar.f58748g;
                        Intrinsics.checkNotNullParameter(chromeTabHelper, "chromeTabHelper");
                        lu1.b baseActivityHelper = zVar.f58749h;
                        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
                        m60.w wVar3 = m60.u.f85943a;
                        if (wVar3 != null) {
                            try {
                                TypeAheadItem typeAheadItem2 = kg.a.f79364a;
                                if (typeAheadItem2 != null) {
                                    dp.c cVar = new dp.c(context, uploadContactsUtil, chromeTabHelper, baseActivityHelper);
                                    Intrinsics.f(null);
                                    wVar3.d(new j91.e(cVar, typeAheadItem2, kg.a.f79365b));
                                    typeAheadItem2.f35153n = er.d.SENT;
                                    y yVar = kg.a.f79366c;
                                    if (yVar != null) {
                                        int i39 = kg.a.f79365b;
                                        z zVar2 = yVar.f58743a;
                                        if (zVar2.isBound() && (adapter = zVar2.getAdapter()) != null) {
                                            ((b2) adapter).i(i39);
                                        }
                                    }
                                    d0.v(pinalytics, f1.SHARE_SHEET_CONTACT_SEND, null, false, 12);
                                }
                            } catch (EventBusException unused) {
                                d0.v(pinalytics, f1.SHARE_SHEET_SENDING_ERROR, null, false, 12);
                            }
                        }
                    }
                    zVar.f58747f.d(new jc0.s());
                    return;
                }
                return;
            case 18:
                ji0.b this$018 = (ji0.b) obj;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ((fd1.c) this$018.f76242c).cancel();
                return;
            case 19:
                ce1.c this$019 = (ce1.c) obj;
                int i43 = ce1.c.f27608h;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof an1.j) {
                    zd1.g gVar4 = this$019.f27612d;
                    if (gVar4 == null) {
                        Intrinsics.r("multiSelectFilterData");
                        throw null;
                    }
                    gVar4.f141719j = true;
                    boolean z15 = this$019.f27615g;
                    if (z15) {
                        be1.a aVar3 = this$019.f27613e;
                        if (aVar3 == null) {
                            Intrinsics.r("multiSelectFilterUpdateListener");
                            throw null;
                        }
                        aVar3.Z2(gVar4, this$019.f27614f);
                    } else if (!z15) {
                        be1.a aVar4 = this$019.f27613e;
                        if (aVar4 == null) {
                            Intrinsics.r("multiSelectFilterUpdateListener");
                            throw null;
                        }
                        aVar4.z(gVar4, this$019.f27614f);
                    }
                    boolean z16 = ((an1.j) it).f15740c;
                    Resources resources = this$019.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    this$019.setContentDescription(zd1.f.P1(z16, resources, ce1.c.a(gVar4)));
                    return;
                }
                return;
            case 20:
                x this_with = (x) obj;
                int i44 = c2.f129308j;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                Intrinsics.checkNotNullParameter(it, "it");
                this_with.f107684a.f107576d.invoke();
                return;
            case 21:
                ye1.l this$020 = (ye1.l) obj;
                int i45 = ye1.l.f138868k;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ye1.p pVar = this$020.f138874f;
                if (pVar != null) {
                    ((ye1.u) pVar).r3();
                    return;
                }
                return;
            case 22:
                ye1.s this$021 = (ye1.s) obj;
                int i46 = ye1.s.f138886i;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ye1.p pVar2 = this$021.f138888e;
                if (pVar2 != null) {
                    ((ye1.u) pVar2).r3();
                    return;
                }
                return;
            case 23:
                e1 this$022 = (e1) obj;
                int i47 = e1.T;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                j1 j1Var = this$022.G;
                if (j1Var != null) {
                    p0 p0Var = (p0) j1Var;
                    d0 pinalytics2 = p0Var.getPinalytics();
                    u0 u0Var = u0.UNDO_BUTTON;
                    g0 B3 = p0Var.B3();
                    HashMap H4 = p0Var.H4();
                    String F3 = p0Var.F3(p0Var.Z);
                    if (F3 != null) {
                        v0 v0Var2 = new v0();
                        v0Var2.G = F3;
                        v0Var = v0Var2;
                    } else {
                        v0Var = null;
                    }
                    pinalytics2.J(u0Var, B3, null, H4, v0Var, false);
                    f30 f30Var = p0Var.Z;
                    if (f30Var == null) {
                        k1 x33 = p0Var.x3();
                        if (x33 != null) {
                            e1 e1Var = (e1) x33;
                            i92.k kVar = e1Var.f112551j;
                            if (kVar == null) {
                                Intrinsics.r("toastUtils");
                                throw null;
                            }
                            Resources resources2 = e1Var.getContext().getResources();
                            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                            kVar.i(bs1.c.c2(x0.generic_error, resources2));
                            return;
                        }
                        return;
                    }
                    js0.c cVar2 = new js0.c(p0Var.f107863s);
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    int value = l32.c.BLOCK_SINGLE_PFY_PIN.getValue();
                    String z17 = dn.c.z(f30Var);
                    oc0 d63 = f30Var.d6();
                    String j13 = d63 != null ? d63.j() : null;
                    if (j13 == null) {
                        j13 = "";
                    }
                    com.pinterest.hairball.network.f b13 = cVar2.b(new js0.d(uid, value, z17, b40.R(j13), p0Var.F3(f30Var)));
                    a2 a2Var = ck2.i.f27924d;
                    Intrinsics.checkNotNullExpressionValue(a2Var, "emptyConsumer(...)");
                    p0Var.addDisposable(b13.execute((ak2.e) a2Var, (ak2.e) new xo.a(p0Var, 20)));
                    gb2.f fVar = gb2.f.f64747a;
                    String uid2 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    gb2.f.c(new gb2.i(uid2, wa2.p.STATE_NO_FEEDBACK, wa2.o.BOTH));
                    return;
                }
                return;
            case 24:
                u1 this$023 = (u1) obj;
                int i48 = u1.f112760b;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                c1 c1Var = this$023.f112761a;
                if (c1Var == null) {
                    Intrinsics.r("upgradeAppListener");
                    throw null;
                }
                wk2.a aVar5 = c1Var.f112537a.f112553l;
                if (aVar5 == null) {
                    Intrinsics.r("storeUpdateClientProvider");
                    throw null;
                }
                ((ps1.a) aVar5.get()).getClass();
                Context context2 = c1Var.f112538b;
                Intrinsics.checkNotNullParameter(context2, "context");
                int c13 = ih.c.f72257d.c(context2, ih.d.f72258a);
                String str4 = (c13 == 1 || c13 == 9) ? "market://details?id=com.pinterest" : "amzn://apps/android?p=com.pinterest";
                Intent intent = new Intent("android.intent.action.VIEW");
                try {
                    intent.setData(Uri.parse(str4));
                    context2.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused2) {
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.pinterest"));
                    intent.addFlags(268435456);
                    context2.startActivity(intent);
                    return;
                }
            case 25:
                xf1.a this$024 = (xf1.a) obj;
                int i49 = xf1.a.f134841s;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$024.g(yb0.d.CONFIRM_BUTTON_CLICK);
                this$024.f138504a.d(new jc0.v(new yf1.b(this$024, 2), false, 0L, 30));
                return;
            case 26:
                com.pinterest.feature.todaytab.articlefeed.d this$025 = (com.pinterest.feature.todaytab.articlefeed.d) obj;
                int i53 = com.pinterest.feature.todaytab.articlefeed.d.f48606b;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof xl1.a) || (gVar = this$025.f48607a) == null) {
                    return;
                }
                com.pinterest.feature.todaytab.articlefeed.j jVar = gVar.f48613a;
                jVar.s7().F(g0.NAVIGATION, u0.END_OF_FEED_BACK_BUTTON);
                jVar.P7();
                return;
            case 27:
                com.pinterest.feature.todaytab.articlefeed.j this$026 = (com.pinterest.feature.todaytab.articlefeed.j) obj;
                int i54 = com.pinterest.feature.todaytab.articlefeed.j.f48625f1;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    View view = this$026.getView();
                    if (view != null) {
                        view.performHapticFeedback(3);
                    }
                    com.pinterest.feature.todaytab.articlefeed.n nVar = this$026.Y0;
                    if (nVar != null) {
                        nVar.v3();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                com.pinterest.feature.todaytab.tab.view.c this$027 = (com.pinterest.feature.todaytab.tab.view.c) obj;
                int i55 = com.pinterest.feature.todaytab.tab.view.c.f48709e;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    this$027.a();
                    return;
                }
                return;
            default:
                com.pinterest.feature.todaytab.tab.view.k this$028 = (com.pinterest.feature.todaytab.tab.view.k) obj;
                int i56 = com.pinterest.feature.todaytab.tab.view.k.X0;
                Intrinsics.checkNotNullParameter(this$028, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    this$028.P7();
                    return;
                }
                return;
        }
    }
}
