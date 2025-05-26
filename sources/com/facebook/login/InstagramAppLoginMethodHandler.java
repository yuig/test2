package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import df.w0;
import df.y0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new c8.a(11);

    /* renamed from: d, reason: collision with root package name */
    public final String f29951d;

    /* renamed from: e, reason: collision with root package name */
    public final le.g f29952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f29951d = "instagram_login";
        this.f29952e = le.g.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getF29950d() {
        return this.f29951d;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        boolean z13;
        Object obj;
        String str;
        Intent intent;
        String str2;
        ResolveInfo resolveActivity;
        InstagramAppLoginMethodHandler instagramAppLoginMethodHandler = this;
        Intrinsics.checkNotNullParameter(request, "request");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String e2e = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(e2e, "e2e.toString()");
        y0 y0Var = y0.f54883a;
        Context context = e().f();
        if (context == null) {
            context = le.v.a();
        }
        String applicationId = request.f29969d;
        Set set = request.f29967b;
        Set permissions = set;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                z13 = false;
                break;
            }
            String str3 = (String) it.next();
            wc.j jVar = x.f30074j;
            if (wc.j.A(str3)) {
                z13 = true;
                break;
            }
        }
        c cVar = request.f29968c;
        if (cVar == null) {
            cVar = c.NONE;
        }
        c defaultAudience = cVar;
        String clientState = instagramAppLoginMethodHandler.d(request.f29970e);
        String authType = request.f29973h;
        String str4 = request.f29975j;
        boolean z14 = request.f29976k;
        boolean z15 = request.f29978m;
        boolean z16 = request.f29979n;
        Intent intent2 = null;
        if (p001if.a.b(y0.class)) {
            str2 = "e2e";
            intent = null;
        } else {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
            } catch (Throwable th3) {
                th = th3;
                obj = y0.class;
            }
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                Intrinsics.checkNotNullParameter(e2e, "e2e");
                Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
                Intrinsics.checkNotNullParameter(clientState, "clientState");
                Intrinsics.checkNotNullParameter(authType, "authType");
                str = "e2e";
                try {
                    Intent c13 = y0.f54883a.c(new w0(), applicationId, permissions, e2e, z13, defaultAudience, clientState, authType, false, str4, z14, c0.INSTAGRAM, z15, z16, "");
                    if (!p001if.a.b(y0.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (c13 != null && (resolveActivity = context.getPackageManager().resolveActivity(c13, 0)) != null) {
                                HashSet hashSet = df.q.f54832a;
                                String str5 = resolveActivity.activityInfo.packageName;
                                Intrinsics.checkNotNullExpressionValue(str5, "resolveInfo.activityInfo.packageName");
                                if (df.q.a(context, str5)) {
                                    intent2 = c13;
                                }
                            }
                        } catch (Throwable th4) {
                            obj = y0.class;
                            try {
                                p001if.a.a(obj, th4);
                            } catch (Throwable th5) {
                                th = th5;
                                p001if.a.a(obj, th);
                                instagramAppLoginMethodHandler = this;
                                intent = intent2;
                                str2 = str;
                                instagramAppLoginMethodHandler.a(e2e, str2);
                                df.i.Login.toRequestCode();
                                return instagramAppLoginMethodHandler.q(intent) ? 1 : 0;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = y0.class;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = y0.class;
                str = "e2e";
                p001if.a.a(obj, th);
                instagramAppLoginMethodHandler = this;
                intent = intent2;
                str2 = str;
                instagramAppLoginMethodHandler.a(e2e, str2);
                df.i.Login.toRequestCode();
                return instagramAppLoginMethodHandler.q(intent) ? 1 : 0;
            }
            instagramAppLoginMethodHandler = this;
            intent = intent2;
            str2 = str;
        }
        instagramAppLoginMethodHandler.a(e2e, str2);
        df.i.Login.toRequestCode();
        return instagramAppLoginMethodHandler.q(intent) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* renamed from: n, reason: from getter */
    public final le.g getF29994c() {
        return this.f29952e;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f29951d = "instagram_login";
        this.f29952e = le.g.INSTAGRAM_APPLICATION_WEB;
    }
}
