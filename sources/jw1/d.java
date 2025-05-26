package jw1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f77667j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f77668k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77669i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f77669i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77669i) {
            case 0:
                Intrinsics.checkNotNullParameter((ww1.c) obj, "it");
                return Unit.f80348a;
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.INFO_CIRCLE, null, null, fm1.c.VISIBLE, null, false, 0, 1014);
        }
    }
}
