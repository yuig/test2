package com.pinterest.activity.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.ui.imageview.WebImageView;
import cs1.b;
import cs1.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m1.e0;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/web/WebAuthenticateHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inAppBrowser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WebAuthenticateHeader extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public WebImageView f35235a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltButton f35236b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltButton f35237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthenticateHeader(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        T(context);
    }

    public final void L(Function0 onTapOne, Function0 onTapTwo) {
        Intrinsics.checkNotNullParameter("https://i.pinimg.com/originals/6f/bd/51/6fbd51bc0e58f82cda11cecc22ab4065.png", "imageUrl");
        Intrinsics.checkNotNullParameter(onTapOne, "onTapOne");
        Intrinsics.checkNotNullParameter(onTapTwo, "onTapTwo");
        WebImageView webImageView = this.f35235a;
        if (webImageView == null) {
            Intrinsics.r("image");
            throw null;
        }
        webImageView.loadUrl("https://i.pinimg.com/originals/6f/bd/51/6fbd51bc0e58f82cda11cecc22ab4065.png");
        GestaltButton gestaltButton = this.f35236b;
        if (gestaltButton == null) {
            Intrinsics.r("loginButton");
            throw null;
        }
        a0.m(gestaltButton, new e0(4, onTapOne));
        GestaltButton gestaltButton2 = this.f35237c;
        if (gestaltButton2 != null) {
            a0.m(gestaltButton2, new e0(5, onTapTwo));
        } else {
            Intrinsics.r("signupButton");
            throw null;
        }
    }

    public final void T(Context context) {
        View.inflate(context, c.web_authenticate_header, this);
        View findViewById = findViewById(b.pinterest_logo);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35235a = (WebImageView) findViewById;
        View findViewById2 = findViewById(b.header_login_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f35236b = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(b.header_signup_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35237c = (GestaltButton) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthenticateHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        T(context);
    }
}
