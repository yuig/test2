package tc0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f117312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str) {
        super(1);
        this.f117312i = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yl1.b state = (yl1.b) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        return yl1.b.f(state, bs1.c.h2(this.f117312i), true, null, null, null, null, null, null, 0, null, 1020);
    }
}
