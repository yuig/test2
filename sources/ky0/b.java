package ky0;

import a11.n;
import a11.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c0.d;
import c01.e;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.lx0;
import com.pinterest.api.model.p20;
import com.pinterest.api.model.qj0;
import com.pinterest.api.model.qz;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.rp;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pear.screen.PearLocation;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.pin.t;
import com.pinterest.framework.screens.x;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.f1;
import h32.g0;
import h32.u0;
import i01.b0;
import i01.c0;
import i01.j;
import i01.p0;
import i11.m;
import j40.e0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import jk2.d1;
import kk2.k;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import m60.w;
import nx.d0;
import p11.l;
import qf1.p;
import rm1.q;
import rq.e3;
import rq.f2;
import rq.o;
import rq.p2;
import rq.r3;
import rq.y;
import rq.y0;
import rq.z;
import t11.f;
import u50.h;
import u50.i0;
import w01.f0;
import wm1.k0;
import x02.i2;
import y01.h0;
import yl1.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81122i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f81123j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f81124k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        super(1);
        this.f81122i = i13;
        this.f81123j = obj;
        this.f81124k = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r6 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yl1.b b(yl1.b r13) {
        /*
            r12 = this;
            int r1 = r12.f81122i
            java.lang.Object r2 = r12.f81124k
            java.lang.Object r3 = r12.f81123j
            java.lang.String r4 = "it"
            switch(r1) {
                case 9: goto L2f;
                default: goto Lb;
            }
        Lb:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView r3 = (com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView) r3
            android.content.res.Resources r1 = r3.getResources()
            kotlin.jvm.internal.h0 r2 = (kotlin.jvm.internal.h0) r2
            int r2 = r2.f80426a
            java.lang.String r3 = "getString(...)"
            u50.f0 r1 = d7.g.q(r1, r2, r3)
            r8 = 0
            r11 = 1022(0x3fe, float:1.432E-42)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r0 = r13
            yl1.b r0 = yl1.b.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L2f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            q01.w r3 = (q01.w) r3
            q01.s r1 = r3.f101838d
            int[] r4 = q01.v.f101833a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L58
            r2 = 2
            if (r1 == r2) goto L50
            r2 = 3
            if (r1 != r2) goto L4a
            u50.h0 r1 = u50.h0.f120562a
            goto L92
        L4a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L50:
            u50.k0 r1 = new u50.k0
            int r2 = n80.f.related_pins_filtered_feed_reload
            r1.<init>(r2)
            goto L92
        L58:
            u50.k0 r1 = new u50.k0
            int r5 = n80.f.related_pins_filtered_feed_reset_last_selection_button
            java.lang.String[] r4 = new java.lang.String[r4]
            o01.h r2 = (o01.h) r2
            boolean r6 = r2 instanceof o01.e
            r7 = 0
            if (r6 == 0) goto L68
            o01.e r2 = (o01.e) r2
            goto L69
        L68:
            r2 = r7
        L69:
            if (r2 == 0) goto L7d
            java.lang.Integer r6 = r2.f92753b
            if (r6 == 0) goto L7d
            int r6 = r6.intValue()
            android.content.Context r8 = r3.getContext()
            java.lang.String r6 = r8.getString(r6)
            if (r6 != 0) goto L87
        L7d:
            if (r2 == 0) goto L81
            java.lang.String r7 = r2.f92752a
        L81:
            if (r7 != 0) goto L86
            java.lang.String r6 = ""
            goto L87
        L86:
            r6 = r7
        L87:
            java.lang.String r2 = "with(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r2 = 0
            r4[r2] = r6
            r1.<init>(r4, r5)
        L92:
            q01.s r2 = r3.f101838d
            q01.s r3 = q01.s.FOOTER
            if (r2 != r3) goto L9c
            fm1.c r2 = fm1.c.GONE
        L9a:
            r3 = r2
            goto L9f
        L9c:
            fm1.c r2 = fm1.c.VISIBLE
            goto L9a
        L9f:
            r8 = 0
            r11 = 1018(0x3fa, float:1.427E-42)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r0 = r13
            yl1.b r0 = yl1.b.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.b.b(yl1.b):yl1.b");
    }

    public final void e(p20 style) {
        int i13 = this.f81122i;
        Object obj = this.f81124k;
        Object obj2 = this.f81123j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(style, "style");
                String r13 = style.r();
                if (r13 == null || r13.length() == 0) {
                    return;
                }
                e eVar = (e) obj2;
                d0 d0Var = eVar.f24432i;
                if (d0Var != null) {
                    f1 f1Var = f1.TAP;
                    g0 g0Var = g0.PEAR_STYLE_PILLS;
                    u0 u0Var = u0.PEAR_STYLE_PILL;
                    HashMap hashMap = new HashMap();
                    hashMap.put("style_id", style.r());
                    String q13 = style.q();
                    hashMap.put("style_name", q13 != null ? q13 : "");
                    Unit unit = Unit.f80348a;
                    d.t2(d0Var, f1Var, g0Var, u0Var, hashMap);
                }
                w wVar = eVar.f24426c;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                NavigationImpl w13 = Navigation.w1(PearLocation.PEAR_STYLE_EXPLORER);
                w13.m0("com.pinterest.EXTRA_STYLE_ID", style.r());
                w13.m0("com.pinterest.EXTRA_SOURCE_STYLE_ID", ((p20) obj).r());
                w13.m0("com.pinterest.EXTRA_SOURCE_PIN_ID", eVar.f24434k);
                w13.z(eVar.f24433j + 1, "com.pinterest.EXTRA_DEPTH");
                wVar.d(w13);
                return;
            default:
                Intrinsics.checkNotNullParameter(style, "style");
                String n13 = style.n();
                e eVar2 = (e) obj2;
                f1 f1Var2 = f1.TAP;
                String q14 = style.q();
                if (q14 == null) {
                    q14 = "";
                }
                String str = n13 != null ? n13 : "";
                int i14 = e.f24423l;
                eVar2.L(f1Var2, q14, str);
                if (n13 == null || n13.length() == 0) {
                    return;
                }
                w wVar2 = eVar2.f24426c;
                if (wVar2 == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                String uid = ((h20) obj).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                ig1.b.R0(wVar2, n13, uid);
                return;
        }
    }

    public final void f(f30 validPin) {
        wy0 e13;
        int i13 = this.f81122i;
        Object obj = this.f81124k;
        Object obj2 = this.f81123j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(validPin, "validPin");
                f0 f0Var = (f0) obj2;
                if (f0Var.isBound()) {
                    ((e3) ((b0) f0Var.getView())).k(validPin, (HashMap) obj);
                    break;
                }
                break;
            default:
                f fVar = (f) obj2;
                i2 i2Var = fVar.f115806f;
                e30 R6 = validPin.R6();
                wy0 Q = com.bumptech.glide.d.Q(fVar.f115803c);
                rj0 rj0Var = (rj0) obj;
                rj0 rj0Var2 = null;
                String uid = (rj0Var == null || (e13 = rj0Var.e()) == null) ? null : e13.getUid();
                if (uid == null) {
                    uid = "";
                }
                if (dl2.b.S1(Q, uid) && rj0Var != null) {
                    qj0 qj0Var = new qj0(rj0Var, 0);
                    qj0Var.c(null);
                    rj0Var2 = qj0Var.a();
                }
                R6.l2(rj0Var2);
                f30 a13 = R6.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                i2Var.W(a13);
                String uid2 = validPin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                fVar.f115802b.d(new pg0.b0(uid2));
                ((u11.c) ((q11.d) fVar.getView())).T8(q82.a.sponsored_pins_remove_partnership_success);
                break;
        }
    }

    public final void h(wy0 wy0Var) {
        rf1.b metadata;
        rf1.b metadata2;
        rf1.b metadata3;
        int i13 = this.f81122i;
        int i14 = 0;
        Object obj = this.f81124k;
        Object obj2 = this.f81123j;
        switch (i13) {
            case 10:
                w01.c cVar = (w01.c) obj2;
                Intrinsics.f(wy0Var);
                f30 X2 = d.X2((f30) obj, wy0Var);
                if (cVar.isBound()) {
                    rq.b0 b0Var = (rq.b0) ((j) cVar.getView());
                    b0Var.getClass();
                    b0Var.f109112g.i(new y(i14, wy0Var));
                    if (b40.Q0(X2)) {
                        rj0 u63 = X2.u6();
                        wy0 e13 = u63 != null ? u63.e() : null;
                        es.a aVar = cVar.f126982g;
                        boolean T = ((es.c) aVar).T(X2);
                        rf1.d dVar = cVar.f126979d;
                        if (!T || e13 == null) {
                            metadata = (!p.d(X2, aVar) || u63 == null) ? (!b40.w(X2) || ((Boolean) cVar.f126984i.getValue()).booleanValue()) ? null : dVar.a(wy0Var, cVar.f126981f.r()) : dVar.c(u63);
                        } else {
                            a11.b bVar = cVar.f126980e;
                            if (bVar == null) {
                                bVar = a11.b.Feed;
                            }
                            metadata = dVar.b(e13, bVar);
                        }
                        if (metadata != null) {
                            rq.b0 b0Var2 = (rq.b0) ((j) cVar.getView());
                            b0Var2.getClass();
                            Intrinsics.checkNotNullParameter(metadata, "metadata");
                            if (metadata.f64745a.length() > 0) {
                                if (b0Var2.f109113h == null) {
                                    Context context = b0Var2.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                                    layoutParams.f17673j = b0Var2.f109112g.getId();
                                    layoutParams.f17691t = 0;
                                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bs1.c.W(gestaltText, eo1.c.space_400);
                                    gestaltText.setLayoutParams(layoutParams);
                                    gestaltText.i(o.f109410q);
                                    bs1.c.X0(gestaltText);
                                    b0Var2.f109111f.addView(gestaltText);
                                    b0Var2.f109113h = gestaltText;
                                    b0Var2.getPaddingRect().bottom = bs1.c.W(b0Var2, eo1.c.space_200);
                                }
                                GestaltText gestaltText2 = b0Var2.f109113h;
                                if (gestaltText2 == null) {
                                    Intrinsics.r("creatorMetadata");
                                    throw null;
                                }
                                gestaltText2.i(new z(metadata, i14));
                                GestaltText gestaltText3 = b0Var2.f109113h;
                                if (gestaltText3 == null) {
                                    Intrinsics.r("creatorMetadata");
                                    throw null;
                                }
                                bs1.c.U1(gestaltText3);
                            }
                        }
                    }
                }
                cVar.f126977b = X2;
                return;
            case 11:
                w01.d dVar2 = (w01.d) obj2;
                f30 f30Var = (f30) obj;
                if (dVar2.isBound()) {
                    i01.s sVar = (i01.s) dVar2.getView();
                    if (wy0Var != null) {
                        ((y0) sVar).f109665k = wy0Var;
                    }
                    String h43 = f30Var.h4();
                    ((y0) sVar).e(h43 != null ? h43 : "");
                    if (wy0Var == null || !b40.Q0(f30Var)) {
                        return;
                    }
                    rj0 u64 = f30Var.u6();
                    wy0 e14 = u64 != null ? u64.e() : null;
                    es.a aVar2 = dVar2.f126991f;
                    boolean T2 = ((es.c) aVar2).T(f30Var);
                    rf1.d dVar3 = dVar2.f126990e;
                    if (!T2 || e14 == null) {
                        metadata2 = (!p.d(f30Var, aVar2) || u64 == null) ? (!b40.w(f30Var) || ((Boolean) dVar2.f126993h.getValue()).booleanValue()) ? null : dVar3.a(wy0Var, dVar2.f126989d.r()) : dVar3.c(u64);
                    } else {
                        a11.b bVar2 = dVar2.f126988c;
                        if (bVar2 == null) {
                            bVar2 = a11.b.Feed;
                        }
                        metadata2 = dVar3.b(e14, bVar2);
                    }
                    if (metadata2 != null) {
                        y0 y0Var = (y0) ((i01.s) dVar2.getView());
                        y0Var.getClass();
                        Intrinsics.checkNotNullParameter(metadata2, "metadata");
                        if (metadata2.f64745a.length() > 0) {
                            if (y0Var.f109666l == null) {
                                Context context2 = y0Var.getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                GestaltText gestaltText4 = new GestaltText(6, context2, (AttributeSet) null);
                                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = bs1.c.W(gestaltText4, eo1.c.space_400);
                                gestaltText4.setLayoutParams(layoutParams2);
                                gestaltText4.i(o.f109417x);
                                bs1.c.X0(gestaltText4);
                                y0Var.addView(gestaltText4);
                                y0Var.f109666l = gestaltText4;
                                y0Var.getPaddingRect().bottom = bs1.c.W(y0Var, eo1.c.space_200);
                            }
                            GestaltText gestaltText5 = y0Var.f109666l;
                            if (gestaltText5 == null) {
                                Intrinsics.r("creatorMetadata");
                                throw null;
                            }
                            gestaltText5.i(new z(metadata2, 1));
                            GestaltText gestaltText6 = y0Var.f109666l;
                            if (gestaltText6 != null) {
                                bs1.c.U1(gestaltText6);
                                return;
                            } else {
                                Intrinsics.r("creatorMetadata");
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                w01.c cVar2 = (w01.c) obj2;
                Intrinsics.f(wy0Var);
                f30 X22 = d.X2((f30) obj, wy0Var);
                if (cVar2.isBound()) {
                    r3 r3Var = (r3) ((c0) cVar2.getView());
                    r3Var.f109521n = wy0Var;
                    String h44 = X22.h4();
                    r3Var.n(h44 != null ? h44 : "");
                    if (b40.Q0(X22)) {
                        rj0 u65 = X22.u6();
                        wy0 e15 = u65 != null ? u65.e() : null;
                        es.a aVar3 = cVar2.f126982g;
                        boolean T3 = ((es.c) aVar3).T(X22);
                        rf1.d dVar4 = cVar2.f126979d;
                        if (!T3 || e15 == null) {
                            metadata3 = (!p.d(X22, aVar3) || u65 == null) ? (!b40.w(X22) || ((Boolean) cVar2.f126984i.getValue()).booleanValue()) ? null : dVar4.a(wy0Var, cVar2.f126981f.r()) : dVar4.c(u65);
                        } else {
                            a11.b bVar3 = cVar2.f126980e;
                            if (bVar3 == null) {
                                bVar3 = a11.b.Feed;
                            }
                            metadata3 = dVar4.b(e15, bVar3);
                        }
                        if (metadata3 != null) {
                            r3 r3Var2 = (r3) ((c0) cVar2.getView());
                            r3Var2.getClass();
                            Intrinsics.checkNotNullParameter(metadata3, "metadata");
                            if (metadata3.f64745a.length() > 0) {
                                if (r3Var2.f109516i == null) {
                                    Context context3 = r3Var2.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    GestaltText gestaltText7 = new GestaltText(6, context3, (AttributeSet) null);
                                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                                    layoutParams3.f17673j = r3Var2.f109515h.getId();
                                    layoutParams3.f17691t = 0;
                                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = bs1.c.W(gestaltText7, eo1.c.space_400);
                                    gestaltText7.setLayoutParams(layoutParams3);
                                    gestaltText7.i(f2.f109198z);
                                    bs1.c.X0(gestaltText7);
                                    r3Var2.f109514g.addView(gestaltText7);
                                    r3Var2.f109516i = gestaltText7;
                                    r3Var2.getPaddingRect().bottom = bs1.c.W(r3Var2, eo1.c.space_200);
                                }
                                GestaltText gestaltText8 = r3Var2.f109516i;
                                if (gestaltText8 == null) {
                                    Intrinsics.r("creatorMetadata");
                                    throw null;
                                }
                                gestaltText8.i(new z(metadata3, 2));
                                GestaltText gestaltText9 = r3Var2.f109516i;
                                if (gestaltText9 == null) {
                                    Intrinsics.r("creatorMetadata");
                                    throw null;
                                }
                                bs1.c.U1(gestaltText9);
                            }
                        }
                    }
                }
                cVar2.f126977b = X22;
                return;
        }
    }

    public final void i(Long l13) {
        int i13 = this.f81122i;
        Object obj = this.f81124k;
        Object obj2 = this.f81123j;
        switch (i13) {
            case 22:
                m mVar = (m) obj2;
                if (mVar.isBound()) {
                    ((l11.j) ((f11.d) mVar.getView())).dismiss();
                    if (mVar.f71025z) {
                        f30 f30Var = (f30) obj;
                        e30 R6 = f30Var.R6();
                        R6.D1(Boolean.TRUE);
                        f30 a13 = R6.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                        mVar.f71001g.d(new t(a13, rl2.g0.U(f30Var) ? null : mVar.A, true));
                        return;
                    }
                    return;
                }
                return;
            default:
                Calendar calendar = (Calendar) obj2;
                Intrinsics.f(l13);
                calendar.setTimeInMillis(l13.longValue());
                o11.a aVar = ((l) obj).f98663n0;
                if (aVar != null) {
                    aVar.q3(calendar.get(1), calendar.get(2), calendar.get(5));
                    return;
                } else {
                    Intrinsics.r("pageListener");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String p03;
        f30 f30Var;
        f30 f30Var2;
        String str2;
        int i13 = this.f81122i;
        Object obj2 = this.f81124k;
        Object obj3 = this.f81123j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((Long) obj, "it");
                oc.a c13 = ((c) obj3).f81126b.c((e0) obj2);
                d7.b.E(c13, vc.f.NetworkOnly);
                return kotlin.jvm.internal.j.b(d7.b.H0(c13));
            case 1:
                yy0.d it = (yy0.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List<qz> list = (List) obj3;
                l82.e eVar = (l82.e) obj2;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (qz qzVar : list) {
                    String uid = qzVar.getUid();
                    if (((yy0.d0) eVar.f82219b).f140442f) {
                        List<f30> q13 = qzVar.q();
                        Intrinsics.checkNotNullExpressionValue(q13, "getPins(...)");
                        ArrayList arrayList2 = new ArrayList();
                        for (f30 f30Var3 : q13) {
                            Intrinsics.f(f30Var3);
                            String p04 = bs1.c.p0(f30Var3);
                            if (p04 != null) {
                                arrayList2.add(p04);
                            }
                        }
                        p03 = (String) CollectionsKt.firstOrNull(arrayList2);
                    } else {
                        f30 n13 = qzVar.n();
                        if (n13 != null) {
                            p03 = bs1.c.p0(n13);
                        } else {
                            str = null;
                            i0 a13 = qy0.c.a(qzVar, ((yy0.d0) eVar.f82219b).f140441e);
                            String colorString = qzVar.k();
                            Intrinsics.checkNotNullExpressionValue(colorString, "getBackgroundColor(...)");
                            Intrinsics.checkNotNullParameter(colorString, "colorString");
                            h hVar = new h(colorString);
                            boolean z13 = ((yy0.d0) eVar.f82219b).f140440d;
                            Intrinsics.f(uid);
                            arrayList.add(new yy0.f0(uid, str, a13, hVar, false, z13));
                        }
                    }
                    str = p03;
                    i0 a132 = qy0.c.a(qzVar, ((yy0.d0) eVar.f82219b).f140441e);
                    String colorString2 = qzVar.k();
                    Intrinsics.checkNotNullExpressionValue(colorString2, "getBackgroundColor(...)");
                    Intrinsics.checkNotNullParameter(colorString2, "colorString");
                    h hVar2 = new h(colorString2);
                    boolean z132 = ((yy0.d0) eVar.f82219b).f140440d;
                    Intrinsics.f(uid);
                    arrayList.add(new yy0.f0(uid, str, a132, hVar2, false, z132));
                }
                return yy0.d.e(it, arrayList, null, null, null, 14);
            case 2:
                e((p20) obj);
                return Unit.f80348a;
            case 3:
                e((p20) obj);
                return Unit.f80348a;
            case 4:
                k0 bind = (k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.y startItem = new wm1.y(q.LIGHTBULB);
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind.f130311b = startItem;
                String M = ((h20) obj3).M();
                String str3 = M != null ? M : "";
                String str4 = (String) obj2;
                wm1.q middleItem = new wm1.q(ep.b.x(str3, "string", str3), ep.b.x(str4, "string", str4), false, 4);
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                wm1.h endItem = new wm1.h(wm1.d.ARROW_FORWARD);
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                return Unit.f80348a;
            case 5:
                return Float.valueOf(((com.pinterest.feature.pin.d) obj3).f((View) obj2, ((Number) obj).intValue()));
            case 6:
                ((com.pinterest.feature.pin.j) obj3).f47230d.d(new zf0.e((f30) obj2));
                return Unit.f80348a;
            case 7:
                View view = (View) obj;
                j0 j0Var = new j0();
                j0 j0Var2 = new j0();
                j0 j0Var3 = new j0();
                com.pinterest.feature.pin.o oVar = (com.pinterest.feature.pin.o) obj3;
                com.pinterest.framework.screens.s sVar = oVar.f47249b.f80914l;
                x j13 = sVar != null ? sVar.j() : null;
                return new com.pinterest.feature.pin.m(j0Var, oVar, j0Var2, j0Var3, j13 instanceof MvpViewPagerFragment ? (MvpViewPagerFragment) j13 : null, view, (f30) obj2);
            case 8:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                p0 p0Var = (p0) obj3;
                f30 f30Var4 = (f30) obj2;
                return new d1(((dh0.d) p0Var.f70688b).g(i32.y0.ANDROID_PIN_CLOSEUP_AFTER_SAVE, z0.g(new Pair(rg0.o.CONTEXT_PIN_ID.getValue(), f30Var4.getUid()), new Pair(rg0.o.CONTEXT_BOARD_ID.getValue(), board.getUid()), new Pair(rg0.o.IS_PROMOTED.getValue(), String.valueOf(f30Var4.d5().booleanValue())), new Pair(rg0.o.SCOPE.getValue(), "local_upsell_takeover")), new tg0.c(false, false))).c(new k(new com.airbnb.lottie.j(p0Var, f30Var4, board, 3), 1));
            case 9:
                return b((yl1.b) obj);
            case 10:
                h((wy0) obj);
                return Unit.f80348a;
            case 11:
                h((wy0) obj);
                return Unit.f80348a;
            case 12:
                f30 local = (f30) obj;
                Intrinsics.checkNotNullParameter(local, "local");
                j0 j0Var4 = (j0) obj3;
                PinCloseupPresenter pinCloseupPresenter = (PinCloseupPresenter) obj2;
                f30Var = pinCloseupPresenter.pin;
                String r43 = f30Var != null ? f30Var.r4() : null;
                f30Var2 = pinCloseupPresenter.pin;
                String c43 = f30Var2 != null ? f30Var2.c4() : null;
                Set set = b40.f35967a;
                Intrinsics.checkNotNullParameter(local, "<this>");
                e30 R6 = local.R6();
                R6.f37103i0 = r43;
                boolean[] zArr = R6.f37101h3;
                if (zArr.length > 60) {
                    zArr[60] = true;
                }
                R6.M(c43);
                f30 a14 = R6.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                j0Var4.f80434a = a14;
                return a14;
            case 13:
                j((tt1.a) obj);
                return Unit.f80348a;
            case 14:
                f((f30) obj);
                return Unit.f80348a;
            case 15:
                h((wy0) obj);
                return Unit.f80348a;
            case 16:
                h0 it2 = (h0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return h0.e(it2, null, new y01.d0((Integer) ((j0) obj3).f80434a, (u) obj2), 1);
            case 17:
                ((n) obj3).f321b.j((a11.l) obj2);
                return Unit.f80348a;
            case 18:
                cm1.d it3 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                yl1.b bVar = it3.f28012a;
                yl1.e eVar2 = yl1.e.FULL_WIDTH;
                return cm1.d.e(it3, yl1.b.f(bVar, null, false, fm1.c.GONE, null, i.a(), null, null, null, 0, eVar2, 491), yl1.b.f(it3.f28013b, null, false, (fm1.c) obj3, null, i.b(), null, null, null, 0, eVar2, 491), (yl1.c) obj2, null, null, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
            case 19:
                Integer num = (Integer) obj;
                int dimensionPixelSize = ((PinCloseupFragment) obj3).getResources().getDimensionPixelSize(eo1.c.space_200);
                androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) obj2;
                if (cVar != null) {
                    cVar.setMargins(((ViewGroup.MarginLayoutParams) cVar).leftMargin, ((ViewGroup.MarginLayoutParams) cVar).topMargin, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, num.intValue() + dimensionPixelSize);
                }
                return Unit.f80348a;
            case 20:
                nn1.b it4 = (nn1.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                String str5 = (String) obj3;
                return nn1.b.e(it4, ep.b.x(str5, "string", str5), (yl1.c) obj2, null, 446);
            case 21:
                return b((yl1.b) obj);
            case 22:
                i((Long) obj);
                return Unit.f80348a;
            case 23:
                ln0 ln0Var = (ln0) obj;
                Intrinsics.f(ln0Var);
                ((dl1.l) ((i11.u) obj2).f71055l0).W(ln0.a(ln0Var, null, null, null, null, ((h11.d) obj3).f66457a, null, false, null, null, null, null, 16287));
                return Unit.f80348a;
            case 24:
                k11.j it5 = (k11.j) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                String saveSessionId = (String) obj3;
                Intrinsics.checkNotNullExpressionValue(saveSessionId, "$sessionId");
                l11.j jVar = (l11.j) obj2;
                String str6 = jVar.O1;
                String str7 = jVar.P1;
                it5.getClass();
                Intrinsics.checkNotNullParameter(saveSessionId, "saveSessionId");
                return new k11.j(saveSessionId, str6, str7);
            case 25:
                i((Long) obj);
                return Unit.f80348a;
            case 26:
                j((tt1.a) obj);
                return Unit.f80348a;
            case 27:
                Pair pair = (Pair) obj;
                Object obj4 = pair.f80346a;
                Intrinsics.checkNotNullExpressionValue(obj4, "<get-first>(...)");
                ba baVar = (ba) obj4;
                Object obj5 = pair.f80347b;
                Intrinsics.checkNotNullExpressionValue(obj5, "<get-second>(...)");
                v7 v7Var = (v7) obj5;
                f fVar = (f) obj3;
                if (Intrinsics.d(fVar.f115801a.z(aq.d.SECTION_ID), ((ba) obj2).getUid())) {
                    s11.c cVar2 = fVar.f115811k;
                    if (cVar2 == null) {
                        Intrinsics.r("editablePinFieldSource");
                        throw null;
                    }
                    aq.d dVar = aq.d.BOARD_ID;
                    String j14 = v7Var.j1();
                    Intrinsics.checkNotNullExpressionValue(j14, "getName(...)");
                    cVar2.x(dVar, j14);
                    s11.c cVar3 = fVar.f115811k;
                    if (cVar3 == null) {
                        Intrinsics.r("editablePinFieldSource");
                        throw null;
                    }
                    String A = baVar.A();
                    Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
                    cVar3.w(A);
                }
                return Unit.f80348a;
            case 28:
                v7 v7Var2 = (v7) obj;
                f fVar2 = (f) obj3;
                aq.j jVar2 = fVar2.f115801a;
                aq.d dVar2 = aq.d.BOARD_ID;
                if (Intrinsics.d(jVar2.z(dVar2), ((v7) obj2).getUid())) {
                    s11.c cVar4 = fVar2.f115811k;
                    if (cVar4 == null) {
                        Intrinsics.r("editablePinFieldSource");
                        throw null;
                    }
                    Intrinsics.f(v7Var2);
                    if (kh2.d.I0(v7Var2)) {
                        str2 = ((yk1.a) fVar2.f115804d).f139224a.getString(ry1.f.pin_edit_choose_a_board);
                    } else {
                        String j15 = v7Var2.j1();
                        Intrinsics.checkNotNullExpressionValue(j15, "getName(...)");
                        str2 = j15;
                    }
                    cVar4.x(dVar2, str2);
                    Integer q14 = v7Var2.q1();
                    Intrinsics.checkNotNullExpressionValue(q14, "getSectionCount(...)");
                    if (q14.intValue() > 0) {
                        s11.c cVar5 = fVar2.f115811k;
                        if (cVar5 == null) {
                            Intrinsics.r("editablePinFieldSource");
                            throw null;
                        }
                        cVar5.w("");
                    }
                }
                return Unit.f80348a;
            default:
                f((f30) obj);
                return Unit.f80348a;
        }
    }

    public final void j(tt1.a aVar) {
        f30 f30Var;
        String blockReason;
        int i13 = this.f81122i;
        Object obj = this.f81124k;
        Object obj2 = this.f81123j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullExpressionValue(aVar.c(), "getData(...)");
                if (!(!((Collection) r0).isEmpty())) {
                    w01.x xVar = (w01.x) obj2;
                    xVar.f127132m = null;
                    ((p2) ((i01.w) xVar.getView())).i((f30) obj, xVar.f127132m);
                    return;
                }
                w01.x xVar2 = (w01.x) obj2;
                Object c13 = aVar.c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                lx0 lx0Var = (lx0) CollectionsKt.U(1, (List) c13);
                if (lx0Var != null) {
                    xVar2.getClass();
                    w01.x.q3(lx0Var);
                }
                xVar2.getClass();
                Object c14 = aVar.c();
                Intrinsics.checkNotNullExpressionValue(c14, "getData(...)");
                lx0 lx0Var2 = (lx0) CollectionsKt.U(2, (List) c14);
                if (lx0Var2 != null) {
                    w01.x.q3(lx0Var2);
                }
                xVar2.getClass();
                xVar2.f127132m = w01.x.q3((lx0) ((List) aVar.c()).get(0));
                if (xVar2.isBound() && (f30Var = xVar2.f127120a) != null) {
                    ((p2) ((i01.w) xVar2.getView())).i(f30Var, xVar2.f127132m);
                }
                xVar2.s3();
                return;
            default:
                if (((String) obj2).length() <= 0 || (blockReason = ((rp) aVar.c()).getBlockReason()) == null || blockReason.length() == 0) {
                    f fVar = (f) obj;
                    fVar.f115813m = false;
                    s11.c cVar = fVar.f115811k;
                    if (cVar == null) {
                        Intrinsics.r("editablePinFieldSource");
                        throw null;
                    }
                    aq.d dVar = aq.d.LINK;
                    cVar.v(dVar, null, fVar.t3(dVar));
                    return;
                }
                f fVar2 = (f) obj;
                fVar2.f115813m = true;
                s11.c cVar2 = fVar2.f115811k;
                if (cVar2 == null) {
                    Intrinsics.r("editablePinFieldSource");
                    throw null;
                }
                aq.d dVar2 = aq.d.LINK;
                cVar2.v(dVar2, Integer.valueOf(ry1.f.add_link_error), fVar2.t3(dVar2));
                return;
        }
    }
}
