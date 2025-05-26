package am2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f1 f15553i = new f1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m it = (m) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        List typeParameters = ((b) it).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return CollectionsKt.K(typeParameters);
    }
}
