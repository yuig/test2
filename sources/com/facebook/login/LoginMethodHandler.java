package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import df.j1;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import le.o0;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f29992a;

    /* renamed from: b, reason: collision with root package name */
    public LoginClient f29993b;

    public LoginMethodHandler(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.f29993b = loginClient;
    }

    public final void a(String str, String str2) {
        if (this.f29992a == null) {
            this.f29992a = new HashMap();
        }
        HashMap hashMap = this.f29992a;
        if (hashMap == null) {
            return;
        }
    }

    public void b() {
    }

    public final String d(String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", getF29998f());
            k(jSONObject);
        } catch (JSONException e13) {
            Log.w("LoginMethodHandler", Intrinsics.n(e13.getMessage(), "Error creating client state json: "));
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final LoginClient e() {
        LoginClient loginClient = this.f29993b;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.r("loginClient");
        throw null;
    }

    /* renamed from: f */
    public abstract String getF29998f();

    /* renamed from: g */
    public String getF29928f() {
        return "fb" + le.v.b() + "://authorize/";
    }

    public final void h(String str) {
        LoginClient.Request request = e().f29960g;
        String str2 = request == null ? null : request.f29969d;
        if (str2 == null) {
            str2 = le.v.b();
        }
        me.r rVar = new me.r(e().f(), str2);
        Bundle a13 = n60.o.a("fb_web_login_e2e", str);
        a13.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        a13.putString("app_id", str2);
        le.v vVar = le.v.f83104a;
        if (o0.b()) {
            rVar.f87020a.f("fb_dialogs_web_login_dialog_complete", a13);
        }
    }

    public boolean i(int i13, int i14, Intent intent) {
        return false;
    }

    public final void j(Bundle values, LoginClient.Request request) {
        le.a0 A;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String authorizationCode = values.getString("code");
        if (j1.V0(authorizationCode)) {
            throw new FacebookException("No code param found from the request");
        }
        if (authorizationCode == null) {
            A = null;
        } else {
            String redirectUri = getF29928f();
            String codeVerifier = request.f29981p;
            if (codeVerifier == null) {
                codeVerifier = "";
            }
            Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
            Bundle bundle = new Bundle();
            bundle.putString("code", authorizationCode);
            bundle.putString("client_id", le.v.b());
            bundle.putString("redirect_uri", redirectUri);
            bundle.putString("code_verifier", codeVerifier);
            String str = le.a0.f83002j;
            A = wc.b.A(null, "oauth/access_token", null);
            A.l(le.f0.GET);
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            A.f83009d = bundle;
        }
        if (A == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        le.e0 d2 = A.d();
        FacebookRequestError facebookRequestError = d2.f83046c;
        if (facebookRequestError != null) {
            throw new FacebookServiceException(facebookRequestError, facebookRequestError.a());
        }
        try {
            JSONObject jSONObject = d2.f83045b;
            String string = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || j1.V0(string)) {
                throw new FacebookException("No access token found from result");
            }
            values.putString("access_token", string);
            if (jSONObject.has("id_token")) {
                values.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e13) {
            throw new FacebookException(Intrinsics.n(e13.getMessage(), "Fail to process code exchange response: "));
        }
    }

    public void k(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public abstract int l(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        HashMap hashMap = this.f29992a;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public LoginMethodHandler(Parcel parcel) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(parcel, "source");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            if (readInt > 0) {
                int i13 = 0;
                do {
                    i13++;
                    hashMap.put(parcel.readString(), parcel.readString());
                } while (i13 < readInt);
            }
        }
        this.f29992a = hashMap != null ? z0.r(hashMap) : null;
    }
}
