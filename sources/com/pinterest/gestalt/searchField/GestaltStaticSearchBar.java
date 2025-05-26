package com.pinterest.gestalt.searchField;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import cn1.a;
import cn1.b0;
import cn1.e0;
import cn1.f0;
import cn1.j;
import cn1.j0;
import cn1.x;
import cn1.y;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import dm1.h;
import gm1.b;
import kh2.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om1.e;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rm1.d;
import rm1.f;
import u50.h0;
import u50.i0;
import u50.o;
import vn1.c;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\f\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/gestalt/searchField/GestaltStaticSearchBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lcn1/y;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "searchField_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"RestrictedApi", "GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltStaticSearchBar extends ConstraintLayout implements b {

    /* renamed from: q, reason: collision with root package name */
    public static final c f49525q = c.DEFAULT;

    /* renamed from: r, reason: collision with root package name */
    public static final c f49526r = c.SUBTLE;

    /* renamed from: a, reason: collision with root package name */
    public final q f49527a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49529c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49530d;

    /* renamed from: e, reason: collision with root package name */
    public final p f49531e;

    /* renamed from: f, reason: collision with root package name */
    public View f49532f;

    /* renamed from: g, reason: collision with root package name */
    public final v f49533g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltIconButton f49534h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltIconButton f49535i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltIconButton f49536j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltButton f49537k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltIconButton f49538l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltIconButton f49539m;

    /* renamed from: n, reason: collision with root package name */
    public ConstraintLayout f49540n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltText f49541o;

    /* renamed from: p, reason: collision with root package name */
    public GestaltText f49542p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltStaticSearchBar(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a0(GestaltStaticSearchBar gestaltStaticSearchBar, boolean z13, boolean z14, boolean z15, boolean z16, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        if ((i13 & 2) != 0) {
            z14 = false;
        }
        if ((i13 & 4) != 0) {
            z15 = false;
        }
        if ((i13 & 8) != 0) {
            z16 = false;
        }
        if (z13) {
            GestaltIconButton gestaltIconButton = gestaltStaticSearchBar.f49536j;
            if (gestaltIconButton != null) {
                com.bumptech.glide.c.u1(gestaltIconButton);
            }
        } else {
            GestaltIconButton gestaltIconButton2 = gestaltStaticSearchBar.f49536j;
            if (gestaltIconButton2 != null) {
                com.bumptech.glide.c.d0(gestaltIconButton2);
            }
        }
        GestaltButton gestaltButton = gestaltStaticSearchBar.f49537k;
        if (z14) {
            if (gestaltButton != null) {
                a0.v1(gestaltButton);
            }
        } else if (gestaltButton != null) {
            a0.l0(gestaltButton);
        }
        GestaltIconButton gestaltIconButton3 = gestaltStaticSearchBar.f49538l;
        if (z15) {
            if (gestaltIconButton3 != null) {
                com.bumptech.glide.c.u1(gestaltIconButton3);
            }
        } else if (gestaltIconButton3 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton3);
        }
        GestaltIconButton gestaltIconButton4 = gestaltStaticSearchBar.f49539m;
        if (z16) {
            if (gestaltIconButton4 != null) {
                com.bumptech.glide.c.u1(gestaltIconButton4);
            }
        } else if (gestaltIconButton4 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton4);
        }
    }

    public final boolean B0() {
        i0 i0Var = t0().f28256p;
        h0 h0Var = h0.f120562a;
        return (Intrinsics.d(i0Var, h0Var) && Intrinsics.d(t0().f28255o, h0Var)) ? false : true;
    }

    public final void F0(y yVar, y yVar2) {
        j1.v(yVar, yVar2, b0.f28135j, new cn1.a0(this, yVar2, 9));
        j1.v(yVar, yVar2, b0.f28137l, new cn1.a0(yVar2, this, 10));
        j1.v(yVar, yVar2, b0.f28139n, new cn1.a0(yVar2, this, 11));
        int i13 = 7;
        j1.v(yVar, yVar2, b0.f28141p, new x(this, i13));
        j1.v(yVar, yVar2, b0.f28142q, new x(this, 6));
        j1.v(yVar, yVar2, a.I, new cn1.a0(this, yVar2, 2));
        j1.v(yVar, yVar2, a.f28111J, new cn1.a0(this, yVar2, 3));
        if (yVar2.f28247g != Integer.MIN_VALUE) {
            j1.v(yVar, yVar2, a.K, new cn1.a0(this, yVar2, 4));
        }
        j1.v(yVar, yVar2, a.L, new cn1.a0(this, yVar2, 5));
        j1.v(yVar, yVar2, a.M, new cn1.a0(this, yVar2, i13));
        if (this.f49530d) {
            j1.v(yVar, yVar2, a.D, new cn1.a0(yVar2, this, 1));
        }
        j1.v(yVar, yVar2, b0.f28136k, new cn1.a0(this, yVar2, 8));
    }

    public final d G0(rm1.q qVar, boolean z13) {
        f fVar = new f(qVar, GestaltSearchField.f49499t);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new d(fVar, (dl2.b.T1(context) || z13) ? rm1.c.DEFAULT : rm1.c.SUBTLE, null, 0, null, 28);
    }

    public final void L(int i13) {
        GestaltText gestaltText = this.f49541o;
        if (gestaltText != null) {
            int id3 = gestaltText.getId();
            p pVar = this.f49531e;
            pVar.l(id3, 6, 0, 6);
            this.f49531e.m(gestaltText.getId(), 3, i13, 4, this.f49529c);
            pVar.l(gestaltText.getId(), 4, 0, 4);
            pVar.l(i13, 4, gestaltText.getId(), 3);
        }
    }

    public final void T(int i13) {
        GestaltText gestaltText = this.f49542p;
        if (gestaltText != null) {
            int id3 = gestaltText.getId();
            p pVar = this.f49531e;
            pVar.l(id3, 6, 0, 6);
            pVar.l(gestaltText.getId(), 3, 0, 3);
            this.f49531e.m(i13, 3, gestaltText.getId(), 4, this.f49529c);
        }
    }

    public final void X() {
        ConstraintLayout constraintLayout = this.f49540n;
        p pVar = this.f49531e;
        if (constraintLayout == null) {
            ConstraintLayout constraintLayout2 = new ConstraintLayout(getContext());
            constraintLayout2.setLayoutParams(new ConstraintLayout.LayoutParams(0, -2));
            constraintLayout2.setId(f0.static_search_bar_container);
            constraintLayout2.setMinHeight(dl2.b.G0(constraintLayout2, eo1.a.comp_searchfield_minimum_height));
            addView(constraintLayout2);
            pVar.j(this);
            pVar.l(constraintLayout2.getId(), 3, 0, 3);
            pVar.l(constraintLayout2.getId(), 6, 0, 6);
            pVar.l(constraintLayout2.getId(), 7, 0, 7);
            pVar.l(constraintLayout2.getId(), 4, 0, 4);
            pVar.b(this);
            this.f49540n = constraintLayout2;
        }
        r0(e0.searchfield_bg_default);
        ConstraintLayout constraintLayout3 = this.f49540n;
        if (constraintLayout3 != null) {
            removeView(z0());
            constraintLayout3.removeView(z0());
            constraintLayout3.addView(z0());
            View view = this.f49535i;
            if (view != null) {
                removeView(view);
                constraintLayout3.removeView(view);
                constraintLayout3.addView(view);
            }
            View view2 = this.f49534h;
            if (view2 != null) {
                removeView(view2);
                constraintLayout3.removeView(view2);
                constraintLayout3.addView(view2);
            }
            ConstraintLayout constraintLayout4 = this.f49540n;
            if (constraintLayout4 != null) {
                pVar.j(constraintLayout4);
                GestaltIconButton gestaltIconButton = this.f49534h;
                int id3 = (gestaltIconButton == null && (gestaltIconButton = this.f49535i) == null) ? constraintLayout4.getId() : gestaltIconButton.getId();
                int i13 = (this.f49534h == null && this.f49535i == null) ? 7 : 6;
                pVar.l(z0().getId(), 3, constraintLayout4.getId(), 3);
                pVar.l(z0().getId(), 6, constraintLayout4.getId(), 6);
                pVar.l(z0().getId(), 7, id3, i13);
                pVar.l(z0().getId(), 4, constraintLayout4.getId(), 4);
                GestaltIconButton gestaltIconButton2 = this.f49535i;
                int i14 = this.f49528b;
                if (gestaltIconButton2 != null) {
                    int abs = Math.abs(i14 - com.bumptech.glide.c.t1(gestaltIconButton2));
                    GestaltIconButton gestaltIconButton3 = this.f49534h;
                    int id4 = gestaltIconButton3 != null ? gestaltIconButton3.getId() : constraintLayout4.getId();
                    int i15 = this.f49534h != null ? 6 : 7;
                    pVar.l(gestaltIconButton2.getId(), 3, constraintLayout4.getId(), 3);
                    this.f49531e.m(gestaltIconButton2.getId(), 6, z0().getId(), 7, abs);
                    pVar.l(gestaltIconButton2.getId(), 4, constraintLayout4.getId(), 4);
                    pVar.l(gestaltIconButton2.getId(), 7, id4, i15);
                }
                GestaltIconButton gestaltIconButton4 = this.f49534h;
                if (gestaltIconButton4 != null) {
                    int abs2 = Math.abs(i14 - com.bumptech.glide.c.t1(gestaltIconButton4));
                    View view3 = this.f49535i;
                    if (view3 == null) {
                        view3 = z0();
                    }
                    int id5 = view3.getId();
                    pVar.l(gestaltIconButton4.getId(), 3, constraintLayout4.getId(), 3);
                    pVar.l(gestaltIconButton4.getId(), 6, id5, 7);
                    pVar.l(gestaltIconButton4.getId(), 4, constraintLayout4.getId(), 4);
                    this.f49531e.m(gestaltIconButton4.getId(), 7, constraintLayout4.getId(), 7, abs2);
                }
                pVar.b(constraintLayout4);
            }
        }
    }

    public final void Z(GestaltText gestaltText) {
        e eVar;
        om1.c w13;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean v03 = dl2.b.v0(eo1.a.comp_searchfield_label_has_leading_space, context);
        GestaltIconButton gestaltIconButton = this.f49536j;
        if (gestaltIconButton == null || (w13 = gestaltIconButton.w()) == null || (eVar = w13.f96640b) == null) {
            eVar = GestaltSearchField.f49505z;
        }
        gestaltText.setPaddingRelative((v03 && t0().f28249i == dn1.e.LEADING_ICON_BUTTON) ? dl2.b.G0(this, eVar.getBackgroundSize()) + (dl2.b.G0(this, eo1.a.comp_searchfield_horizontal_gap) * 2) : dl2.b.G0(this, eo1.a.comp_searchfield_horizontal_gap), gestaltText.getPaddingTop(), gestaltText.getPaddingEnd(), gestaltText.getPaddingBottom());
    }

    public final GestaltStaticSearchBar d0(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltStaticSearchBar) this.f49527a.d(nextState, new cn1.a0(this, t0(), 0));
    }

    public final void g0(cn1.c cVar, cn1.c cVar2) {
        q qVar = this.f49527a;
        if (cVar != null) {
            om1.c s03 = g0.s0(cVar);
            if (this.f49538l == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltIconButton gestaltIconButton = new GestaltIconButton(context, s03);
                addView(gestaltIconButton);
                this.f49538l = gestaltIconButton;
                gm1.a aVar = (gm1.a) qVar.f33804b;
                if (aVar != null) {
                    gestaltIconButton.u(aVar);
                }
            }
            GestaltIconButton gestaltIconButton2 = this.f49538l;
            if (gestaltIconButton2 != null) {
                gestaltIconButton2.t(new h(s03, 5));
            }
        }
        if (cVar2 != null) {
            om1.c s04 = g0.s0(cVar2);
            if (this.f49539m == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltIconButton gestaltIconButton3 = new GestaltIconButton(context2, s04);
                addView(gestaltIconButton3);
                this.f49539m = gestaltIconButton3;
                gm1.a aVar2 = (gm1.a) qVar.f33804b;
                if (aVar2 != null) {
                    gestaltIconButton3.u(aVar2);
                }
            }
            GestaltIconButton gestaltIconButton4 = this.f49539m;
            if (gestaltIconButton4 != null) {
                gestaltIconButton4.t(new h(s04, 6));
            }
        }
    }

    public final GestaltStaticSearchBar k0(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltStaticSearchBar) this.f49527a.c(eventHandler, new x(this, 4));
    }

    public final void o0(String str, c cVar, d dVar) {
        if (this.f49541o == null && str.length() > 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            pp2.a.k(gestaltText, a.G);
            gestaltText.setLayoutParams(new ConstraintLayout.LayoutParams(0, -2));
            addView(gestaltText);
            this.f49541o = gestaltText;
        }
        GestaltText gestaltText2 = this.f49541o;
        if (gestaltText2 != null) {
            Z(gestaltText2.i(new j(str, cVar, dVar, 1)));
        }
    }

    public final void r0(int i13) {
        if (t0().f28249i != dn1.e.DEFAULT) {
            setBackground(null);
            ConstraintLayout constraintLayout = this.f49540n;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(i13);
                return;
            }
            return;
        }
        if (!B0()) {
            setBackgroundResource(i13);
            return;
        }
        setBackground(null);
        ConstraintLayout constraintLayout2 = this.f49540n;
        if (constraintLayout2 != null) {
            constraintLayout2.setBackgroundResource(i13);
        }
    }

    public final y t0() {
        return (y) ((o) this.f49527a.f33803a);
    }

    public final GestaltText z0() {
        Object value = this.f49533g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltText) value;
    }

    public /* synthetic */ GestaltStaticSearchBar(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltStaticSearchBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49528b = dl2.b.G0(this, eo1.a.comp_searchfield_horizontal_padding);
        this.f49529c = dl2.b.G0(this, eo1.a.comp_searchfield_vertical_gap);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f49530d = dl2.b.v0(eo1.a.comp_searchfield_hasErrorState, context2);
        this.f49531e = new p();
        this.f49533g = m.b(new yj1.d(this, 11));
        int[] GestaltSearchField = j0.GestaltSearchField;
        Intrinsics.checkNotNullExpressionValue(GestaltSearchField, "GestaltSearchField");
        this.f49527a = new q(this, attributeSet, i13, GestaltSearchField, new x(this, 0));
        View.inflate(getContext(), cn1.g0.gestalt_static_search_bar, this);
        setMinHeight(dl2.b.G0(this, eo1.a.comp_searchfield_minimum_height));
        F0(null, t0());
    }
}
