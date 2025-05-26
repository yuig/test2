package ix;

import ao2.j0;
import com.pinterest.api.model.xs0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public d f73782r;

    /* renamed from: s, reason: collision with root package name */
    public int f73783s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f73784t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f73784t = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f73784t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73783s;
        if (i13 == 0) {
            ue.c.H(obj);
            d dVar2 = this.f73784t;
            kx.b bVar = dVar2.f73786b;
            this.f73782r = dVar2;
            this.f73783s = 1;
            Object a13 = bVar.a(this);
            if (a13 == aVar) {
                return aVar;
            }
            dVar = dVar2;
            obj = a13;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.f73782r;
            ue.c.H(obj);
        }
        dVar.f73790f = (xs0) obj;
        return Unit.f80348a;
    }
}
