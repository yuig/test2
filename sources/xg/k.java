package xg;

import android.os.RemoteException;
import com.google.android.engage.service.AppEngageException;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class k extends fi.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f134925b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f134926c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f134927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f134928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fi.i iVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k kVar) {
        super(taskCompletionSource);
        this.f134928e = iVar;
        this.f134926c = taskCompletionSource2;
        this.f134927d = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.IInterface, wg.c] */
    @Override // fi.c
    public final void a() {
        switch (this.f134925b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f134926c;
                try {
                    ?? r13 = ((e) this.f134928e).f134917d.f62201m;
                    if (r13 != 0) {
                        ((d) this.f134927d).n(r13, taskCompletionSource);
                    } else {
                        taskCompletionSource.trySetException(new AppEngageException(2));
                    }
                    return;
                } catch (RemoteException unused) {
                    taskCompletionSource.trySetException(new AppEngageException(3));
                    return;
                }
            default:
                synchronized (((fi.i) this.f134928e).f62194f) {
                    try {
                        fi.i iVar = (fi.i) this.f134928e;
                        TaskCompletionSource taskCompletionSource2 = this.f134926c;
                        iVar.f62193e.add(taskCompletionSource2);
                        taskCompletionSource2.getTask().addOnCompleteListener(new t(iVar, taskCompletionSource2, 1));
                        if (((fi.i) this.f134928e).f62199k.getAndIncrement() > 0) {
                            ((fi.i) this.f134928e).f62190b.c("Already connected to the service.", new Object[0]);
                        }
                        fi.i.b((fi.i) this.f134928e, (fi.c) this.f134927d);
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, TaskCompletionSource taskCompletionSource, d dVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f134928e = eVar;
        this.f134927d = dVar;
        this.f134926c = taskCompletionSource2;
    }
}
