package pn2;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f100840a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f100841b = new AtomicInteger(0);

    public static u0 a(List attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return attributes.isEmpty() ? u0.f100849c : new u0(attributes);
    }

    public final int b(String key) {
        int intValue;
        Intrinsics.checkNotNullParameter(key, "keyQualifiedName");
        ConcurrentHashMap concurrentHashMap = this.f100840a;
        e82.l compute = new e82.l(this, 28);
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(compute, "compute");
        Integer num = (Integer) concurrentHashMap.get(key);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(key);
                if (num2 == null) {
                    Object invoke = compute.invoke(key);
                    concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) invoke).intValue()));
                    num2 = (Integer) invoke;
                }
                Intrinsics.f(num2);
                intValue = num2.intValue();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return intValue;
    }
}
