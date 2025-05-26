package ga;

import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ CreateCredentialRequest.Builder g(String str, Bundle bundle, Bundle bundle2) {
        return new CreateCredentialRequest.Builder(str, bundle, bundle2);
    }

    public static /* bridge */ /* synthetic */ CredentialManager i(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ CredentialOption.Builder l(String str, Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder(str, bundle, bundle2);
    }

    public static /* synthetic */ GetCredentialRequest.Builder m(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void y() {
    }
}
