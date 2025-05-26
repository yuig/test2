package ba;

import ao2.j0;
import i2.v3;
import j1.g2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g2 f22298r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map f22299s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v3 f22300t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f22301u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g2 g2Var, Map map, v3 v3Var, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f22298r = g2Var;
        this.f22299s = map;
        this.f22300t = v3Var;
        this.f22301u = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v(this.f22298r, this.f22299s, this.f22300t, this.f22301u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        g2 g2Var = this.f22298r;
        if (Intrinsics.d(g2Var.c(), g2Var.f74078d.getValue())) {
            Iterator it = ((List) this.f22300t.getValue()).iterator();
            while (it.hasNext()) {
                this.f22301u.b().b((z9.k) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f22299s;
            for (Map.Entry entry : map.entrySet()) {
                if (!Intrinsics.d(entry.getKey(), ((z9.k) r7.getValue()).f141215f)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return Unit.f80348a;
    }
}
