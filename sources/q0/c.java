package q0;

import androidx.camera.core.impl.j;
import androidx.lifecycle.n0;
import androidx.lifecycle.q;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements y {

    /* renamed from: a, reason: collision with root package name */
    public final j f101751a;

    /* renamed from: b, reason: collision with root package name */
    public final z f101752b;

    public c(z zVar, j jVar) {
        this.f101752b = zVar;
        this.f101751a = jVar;
    }

    @n0(q.ON_DESTROY)
    public void onDestroy(z zVar) {
        j jVar = this.f101751a;
        synchronized (jVar.f16875b) {
            try {
                c h10 = jVar.h(zVar);
                if (h10 == null) {
                    return;
                }
                jVar.o(zVar);
                Iterator it = ((Set) ((Map) jVar.f16877d).get(h10)).iterator();
                while (it.hasNext()) {
                    ((Map) jVar.f16876c).remove((a) it.next());
                }
                ((Map) jVar.f16877d).remove(h10);
                h10.f101752b.getLifecycle().b(h10);
            } finally {
            }
        }
    }

    @n0(q.ON_START)
    public void onStart(z zVar) {
        this.f101751a.n(zVar);
    }

    @n0(q.ON_STOP)
    public void onStop(z zVar) {
        this.f101751a.o(zVar);
    }
}
