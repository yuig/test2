package r90;

import android.os.Bundle;
import ao2.j0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p90.e0;
import p90.f0;
import p90.g0;
import p90.h0;
import p90.i0;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0 f106863r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f106864s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i0 i0Var, c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f106863r = i0Var;
        this.f106864s = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f106863r, this.f106864s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i0 i0Var = this.f106863r;
        boolean z13 = i0Var instanceof e0;
        c cVar = this.f106864s;
        if (z13) {
            cVar.f106865a.B();
        } else if (i0Var instanceof f0) {
            ll.j jVar = cVar.f106865a;
            a aVar2 = a.f106860j;
            Bundle bundle = new Bundle();
            f0 f0Var = (f0) i0Var;
            bundle.putParcelable("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_KEY", f0Var.f99186a);
            bundle.putParcelable("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_ORIGIN_KEY", f0Var.f99187b);
            Unit unit = Unit.f80348a;
            jVar.D(aVar2, "CutoutPickerExtras.CUTOUT_SELECTION_RESULT_CODE", bundle);
        } else if (i0Var instanceof g0) {
            ll.j jVar2 = cVar.f106865a;
            NavigationImpl w13 = Navigation.w1(l0.b());
            g0 g0Var = (g0) i0Var;
            w13.m0("SOURCE_PIN_ID", g0Var.f99189a);
            w13.w0(g0Var.f99190b, "CutoutPickerCloseupExtras.CUTOUT_PICKER_CLOSEUP_KEY_ORIGIN");
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            jVar2.f(w13);
        } else if (i0Var instanceof h0) {
            ab0.e.b(cVar.f106866b, ((h0) i0Var).f99192a, null, new Integer(1), null, null, 58);
        }
        return Unit.f80348a;
    }
}
