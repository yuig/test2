package sq0;

import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f114998a = new LruCache(30);

    public final boolean a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Boolean bool = (Boolean) this.f114998a.get(url);
        return bool != null && bool.booleanValue();
    }

    public final void b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f114998a.put(url, Boolean.TRUE);
    }
}
