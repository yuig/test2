package kotlin.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext[] f80407i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f80408j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CoroutineContext[] coroutineContextArr, h0 h0Var) {
        super(2);
        this.f80407i = coroutineContextArr;
        this.f80408j = h0Var;
    }

    public final void b(@NotNull Unit unit, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(element, "element");
        h0 h0Var = this.f80408j;
        int i13 = h0Var.f80426a;
        h0Var.f80426a = i13 + 1;
        this.f80407i[i13] = element;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        b((Unit) obj, (CoroutineContext.Element) obj2);
        return Unit.f80348a;
    }
}
