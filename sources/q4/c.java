package q4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f102310j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f102311k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f102312l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f102313m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f102314n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f102315o = new c(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102316i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f102316i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f102316i;
        switch (i13) {
            case 0:
                z3.y yVar = (z3.y) obj;
                switch (i13) {
                    case 0:
                        rl2.u[] uVarArr = z3.w.f140760a;
                        ((z3.j) yVar).e(z3.t.f140750s, Unit.f80348a);
                        break;
                    default:
                        rl2.u[] uVarArr2 = z3.w.f140760a;
                        ((z3.j) yVar).e(z3.t.f140749r, Unit.f80348a);
                        break;
                }
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                z3.y yVar2 = (z3.y) obj;
                switch (i13) {
                    case 0:
                        rl2.u[] uVarArr3 = z3.w.f140760a;
                        ((z3.j) yVar2).e(z3.t.f140750s, Unit.f80348a);
                        break;
                    default:
                        rl2.u[] uVarArr4 = z3.w.f140760a;
                        ((z3.j) yVar2).e(z3.t.f140749r, Unit.f80348a);
                        break;
                }
                break;
            case 4:
                break;
            default:
                w wVar = (w) obj;
                if (wVar.isAttachedToWindow()) {
                    wVar.s();
                }
                break;
        }
        return Unit.f80348a;
    }
}
