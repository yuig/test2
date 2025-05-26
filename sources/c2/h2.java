package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class h2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24801i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24802j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, int i13) {
        super(1);
        this.f24801i = i13;
        this.f24802j = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f24801i;
        Object obj2 = this.f24802j;
        switch (i13) {
            case 0:
                return new i2((j2) obj, (Function1) obj2);
            default:
                d3.h hVar = (d3.h) obj;
                float f13 = z4.f25465a;
                long j13 = ((b3.w) ((i2.v3) obj2).getValue()).f21392a;
                float l03 = hVar.l0(z4.f25465a);
                float l04 = hVar.l0(z4.f25466b);
                float f14 = l04 / 2;
                long d2 = com.bumptech.glide.c.d(f14, a3.c.e(hVar.t0()));
                long d13 = com.bumptech.glide.c.d(l03 - f14, a3.c.e(hVar.t0()));
                d3.h.Qn.getClass();
                hVar.I(j13, d2, d13, l04, 1, null, 1.0f, null, d3.g.f53658b);
                return Unit.f80348a;
        }
    }
}
