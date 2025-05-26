package h42;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import androidx.viewpager2.widget.ViewPager2;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f67667r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Fragment f67668s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.i f67669t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f67670u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f67671v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, ViewPager2 viewPager2, j jVar, bl2.c cVar, do2.i iVar) {
        super(2, cVar);
        this.f67668s = fragment;
        this.f67669t = iVar;
        this.f67670u = jVar;
        this.f67671v = viewPager2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = this.f67670u;
        return new m(this.f67668s, this.f67671v, jVar, cVar, this.f67669t);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f67667r;
        if (i13 == 0) {
            ue.c.H(obj);
            z viewLifecycleOwner = this.f67668s.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            r rVar = r.STARTED;
            l lVar = new l(this.f67668s, this.f67671v, this.f67670u, null, this.f67669t);
            this.f67667r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, lVar, this) == aVar) {
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
