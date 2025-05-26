package i1;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70908i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v3 f70909j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v3 v3Var, int i13) {
        super(1);
        this.f70908i = i13;
        this.f70909j = v3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70908i;
        v3 v3Var = this.f70909j;
        switch (i13) {
            case 0:
                ((b3.u0) ((b3.d0) obj)).f(((Number) v3Var.getValue()).floatValue());
                return Unit.f80348a;
            case 1:
                return (Float) ((Function1) v3Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
            default:
                ((Function1) v3Var.getValue()).invoke(new a3.c(((a3.c) obj).f482a));
                return Unit.f80348a;
        }
    }
}
