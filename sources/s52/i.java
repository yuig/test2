package s52;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import et1.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import xk2.v;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111180r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f111181s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f111181s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f111181s, cVar);
        iVar.f111180r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((r52.g) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        r52.g gVar = (r52.g) this.f111180r;
        int i13 = n.f111189g1;
        n nVar = this.f111181s;
        nVar.getClass();
        r52.f fVar = gVar.f106284b;
        Object value = nVar.Y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        boolean z13 = true;
        boolean z14 = !(fVar instanceof r52.e);
        ((ConstraintLayout) value).setVisibility(z14 ? 0 : 8);
        Object value2 = nVar.X0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((FrameLayout) value2).setVisibility(z14 ? 0 : 8);
        boolean z15 = fVar instanceof r52.d;
        if (!z15 && !(fVar instanceof r52.c)) {
            z13 = false;
        }
        GestaltButton.SmallPrimaryButton smallPrimaryButton = nVar.Z0;
        if (smallPrimaryButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        smallPrimaryButton.d(new fx1.d(z13, 13));
        boolean z16 = fVar instanceof r52.c;
        v vVar = nVar.W0;
        if (z16) {
            Object value3 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            r52.c cVar = (r52.c) fVar;
            String string = nVar.getString(o52.e.pin_selection_limit_reached, Integer.valueOf(cVar.f106267a), Integer.valueOf(cVar.f106267a));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            a0.p((GestaltText) value3, string);
        } else if (z15) {
            Object value4 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            r52.d dVar = (r52.d) fVar;
            String string2 = nVar.getString(o52.e.pin_selection_pins_selected, Integer.valueOf(dVar.f106271a), Integer.valueOf(dVar.f106272b));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            a0.p((GestaltText) value4, string2);
        } else if (fVar instanceof r52.b) {
            Object value5 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            r52.b bVar = (r52.b) fVar;
            String string3 = nVar.getString(o52.e.pin_selection_pins_below_threshold, Integer.valueOf(bVar.f106261a), Integer.valueOf(bVar.f106262b), 5);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            a0.p((GestaltText) value5, string3);
        }
        if (gVar.f106285c) {
            FragmentActivity requireActivity = nVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            Context requireContext = nVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            pp2.a.Q0(requireActivity, requireContext, new e(nVar, 2), new e(nVar, 3), new e(nVar, 4));
        }
        List<r52.a> a13 = gVar.f106284b.a();
        ArrayList arrayList = new ArrayList(g0.q(a13, 10));
        for (r52.a aVar2 : a13) {
            arrayList.add(new b(new r0(9, nVar, aVar2), bs1.c.B0(aVar2.f106256a)));
        }
        ((c) nVar.V0.getValue()).C(arrayList);
        return Unit.f80348a;
    }
}
