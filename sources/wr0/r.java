package wr0;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import c2.m4;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.engagementtab.EngagementDetailsHeaderView;
import com.pinterest.feature.engagementtab.FloatingCommentView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.g0;
import java.io.File;
import java.util.Date;
import java.util.List;
import jk2.j1;
import kh2.m0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;
import lq0.g1;
import x02.a2;
import x02.i2;
import x02.p1;
import zp.s0;

/* loaded from: classes5.dex */
public final class r extends oh1.m {
    public final nh1.a F;
    public final pb0.d G;
    public final yk1.v H;
    public final x02.u I;

    /* renamed from: J, reason: collision with root package name */
    public final p1 f130913J;
    public final i2 K;
    public final a12.d L;
    public final i92.k M;
    public final b60.b N;
    public final p O;
    public final mh1.d P;
    public a0 Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(nh1.a r25, pb0.d r26, m60.w r27, yk1.v r28, x02.u r29, x02.c r30, x02.p1 r31, x02.i2 r32, nx.f0 r33, uk1.e r34, uj2.q r35, lh0.j4 r36, rg0.s r37, a12.d r38, i92.k r39, qh1.e r40, ap.o r41, nx.d1 r42, b60.b r43, lh0.v0 r44, lb0.r r45, lb0.q r46, androidx.appcompat.widget.c2 r47) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wr0.r.<init>(nh1.a, pb0.d, m60.w, yk1.v, x02.u, x02.c, x02.p1, x02.i2, nx.f0, uk1.e, uj2.q, lh0.j4, rg0.s, a12.d, i92.k, qh1.e, ap.o, nx.d1, b60.b, lh0.v0, lb0.r, lb0.q, androidx.appcompat.widget.c2):void");
    }

    public static final void k4(r rVar, rp0.d dVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        rVar.getClass();
        Date s13 = dVar.s();
        final int i13 = 0;
        final int i14 = 1;
        if (s13 != null) {
            pb0.b bVar = pb0.b.STYLE_COMPACT;
            pb0.d dVar2 = rVar.G;
            CharSequence b13 = dVar2.b(s13, bVar, false);
            charSequence2 = dVar2.b(s13, pb0.b.STYLE_NORMAL, true);
            charSequence = b13;
        } else {
            charSequence = "";
            charSequence2 = charSequence;
        }
        yk1.n view = rVar.getView();
        g gVar = view instanceof g ? (g) view : null;
        if (gVar != null) {
            final int i15 = 3;
            o oVar = new o(rVar, 3);
            n nVar = new n(rVar, 1);
            nh1.a aVar = rVar.F;
            boolean d2 = Intrinsics.d(aVar.f90548p, dVar.v());
            wy0 w13 = dVar.w();
            final b0.c viewState = new b0.c(oVar, nVar, dVar, d2, Intrinsics.d(w13 != null ? w13.getUid() : null, aVar.f90535c), charSequence, charSequence2);
            Intrinsics.checkNotNullParameter(viewState, "viewState");
            final FloatingCommentView l93 = ((j) gVar).l9();
            Intrinsics.checkNotNullParameter(viewState, "viewState");
            wy0 w14 = dVar.w();
            final int i16 = 2;
            if (w14 != null) {
                boolean z13 = viewState.f20714c;
                GestaltAvatar gestaltAvatar = l93.f45689d;
                m0.V0(gestaltAvatar, w14);
                gestaltAvatar.M2(new lq0.o(2, oVar, w14));
                String z43 = w14.z4();
                String str = z43 != null ? z43 : "";
                GestaltText gestaltText = l93.f45690e;
                if (gestaltText.getLineCount() > 1 && gestaltText.getLayout().getLineEnd(0) >= 3) {
                    str = ((Object) str.subSequence(0, gestaltText.getLayout().getLineEnd(0) - 3)) + "...";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                if (z13 && str.length() > 0) {
                    spannableStringBuilder.setSpan(l93.f45700o, 0, str.length(), 33);
                }
                gestaltText.i(new s0(spannableStringBuilder, 16)).j(new gm1.a() { // from class: wr0.z
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i17 = i13;
                        b0.c viewState2 = viewState;
                        FloatingCommentView this$0 = l93;
                        switch (i17) {
                            case 0:
                                int i18 = FloatingCommentView.f45688q;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.L(it, viewState2);
                                break;
                            case 1:
                                int i19 = FloatingCommentView.f45688q;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.L(it, viewState2);
                                break;
                            case 2:
                                int i23 = FloatingCommentView.f45688q;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (it instanceof om1.l) {
                                    this$0.L(it, viewState2);
                                    break;
                                }
                                break;
                            case 3:
                                int i24 = FloatingCommentView.f45688q;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (it instanceof om1.l) {
                                    this$0.L(it, viewState2);
                                    break;
                                }
                                break;
                            default:
                                int i25 = FloatingCommentView.f45688q;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.L(it, viewState2);
                                break;
                        }
                    }
                });
            }
            l93.f45692g.i(new f1(viewState, 7));
            String g13 = dVar.g();
            String f13 = dVar.f();
            int length = g13.length();
            WebImageView webImageView = l93.f45695j;
            if (length > 0) {
                if (!Intrinsics.d(webImageView.f52563o, g13)) {
                    webImageView.V1(g13, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                }
                bs1.c.U1(webImageView);
            } else if (f13.length() > 0) {
                webImageView.t2(new File(f13));
                bs1.c.U1(webImageView);
            } else {
                bs1.c.X0(webImageView);
            }
            l93.f45691f.i(new go0.r(dVar.r(), (Object) l93, (Object) dVar.q(), 9));
            boolean i17 = dVar.i();
            int h10 = dVar.h();
            gm1.a aVar2 = new gm1.a() { // from class: wr0.z
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i172 = i16;
                    b0.c viewState2 = viewState;
                    FloatingCommentView this$0 = l93;
                    switch (i172) {
                        case 0:
                            int i18 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 1:
                            int i19 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 2:
                            int i23 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        case 3:
                            int i24 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        default:
                            int i25 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                    }
                }
            };
            GestaltIconButton gestaltIconButton = l93.f45696k;
            gestaltIconButton.u(aVar2);
            gestaltIconButton.t(new rn0.d(i17, 7));
            gm1.a aVar3 = new gm1.a() { // from class: wr0.z
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i172 = i15;
                    b0.c viewState2 = viewState;
                    FloatingCommentView this$0 = l93;
                    switch (i172) {
                        case 0:
                            int i18 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 1:
                            int i19 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 2:
                            int i23 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        case 3:
                            int i24 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        default:
                            int i25 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                    }
                }
            };
            GestaltIconButton gestaltIconButton2 = l93.f45697l;
            gestaltIconButton2.u(aVar3);
            gestaltIconButton2.t(new rn0.d(i17, 8));
            m4 m4Var = new m4(h10, l93, 8);
            final int i18 = 4;
            l93.f45698m.i(m4Var).j(new gm1.a() { // from class: wr0.z
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i172 = i18;
                    b0.c viewState2 = viewState;
                    FloatingCommentView this$0 = l93;
                    switch (i172) {
                        case 0:
                            int i182 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 1:
                            int i19 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 2:
                            int i23 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        case 3:
                            int i24 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        default:
                            int i25 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                    }
                }
            });
            l93.f45699n.j(new gm1.a() { // from class: wr0.z
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i172 = i14;
                    b0.c viewState2 = viewState;
                    FloatingCommentView this$0 = l93;
                    switch (i172) {
                        case 0:
                            int i182 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 1:
                            int i19 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                        case 2:
                            int i23 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        case 3:
                            int i24 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.L(it, viewState2);
                                break;
                            }
                            break;
                        default:
                            int i25 = FloatingCommentView.f45688q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(viewState2, "$viewState");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.L(it, viewState2);
                            break;
                    }
                }
            });
            l93.f45693h.u(new lq0.o(3, (Function2) viewState.f20712a, dVar));
            bs1.c.R1(l93.f45694i, viewState.f20713b);
        }
    }

    public static final void l4(r rVar) {
        rVar.getClass();
        rVar.Q = a0.Deleted;
        yk1.n view = rVar.getView();
        g gVar = view instanceof g ? (g) view : null;
        if (gVar != null) {
            j jVar = (j) gVar;
            jVar.l9().startAnimation(jVar.f130899p1);
        }
    }

    public static final void n4(r rVar) {
        yk1.n view = rVar.getView();
        j jVar = view instanceof j ? (j) view : null;
        if (jVar != null) {
            int i13 = rVar.U;
            EngagementDetailsHeaderView engagementDetailsHeaderView = jVar.S0;
            if (engagementDetailsHeaderView != null) {
                engagementDetailsHeaderView.T(i13);
            } else {
                Intrinsics.r("engagementDetailsHeaderView");
                throw null;
            }
        }
    }

    @Override // oh1.m, com.pinterest.feature.unifiedcomments.c
    public final void K(rp0.d comment, rh1.x actionType) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        super.K(comment, actionType);
        nx.d0.B(getPinalytics(), null, g0.FLOATING_COMMENT_VIEW, null, null, 29);
        if (actionType == rh1.x.Reply) {
            s4(false);
            this.S = true;
        }
    }

    @Override // oh1.m, wk1.q, yk1.p
    /* renamed from: K3 */
    public final void r3(com.pinterest.feature.unifiedcomments.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        yk1.n view2 = getView();
        g gVar = view2 instanceof g ? (g) view2 : null;
        nh1.a aVar = this.F;
        if (gVar != null) {
            i2 i2Var = this.K;
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            xj2.c F = c0.d.W2(i2Var, n00.c.ENGAGEMENT_TAB_DETAILS_FIELDS).T(aVar.f90533a).F(new uq0.c(5, new g1(2, this, gVar)), new uq0.c(6, new m(this, 9)), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
        }
        String str = aVar.f90550r;
        boolean d2 = Intrinsics.d(str, "aggregatedcomment");
        String str2 = aVar.f90549q;
        a12.d dVar = this.L;
        if (d2) {
            xj2.c o13 = dVar.h(str2, n00.b.a(n00.c.FLOATING_AGGREGATED_COMMENT_FIELDS)).r(tk2.e.f118017c).l(wj2.c.a()).o(new uq0.c(7, new m(this, 5)), new uq0.c(8, new m(this, 6)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
            r4();
            return;
        }
        if (!Intrinsics.d(str, "userdiditdata")) {
            this.Q = a0.Deleted;
            return;
        }
        xj2.c o14 = dVar.b(str2, n00.b.a(n00.c.ENGAGEMENT_TAB_TRY_FIELDS)).r(tk2.e.f118017c).l(wj2.c.a()).o(new uq0.c(15, new m(this, 7)), new uq0.c(16, new m(this, 8)));
        Intrinsics.checkNotNullExpressionValue(o14, "subscribe(...)");
        addDisposable(o14);
        r4();
    }

    @Override // oh1.m, com.pinterest.feature.unifiedcomments.c
    public final void d3() {
        super.d3();
        if (this.Q == a0.Visible) {
            s4(true);
        }
        this.S = false;
    }

    public final void r4() {
        x02.u uVar = this.I;
        j1 j1Var = new j1(new jk2.x(uVar.B(), new bv0.k(13, new m(this, 0)), 2), new qk0.b(29, b.f130870l), 0);
        uq0.c cVar = new uq0.c(9, new m(this, 1));
        uq0.c cVar2 = new uq0.c(10, b.f130871m);
        ck2.c cVar3 = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = j1Var.F(cVar, cVar2, cVar3, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        xj2.c F2 = uVar.z().F(new uq0.c(11, new m(this, 2)), new uq0.c(12, b.f130872n), cVar3, a2Var);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        addDisposable(F2);
        xj2.c F3 = new j1(new jk2.x(this.f130913J.B(), new bv0.k(14, new m(this, 3)), 2), new l(0, b.f130873o), 0).F(new uq0.c(13, new m(this, 4)), new uq0.c(14, b.f130869k), cVar3, a2Var);
        Intrinsics.checkNotNullExpressionValue(F3, "subscribe(...)");
        addDisposable(F3);
    }

    public final void s4(boolean z13) {
        yk1.n view = getView();
        g gVar = view instanceof g ? (g) view : null;
        if (gVar != null) {
            j jVar = (j) gVar;
            if (z13) {
                jVar.l9().startAnimation(jVar.f130900q1);
            } else {
                jVar.l9().startAnimation(jVar.f130899p1);
            }
        }
    }

    public final void t4(int i13) {
        if (i13 < 0) {
            return;
        }
        a0 a0Var = this.Q;
        a0 a0Var2 = a0.Invisible;
        if (a0Var == a0Var2 && i13 < this.R && !this.S) {
            this.Q = a0.Visible;
            s4(true);
        } else {
            if (a0Var != a0.Visible || i13 < this.R || this.S) {
                return;
            }
            this.Q = a0Var2;
            s4(false);
        }
    }

    @Override // oh1.m, com.pinterest.feature.unifiedcomments.c
    public final void u(Context context, Editable editable, String str, String str2, rp0.d dVar, rp0.d dVar2, List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.u(context, editable, str, str2, dVar, dVar2, list);
        if (this.Q == a0.Visible) {
            s4(true);
        }
        this.S = false;
    }

    @Override // oh1.m
    public final mh1.d x3() {
        return this.P;
    }

    @Override // oh1.m
    public final oh1.r z3() {
        return this.O;
    }
}
