package n3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public a0 f89047a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a0 a0Var = this.f89047a;
        if (a0Var != null) {
            a0Var.f89031d = booleanValue;
        }
        return Unit.f80348a;
    }
}
