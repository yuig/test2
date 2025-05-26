package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final s f80506i = new s(1);

    public s() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String invoke(@NotNull String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }
}
