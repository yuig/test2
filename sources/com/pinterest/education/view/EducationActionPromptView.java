package com.pinterest.education.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.kz;
import com.pinterest.api.model.wy0;
import com.pinterest.education.ActionPromptView;
import com.pinterest.education.view.EducationActionPromptView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import cp.b0;
import df.j1;
import gg0.d;
import gg0.f;
import gg0.m0;
import i32.l;
import i32.y0;
import java.util.Map;
import jg0.c;
import k90.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lu1.b;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import r20.a;
import rg0.n;
import tk2.e;
import x02.x2;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/education/view/EducationActionPromptView;", "Lcom/pinterest/education/ActionPromptView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "educationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EducationActionPromptView extends m0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f44977y = 0;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f44978o;

    /* renamed from: p, reason: collision with root package name */
    public final View f44979p;

    /* renamed from: q, reason: collision with root package name */
    public final View f44980q;

    /* renamed from: r, reason: collision with root package name */
    public GestaltButton f44981r;

    /* renamed from: s, reason: collision with root package name */
    public GestaltText f44982s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f44983t;

    /* renamed from: u, reason: collision with root package name */
    public b f44984u;

    /* renamed from: v, reason: collision with root package name */
    public x2 f44985v;

    /* renamed from: w, reason: collision with root package name */
    public a f44986w;

    /* renamed from: x, reason: collision with root package name */
    public b60.b f44987x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EducationActionPromptView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.education.ActionPromptView
    public final void X(eg0.a educationActionPrompt, final String str, n nVar) {
        Intrinsics.checkNotNullParameter(educationActionPrompt, "educationActionPrompt");
        Intrinsics.checkNotNullParameter(educationActionPrompt, "<set-?>");
        this.f44951d = educationActionPrompt;
        final int i13 = 0;
        T(false);
        D(false);
        L();
        C();
        final int i14 = 1;
        if (k().f58868k.length() > 0) {
            Z(true);
            GestaltButton gestaltButton = this.f44981r;
            if (gestaltButton == null) {
                Intrinsics.r("actionPromptDismissButton");
                throw null;
            }
            gestaltButton.d(new f(this, 1)).e(new gm1.a(this) { // from class: gg0.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ EducationActionPromptView f64920b;

                {
                    this.f64920b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i13;
                    String str2 = str;
                    EducationActionPromptView this$0 = this.f64920b;
                    switch (i15) {
                        case 0:
                            int i16 = EducationActionPromptView.f44977y;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            eg0.a k13 = this$0.k();
                            if (k13.f58873p == h32.c.NEGATIVE_FEEDBACK_REPORT_LINK && str2 != null) {
                                this$0.s().d(new pg0.n0(str2));
                            }
                            if (this$0.q().f141905b == i32.l.ANDROID_IDEA_PIN_MULTIPAGE_DEPRECATION_EDU.getValue()) {
                                String f23 = bs1.c.f2(this$0, jg0.e.url_idea_multipage_deprecation_help);
                                lu1.b bVar = this$0.f44984u;
                                if (bVar == null) {
                                    Intrinsics.r("baseActivityHelper");
                                    throw null;
                                }
                                Context context = this$0.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                ((lu1.c) bVar).m(context, f23);
                            }
                            this$0.j();
                            return;
                        default:
                            int i17 = EducationActionPromptView.f44977y;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            eg0.a k14 = this$0.k();
                            if (k14.f58873p == h32.c.NEGATIVE_FEEDBACK_REPORT_LINK && str2 != null) {
                                this$0.s().d(new pg0.d0(str2));
                            }
                            this$0.i();
                            return;
                    }
                }
            });
        } else {
            GestaltButton gestaltButton2 = this.f44981r;
            if (gestaltButton2 == null) {
                Intrinsics.r("actionPromptDismissButton");
                throw null;
            }
            gestaltButton2.d(gg0.a.f64903t);
        }
        if (k().f58870m.length() > 0) {
            GestaltText gestaltText = this.f44982s;
            if (gestaltText == null) {
                Intrinsics.r("actionPromptCompleteButtonText");
                throw null;
            }
            gestaltText.i(new f(this, 0));
            l().d(gg0.a.f64899p).e(new gm1.a(this) { // from class: gg0.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ EducationActionPromptView f64920b;

                {
                    this.f64920b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i14;
                    String str2 = str;
                    EducationActionPromptView this$0 = this.f64920b;
                    switch (i15) {
                        case 0:
                            int i16 = EducationActionPromptView.f44977y;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            eg0.a k13 = this$0.k();
                            if (k13.f58873p == h32.c.NEGATIVE_FEEDBACK_REPORT_LINK && str2 != null) {
                                this$0.s().d(new pg0.n0(str2));
                            }
                            if (this$0.q().f141905b == i32.l.ANDROID_IDEA_PIN_MULTIPAGE_DEPRECATION_EDU.getValue()) {
                                String f23 = bs1.c.f2(this$0, jg0.e.url_idea_multipage_deprecation_help);
                                lu1.b bVar = this$0.f44984u;
                                if (bVar == null) {
                                    Intrinsics.r("baseActivityHelper");
                                    throw null;
                                }
                                Context context = this$0.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                ((lu1.c) bVar).m(context, f23);
                            }
                            this$0.j();
                            return;
                        default:
                            int i17 = EducationActionPromptView.f44977y;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            eg0.a k14 = this$0.k();
                            if (k14.f58873p == h32.c.NEGATIVE_FEEDBACK_REPORT_LINK && str2 != null) {
                                this$0.s().d(new pg0.d0(str2));
                            }
                            this$0.i();
                            return;
                    }
                }
            });
            q();
            if (j1.D0(y0.ANDROID_HOME_FEED_TAKEOVER, l.ANDROID_BOUNCED_EMAIL_RECOLLECTION)) {
                l().d(gg0.a.f64895l);
                GestaltText gestaltText2 = this.f44982s;
                if (gestaltText2 == null) {
                    Intrinsics.r("actionPromptCompleteButtonText");
                    throw null;
                }
                gestaltText2.i(gg0.a.f64896m);
            }
        } else {
            l().d(gg0.a.f64900q);
        }
        if (k().f58869l.length() <= 0 || !ActionPromptView.f44950m.containsKey(k().f58869l)) {
            GestaltText gestaltText3 = this.f44982s;
            if (gestaltText3 == null) {
                Intrinsics.r("actionPromptCompleteButtonText");
                throw null;
            }
            gestaltText3.i(gg0.a.f64902s);
        } else {
            GestaltText gestaltText4 = this.f44982s;
            if (gestaltText4 == null) {
                Intrinsics.r("actionPromptCompleteButtonText");
                throw null;
            }
            gestaltText4.i(gg0.a.f64901r);
        }
        Y();
        q();
        if (j1.D0(y0.ANDROID_HOME_FEED_TAKEOVER, l.ANDROID_BOUNCED_EMAIL_RECOLLECTION)) {
            m().Z(new d(this, 2));
        }
    }

    public final void Z(boolean z13) {
        if (Intrinsics.d(this.f44983t, Boolean.valueOf(z13))) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(c.actionPromptButtonLinearLayout);
        if (linearLayout != null) {
            n().removeView(linearLayout);
        }
        this.f44983t = null;
        View view = z13 ? this.f44979p : this.f44980q;
        LinearLayout.LayoutParams layoutParams = z13 ? new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(ga2.b.lego_button_large_height)) : new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(jg0.a.action_prompt_vertical_button_width), -2);
        layoutParams.gravity = 1;
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(r0.margin_double);
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        n().addView(view, layoutParams);
        View findViewById = findViewById(c.actionPromptCompleteButtonText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44982s = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.actionPromptCompleteButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f44959l = gestaltButton;
        View findViewById3 = findViewById(c.actionPromptDismissButton);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44981r = (GestaltButton) findViewById3;
        this.f44983t = Boolean.valueOf(z13);
    }

    @Override // com.pinterest.education.ActionPromptView
    public final boolean g() {
        q();
        y0 y0Var = y0.ANDROID_HOME_FEED_TAKEOVER;
        if (j1.D0(y0Var, l.ANDROID_OS_PUSH_SETTINGS_PROMPT) || j1.D0(y0Var, l.ANDROID_OS_PUSH_SETTINGS_PROMPT_V2)) {
            s().d(new dg0.c(dg0.b.CONTINUE));
            return false;
        }
        q();
        v vVar = zf0.f.f141903e;
        if (!j1.D0(y0Var, l.ANDROID_BOUNCED_EMAIL_RECOLLECTION)) {
            return true;
        }
        String valueOf = String.valueOf(m().z0());
        b60.b bVar = this.f44987x;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 f13 = ((b60.d) bVar).f();
        if (f13 == null) {
            return false;
        }
        if (!tr1.b.c(valueOf)) {
            this.f44978o.i(new f(this, 3));
            return false;
        }
        if (!z.i(f13.N2(), valueOf, false)) {
            Map g13 = z0.g(new Pair("surface_tag", lp1.a.FIX_EMAIL_PROMPT.getValue()), new Pair("email", valueOf));
            x2 x2Var = this.f44985v;
            if (x2Var == null) {
                Intrinsics.r("userRepository");
                throw null;
            }
            x2Var.j0(f13, g13).i(new xo.b(15), new i(22, gg0.a.f64906w));
        }
        GestaltCheckBox gestaltCheckBox = this.f44958k;
        if (gestaltCheckBox == null) {
            Intrinsics.r("actionPromptCheckbox");
            throw null;
        }
        boolean z13 = !c0.d.a2(gestaltCheckBox);
        a aVar = this.f44986w;
        if (aVar == null) {
            Intrinsics.r("notificationSettingsService");
            throw null;
        }
        String type = kz.NOTIFICATION_SETTING_TYPE_EMAIL.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        aVar.f(type, "settings_email_everything", "ONLY_REQUIRED", z13).l(e.f118017c).h(wj2.c.a()).i(new b0(this, 7), new i(23, gg0.a.f64907x));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationActionPromptView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jg0.d.education_action_prompt_view, (ViewGroup) this, true);
        x();
        View findViewById = findViewById(c.actionPromptValidations);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44978o = (GestaltText) findViewById;
        View inflate = LayoutInflater.from(context).inflate(jg0.d.action_prompt_button_horizontal, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f44979p = inflate;
        View inflate2 = LayoutInflater.from(context).inflate(jg0.d.action_prompt_button_vertical, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        this.f44980q = inflate2;
        Z(true);
    }
}
