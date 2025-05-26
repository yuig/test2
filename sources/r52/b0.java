package r52;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f106264j = new b0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b0 f106265k = new b0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106266i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i13) {
        super(1);
        this.f106266i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f106266i;
        switch (i13) {
            case 0:
                g it = (g) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return g.e(it, null, null, false, 3);
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return g.e(it, null, null, true, 3);
                }
            default:
                g it2 = (g) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return g.e(it2, null, null, false, 3);
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return g.e(it2, null, null, true, 3);
                }
        }
    }
}
