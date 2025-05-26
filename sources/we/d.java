package we;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f129237a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public IBinder f129238b;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f129237a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
        this.f129238b = serviceBinder;
        this.f129237a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
