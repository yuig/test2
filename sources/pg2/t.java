package pg2;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f100149a;

    static {
        s[] values = s.values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (s sVar : values) {
            u uVar = new u();
            uVar.f100150a = new AtomicInteger(0);
            linkedHashMap.put(sVar, uVar);
        }
        f100149a = linkedHashMap;
    }

    public static final u a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Object obj = f100149a.get(sVar);
        if (obj != null) {
            return (u) obj;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
