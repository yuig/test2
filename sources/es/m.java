package es;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final m f59996i = new m(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer count = (Integer) obj2;
        Intrinsics.checkNotNullParameter((Float) obj, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(count, "count");
        return Integer.valueOf(count.intValue() + 1);
    }
}
