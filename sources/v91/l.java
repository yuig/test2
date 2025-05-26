package v91;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f124990j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f124991k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f124992l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f124993m = new l(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124994i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f124994i = i13;
    }

    public final a b(a it) {
        switch (this.f124994i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, true, null, new k0(b52.c.feature_enabled), true, 2);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, false, null, null, false, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f124994i) {
            case 0:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.GONE, null, false, 0, 1015);
            case 1:
                return b((a) obj);
            case 2:
                u it2 = (u) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return u.b(it2, true);
            default:
                return b((a) obj);
        }
    }
}
