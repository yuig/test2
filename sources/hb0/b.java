package hb0;

import android.os.Process;
import androidx.appcompat.app.v;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final c f68511a;

    /* renamed from: b, reason: collision with root package name */
    public final a f68512b;

    public b(c cVar, a aVar) {
        this.f68511a = cVar;
        this.f68512b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f68511a;
        if (cVar != null) {
            Process.setThreadPriority(this.f68512b.getValue());
            cVar.c();
            Process.setThreadPriority(0);
            if (cVar instanceof d) {
                c.f68514c.post(new v((d) cVar));
            }
        }
    }
}
