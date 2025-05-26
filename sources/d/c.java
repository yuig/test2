package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class c extends Binder implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f53477b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f53478a;

    public c(ResultReceiver resultReceiver) {
        this.f53478a = resultReceiver;
        attachInterface(this, b.Pn);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        String str = b.Pn;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i13 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i13 != 1) {
            return super.onTransact(i13, parcel, parcel2, i14);
        }
        int readInt = parcel.readInt();
        Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
        ResultReceiver resultReceiver = this.f53478a;
        resultReceiver.getClass();
        resultReceiver.a(readInt, (Bundle) createFromParcel);
        return true;
    }
}
