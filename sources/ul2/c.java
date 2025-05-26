package ul2;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f122499a = a.a(b.f122491m);

    /* renamed from: b, reason: collision with root package name */
    public static final d f122500b = a.a(b.f122492n);

    static {
        a.a(b.f122488j);
        a.a(b.f122490l);
        a.a(b.f122489k);
    }

    public static final c0 a(Class key) {
        Intrinsics.checkNotNullParameter(key, "jClass");
        d dVar = f122499a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = dVar.f122507g;
        Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            Object invoke = dVar.f122506f.invoke(key);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
            obj = putIfAbsent == null ? invoke : putIfAbsent;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (c0) obj;
    }
}
