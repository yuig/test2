package ul2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final g0 f122519i = new g0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer b13 = am2.s.b((am2.q) obj, (am2.q) obj2);
        return Integer.valueOf(b13 == null ? 0 : b13.intValue());
    }
}
