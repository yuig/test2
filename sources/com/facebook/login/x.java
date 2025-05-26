package com.facebook.login;

import a.cb;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.k1;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kh2.u2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x {

    /* renamed from: j, reason: collision with root package name */
    public static final wc.j f30074j = new wc.j(29, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final Set f30075k = h1.f("ads_management", "create_event", "rsvp_event");

    /* renamed from: l, reason: collision with root package name */
    public static final String f30076l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile x f30077m;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f30080c;

    /* renamed from: e, reason: collision with root package name */
    public String f30082e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30083f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30085h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30086i;

    /* renamed from: a, reason: collision with root package name */
    public j f30078a = j.NATIVE_WITH_FALLBACK;

    /* renamed from: b, reason: collision with root package name */
    public c f30079b = c.FRIENDS;

    /* renamed from: d, reason: collision with root package name */
    public String f30081d = "rerequest";

    /* renamed from: g, reason: collision with root package name */
    public c0 f30084g = c0.FACEBOOK;

    static {
        String cls = x.class.toString();
        Intrinsics.checkNotNullExpressionValue(cls, "LoginManager::class.java.toString()");
        f30076l = cls;
    }

    public x() {
        k1.f();
        SharedPreferences sharedPreferences = le.v.a().getSharedPreferences("com.facebook.loginManager", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f30080c = sharedPreferences;
        if (!le.v.f83116m || df.l.a() == null) {
            return;
        }
        s.k.a(le.v.a(), "com.android.chrome", new b());
        s.k.b(le.v.a(), le.v.a().getPackageName());
    }

    public static Intent b(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent();
        intent.setClass(le.v.a(), FacebookActivity.class);
        intent.setAction(request.f29966a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public static void c(Activity activity, l lVar, Map map, FacebookException facebookException, boolean z13, LoginClient.Request request) {
        r a13 = w.f30047a.a(activity);
        if (a13 == null) {
            return;
        }
        if (request == null) {
            ScheduledExecutorService scheduledExecutorService = r.f30036d;
            if (p001if.a.b(r.class)) {
                return;
            }
            try {
                a13.b("fb_mobile_login_complete", "");
                return;
            } catch (Throwable th3) {
                p001if.a.a(r.class, th3);
                return;
            }
        }
        HashMap loggingExtras = new HashMap();
        loggingExtras.put("try_login_activity", z13 ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        String str = request.f29970e;
        String str2 = request.f29978m ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        if (p001if.a.b(a13)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
            ScheduledExecutorService scheduledExecutorService2 = r.f30036d;
            Bundle b13 = wc.b.b(str);
            if (lVar != null) {
                b13.putString("2_result", lVar.getLoggingValue());
            }
            if ((facebookException == null ? null : facebookException.getMessage()) != null) {
                b13.putString("5_error_message", facebookException.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ^ true ? new JSONObject(loggingExtras) : null;
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                b13.putString("6_extras", jSONObject.toString());
            }
            a13.f30038b.c(str2, b13);
            if (lVar != l.SUCCESS || p001if.a.b(a13)) {
                return;
            }
            try {
                r.f30036d.schedule(new androidx.media3.ui.z(19, a13, wc.b.b(str)), 5L, TimeUnit.SECONDS);
            } catch (Throwable th4) {
                p001if.a.a(a13, th4);
            }
        } catch (Throwable th5) {
            p001if.a.a(a13, th5);
        }
    }

    public static void e(Activity activity, LoginClient.Request pendingLoginRequest) {
        r a13 = w.f30047a.a(activity);
        if (a13 != null) {
            String str = pendingLoginRequest.f29978m ? "foa_mobile_login_start" : "fb_mobile_login_start";
            if (p001if.a.b(a13)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(pendingLoginRequest, "pendingLoginRequest");
                ScheduledExecutorService scheduledExecutorService = r.f30036d;
                Bundle b13 = wc.b.b(pendingLoginRequest.f29970e);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", pendingLoginRequest.f29966a.toString());
                    jSONObject.put("request_code", df.i.Login.toRequestCode());
                    jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.f29967b));
                    jSONObject.put("default_audience", pendingLoginRequest.f29968c.toString());
                    jSONObject.put("isReauthorize", pendingLoginRequest.f29971f);
                    String str2 = a13.f30039c;
                    if (str2 != null) {
                        jSONObject.put("facebookVersion", str2);
                    }
                    c0 c0Var = pendingLoginRequest.f29977l;
                    if (c0Var != null) {
                        jSONObject.put("target_app", c0Var.toString());
                    }
                    b13.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                a13.f30038b.c(str, b13);
            } catch (Throwable th3) {
                p001if.a.a(a13, th3);
            }
        }
    }

    public final LoginClient.Request a(n loginConfig) {
        String a13;
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        a aVar = a.S256;
        try {
            a13 = u2.R(loginConfig.a(), aVar);
        } catch (FacebookException unused) {
            aVar = a.PLAIN;
            a13 = loginConfig.a();
        }
        LoginClient.Request request = new LoginClient.Request(this.f30078a, CollectionsKt.J0(loginConfig.c()), this.f30079b, this.f30081d, le.v.b(), cb.g("randomUUID().toString()"), this.f30084g, loginConfig.b(), loginConfig.a(), a13, aVar);
        Date date = AccessToken.f29844l;
        request.e(wc.j.z());
        request.d(this.f30082e);
        request.f(this.f30083f);
        request.b(this.f30085h);
        request.g(this.f30086i);
        return request;
    }

    public final void d() {
        Date date = AccessToken.f29844l;
        le.e.f83036f.t().d(null, true);
        com.bugsnag.android.a0.s(null);
        String str = Profile.f29917h;
        com.bugsnag.android.a0.t(null);
        SharedPreferences.Editor edit = this.f30080c.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i13, Intent intent, le.q qVar) {
        l lVar;
        boolean z13;
        FacebookException facebookException;
        LoginClient.Request request;
        AccessToken newToken;
        Map map;
        AuthenticationToken authenticationToken;
        boolean z14;
        Parcelable parcelable;
        l lVar2 = l.ERROR;
        y yVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                lVar = result.f29984a;
                if (i13 != -1) {
                    if (i13 != 0) {
                        facebookException = null;
                        newToken = null;
                    } else {
                        z14 = true;
                        facebookException = null;
                        newToken = null;
                        parcelable = newToken;
                        Map map2 = result.f29990g;
                        request = result.f29989f;
                        authenticationToken = parcelable;
                        z13 = z14;
                        map = map2;
                    }
                } else if (lVar == l.SUCCESS) {
                    AccessToken accessToken = result.f29985b;
                    z14 = false;
                    parcelable = result.f29986c;
                    newToken = accessToken;
                    facebookException = null;
                    Map map22 = result.f29990g;
                    request = result.f29989f;
                    authenticationToken = parcelable;
                    z13 = z14;
                    map = map22;
                } else {
                    facebookException = new FacebookAuthorizationException(result.f29987d);
                    newToken = null;
                }
                z14 = false;
                parcelable = newToken;
                Map map222 = result.f29990g;
                request = result.f29989f;
                authenticationToken = parcelable;
                z13 = z14;
                map = map222;
            }
            lVar = lVar2;
            facebookException = null;
            request = null;
            newToken = null;
            map = null;
            authenticationToken = 0;
            z13 = false;
        } else {
            if (i13 == 0) {
                lVar = l.CANCEL;
                z13 = true;
                facebookException = null;
                request = null;
                newToken = null;
                map = null;
                authenticationToken = 0;
            }
            lVar = lVar2;
            facebookException = null;
            request = null;
            newToken = null;
            map = null;
            authenticationToken = 0;
            z13 = false;
        }
        if (facebookException == null && newToken == null && !z13) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        c(null, lVar, map, facebookException, true, request);
        if (newToken != null) {
            Date date = AccessToken.f29844l;
            le.e.f83036f.t().d(newToken, true);
            String str = Profile.f29917h;
            com.bugsnag.android.a0.o();
        }
        if (authenticationToken != 0) {
            com.bugsnag.android.a0.s(authenticationToken);
        }
        if (qVar != null) {
            if (newToken != null && request != null) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(newToken, "newToken");
                Set set = request.f29967b;
                LinkedHashSet I0 = CollectionsKt.I0(CollectionsKt.Q(newToken.f29848b));
                if (request.f29971f) {
                    I0.retainAll(set);
                }
                LinkedHashSet I02 = CollectionsKt.I0(CollectionsKt.Q(set));
                I02.removeAll(I0);
                yVar = new y(newToken, authenticationToken, I0, I02);
            }
            if (z13 || (yVar != null && yVar.f30089c.isEmpty())) {
                ((hr1.l) qVar).a();
                return;
            }
            if (facebookException != null) {
                ((hr1.l) qVar).b(facebookException);
                return;
            }
            if (newToken == null || yVar == null) {
                return;
            }
            SharedPreferences.Editor edit = this.f30080c.edit();
            edit.putBoolean("express_login_allowed", true);
            edit.apply();
            ((hr1.l) qVar).c(yVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.login.s] */
    public final void g(k0 k0Var, LoginClient.Request request) {
        e(k0Var.a(), request);
        df.j.f54763b.q(df.i.Login.toRequestCode(), new df.h() { // from class: com.facebook.login.s
            @Override // df.h
            public final void a(Intent intent, int i13) {
                x this$0 = x.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f(i13, intent, null);
            }
        });
        Intent b13 = b(request);
        if (le.v.a().getPackageManager().resolveActivity(b13, 0) != null) {
            try {
                k0Var.startActivityForResult(b13, gi2.b.j0());
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        c(k0Var.a(), l.ERROR, null, facebookException, false, request);
        throw facebookException;
    }
}
