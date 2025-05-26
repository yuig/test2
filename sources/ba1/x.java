package ba1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final x f22407j = new x(0);

    /* renamed from: k, reason: collision with root package name */
    public static final x f22408k = new x(1);

    /* renamed from: l, reason: collision with root package name */
    public static final x f22409l = new x(2);

    /* renamed from: m, reason: collision with root package name */
    public static final x f22410m = new x(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22411i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i13) {
        super(1);
        this.f22411i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22411i) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(rm1.q.WORKFLOW_STATUS_WARNING);
                break;
            case 1:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(f22407j);
                bind.a(rm1.c.DARK);
                break;
            case 2:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
