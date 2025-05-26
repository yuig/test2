package w01;

import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127053r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PinCloseupPresenter f127054s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PinCloseupPresenter pinCloseupPresenter, bl2.c cVar) {
        super(2, cVar);
        this.f127054s = pinCloseupPresenter;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f127054s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127053r;
        if (i13 == 0) {
            ue.c.H(obj);
            PinCloseupPresenter pinCloseupPresenter = this.f127054s;
            do2.c a13 = kotlin.jvm.internal.j.a(pinCloseupPresenter.getRelatedPinsPagedList().f49129s);
            y1.b bVar = new y1.b(pinCloseupPresenter, 10);
            this.f127053r = 1;
            if (a13.collect(bVar, this) == aVar) {
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
