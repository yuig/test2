package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final r f30861b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f30862c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.login.z f30863d;

    public q0(int i13, r rVar, TaskCompletionSource taskCompletionSource, com.facebook.login.z zVar) {
        super(i13);
        this.f30862c = taskCompletionSource;
        this.f30861b = rVar;
        this.f30863d = zVar;
        if (i13 == 2 && rVar.f30865b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a(Status status) {
        this.f30863d.getClass();
        this.f30862c.trySetException(tb.f.L(status));
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void b(RuntimeException runtimeException) {
        this.f30862c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void c(z zVar) {
        TaskCompletionSource taskCompletionSource = this.f30862c;
        try {
            this.f30861b.b(zVar.f30902b, taskCompletionSource);
        } catch (DeadObjectException e13) {
            throw e13;
        } catch (RemoteException e14) {
            a(r0.e(e14));
        } catch (RuntimeException e15) {
            taskCompletionSource.trySetException(e15);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void d(tb.l lVar, boolean z13) {
        Boolean valueOf = Boolean.valueOf(z13);
        Map map = (Map) lVar.f116987c;
        TaskCompletionSource taskCompletionSource = this.f30862c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new t(lVar, taskCompletionSource, 0));
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final boolean f(z zVar) {
        return this.f30861b.f30865b;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final Feature[] g(z zVar) {
        return this.f30861b.f30864a;
    }
}
