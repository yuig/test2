package u80;

import java.util.List;
import kh2.n3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.w;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120931i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f120932j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f120933k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f120934l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f120935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f120936n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i13, b bVar, List list, float f13, float f14, i iVar) {
        super(2);
        this.f120931i = i13;
        this.f120932j = bVar;
        this.f120933k = list;
        this.f120934l = f13;
        this.f120935m = f14;
        this.f120936n = iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        b bVar = this.f120932j;
        List list = this.f120933k;
        int i13 = this.f120931i;
        if (i13 == 1) {
            i2.s sVar2 = (i2.s) oVar;
            sVar2.W(-894580799);
            c cVar = bVar.f120914b.f120919a;
            n3.h((h) list.get(0), this.f120934l, this.f120935m, cVar, null, this.f120936n, sVar2, 8, 16);
            sVar2.r(false);
        } else if (i13 == 2) {
            i2.s sVar3 = (i2.s) oVar;
            sVar3.W(-894217045);
            Pair pair = bVar.f120914b.f120920b;
            c cVar2 = (c) pair.f80346a;
            c cVar3 = (c) pair.f80347b;
            n3.h((h) list.get(0), this.f120934l, this.f120935m, cVar2, null, this.f120936n, sVar3, 8, 16);
            n3.h((h) list.get(1), this.f120934l, this.f120935m, cVar3, null, this.f120936n, sVar3, 8, 16);
            sVar3.r(false);
        } else if (i13 != 3) {
            i2.s sVar4 = (i2.s) oVar;
            sVar4.W(-892708523);
            sVar4.r(false);
        } else {
            i2.s sVar5 = (i2.s) oVar;
            sVar5.W(-893577577);
            w wVar = bVar.f120914b.f120921c;
            c cVar4 = (c) wVar.f135234a;
            c cVar5 = (c) wVar.f135235b;
            c cVar6 = (c) wVar.f135236c;
            n3.h((h) list.get(0), this.f120934l, this.f120935m, cVar4, null, this.f120936n, sVar5, 8, 16);
            n3.h((h) list.get(1), this.f120934l, this.f120935m, cVar5, null, this.f120936n, sVar5, 8, 16);
            n3.h((h) list.get(2), this.f120934l, this.f120935m, cVar6, null, this.f120936n, sVar5, 8, 16);
            sVar5.r(false);
        }
        return Unit.f80348a;
    }
}
