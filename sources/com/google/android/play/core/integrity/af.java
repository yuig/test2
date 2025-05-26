package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class af extends nk.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f33395a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f33396b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f33397c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f33398d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f33399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l13, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f33399e = ajVar;
        this.f33395a = bArr;
        this.f33396b = l13;
        this.f33397c = taskCompletionSource2;
        this.f33398d = integrityTokenRequest;
    }

    @Override // nk.x
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // nk.x
    public final void b() {
        nk.w wVar;
        try {
            aj ajVar = this.f33399e;
            nk.r rVar = (nk.r) ajVar.f33409a.f91075n;
            Bundle a13 = aj.a(ajVar, this.f33395a, this.f33396b, null);
            ai aiVar = new ai(this.f33399e, this.f33397c);
            nk.p pVar = (nk.p) rVar;
            pVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(pVar.f15215b);
            int i13 = nk.i.f91080a;
            obtain.writeInt(1);
            a13.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            pVar.B(obtain, 2);
        } catch (RemoteException e13) {
            aj ajVar2 = this.f33399e;
            IntegrityTokenRequest integrityTokenRequest = this.f33398d;
            wVar = ajVar2.f33410b;
            wVar.b("requestIntegrityToken(%s)", e13, integrityTokenRequest);
            this.f33397c.trySetException(new IntegrityServiceException(-100, e13));
        }
    }
}
