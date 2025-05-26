package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import kh2.b0;

/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.f {

    /* renamed from: l, reason: collision with root package name */
    public static final x92.b f15222l = new x92.b("Auth.Api.Identity.SignIn.API", new qh.i(2), new com.google.android.gms.common.api.d());

    /* renamed from: k, reason: collision with root package name */
    public final String f15223k;

    public g(Activity activity, dh.c cVar) {
        super(activity, activity, f15222l, cVar, com.google.android.gms.common.api.e.f30758c);
        this.f15223k = j.a();
    }

    public final SignInCredential e(Intent intent) {
        Status status = Status.f30748l;
        if (intent == null) {
            throw new ApiException(status);
        }
        Status status2 = (Status) b0.a0(intent, "status", Status.CREATOR);
        if (status2 == null) {
            throw new ApiException(Status.f30750n);
        }
        if (status2.f30751f > 0) {
            throw new ApiException(status2);
        }
        SignInCredential signInCredential = (SignInCredential) b0.a0(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(status);
    }

    public g(Context context, dh.c cVar) {
        super(context, null, f15222l, cVar, com.google.android.gms.common.api.e.f30758c);
        this.f15223k = j.a();
    }
}
