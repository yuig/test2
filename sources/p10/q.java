package p10;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.wy0;
import dl1.s;
import dl1.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f98632a;

    public q(@NotNull b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f98632a = activeUserManager;
    }

    @Override // p10.n
    public final void b(u params, s sVar) {
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        ((b60.d) this.f98632a).k(model);
        ew.n(model);
    }

    @Override // p10.n
    public final void c(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        if (a13 == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37358b;
        synchronized (lruCache2) {
            lruCache2.remove(a13);
        }
    }

    @Override // p10.n
    public final s d(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return ew.e(params.a());
    }
}
