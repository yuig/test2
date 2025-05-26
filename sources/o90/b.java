package o90;

import android.os.Bundle;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m90.m0;
import m90.n0;
import m90.o0;
import m90.p0;
import m90.q0;
import m90.r0;
import m90.s0;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f93782r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f93783s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s0 s0Var, c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f93782r = s0Var;
        this.f93783s = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f93782r, this.f93783s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        s0 s0Var = this.f93782r;
        boolean z13 = s0Var instanceof n0;
        c cVar = this.f93783s;
        if (z13) {
            cVar.f93784a.B();
        } else if (s0Var instanceof o0) {
            cVar.f93784a.C(a.f93779j);
        } else if (s0Var instanceof m0) {
            ll.j jVar = cVar.f93784a;
            a aVar2 = a.f93780k;
            Bundle bundle = new Bundle();
            m0 m0Var = (m0) s0Var;
            bundle.putParcelable("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_KEY", m0Var.f86671a);
            bundle.putParcelable("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_ORIGIN_KEY", m0Var.f86672b);
            Unit unit = Unit.f80348a;
            jVar.D(aVar2, "CutoutPickerExtras.CUTOUT_SELECTION_RESULT_CODE", bundle);
        } else if (s0Var instanceof q0) {
            ll.j jVar2 = cVar.f93784a;
            NavigationImpl w13 = Navigation.w1(l0.b());
            q0 q0Var = (q0) s0Var;
            w13.m0("SOURCE_PIN_ID", q0Var.f86689a);
            w13.w0(q0Var.f86690b, "CutoutPickerCloseupExtras.CUTOUT_PICKER_CLOSEUP_KEY_ORIGIN");
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            jVar2.f(w13);
        } else if (s0Var instanceof r0) {
            r0 r0Var = (r0) s0Var;
            cVar.f93784a.f(el.a.y(false, false, null, null, r0Var.f86693a, r0Var.f86694b, ml1.b.DEFAULT_TRANSITION, RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN));
        } else if (s0Var instanceof p0) {
            ll.j jVar3 = cVar.f93784a;
            NavigationImpl w14 = Navigation.w1(l0.c());
            w14.m0("com.pinterest.EXTRA_SEARCH_PREFILLED_QUERY", ((p0) s0Var).f86684a);
            Intrinsics.checkNotNullExpressionValue(w14, "apply(...)");
            jVar3.f(w14);
        }
        return Unit.f80348a;
    }
}
