package fd1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d1 f61904j = new d1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d1 f61905k = new d1(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61906i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i13) {
        super(1);
        this.f61906i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f61906i) {
            case 0:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
