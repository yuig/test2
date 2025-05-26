package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f33450a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f33451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f33452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i13, long j13, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f33452c = bnVar;
        this.f33450a = j13;
        this.f33451b = taskCompletionSource2;
    }

    @Override // nk.x
    public final void b() {
        nk.w wVar;
        if (bn.k(this.f33452c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f33452c;
            nk.m mVar = (nk.m) bnVar.f33472a.f91075n;
            Bundle b13 = bn.b(bnVar, this.f33450a, 0);
            bl blVar = new bl(this.f33452c, this.f33451b);
            nk.k kVar = (nk.k) mVar;
            kVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(kVar.f15215b);
            int i13 = nk.i.f91080a;
            obtain.writeInt(1);
            b13.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            kVar.B(obtain, 2);
        } catch (RemoteException e13) {
            bn bnVar2 = this.f33452c;
            long j13 = this.f33450a;
            wVar = bnVar2.f33473b;
            wVar.b("warmUpIntegrityToken(%s)", e13, Long.valueOf(j13));
            this.f33451b.trySetException(new StandardIntegrityException(-100, e13));
        }
    }
}
