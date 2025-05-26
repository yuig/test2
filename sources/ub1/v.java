package ub1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f121745i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z13) {
        super(1);
        this.f121745i = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z it = (z) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return z.b(it, null, this.f121745i, 1);
    }
}
