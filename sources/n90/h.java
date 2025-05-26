package n90;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f90002i = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        a item = (a) obj2;
        Intrinsics.checkNotNullParameter(item, "item");
        return Integer.valueOf(item.f89990c);
    }
}
