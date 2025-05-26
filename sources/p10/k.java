package p10;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.zs;
import dl1.s;
import dl1.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final k f98629a = new k();

    private k() {
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        zs model = (zs) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        ew.j(model);
    }

    @Override // p10.n
    public final void c(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37361e;
        synchronized (lruCache2) {
            lruCache2.remove(a13);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 != null) {
            return (zs) ew.f37361e.get(a13);
        }
        LruCache lruCache = ew.f37357a;
        return null;
    }
}
