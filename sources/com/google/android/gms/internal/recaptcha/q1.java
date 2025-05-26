package com.google.android.gms.internal.recaptcha;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class q1 implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f31779a;

    public q1(IBinder iBinder) {
        this.f31779a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31779a;
    }

    public final void j(Parcel parcel, int i13) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f31779a.transact(i13, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
