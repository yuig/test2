package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24683i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(int i13) {
        super(1);
        this.f24683i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24683i) {
            case 0:
                z3.y yVar = (z3.y) obj;
                rl2.u[] uVarArr = z3.w.f140760a;
                z3.x xVar = z3.t.f140742k;
                rl2.u uVar = z3.w.f140760a[3];
                xVar.a(yVar, new z3.e());
                z3.j jVar = (z3.j) yVar;
                jVar.e(z3.i.f140693t, new z3.a(null, new d4(0)));
                return Unit.f80348a;
            default:
                ((o2) obj).getClass();
                return Boolean.valueOf(Intrinsics.d(null, null));
        }
    }
}
