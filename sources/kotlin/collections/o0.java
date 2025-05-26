package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Iterable f80389i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Iterable iterable) {
        super(0);
        this.f80389i = iterable;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> invoke() {
        return this.f80389i.iterator();
    }
}
