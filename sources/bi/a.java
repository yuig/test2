package bi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class a extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22819a;

    public a(String str, int i13) {
        this.f22819a = i13;
        if (i13 != 1) {
            attachInterface(this, str);
        } else {
            attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        }
    }

    public abstract boolean B(int i13, Parcel parcel, Parcel parcel2);

    public abstract boolean C(int i13, Parcel parcel);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        switch (this.f22819a) {
            case 0:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                    return true;
                }
                return B(i13, parcel, parcel2);
            default:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                    return true;
                }
                return C(i13, parcel);
        }
    }
}
