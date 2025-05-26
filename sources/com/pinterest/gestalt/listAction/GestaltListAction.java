package com.pinterest.gestalt.listAction;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import bm1.r;
import bm1.s;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.ui.imageview.WebImageView;
import fm1.c;
import gm1.a;
import gm1.b;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import on1.h;
import org.jetbrains.annotations.NotNull;
import rm1.i;
import u50.o;
import wm1.b0;
import wm1.e;
import wm1.f;
import wm1.g;
import wm1.i0;
import wm1.k;
import wm1.p;
import xk2.v;
import yk1.n;
import yl1.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u0004:\u000b\r\u000e\u0003\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B'\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/pinterest/gestalt/listAction/GestaltListAction;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lwm1/c;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "wm1/b", "al1/n", "wm1/d", "wm1/n", "wm1/o", "wm1/p", "wm1/s", "wm1/t", "wm1/z", "wm1/a0", "listAction_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltListAction extends ConstraintLayout implements b, n {
    public static final d V = d.SECONDARY;
    public static final Date W = Calendar.getInstance().getTime();

    /* renamed from: a0, reason: collision with root package name */
    public static final c f49410a0 = c.VISIBLE;
    public GestaltButton A;
    public GestaltText B;
    public LinearLayout C;
    public final v D;
    public final v E;
    public final v F;
    public final v G;
    public final v H;
    public final i I;

    /* renamed from: J, reason: collision with root package name */
    public final v f49411J;
    public final v K;
    public final v L;
    public final p M;
    public final boolean N;
    public final v O;
    public final v P;
    public final q Q;
    public final v R;
    public CompoundButton.OnCheckedChangeListener S;
    public View.OnClickListener T;
    public View.OnLongClickListener U;

    /* renamed from: a, reason: collision with root package name */
    public ConstraintLayout f49412a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltAvatar f49413b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltIcon f49414c;

    /* renamed from: d, reason: collision with root package name */
    public WebImageView f49415d;

    /* renamed from: e, reason: collision with root package name */
    public final v f49416e;

    /* renamed from: f, reason: collision with root package name */
    public final v f49417f;

    /* renamed from: g, reason: collision with root package name */
    public final v f49418g;

    /* renamed from: h, reason: collision with root package name */
    public final v f49419h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltIndicator f49420i;

    /* renamed from: j, reason: collision with root package name */
    public final v f49421j;

    /* renamed from: k, reason: collision with root package name */
    public final v f49422k;

    /* renamed from: l, reason: collision with root package name */
    public final v f49423l;

    /* renamed from: m, reason: collision with root package name */
    public View f49424m;

    /* renamed from: n, reason: collision with root package name */
    public final v f49425n;

    /* renamed from: o, reason: collision with root package name */
    public final v f49426o;

    /* renamed from: p, reason: collision with root package name */
    public GestaltText f49427p;

    /* renamed from: q, reason: collision with root package name */
    public GestaltPreviewTextView f49428q;

    /* renamed from: r, reason: collision with root package name */
    public final v f49429r;

    /* renamed from: s, reason: collision with root package name */
    public final v f49430s;

    /* renamed from: t, reason: collision with root package name */
    public final v f49431t;

    /* renamed from: u, reason: collision with root package name */
    public final v f49432u;

    /* renamed from: v, reason: collision with root package name */
    public GestaltButton f49433v;

    /* renamed from: w, reason: collision with root package name */
    public GestaltCheckBox f49434w;

    /* renamed from: x, reason: collision with root package name */
    public GestaltSwitch f49435x;

    /* renamed from: y, reason: collision with root package name */
    public GestaltIcon f49436y;

    /* renamed from: z, reason: collision with root package name */
    public GestaltButtonToggle f49437z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltListAction(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(View view) {
        if (this.C == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setId(ho1.b.list_action_end_item);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            this.C = linearLayout;
            addView(linearLayout);
        }
        LinearLayout linearLayout2 = this.C;
        if (linearLayout2 != null) {
            linearLayout2.addView(view);
        }
    }

    public final void T(View view) {
        if (this.f49412a == null) {
            ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
            constraintLayout.setId(ho1.b.list_action_start_item);
            constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
            this.f49412a = constraintLayout;
            addView(constraintLayout);
        }
        ConstraintLayout constraintLayout2 = this.f49412a;
        if (constraintLayout2 != null) {
            constraintLayout2.addView(view);
        }
    }

    public final void X(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.S = onCheckedChangeListener;
        t0();
    }

    public final GestaltListAction Z(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltListAction) this.Q.c(eventHandler, new wm1.a(this, 1));
    }

    public final void a0(View.OnClickListener onClickListener) {
        this.T = onClickListener;
        t0();
    }

    public final void d0(View.OnLongClickListener onLongClickListener) {
        this.U = onLongClickListener;
        t0();
    }

    public final wm1.c g0() {
        return (wm1.c) ((o) this.Q.f33803a);
    }

    public final gm1.c k0() {
        gm1.c hVar;
        int i13 = b0.f130266c[g0().f130270d.f130322a.ordinal()];
        gm1.c cVar = null;
        if (i13 == 1) {
            wm1.n nVar = g0().f130270d;
            Intrinsics.g(nVar, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.ButtonDisplayState");
            if (((e) nVar).f130280d) {
                cVar = new xl1.a(ho1.b.list_action_button);
            }
        } else if (i13 == 2) {
            wm1.n nVar2 = g0().f130270d;
            Intrinsics.g(nVar2, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.CheckBoxDisplayState");
            boolean z13 = ((g) nVar2).f130295d == em1.e.ENABLED;
            wm1.n nVar3 = g0().f130270d;
            Intrinsics.g(nVar3, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.CheckBoxDisplayState");
            g gVar = (g) nVar3;
            if (z13) {
                cVar = new em1.c(ho1.b.list_action_checkbox, gVar.f130294c);
            }
        } else if (i13 == 3) {
            wm1.n nVar4 = g0().f130270d;
            Intrinsics.g(nVar4, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.SwitchDisplayState");
            if (((k) nVar4).f130308d) {
                wm1.n nVar5 = g0().f130270d;
                Intrinsics.g(nVar5, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.SwitchDisplayState");
                hVar = ((k) nVar5).f130307c ? new h(ho1.b.list_action_switch) : new on1.g(ho1.b.list_action_switch);
                cVar = hVar;
            }
        } else {
            if (i13 != 7) {
                return new i0(getId());
            }
            if (this.N) {
                wm1.n nVar6 = g0().f130270d;
                Intrinsics.g(nVar6, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.ButtonToggleDisplayState");
                wm1.n nVar7 = g0().f130270d;
                Intrinsics.g(nVar7, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.ButtonToggleDisplayState");
                f fVar = (f) nVar7;
                if (((f) nVar6).f130288f) {
                    hVar = fVar.f130287e == bm1.n.SELECTED ? new s(ho1.b.list_action_button_toggle) : new r(ho1.b.list_action_button_toggle);
                    cVar = hVar;
                }
            } else {
                wm1.n nVar8 = g0().f130270d;
                Intrinsics.g(nVar8, "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.ButtonToggleDisplayState");
                if (((f) nVar8).f130288f) {
                    cVar = new xl1.a(ho1.b.list_action_button_toggle);
                }
            }
        }
        return cVar;
    }

    public final int o0(boolean z13) {
        int i13 = b0.f130264a[g0().f130268b.f130342a.ordinal()];
        v vVar = this.f49430s;
        if (i13 == 2) {
            return ((Number) this.f49417f.getValue()).intValue() + ((Number) vVar.getValue()).intValue();
        }
        if (i13 != 5) {
            return ((Number) vVar.getValue()).intValue();
        }
        if (z13) {
            return ((Number) this.f49423l.getValue()).intValue();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int G0 = dl2.b.G0(this, eo1.a.comp_listaction_vertical_padding);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = layoutParams.width == 0 ? 0 : -1;
            layoutParams.height = -2;
            setPaddingRelative(getPaddingStart(), G0, getPaddingEnd(), G0);
            setBackgroundResource(ho1.a.list_action_container);
            if (this.N) {
                setMinHeight(((Number) this.P.getValue()).intValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0938  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(wm1.c r37, wm1.c r38) {
        /*
            Method dump skipped, instructions count: 2424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.listAction.GestaltListAction.r0(wm1.c, wm1.c):void");
    }

    public final void t0() {
        GestaltSwitch j13;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        gm1.c k03 = k0();
        int i13 = 5;
        q qVar = this.Q;
        if (k03 == null) {
            ((View) qVar.f33805c).setOnClickListener(null);
            ((View) qVar.f33805c).setOnLongClickListener(null);
        } else {
            qVar.F(new wm1.a(this, 4), new wm1.a(this, i13));
            qVar.I(new wm1.a(this, 6), new wm1.a(this, 7));
        }
        GestaltSwitch gestaltSwitch = this.f49435x;
        if (gestaltSwitch == null || (j13 = gestaltSwitch.j(new gh1.e(this, i13))) == null || (onCheckedChangeListener = this.S) == null) {
            return;
        }
        j13.K = onCheckedChangeListener;
        j13.m();
    }

    public /* synthetic */ GestaltListAction(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltListAction(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49416e = pk2.f.m(this, 19);
        this.f49417f = pk2.f.m(this, 18);
        this.f49418g = pk2.f.m(this, 21);
        this.f49419h = pk2.f.m(this, 20);
        this.f49421j = pk2.f.m(this, 15);
        this.f49422k = pk2.f.m(this, 14);
        this.f49423l = pk2.f.m(this, 13);
        this.f49425n = pk2.f.m(this, 0);
        this.f49426o = pk2.f.m(this, 1);
        this.f49429r = pk2.f.m(this, 12);
        this.f49430s = pk2.f.m(this, 11);
        this.f49431t = pk2.f.m(this, 23);
        this.f49432u = pk2.f.m(this, 22);
        this.D = pk2.f.m(this, 10);
        this.E = pk2.f.m(this, 8);
        this.F = pk2.f.m(this, 6);
        this.G = pk2.f.m(this, 5);
        this.H = pk2.f.m(this, 4);
        this.I = i.SM;
        this.f49411J = pk2.f.m(this, 3);
        this.K = pk2.f.m(this, 9);
        this.L = pk2.f.m(this, 7);
        this.O = pk2.f.m(this, 16);
        this.P = pk2.f.m(this, 17);
        this.R = pk2.f.m(this, 2);
        int[] GestaltListAction = ho1.d.GestaltListAction;
        Intrinsics.checkNotNullExpressionValue(GestaltListAction, "GestaltListAction");
        this.Q = new q(this, attributeSet, i13, GestaltListAction, new wm1.a(this, 0));
        View.inflate(getContext(), ho1.c.gestalt_listaction, this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.N = dl2.b.w0(context2, eo1.a.comp_listaction_is_vr);
        el2.a entries = p.getEntries();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.M = (p) entries.get(dl2.b.O0(context3, eo1.a.comp_listaction_icon_size));
        r0(null, g0());
    }
}
