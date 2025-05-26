package com.pinterest.feature.account.recovery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import gi0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yr1.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/account/recovery/view/ResetPasswordView;", "Landroid/widget/LinearLayout;", "Lgi0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "identityLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ResetPasswordView extends LinearLayout implements a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45061f = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f45062a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f45063b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f45064c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltButton f45065d;

    /* renamed from: e, reason: collision with root package name */
    public ii0.a f45066e;

    public ResetPasswordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        View.inflate(getContext(), b.reset_account, this);
        setOrientation(1);
        View findViewById = findViewById(yr1.a.reset_password_header_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45062a = (GestaltText) findViewById;
        View findViewById2 = findViewById(yr1.a.reset_password_sent_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45063b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(yr1.a.resend_email_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45064c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(yr1.a.ok_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45065d = (GestaltButton) findViewById4;
    }

    public ResetPasswordView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a();
    }
}
