package pb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final j f99420i = new j(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb.e it = (qb.e) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
        return simpleName;
    }
}
