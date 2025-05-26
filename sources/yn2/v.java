package yn2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s3.n1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f139591i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n1 n1Var) {
        super(1);
        this.f139591i = n1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f139591i.invoke();
    }
}
