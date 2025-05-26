package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import df.c1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: c, reason: collision with root package name */
    public final le.g f29994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f29994c = le.g.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r10, int r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.NativeAppLoginMethodHandler.i(int, int, android.content.Intent):boolean");
    }

    public final void m(LoginClient.Result result) {
        if (result != null) {
            e().e(result);
        } else {
            e().k();
        }
    }

    /* renamed from: n, reason: from getter */
    public le.g getF29994c() {
        return this.f29994c;
    }

    public final void o(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && Intrinsics.d(str, "logged_out")) {
            CustomTabLoginMethodHandler.f29925i = true;
            m(null);
            return;
        }
        int i13 = c1.f54739a;
        if (CollectionsKt.L(kotlin.collections.f0.j("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m(null);
            return;
        }
        if (CollectionsKt.L(kotlin.collections.f0.j("access_denied", "OAuthAccessDeniedException"), str)) {
            m(new LoginClient.Result(request, l.CANCEL, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        m(new LoginClient.Result(request, l.ERROR, null, TextUtils.join(": ", arrayList), str3));
    }

    public final void p(Bundle extras, LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            m(new LoginClient.Result(request, l.SUCCESS, gi2.b.Z(request.f29967b, extras, getF29994c(), request.f29969d), gi2.b.a0(request.f29980o, extras), null, null));
        } catch (FacebookException e13) {
            String message = e13.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            m(new LoginClient.Result(request, l.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public final boolean q(Intent intent) {
        if (intent != null) {
            Intrinsics.checkNotNullExpressionValue(le.v.a().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!r1.isEmpty()) {
                Fragment fragment = e().f29956c;
                Unit unit = null;
                q qVar = fragment instanceof q ? (q) fragment : null;
                if (qVar != null) {
                    g.b bVar = qVar.f30034d;
                    if (bVar == null) {
                        Intrinsics.r("launcher");
                        throw null;
                    }
                    bVar.a(intent);
                    unit = Unit.f80348a;
                }
                return unit != null;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f29994c = le.g.FACEBOOK_APPLICATION_WEB;
    }
}
