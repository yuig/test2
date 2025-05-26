package ai;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class k extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15230a;

    public k(String str, int i13) {
        this.f15230a = i13;
        if (i13 == 1) {
            attachInterface(this, str);
            return;
        }
        if (i13 == 2) {
            attachInterface(this, str);
        } else if (i13 != 3) {
            attachInterface(this, str);
        } else {
            attachInterface(this, str);
        }
    }

    public abstract boolean B(int i13, Parcel parcel, Parcel parcel2);

    public boolean C(int i13, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract boolean j(int i13, Parcel parcel);

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        switch (this.f15230a) {
            case 0:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                }
                break;
            case 1:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                }
                break;
            case 2:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                }
                break;
            default:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                }
                break;
        }
        return j(i13, parcel);
    }
}
