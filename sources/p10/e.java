package p10;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.ue;
import dl1.s;
import dl1.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final e f98626a = new e();

    private e() {
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        ue model = (ue) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        LruCache lruCache = ew.f37357a;
        if (model == null || model.getId() == null) {
            return;
        }
        LruCache lruCache2 = ew.f37369m;
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
        LruCache lruCache2 = ew.f37369m;
        synchronized (lruCache2) {
            lruCache2.remove(a13);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return ew.b(params.a());
    }
}
