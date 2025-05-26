package ra0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q3.b1;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final r f106983j = new r(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f106984k = new r(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13) {
        super(1);
        this.f106985i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f106985i) {
            case 0:
                return null;
            default:
                b1 layout = (b1) obj;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.f80348a;
        }
    }
}
