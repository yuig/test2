package wq1;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.share.board.video.pinselection.ui.PinThumbnailCell;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import com.pinterest.unauth.controller.SSOActivity;
import h32.f1;
import h32.u0;
import java.util.List;
import java.util.Map;
import jc0.s;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;
import px1.w;
import qr1.f0;
import uv1.q;
import y52.x0;
import yq1.b1;
import yq1.c2;
import yq1.e2;
import yq1.h2;
import yq1.v1;
import yq1.y1;
import zq1.g0;
import zq1.j0;
import zq1.x;
import zq1.y;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130793b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f130792a = i13;
        this.f130793b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BottomSheetBehavior bottomSheetBehavior;
        i81.d dVar;
        String url;
        int i13 = this.f130792a;
        int i14 = 3;
        Object obj = this.f130793b;
        switch (i13) {
            case 0:
                f this$0 = (f) obj;
                Map map = f.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f130818k0 == j.PROFILE_NAME_STEP) {
                    this$0.g8("signup_back");
                }
                int i15 = d.f130798a[this$0.f130818k0.ordinal()];
                if (i15 == 1) {
                    GestaltTextField gestaltTextField = this$0.A0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("profileEditText");
                        throw null;
                    }
                    String B0 = gestaltTextField.B0();
                    if (!z.j(B0)) {
                        this$0.f130819l0 = B0;
                    }
                } else if (i15 == 2) {
                    GestaltTextField gestaltTextField2 = this$0.B0;
                    if (gestaltTextField2 == null) {
                        Intrinsics.r("websiteEditText");
                        throw null;
                    }
                    String B02 = gestaltTextField2.B0();
                    if (!z.j(B02)) {
                        this$0.f130820m0 = B02;
                    }
                } else if (i15 == 3) {
                    this$0.f130821n0 = "";
                    RadioGroup radioGroup = this$0.H0;
                    if (radioGroup == null) {
                        Intrinsics.r("descriptionRadioGroup");
                        throw null;
                    }
                    radioGroup.clearCheck();
                } else if (i15 == 4) {
                    this$0.f130822o0 = "";
                    RadioGroup radioGroup2 = this$0.I0;
                    if (radioGroup2 == null) {
                        Intrinsics.r("runAdsRadioGroup");
                        throw null;
                    }
                    radioGroup2.clearCheck();
                } else if (i15 == 5) {
                    GestaltTextField gestaltTextField3 = this$0.C0;
                    if (gestaltTextField3 == null) {
                        Intrinsics.r("launchAdsEditText");
                        throw null;
                    }
                    String B03 = gestaltTextField3.B0();
                    if (!z.j(B03)) {
                        this$0.f130823p0 = B03;
                    }
                }
                h hVar = this$0.f130817j0;
                if (hVar != null) {
                    ((n) hVar).p3();
                    return;
                }
                return;
            case 1:
                b1 this$02 = (b1) obj;
                Map map2 = b1.f139782x0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                x xVar = this$02.f139790o0;
                if (xVar != null) {
                    ((y) xVar).p3(this$02.f139791p0);
                    return;
                }
                return;
            case 2:
                v1 this$03 = (v1) obj;
                int i16 = v1.D0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                g0 g0Var = this$03.f139908n0;
                if (g0Var != null) {
                    ((j0) g0Var).q3(this$03.e8().B0(), ar1.d.EMAIL_STEP);
                    return;
                }
                return;
            case 3:
                y1 this$04 = (y1) obj;
                f0 f0Var = y1.f140069z0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.b8("signup_back");
                zq1.z zVar = this$04.f140076p0;
                if (zVar != null) {
                    ((zq1.f0) zVar).p3(this$04.f140077q0);
                    return;
                }
                return;
            case 4:
                c2 this$05 = (c2) obj;
                int i17 = c2.F0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.N2();
                return;
            case 5:
                e2 this$06 = (e2) obj;
                int i18 = e2.C0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                g0 g0Var2 = this$06.f139908n0;
                if (g0Var2 != null) {
                    ((j0) g0Var2).q3(this$06.e8().B0(), ar1.d.NAME_STEP);
                    return;
                }
                return;
            case 6:
                h2 this$07 = (h2) obj;
                int i19 = h2.E0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                g0 g0Var3 = this$07.f139908n0;
                if (g0Var3 != null) {
                    ((j0) g0Var3).q3(this$07.e8().B0(), ar1.d.PASSWORD_STEP);
                    return;
                }
                return;
            case 7:
                br1.i this$08 = (br1.i) obj;
                int i23 = br1.i.f23793x;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Function1 function1 = this$08.f23794u;
                if (function1 != null) {
                    function1.invoke(this$08.f23795v.getText().toString());
                    return;
                }
                return;
            case 8:
                uv1.f this$09 = (uv1.f) obj;
                int i24 = uv1.f.f123194d;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                x61.c cVar = this$09.f123195a;
                if (cVar == null) {
                    Intrinsics.r("hairPatternCellView");
                    throw null;
                }
                boolean z13 = cVar.f133936d;
                if (z13) {
                    tv1.e eVar = this$09.f123197c;
                    if (eVar != null) {
                        eVar.v();
                    }
                    x61.c cVar2 = this$09.f123195a;
                    if (cVar2 == null) {
                        Intrinsics.r("hairPatternCellView");
                        throw null;
                    }
                    cVar2.f133936d = false;
                    GestaltButtonToggle gestaltButtonToggle = cVar2.f133937e;
                    if (gestaltButtonToggle != null) {
                        gestaltButtonToggle.s(x61.b.f133930l);
                    }
                } else {
                    cVar.a();
                }
                tv1.d dVar2 = this$09.f123196b;
                if (dVar2 != null) {
                    dVar2.R1(!z13);
                    return;
                }
                return;
            case 9:
                uv1.l this$010 = (uv1.l) obj;
                int i25 = uv1.l.R0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.V8("background_tapped");
                return;
            case 10:
                uv1.n this$011 = (uv1.n) obj;
                int i26 = uv1.n.f123216d;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                if (this$011.f123218b) {
                    g71.b bVar = this$011.f123217a;
                    if (bVar == null) {
                        Intrinsics.r("skinToneView");
                        throw null;
                    }
                    bVar.a(false);
                }
                tv1.g gVar = this$011.f123219c;
                if (gVar != null) {
                    gVar.R1(!this$011.f123218b);
                    return;
                }
                return;
            case 11:
                q this$012 = (q) obj;
                int i27 = q.I0;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                this$012.V8("background_tapped");
                return;
            case 12:
                ProductTagCard this$013 = (ProductTagCard) obj;
                int i28 = ProductTagCard.f50084v;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                d0 d0Var = this$013.f50085a;
                if (d0Var != null) {
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.CLICK, (r18 & 2) != 0 ? null : u0.PIN_STATS_TAGGED_PRODUCTS_TABLE_SORT, (r18 & 4) != 0 ? null : h32.g0.PIN_STATS_TAGGED_PRODUCTS_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                if (this$013.f50104t) {
                    this$013.f50105u = !this$013.f50105u;
                    dl2.b.z(this$013.f50090f, new gw1.d(this$013, i14));
                    gw1.k kVar = this$013.f50101q;
                    List value = CollectionsKt.q0(kVar.f66240e);
                    Intrinsics.checkNotNullParameter(value, "value");
                    kVar.f66240e = value;
                    kVar.h();
                    kVar.h();
                    return;
                }
                return;
            case 13:
                lx1.j this$014 = (lx1.j) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                this$014.f85086a.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.BACK_BUTTON, (r18 & 4) != 0 ? null : h32.g0.ANALYTICS_MOBILE_HEADER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : a.a.x("analytics_previous_value", "categories", "analytics_next_value", "audience"), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$014.f85090e.d(new s(true, 0));
                return;
            case 14:
                nx1.a this$015 = (nx1.a) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                this$015.f92492a.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.BACK_BUTTON, (r18 & 4) != 0 ? null : h32.g0.ANALYTICS_MOBILE_HEADER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : a.a.x("analytics_previous_value", "location", "analytics_next_value", "audience"), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$015.f92497f.d(new s(true, 0));
                return;
            case 15:
                w this$016 = (w) obj;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                a.c.y(this$016.f101707e);
                return;
            case 16:
                vx1.c this$017 = (vx1.c) obj;
                int i29 = vx1.c.f126828o0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                ((ku1.j) this$017.o7()).f();
                return;
            case 17:
                yx1.j this$018 = (yx1.j) obj;
                int i33 = yx1.j.H0;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                ((ku1.j) this$018.o7()).f();
                return;
            case 18:
                zz1.d0 this$019 = (zz1.d0) obj;
                int i34 = zz1.d0.f143172o0;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                if (!this$019.f143180j0) {
                    this$019.Z7();
                    return;
                }
                Function1 function12 = this$019.f143179i0;
                if (function12 != null) {
                    function12.invoke(b02.g.f20777a);
                    return;
                }
                return;
            case 19:
                s42.d listener = (s42.d) obj;
                int i35 = v42.k.P;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                listener.b();
                return;
            case 20:
                s52.b data = (s52.b) obj;
                int i36 = PinThumbnailCell.f51839b;
                Intrinsics.checkNotNullParameter(data, "$data");
                data.f111165b.invoke();
                return;
            case 21:
                s52.n this$020 = (s52.n) obj;
                int i37 = s52.n.f111189g1;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                kh2.j.x2(this$020.n9(), r52.m.f106291a);
                return;
            case 22:
                x0 this$021 = (x0) obj;
                int i38 = x0.f137870v0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                kh2.j.x2(this$021.e8(), y52.h.f137801a);
                return;
            case 23:
                da2.g this$022 = (da2.g) obj;
                int i39 = da2.g.f54244o;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                da2.c cVar3 = this$022.f54254j;
                if (cVar3 != null) {
                    cp.s sVar = (cp.s) cVar3;
                    switch (sVar.f52969a) {
                        case 0:
                            l81.l lVar = (l81.l) sVar.f52970b;
                            ca2.e eVar2 = lVar.f82176o2;
                            if (eVar2 == null || (bottomSheetBehavior = eVar2.f27255n) == null) {
                                return;
                            }
                            int i43 = bottomSheetBehavior.L;
                            i81.c cVar4 = lVar.f82177p1;
                            if (cVar4 != null) {
                                k81.l lVar2 = (k81.l) cVar4;
                                if (i43 == 4 && (dVar = (i81.d) lVar2.getViewIfBound()) != null && ((l81.l) dVar).B9()) {
                                    i81.d dVar3 = (i81.d) lVar2.getViewIfBound();
                                    if (dVar3 != null) {
                                        i81.d.y4(dVar3, lVar2.f78644s0);
                                    }
                                    lVar2.J3();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 24:
                PinterestAdapterView pinterestAdapterView = (PinterestAdapterView) obj;
                if (pinterestAdapterView.f52510m == null || pinterestAdapterView.f52504g == null) {
                    return;
                }
                int intValue = ((Integer) view.getTag(m60.x0.TAG_INDEX)).intValue();
                AdapterView.OnItemClickListener onItemClickListener = pinterestAdapterView.f52510m;
                pinterestAdapterView.f52504g.getClass();
                onItemClickListener.onItemClick(pinterestAdapterView, view, intValue, intValue);
                return;
            case 25:
                za2.b this$023 = (za2.b) obj;
                int i44 = za2.b.f141482i;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                ya2.a aVar = this$023.f141483d;
                if (aVar == null || (url = aVar.f138321g) == null) {
                    return;
                }
                za2.b bVar2 = (za2.b) ((xa2.a) aVar.getView());
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                ku1.l lVar3 = bVar2.f141484e;
                if (lVar3 == null) {
                    Intrinsics.r("uriNavigator");
                    throw null;
                }
                Context context = bVar2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ku1.l.b(lVar3, context, url, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                return;
            case 26:
                PinVideoGridCell.setupVideoEndFrame$lambda$11((PinVideoGridCell) obj, view);
                return;
            case 27:
                cb2.g icon = (cb2.g) obj;
                Intrinsics.checkNotNullParameter(icon, "$icon");
                icon.f27321d.invoke();
                return;
            case 28:
                SSOActivity this$024 = (SSOActivity) obj;
                int i45 = SSOActivity.f52735g;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.onBackPressed();
                return;
            default:
                mb2.g this$025 = (mb2.g) obj;
                int i46 = mb2.g.f86876e0;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                this$025.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CONTINUE_SSO_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                FragmentActivity requireActivity = this$025.requireActivity();
                Intrinsics.g(requireActivity, "null cannot be cast to non-null type com.pinterest.unauth.controller.SSOActivity");
                ((SSOActivity) requireActivity).x();
                return;
        }
    }
}
