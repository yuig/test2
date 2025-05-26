package kt0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f80840j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f80841k = new o(1);

    /* renamed from: l, reason: collision with root package name */
    public static final o f80842l = new o(2);

    /* renamed from: m, reason: collision with root package name */
    public static final o f80843m = new o(3);

    /* renamed from: n, reason: collision with root package name */
    public static final o f80844n = new o(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80845i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f80845i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f80845i) {
            case 0:
                lt0.b it = (lt0.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = it.f84770a;
                i0 text = it.f84771b;
                Intrinsics.checkNotNullParameter(text, "text");
                i0 contentDescription = it.f84772c;
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
