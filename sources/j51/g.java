package j51;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74744i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f74745j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f74744i = i13;
        this.f74745j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74744i;
        h hVar = this.f74745j;
        switch (i13) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f(hVar.f74747b);
                return Unit.f80348a;
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, hVar.f74750e ? fm1.c.VISIBLE : fm1.c.INVISIBLE, null, false, 0, 1015);
        }
    }
}
