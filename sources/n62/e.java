package n62;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m62.q0;
import r72.u0;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f89348s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f89348s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f89348s, cVar);
        eVar.f89347r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((List) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        List list = (List) this.f89347r;
        Function1 function1 = this.f89348s.f89362k;
        List<PointF> list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        for (PointF pointF : list2) {
            arrayList.add(new u0(pointF.x, pointF.y));
        }
        function1.invoke(new q0(arrayList));
        return Unit.f80348a;
    }
}
