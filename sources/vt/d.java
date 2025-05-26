package vt;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f126573i = new d(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int[] viewHeightList = (int[]) obj;
        Integer position = (Integer) obj2;
        Intrinsics.checkNotNullParameter(viewHeightList, "viewHeightList");
        Intrinsics.checkNotNullParameter(position, "position");
        return new Pair(viewHeightList, position);
    }
}
