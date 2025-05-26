package com.pinterest.education;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import c0.d;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import df.l1;
import eg0.a;
import em1.i;
import i32.t1;
import i32.u;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import le0.c;
import lu.a0;
import m60.n0;
import m60.w;
import org.jetbrains.annotations.NotNull;
import rg0.n;
import rq.t4;
import zf0.b;
import zf0.f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/education/ActionPromptView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "userSignalsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ActionPromptView extends a0 {

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f44950m = z0.f(new Pair("save_pin", Integer.valueOf(c.ic_save_pin_nonpds)));

    /* renamed from: d, reason: collision with root package name */
    public a f44951d;

    /* renamed from: e, reason: collision with root package name */
    public w f44952e;

    /* renamed from: f, reason: collision with root package name */
    public f f44953f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f44954g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltText f44955h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltText f44956i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltTextField f44957j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltCheckBox f44958k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltButton f44959l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionPromptView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 1, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void C() {
        GestaltCheckBox gestaltCheckBox = this.f44958k;
        if (gestaltCheckBox != null) {
            d.l(gestaltCheckBox.L(new zf0.a(this, 0)), i.f59624q);
        } else {
            Intrinsics.r("actionPromptCheckbox");
            throw null;
        }
    }

    public final void D(boolean z13) {
        q();
        String str = f.j() ? k().f58863f : k().f58862e;
        GestaltText gestaltText = this.f44956i;
        if (gestaltText != null) {
            gestaltText.i(new t4(str, z13, 7));
        } else {
            Intrinsics.r("actionPromptDetail");
            throw null;
        }
    }

    public final void L() {
        if (k().f58865h.length() > 0) {
            m().X(new zf0.a(this, 1));
        } else {
            m().X(b.f141898j);
        }
    }

    public final void T(boolean z13) {
        if (k().f58861d.length() > 0) {
            o().i(new r1.f(this, z13, 10));
        } else {
            o().i(b.f141899k);
        }
    }

    public abstract void X(a aVar, String str, n nVar);

    public final void Y() {
        setVisibility(0);
        n().setVisibility(0);
        n().startAnimation(AnimationUtils.loadAnimation(getContext(), n0.anim_slide_in_bottom));
    }

    public abstract boolean g();

    public final void i() {
        w s13 = s();
        a k13 = k();
        if (k13.f58872o != u.COMPLETE.getValue()) {
            a k14 = k();
            if (k14.f58872o != u.COMPLETE_AND_SHOW.getValue()) {
                a k15 = k();
                if (k15.f58872o == u.DONT_COMPLETE_AND_HIDE.getValue()) {
                    s13.d(new dg0.c(dg0.b.DISMISS_UI));
                    return;
                }
                return;
            }
        }
        if (g()) {
            s13.d(new dg0.c(dg0.b.COMPLETE));
        }
    }

    public final void j() {
        w s13 = s();
        a k13 = k();
        if (k13.f58871n == t1.DISMISS.getValue()) {
            s13.d(new dg0.c(dg0.b.DISMISS));
        } else {
            s13.d(new dg0.c(dg0.b.DISMISS_UI));
        }
    }

    public final a k() {
        a aVar = this.f44951d;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("actionPrompt");
        throw null;
    }

    public final GestaltButton l() {
        GestaltButton gestaltButton = this.f44959l;
        if (gestaltButton != null) {
            return gestaltButton;
        }
        Intrinsics.r("actionPromptCompleteButton");
        throw null;
    }

    public final GestaltTextField m() {
        GestaltTextField gestaltTextField = this.f44957j;
        if (gestaltTextField != null) {
            return gestaltTextField;
        }
        Intrinsics.r("actionPromptInputText");
        throw null;
    }

    public final LinearLayout n() {
        LinearLayout linearLayout = this.f44954g;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("actionPromptRectangleContainer");
        throw null;
    }

    public final GestaltText o() {
        GestaltText gestaltText = this.f44955h;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("actionPromptText");
        throw null;
    }

    public final f q() {
        f fVar = this.f44953f;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("educationHelper");
        throw null;
    }

    public final w s() {
        w wVar = this.f44952e;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final void t() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), n0.anim_slide_out_bottom);
        loadAnimation.setAnimationListener(new np.f(this, 1));
        n().startAnimation(loadAnimation);
    }

    public final void x() {
        View findViewById = findViewById(vb2.a.actionPromptRectangleContainer);
        LinearLayout linearLayout = (LinearLayout) findViewById;
        linearLayout.setOnTouchListener(new l1(2));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f44954g = linearLayout;
        View findViewById2 = findViewById(vb2.a.actionPromptText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f44955h = gestaltText;
        View findViewById3 = findViewById(vb2.a.actionPromptDetail);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f44956i = gestaltText2;
        View findViewById4 = findViewById(vb2.a.actionPromptInputText);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById4;
        Intrinsics.checkNotNullParameter(gestaltTextField, "<set-?>");
        this.f44957j = gestaltTextField;
        View findViewById5 = findViewById(vb2.a.actionPromptCheckbox);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltCheckBox gestaltCheckBox = (GestaltCheckBox) findViewById5;
        Intrinsics.checkNotNullParameter(gestaltCheckBox, "<set-?>");
        this.f44958k = gestaltCheckBox;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionPromptView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 1, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
