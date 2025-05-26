package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c0 extends Service implements z {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.d f18599a = new androidx.appcompat.app.d(this);

    @Override // androidx.lifecycle.z
    public final s getLifecycle() {
        return (b0) this.f18599a.f15966b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        androidx.appcompat.app.d dVar = this.f18599a;
        dVar.getClass();
        dVar.J(q.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        androidx.appcompat.app.d dVar = this.f18599a;
        dVar.getClass();
        dVar.J(q.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        androidx.appcompat.app.d dVar = this.f18599a;
        dVar.getClass();
        dVar.J(q.ON_STOP);
        dVar.J(q.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i13) {
        androidx.appcompat.app.d dVar = this.f18599a;
        dVar.getClass();
        dVar.J(q.ON_START);
        super.onStart(intent, i13);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i13, int i14) {
        return super.onStartCommand(intent, i13, i14);
    }
}
