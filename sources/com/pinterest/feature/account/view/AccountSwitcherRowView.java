package com.pinterest.feature.account.view;

import af2.c;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.u0;
import ki0.b;
import ki0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.a;
import nx.f0;
import nx.m;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/account/view/AccountSwitcherRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnx/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ki0/b", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AccountSwitcherRowView extends ConstraintLayout implements a, c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f45067k = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45068a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45069b;

    /* renamed from: c, reason: collision with root package name */
    public b f45070c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltAvatar f45071d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f45072e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f45073f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f45074g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIcon f45075h;

    /* renamed from: i, reason: collision with root package name */
    public final o5.c f45076i;

    /* renamed from: j, reason: collision with root package name */
    public f0 f45077j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSwitcherRowView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        o5.c a13 = o5.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f45076i = a13;
        LayoutInflater.from(getContext()).inflate(b52.b.view_account_switcher_row, (ViewGroup) this, true);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(8, resources);
        setPadding(0, K, 0, K);
        View findViewById = findViewById(b52.a.account_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45071d = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(b52.a.account_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45072e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b52.a.account_type);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45073f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b52.a.account_email);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45074g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(b52.a.check_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45075h = (GestaltIcon) findViewById5;
        f0 f0Var = this.f45077j;
        if (f0Var != null) {
            ((m) f0Var).a(this);
        } else {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(mr1.h r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "userAccount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.pinterest.api.model.wy0 r0 = r6.f88089b
            com.pinterest.gestalt.avatar.GestaltAvatar r1 = r5.f45071d
            kh2.m0.V0(r1, r0)
            java.lang.Boolean r1 = r0.G3()
            java.lang.String r2 = "getIsPartner(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L37
            boolean[] r1 = r0.V1
            int r3 = r1.length
            r4 = 106(0x6a, float:1.49E-43)
            if (r3 <= r4) goto L37
            boolean r1 = r1[r4]
            if (r1 == 0) goto L37
            com.pinterest.api.model.v10 r1 = r0.Y3()
            if (r1 == 0) goto L31
            java.lang.String r1 = r1.B()
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 != 0) goto L3b
            java.lang.String r1 = ""
            goto L3b
        L37:
            java.lang.String r1 = dl2.b.i1(r0)
        L3b:
            o5.c r3 = r5.f45076i
            java.lang.String r1 = r3.b(r1)
            java.lang.String r3 = "unicodeWrap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            com.pinterest.gestalt.text.GestaltText r3 = r5.f45072e
            pk.a0.p(r3, r1)
            java.lang.Boolean r0 = r0.G3()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L66
            android.content.Context r0 = r5.getContext()
            int r1 = b52.c.account_switcher_type_business
            java.lang.String r0 = r0.getString(r1)
            kotlin.jvm.internal.Intrinsics.f(r0)
            goto L73
        L66:
            android.content.Context r0 = r5.getContext()
            int r1 = b52.c.account_switcher_type_personal
            java.lang.String r0 = r0.getString(r1)
            kotlin.jvm.internal.Intrinsics.f(r0)
        L73:
            com.pinterest.gestalt.text.GestaltText r1 = r5.f45073f
            pk.a0.p(r1, r0)
            s1.w r0 = new s1.w
            r1 = 5
            r0.<init>(r5, r6, r7, r1)
            com.pinterest.gestalt.text.GestaltText r2 = r5.f45074g
            r2.i(r0)
            jc0.m r0 = new jc0.m
            r0.<init>(r7, r1)
            com.pinterest.gestalt.iconcomponent.GestaltIcon r7 = r5.f45075h
            r7.g2(r0)
            xa0.m r7 = new xa0.m
            r0 = 2
            r7.<init>(r0, r5, r6)
            r5.setOnClickListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.account.view.AccountSwitcherRowView.L(mr1.h, boolean):void");
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45068a == null) {
            this.f45068a = new o(this);
        }
        return this.f45068a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.ACCOUNT_SWITCHER, null, null, g0.ACCOUNT_SWITCHER, null, u0.ACCOUNT_SWITCHER_OPEN_SETTINGS_BTN);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45068a == null) {
            this.f45068a = new o(this);
        }
        return this.f45068a.generatedComponent();
    }

    public final void inject() {
        if (this.f45069b) {
            return;
        }
        this.f45069b = true;
        el.a.w1(this, (f0) ((jb) ((e) generatedComponent())).f113483a.f113747j2.get());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSwitcherRowView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        o5.c a13 = o5.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f45076i = a13;
        LayoutInflater.from(getContext()).inflate(b52.b.view_account_switcher_row, (ViewGroup) this, true);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(8, resources);
        setPadding(0, K, 0, K);
        View findViewById = findViewById(b52.a.account_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45071d = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(b52.a.account_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45072e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b52.a.account_type);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45073f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b52.a.account_email);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45074g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(b52.a.check_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45075h = (GestaltIcon) findViewById5;
        f0 f0Var = this.f45077j;
        if (f0Var != null) {
            ((m) f0Var).a(this);
        } else {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSwitcherRowView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        o5.c a13 = o5.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f45076i = a13;
        LayoutInflater.from(getContext()).inflate(b52.b.view_account_switcher_row, (ViewGroup) this, true);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(8, resources);
        setPadding(0, K, 0, K);
        View findViewById = findViewById(b52.a.account_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45071d = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(b52.a.account_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45072e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b52.a.account_type);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45073f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b52.a.account_email);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45074g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(b52.a.check_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45075h = (GestaltIcon) findViewById5;
        f0 f0Var = this.f45077j;
        if (f0Var != null) {
            ((m) f0Var).a(this);
        } else {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
    }
}
