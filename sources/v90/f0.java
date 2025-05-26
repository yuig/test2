package v90;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.shuffles.cutout.editor.ui.select.CropRectContainer;
import com.pinterest.shuffles.cutout.editor.ui.widget.ShimmerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class f0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124893r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0 f124894s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, bl2.c cVar) {
        super(2, cVar);
        this.f124894s = i0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f0 f0Var = new f0(this.f124894s, cVar);
        f0Var.f124893r = obj;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f124893r;
        IntRange intRange = i0.f124904q0;
        i0 i0Var = this.f124894s;
        i0Var.getClass();
        i0Var.f124917o0 = aVar2.f124856d;
        com.google.android.gms.internal.measurement.x xVar = i0Var.f124915m0;
        if (xVar == null) {
            Intrinsics.r("selectMaskViewHelper");
            throw null;
        }
        xVar.t(aVar2.f124857e);
        dv0.q qVar = i0Var.f124916n0;
        if (qVar == null) {
            Intrinsics.r("refineMaskViewHelper");
            throw null;
        }
        qVar.p(aVar2.f124858f);
        CropRectContainer cropRectContainer = i0Var.f124911i0;
        if (cropRectContainer == null) {
            Intrinsics.r("selectMaskContainer");
            throw null;
        }
        n1 n1Var = n1.SELECT;
        n1 n1Var2 = aVar2.f124859g;
        cropRectContainer.setVisibility(n1Var2 != n1Var ? 4 : 0);
        ViewGroup viewGroup = i0Var.f124914l0;
        if (viewGroup == null) {
            Intrinsics.r("refineMaskContainer");
            throw null;
        }
        viewGroup.setVisibility(n1Var2 != n1.REFINE ? 4 : 0);
        ShimmerView shimmerView = i0Var.f124913k0;
        if (shimmerView == null) {
            Intrinsics.r("cropRectView");
            throw null;
        }
        shimmerView.setEnabled(aVar2.f124863k);
        if (aVar2.f124854b) {
            View view = i0Var.f124909g0;
            if (view == null) {
                Intrinsics.r("savingOverlay");
                throw null;
            }
            if (view.getVisibility() != 0) {
                View view2 = i0Var.f124909g0;
                if (view2 == null) {
                    Intrinsics.r("savingOverlay");
                    throw null;
                }
                kg.a.s(view2, 0L, null, 6);
                GestaltSpinner gestaltSpinner = i0Var.f124910h0;
                if (gestaltSpinner == null) {
                    Intrinsics.r("savingOverlayLoadingView");
                    throw null;
                }
                dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
            }
        } else {
            View view3 = i0Var.f124909g0;
            if (view3 == null) {
                Intrinsics.r("savingOverlay");
                throw null;
            }
            if (view3.getVisibility() == 0) {
                View view4 = i0Var.f124909g0;
                if (view4 == null) {
                    Intrinsics.r("savingOverlay");
                    throw null;
                }
                bs1.c.X0(view4);
                GestaltSpinner gestaltSpinner2 = i0Var.f124910h0;
                if (gestaltSpinner2 == null) {
                    Intrinsics.r("savingOverlayLoadingView");
                    throw null;
                }
                dl2.b.X2(gestaltSpinner2, ln1.e.NONE);
            }
        }
        i0Var.f124907e0.setValue(aVar2.f124855c);
        i0Var.f124908f0.setValue(aVar2.f124853a);
        i0Var.f124906d0.setValue(aVar2.f124860h);
        return Unit.f80348a;
    }
}
