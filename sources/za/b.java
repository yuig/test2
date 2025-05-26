package za;

import android.os.Handler;
import androidx.appcompat.app.z;
import androidx.lifecycle.q;
import androidx.lifecycle.x;

/* loaded from: classes3.dex */
public final class b implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f141451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f141452b;

    public b(Handler handler, z zVar) {
        this.f141451a = handler;
        this.f141452b = zVar;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z zVar, q qVar) {
        if (qVar == q.ON_DESTROY) {
            this.f141451a.removeCallbacks(this.f141452b);
            zVar.getLifecycle().b(this);
        }
    }
}
