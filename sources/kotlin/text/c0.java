package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CharSequence f80483i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(CharSequence charSequence) {
        super(1);
        this.f80483i = charSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String invoke(@NotNull IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.x(this.f80483i, it);
    }
}
