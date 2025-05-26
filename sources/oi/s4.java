package oi;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public final class s4 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f95149a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95150b;

    /* renamed from: c, reason: collision with root package name */
    public final String f95151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o4 f95152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(o4 o4Var, Runnable runnable, boolean z13, String str) {
        super(runnable, null);
        this.f95152d = o4Var;
        long andIncrement = o4.f94985k.getAndIncrement();
        this.f95149a = andIncrement;
        this.f95151c = str;
        this.f95150b = z13;
        if (andIncrement == Long.MAX_VALUE) {
            o4Var.zzj().f95268f.c("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s4 s4Var = (s4) obj;
        boolean z13 = s4Var.f95150b;
        boolean z14 = this.f95150b;
        if (z14 != z13) {
            return z14 ? -1 : 1;
        }
        long j13 = this.f95149a;
        long j14 = s4Var.f95149a;
        if (j13 < j14) {
            return -1;
        }
        if (j13 > j14) {
            return 1;
        }
        this.f95152d.zzj().f95269g.b(Long.valueOf(j13), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th3) {
        y3 zzj = this.f95152d.zzj();
        zzj.f95268f.b(th3, this.f95151c);
        super.setException(th3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(o4 o4Var, Callable callable, boolean z13) {
        super(callable);
        this.f95152d = o4Var;
        long andIncrement = o4.f94985k.getAndIncrement();
        this.f95149a = andIncrement;
        this.f95151c = "Task exception on worker thread";
        this.f95150b = z13;
        if (andIncrement == Long.MAX_VALUE) {
            o4Var.zzj().f95268f.c("Tasks index overflow");
        }
    }
}
