package i1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70774i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f70775j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i13, Function1 function1) {
        super(1);
        this.f70774i = i13;
        this.f70775j = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        switch (this.f70774i) {
            case 0:
                return new n4.h(d7.b.a(0, ((Number) this.f70775j.invoke(Integer.valueOf((int) (((n4.j) obj).f89186a & 4294967295L)))).intValue()));
            case 1:
                return this.f70775j.invoke(Long.valueOf(((Number) obj).longValue()));
            case 2:
                s2.n nVar = (s2.n) obj;
                synchronized (s2.p.f110667b) {
                    i13 = s2.p.f110669d;
                    s2.p.f110669d = i13 + 1;
                }
                return new s2.g(i13, nVar, this.f70775j);
            default:
                s2.i iVar = (s2.i) this.f70775j.invoke((s2.n) obj);
                synchronized (s2.p.f110667b) {
                    s2.p.f110668c = s2.p.f110668c.p(iVar.d());
                    Unit unit = Unit.f80348a;
                }
                return iVar;
        }
    }
}
