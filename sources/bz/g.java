package bz;

import android.os.SystemClock;
import h32.i0;
import java.util.ArrayList;
import java.util.Iterator;
import nx.z0;
import pk.a0;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f24179j;

    /* renamed from: k, reason: collision with root package name */
    public final qq2.c f24180k;

    public g(i0 i0Var, String str, qq2.c cVar) {
        super(i0Var, str);
        this.f24179j = new ArrayList();
        this.f24180k = cVar;
        if (cVar != null) {
            String str2 = (String) cVar.f104884c;
            if (!a0.s0(str2)) {
                this.f24167b = str2;
            }
        }
        f();
    }

    @Override // bz.b
    public final void a(z0 z0Var) {
        z0Var.put("time_spent_foreground_pairid", this.f24165i);
        qq2.c cVar = this.f24180k;
        if (cVar != null) {
            z0 z0Var2 = (z0) cVar.f104883b;
            if (z0Var2.isEmpty()) {
                return;
            }
            z0Var.putAll(z0Var2);
        }
    }

    public final void i() {
        ArrayList arrayList = this.f24179j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            fVar.getClass();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            fVar.f24171f = elapsedRealtimeNanos;
            fVar.f24169d = (elapsedRealtimeNanos - fVar.f24170e) + fVar.f24168c;
            fVar.g();
        }
        arrayList.clear();
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        this.f24171f = elapsedRealtimeNanos2;
        this.f24169d = (elapsedRealtimeNanos2 - this.f24170e) + this.f24168c;
        g();
    }
}
