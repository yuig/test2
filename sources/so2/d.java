package so2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f114773a;

    static {
        Object m13;
        try {
            xk2.q qVar = xk2.s.f135225b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            m13 = StringsKt.toIntOrNull(property);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof xk2.r) {
            m13 = null;
        }
        Integer num = (Integer) m13;
        f114773a = num != null ? num.intValue() : 2097152;
    }
}
