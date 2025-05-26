package ai;

import android.app.Activity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final class c extends com.google.android.gms.common.api.f {

    /* renamed from: l, reason: collision with root package name */
    public static final x92.b f15217l = new x92.b("Auth.Api.Identity.CredentialSaving.API", new ch.c(6), new com.google.android.gms.common.api.d());

    /* renamed from: k, reason: collision with root package name */
    public final String f15218k;

    public c(Activity activity, dh.a aVar) {
        super(activity, activity, f15217l, aVar, com.google.android.gms.common.api.e.f30758c);
        this.f15218k = j.a();
    }

    public final Task e(SavePasswordRequest savePasswordRequest) {
        bn0.a aVar = new bn0.a(11);
        SignInPassword signInPassword = savePasswordRequest.f30651f;
        aVar.f23560c = signInPassword;
        int i13 = savePasswordRequest.f30653h;
        aVar.f23559b = i13;
        String str = savePasswordRequest.f30652g;
        if (str != null) {
            aVar.f23561d = str;
        }
        String str2 = this.f15218k;
        aVar.f23561d = str2;
        SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(signInPassword, str2, i13);
        com.google.android.gms.common.api.internal.q a13 = r.a();
        a13.f30860d = new Feature[]{i.f15226b};
        a13.f30859c = new q4(28, this, savePasswordRequest2);
        a13.f30858b = false;
        a13.f30857a = 1536;
        return d(0, a13.a());
    }
}
