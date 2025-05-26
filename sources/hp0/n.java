package hp0;

import android.content.res.Resources;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f69856r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f69857s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f69857s = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f69857s, cVar);
        nVar.f69856r = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f69856r;
        t tVar = this.f69857s;
        if (!Intrinsics.d(bVar, tVar.f69871m0)) {
            tVar.f69869k0 = bVar.f69823c;
            ViewPager2 viewPager2 = tVar.f69872n0;
            if (viewPager2 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            lp0.b bVar2 = (lp0.b) tVar.f69875q0.getValue();
            List list = bVar.f69822b;
            bVar2.D(list);
            int i13 = bVar.f69821a;
            viewPager2.i(i13, false);
            jp0.b bVar3 = tVar.f69880v0;
            if (bVar3 == null) {
                Intrinsics.r("carouselView");
                throw null;
            }
            Resources resources = viewPager2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            viewPager2.f(new lp0.a(bVar3, i13, resources, new r(tVar, 1)));
            ((ip0.a) tVar.f69876r0.getValue()).F3(list);
            tVar.f69871m0 = bVar;
        }
        return Unit.f80348a;
    }
}
