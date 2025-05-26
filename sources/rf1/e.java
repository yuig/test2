package rf1;

import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache f107743a = new LruCache(20);

    public static void a(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        f107743a.remove(uid);
    }
}
