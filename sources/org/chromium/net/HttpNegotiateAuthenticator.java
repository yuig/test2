package org.chromium.net;

import J.N;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import java.util.Map;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    public HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    @CalledByNative
    public static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(Bundle bundle, j jVar) {
        this.mSpnegoContext = bundle.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i13 = -9;
        switch (bundle.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i13 = 0;
                break;
            case 2:
                i13 = -3;
                break;
            case 3:
                i13 = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i13 = NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i13 = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i13 = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i13 = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i13 = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i13 = NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        N.M0s8NeYn(jVar.f97442a, this, i13, bundle.getString("authtoken"));
    }

    private void requestTokenWithActivity(Context context, Activity activity, j jVar, String[] strArr) {
        if (!lacksPermission(context, "android.permission.GET_ACCOUNTS", false)) {
            jVar.f97443b.getAuthTokenByFeatures(this.mAccountType, jVar.f97445d, strArr, activity, null, jVar.f97444c, new i(this, jVar, 1), new Handler(ThreadUtils.a().getLooper()));
        } else {
            dp2.e.a(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            N.M0s8NeYn(jVar.f97442a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        }
    }

    private void requestTokenWithoutActivity(Context context, j jVar, String[] strArr) {
        if (!lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            jVar.f97443b.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new i(this, jVar, 0), new Handler(ThreadUtils.a().getLooper()));
        } else {
            Log.e("cr_net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            N.M0s8NeYn(jVar.f97442a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        }
    }

    @CalledByNative
    public void getNextAuthToken(long j13, String str, String str2, boolean z13) {
        Context context = so.a.f113317a;
        j jVar = new j();
        jVar.f97445d = a.a.j(HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE, str);
        jVar.f97443b = AccountManager.get(context);
        jVar.f97442a = j13;
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        Bundle bundle = new Bundle();
        jVar.f97444c = bundle;
        if (str2 != null) {
            bundle.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        Bundle bundle2 = this.mSpnegoContext;
        if (bundle2 != null) {
            jVar.f97444c.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle2);
        }
        jVar.f97444c.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, z13);
        Map map = ApplicationStatus.f97279a;
        requestTokenWithoutActivity(context, jVar, strArr);
    }

    public boolean lacksPermission(Context context, String str, boolean z13) {
        return (z13 || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) ? false : true;
    }
}
