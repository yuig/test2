package qm0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.ba;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104311i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f104312j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(p0 p0Var, int i13) {
        super(1);
        this.f104311i = i13;
        this.f104312j = p0Var;
    }

    public final void b(int i13) {
        int i14 = this.f104311i;
        p0 p0Var = this.f104312j;
        switch (i14) {
            case 7:
                p pVar = new p(new sk0.g(i13));
                int i15 = p0.f104322d1;
                p0Var.n9(pVar);
                break;
            default:
                p pVar2 = new p(new sk0.h(i13));
                int i16 = p0.f104322d1;
                p0Var.n9(pVar2);
                break;
        }
    }

    public final void e(String id3) {
        int i13 = this.f104311i;
        p0 p0Var = this.f104312j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(id3, "id");
                a0 a0Var = new a0(id3);
                int i14 = p0.f104322d1;
                p0Var.n9(a0Var);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(id3, "id");
                d0 d0Var = new d0(id3);
                int i15 = p0.f104322d1;
                p0Var.n9(d0Var);
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                a0 a0Var2 = new a0(id3);
                int i16 = p0.f104322d1;
                p0Var.n9(a0Var2);
                break;
        }
    }

    public final void f(List it) {
        int i13 = this.f104311i;
        p0 p0Var = this.f104312j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                f fVar = new f(it);
                int i14 = p0.f104322d1;
                p0Var.n9(fVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                e eVar = new e(it);
                int i15 = p0.f104322d1;
                p0Var.n9(eVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f104311i;
        p0 p0Var = this.f104312j;
        switch (i13) {
            case 0:
                sl1.e it = (sl1.e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                d dVar = new d(it);
                int i14 = p0.f104322d1;
                p0Var.n9(dVar);
                return Unit.f80348a;
            case 1:
                f((List) obj);
                return Unit.f80348a;
            case 2:
                f((List) obj);
                return Unit.f80348a;
            case 3:
                j2 vmState = (j2) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                ni1.d0 d0Var = p0Var.N0;
                if (d0Var != null) {
                    return ((ba) d0Var).a(vmState.f104289b, new o0(p0Var, 0), new mj.m(4)).a(vmState.f104290c, vmState.f104288a);
                }
                Intrinsics.r("pinToVMStateConverterFactory");
                throw null;
            case 4:
                e((String) obj);
                return Unit.f80348a;
            case 5:
                e((String) obj);
                return Unit.f80348a;
            case 6:
                e((String) obj);
                return Unit.f80348a;
            case 7:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            default:
                b(((Number) obj).intValue());
                return Unit.f80348a;
        }
    }
}
