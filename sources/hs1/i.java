package hs1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f70047r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f70047r = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f70047r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        m mVar = this.f70047r;
        com.bumptech.glide.b bVar = mVar.f70060j;
        if (bVar != null) {
            he.n.a();
            bVar.f29742c.e(0L);
            bVar.f29741b.q();
            qd.i iVar = bVar.f29744e;
            synchronized (iVar) {
                iVar.b(0);
            }
        }
        mVar.f70061k.clear();
        return Unit.f80348a;
    }
}
