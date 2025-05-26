package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f33458a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f33459b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f33460c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f33461d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f33462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i13) {
        super(bnVar, taskCompletionSource);
        this.f33462e = bnVar;
        this.f33458a = bundle;
        this.f33459b = activity;
        this.f33460c = taskCompletionSource2;
        this.f33461d = i13;
    }

    @Override // nk.x
    public final void b() {
        nk.w wVar;
        at atVar;
        if (bn.k(this.f33462e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f33462e;
            nk.c cVar = bnVar.f33472a;
            nk.m mVar = (nk.m) cVar.f91075n;
            Bundle bundle = this.f33458a;
            atVar = bnVar.f33476e;
            as a13 = atVar.a(this.f33459b, this.f33460c, cVar);
            nk.k kVar = (nk.k) mVar;
            kVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(kVar.f15215b);
            int i13 = nk.i.f91080a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a13);
            kVar.B(obtain, 6);
        } catch (RemoteException e13) {
            bn bnVar2 = this.f33462e;
            int i14 = this.f33461d;
            wVar = bnVar2.f33473b;
            wVar.b("requestAndShowDialog(%s)", e13, Integer.valueOf(i14));
            this.f33460c.trySetException(new StandardIntegrityException(-100, e13));
        }
    }
}
