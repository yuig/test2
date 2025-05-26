package c2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class b extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ ao2.j0 f24553r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ float f24554s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f24555t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, bl2.c cVar) {
        super(3, cVar);
        this.f24555t = wVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        b bVar = new b(this.f24555t, (bl2.c) obj3);
        bVar.f24553r = (ao2.j0) obj;
        bVar.f24554s = floatValue;
        return bVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        kotlin.jvm.internal.j.z(this.f24553r, null, null, new a(this.f24555t, this.f24554s, null), 3);
        return Unit.f80348a;
    }
}
