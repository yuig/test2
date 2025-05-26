package yn2;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final t f139589i = new t(1);

    public t() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> invoke(@NotNull Iterable<Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }
}
