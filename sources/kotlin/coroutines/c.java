package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f80406i = new c(2);

    public c() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String invoke(@NotNull String acc, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
