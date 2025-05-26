package z80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.f2;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f141054j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f141055k = new g(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141056i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f141056i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f141056i) {
            case 0:
                ((Number) obj).intValue();
                return Unit.f80348a;
            default:
                f2 it = (f2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
        }
    }
}
