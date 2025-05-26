package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import df.o1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewLoginMethodHandler f30023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginClient.Request f30024b;

    public m0(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient.Request request) {
        this.f30023a = webViewLoginMethodHandler;
        this.f30024b = request;
    }

    @Override // df.o1
    public final void a(Bundle bundle, FacebookException facebookException) {
        WebViewLoginMethodHandler webViewLoginMethodHandler = this.f30023a;
        webViewLoginMethodHandler.getClass();
        LoginClient.Request request = this.f30024b;
        Intrinsics.checkNotNullParameter(request, "request");
        webViewLoginMethodHandler.o(request, bundle, facebookException);
    }
}
