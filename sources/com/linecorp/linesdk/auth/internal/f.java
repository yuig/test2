package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import gi.m;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static Intent f34102i;

    /* renamed from: a, reason: collision with root package name */
    public final LineAuthenticationActivity f34103a;

    /* renamed from: b, reason: collision with root package name */
    public final LineAuthenticationConfig f34104b;

    /* renamed from: c, reason: collision with root package name */
    public final xn.e f34105c;

    /* renamed from: d, reason: collision with root package name */
    public final xn.g f34106d;

    /* renamed from: e, reason: collision with root package name */
    public final b f34107e;

    /* renamed from: f, reason: collision with root package name */
    public final m f34108f;

    /* renamed from: g, reason: collision with root package name */
    public final LineAuthenticationParams f34109g;

    /* renamed from: h, reason: collision with root package name */
    public final LineAuthenticationStatus f34110h;

    public f(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, LineAuthenticationStatus lineAuthenticationStatus, LineAuthenticationParams lineAuthenticationParams) {
        Context applicationContext = lineAuthenticationActivity.getApplicationContext();
        Uri uri = lineAuthenticationConfig.f34066b;
        Uri uri2 = lineAuthenticationConfig.f34067c;
        xn.e eVar = new xn.e(applicationContext, uri, uri2);
        xn.g gVar = new xn.g(lineAuthenticationActivity.getApplicationContext(), uri2);
        b bVar = new b(lineAuthenticationStatus);
        m mVar = new m(23, lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.f34065a);
        this.f34103a = lineAuthenticationActivity;
        this.f34104b = lineAuthenticationConfig;
        this.f34105c = eVar;
        this.f34106d = gVar;
        this.f34107e = bVar;
        this.f34108f = mVar;
        this.f34110h = lineAuthenticationStatus;
        this.f34109g = lineAuthenticationParams;
    }

    public final void a(Intent intent) {
        a aVar;
        LineAuthenticationStatus lineAuthenticationStatus = this.f34110h;
        lineAuthenticationStatus.getClass();
        lineAuthenticationStatus.f34090e = h.INTENT_RECEIVED;
        b bVar = this.f34107e;
        bVar.getClass();
        Uri data = intent.getData();
        if (data == null) {
            aVar = new a(null, null, null, null, "Illegal redirection from external application.");
        } else {
            String str = bVar.f34096a.f34088c;
            String queryParameter = data.getQueryParameter(AnimatedTarget.PROPERTY_STATE);
            if (str == null || !str.equals(queryParameter)) {
                aVar = new a(null, null, null, null, "Illegal parameter value of 'state'.");
            } else {
                String queryParameter2 = data.getQueryParameter("code");
                String queryParameter3 = data.getQueryParameter("friendship_status_changed");
                aVar = !TextUtils.isEmpty(queryParameter2) ? new a(queryParameter2, !TextUtils.isEmpty(queryParameter3) ? Boolean.valueOf(Boolean.parseBoolean(queryParameter3)) : null, null, null, null) : new a(null, null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
            }
        }
        String str2 = aVar.f34091a;
        if (!TextUtils.isEmpty(str2)) {
            new d(this).execute(aVar);
        } else {
            lineAuthenticationStatus.f34090e = h.INTENT_HANDLED;
            this.f34103a.a((!TextUtils.isEmpty(aVar.f34095e) || (TextUtils.isEmpty(str2) ^ true)) ? LineLoginResult.a(rn.c.INTERNAL_ERROR, aVar.a()) : LineLoginResult.a(rn.c.AUTHENTICATION_AGENT_ERROR, aVar.a()));
        }
    }
}
