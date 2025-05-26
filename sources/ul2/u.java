package ul2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122613i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f122614j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(y yVar, int i13) {
        super(0);
        this.f122613i = i13;
        this.f122614j = yVar;
    }

    public final List b() {
        int i13 = this.f122613i;
        y yVar = this.f122614j;
        switch (i13) {
            case 0:
                yVar.getClass();
                rl2.u[] uVarArr = y.f122632l;
                rl2.u uVar = uVarArr[13];
                Object invoke = yVar.f122640j.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
                rl2.u uVar2 = uVarArr[14];
                Object invoke2 = yVar.f122641k.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke2, "getValue(...)");
                return CollectionsKt.l0((Collection) invoke2, (Collection) invoke);
            case 1:
                yVar.getClass();
                rl2.u[] uVarArr2 = y.f122632l;
                rl2.u uVar3 = uVarArr2[9];
                Object invoke3 = yVar.f122636f.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke3, "getValue(...)");
                rl2.u uVar4 = uVarArr2[11];
                Object invoke4 = yVar.f122638h.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke4, "getValue(...)");
                return CollectionsKt.l0((Collection) invoke4, (Collection) invoke3);
            case 2:
                yVar.getClass();
                rl2.u[] uVarArr3 = y.f122632l;
                rl2.u uVar5 = uVarArr3[10];
                Object invoke5 = yVar.f122637g.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke5, "getValue(...)");
                rl2.u uVar6 = uVarArr3[12];
                Object invoke6 = yVar.f122639i.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke6, "getValue(...)");
                return CollectionsKt.l0((Collection) invoke6, (Collection) invoke5);
            case 3:
                return c2.d(yVar.a());
            case 4:
                yVar.getClass();
                rl2.u[] uVarArr4 = y.f122632l;
                rl2.u uVar7 = uVarArr4[9];
                Object invoke7 = yVar.f122636f.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke7, "getValue(...)");
                rl2.u uVar8 = uVarArr4[10];
                Object invoke8 = yVar.f122637g.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke8, "getValue(...)");
                return CollectionsKt.l0((Collection) invoke8, (Collection) invoke7);
            case 5:
                in2.n I = yVar.a().I();
                Intrinsics.checkNotNullExpressionValue(I, "getUnsubstitutedInnerClassesScope(...)");
                Collection s13 = ue.c.s(I, null, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : s13) {
                    if (!bn2.e.o((am2.m) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    am2.m mVar = (am2.m) it.next();
                    am2.g gVar = mVar instanceof am2.g ? (am2.g) mVar : null;
                    Class k13 = gVar != null ? c2.k(gVar) : null;
                    c0 c0Var = k13 != null ? new c0(k13) : null;
                    if (c0Var != null) {
                        arrayList2.add(c0Var);
                    }
                }
                return arrayList2;
            default:
                Collection<am2.g> p13 = yVar.a().p();
                Intrinsics.checkNotNullExpressionValue(p13, "getSealedSubclasses(...)");
                ArrayList arrayList3 = new ArrayList();
                for (am2.g gVar2 : p13) {
                    Intrinsics.g(gVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class k14 = c2.k(gVar2);
                    c0 c0Var2 = k14 != null ? new c0(k14) : null;
                    if (c0Var2 != null) {
                        arrayList3.add(c0Var2);
                    }
                }
                return arrayList3;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f122613i) {
        }
        return b();
    }
}
