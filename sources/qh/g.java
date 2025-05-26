package qh;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final g f103884a = new g();

    @Override // com.google.android.gms.common.api.internal.o
    public final void accept(Object obj, Object obj2) {
        f fVar = new f((TaskCompletionSource) obj2);
        a aVar = (a) ((c) ((e) obj).getService());
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        int i13 = ei.a.f58954a;
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f103880a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
