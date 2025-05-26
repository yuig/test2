package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import df.j1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: c, reason: collision with root package name */
    public String f29995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m(com.facebook.login.LoginClient.Request r8) {
        /*
            r7 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r8.f29967b
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L29
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L17
            goto L29
        L17:
            java.util.Set r1 = r8.f29967b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = ","
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)
            java.lang.String r2 = "scope"
            r0.putString(r2, r1)
            r7.a(r1, r2)
        L29:
            com.facebook.login.c r1 = r8.f29968c
            if (r1 != 0) goto L2f
            com.facebook.login.c r1 = com.facebook.login.c.NONE
        L2f:
            java.lang.String r2 = "default_audience"
            java.lang.String r1 = r1.getNativeProtocolAudience()
            r0.putString(r2, r1)
            java.lang.String r8 = r8.f29970e
            java.lang.String r8 = r7.d(r8)
            java.lang.String r1 = "state"
            r0.putString(r1, r8)
            java.util.Date r8 = com.facebook.AccessToken.f29844l
            com.facebook.AccessToken r8 = wc.j.s()
            if (r8 != 0) goto L4d
            r8 = 0
            goto L4f
        L4d:
            java.lang.String r8 = r8.f29851e
        L4f:
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            java.lang.String r3 = "access_token"
            if (r8 == 0) goto L81
            com.facebook.login.LoginClient r4 = r7.e()
            androidx.fragment.app.FragmentActivity r4 = r4.f()
            if (r4 != 0) goto L65
            android.content.Context r4 = le.v.a()
        L65:
            java.lang.String r5 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)
            java.lang.String r5 = "TOKEN"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r8, r4)
            if (r4 == 0) goto L81
            r0.putString(r3, r8)
            r7.a(r2, r3)
            goto L92
        L81:
            com.facebook.login.LoginClient r8 = r7.e()
            androidx.fragment.app.FragmentActivity r8 = r8.f()
            if (r8 != 0) goto L8c
            goto L8f
        L8c:
            df.j1.y(r8)
        L8f:
            r7.a(r1, r3)
        L92:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "cbt"
            r0.putString(r3, r8)
            le.v r8 = le.v.f83104a
            boolean r8 = le.o0.b()
            if (r8 == 0) goto La8
            r1 = r2
        La8:
            java.lang.String r8 = "ies"
            r0.putString(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.WebLoginMethodHandler.m(com.facebook.login.LoginClient$Request):android.os.Bundle");
    }

    /* renamed from: n */
    public abstract le.g getF29999g();

    public final void o(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient e13 = e();
        String str = null;
        this.f29995c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f29995c = bundle.getString("e2e");
            }
            try {
                AccessToken Z = gi2.b.Z(request.f29967b, bundle, getF29999g(), request.f29969d);
                result = new LoginClient.Result(e13.f29960g, l.SUCCESS, Z, gi2.b.a0(request.f29980o, bundle), null, null);
                if (e13.f() != null) {
                    try {
                        CookieSyncManager.createInstance(e13.f()).sync();
                    } catch (Exception unused) {
                    }
                    if (Z != null) {
                        String str2 = Z.f29851e;
                        Context f13 = e().f();
                        if (f13 == null) {
                            f13 = le.v.a();
                        }
                        f13.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str2).apply();
                    }
                }
            } catch (FacebookException e14) {
                LoginClient.Request request2 = e13.f29960g;
                String message = e14.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                result = new LoginClient.Result(request2, l.ERROR, null, TextUtils.join(": ", arrayList), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = new LoginClient.Result(e13.f29960g, l.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f29995c = null;
            String message2 = facebookException == null ? null : facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError facebookRequestError = ((FacebookServiceException) facebookException).f29914b;
                str = String.valueOf(facebookRequestError.f29906b);
                message2 = facebookRequestError.toString();
            }
            String str3 = str;
            LoginClient.Request request3 = e13.f29960g;
            ArrayList arrayList2 = new ArrayList();
            if (message2 != null) {
                arrayList2.add(message2);
            }
            result = new LoginClient.Result(request3, l.ERROR, null, TextUtils.join(": ", arrayList2), str3);
        }
        if (!j1.V0(this.f29995c)) {
            h(this.f29995c);
        }
        e13.e(result);
    }
}
