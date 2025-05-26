package com.facebook.login;

import a.o3;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new c8.a(10);

    /* renamed from: c, reason: collision with root package name */
    public h f29949c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f29950d = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void b() {
        h hVar = this.f29949c;
        if (hVar == null) {
            return;
        }
        hVar.f54705d = false;
        hVar.f54704c = null;
        this.f29949c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getF29998f() {
        return this.f29950d;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Context f13 = e().f();
        if (f13 == null) {
            f13 = le.v.a();
        }
        Context context = f13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        h hVar = new h(context, 65536, 65537, 20121101, request.f29969d, request.f29980o);
        this.f29949c = hVar;
        if (Intrinsics.d(Boolean.valueOf(hVar.d()), Boolean.FALSE)) {
            return 0;
        }
        p pVar = e().f29958e;
        if (pVar != null) {
            View view = pVar.f30029a.f30035e;
            if (view == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            view.setVisibility(0);
        }
        o3 o3Var = new o3(25, this, request);
        h hVar2 = this.f29949c;
        if (hVar2 == null) {
            return 1;
        }
        hVar2.f54704c = o3Var;
        return 1;
    }

    public final void m(Bundle bundle, LoginClient.Request request) {
        LoginClient.Result result;
        AccessToken Y;
        String str;
        String string;
        AuthenticationToken authenticationToken;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(bundle, "result");
        try {
            Y = gi2.b.Y(bundle, le.g.FACEBOOK_APPLICATION_SERVICE, request.f29969d);
            str = request.f29980o;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (FacebookException e13) {
            LoginClient.Request request2 = e().f29960g;
            String message = e13.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            result = new LoginClient.Result(request2, l.ERROR, null, TextUtils.join(": ", arrayList), null);
        }
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                authenticationToken = new AuthenticationToken(string, str);
                result = new LoginClient.Result(request, l.SUCCESS, Y, authenticationToken, null, null);
                e().e(result);
            } catch (Exception e14) {
                throw new FacebookException(e14.getMessage());
            }
        }
        authenticationToken = null;
        result = new LoginClient.Result(request, l.SUCCESS, Y, authenticationToken, null, null);
        e().e(result);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f29950d = "get_token";
    }
}
