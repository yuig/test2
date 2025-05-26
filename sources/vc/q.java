package vc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public j0 f125559r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f125560s;

    /* renamed from: t, reason: collision with root package name */
    public int f125561t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f125562u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ad.b f125563v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pc.f f125564w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ad.b bVar, pc.f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f125563v = bVar;
        this.f125564w = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f125563v, this.f125564w, cVar);
        qVar.f125562u = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
