package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final s f139588i = new s(1);

    public s() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> invoke(@NotNull Sequence<Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }
}
