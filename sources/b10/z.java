package b10;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qz0;
import com.pinterest.api.model.te0;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import com.pinterest.feature.board.headerimage.BoardHeaderImageView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import i2.q1;
import i32.y0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import nx.d1;
import tc0.n0;
import tc0.t0;
import uc0.a1;
import uc0.w2;
import x02.i2;
import x40.bg;
import x40.ch;
import x40.gh;
import x40.kf;
import x40.tf;
import x40.xf;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20961j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f20962k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i13, Object obj, Object obj2) {
        super(0);
        this.f20960i = i13;
        this.f20961j = obj;
        this.f20962k = obj2;
    }

    public final tj0.z b() {
        int i13 = this.f20960i;
        Object obj = this.f20962k;
        Object obj2 = this.f20961j;
        switch (i13) {
            case 23:
                tj0.d dVar = (tj0.d) obj;
                androidx.lifecycle.z viewLifecycleOwner = dVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new tj0.z((Context) obj2, dVar.s7(), m60.f0.i0(dVar.W8().f103320a), bf.b.S(viewLifecycleOwner));
            default:
                tj0.h hVar = (tj0.h) obj;
                androidx.lifecycle.z viewLifecycleOwner2 = hVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                return new tj0.z((Context) obj2, hVar.s7(), m60.f0.i0(hVar.W8().f103320a), bf.b.S(viewLifecycleOwner2));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20960i;
        Object obj = this.f20962k;
        Object obj2 = this.f20961j;
        switch (i13) {
            case 0:
                m70invoke();
                return Unit.f80348a;
            case 1:
                m70invoke();
                return Unit.f80348a;
            case 2:
                m70invoke();
                return Unit.f80348a;
            case 3:
                m70invoke();
                return Unit.f80348a;
            case 4:
                m70invoke();
                return Unit.f80348a;
            case 5:
                m70invoke();
                return Unit.f80348a;
            case 6:
                m70invoke();
                return Unit.f80348a;
            case 7:
                k90.c cVar = (k90.c) obj2;
                nx.d0 s73 = cVar.s7();
                m60.w f73 = cVar.f7();
                i2 m93 = cVar.m9();
                boolean F9 = cVar.F9();
                String Z = com.bumptech.glide.d.Z(cVar, "EXTRA_COLLAGES_ROOT_PIN_ID", "");
                np0.g gVar = cVar.f78728l1;
                if (gVar == null) {
                    Intrinsics.r("closeupActionController");
                    throw null;
                }
                String Z2 = com.bumptech.glide.d.Z(cVar, "EXTRA_COLLAGES_ROOT_PIN_UID", "");
                lh0.e0 e0Var = cVar.f78730n1;
                if (e0Var == null) {
                    Intrinsics.r("cutoutCloseupExperiments");
                    throw null;
                }
                d1 z73 = cVar.z7();
                boolean G = com.bumptech.glide.d.G(cVar, "EXTRA_COLLAGE_PIN_SINGLE_DEST", false);
                HashMap hashMap = new HashMap();
                hashMap.put("shuffle_asset_id", com.bumptech.glide.d.Z(cVar, "EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID", ""));
                return new k90.k((Context) obj, s73, f73, gVar, m93, hashMap, e0Var, false, F9, Z, Z2, z73, G, 1038);
            case 8:
                m70invoke();
                return Unit.f80348a;
            case 9:
                m70invoke();
                return Unit.f80348a;
            case 10:
                m70invoke();
                return Unit.f80348a;
            case 11:
                m70invoke();
                return Unit.f80348a;
            case 12:
                m70invoke();
                return Unit.f80348a;
            case 13:
                m70invoke();
                return Unit.f80348a;
            case 14:
                m70invoke();
                return Unit.f80348a;
            case 15:
                m70invoke();
                return Unit.f80348a;
            case 16:
                m70invoke();
                return Unit.f80348a;
            case 17:
                m70invoke();
                return Unit.f80348a;
            case 18:
                m70invoke();
                return Unit.f80348a;
            case 19:
                m70invoke();
                return Unit.f80348a;
            case 20:
                pi0.f fVar = (pi0.f) obj2;
                if (fVar.f100190i == null) {
                    Intrinsics.r("pinImageOnlyItemViewFactory");
                    throw null;
                }
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                nx.d0 pinalytics = (nx.d0) obj;
                int i14 = fVar.R;
                wa2.m pinFeatureConfig = fVar.N;
                if (pinFeatureConfig == null) {
                    Intrinsics.r("pinFeatureConfig");
                    throw null;
                }
                int i15 = fVar.O;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                ao2.j0 scope = fVar.f100186e;
                Intrinsics.checkNotNullParameter(scope, "scope");
                return new qi0.d(context, pinalytics, i14, pinFeatureConfig, scope, i15, fVar.f100187f);
            case 21:
                return new y92.c((Context) obj2, ((qi0.d) obj).f103985n);
            case 22:
                m70invoke();
                return Unit.f80348a;
            case 23:
                return b();
            case 24:
                return b();
            case 25:
                m70invoke();
                return Unit.f80348a;
            case 26:
                ml0.w wVar = (ml0.w) obj2;
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                nx.d0 s74 = wVar.s7();
                wa2.m i03 = m60.f0.i0(((qa2.n) obj).f103320a);
                androidx.lifecycle.z viewLifecycleOwner = wVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                qa2.j0 j0Var = wVar.L0;
                if (j0Var == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                t2 t2Var = wVar.M0;
                if (t2Var == null) {
                    Intrinsics.r("pinRepViewModelFactory");
                    throw null;
                }
                ni1.d0 d0Var = wVar.N0;
                if (d0Var != null) {
                    return new ol0.i(requireContext, s74, i03, S, j0Var, t2Var, d0Var);
                }
                Intrinsics.r("vmStateConverterFactory");
                throw null;
            case 27:
                m70invoke();
                return Unit.f80348a;
            case 28:
                m70invoke();
                return Unit.f80348a;
            default:
                m70invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m70invoke() {
        v7 v7Var;
        int i13 = 6;
        int i14 = this.f20960i;
        Object obj = this.f20962k;
        Object obj2 = this.f20961j;
        switch (i14) {
            case 0:
                ((qz0) obj2).c(((kf) obj).f132680b);
                return;
            case 1:
                ((qz0) obj2).c(((ch) obj).f132171b);
                return;
            case 2:
                te0 te0Var = (te0) obj2;
                te0Var.f42181e = ((xf) obj).f133690a;
                boolean[] zArr = te0Var.f42190n;
                if (zArr.length > 4) {
                    zArr[4] = true;
                    return;
                }
                return;
            case 3:
                te0 te0Var2 = (te0) obj2;
                te0Var2.f42181e = ((gh) obj).f132456a;
                boolean[] zArr2 = te0Var2.f42190n;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                    return;
                }
                return;
            case 4:
                ((qz0) obj2).c(((bg) obj).f132056b);
                return;
            case 5:
                ((qz0) obj2).c(((tf) obj).f133384b);
                return;
            case 6:
                ((Function1) obj2).invoke(Integer.valueOf(((u80.j) obj).f120954h));
                return;
            case 7:
            case 20:
            case 21:
            case 23:
            case 24:
            case 26:
            default:
                lm0.i iVar = new lm0.i(new um0.s(((lm0.c0) obj).f83854f));
                int i15 = jm0.j.f76978k1;
                ((jm0.j) obj2).n9(iVar);
                return;
            case 8:
                ((Function1) obj2).invoke(Integer.valueOf(((n90.a) obj).f89990c));
                return;
            case 9:
                ((Function1) obj2).invoke(Integer.valueOf(((t90.p) obj).f116819c));
                return;
            case 10:
                fa0.t tVar = (fa0.t) obj2;
                e02.a aVar = tVar.M0;
                if (aVar != null) {
                    f30 f30Var = (f30) obj;
                    il1.a aVar2 = tVar.N0;
                    if (aVar2 != null) {
                        e02.a.b(aVar, f30Var, false, aVar2, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                        return;
                    } else {
                        Intrinsics.r("fragmentFactory");
                        throw null;
                    }
                }
                Intrinsics.r("boardRouter");
                throw null;
            case 11:
                int i16 = qa0.f.collage_download_failed;
                ((ta0.v) obj2).getClass();
                ta0.v.j((u50.r) obj, i16);
                return;
            case 12:
                ((Function1) obj2).invoke((Activity) obj);
                return;
            case 13:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(((n0) obj2).f117292b));
                ((Context) obj).startActivity(intent);
                return;
            case 14:
                ((Function1) obj2).invoke(((uc0.x) obj).f121881c);
                return;
            case 15:
                ((Function1) obj2).invoke(((a1) obj).f121758d);
                return;
            case 16:
                Boolean bool = Boolean.FALSE;
                ((q1) obj2).setValue(bool);
                ((q1) obj).setValue(bool);
                return;
            case 17:
                kotlin.jvm.internal.j.z((ao2.j0) obj2, null, null, new t0((w2) obj, null), 3);
                return;
            case 18:
                ((gd0.b) obj2).f64805d.invoke((f30) obj);
                return;
            case 19:
                ((Function1) obj2).invoke((y0) obj);
                return;
            case 22:
                pj0.i iVar2 = (pj0.i) obj2;
                nx.d0.B(iVar2.f100238n, null, h32.g0.BOARD_MORE_IDEAS_HEADER, null, null, 29);
                g70.h.f(iVar2.f100240p, (v7) obj, null, 6);
                return;
            case 25:
                xk0.d dVar = ((LegoBoardDetailHeader) obj2).G;
                if (dVar != null) {
                    String userId = ((lk0.a) obj).f83636a;
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    ((wk0.c) dVar).f130112f.d(userId, r41.b.LegoBoardDetailHeader);
                    return;
                }
                Intrinsics.r("listener");
                throw null;
            case 27:
                ml0.b bVar = (ml0.b) obj2;
                ml0.a aVar3 = bVar.f87440b;
                Integer num = aVar3.f87436b;
                if (num != null && aVar3.f87437c != null) {
                    ml0.w wVar = (ml0.w) obj;
                    FrameLayout frameLayout = wVar.U0;
                    if (frameLayout != null) {
                        float intValue = num.intValue();
                        BoardHeaderImageView boardHeaderImageView = wVar.V0;
                        if (boardHeaderImageView != null) {
                            int T = (int) (intValue / boardHeaderImageView.T());
                            float intValue2 = bVar.f87440b.f87437c.intValue();
                            BoardHeaderImageView boardHeaderImageView2 = wVar.V0;
                            if (boardHeaderImageView2 != null) {
                                frameLayout.scrollTo(T, (int) (intValue2 / boardHeaderImageView2.X()));
                            } else {
                                Intrinsics.r("imageShown");
                                throw null;
                            }
                        } else {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                    } else {
                        Intrinsics.r("scrollViewShowing");
                        throw null;
                    }
                } else {
                    ml0.w wVar2 = (ml0.w) obj;
                    BoardHeaderImageView boardHeaderImageView3 = wVar2.V0;
                    if (boardHeaderImageView3 == null) {
                        Intrinsics.r("imageShown");
                        throw null;
                    }
                    int width = boardHeaderImageView3.getWidth();
                    if (wVar2.U0 != null) {
                        int width2 = (int) ((width - r8.getWidth()) / 2.0f);
                        if (width2 < 0) {
                            width2 = 0;
                        }
                        BoardHeaderImageView boardHeaderImageView4 = wVar2.V0;
                        if (boardHeaderImageView4 == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        int height = boardHeaderImageView4.getHeight();
                        if (wVar2.U0 != null) {
                            int height2 = (int) ((height - r9.getHeight()) / 2.0f);
                            int i17 = height2 >= 0 ? height2 : 0;
                            FrameLayout frameLayout2 = wVar2.U0;
                            if (frameLayout2 != null) {
                                frameLayout2.scrollTo(width2, i17);
                            } else {
                                Intrinsics.r("scrollViewShowing");
                                throw null;
                            }
                        } else {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                    } else {
                        Intrinsics.r("scrollViewShowing");
                        throw null;
                    }
                }
                ml0.w wVar3 = (ml0.w) obj;
                GestaltText gestaltText = wVar3.W0;
                if (gestaltText != null) {
                    pk.a0.w1(gestaltText);
                    FrameLayout frameLayout3 = wVar3.U0;
                    if (frameLayout3 != null) {
                        bs1.c.U1(frameLayout3);
                        GestaltText gestaltText2 = wVar3.W0;
                        if (gestaltText2 != null) {
                            pk.a0.w1(gestaltText2);
                            GestaltButton gestaltButton = wVar3.P0;
                            if (gestaltButton != null) {
                                gestaltButton.d(ml0.n.f87481l);
                                return;
                            } else {
                                Intrinsics.r("doneButton");
                                throw null;
                            }
                        }
                        Intrinsics.r("repositionText");
                        throw null;
                    }
                    Intrinsics.r("scrollViewShowing");
                    throw null;
                }
                Intrinsics.r("repositionText");
                throw null;
            case 28:
                ol0.f fVar = (ol0.f) obj2;
                fVar.s7().b0(u0.BOARD_DELETE_BUTTON, h32.g0.MODAL_DIALOG, (String) obj, false);
                a.c.y(fVar.f7());
                ll0.f fVar2 = fVar.Q0;
                if (fVar2 == null || (v7Var = fVar2.f83814m) == null) {
                    return;
                }
                ek2.f i18 = fVar2.f83804c.d(v7Var).i(new fp.a(i13, fVar2, v7Var), new zk0.b(24, new ll0.c(fVar2, 2)));
                Intrinsics.checkNotNullExpressionValue(i18, "subscribe(...)");
                if (fVar2.getViewIfBound() != null) {
                    fVar2.addDisposable(i18);
                    return;
                }
                return;
        }
    }
}
