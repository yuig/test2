package hh;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f69118a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f69119b = new TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final int f69120c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f69121d;

    public i(int i13, int i14, Bundle bundle) {
        this.f69118a = i13;
        this.f69120c = i14;
        this.f69121d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            Log.d("MessengerIpcClient", a.a.q(new StringBuilder(valueOf.length() + 14 + valueOf2.length()), "Failing ", valueOf, " with ", valueOf2));
        }
        this.f69119b.setException(zzqVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle);
            Log.d("MessengerIpcClient", a.a.q(new StringBuilder(valueOf.length() + 16 + valueOf2.length()), "Finishing ", valueOf, " with ", valueOf2));
        }
        this.f69119b.setResult(bundle);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append("Request { what=");
        sb3.append(this.f69120c);
        sb3.append(" id=");
        sb3.append(this.f69118a);
        sb3.append(" oneWay=");
        sb3.append(b());
        sb3.append("}");
        return sb3.toString();
    }
}
