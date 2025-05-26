package lv0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import sq0.v;

/* loaded from: classes5.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f85024i = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer itemHeight = (Integer) obj2;
        Intrinsics.checkNotNullParameter((v) obj, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(itemHeight, "itemHeight");
        return itemHeight;
    }
}
