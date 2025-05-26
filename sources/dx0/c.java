package dx0;

import ao2.j0;
import com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel.ShopTheLookCarouselContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56422r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l82.i f56423s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ShopTheLookCarouselContainer f56424t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ShopTheLookCarouselContainer shopTheLookCarouselContainer, l82.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f56423s = iVar;
        this.f56424t = shopTheLookCarouselContainer;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f56424t, this.f56423s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56422r;
        if (i13 == 0) {
            ue.c.H(obj);
            l82.i iVar = this.f56423s;
            do2.i a13 = iVar.a();
            b bVar = new b(this.f56424t, iVar, null);
            this.f56422r = 1;
            if (l0.I(a13, bVar, this) == aVar) {
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
