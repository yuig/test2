package bm2;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f23547i = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i it = (i) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.K(it);
    }
}
