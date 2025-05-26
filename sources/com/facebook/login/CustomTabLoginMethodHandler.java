package com.facebook.login;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.LoginClient;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new c8.a(8);

    /* renamed from: i, reason: collision with root package name */
    public static boolean f29925i;

    /* renamed from: d, reason: collision with root package name */
    public String f29926d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29927e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29928f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29929g;

    /* renamed from: h, reason: collision with root package name */
    public final le.g f29930h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f29929g = "custom_tab";
        this.f29930h = le.g.CHROME_CUSTOM_TAB;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.f29927e = bigInteger;
        f29925i = false;
        this.f29928f = df.l.c(super.getF29928f());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getF29950d() {
        return this.f29929g;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g, reason: from getter */
    public final String getF29928f() {
        return this.f29928f;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r7, int r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.i(int, int, android.content.Intent):boolean");
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void k(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put("7_challenge", this.f29927e);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        s.k kVar;
        s.k kVar2;
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient e13 = e();
        if (this.f29928f.length() == 0) {
            return 0;
        }
        Bundle parameters = m(request);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString("redirect_uri", this.f29928f);
        boolean a13 = request.a();
        String str = request.f29969d;
        if (a13) {
            parameters.putString("app_id", str);
        } else {
            parameters.putString("client_id", str);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
        parameters.putString("e2e", jSONObject2);
        if (request.a()) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f29967b.contains("openid")) {
                parameters.putString("nonce", request.f29980o);
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.f29982q);
        a aVar = request.f29983r;
        parameters.putString("code_challenge_method", aVar == null ? null : aVar.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.f29973h);
        parameters.putString("login_behavior", request.f29966a.name());
        le.v vVar = le.v.f83104a;
        parameters.putString("sdk", Intrinsics.n("15.0.2", "android-"));
        parameters.putString("sso", "chrome_custom_tab");
        parameters.putString("cct_prefetching", le.v.f83116m ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        boolean z13 = request.f29978m;
        c0 c0Var = request.f29977l;
        if (z13) {
            parameters.putString("fx_app", c0Var.toString());
        }
        if (request.f29979n) {
            parameters.putString("skip_dedupe", "true");
        }
        String str2 = request.f29975j;
        if (str2 != null) {
            parameters.putString("messenger_page_id", str2);
            parameters.putString("reset_messenger_state", request.f29976k ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        }
        if (f29925i) {
            parameters.putString("cct_over_app_switch", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        if (le.v.f83116m) {
            if (request.a()) {
                s.k kVar3 = b.f30003g;
                Uri url = gi2.b.l0("oauth", parameters);
                Intrinsics.checkNotNullParameter(url, "url");
                ReentrantLock reentrantLock = b.f30005i;
                reentrantLock.lock();
                if (b.f30004h == null && (kVar2 = b.f30003g) != null) {
                    b.f30004h = kVar2.d(null);
                }
                reentrantLock.unlock();
                reentrantLock.lock();
                s.r rVar = b.f30004h;
                if (rVar != null) {
                    Bundle bundle = new Bundle();
                    PendingIntent pendingIntent = rVar.f110288e;
                    if (pendingIntent != null) {
                        bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                    }
                    try {
                        ((b.c) rVar.f110285b).j(rVar.f110286c, url, bundle);
                    } catch (RemoteException unused2) {
                    }
                }
                reentrantLock.unlock();
            } else {
                s.k kVar4 = b.f30003g;
                Uri url2 = me.f.n("oauth", parameters);
                Intrinsics.checkNotNullParameter(url2, "url");
                ReentrantLock reentrantLock2 = b.f30005i;
                reentrantLock2.lock();
                if (b.f30004h == null && (kVar = b.f30003g) != null) {
                    b.f30004h = kVar.d(null);
                }
                reentrantLock2.unlock();
                reentrantLock2.lock();
                s.r rVar2 = b.f30004h;
                if (rVar2 != null) {
                    Bundle bundle2 = new Bundle();
                    PendingIntent pendingIntent2 = rVar2.f110288e;
                    if (pendingIntent2 != null) {
                        bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent2);
                    }
                    try {
                        ((b.c) rVar2.f110285b).j(rVar2.f110286c, url2, bundle2);
                    } catch (RemoteException unused3) {
                    }
                }
                reentrantLock2.unlock();
            }
        }
        FragmentActivity f13 = e13.f();
        if (f13 == null) {
            return 0;
        }
        Intent intent = new Intent(f13, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f29889c, "oauth");
        intent.putExtra(CustomTabMainActivity.f29890d, parameters);
        String str3 = CustomTabMainActivity.f29891e;
        String str4 = this.f29926d;
        if (str4 == null) {
            str4 = df.l.a();
            this.f29926d = str4;
        }
        intent.putExtra(str3, str4);
        intent.putExtra(CustomTabMainActivity.f29893g, c0Var.toString());
        Fragment fragment = e13.f29956c;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: n, reason: from getter */
    public final le.g getF29999g() {
        return this.f29930h;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i13);
        dest.writeString(this.f29927e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f29929g = "custom_tab";
        this.f29930h = le.g.CHROME_CUSTOM_TAB;
        this.f29927e = source.readString();
        this.f29928f = df.l.c(super.getF29928f());
    }
}
