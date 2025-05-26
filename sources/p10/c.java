package p10;

import android.util.LruCache;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.ew;
import dl1.s;
import dl1.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final c f98625a = new c();

    private c() {
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        ba model = (ba) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        if (model == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37360d;
        synchronized (lruCache2) {
            lruCache2.put(model.getId(), model);
        }
    }

    @Override // p10.n
    public final void c(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37360d;
        synchronized (lruCache2) {
            lruCache2.remove(a13);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 != null) {
            return (ba) ew.f37360d.get(a13);
        }
        LruCache lruCache = ew.f37357a;
        return null;
    }
}
