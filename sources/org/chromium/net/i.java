package org.chromium.net;

import J.N;
import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import org.chromium.base.ThreadUtils;

/* loaded from: classes4.dex */
public final class i implements AccountManagerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97340a;

    /* renamed from: b, reason: collision with root package name */
    public final j f97341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HttpNegotiateAuthenticator f97342c;

    public /* synthetic */ i(HttpNegotiateAuthenticator httpNegotiateAuthenticator, j jVar, int i13) {
        this.f97340a = i13;
        this.f97342c = httpNegotiateAuthenticator;
        this.f97341b = jVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        int i13 = this.f97340a;
        HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.f97342c;
        j jVar = this.f97341b;
        switch (i13) {
            case 0:
                try {
                    Account[] accountArr = (Account[]) accountManagerFuture.getResult();
                    if (accountArr.length != 0) {
                        int i14 = 1;
                        if (accountArr.length <= 1) {
                            if (!httpNegotiateAuthenticator.lacksPermission(so.a.f113317a, "android.permission.USE_CREDENTIALS", true)) {
                                Account account = accountArr[0];
                                jVar.f97446e = account;
                                jVar.f97443b.getAuthToken(account, jVar.f97445d, jVar.f97444c, true, (AccountManagerCallback<Bundle>) new i(httpNegotiateAuthenticator, jVar, i14), new Handler(ThreadUtils.a().getLooper()));
                                break;
                            } else {
                                Log.e("cr_net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                                N.M0s8NeYn(jVar.f97442a, httpNegotiateAuthenticator, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
                                break;
                            }
                        } else {
                            dp2.e.g("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                            N.M0s8NeYn(jVar.f97442a, httpNegotiateAuthenticator, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                            break;
                        }
                    } else {
                        Log.w("cr_net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                        N.M0s8NeYn(jVar.f97442a, httpNegotiateAuthenticator, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                        break;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e13) {
                    Log.w("cr_net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e13);
                    N.M0s8NeYn(jVar.f97442a, httpNegotiateAuthenticator, -9, null);
                }
            default:
                try {
                    Bundle bundle = (Bundle) accountManagerFuture.getResult();
                    if (!bundle.containsKey("intent")) {
                        httpNegotiateAuthenticator.processResult(bundle, jVar);
                        break;
                    } else {
                        Context context = so.a.f113317a;
                        so.a.h(context, new oo.b(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                        break;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e14) {
                    Log.w("cr_net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e14);
                    N.M0s8NeYn(jVar.f97442a, httpNegotiateAuthenticator, -9, null);
                    return;
                }
        }
    }
}
