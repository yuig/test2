package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import s.j;

/* loaded from: classes.dex */
public abstract class a extends Binder implements b {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        String str = b.f20704zn;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i13 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        byte b13 = 0;
        switch (i13) {
            case 2:
                ((j) this).F(parcel.readInt(), (Bundle) d7.b.c(parcel, Bundle.CREATOR));
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) d7.b.c(parcel, Bundle.CREATOR);
                j jVar = (j) this;
                if (jVar.f110276b != null) {
                    jVar.f110275a.post(new s.e(jVar, readString, bundle, b13 == true ? 1 : 0));
                }
                return true;
            case 4:
                ((j) this).D((Bundle) d7.b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                ((j) this).G(parcel.readString(), (Bundle) d7.b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                ((j) this).H(parcel.readInt(), (Uri) d7.b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) d7.b.c(parcel, Bundle.CREATOR));
                return true;
            case 7:
                Bundle j13 = ((j) this).j(parcel.readString(), (Bundle) d7.b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (j13 != null) {
                    parcel2.writeInt(1);
                    j13.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 8:
                ((j) this).C(parcel.readInt(), parcel.readInt(), (Bundle) d7.b.c(parcel, Bundle.CREATOR));
                return true;
            case 9:
                ((j) this).J((Bundle) d7.b.c(parcel, Bundle.CREATOR));
                return true;
            case 10:
                ((j) this).B(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) d7.b.c(parcel, Bundle.CREATOR));
                return true;
            case 11:
                ((j) this).E((Bundle) d7.b.c(parcel, Bundle.CREATOR));
                return true;
            case 12:
                ((j) this).I((Bundle) d7.b.c(parcel, Bundle.CREATOR));
                return true;
            default:
                return super.onTransact(i13, parcel, parcel2, i14);
        }
    }
}
