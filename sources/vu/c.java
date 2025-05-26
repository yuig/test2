package vu;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f126640j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f126641k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f126642l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126643i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f126643i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f126643i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(q.CHECK_CIRCLE);
                break;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(f126641k);
                bind.a(rm1.c.INFO);
                break;
        }
        return Unit.f80348a;
    }
}
