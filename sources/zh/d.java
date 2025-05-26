package zh;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class d extends Binder implements e, IInterface {
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
        switch (i13) {
            case 1:
                h.b(parcel);
                throw new UnsupportedOperationException();
            case 2:
                h.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                h.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                zze();
                return true;
            case 5:
                Status status = (Status) h.a(parcel, Status.CREATOR);
                h.b(parcel);
                m(status);
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                h.b(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                h.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
