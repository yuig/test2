package h42;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f67662r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.i f67663s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f67664t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f67665u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Fragment f67666v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Fragment fragment, ViewPager2 viewPager2, j jVar, bl2.c cVar, do2.i iVar) {
        super(2, cVar);
        this.f67663s = iVar;
        this.f67664t = jVar;
        this.f67665u = viewPager2;
        this.f67666v = fragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f67666v, this.f67665u, this.f67664t, cVar, this.f67663s);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f67662r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i V = l0.V(this.f67663s);
            k kVar = new k(this.f67664t, this.f67665u, this.f67666v, null);
            this.f67662r = 1;
            if (l0.I(V, kVar, this) == aVar) {
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
