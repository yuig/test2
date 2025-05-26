package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class ag extends nk.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f33400a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f33401b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f33402c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f33403d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f33404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i13) {
        super(taskCompletionSource);
        this.f33404e = ajVar;
        this.f33400a = bundle;
        this.f33401b = activity;
        this.f33402c = taskCompletionSource2;
        this.f33403d = i13;
    }

    @Override // nk.x
    public final void b() {
        nk.w wVar;
        at atVar;
        try {
            aj ajVar = this.f33404e;
            nk.r rVar = (nk.r) ajVar.f33409a.f91075n;
            Bundle bundle = this.f33400a;
            atVar = ajVar.f33412d;
            as a13 = atVar.a(this.f33401b, this.f33402c, ajVar.f33409a);
            nk.p pVar = (nk.p) rVar;
            pVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(pVar.f15215b);
            int i13 = nk.i.f91080a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a13);
            pVar.B(obtain, 3);
        } catch (RemoteException e13) {
            aj ajVar2 = this.f33404e;
            int i14 = this.f33403d;
            wVar = ajVar2.f33410b;
            wVar.b("requestAndShowDialog(%s)", e13, Integer.valueOf(i14));
            this.f33402c.trySetException(new IntegrityServiceException(-100, e13));
        }
    }
}
