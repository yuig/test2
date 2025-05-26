package jh;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class o0 extends ai.k implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76187b = 0;

    @Override // ai.k
    public final boolean C(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 == 1) {
            rh.a zzd = ((ih.m) this).zzd();
            parcel2.writeNoException();
            di.a.c(parcel2, zzd);
        } else {
            if (i13 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((ih.m) this).f72277c);
        }
        return true;
    }
}
