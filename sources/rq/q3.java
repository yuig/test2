package rq;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109493i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r3 f109494j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(r3 r3Var, int i13) {
        super(1);
        this.f109493i = i13;
        this.f109494j = r3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109493i;
        r3 r3Var = this.f109494j;
        switch (i13) {
            case 0:
                wy0 wy0Var = (wy0) obj;
                Intrinsics.f(wy0Var);
                r3Var.m(wy0Var);
                break;
            default:
                r60.c cVar = (r60.c) obj;
                if (cVar instanceof r60.b) {
                    r3Var.m(((r60.b) cVar).f106308a);
                } else if (cVar instanceof r60.a) {
                    r3Var.m(((r60.a) cVar).f106307a);
                }
                break;
        }
        return Unit.f80348a;
    }
}
