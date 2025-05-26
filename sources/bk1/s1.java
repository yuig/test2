package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23323i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z1 f23324j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f23325k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a2 f23326l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(z1 z1Var, f30 f30Var, a2 a2Var) {
        super(1);
        this.f23323i = 1;
        this.f23324j = z1Var;
        this.f23325k = f30Var;
        this.f23326l = a2Var;
    }

    public final o b(o it) {
        z1 z1Var = this.f23324j;
        int i13 = this.f23323i;
        a2 a2Var = this.f23326l;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var = this.f23325k;
                d dVar = new d(f30Var, z1Var.i(f30Var, a2Var, null), a2Var.f23173s, a2Var.f23179y ? a2Var.A : null, a2Var.W, a2Var.X);
                zn2.a aVar = zn2.b.f142311b;
                f fVar = new f(dVar, dl2.b.Q2(300L, zn2.d.MILLISECONDS));
                it.getClass();
                return o.e(fVar);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var2 = this.f23325k;
                c cVar = new c(this.f23325k, true, f30Var2.getUid(), z1Var.i(f30Var2, a2Var, null), a2Var.f23173s, a2Var.f23179y ? a2Var.A : null, a2Var.W, a2Var.X);
                zn2.a aVar2 = zn2.b.f142311b;
                l lVar = new l(cVar, dl2.b.Q2(300L, zn2.d.MILLISECONDS));
                it.getClass();
                return o.e(lVar);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var3 = this.f23325k;
                d dVar2 = new d(f30Var3, z1Var.i(f30Var3, a2Var, null), a2Var.f23173s, a2Var.f23179y ? a2Var.A : null, a2Var.W, a2Var.X);
                zn2.a aVar3 = zn2.b.f142311b;
                e eVar = new e(dVar2, dl2.b.Q2(1000L, zn2.d.MILLISECONDS));
                it.getClass();
                return o.e(eVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23323i) {
        }
        return b((o) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(f30 f30Var, z1 z1Var, a2 a2Var, int i13) {
        super(1);
        this.f23323i = i13;
        this.f23325k = f30Var;
        this.f23324j = z1Var;
        this.f23326l = a2Var;
    }
}
