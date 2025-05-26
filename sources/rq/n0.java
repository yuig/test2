package rq;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.ads.feature.owc.view.collection.AdsProductView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.grid.view.BoardGridCellLayout;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109395b;

    public /* synthetic */ n0(Object obj, int i13) {
        this.f109394a = i13;
        this.f109395b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View targetView) {
        v7 v7Var;
        String uid;
        f30 pin;
        f30 pin2;
        Boolean bool;
        boolean z13;
        int i13 = this.f109394a;
        Object obj = this.f109395b;
        switch (i13) {
            case 0:
                p0 this$0 = (p0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ss.b bVar = this$0.C;
                if (bVar != null) {
                    f30 f30Var = bVar.f115132d;
                    if (f30Var == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    bVar.f115129a.d(new ls1.q(null, f30Var, bVar.f115134f, -1, vn1.c.DEFAULT, false, null, true, -1, null, null, -1));
                }
                return true;
            case 1:
                tq.n this$02 = (tq.n) obj;
                int i14 = tq.n.E;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                tq.h hVar = this$02.f118912v;
                if (hVar != null) {
                    hVar.R2();
                }
                return true;
            case 2:
                AdsProductView adsProductView = (AdsProductView) obj;
                rl2.u[] uVarArr = AdsProductView.f35340s;
                m60.w wVar = adsProductView.f35341d;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar.d(new eu.y(adsProductView.f35352o, adsProductView.i()));
                wVar.d(new ls1.q(targetView, adsProductView.i()));
                return true;
            case 3:
                zu.f this$03 = (zu.f) obj;
                int i15 = zu.f.f142796k;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.getClass();
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Context context = this$03.getContext();
                int i16 = eo1.b.sema_color_background_transparent;
                Object obj2 = d5.a.f53679a;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(this$03.f142802f, "backgroundColor", argbEvaluator, Integer.valueOf(context.getColor(i16)), Integer.valueOf(this$03.getContext().getColor(this$03.f142801e)));
                Intrinsics.checkNotNullExpressionValue(ofObject, "ofObject(...)");
                ofObject.setDuration(100L);
                ofObject.start();
                this$03.f142797a.d(new ls1.q(this$03, this$03.f142798b));
                return true;
            case 4:
                tl0.b bVar2 = ((BoardGridCellLayout) obj).f45267f;
                if (bVar2 != null && (v7Var = bVar2.f118061d) != null) {
                    if (kh2.d.M0(v7Var)) {
                        v7 v7Var2 = bVar2.f118061d;
                        if (v7Var2 != null && (uid = v7Var2.getUid()) != null) {
                            m60.u.f85943a.d(Navigation.z0((ScreenLocation) com.pinterest.screens.s.f51311a.getValue(), uid));
                        }
                    } else {
                        nx.d0 a13 = sh.f.a();
                        h32.f1 f1Var = h32.f1.LONG_PRESS;
                        h32.u0 u0Var = h32.u0.BOARD_COVER;
                        h32.g0 g0Var = h32.g0.FLOWED_BOARD;
                        v7 v7Var3 = bVar2.f118061d;
                        a13.N(f1Var, u0Var, g0Var, v7Var3 != null ? v7Var3.getUid() : null, false);
                        sl0.b bVar3 = (sl0.b) bVar2.getView();
                        v7 v7Var4 = bVar2.f118061d;
                        BoardGridCellLayout boardGridCellLayout = (BoardGridCellLayout) bVar3;
                        boardGridCellLayout.getClass();
                        m60.u.f85943a.d(new m10.b(boardGridCellLayout, v7Var4));
                    }
                }
                return true;
            case 5:
                ConversationMessageItemView this$04 = (ConversationMessageItemView) obj;
                int i17 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                mv mvVar = this$04.f45546c0;
                if (mvVar != null) {
                    lp2.b.q(mvVar, this$04.f45552e0, this$04.l(), this$04.s(), this$04.B0(), this$04.L(), this$04.m(), this$04.z(), this$04.x(), Intrinsics.d(this$04.I0, lq0.c1.f84267a), this$04.F0, this$04.a0(), this$04.I0);
                    return true;
                }
                Intrinsics.r("message");
                throw null;
            case 6:
                cy0.h this$05 = (cy0.h) obj;
                int i18 = cy0.h.f53428u0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                ay0.b bVar4 = this$05.f53430k0;
                if (bVar4 != null) {
                    ((by0.b) bVar4).r3();
                }
                return true;
            case 7:
                q21.d this$06 = (q21.d) obj;
                int i19 = q21.d.B;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                p21.f fVar = this$06.f102126e;
                if (fVar != null) {
                    p21.b bVar5 = this$06.f102135j;
                    if (bVar5 != null) {
                        if (fVar.isBound() && (pin2 = fVar.f98692a) != null) {
                            lv0.g gVar = (lv0.g) bVar5;
                            Intrinsics.checkNotNullParameter(pin2, "pin");
                            nx.d0.v(gVar.getPinalytics(), h32.f1.LONG_PRESS, pin2.getUid(), false, 12);
                            Context context2 = gVar.f85008j;
                            mv0.o todayTabSinglePinModule = new mv0.o(context2);
                            Intrinsics.checkNotNullParameter(pin2, "pin");
                            WebImageView webImageView = todayTabSinglePinModule.f88388d;
                            webImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (hf0.b.f69003c * 0.65d)));
                            webImageView.loadUrl(bs1.c.y0(pin2));
                            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            String text = df.j1.s0(pin2);
                            if (text != null) {
                                Intrinsics.checkNotNullParameter(text, "text");
                                pk.a0.p(todayTabSinglePinModule.f88389e, text);
                            }
                            int i23 = eo1.b.color_themed_text_default;
                            Resources.Theme theme = context2.getTheme();
                            Resources resources = gVar.f85010l;
                            SpannableStringBuilder g13 = po1.c.g(resources.getColor(i23, theme), resources.getColor(eo1.b.color_blue_500, context2.getTheme()), pin2);
                            if (bs1.c.f1(pin2)) {
                                String string = resources.getString(az1.c.product_in_stock);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                if (g13 != null) {
                                    g13.append((CharSequence) resources.getString(aq1.h.price_separator_dot, string));
                                }
                            }
                            if (g13 != null) {
                                SpannableString priceInfo = SpannableString.valueOf(g13);
                                Intrinsics.checkNotNullExpressionValue(priceInfo, "valueOf(...)");
                                Intrinsics.checkNotNullParameter(priceInfo, "priceInfo");
                                pk.a0.q(todayTabSinglePinModule.f88390f, bs1.c.h2(priceInfo));
                            }
                            wy0 creator = b40.n(pin2);
                            if (creator != null) {
                                Intrinsics.checkNotNullParameter(creator, "creator");
                                String t03 = dl2.b.t0(creator);
                                LinearLayout linearLayout = todayTabSinglePinModule.f88386b;
                                linearLayout.setVisibility(0);
                                todayTabSinglePinModule.f88385a.H2(new defpackage.b(t03, creator));
                                String Z2 = creator.Z2();
                                if (Z2 != null) {
                                    linearLayout.setVisibility(0);
                                    pk.a0.p(todayTabSinglePinModule.f88387c, Z2);
                                }
                            }
                            yk1.n view = gVar.getView();
                            Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.producttagging.IdeaPinProductSearchContract.IdeaPinProductSearchView<*>");
                            mv0.r rVar = (mv0.r) ((jv0.b) view);
                            Intrinsics.checkNotNullParameter(todayTabSinglePinModule, "todayTabSinglePinModule");
                            rVar.f88400l1 = todayTabSinglePinModule;
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(15);
                            RelativeLayout relativeLayout = rVar.f88398j1;
                            if (relativeLayout == null) {
                                Intrinsics.r("pinDetailsContainer");
                                throw null;
                            }
                            relativeLayout.removeAllViews();
                            Context requireContext = rVar.requireContext();
                            int i24 = aq1.a.modal_background;
                            Object obj3 = d5.a.f53679a;
                            relativeLayout.setBackgroundColor(requireContext.getColor(i24));
                            relativeLayout.setAlpha(1.0f);
                            relativeLayout.addView(todayTabSinglePinModule, layoutParams);
                            relativeLayout.bringToFront();
                            relativeLayout.setVisibility(0);
                        }
                    } else if (fVar.isBound() && (pin = fVar.f98692a) != null) {
                        o21.d dVar = (o21.d) fVar.getView();
                        String str = fVar.f98708q ? fVar.f98709r : null;
                        q21.a aVar = (q21.a) dVar;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(pin, "pin");
                        e0.t.f56747e = y32.f.FOLLOWING_FEED.getValue();
                        m60.w wVar2 = aVar.f102127f;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wVar2.d(new ls1.q(aVar, pin, -1, -1, vn1.c.DEFAULT, false, str, fVar.f98711t, -1, null, null, -1));
                    }
                }
                return true;
            case 8:
                sf1.v0 listener = (sf1.v0) obj;
                int i25 = sf1.s.P;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                oq.c0 c0Var = (oq.c0) listener;
                c0Var.f96992q.onLongClick(c0Var);
                return true;
            case 9:
                ji1.c this$07 = (ji1.c) obj;
                int i26 = ji1.c.f76283m;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                ii1.b bVar6 = this$07.f76285b;
                if (bVar6 != null) {
                    Intrinsics.f(targetView);
                    Intrinsics.checkNotNullParameter(targetView, "targetView");
                    bVar6.p3(h32.f1.LONG_PRESS);
                    bVar6.f72307e.d(new ls1.q(targetView, bVar6.f72314l));
                }
                return true;
            case 10:
                fo1.i toolbarListener = (fo1.i) obj;
                Intrinsics.checkNotNullParameter(toolbarListener, "$toolbarListener");
                nl1.d dVar2 = (nl1.d) toolbarListener;
                wy0 f13 = ((b60.d) dVar2.getActiveUserManager()).f();
                if (f13 == null || (bool = f13.z3()) == null) {
                    bool = Boolean.FALSE;
                }
                boolean booleanValue = bool.booleanValue();
                m60.e eVar = dVar2.f91291p;
                if (eVar == null) {
                    Intrinsics.r("baseApplicationInfoProvider");
                    throw null;
                }
                ((m60.d) eVar).g();
                if (!booleanValue || dVar2.f91294s != null) {
                    return false;
                }
                Intrinsics.r("shakeModalNavigation");
                throw null;
            case 11:
                LegoFloatingBottomNavBar this$08 = (LegoFloatingBottomNavBar) obj;
                int i27 = LegoFloatingBottomNavBar.N;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (this$08.B != null) {
                    return false;
                }
                Intrinsics.r("shakeModalNavigation");
                throw null;
            case 12:
                PinterestAdapterView pinterestAdapterView = (PinterestAdapterView) obj;
                if (pinterestAdapterView.f52511n == null || pinterestAdapterView.f52504g == null) {
                    return false;
                }
                int intValue = ((Integer) targetView.getTag(m60.x0.TAG_INDEX)).intValue();
                AdapterView.OnItemLongClickListener onItemLongClickListener = pinterestAdapterView.f52511n;
                pinterestAdapterView.f52504g.getClass();
                return onItemLongClickListener.onItemLongClick(pinterestAdapterView, targetView, intValue, intValue);
            default:
                z13 = PinVideoGridCell.setupVideoEndFrame$lambda$13((PinVideoGridCell) obj, targetView);
                return z13;
        }
    }
}
