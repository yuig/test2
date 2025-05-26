package z01;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import y01.o0;

/* loaded from: classes5.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f140537r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f140538s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140538s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f140538s, cVar);
        cVar2.f140537r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f30) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        String id3 = ((f30) this.f140537r).getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f140538s.a(new o0(id3));
        return Unit.f80348a;
    }
}
