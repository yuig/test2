package c2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24517i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24518j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Function2 function2, int i13) {
        super(2);
        this.f24517i = i13;
        this.f24518j = function2;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f24517i;
        Object obj = this.f24518j;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                i2.u0 u0Var = b1.f24558a;
                i2.s sVar2 = (i2.s) oVar;
                long j13 = ((b3.w) sVar2.m(c1.f24577a)).f21392a;
                com.bumptech.glide.d.a(u0Var.c(Float.valueOf((!((s0) sVar2.m(u0.f25271a)).f() ? ((double) androidx.compose.ui.graphics.a.q(j13)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j13)) > 0.5d) ? 0.87f : 1.0f)), (Function2) obj, oVar, 8);
                return;
            case 1:
                if ((i13 & 3) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                d6.a(b4.q0.a(3, 16744447, 0L, 0L, 0L, 0L, null, ((e6) ((i2.s) oVar).m(f6.f24738b)).f24713l, null, null, null), (Function2) obj, oVar, 0);
                return;
            case 2:
                if ((i13 & 3) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        return;
                    }
                }
                j1.f((Function2) obj, oVar, 0);
                return;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return;
                    }
                }
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24517i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
