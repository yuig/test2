package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138232i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f138233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, int i13) {
        super(1);
        this.f138232i = i13;
        this.f138233j = obj;
    }

    public final d b(d it) {
        int i13 = this.f138232i;
        Object obj = this.f138233j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, ((k) ((l) obj)).f138197a, null, 11);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, ((i) ((l) obj)).f138189a, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138232i) {
            case 0:
                return b((d) obj);
            case 1:
                return b((d) obj);
            default:
                l82.n start = (l82.n) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                y0 y0Var = (y0) this.f138233j;
                zy.d0 d0Var = y0Var.f138272c;
                start.a(d0Var, new s90.p0(17), d0Var.a());
                w60.d dVar = y0Var.f138273d;
                start.a(dVar, new s90.p0(18), dVar.a());
                ba0.e eVar = y0Var.f138274e;
                start.a(eVar, new s90.p0(16), eVar.a());
                sa0.y yVar = y0Var.f138275f;
                start.a(yVar, new s90.p0(15), yVar.a());
                k92.l lVar = y0Var.f138276g;
                start.a(lVar, new s90.p0(19), lVar.a());
                o22.g gVar = y0Var.f138277h;
                start.a(gVar, new s90.p0(20), gVar.a());
                return Unit.f80348a;
        }
    }
}
