package im2;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final g f72739i = new g(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        am2.d it = (am2.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof am2.x) {
            int i13 = h.f72741m;
            if (CollectionsKt.L(r0.f72771g, com.bumptech.glide.c.t(it))) {
                z13 = true;
                return Boolean.valueOf(z13);
            }
        }
        z13 = false;
        return Boolean.valueOf(z13);
    }
}
