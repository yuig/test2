package im2;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f72736i = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.d it = (am2.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        int i13 = h.f72741m;
        return Boolean.valueOf(CollectionsKt.L(r0.f72771g, com.bumptech.glide.c.t(it)));
    }
}
