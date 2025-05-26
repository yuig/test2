package p1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f98537i = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.round((1 + (((n4.k) obj2) != n4.k.Ltr ? (-1.0f) * (-1) : -1.0f)) * (((Number) obj).intValue() / 2.0f)));
    }
}
