package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g1 f77868j = new g1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g1 f77869k = new g1(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77870i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i13) {
        super(1);
        this.f77870i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77870i) {
            case 0:
                return Unit.f80348a;
            default:
                return new t2(((Number) obj).intValue());
        }
    }
}
