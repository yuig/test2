package com.facebook.login;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import df.i1;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f30013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetTokenLoginMethodHandler f30014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoginClient.Request f30015c;

    public i(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.f30013a = bundle;
        this.f30014b = getTokenLoginMethodHandler;
        this.f30015c = request;
    }

    @Override // df.i1
    public final void K(FacebookException facebookException) {
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.f30014b;
        LoginClient e13 = getTokenLoginMethodHandler.e();
        LoginClient.Request request = getTokenLoginMethodHandler.e().f29960g;
        String message = facebookException == null ? null : facebookException.getMessage();
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        e13.d(new LoginClient.Result(request, l.ERROR, null, TextUtils.join(": ", arrayList), null));
    }

    @Override // df.i1
    public final void w(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.f30013a;
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.f30014b;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e13) {
                LoginClient e14 = getTokenLoginMethodHandler.e();
                LoginClient.Request request = getTokenLoginMethodHandler.e().f29960g;
                String message = e13.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                e14.d(new LoginClient.Result(request, l.ERROR, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        getTokenLoginMethodHandler.m(bundle, this.f30015c);
    }
}
