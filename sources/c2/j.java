package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f24847j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f24848k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f24849l = new j(2);

    /* renamed from: m, reason: collision with root package name */
    public static final j f24850m = new j(3);

    /* renamed from: n, reason: collision with root package name */
    public static final j f24851n = new j(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24852i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f24852i = i13;
    }

    public final void b(z3.y yVar) {
        switch (this.f24852i) {
            case 1:
                z3.w.h(yVar, 0);
                break;
            case 2:
                break;
            default:
                rl2.u[] uVarArr = z3.w.f140760a;
                z3.x xVar = z3.t.f140744m;
                rl2.u uVar = z3.w.f140760a[5];
                xVar.a(yVar, Boolean.TRUE);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24852i) {
            case 0:
                return Boolean.TRUE;
            case 1:
                b((z3.y) obj);
                return Unit.f80348a;
            case 2:
                b((z3.y) obj);
                return Unit.f80348a;
            case 3:
                b((z3.y) obj);
                return Unit.f80348a;
            default:
                return Float.valueOf(((Number) obj).floatValue() * 0.7f);
        }
    }
}
