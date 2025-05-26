package ee2;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f58807j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f58808k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f58809l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f58810m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f58811i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58811i) {
            case 0:
                ud2.a it = (ud2.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.getClass();
                l3.c.N0(it);
                break;
            case 1:
                ud2.b it2 = (ud2.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                it2.getClass();
                l3.c.N0(it2);
                break;
            case 2:
                td2.a it3 = (td2.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                it3.getClass();
                l3.c.N0(it3);
                break;
            default:
                e item = (e) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                fe2.b bVar = item.f58824a;
                Iterator it4 = bVar.f58820e.iterator();
                while (it4.hasNext()) {
                    td2.a aVar = (td2.a) it4.next();
                    aVar.getClass();
                    l3.c.N0(aVar);
                }
                Iterator it5 = bVar.f58821f.iterator();
                while (it5.hasNext()) {
                    ud2.b bVar2 = (ud2.b) it5.next();
                    bVar2.getClass();
                    l3.c.N0(bVar2);
                }
                Iterator it6 = bVar.f58822g.iterator();
                while (it6.hasNext()) {
                    ud2.a aVar2 = (ud2.a) it6.next();
                    aVar2.getClass();
                    l3.c.N0(aVar2);
                }
                ud2.c cVar = (ud2.c) bVar.f58823h.c(bVar, d.f58814i[0]);
                if (cVar != null) {
                    l3.c.N0(cVar);
                }
                ge2.a aVar3 = bVar.f64856k;
                if (aVar3 != null) {
                    aVar3.f64840a.g();
                    aVar3.f64845f.c();
                    aVar3.f64846g.c();
                    aVar3.f64847h.l();
                }
                ae2.d dVar = bVar.f64857l;
                if (dVar != null) {
                    dVar.b();
                }
                bVar.f64857l = null;
                bVar.f58816a = false;
                break;
        }
        return Unit.f80348a;
    }
}
