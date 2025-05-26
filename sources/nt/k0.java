package nt;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class k0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ vd0.c f92081r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(vd0.c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f92081r = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k0(this.f92081r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return Boolean.valueOf(com.bumptech.glide.d.D0(new File(lb0.g.c("COUNTRIES", true)), this.f92081r.f125623a.toString()));
    }
}
