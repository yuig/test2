package j1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74218i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74219j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f74220k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(int i13, Object obj, Object obj2) {
        super(1);
        this.f74218i = i13;
        this.f74219j = obj;
        this.f74220k = obj2;
    }

    public final i2.s0 b() {
        int i13 = 1;
        int i14 = this.f74218i;
        Object obj = this.f74220k;
        Object obj2 = this.f74219j;
        switch (i14) {
            case 1:
                kotlin.jvm.internal.j.z((ao2.j0) obj2, null, ao2.l0.UNDISPATCHED, new d2((g2) obj, null), 1);
                return new e2();
            case 2:
                g2 g2Var = (g2) obj2;
                g2 g2Var2 = (g2) obj;
                g2Var.f74084j.add(g2Var2);
                return new j2(0, g2Var, g2Var2);
            default:
                return new j2(i13, (g2) obj2, (y1) obj);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74218i) {
            case 0:
                m mVar = (m) obj;
                ((Function2) this.f74219j).invoke(mVar.f74148e.getValue(), ((p2) this.f74220k).f74198b.invoke(mVar.f74149f));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return b();
    }
}
