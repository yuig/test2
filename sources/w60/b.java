package w60;

import ao2.j0;
import com.pinterest.boardAutoCollages.q0;
import com.pinterest.boardAutoCollages.w;
import dl2.j;
import ha2.a0;
import ha2.x;
import ha2.z;
import java.util.ArrayList;
import java.util.Set;
import jc0.v;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lp.k;
import sv.y;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f128113r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ nu.a f128114s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f128115t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, nu.a aVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f128113r = wVar;
        this.f128114s = aVar;
        this.f128115t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f128113r, this.f128114s, this.f128115t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        w wVar = this.f128113r;
        if (wVar instanceof w) {
            Set options = wVar.f44599a;
            r rVar = this.f128115t;
            nu.a aVar2 = this.f128114s;
            y actionHandler = new y(rVar, wVar, aVar2, 4);
            Set set = com.pinterest.boardAutoCollages.c.f44548a;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            x xVar = new x(q0.board_auto_collages_sheet_title, null, null, null, null, 30);
            Set<com.pinterest.boardAutoCollages.b> set2 = options;
            ArrayList arrayList = new ArrayList(g0.q(set2, 10));
            for (com.pinterest.boardAutoCollages.b bVar : set2) {
                arrayList.add(new a0(bVar.getTitleResId(), bVar.ordinal(), null, null, null, null, null, null, null, 1020));
            }
            aVar2.f92305b.d(new v(new k(new ha2.a(e0.b(new z(xVar, arrayList, actionHandler)), false, (Integer) null, 14)), false, 0L, 30));
        }
        return Unit.f80348a;
    }
}
