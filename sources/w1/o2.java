package w1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final o2 f127423i = new o2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p2 p2Var = (p2) obj2;
        Object[] objArr = new Object[2];
        objArr[0] = Float.valueOf(p2Var.f127443a.h());
        objArr[1] = Boolean.valueOf(((m1.f1) p2Var.f127447e.getValue()) == m1.f1.Vertical);
        return kotlin.collections.f0.j(objArr);
    }
}
