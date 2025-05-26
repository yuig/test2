package oy0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f98265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f98266s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f98266s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f98266s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f98265r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f98265r = 1;
            d dVar = this.f98266s;
            Object b13 = dVar.f98274c.b("NUX_SELECTED_PIN_COUNT", dVar.f98272a.a().f105346h.size(), this);
            if (b13 != aVar) {
                b13 = Unit.f80348a;
            }
            if (b13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
