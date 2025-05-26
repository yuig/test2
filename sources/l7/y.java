package l7;

import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f81915b;

    public /* synthetic */ y(a0 a0Var, int i13) {
        this.f81914a = i13;
        this.f81915b = a0Var;
    }

    @Override // l7.y0
    public final void run() {
        int i13 = 8;
        switch (this.f81914a) {
            case 0:
                this.f81915b.f81729u = false;
                break;
            case 1:
                a0 a0Var = this.f81915b;
                if (a0Var.f81726r) {
                    a0Var.f81729u = true;
                }
                if (!a0Var.f81718j.isEmpty() || a0Var.f81724p != null) {
                    a0Var.f81723o = true;
                    ScheduledFuture scheduledFuture = a0Var.f81727s;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    a0Var.f81727s = null;
                    a0Var.f81727s = a0Var.f81719k.schedule(new u0.n(a0Var, i13), a0.f81711y, TimeUnit.MILLISECONDS);
                    break;
                } else {
                    i0 i0Var = a0Var.f81713e;
                    i0Var.getClass();
                    ((a) i0Var).c();
                    g.a();
                    ScheduledFuture scheduledFuture2 = a0Var.f81727s;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    a0Var.f81727s = null;
                    break;
                }
                break;
            case 2:
                a0 a0Var2 = this.f81915b;
                a0Var2.getClass();
                try {
                    a0Var2.m();
                    break;
                } catch (RuntimeException e13) {
                    a0Var2.f81730v = e13;
                    d7.u.d("ExtTexMgr", "Failed to remove texture frames", e13);
                    if (a0Var2.f81728t != null) {
                        a0Var2.f81728t.countDown();
                        return;
                    }
                    return;
                }
            case 3:
                a0 a0Var3 = this.f81915b;
                a0Var3.getClass();
                g.a();
                if (a0Var3.f81726r) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = a0Var3.f81718j;
                    a7.s sVar = a0Var3.f81725q;
                    sVar.getClass();
                    concurrentLinkedQueue.add(sVar);
                }
                if (!a0Var3.f81729u) {
                    if (a0Var3.f81723o) {
                        ScheduledFuture scheduledFuture3 = a0Var3.f81727s;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(false);
                        }
                        a0Var3.f81727s = null;
                        a0Var3.f81727s = a0Var3.f81719k.schedule(new u0.n(a0Var3, i13), a0.f81711y, TimeUnit.MILLISECONDS);
                    }
                    a0Var3.f81722n++;
                    a0Var3.l();
                    break;
                } else {
                    a0Var3.f81716h.updateTexImage();
                    a0Var3.f81718j.poll();
                    if (a0Var3.f81728t != null && a0Var3.f81718j.isEmpty()) {
                        a0Var3.f81728t.countDown();
                        break;
                    }
                }
                break;
            case 4:
                a0 a0Var4 = this.f81915b;
                a0Var4.f81721m++;
                a0Var4.l();
                break;
            case 5:
                a0 a0Var5 = this.f81915b;
                a0Var5.f81724p = null;
                if (!a0Var5.f81723o || !a0Var5.f81718j.isEmpty()) {
                    a0Var5.l();
                    break;
                } else {
                    a0Var5.f81723o = false;
                    i0 i0Var2 = a0Var5.f81713e;
                    i0Var2.getClass();
                    ((a) i0Var2).c();
                    g.a();
                    ScheduledFuture scheduledFuture4 = a0Var5.f81727s;
                    if (scheduledFuture4 != null) {
                        scheduledFuture4.cancel(false);
                    }
                    a0Var5.f81727s = null;
                    break;
                }
                break;
            default:
                a0 a0Var6 = this.f81915b;
                if (a0Var6.f81722n != a0Var6.f81718j.size()) {
                    int size = a0Var6.f81718j.size();
                    long j13 = a0.f81711y;
                    int i14 = a0Var6.f81722n;
                    int i15 = d7.n0.f53866a;
                    Locale locale = Locale.US;
                    d7.u.g("ExtTexMgr", "Forcing EOS after missing " + size + " frames for " + j13 + " ms, with available frame count: " + i14);
                    a0Var6.f81723o = false;
                    a0Var6.f81724p = null;
                    a0Var6.f81729u = true;
                    a0Var6.m();
                    a0Var6.f81718j.clear();
                    a0Var6.j();
                    break;
                }
                break;
        }
    }
}
