package yf1;

import a42.r;
import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lq0.i0;
import pk.a0;
import rq.m1;
import ye2.o;

/* loaded from: classes5.dex */
public final class k extends LinearLayout implements af2.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f138988h = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f138989a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138990b;

    /* renamed from: c, reason: collision with root package name */
    public final r f138991c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f138992d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f138993e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltTextField f138994f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f138995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, r satisfaction, a toggleDoneButton) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(satisfaction, "satisfaction");
        Intrinsics.checkNotNullParameter(toggleDoneButton, "toggleDoneButton");
        int i13 = 1;
        if (!this.f138990b) {
            this.f138990b = true;
            ((l) generatedComponent()).getClass();
        }
        this.f138991c = satisfaction;
        this.f138992d = toggleDoneButton;
        this.f138995g = new LinkedHashSet();
        View.inflate(context, dq1.d.view_idea_pin_creation_feedback_step2_modal, this);
        View findViewById = findViewById(dq1.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.checkbox_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f138993e = (ViewGroup) findViewById2;
        int i14 = 2;
        c0.d.l(((GestaltCheckBox) findViewById(dq1.c.user_comprehension_checkbox)).L(new j(i13, this)), new j(i14, this));
        c0.d.l(((GestaltCheckBox) findViewById(dq1.c.feature_issue_checkbox)).L(new j(3, this)), new j(4, this));
        c0.d.l(((GestaltCheckBox) findViewById(dq1.c.viewing_issue_checkbox)).L(new j(5, this)), new j(6, this));
        c0.d.l(((GestaltCheckBox) findViewById(dq1.c.publish_issue_checkbox)).L(new j(7, this)), new j(8, this));
        c0.d.l(((GestaltCheckBox) findViewById(dq1.c.other_issue_checkbox)).L(new j(9, this)), new j(0, this));
        View findViewById3 = findViewById(dq1.c.edit_text_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        View findViewById4 = findViewById(dq1.c.feedback_edit_text);
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById4;
        gestaltTextField.Z(new m1(context, gestaltTextField, this, 11));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f138994f = gestaltTextField;
        getViewTreeObserver().addOnGlobalLayoutListener(new i0(i14, this, context));
        if (satisfaction == r.SATISFIED) {
            a0.o(gestaltText, dq1.f.idea_pin_feedback_step2_title_happy, new Object[0]);
            ViewGroup viewGroup = this.f138993e;
            if (viewGroup == null) {
                Intrinsics.r("checkboxContainer");
                throw null;
            }
            bs1.c.X0(viewGroup);
            gestaltText2.i(g.f138973k);
            gestaltTextField.X(g.f138974l);
            return;
        }
        a0.o(gestaltText, dq1.f.idea_pin_feedback_step2_title_unhappy_neutral, new Object[0]);
        ViewGroup viewGroup2 = this.f138993e;
        if (viewGroup2 == null) {
            Intrinsics.r("checkboxContainer");
            throw null;
        }
        bs1.c.U1(viewGroup2);
        gestaltText2.i(g.f138975m);
        gestaltTextField.X(g.f138976n);
    }

    public static final u50.i0 a(int i13, k kVar) {
        kVar.getClass();
        int i14 = dq1.c.user_comprehension_checkbox;
        if (i13 == i14 || i13 == i14) {
            return bs1.c.j2(new String[0], dq1.f.pin_feedback_issue_user_comprehension);
        }
        int i15 = dq1.c.feature_issue_checkbox;
        if (i13 == i15 || i13 == i15) {
            return bs1.c.j2(new String[0], dq1.f.idea_pin_feedback_issue_feature);
        }
        int i16 = dq1.c.viewing_issue_checkbox;
        if (i13 == i16 || i13 == i16) {
            return bs1.c.j2(new String[0], dq1.f.pin_feedback_issue_viewing_ips);
        }
        int i17 = dq1.c.publish_issue_checkbox;
        if (i13 == i17 || i13 == i17) {
            return bs1.c.j2(new String[0], dq1.f.idea_pin_feedback_issue_publish);
        }
        int i18 = dq1.c.other_issue_checkbox;
        if (i13 != i18 && i13 != i18) {
            throw new IllegalStateException("Checkbox not supported");
        }
        Spanned fromHtml = Html.fromHtml(kVar.getResources().getString(dq1.f.idea_pin_feedback_issue_other), 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        return bs1.c.h2(fromHtml);
    }

    public static final void b(k kVar, a42.i iVar, boolean z13) {
        LinkedHashSet linkedHashSet = kVar.f138995g;
        if (z13) {
            linkedHashSet.add(iVar);
        } else {
            linkedHashSet.remove(iVar);
        }
        kVar.c();
    }

    public final void c() {
        if (this.f138991c == r.SATISFIED) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f138995g;
        boolean isEmpty = linkedHashSet.isEmpty();
        Function1 function1 = this.f138992d;
        if (isEmpty || (linkedHashSet.size() == 1 && linkedHashSet.contains(a42.i.OTHER) && z.j(this.f138994f.B0()))) {
            function1.invoke(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.TRUE);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f138989a == null) {
            this.f138989a = new o(this);
        }
        return this.f138989a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (ev2.getActionMasked() == 0) {
            Rect rect = new Rect();
            GestaltTextField gestaltTextField = this.f138994f;
            gestaltTextField.getGlobalVisibleRect(rect);
            if (!rect.contains((int) ev2.getRawX(), (int) ev2.getRawY())) {
                gestaltTextField.clearFocus();
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138989a == null) {
            this.f138989a = new o(this);
        }
        return this.f138989a.generatedComponent();
    }
}
