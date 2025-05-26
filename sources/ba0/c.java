package ba0;

import dl2.j;
import java.util.ArrayList;
import java.util.List;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m62.l;
import m62.n;
import m62.o;
import m62.s;
import u50.r;
import y90.k;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22330r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f22331s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f22332t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f22331s = eVar;
        this.f22332t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f22331s, this.f22332t, cVar);
        cVar2.f22330r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((s) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        s sVar = (s) this.f22330r;
        m2 m2Var = sVar.f86050f;
        List list = e.f22335b;
        this.f22331s.getClass();
        if (m2Var instanceof o) {
            List list2 = ((o) m2Var).f86036d;
            ArrayList colors = new ArrayList();
            for (Object obj2 : list2) {
                if (!(((m62.e) obj2) instanceof m62.b)) {
                    colors.add(obj2);
                }
            }
            Intrinsics.checkNotNullParameter(colors, "colors");
            m2Var = new o(colors);
        }
        m2 m2Var2 = m2Var;
        List list3 = sVar.f86051g;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list3) {
            if (!(((n) obj3) instanceof l)) {
                arrayList.add(obj3);
            }
        }
        this.f22332t.a(new k(s.a(sVar, null, null, null, null, null, m2Var2, arrayList, null, false, 0.0f, null, 1951)));
        return Unit.f80348a;
    }
}
