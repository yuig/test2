package p10;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.mv;
import dl1.s;
import dl1.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f98627a = new g();

    private g() {
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        mv model = (mv) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        ew.k(model);
    }

    @Override // p10.n
    public final void c(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37368l;
        synchronized (lruCache2) {
            lruCache2.remove(a13);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 != null) {
            return (mv) ew.f37368l.get(a13);
        }
        LruCache lruCache = ew.f37357a;
        return null;
    }
}
