package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f33453a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f33454b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f33455c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f33456d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f33457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i13, String str, long j13, long j14, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f33457e = bnVar;
        this.f33453a = str;
        this.f33454b = j13;
        this.f33455c = j14;
        this.f33456d = taskCompletionSource2;
    }

    @Override // nk.x
    public final void b() {
        nk.w wVar;
        if (bn.k(this.f33457e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f33457e;
            nk.m mVar = (nk.m) bnVar.f33472a.f91075n;
            Bundle a13 = bn.a(bnVar, this.f33453a, this.f33454b, this.f33455c, 0);
            bk bkVar = new bk(this.f33457e, this.f33456d, this.f33454b);
            nk.k kVar = (nk.k) mVar;
            kVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(kVar.f15215b);
            int i13 = nk.i.f91080a;
            obtain.writeInt(1);
            a13.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(bkVar);
            kVar.B(obtain, 3);
        } catch (RemoteException e13) {
            bn bnVar2 = this.f33457e;
            String str = this.f33453a;
            wVar = bnVar2.f33473b;
            wVar.b("requestExpressIntegrityToken(%s, %s)", e13, str, Long.valueOf(this.f33454b));
            this.f33456d.trySetException(new StandardIntegrityException(-100, e13));
        }
    }
}
