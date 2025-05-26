package com.pinterest.gestalt.popoverMessage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import fm1.c;
import gm1.b;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pp2.a;
import ql1.k;
import rq.m1;
import u50.o;
import xk2.m;
import xk2.v;
import ym1.b0;
import ym1.c0;
import ym1.d;
import ym1.e;
import ym1.g;
import ym1.h;
import ym1.i;
import ym1.j;
import ym1.l;
import ym1.z;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\f\u0003\r\u000e\u000fB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/pinterest/gestalt/popoverMessage/GestaltPopoverMessage;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lym1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "ym1/d", "ym1/e", "ym1/g", "popoverMessage_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltPopoverMessage extends ConstraintLayout implements b {
    public static final c A = c.VISIBLE;
    public static final int B;
    public static final e C;

    /* renamed from: a, reason: collision with root package name */
    public GestaltIconButton f49453a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltButton.SmallTertiaryButton f49454b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltButton.SmallTertiaryButton f49455c;

    /* renamed from: d, reason: collision with root package name */
    public final v f49456d;

    /* renamed from: e, reason: collision with root package name */
    public final v f49457e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltText f49458f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f49459g;

    /* renamed from: h, reason: collision with root package name */
    public int f49460h;

    /* renamed from: i, reason: collision with root package name */
    public int f49461i;

    /* renamed from: j, reason: collision with root package name */
    public final v f49462j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f49463k;

    /* renamed from: l, reason: collision with root package name */
    public View f49464l;

    /* renamed from: m, reason: collision with root package name */
    public final p f49465m;

    /* renamed from: n, reason: collision with root package name */
    public final v f49466n;

    /* renamed from: o, reason: collision with root package name */
    public final int f49467o;

    /* renamed from: p, reason: collision with root package name */
    public final v f49468p;

    /* renamed from: q, reason: collision with root package name */
    public final v f49469q;

    /* renamed from: r, reason: collision with root package name */
    public final v f49470r;

    /* renamed from: s, reason: collision with root package name */
    public final v f49471s;

    /* renamed from: t, reason: collision with root package name */
    public final v f49472t;

    /* renamed from: u, reason: collision with root package name */
    public final v f49473u;

    /* renamed from: v, reason: collision with root package name */
    public final v f49474v;

    /* renamed from: w, reason: collision with root package name */
    public final v f49475w;

    /* renamed from: x, reason: collision with root package name */
    public final v f49476x;

    /* renamed from: y, reason: collision with root package name */
    public final v f49477y;

    /* renamed from: z, reason: collision with root package name */
    public final q f49478z;

    static {
        Intrinsics.checkNotNullParameter("", "string");
        Intrinsics.checkNotNullParameter("", "text");
        B = b0.popover_educational_next_button;
        C = e.LEFT_TOP;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltPopoverMessage(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void L(GestaltPopoverMessage gestaltPopoverMessage, e eVar) {
        gestaltPopoverMessage.getClass();
        p pVar = new p();
        v vVar = gestaltPopoverMessage.f49457e;
        Object value = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        pVar.j((ConstraintLayout) value);
        int i13 = gestaltPopoverMessage.f49467o;
        pVar.h(i13, 6);
        pVar.h(i13, 7);
        pVar.h(i13, 3);
        pVar.h(i13, 4);
        Object value2 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        pVar.b((ConstraintLayout) value2);
        int i14 = h.f139422a[eVar.ordinal()];
        v vVar2 = gestaltPopoverMessage.f49472t;
        v vVar3 = gestaltPopoverMessage.f49468p;
        v vVar4 = gestaltPopoverMessage.f49473u;
        v vVar5 = gestaltPopoverMessage.f49469q;
        v vVar6 = gestaltPopoverMessage.f49474v;
        v vVar7 = gestaltPopoverMessage.f49470r;
        v vVar8 = gestaltPopoverMessage.f49475w;
        v vVar9 = gestaltPopoverMessage.f49471s;
        switch (i14) {
            case 1:
                ImageView imageView = gestaltPopoverMessage.f49463k;
                if (imageView == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar3.getValue() : (Drawable) vVar2.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 7, gestaltPopoverMessage.X().getId(), 6, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 3, 0, 3, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 6, 0, 6, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 4, 0, 4, 0);
                break;
            case 2:
                ImageView imageView2 = gestaltPopoverMessage.f49463k;
                if (imageView2 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView2.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar3.getValue() : (Drawable) vVar2.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 7, gestaltPopoverMessage.X().getId(), 6, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 3, gestaltPopoverMessage.X().getId(), 3, gestaltPopoverMessage.Z());
                pVar.m(gestaltPopoverMessage.f49467o, 6, 0, 6, 0);
                break;
            case 3:
                ImageView imageView3 = gestaltPopoverMessage.f49463k;
                if (imageView3 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView3.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar3.getValue() : (Drawable) vVar2.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 7, gestaltPopoverMessage.X().getId(), 6, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 4, gestaltPopoverMessage.X().getId(), 4, gestaltPopoverMessage.Z());
                pVar.m(gestaltPopoverMessage.f49467o, 6, 0, 6, 0);
                break;
            case 4:
                ImageView imageView4 = gestaltPopoverMessage.f49463k;
                if (imageView4 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView4.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar5.getValue() : (Drawable) vVar4.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 6, gestaltPopoverMessage.X().getId(), 7, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 3, gestaltPopoverMessage.X().getId(), 3, gestaltPopoverMessage.Z());
                pVar.m(gestaltPopoverMessage.f49467o, 7, 0, 7, 0);
                break;
            case 5:
                ImageView imageView5 = gestaltPopoverMessage.f49463k;
                if (imageView5 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView5.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar5.getValue() : (Drawable) vVar4.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 6, gestaltPopoverMessage.X().getId(), 7, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 3, 0, 3, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 7, 0, 7, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 4, 0, 4, 0);
                break;
            case 6:
                ImageView imageView6 = gestaltPopoverMessage.f49463k;
                if (imageView6 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView6.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar5.getValue() : (Drawable) vVar4.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 6, gestaltPopoverMessage.X().getId(), 7, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 4, gestaltPopoverMessage.X().getId(), 4, gestaltPopoverMessage.Z());
                pVar.m(gestaltPopoverMessage.f49467o, 7, 0, 7, 0);
                break;
            case 7:
                ImageView imageView7 = gestaltPopoverMessage.f49463k;
                if (imageView7 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView7.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar7.getValue() : (Drawable) vVar6.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 6, gestaltPopoverMessage.X().getId(), 6, gestaltPopoverMessage.Z());
                pVar.m(gestaltPopoverMessage.f49467o, 4, gestaltPopoverMessage.X().getId(), 3, 0);
                break;
            case 8:
                ImageView imageView8 = gestaltPopoverMessage.f49463k;
                if (imageView8 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView8.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar7.getValue() : (Drawable) vVar6.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 4, gestaltPopoverMessage.X().getId(), 3, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 7, gestaltPopoverMessage.X().getId(), 7, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 6, 0, 6, 0);
                break;
            case 9:
                ImageView imageView9 = gestaltPopoverMessage.f49463k;
                if (imageView9 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView9.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar7.getValue() : (Drawable) vVar6.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 4, gestaltPopoverMessage.X().getId(), 3, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 7, gestaltPopoverMessage.X().getId(), 7, gestaltPopoverMessage.Z());
                break;
            case 10:
                ImageView imageView10 = gestaltPopoverMessage.f49463k;
                if (imageView10 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView10.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar9.getValue() : (Drawable) vVar8.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 3, gestaltPopoverMessage.X().getId(), 4, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 6, gestaltPopoverMessage.X().getId(), 6, gestaltPopoverMessage.Z());
                pVar.m(gestaltPopoverMessage.f49467o, 4, 0, 4, 0);
                break;
            case 11:
                ImageView imageView11 = gestaltPopoverMessage.f49463k;
                if (imageView11 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView11.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar9.getValue() : (Drawable) vVar8.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 3, gestaltPopoverMessage.X().getId(), 4, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 6, 0, 6, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 7, 0, 7, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 4, 0, 4, 0);
                break;
            case 12:
                ImageView imageView12 = gestaltPopoverMessage.f49463k;
                if (imageView12 == null) {
                    Intrinsics.r("caretImageView");
                    throw null;
                }
                imageView12.setImageDrawable(gestaltPopoverMessage.d0().f139416e == g.DEFAULT ? (Drawable) vVar9.getValue() : (Drawable) vVar8.getValue());
                pVar.m(gestaltPopoverMessage.f49467o, 3, gestaltPopoverMessage.X().getId(), 4, 0);
                pVar.m(gestaltPopoverMessage.f49467o, 7, gestaltPopoverMessage.X().getId(), 7, gestaltPopoverMessage.Z());
                pVar.m(gestaltPopoverMessage.f49467o, 4, 0, 4, 0);
                break;
        }
        Object value3 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        pVar.b((ConstraintLayout) value3);
    }

    public final GestaltPopoverMessage T(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltPopoverMessage) this.f49478z.d(nextState, new j(this, d0(), 0));
    }

    public final ConstraintLayout X() {
        Object value = this.f49456d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    public final int Z() {
        return ((Number) this.f49466n.getValue()).intValue();
    }

    public final int a0() {
        return ((Number) this.f49476x.getValue()).intValue();
    }

    public final ym1.c d0() {
        return (ym1.c) ((o) this.f49478z.f33803a);
    }

    public final void g0(ym1.c cVar, ym1.c cVar2) {
        j1.v(cVar, cVar2, l.f139432n, new ym1.b(this, 5));
        int i13 = 3;
        int i14 = 1;
        if (g.DEFAULT == cVar2.f139416e) {
            j1.v(cVar, cVar2, l.f139433o, new ym1.b(this, 6));
            if (this.f49461i > 1) {
                if (this.f49453a == null) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
                    this.f49453a = gestaltIconButton;
                    gestaltIconButton.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
                    g3.y(gestaltIconButton, l.f139429k);
                    X().addView(gestaltIconButton);
                }
                GestaltText gestaltText = this.f49459g;
                if (gestaltText == null) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
                    this.f49459g = gestaltText2;
                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                    a.k(gestaltText2, new ym1.b(this, i13));
                    gestaltText2.setLayoutParams(layoutParams);
                    X().addView(gestaltText2);
                } else {
                    a.k(gestaltText, new ym1.b(this, i14));
                }
                GestaltButton.SmallTertiaryButton smallTertiaryButton = this.f49455c;
                if (smallTertiaryButton != null) {
                    a0.l0(smallTertiaryButton);
                }
                GestaltButton.SmallTertiaryButton smallTertiaryButton2 = this.f49454b;
                if (smallTertiaryButton2 != null) {
                    a0.v1(smallTertiaryButton2);
                }
                GestaltButton.SmallTertiaryButton smallTertiaryButton3 = this.f49454b;
                if (smallTertiaryButton3 == null) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    GestaltButton.SmallTertiaryButton smallTertiaryButton4 = new GestaltButton.SmallTertiaryButton(6, context3, (AttributeSet) null);
                    this.f49454b = smallTertiaryButton4;
                    smallTertiaryButton4.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                    bs1.c.s(smallTertiaryButton4, l.f139430l);
                    smallTertiaryButton4.e(new m1(this, smallTertiaryButton4, cVar2, 13));
                    X().addView(smallTertiaryButton4);
                } else {
                    smallTertiaryButton3.d(l.f139428j);
                }
                k0();
            }
            int i15 = this.f49461i;
            d dVar = cVar2.f139414c;
            if (i15 > 1 || dVar != null) {
                GestaltButton.SmallTertiaryButton smallTertiaryButton5 = this.f49455c;
                if (smallTertiaryButton5 == null) {
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    GestaltButton.SmallTertiaryButton smallTertiaryButton6 = new GestaltButton.SmallTertiaryButton(6, context4, (AttributeSet) null);
                    this.f49455c = smallTertiaryButton6;
                    smallTertiaryButton6.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                    if (dVar != null) {
                        smallTertiaryButton6.d(new jw0.b(kh2.j.H2(dVar), i13));
                    }
                    bs1.c.s(smallTertiaryButton6, new j(this, cVar2, i14));
                    X().addView(smallTertiaryButton6);
                } else {
                    smallTertiaryButton5.d(new k(cVar2, 27));
                }
                k0();
            }
        } else {
            j1.v(cVar, cVar2, l.f139434p, new j(this, cVar2, i13));
        }
        int i16 = 4;
        j1.v(cVar, cVar2, l.f139435q, new j(this, cVar2, i16));
        j1.v(cVar, cVar2, l.f139436r, new ym1.b(this, i16));
        ConstraintLayout X = X();
        p pVar = this.f49465m;
        pVar.j(X);
        GestaltText gestaltText3 = this.f49459g;
        if (gestaltText3 != null) {
            this.f49465m.m(gestaltText3.getId(), 6, 0, 6, a0());
            this.f49465m.m(gestaltText3.getId(), 3, 0, 3, a0());
        }
        GestaltIconButton gestaltIconButton2 = this.f49453a;
        if (gestaltIconButton2 != null) {
            this.f49465m.m(gestaltIconButton2.getId(), 7, 0, 7, a0());
            this.f49465m.m(gestaltIconButton2.getId(), 3, 0, 3, dl2.b.G0(this, eo1.a.space_300));
        }
        GestaltText gestaltText4 = this.f49458f;
        v vVar = this.f49477y;
        if (gestaltText4 != null) {
            this.f49465m.m(gestaltText4.getId(), 6, 0, 6, a0());
            if (this.f49461i > 1) {
                this.f49465m.m(gestaltText4.getId(), 3, z.popover_stepper_text, 4, ((Number) vVar.getValue()).intValue());
            } else {
                this.f49465m.m(gestaltText4.getId(), 3, 0, 3, a0());
            }
            this.f49465m.m(gestaltText4.getId(), 7, 0, 7, a0());
            if (this.f49461i <= 1 && this.f49455c == null) {
                this.f49465m.m(gestaltText4.getId(), 4, 0, 4, a0());
            }
            pVar.b(X());
        }
        GestaltButton.SmallTertiaryButton smallTertiaryButton7 = this.f49454b;
        v vVar2 = this.f49462j;
        if (smallTertiaryButton7 != null) {
            if (((g92.d) vVar2.getValue()) == g92.d.VR) {
                this.f49465m.m(smallTertiaryButton7.getId(), 6, 0, 6, a0());
            }
            this.f49465m.m(smallTertiaryButton7.getId(), 3, z.popover_main_text, 4, ((Number) vVar.getValue()).intValue());
            this.f49465m.m(smallTertiaryButton7.getId(), 7, 0, 7, a0());
            this.f49465m.m(smallTertiaryButton7.getId(), 4, X().getId(), 4, a0());
        }
        GestaltButton.SmallTertiaryButton smallTertiaryButton8 = this.f49455c;
        if (smallTertiaryButton8 != null) {
            if (((g92.d) vVar2.getValue()) == g92.d.VR) {
                this.f49465m.m(smallTertiaryButton8.getId(), 6, 0, 6, a0());
            }
            this.f49465m.m(smallTertiaryButton8.getId(), 3, z.popover_main_text, 4, ((Number) vVar.getValue()).intValue());
            this.f49465m.m(smallTertiaryButton8.getId(), 7, 0, 7, a0());
            this.f49465m.m(smallTertiaryButton8.getId(), 4, 0, 4, a0());
        }
        pVar.b(X());
    }

    public final void k0() {
        if (((g92.d) this.f49462j.getValue()) == g92.d.VR) {
            GestaltButton.SmallTertiaryButton smallTertiaryButton = this.f49454b;
            if (smallTertiaryButton != null) {
                ViewGroup.LayoutParams layoutParams = smallTertiaryButton.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                smallTertiaryButton.setLayoutParams(layoutParams2);
            }
            GestaltButton.SmallTertiaryButton smallTertiaryButton2 = this.f49455c;
            if (smallTertiaryButton2 != null) {
                ViewGroup.LayoutParams layoutParams3 = smallTertiaryButton2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).height = -2;
                smallTertiaryButton2.setLayoutParams(layoutParams4);
                return;
            }
            return;
        }
        GestaltButton.SmallTertiaryButton smallTertiaryButton3 = this.f49454b;
        if (smallTertiaryButton3 != null) {
            ViewGroup.LayoutParams layoutParams5 = smallTertiaryButton3.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            ((ViewGroup.MarginLayoutParams) layoutParams6).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams6).height = -2;
            smallTertiaryButton3.setLayoutParams(layoutParams6);
        }
        GestaltButton.SmallTertiaryButton smallTertiaryButton4 = this.f49455c;
        if (smallTertiaryButton4 != null) {
            ViewGroup.LayoutParams layoutParams7 = smallTertiaryButton4.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            ((ViewGroup.MarginLayoutParams) layoutParams8).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams8).height = -2;
            smallTertiaryButton4.setLayoutParams(layoutParams8);
        }
    }

    public /* synthetic */ GestaltPopoverMessage(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltPopoverMessage(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 0;
        this.f49456d = m.b(new i(this, i14));
        this.f49457e = m.b(new i(this, 11));
        this.f49460h = 1;
        this.f49462j = m.b(new i(this, 13));
        this.f49465m = new p();
        this.f49466n = m.b(new i(this, 1));
        this.f49467o = z.caret_image;
        this.f49468p = m.b(new i(this, 4));
        this.f49469q = m.b(new i(this, 5));
        this.f49470r = m.b(new i(this, 6));
        this.f49471s = m.b(new i(this, 3));
        this.f49472t = m.b(new i(this, 8));
        this.f49473u = m.b(new i(this, 9));
        this.f49474v = m.b(new i(this, 10));
        this.f49475w = m.b(new i(this, 7));
        this.f49476x = m.b(new i(this, 2));
        this.f49477y = m.b(new i(this, 12));
        int[] GestaltPopover = c0.GestaltPopover;
        Intrinsics.checkNotNullExpressionValue(GestaltPopover, "GestaltPopover");
        this.f49478z = new q(this, attributeSet, i13, GestaltPopover, new ym1.b(this, i14));
        View.inflate(getContext(), ym1.a0.gestalt_popover, this);
        View findViewById = findViewById(z.caret_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49463k = (ImageView) findViewById;
        g0(null, d0());
    }
}
