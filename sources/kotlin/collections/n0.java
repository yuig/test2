package kotlin.collections;

import a.cb;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80388i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i13) {
        super(1);
        this.f80388i = i13;
    }

    public final Object b(int i13) {
        throw new IndexOutOfBoundsException(cb.l(new StringBuilder("Collection doesn't contain element at index "), this.f80388i, '.'));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
