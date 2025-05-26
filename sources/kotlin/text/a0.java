package kotlin.text;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ char[] f80469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f80470j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(char[] cArr, boolean z13) {
        super(2);
        this.f80469i = cArr;
        this.f80470j = z13;
    }

    public final Pair<Integer, Integer> b(@NotNull CharSequence $receiver, int i13) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        int r13 = StringsKt__StringsKt.r(i13, $receiver, this.f80470j, this.f80469i);
        if (r13 < 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(r13), 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((CharSequence) obj, ((Number) obj2).intValue());
    }
}
