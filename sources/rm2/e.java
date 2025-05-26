package rm2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f108729i = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j loadConstantFromProperty = (j) obj;
        j0 it = (j0) obj2;
        Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.checkNotNullParameter(it, "it");
        return loadConstantFromProperty.f108739c.get(it);
    }
}
