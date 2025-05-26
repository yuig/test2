package kk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i implements k, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f79882a;

    public i(IBinder iBinder) {
        this.f79882a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f79882a;
    }

    @Override // kk.k
    public final void c(String str, ArrayList arrayList, Bundle bundle, jk.j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        obtain.writeString(str);
        obtain.writeTypedList(arrayList);
        int i13 = r.f79895a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f79882a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // kk.k
    public final void k(String str, ArrayList arrayList, Bundle bundle, jk.j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        obtain.writeString(str);
        obtain.writeTypedList(arrayList);
        int i13 = r.f79895a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f79882a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
