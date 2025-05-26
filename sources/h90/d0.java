package h90;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f68243i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(l82.c0 c0Var) {
        super(1);
        this.f68243i = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0 it = (f0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return f0.b(it, (zy.l0) this.f68243i.f82213b, null, 895);
    }
}
