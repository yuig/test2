package yh;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import lb.l0;

/* loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i13, parcel, parcel2, i14)) {
            return true;
        }
        if (i13 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i15 = a.f139038a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        zzc createFromParcel2 = parcel.readInt() == 0 ? null : zzc.CREATOR.createFromParcel(parcel);
        l0.l1(createFromParcel, createFromParcel2 != null ? new ah.b(createFromParcel2.f30547f, createFromParcel2.f30548g) : null, ((g) this).f139043a);
        return true;
    }
}
