package nc2;

import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f90406b;

    /* renamed from: a, reason: collision with root package name */
    public static final h f90405a = new h();

    /* renamed from: c, reason: collision with root package name */
    public static final LruCache f90407c = new LruCache(100);

    public static l a(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        l lVar = (l) f90407c.get(uid);
        if (lVar == null) {
            return new l(false, 0L, 15);
        }
        return new l(lVar.f90410b, lVar.f90409a, lVar.f90411c, lVar.f90412d);
    }
}
