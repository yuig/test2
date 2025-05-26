package yy0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final x f140483j = new x(0);

    /* renamed from: k, reason: collision with root package name */
    public static final x f140484k = new x(1);

    /* renamed from: l, reason: collision with root package name */
    public static final x f140485l = new x(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140486i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i13) {
        super(1);
        this.f140486i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long g13;
        long g14;
        int i13 = this.f140486i;
        switch (i13) {
            case 0:
                r1.s item = (r1.s) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        g13 = kh2.w.g(3);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        g13 = kh2.w.g(3);
                        break;
                }
                return new r1.d(g13);
            case 1:
                r1.s item2 = (r1.s) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(item2, "$this$item");
                        g14 = kh2.w.g(3);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(item2, "$this$item");
                        g14 = kh2.w.g(3);
                        break;
                }
                return new r1.d(g14);
            default:
                return null;
        }
    }
}
