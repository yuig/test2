package android.support.v4.os;

import a.d;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import d.a;
import d.b;
import d.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new d(15);

    /* renamed from: a, reason: collision with root package name */
    public b f15869a;

    public ResultReceiver(Parcel parcel) {
        b bVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i13 = c.f53477b;
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.Pn);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                a aVar = new a();
                aVar.f53476a = readStrongBinder;
                bVar = aVar;
            } else {
                bVar = (b) queryLocalInterface;
            }
        }
        this.f15869a = bVar;
    }

    public void a(int i13, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        synchronized (this) {
            try {
                if (this.f15869a == null) {
                    this.f15869a = new c(this);
                }
                parcel.writeStrongBinder(this.f15869a.asBinder());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
