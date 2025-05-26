package x6;

import androidx.lifecycle.m0;
import bb.p;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* loaded from: classes3.dex */
public final class c implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f133921a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f133922b = false;

    public c(y6.b bVar, p pVar) {
        this.f133921a = pVar;
    }

    @Override // androidx.lifecycle.m0
    public final void a(Object obj) {
        this.f133922b = true;
        p pVar = this.f133921a;
        pVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) pVar.f22464b;
        signInHubActivity.setResult(signInHubActivity.f30726d, signInHubActivity.f30727e);
        ((SignInHubActivity) pVar.f22464b).finish();
    }

    public final String toString() {
        return this.f133921a.toString();
    }
}
