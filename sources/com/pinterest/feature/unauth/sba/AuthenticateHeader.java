package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/unauth/sba/AuthenticateHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AuthenticateHeader extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f48749a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f48750b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f48751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticateHeader(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(context, vq1.c.authenticate_header, this);
        View findViewById = findViewById(vq1.b.pinterest_logo);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48749a = (WebImageView) findViewById;
        View findViewById2 = findViewById(vq1.b.header_login_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48750b = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(vq1.b.header_signup_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48751c = (GestaltButton) findViewById3;
    }

    public final void L(Function0 onTapOne, Function0 onTapTwo) {
        Intrinsics.checkNotNullParameter("https://i.pinimg.com/originals/6f/bd/51/6fbd51bc0e58f82cda11cecc22ab4065.png", "imageUrl");
        Intrinsics.checkNotNullParameter(onTapOne, "onTapOne");
        Intrinsics.checkNotNullParameter(onTapTwo, "onTapTwo");
        WebImageView webImageView = this.f48749a;
        if (webImageView == null) {
            Intrinsics.r("image");
            throw null;
        }
        webImageView.loadUrl("https://i.pinimg.com/originals/6f/bd/51/6fbd51bc0e58f82cda11cecc22ab4065.png");
        GestaltButton gestaltButton = this.f48750b;
        if (gestaltButton == null) {
            Intrinsics.r("loginButton");
            throw null;
        }
        pk.a0.m(gestaltButton, new com.pinterest.feature.ideaPinCreation.closeup.view.d0(8, onTapOne));
        GestaltButton gestaltButton2 = this.f48751c;
        if (gestaltButton2 != null) {
            pk.a0.m(gestaltButton2, new com.pinterest.feature.ideaPinCreation.closeup.view.d0(9, onTapTwo));
        } else {
            Intrinsics.r("signupButton");
            throw null;
        }
    }
}
