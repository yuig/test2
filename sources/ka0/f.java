package ka0;

import androidx.viewpager.widget.ViewPager;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f78899r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f78900s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f78900s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f78900s, cVar);
        fVar.f78899r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f78899r;
        int i13 = j.f78907h0;
        j jVar = this.f78900s;
        jVar.getClass();
        int e13 = aVar2.e();
        GestaltTabLayout gestaltTabLayout = jVar.f78910e0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabBar");
            throw null;
        }
        if (e13 != gestaltTabLayout.m()) {
            GestaltTabLayout gestaltTabLayout2 = jVar.f78910e0;
            if (gestaltTabLayout2 == null) {
                Intrinsics.r("tabBar");
                throw null;
            }
            ek.e n13 = gestaltTabLayout2.n(aVar2.e());
            if (n13 != null) {
                n13.b();
            }
            ViewPager viewPager = jVar.f78911f0;
            if (viewPager == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            viewPager.B(aVar2.e(), true);
        }
        return Unit.f80348a;
    }
}
