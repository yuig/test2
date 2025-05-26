package com.google.android.gms.internal.recaptcha;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {
    public a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract boolean j(int i13, Parcel parcel);

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i13, parcel, parcel2, i14)) {
            return true;
        }
        return j(i13, parcel);
    }
}
