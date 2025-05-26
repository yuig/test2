package am2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15557i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f15558j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(com.google.firebase.messaging.q qVar, int i13) {
        super(1);
        this.f15557i = i13;
        this.f15558j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar;
        int i13 = this.f15557i;
        com.google.firebase.messaging.q qVar = this.f15558j;
        switch (i13) {
            case 0:
                f0 f0Var = (f0) obj;
                Intrinsics.checkNotNullParameter(f0Var, "<name for destructuring parameter 0>");
                ym2.b bVar = f0Var.f15551a;
                if (bVar.f139465c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                ym2.b f13 = bVar.f();
                List list = f0Var.f15552b;
                if (f13 == null || (iVar = qVar.m(f13, CollectionsKt.N(list, 1))) == null) {
                    on2.r rVar = (on2.r) qVar.f33805c;
                    ym2.c g13 = bVar.g();
                    Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
                    iVar = (i) rVar.invoke(g13);
                }
                i iVar2 = iVar;
                boolean z13 = !bVar.f139464b.e().d();
                on2.u uVar = (on2.u) qVar.f33803a;
                ym2.g i14 = bVar.i();
                Intrinsics.checkNotNullExpressionValue(i14, "getShortClassName(...)");
                Integer num = (Integer) CollectionsKt.firstOrNull(list);
                return new g0(uVar, iVar2, i14, z13, num != null ? num.intValue() : 0);
            default:
                ym2.c fqName = (ym2.c) obj;
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return new dm2.q((d0) qVar.f33804b, fqName);
        }
    }
}
