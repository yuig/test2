package ga1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f64628j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f64629k = new l(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64630i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f64630i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f64630i) {
            case 0:
                em1.d it = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, em1.b.CHECKED, null, null, null, null, null, 0, null, false, 0, 1022);
            default:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return om1.c.e(it2, null, null, null, fm1.c.GONE, null, false, 0, 1015);
        }
    }
}
