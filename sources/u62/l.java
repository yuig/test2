package u62;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f120845i = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.bumptech.glide.l load = (com.bumptech.glide.l) obj;
        Intrinsics.checkNotNullParameter(load, "$this$load");
        de.a b13 = load.b();
        Intrinsics.checkNotNullExpressionValue(b13, "centerInside(...)");
        return (com.bumptech.glide.l) b13;
    }
}
