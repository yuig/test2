package l7;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f81847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f81848b;

    public /* synthetic */ q(w wVar, long j13) {
        this.f81847a = wVar;
        this.f81848b = j13;
    }

    @Override // l7.y0
    public final void run() {
        w wVar = this.f81847a;
        c0 c0Var = wVar.f81902j;
        c0Var.f81747h.g();
        bf.b.t(!c0Var.f81753n);
        ConcurrentLinkedQueue concurrentLinkedQueue = c0Var.f81750k;
        Pair pair = (Pair) concurrentLinkedQueue.remove();
        c0Var.i(wVar.f81894b, (a7.t) pair.first, ((Long) pair.second).longValue(), this.f81848b);
        if (concurrentLinkedQueue.isEmpty() && c0Var.f81757r) {
            r rVar = c0Var.f81760u;
            rVar.getClass();
            rVar.f81849a.c();
            c0Var.f81757r = false;
        }
    }
}
