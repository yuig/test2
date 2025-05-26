package k81;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.um;
import com.pinterest.feature.search.visual.PinchToZoomTransitionContext;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.blurView.BlurView;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.view.MaskedWebImageView;
import com.pinterest.ui.view.TopBottomGradientView;
import df.j1;
import h32.u0;
import h32.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jq.n;
import kh2.b0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.s0;
import m60.w;
import m60.x0;
import nx.d0;
import nx.d1;
import oq.c0;
import r72.i1;
import rl2.g0;
import rm1.q;
import s71.o;
import tb0.p;
import ye2.m;
import zp.y0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f78599j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l lVar, int i13) {
        super(1);
        this.f78598i = i13;
        this.f78599j = lVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f78598i;
        l lVar = this.f78599j;
        switch (i13) {
            case 1:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(th3, a.a.j("Error loading Pin in FlashlightPresenter with pin id ", lVar.f78611c), p.FLASHLIGHT);
                break;
            default:
                w81.d dVar = lVar.f78629l;
                if (dVar != null) {
                    dVar.h();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view;
        PinchToZoomTransitionContext pinchToZoomTransitionContext;
        String s53;
        ArrayList<st1.a> arrayList;
        ArrayList arrayList2;
        w81.d dVar;
        int i13 = this.f78598i;
        l lVar = this.f78599j;
        ArrayList arrayList3 = null;
        switch (i13) {
            case 0:
                f30 f30Var = (f30) obj;
                if (lVar.isBound()) {
                    lVar.K = f30Var;
                    Intrinsics.f(f30Var);
                    List q13 = g0.q(f30Var);
                    if (!q13.isEmpty()) {
                        um galleryItem = (um) q13.get(0);
                        f30 f30Var2 = lVar.K;
                        if (f30Var2 != null) {
                            lVar.L.add(f30Var2);
                        }
                        i81.d dVar2 = (i81.d) lVar.getViewIfBound();
                        if (dVar2 != null) {
                            l81.l lVar2 = (l81.l) dVar2;
                            Intrinsics.checkNotNullParameter(galleryItem, "galleryItem");
                            Context context = lVar2.getContext();
                            if (context != null) {
                                Context context2 = lVar2.getContext();
                                if (context2 != null) {
                                    PinchToZoomTransitionContext pinchToZoomTransitionContext2 = lVar2.f82183s1;
                                    int i14 = pinchToZoomTransitionContext2 != null ? pinchToZoomTransitionContext2.f47929f : (int) lVar2.f82153c2;
                                    lVar2.f82162h2 = lVar2.w9() ? ql2.s.a((lVar2.f82164i2 - i14) / 2.0f, 0.0f) : 0.0f;
                                    PinchToZoomTransitionContext pinchToZoomTransitionContext3 = lVar2.f82183s1;
                                    Float valueOf = pinchToZoomTransitionContext3 != null ? Float.valueOf(pinchToZoomTransitionContext3.f47926c) : null;
                                    if (valueOf != null) {
                                        f91.b bVar = new f91.b((m) context2, (int) lVar2.f82164i2, valueOf.floatValue(), lVar2, lVar2, lVar2.f82183s1 != null ? Float.valueOf(r9.f47927d) : null, i14, lVar2.f82153c2, lVar2.G2, lVar2.w9(), lVar2.x9(), galleryItem.f42584a);
                                        c0.x(bVar, galleryItem, false, null, true, 14);
                                        lVar2.E1 = bVar;
                                    }
                                }
                                f91.b bVar2 = lVar2.E1;
                                if (bVar2 != null) {
                                    ca2.e eVar = lVar2.f82176o2;
                                    if (eVar != null) {
                                        eVar.f27259r = lVar2.f82184s2;
                                    }
                                    if (lVar2.f82189v1 != i81.e.FLASHLIGHT || lVar2.s9().f()) {
                                        FrameLayout frameLayout = lVar2.D1;
                                        if (frameLayout == null) {
                                            Intrinsics.r("zoomableImageRootContainer");
                                            throw null;
                                        }
                                        frameLayout.addView(bVar2, -1, lVar2.y9());
                                        TopBottomGradientView topBottomGradientView = lVar2.J1;
                                        if (topBottomGradientView != null) {
                                            topBottomGradientView.bringToFront();
                                        }
                                    } else {
                                        lVar2.k9();
                                    }
                                    FrameLayout frameLayout2 = lVar2.D1;
                                    if (frameLayout2 == null) {
                                        Intrinsics.r("zoomableImageRootContainer");
                                        throw null;
                                    }
                                    frameLayout2.getLayoutParams().height = lVar2.y9();
                                    bVar2.getLayoutParams().height = lVar2.y9();
                                    bVar2.setOnClickListener(new l81.a(lVar2, 2));
                                }
                                gw gwVar = fw.f37821a;
                                String str = lVar2.f82185t1;
                                gwVar.getClass();
                                final f30 d2 = gw.d(str);
                                if (d2 != null && (pinchToZoomTransitionContext = lVar2.f82183s1) != null && pinchToZoomTransitionContext.f47930g) {
                                    String u33 = d2.u3();
                                    if (u33 == null || u33.length() == 0) {
                                        String x53 = d2.x5();
                                        if (x53 != null && x53.length() != 0) {
                                            wk2.a aVar = lVar2.T0;
                                            if (aVar == null) {
                                                Intrinsics.r("chromeTabSupportedCheckProvider");
                                                throw null;
                                            }
                                            if (!((z70.p) aVar.get()).f141018a.f140992a) {
                                                s53 = d2.x5();
                                            }
                                        }
                                        String D6 = d2.D6();
                                        if (D6 == null || D6.length() == 0) {
                                            String s54 = d2.s5();
                                            s53 = (s54 == null || s54.length() == 0) ? null : d2.s5();
                                        } else {
                                            s53 = d2.D6();
                                        }
                                    } else {
                                        s53 = d2.u3();
                                    }
                                    if (s53 == null) {
                                        d0 s73 = lVar2.s7();
                                        c2 c2Var = lVar2.f82175o1;
                                        if (c2Var == null) {
                                            Intrinsics.r("sharesheetUtils");
                                            throw null;
                                        }
                                        float f13 = n.f77453a;
                                        m mVar = (m) context;
                                        GestaltIconButton a13 = n.a(mVar, q.ANDROID_SHARE, Boolean.TRUE, new y0(s73, c2Var, d2, 1), zy1.a.send_bt, x0.share_pin);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                        layoutParams.gravity = 8388661;
                                        int i15 = (int) n.f77453a;
                                        com.bumptech.glide.c.a1(layoutParams, i15, i15, i15, i15);
                                        a13.setLayoutParams(layoutParams);
                                        FrameLayout frameLayout3 = lVar2.D1;
                                        if (frameLayout3 == null) {
                                            Intrinsics.r("zoomableImageRootContainer");
                                            throw null;
                                        }
                                        frameLayout3.addView(a13);
                                        lVar2.O1 = a13;
                                        final b60.b activeUserManager = lVar2.getActiveUserManager();
                                        final w f73 = lVar2.f7();
                                        final d0 s74 = lVar2.s7();
                                        final d1 z73 = lVar2.z7();
                                        boolean[] zArr = d2.f37485h3;
                                        final int value = (zArr.length <= 198 || !zArr[198]) ? ml1.b.NO_TRANSITION.getValue() : ml1.b.DEFAULT_TRANSITION.getValue();
                                        GestaltIconButton a14 = n.a(mVar, q.SPEECH_OUTLINE, Boolean.valueOf(!d2.Q3().booleanValue()), new View.OnClickListener() { // from class: jq.k
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                u0 u0Var = u0.COMMENTS_BUTTON;
                                                h32.g0 g0Var = h32.g0.NAVIGATION;
                                                d0 d0Var = d0.this;
                                                d0Var.F(g0Var, u0Var);
                                                HashMap hashMap = new HashMap();
                                                f30 f30Var3 = d2;
                                                hashMap.put("pin_id", f30Var3.getUid());
                                                u0 u0Var2 = u0.PIN_COMMENT_BUTTON;
                                                h32.g0 g0Var2 = h32.g0.PIN_CLOSEUP_COMMENTS;
                                                v0 v0Var = new v0();
                                                v0Var.G = z73.b(f30Var3);
                                                ai0.a.b(f30Var3, f73, value, d0Var, hashMap, u0Var2, g0Var2, null, v0Var, view2.getResources(), activeUserManager, "", "", "", "", "", null, false, false, true);
                                            }
                                        }, uc2.d.comment_btn, x0.share_pin);
                                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                        layoutParams2.gravity = 8388661;
                                        com.bumptech.glide.c.a1(layoutParams2, i15, i15, ((int) n.f77454b) + ((int) n.f77455c), i15);
                                        a14.setLayoutParams(layoutParams2);
                                        FrameLayout frameLayout4 = lVar2.D1;
                                        if (frameLayout4 == null) {
                                            Intrinsics.r("zoomableImageRootContainer");
                                            throw null;
                                        }
                                        frameLayout4.addView(a14);
                                        lVar2.P1 = a14;
                                    }
                                }
                            }
                        }
                        if (lVar.f78619g) {
                            f30 f30Var3 = lVar.K;
                            if (j1.U0(f30Var3 != null ? f30Var3.i4() : null)) {
                                int parseColor = Color.parseColor(f30Var.i4());
                                i81.d dVar3 = (i81.d) lVar.getViewIfBound();
                                if (dVar3 != null) {
                                    l81.l lVar3 = (l81.l) dVar3;
                                    float f14 = lVar3.f82188u2 ? 7.0f : 1.5f;
                                    float[] fArr = new float[3];
                                    f5.c.f(parseColor, fArr);
                                    fArr[1] = ql2.s.f(fArr[1] * f14, 0.15f, 1.0f);
                                    fArr[2] = ql2.s.c(fArr[2] * 1.6f, 1.0f);
                                    int j13 = f5.c.j(f5.c.c(bs1.c.C(lVar3, eo1.b.color_themed_text_default), 0.5f, f5.c.a(fArr)), 38);
                                    GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = lVar3.f82151b2;
                                    if (gridPlaceholderLoadingLayout != null) {
                                        gridPlaceholderLoadingLayout.f52382n = Integer.valueOf(j13);
                                    }
                                }
                                i81.d dVar4 = (i81.d) lVar.getViewIfBound();
                                if (dVar4 != null) {
                                    l81.l lVar4 = (l81.l) dVar4;
                                    int C = bs1.c.C(lVar4, eo1.b.color_themed_background_default);
                                    int a15 = o.a((!lVar4.f82188u2 || lVar4.w9()) ? 9.0f : 1.5f, 1.3f, parseColor);
                                    if (lVar4.w9()) {
                                        BlurView blurView = lVar4.Y1;
                                        if (blurView != null) {
                                            int b13 = o.b(a15, C, lVar4.f82188u2 ? 0.4f : 0.3f, Float.valueOf(0.7f));
                                            blurView.a(b13);
                                            ViewGroup viewGroup = lVar4.C1;
                                            if (viewGroup == null) {
                                                Intrinsics.r("rootContainer");
                                                throw null;
                                            }
                                            BlurView.b(blurView, viewGroup, lVar4.f82182r2, true, null, 42).c(20.0f);
                                            lVar4.f82192w2 = Integer.valueOf(b13);
                                        }
                                        int b14 = o.b(o.a(lVar4.f82188u2 ? 3.0f : 1.5f, 1.6f, parseColor), bs1.c.C(lVar4, eo1.b.color_themed_text_default), 0.5f, null);
                                        lVar4.f82194x2 = Integer.valueOf(b14);
                                        da2.g gVar = lVar4.S1;
                                        if (gVar != null) {
                                            gVar.k(b14);
                                        }
                                    } else {
                                        View view2 = lVar4.Z1;
                                        if (view2 != null) {
                                            int b15 = o.b(a15, C, 0.4f, null);
                                            Drawable f03 = bs1.c.f0(view2, s0.rounded_top_rect_radius_40_default, null, null, 6);
                                            GradientDrawable gradientDrawable = f03 instanceof GradientDrawable ? (GradientDrawable) f03 : null;
                                            if (gradientDrawable != null) {
                                                gradientDrawable.setColor(b15);
                                                View view3 = lVar4.Z1;
                                                if (view3 != null) {
                                                    view3.setBackground(gradientDrawable);
                                                }
                                            }
                                            lVar4.f82192w2 = Integer.valueOf(b15);
                                        }
                                    }
                                    lVar4.z9();
                                }
                            } else {
                                i81.d dVar5 = (i81.d) lVar.getViewIfBound();
                                if (dVar5 != null) {
                                    l81.l lVar5 = (l81.l) dVar5;
                                    if (lVar5.w9()) {
                                        BlurView blurView2 = lVar5.Y1;
                                        if (blurView2 != null) {
                                            blurView2.a(bs1.c.B(blurView2, uc2.a.blur_bg_color));
                                            ViewGroup viewGroup2 = lVar5.C1;
                                            if (viewGroup2 == null) {
                                                Intrinsics.r("rootContainer");
                                                throw null;
                                            }
                                            BlurView.b(blurView2, viewGroup2, lVar5.f82182r2, true, null, 42).c(20.0f);
                                        }
                                    } else {
                                        ca2.e eVar2 = lVar5.f82176o2;
                                        if (eVar2 != null && (view = eVar2.f27254m) != null) {
                                            view.setBackgroundColor(bs1.c.C(lVar5, uc2.a.solid_bg_color));
                                        }
                                    }
                                    lVar5.z9();
                                }
                            }
                            if (lVar.f78641r) {
                                lVar.T.postDelayed(new a(lVar, 5), 10L);
                                i81.d dVar6 = (i81.d) lVar.getViewIfBound();
                                if (dVar6 != null) {
                                    String z43 = f30Var.z4();
                                    l81.l lVar6 = (l81.l) dVar6;
                                    String str2 = lVar6.f82187u1;
                                    if (str2 == null || str2.length() == 0) {
                                        lVar6.f82187u1 = z43;
                                    }
                                }
                            }
                        }
                    }
                }
                return Unit.f80348a;
            case 1:
                b((Throwable) obj);
                return Unit.f80348a;
            case 2:
                vd0.c response = (vd0.c) obj;
                Intrinsics.f(response);
                Intrinsics.checkNotNullParameter(response, "response");
                vd0.c m13 = response.m("data");
                vd0.a k13 = m13 != null ? m13.k("bitmap_masks") : null;
                if (k13 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = k13.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!((vd0.c) next).h("is_hidden", Boolean.FALSE).booleanValue()) {
                            arrayList4.add(next);
                        }
                    }
                    arrayList = new ArrayList(kotlin.collections.g0.q(arrayList4, 10));
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        vd0.c cVar = (vd0.c) it2.next();
                        Intrinsics.f(cVar);
                        r72.a c13 = o.c(cVar);
                        arrayList.add(new st1.a(new i1(b0.U1(c13), c13), false));
                    }
                } else {
                    arrayList = null;
                }
                st1.a aVar2 = arrayList != null ? (st1.a) CollectionsKt.f0(arrayList, al2.a.a(s71.n.f111399j, s71.n.f111400k)) : null;
                if (k13 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = k13.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        Boolean h10 = ((vd0.c) next2).h("is_hidden", Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
                        if (h10.booleanValue()) {
                            arrayList5.add(next2);
                        }
                    }
                    arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList5, 10));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        vd0.c cVar2 = (vd0.c) it4.next();
                        Intrinsics.f(cVar2);
                        r72.a c14 = o.c(cVar2);
                        arrayList2.add(new st1.a(new i1(b0.U1(c14), c14), false));
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList != null) {
                    arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                    for (st1.a aVar3 : arrayList) {
                        arrayList3.add(st1.a.a(aVar3, Intrinsics.d(aVar3, aVar2)));
                    }
                }
                st1.b model = new st1.b(arrayList2, arrayList3);
                lVar.M = model;
                i81.d dVar7 = (i81.d) lVar.getViewIfBound();
                if (dVar7 != null) {
                    l81.l lVar7 = (l81.l) dVar7;
                    Intrinsics.checkNotNullParameter(model, "model");
                    MaskedWebImageView t93 = lVar7.t9();
                    if (t93 != null) {
                        t93.d3(lVar7.N2);
                        t93.X2(model, !lVar7.s9().e(), lVar7.I2, lVar7.J2);
                        t93.f52694r0 = lVar7.x9();
                        if (lVar7.x9()) {
                            t93.Z2(lVar7);
                        }
                        t93.f52698v0 = lVar7.f82164i2;
                        t93.M = true;
                    }
                }
                return Unit.f80348a;
            case 3:
                wt1.c0 c0Var = (wt1.c0) obj;
                if ((c0Var instanceof wt1.k) || (c0Var instanceof wt1.s)) {
                    w81.d dVar8 = lVar.f78629l;
                    if (dVar8 != null) {
                        dVar8.j();
                    }
                } else if (c0Var instanceof wt1.p) {
                    w81.d dVar9 = lVar.f78629l;
                    if (dVar9 != null) {
                        dVar9.a();
                    }
                    lVar.U.h("Flashlight results loaded");
                } else if ((c0Var instanceof wt1.i) && (dVar = lVar.f78629l) != null) {
                    dVar.h();
                }
                return Unit.f80348a;
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
