package ct0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f53158r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f53159s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f53160t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, View view, bl2.c cVar) {
        super(2, cVar);
        this.f53159s = sVar;
        this.f53160t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f53159s, this.f53160t, cVar);
        nVar.f53158r = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((n) create((h) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
        return Boolean.TRUE;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h hVar = (h) this.f53158r;
        int i13 = s.S0;
        s sVar = this.f53159s;
        Drawable I = com.bumptech.glide.c.I(sVar.requireContext(), hVar.f53150f);
        Intrinsics.f(I);
        ht0.u.d(I);
        sVar.Q0 = I;
        Drawable I2 = com.bumptech.glide.c.I(sVar.requireContext(), hVar.f53151g);
        Intrinsics.f(I2);
        ht0.u.d(I2);
        sVar.R0 = I2;
        sVar.O8(ht0.u.a(sVar, hVar.f53147c), 49);
        Context requireContext = sVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int F0 = dl2.b.F0(requireContext, hVar.f53148d);
        Context requireContext2 = sVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int F02 = dl2.b.F0(requireContext2, hVar.f53149e);
        this.f53160t.setPaddingRelative(F02, 0, F02, 0);
        PinterestRecyclerView pinterestRecyclerView = sVar.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.d(0);
        }
        sVar.a8(new r(hVar.f53145a, 0, F0, F02, new mj.m(10)));
        return Boolean.TRUE;
    }
}
