package h42;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.w;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f67658r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f67659s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f67660t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Fragment f67661u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, ViewPager2 viewPager2, Fragment fragment, bl2.c cVar) {
        super(2, cVar);
        this.f67659s = jVar;
        this.f67660t = viewPager2;
        this.f67661u = fragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f67659s, this.f67660t, this.f67661u, cVar);
        kVar.f67658r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a newDisplayState = (a) this.f67658r;
        j jVar = this.f67659s;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(newDisplayState, "newDisplayState");
        a aVar2 = jVar.f67654o;
        jVar.f67654o = newDisplayState;
        w e13 = a0.e(new vs.c(aVar2, newDisplayState));
        Intrinsics.checkNotNullExpressionValue(e13, "calculateDiff(...)");
        e13.b(jVar);
        ViewPager2 viewPager2 = this.f67660t;
        int i13 = viewPager2.f19924d;
        int i14 = newDisplayState.f67641b;
        if (i14 != i13) {
            viewPager2.i(i14, false);
        }
        Fragment fragment = this.f67661u;
        u50.i iVar = newDisplayState.f67642c;
        if (iVar != null) {
            Context requireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            viewPager2.setBackgroundColor(((Number) iVar.a(requireContext)).intValue());
        }
        if (newDisplayState.f67643d != null) {
            Intrinsics.checkNotNullExpressionValue(fragment.requireContext(), "requireContext(...)");
            viewPager2.l(new androidx.viewpager2.widget.c((int) ((r6.a(r2).intValue() / 2) * hf0.b.f69001a)));
        }
        return Unit.f80348a;
    }
}
