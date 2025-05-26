package zp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.u;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142601i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f142602j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f142601i = i13;
        this.f142602j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142601i;
        f fVar = this.f142602j;
        switch (i13) {
            case 0:
                ao1.i bind = (ao1.i) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(fVar.f142609c);
                bind.f20099p = Integer.valueOf(fVar.f142610d);
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    xp0.d a13 = fVar.a();
                    a13.v3();
                    a13.clearDisposables();
                    fVar.a().D3(wp0.e.UserSearchDismissed);
                    fVar.f142619m.dispose();
                    a.c.y(u.f85943a);
                }
                break;
            default:
                String str = (String) obj;
                xp0.d a14 = fVar.a();
                Intrinsics.f(str);
                a14.G3(str);
                break;
        }
        return Unit.f80348a;
    }
}
