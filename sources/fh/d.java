package fh;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public final class d extends y6.b {

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f62138j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f62139k;

    public d(SignInHubActivity signInHubActivity, Set set) {
        this.f137899c = false;
        this.f137900d = false;
        this.f137901e = true;
        this.f137902f = false;
        signInHubActivity.getApplicationContext();
        this.f62138j = new Semaphore(0);
        this.f62139k = set;
    }
}
