package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class i extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final i f80411i = new i(2);

    public i() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CoroutineContext invoke(@NotNull CoroutineContext acc, @NotNull CoroutineContext.Element element) {
        e eVar;
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        CoroutineContext minusKey = acc.minusKey(element.getKey());
        j jVar = j.f80412a;
        if (minusKey == jVar) {
            return element;
        }
        bl2.d dVar = f.Ho;
        f fVar = (f) minusKey.get(dVar);
        if (fVar == null) {
            eVar = new e(minusKey, element);
        } else {
            CoroutineContext minusKey2 = minusKey.minusKey(dVar);
            if (minusKey2 == jVar) {
                return new e(element, fVar);
            }
            eVar = new e(new e(minusKey2, element), fVar);
        }
        return eVar;
    }
}
