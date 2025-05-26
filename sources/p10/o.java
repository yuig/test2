package p10;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kw;
import com.pinterest.api.model.nw;
import dl1.s;
import dl1.u;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f98631a = new o();

    private o() {
    }

    @Override // p10.n
    public final boolean a() {
        return true;
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        f30 model = (f30) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        ew.l(model);
    }

    @Override // p10.n
    public final void c(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String id3 = params.a();
        if (id3 == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        nw nwVar = (nw) ew.f();
        nwVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        ConcurrentHashMap concurrentHashMap = nwVar.f40520e;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) concurrentHashMap.get(id3);
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((kw) it.next()).clear();
            }
            concurrentLinkedQueue.clear();
        }
        concurrentHashMap.remove(id3);
        LruCache lruCache2 = ew.f37357a;
        synchronized (lruCache2) {
            lruCache2.remove(id3);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return ew.c(params.a());
    }
}
