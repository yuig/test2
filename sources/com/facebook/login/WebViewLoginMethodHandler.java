package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import df.j1;
import df.k1;
import df.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "com/facebook/login/l0", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new c8.a(14);

    /* renamed from: d, reason: collision with root package name */
    public t1 f29996d;

    /* renamed from: e, reason: collision with root package name */
    public String f29997e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29998f;

    /* renamed from: g, reason: collision with root package name */
    public final le.g f29999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f29998f = "web_view";
        this.f29999g = le.g.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void b() {
        t1 t1Var = this.f29996d;
        if (t1Var != null) {
            if (t1Var != null) {
                t1Var.cancel();
            }
            this.f29996d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getF29998f() {
        return this.f29998f;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle parameters = m(request);
        m0 m0Var = new m0(this, request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
        this.f29997e = jSONObject2;
        a(jSONObject2, "e2e");
        FragmentActivity context = e().f();
        if (context == null) {
            return 0;
        }
        boolean L0 = j1.L0(context);
        Intrinsics.checkNotNullParameter(this, "this$0");
        Intrinsics.checkNotNullParameter(context, "context");
        String applicationId = request.f29969d;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("oauth", "action");
        l0 l0Var = new l0();
        if (applicationId == null) {
            k1.d(context, "context");
            applicationId = le.v.b();
        }
        k1.e(applicationId, "applicationId");
        l0Var.f26943c = applicationId;
        l0Var.f26941a = context;
        l0Var.f26944d = "oauth";
        l0Var.f26946f = parameters;
        l0Var.f30016h = "fbconnect://success";
        l0Var.f30017i = j.NATIVE_WITH_FALLBACK;
        l0Var.f30018j = c0.FACEBOOK;
        String e2e = this.f29997e;
        if (e2e == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Intrinsics.checkNotNullParameter(e2e, "e2e");
        Intrinsics.checkNotNullParameter(e2e, "<set-?>");
        l0Var.f30021m = e2e;
        l0Var.f30016h = L0 ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String authType = request.f29973h;
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(authType, "<set-?>");
        l0Var.f30022n = authType;
        j loginBehavior = request.f29966a;
        Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        l0Var.f30017i = loginBehavior;
        c0 targetApp = request.f29977l;
        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        l0Var.f30018j = targetApp;
        l0Var.f30019k = request.f29978m;
        l0Var.f30020l = request.f29979n;
        l0Var.f26945e = m0Var;
        this.f29996d = l0Var.c();
        df.n nVar = new df.n();
        nVar.setRetainInstance(true);
        nVar.f54807q = this.f29996d;
        nVar.S6(context.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: n, reason: from getter */
    public final le.g getF29999g() {
        return this.f29999g;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i13);
        dest.writeString(this.f29997e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f29998f = "web_view";
        this.f29999g = le.g.WEB_VIEW;
        this.f29997e = source.readString();
    }
}
