package i72;

import ao2.j0;
import com.bumptech.glide.l;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f71681r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f71682s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f71681r = gVar;
        this.f71682s = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f71681r, this.f71682s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return ((l) com.bumptech.glide.b.f(this.f71681r.f71691a).c().K(this.f71682s).m(320, 320)).L(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
    }
}
