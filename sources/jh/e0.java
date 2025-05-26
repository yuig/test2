package jh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.zzk;

/* loaded from: classes.dex */
public final class e0 extends ai.k {

    /* renamed from: b, reason: collision with root package name */
    public f f76140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76141c;

    public e0(f fVar, int i13) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f76140b = fVar;
        this.f76141c = i13;
    }

    @Override // ai.k
    public final boolean C(int i13, Parcel parcel, Parcel parcel2) {
        int i14 = this.f76141c;
        if (i13 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) di.a.a(parcel, Bundle.CREATOR);
            di.a.b(parcel);
            com.bumptech.glide.d.u(this.f76140b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f76140b.onPostInitHandler(readInt, readStrongBinder, bundle, i14);
            this.f76140b = null;
        } else if (i13 == 2) {
            parcel.readInt();
            di.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i13 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) di.a.a(parcel, zzk.CREATOR);
            di.a.b(parcel);
            f fVar = this.f76140b;
            com.bumptech.glide.d.u(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            com.bumptech.glide.d.t(zzkVar);
            f.zzj(fVar, zzkVar);
            Bundle bundle2 = zzkVar.f30988f;
            com.bumptech.glide.d.u(this.f76140b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f76140b.onPostInitHandler(readInt2, readStrongBinder2, bundle2, i14);
            this.f76140b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
