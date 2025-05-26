package h3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66625i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f66626j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i13) {
        super(1);
        this.f66625i = i13;
        this.f66626j = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f66625i;
        e0 e0Var = this.f66626j;
        switch (i13) {
            case 0:
                e0Var.f66640d = true;
                e0Var.f66642f.invoke();
                return Unit.f80348a;
            default:
                d3.h hVar = (d3.h) obj;
                c cVar = e0Var.f66638b;
                float f13 = e0Var.f66647k;
                float f14 = e0Var.f66648l;
                d3.b p03 = hVar.p0();
                long e13 = p03.e();
                p03.a().j();
                try {
                    p03.f53648a.c(0L, f13, f14);
                    cVar.a(hVar);
                    ep.b.z(p03, e13);
                    return Unit.f80348a;
                } catch (Throwable th3) {
                    ep.b.z(p03, e13);
                    throw th3;
                }
        }
    }
}
