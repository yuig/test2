package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import df.o1;
import df.t1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l0 extends c8.d {

    /* renamed from: h, reason: collision with root package name */
    public String f30016h;

    /* renamed from: i, reason: collision with root package name */
    public j f30017i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f30018j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30019k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30020l;

    /* renamed from: m, reason: collision with root package name */
    public String f30021m;

    /* renamed from: n, reason: collision with root package name */
    public String f30022n;

    public final t1 c() {
        Bundle bundle = (Bundle) this.f26946f;
        if (bundle == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
        bundle.putString("redirect_uri", this.f30016h);
        bundle.putString("client_id", (String) this.f26943c);
        String str = this.f30021m;
        if (str == null) {
            Intrinsics.r("e2e");
            throw null;
        }
        bundle.putString("e2e", str);
        bundle.putString("response_type", this.f30018j == c0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        String str2 = this.f30022n;
        if (str2 == null) {
            Intrinsics.r("authType");
            throw null;
        }
        bundle.putString("auth_type", str2);
        bundle.putString("login_behavior", this.f30017i.name());
        if (this.f30019k) {
            bundle.putString("fx_app", this.f30018j.toString());
        }
        if (this.f30020l) {
            bundle.putString("skip_dedupe", "true");
        }
        int i13 = t1.f54845m;
        Context context = this.f26941a;
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }
        int i14 = this.f26942b;
        c0 targetApp = this.f30018j;
        o1 o1Var = (o1) this.f26945e;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        t1.b(context);
        return new t1(context, "oauth", bundle, i14, targetApp, o1Var);
    }
}
