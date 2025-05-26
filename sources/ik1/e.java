package ik1;

import ao2.j0;
import dl2.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tb0.p;

/* loaded from: classes5.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f72407r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f72408s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, List list, bl2.c cVar) {
        super(2, cVar);
        this.f72407r = gVar;
        this.f72408s = list;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f72407r, this.f72408s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        g gVar = this.f72407r;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            List<String> list = this.f72408s;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            for (String str : list) {
                b bVar = c.Companion;
                double parseDouble = Double.parseDouble(str);
                bVar.getClass();
                map = c.valueToActionType;
                Object obj2 = map.get(Double.valueOf(parseDouble));
                Intrinsics.f(obj2);
                arrayList.add(new a((c) obj2));
            }
            if (gVar.f72414d) {
                gVar.f72416f = CollectionsKt.H0(arrayList);
            }
        } catch (Exception unused) {
            gVar.f72413c.R(false, "actions restoration failed", p.USER_SEQUENCE, new Object[0]);
        }
        return Unit.f80348a;
    }
}
