package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class n0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f30853b;

    public n0(int i13, TaskCompletionSource taskCompletionSource) {
        super(i13);
        this.f30853b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a(Status status) {
        this.f30853b.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void b(RuntimeException runtimeException) {
        this.f30853b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void c(z zVar) {
        try {
            h(zVar);
        } catch (DeadObjectException e13) {
            a(r0.e(e13));
            throw e13;
        } catch (RemoteException e14) {
            a(r0.e(e14));
        } catch (RuntimeException e15) {
            this.f30853b.trySetException(e15);
        }
    }

    public abstract void h(z zVar);
}
