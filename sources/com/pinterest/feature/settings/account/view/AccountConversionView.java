package com.pinterest.feature.settings.account.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.x;
import androidx.constraintlayout.widget.ConstraintLayout;
import b52.a;
import b52.b;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.account.view.AccountConversionView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import j41.i;
import kh2.m0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import p91.v;
import pk.a0;
import q91.e;
import q91.f;
import rm1.q;
import rq.o2;
import so.jb;
import vq1.h;
import ye2.o;
import zx0.d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/settings/account/view/AccountConversionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "q91/c", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AccountConversionView extends ConstraintLayout implements c {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f48117m = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f48118a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48119b;

    /* renamed from: c, reason: collision with root package name */
    public x f48120c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f48121d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48122e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIcon f48123f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f48124g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltButton f48125h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewStub f48126i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewStub f48127j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f48128k;

    /* renamed from: l, reason: collision with root package name */
    public s f48129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountConversionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        if (!this.f48119b) {
            this.f48119b = true;
            m0.v0(this, ((jb) ((f) generatedComponent())).f113485c.K6());
        }
        this.f48129l = e.f103093i;
        LayoutInflater.from(getContext()).inflate(b.view_account_conversion, (ViewGroup) this, true);
        View findViewById = findViewById(a.account_conversion_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48121d = (GestaltText) findViewById;
        View findViewById2 = findViewById(a.account_conversion_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48122e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.account_conversion_type_placeholder1);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48126i = (ViewStub) findViewById3;
        View findViewById4 = findViewById(a.account_conversion_type_placeholder2);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48127j = (ViewStub) findViewById4;
        View findViewById5 = findViewById(a.account_conversion_indicator_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48123f = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(a.account_conversion_additional_info);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48124g = (GestaltText) findViewById6;
        this.f48125h = ((GestaltButton) findViewById(a.account_conversion_action_button)).d(q91.b.f103063j).e(new gm1.a(this) { // from class: q91.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountConversionView f103052b;

            {
                this.f103052b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                AccountConversionView this$0 = this.f103052b;
                switch (i14) {
                    case 0:
                        int i15 = AccountConversionView.f48117m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48129l.invoke();
                        break;
                    default:
                        int i16 = AccountConversionView.f48117m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48129l.invoke();
                        break;
                }
            }
        });
        this.f48128k = ((GestaltText) findViewById(a.account_conversion_terms_of_service)).i(new i(this, 28));
    }

    public final void L(x61.e clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f48129l = new v(1, clickListener, this);
    }

    public final void T(int i13) {
        a0.o(this.f48124g, i13, new Object[0]);
    }

    public final void X(int i13) {
        this.f48125h.d(new d(i13, 16));
    }

    public final void Z(int i13) {
        a0.o(this.f48122e, i13, new Object[0]);
    }

    public final void a0(q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        dl2.b.z(this.f48123f, new o2(icon, 21));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48118a == null) {
            this.f48118a = new o(this);
        }
        return this.f48118a;
    }

    public final void d0(int i13) {
        a0.o(this.f48121d, i13, new Object[0]);
    }

    public final void g0(q91.c type, wy0 avatarUser, q iconRes) {
        h hVar;
        GestaltIconButton gestaltIconButton;
        GestaltAvatar gestaltAvatar;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(avatarUser, "avatarUser");
        Intrinsics.checkNotNullParameter(iconRes, "iconRes");
        int i13 = q91.d.f103081a[type.ordinal()];
        ViewStub viewStub = this.f48127j;
        ViewStub viewStub2 = this.f48126i;
        if (i13 == 1) {
            viewStub2.setLayoutResource(b.view_account_conversion_type_icon);
            View inflate = viewStub2.inflate();
            Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.gestalt.iconbutton.GestaltIconButton");
            viewStub.setLayoutResource(b.view_account_conversion_avatar);
            View inflate2 = viewStub.inflate();
            Intrinsics.g(inflate2, "null cannot be cast to non-null type com.pinterest.gestalt.avatar.GestaltAvatar");
            GestaltAvatar gestaltAvatar2 = (GestaltAvatar) inflate2;
            hVar = h.PERSONAL;
            gestaltIconButton = (GestaltIconButton) inflate;
            gestaltAvatar = gestaltAvatar2;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            viewStub2.setLayoutResource(b.view_account_conversion_avatar);
            View inflate3 = viewStub2.inflate();
            Intrinsics.g(inflate3, "null cannot be cast to non-null type com.pinterest.gestalt.avatar.GestaltAvatar");
            gestaltAvatar = (GestaltAvatar) inflate3;
            viewStub.setLayoutResource(b.view_account_conversion_type_icon);
            View inflate4 = viewStub.inflate();
            Intrinsics.g(inflate4, "null cannot be cast to non-null type com.pinterest.gestalt.iconbutton.GestaltIconButton");
            gestaltIconButton = (GestaltIconButton) inflate4;
            hVar = h.BUSINESS;
        }
        gestaltIconButton.t(new o2(iconRes, 22));
        m0.V0(gestaltAvatar, avatarUser);
        x xVar = this.f48120c;
        if (xVar != null) {
            xVar.r(this.f48128k, hVar, true);
        } else {
            Intrinsics.r("termsAndPrivacyHelper");
            throw null;
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48118a == null) {
            this.f48118a = new o(this);
        }
        return this.f48118a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountConversionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f48119b) {
            this.f48119b = true;
            m0.v0(this, ((jb) ((f) generatedComponent())).f113485c.K6());
        }
        this.f48129l = e.f103093i;
        LayoutInflater.from(getContext()).inflate(b.view_account_conversion, (ViewGroup) this, true);
        View findViewById = findViewById(a.account_conversion_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48121d = (GestaltText) findViewById;
        View findViewById2 = findViewById(a.account_conversion_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48122e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.account_conversion_type_placeholder1);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48126i = (ViewStub) findViewById3;
        View findViewById4 = findViewById(a.account_conversion_type_placeholder2);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48127j = (ViewStub) findViewById4;
        View findViewById5 = findViewById(a.account_conversion_indicator_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48123f = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(a.account_conversion_additional_info);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48124g = (GestaltText) findViewById6;
        final int i14 = 0;
        this.f48125h = ((GestaltButton) findViewById(a.account_conversion_action_button)).d(q91.b.f103063j).e(new gm1.a(this) { // from class: q91.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountConversionView f103052b;

            {
                this.f103052b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                AccountConversionView this$0 = this.f103052b;
                switch (i142) {
                    case 0:
                        int i15 = AccountConversionView.f48117m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48129l.invoke();
                        break;
                    default:
                        int i16 = AccountConversionView.f48117m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48129l.invoke();
                        break;
                }
            }
        });
        this.f48128k = ((GestaltText) findViewById(a.account_conversion_terms_of_service)).i(new i(this, 28));
    }
}
