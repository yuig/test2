package ii;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class c implements a, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f72297a;

    public c(IBinder iBinder) {
        this.f72297a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f72297a;
    }
}
