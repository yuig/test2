package com.pinterest.education.user.signals;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b60.b;
import b60.d;
import bp.j;
import c2.m4;
import com.bumptech.glide.c;
import com.pinterest.api.model.kz;
import com.pinterest.api.model.wy0;
import com.pinterest.education.user.signals.UserSignalsActionPromptView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.b5;
import cp.b0;
import df.j1;
import fg0.a;
import fg0.e;
import fg0.g;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import i32.l;
import i32.y0;
import java.util.HashMap;
import jc0.m;
import k90.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.n0;
import m60.w;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import rg0.n;
import xk2.v;
import zf0.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/education/user/signals/UserSignalsActionPromptView;", "Lcom/pinterest/education/ActionPromptView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "userSignalsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UserSignalsActionPromptView extends a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f44960v = 0;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltIconButton f44961o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f44962p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f44963q;

    /* renamed from: r, reason: collision with root package name */
    public String f44964r;

    /* renamed from: s, reason: collision with root package name */
    public String f44965s;

    /* renamed from: t, reason: collision with root package name */
    public r20.a f44966t;

    /* renamed from: u, reason: collision with root package name */
    public b f44967u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserSignalsActionPromptView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.education.ActionPromptView
    public final void X(eg0.a educationActionPrompt, String str, n nVar) {
        Intrinsics.checkNotNullParameter(educationActionPrompt, "educationActionPrompt");
        Intrinsics.checkNotNullParameter(educationActionPrompt, "<set-?>");
        this.f44951d = educationActionPrompt;
        final int i13 = 1;
        T(true);
        D(true);
        L();
        C();
        q();
        y0 y0Var = y0.ANDROID_HOME_FEED_TAKEOVER;
        l lVar = l.ANDROID_SAVE_EMAIL_UPDATE;
        if (j1.D0(y0Var, lVar)) {
            b bVar = this.f44967u;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            wy0 f13 = ((d) bVar).f();
            String N2 = f13 != null ? f13.N2() : null;
            this.f44964r = N2;
            if (N2 != null) {
                m().X(new jc0.l(N2, 9));
            }
        }
        int length = k().f58868k.length();
        GestaltIconButton gestaltIconButton = this.f44961o;
        if (length > 0) {
            c.u1(gestaltIconButton);
            gestaltIconButton.u(new gm1.a(this) { // from class: fg0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserSignalsActionPromptView f62112b;

                {
                    this.f62112b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i14 = i13;
                    UserSignalsActionPromptView this$0 = this.f62112b;
                    switch (i14) {
                        case 0:
                            int i15 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            String str2 = this$0.f44965s;
                            if (str2 == null) {
                                Intrinsics.r("emailTypoSuggestion");
                                throw null;
                            }
                            if (str2.length() > 0) {
                                this$0.m().X(new g(this$0, 0));
                                sh.f.a().F(g0.MODAL_DIALOG, u0.SUGGESTED_EMAIL);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.j();
                                return;
                            }
                            return;
                        default:
                            int i17 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.i();
                            return;
                    }
                }
            });
        } else {
            c.n0(gestaltIconButton);
        }
        if (k().f58870m.length() > 0) {
            final int i14 = 2;
            l().d(new g(this, 1)).e(new gm1.a(this) { // from class: fg0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserSignalsActionPromptView f62112b;

                {
                    this.f62112b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i14;
                    UserSignalsActionPromptView this$0 = this.f62112b;
                    switch (i142) {
                        case 0:
                            int i15 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            String str2 = this$0.f44965s;
                            if (str2 == null) {
                                Intrinsics.r("emailTypoSuggestion");
                                throw null;
                            }
                            if (str2.length() > 0) {
                                this$0.m().X(new g(this$0, 0));
                                sh.f.a().F(g0.MODAL_DIALOG, u0.SUGGESTED_EMAIL);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.j();
                                return;
                            }
                            return;
                        default:
                            int i17 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.i();
                            return;
                    }
                }
            });
        } else {
            l().d(e.f62118l);
        }
        q();
        boolean D0 = j1.D0(y0Var, lVar);
        final int i15 = 0;
        if (D0) {
            GestaltTextField m13 = m();
            m13.Z(new j(10, this, m13));
            l().d(new m(false, 1));
            this.f44963q.j(new gm1.a(this) { // from class: fg0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserSignalsActionPromptView f62112b;

                {
                    this.f62112b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i15;
                    UserSignalsActionPromptView this$0 = this.f62112b;
                    switch (i142) {
                        case 0:
                            int i152 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            String str2 = this$0.f44965s;
                            if (str2 == null) {
                                Intrinsics.r("emailTypoSuggestion");
                                throw null;
                            }
                            if (str2.length() > 0) {
                                this$0.m().X(new g(this$0, 0));
                                sh.f.a().F(g0.MODAL_DIALOG, u0.SUGGESTED_EMAIL);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.j();
                                return;
                            }
                            return;
                        default:
                            int i17 = UserSignalsActionPromptView.f44960v;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.i();
                            return;
                    }
                }
            });
        } else {
            q();
            if (f.j()) {
                ImageView imageView = this.f44962p;
                imageView.setVisibility(0);
                imageView.setAnimation(AnimationUtils.loadAnimation(getContext(), n0.anim_shake_icon));
                o().i(e.f62119m);
                GestaltButton l13 = l();
                ViewGroup.LayoutParams layoutParams = l13.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = -1;
                layoutParams2.topMargin = 0;
                l13.setLayoutParams(layoutParams2);
                d0 a13 = sh.f.a();
                Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                a4 a4Var = a4.USER_SIGNAL_PROMPT;
                q();
                i0 i0Var = new i0(d4.USER_SIGNALS_COLLECTION, a4Var, null, f.j() ? g0.USER_BIRTHDAY_PROMPT : g0.USER_SIGNALS_MODAL, null, null);
                f1 f1Var = f1.VIEW;
                HashMap hashMap = new HashMap();
                hashMap.put("dismissible", String.valueOf(true ^ k().f58858a));
                Unit unit = Unit.f80348a;
                a13.U(i0Var, f1Var, null, null, hashMap, false);
            }
        }
        Y();
    }

    @Override // com.pinterest.education.ActionPromptView
    public final boolean g() {
        q();
        v vVar = f.f141903e;
        if (!j1.D0(y0.ANDROID_HOME_FEED_TAKEOVER, l.ANDROID_SAVE_EMAIL_UPDATE)) {
            q();
            if (f.j()) {
                d0 a13 = sh.f.a();
                Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                u0 u0Var = u0.ADD_BUTTON;
                a4 a4Var = a4.USER_SIGNAL_PROMPT;
                q();
                a13.U(new i0(d4.USER_SIGNALS_COLLECTION, a4Var, null, f.j() ? g0.USER_BIRTHDAY_PROMPT : g0.USER_SIGNALS_MODAL, null, u0Var), f1.TAP, null, null, null, false);
                w s13 = s();
                NavigationImpl w13 = Navigation.w1((ScreenLocation) b5.f50582b.getValue());
                w13.y0(Boolean.TRUE, "com.pinterest.EXTRA_IS_BIRTHDATE_COLLECTION");
                w13.y0(k().f58864g, "com.pinterest.EXTRA_MESSAGE_BLOCKING");
                w13.y0(Boolean.valueOf(true ^ k().f58858a), "com.pinterest.EXTRA_IS_BIRTHDAY_COLLECTION_DISMISSIBLE");
                s13.d(w13);
                return false;
            }
        } else {
            if (!tr1.b.c(String.valueOf(m().z0()))) {
                this.f44963q.i(new m4(this, vb2.c.wrong_email, 5));
                return false;
            }
            GestaltCheckBox gestaltCheckBox = this.f44958k;
            if (gestaltCheckBox == null) {
                Intrinsics.r("actionPromptCheckbox");
                throw null;
            }
            boolean z13 = !c0.d.a2(gestaltCheckBox);
            r20.a aVar = this.f44966t;
            if (aVar == null) {
                Intrinsics.r("notificationSettingsService");
                throw null;
            }
            String type = kz.NOTIFICATION_SETTING_TYPE_EMAIL.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            aVar.f(type, "settings_email_everything", "ONLY_REQUIRED", z13).l(tk2.e.f118017c).h(wj2.c.a()).i(new b0(this, 6), new i(21, e.f62116j));
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSignalsActionPromptView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(vb2.b.user_signals_action_prompt_view, (ViewGroup) this, true);
        x();
        View findViewById = findViewById(vb2.a.actionBirthdayIcon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44962p = (ImageView) findViewById;
        View findViewById2 = findViewById(vb2.a.actionPromptValidations);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44963q = (GestaltText) findViewById2;
        View findViewById3 = findViewById(vb2.a.actionPromptDismissButton);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44961o = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(vb2.a.actionPromptCompleteButton);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f44959l = gestaltButton;
        View findViewById5 = findViewById(vb2.a.actionPromptFemaleButton);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        View findViewById6 = findViewById(vb2.a.actionPromptMaleButton);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        View findViewById7 = findViewById(vb2.a.actionPromptSpecifyButton);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
    }
}
