package ux0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.k;
import rm1.l;
import rm1.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f123234j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f123235k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f123236i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123236i) {
            case 0:
                l standard = (l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(q.SPARKLE);
                break;
            default:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(f123234j);
                bind.a(rm1.c.WARNING);
                break;
        }
        return Unit.f80348a;
    }
}
