package fa0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f61524j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f61525k = new q(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q f61526l = new q(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(1);
        this.f61527i = i13;
    }

    public final l b(l it) {
        c cVar = c.f61476a;
        switch (this.f61527i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return l.e(it, false, null, cVar, null, null, 55);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f61527i) {
            case 0:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(om1.e.LG);
                bind.d(om1.f.WASH_WHITE);
                bind.a(rm1.q.ARROW_BACK);
                break;
        }
        return b((l) obj);
    }
}
