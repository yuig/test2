package hb0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import kotlin.Unit;
import nx.q0;
import nx.s0;

/* loaded from: classes.dex */
public final class e extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68516a;

    /* renamed from: b, reason: collision with root package name */
    public final g f68517b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar) {
        this(gVar, 0);
        this.f68516a = 0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f68516a) {
            case 0:
                this.f68517b.b();
                return;
            default:
                g gVar = this.f68517b;
                gVar.getClass();
                ArrayList arrayList = new ArrayList(gVar.f68519a.values());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    s0 s0Var = ((q0) it.next()).f92451a;
                    synchronized (s0Var.f92458c) {
                        s0Var.f();
                        s0Var.i();
                        Unit unit = Unit.f80348a;
                    }
                }
                arrayList.clear();
                return;
        }
    }

    public /* synthetic */ e(g gVar, int i13) {
        this.f68516a = i13;
        this.f68517b = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, Object obj) {
        this(gVar, 1);
        this.f68516a = 1;
    }
}
