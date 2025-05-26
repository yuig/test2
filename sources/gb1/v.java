package gb1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f64733j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f64734k = new v(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64735i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(1);
        this.f64735i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f64735i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f64735i) {
        }
        return b((yl1.b) obj);
    }
}
