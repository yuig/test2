package com.pinterest.gestalt.modalAlert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import com.pinterest.gestalt.text.GestaltText;
import gm1.b;
import gm1.c;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.f0;
import u50.i0;
import u50.o;
import xm1.a;
import xm1.d;
import xm1.e;
import xm1.g;
import xm1.i;
import xm1.j;
import xm1.k;
import xm1.l;
import xm1.m;
import xm1.n;
import xm1.p;
import xm1.r;
import xm1.s;
import xm1.t;
import xm1.u;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\f\r\u0003\u000eB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/gestalt/modalAlert/GestaltModalAlert;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lxm1/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xm1/d", "al1/n", "xm1/g", "modalAlert_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltModalAlert extends ConstraintLayout implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final f0 f49438l = new f0("");

    /* renamed from: m, reason: collision with root package name */
    public static final f0 f49439m = new f0("");

    /* renamed from: n, reason: collision with root package name */
    public static final f0 f49440n = new f0("");

    /* renamed from: o, reason: collision with root package name */
    public static final d f49441o = d.HORIZONTAL;

    /* renamed from: a, reason: collision with root package name */
    public final q f49442a;

    /* renamed from: b, reason: collision with root package name */
    public final a f49443b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIcon f49444c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f49445d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltIconButton f49446e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f49447f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltCheckBox f49448g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltButtonGroup f49449h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltButton f49450i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltButton f49451j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f49452k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [xm1.a] */
    public GestaltModalAlert(Context context, e initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        final int i13 = 1;
        this.f49443b = new gm1.a(this) { // from class: xm1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GestaltModalAlert f135359b;

            {
                this.f135359b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                GestaltModalAlert.L(this.f135359b, cVar);
            }
        };
        this.f49442a = new q(this, initialDisplayState);
        View.inflate(context, t.gestalt_modal_alert, this);
        View findViewById = findViewById(s.gestalt_modal_alert_title_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49444c = (GestaltIcon) findViewById;
        View findViewById2 = findViewById(s.gestalt_modal_alert_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49445d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(s.gestalt_modal_alert_dismiss_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49446e = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(s.gestalt_modal_alert_body);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f49447f = (GestaltText) findViewById4;
        View findViewById5 = findViewById(s.gestalt_modal_alert_checkbox);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f49448g = (GestaltCheckBox) findViewById5;
        View findViewById6 = findViewById(s.gestalt_modal_alert_buttongroup);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f49449h = (GestaltButtonGroup) findViewById6;
        View findViewById7 = findViewById(zl1.a.primary_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f49450i = (GestaltButton) findViewById7;
        View findViewById8 = findViewById(zl1.a.secondary_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f49451j = (GestaltButton) findViewById8;
        View findViewById9 = findViewById(s.gestalt_modal_alert_button);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f49452k = (GestaltButton) findViewById9;
        Z();
        a0(T());
    }

    public static void L(GestaltModalAlert this$0, c event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        yj1.d dVar = new yj1.d(this$0, 10);
        if (event.j() == this$0.f49452k.getId() && (event instanceof xl1.a)) {
            gm1.a X = this$0.X();
            if (X != null) {
                X.h3(new l(this$0.getId(), dVar.invoke() == em1.b.CHECKED));
                return;
            }
            return;
        }
        if (event.j() == this$0.f49450i.getId() && (event instanceof xl1.a)) {
            gm1.a X2 = this$0.X();
            if (X2 != null) {
                X2.h3(new l(this$0.getId(), dVar.invoke() == em1.b.CHECKED));
                return;
            }
            return;
        }
        if (event.j() == this$0.f49451j.getId() && (event instanceof xl1.a)) {
            gm1.a X3 = this$0.X();
            if (X3 != null) {
                X3.h3(new m(this$0.getId(), dVar.invoke() == em1.b.CHECKED));
                return;
            }
            return;
        }
        int j13 = event.j();
        GestaltIconButton gestaltIconButton = this$0.f49446e;
        if (j13 == gestaltIconButton.getId() && (event instanceof om1.l)) {
            gm1.a X4 = this$0.X();
            if (X4 != null) {
                X4.h3(new p(this$0.getId(), dVar.invoke() == em1.b.CHECKED));
                return;
            }
            return;
        }
        if (event.j() == gestaltIconButton.getId() && (event instanceof om1.m)) {
            gm1.a X5 = this$0.X();
            if (X5 != null) {
                X5.h3(new p(this$0.getId(), dVar.invoke() == em1.b.CHECKED));
                return;
            }
            return;
        }
        int j14 = event.j();
        GestaltCheckBox gestaltCheckBox = this$0.f49448g;
        if (j14 == gestaltCheckBox.getId() && (event instanceof om1.m)) {
            gm1.a X6 = this$0.X();
            if (X6 != null) {
                X6.h3(new p(this$0.getId(), dVar.invoke() == em1.b.CHECKED));
                return;
            }
            return;
        }
        if (event.j() == gestaltCheckBox.getId() && (event instanceof em1.c)) {
            gestaltCheckBox.L(i.f135375j);
            gm1.a X7 = this$0.X();
            if (X7 != null) {
                X7.h3(new n(this$0.getId(), dVar.invoke() == em1.b.CHECKED));
            }
        }
    }

    public final e T() {
        return (e) ((o) this.f49442a.f33803a);
    }

    public final gm1.a X() {
        return (gm1.a) this.f49442a.f33804b;
    }

    public final void Z() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackground(getResources().getDrawable(r.gestalt_modal_alert_bg, getContext().getTheme()));
        setElevation(dl2.b.E0(this, eo1.a.comp_modalalert_elevation));
        setClickable(true);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int F0 = dl2.b.F0(context, eo1.a.comp_modalalert_container_padding);
        setPaddingRelative(F0, F0, F0, F0);
    }

    public final void a0(e eVar) {
        g gVar = eVar.f135368f;
        GestaltIcon gestaltIcon = this.f49444c;
        if (gVar != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int x03 = dl2.b.x0(context, eVar.f135368f.getColor());
            dl2.b.z(gestaltIcon, new j(eVar, 2));
            gestaltIcon.setImageTintList(ColorStateList.valueOf(x03));
        } else {
            gestaltIcon.g2(i.f135377l);
        }
        this.f49445d.i(new k(0, eVar, this));
        g3.y(this.f49446e, new j(eVar, 3));
        this.f49447f.i(new j(eVar, 4));
        i0 i0Var = eVar.f135370h;
        GestaltCheckBox gestaltCheckBox = this.f49448g;
        if (i0Var != null) {
            gestaltCheckBox.L(new j(eVar, 5));
            gestaltCheckBox.setPaddingRelative(0, dl2.b.G0(this, eo1.a.comp_modalalert_checkbox_paddingTop), 0, 0);
        } else {
            gestaltCheckBox.L(i.f135378m);
        }
        boolean z13 = eVar.f135366d;
        GestaltButton gestaltButton = this.f49452k;
        GestaltButtonGroup gestaltButtonGroup = this.f49449h;
        if (!z13) {
            gestaltButtonGroup.a(i.f135376k);
            gestaltButton.d(new j(eVar, 1));
            return;
        }
        gestaltButtonGroup.a(new j(eVar, 6));
        gestaltButton.d(i.f135379n);
        GestaltButton gestaltButton2 = this.f49450i;
        gestaltButton2.getLayoutParams().width = -1;
        gestaltButton2.getLayoutParams().height = -2;
        GestaltButton gestaltButton3 = this.f49451j;
        gestaltButton3.getLayoutParams().width = -1;
        gestaltButton3.getLayoutParams().height = -2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltModalAlert(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [xm1.a] */
    public GestaltModalAlert(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 0;
        this.f49443b = new gm1.a(this) { // from class: xm1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GestaltModalAlert f135359b;

            {
                this.f135359b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i142 = i14;
                GestaltModalAlert.L(this.f135359b, cVar);
            }
        };
        int[] GestaltModalAlert = u.GestaltModalAlert;
        Intrinsics.checkNotNullExpressionValue(GestaltModalAlert, "GestaltModalAlert");
        this.f49442a = new q(this, attributeSet, i13, GestaltModalAlert, new xm1.b(this, i14));
        View.inflate(context, t.gestalt_modal_alert, this);
        View findViewById = findViewById(s.gestalt_modal_alert_title_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49444c = (GestaltIcon) findViewById;
        View findViewById2 = findViewById(s.gestalt_modal_alert_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49445d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(s.gestalt_modal_alert_dismiss_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49446e = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(s.gestalt_modal_alert_body);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f49447f = (GestaltText) findViewById4;
        View findViewById5 = findViewById(s.gestalt_modal_alert_checkbox);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f49448g = (GestaltCheckBox) findViewById5;
        View findViewById6 = findViewById(s.gestalt_modal_alert_buttongroup);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f49449h = (GestaltButtonGroup) findViewById6;
        View findViewById7 = findViewById(zl1.a.primary_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f49450i = (GestaltButton) findViewById7;
        View findViewById8 = findViewById(zl1.a.secondary_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f49451j = (GestaltButton) findViewById8;
        View findViewById9 = findViewById(s.gestalt_modal_alert_button);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f49452k = (GestaltButton) findViewById9;
        Z();
        a0(T());
    }
}
