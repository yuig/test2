package p10;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.xk;
import dl1.s;
import dl1.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final i f98628a = new i();

    private i() {
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        xk model = (xk) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        ew.i(model);
    }

    @Override // p10.n
    public final void c(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37364h;
        synchronized (lruCache2) {
            lruCache2.remove(a13);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 != null) {
            return (xk) ew.f37364h.get(a13);
        }
        LruCache lruCache = ew.f37357a;
        return null;
    }
}
