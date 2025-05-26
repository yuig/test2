package ul2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122596i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f122597j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, int i13) {
        super(0);
        this.f122596i = i13;
        this.f122597j = t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        sm2.c cVar;
        String[] strArr;
        String[] strArr2;
        ?? b13;
        int i13 = this.f122596i;
        t0 t0Var = this.f122597j;
        switch (i13) {
            case 0:
                t0Var.getClass();
                rl2.u uVar = t0.f122608g[0];
                fm2.c cVar2 = (fm2.c) t0Var.f122609c.invoke();
                if (cVar2 == null || (cVar = cVar2.f62577b) == null || (strArr = cVar.f113276c) == null || (strArr2 = cVar.f113278e) == null) {
                    return null;
                }
                Pair h10 = xm2.j.h(strArr, strArr2);
                return new xk2.w((xm2.h) h10.f80346a, (tm2.e0) h10.f80347b, cVar.f113275b);
            default:
                t0Var.getClass();
                rl2.u uVar2 = t0.f122608g[0];
                fm2.c fileClass = (fm2.c) t0Var.f122609c.invoke();
                if (fileClass == null) {
                    return in2.m.f72874b;
                }
                rl2.u uVar3 = e0.f122514b[0];
                Object invoke = t0Var.f122515a.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
                x92.b bVar = ((fm2.g) invoke).f62584b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(fileClass, "fileClass");
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar.f134367d;
                Class cls = fileClass.f62576a;
                ym2.b a13 = gm2.d.a(cls);
                Object obj = concurrentHashMap.get(a13);
                if (obj == null) {
                    ym2.c g13 = gm2.d.a(cls).g();
                    Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
                    sm2.c cVar3 = fileClass.f62577b;
                    sm2.b bVar2 = cVar3.f113274a;
                    sm2.b bVar3 = sm2.b.MULTIFILE_CLASS;
                    if (bVar2 == bVar3) {
                        String[] strArr3 = bVar2 == bVar3 ? cVar3.f113276c : null;
                        List d2 = strArr3 != null ? kotlin.collections.z.d(strArr3) : null;
                        if (d2 == null) {
                            d2 = kotlin.collections.q0.f80391a;
                        }
                        b13 = new ArrayList();
                        Iterator it = d2.iterator();
                        while (it.hasNext()) {
                            ym2.b j13 = ym2.b.j(gn2.b.d((String) it.next()).e());
                            Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
                            rm2.f0 n03 = dl2.b.n0((fm2.d) bVar.f134366c, j13, wn2.k.i(((rm2.r) bVar.f134365b).c().f84110c));
                            if (n03 != null) {
                                b13.add(n03);
                            }
                        }
                    } else {
                        b13 = kotlin.collections.e0.b(fileClass);
                    }
                    dm2.q qVar = new dm2.q(((rm2.r) bVar.f134365b).c().f84109b, g13);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) b13).iterator();
                    while (it2.hasNext()) {
                        nn2.r a14 = ((rm2.r) bVar.f134365b).a(qVar, (rm2.f0) it2.next());
                        if (a14 != null) {
                            arrayList.add(a14);
                        }
                    }
                    in2.n d13 = re2.f.d(CollectionsKt.F0(arrayList), "package " + g13 + " (" + fileClass + ')');
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(a13, d13);
                    obj = putIfAbsent == null ? d13 : putIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
                return (in2.n) obj;
        }
    }
}
