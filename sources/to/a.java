package to;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pinterest.account.AuthenticatorActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends AbstractAccountAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    public final Context f118628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f118628a = context;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse response, String accountType, String str, String[] strArr, Bundle bundle) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Bundle bundle2 = new Bundle();
        Intent intent = new Intent(this.f118628a, (Class<?>) AuthenticatorActivity.class);
        intent.putExtra("accountType", accountType);
        intent.putExtra("accountAuthenticatorResponse", response);
        Unit unit = Unit.f80348a;
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(authTokenType, "authTokenType");
        Intrinsics.checkNotNullParameter(options, "options");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final String getAuthTokenLabel(String authTokenType) {
        Intrinsics.checkNotNullParameter(authTokenType, "authTokenType");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse response, Account account, String[] features) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(features, "features");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(authTokenType, "authTokenType");
        Intrinsics.checkNotNullParameter(options, "options");
        return null;
    }
}
