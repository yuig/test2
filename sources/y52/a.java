package y52;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f137775j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f137776k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f137777l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f137778m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f137779i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f137779i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f137779i) {
            case 0:
                ((Throwable) obj).printStackTrace();
                break;
            case 1:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter((gm1.c) obj, "<anonymous parameter 0>");
                break;
            default:
                Intrinsics.checkNotNullParameter((ym1.u) obj, "<anonymous parameter 0>");
                break;
        }
        return Unit.f80348a;
    }
}
