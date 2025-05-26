package p10;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.v7;
import dl1.s;
import dl1.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f98624a = new a();

    private a() {
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        v7 model = (v7) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        ew.g(model);
    }

    @Override // p10.n
    public final void c(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37359c;
        synchronized (lruCache2) {
            lruCache2.remove(a13);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return ew.a(params.a());
    }
}
