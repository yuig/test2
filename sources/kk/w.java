package kk;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class w extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79907b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f79908c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(jk.l lVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f79910e = lVar;
        this.f79909d = list;
        this.f79908c = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [android.os.IInterface, kk.k] */
    @Override // kk.u
    public final void c() {
        switch (this.f79907b) {
            case 0:
                synchronized (((c) this.f79910e).f79870f) {
                    try {
                        final c cVar = (c) this.f79910e;
                        final TaskCompletionSource taskCompletionSource = this.f79908c;
                        cVar.f79869e.add(taskCompletionSource);
                        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: kk.v
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                c cVar2 = c.this;
                                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                synchronized (cVar2.f79870f) {
                                    cVar2.f79869e.remove(taskCompletionSource2);
                                }
                            }
                        });
                        if (((c) this.f79910e).f79875k.getAndIncrement() > 0) {
                            ((c) this.f79910e).f79866b.g("Already connected to the service.", new Object[0]);
                        }
                        c.b((c) this.f79910e, (u) this.f79909d);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            default:
                TaskCompletionSource taskCompletionSource2 = this.f79908c;
                Object obj = this.f79909d;
                Object obj2 = this.f79910e;
                try {
                    ?? r43 = ((jk.l) obj2).f76349b.f79877m;
                    String str = ((jk.l) obj2).f76348a;
                    ArrayList b13 = jk.l.b((List) obj);
                    Bundle bundle = new Bundle();
                    bundle.putInt("playcore_version_code", 11004);
                    r43.k(str, b13, bundle, new jk.j((jk.l) obj2, taskCompletionSource2, 0));
                    return;
                } catch (RemoteException e13) {
                    jk.l.f76346c.d("deferredUninstall(%s)", e13, (List) obj);
                    taskCompletionSource2.trySetException(new RuntimeException(e13));
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, u uVar) {
        super(taskCompletionSource);
        this.f79910e = cVar;
        this.f79908c = taskCompletionSource2;
        this.f79909d = uVar;
    }
}
