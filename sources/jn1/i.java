package jn1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import df.l1;
import h32.f1;
import kl2.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f77110a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f77111b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f77112c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f77113d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f77114e;

    /* renamed from: f, reason: collision with root package name */
    public l f77115f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f77116g;

    /* renamed from: h, reason: collision with root package name */
    public View f77117h;

    /* renamed from: i, reason: collision with root package name */
    public BottomSheetBehavior f77118i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f77119j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f77120k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f77121l;

    /* renamed from: m, reason: collision with root package name */
    public f1 f77122m;

    public static void b(i iVar, c actionSource) {
        float f13;
        BottomSheetBehavior bottomSheetBehavior = iVar.f77118i;
        if (bottomSheetBehavior != null) {
            f13 = bottomSheetBehavior.f32301f ? -1 : bottomSheetBehavior.f32299e;
        } else {
            f13 = 0.0f;
        }
        b animationSpeed = b.Fast;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        Intrinsics.checkNotNullParameter(animationSpeed, "animationSpeed");
        if (iVar.f77121l) {
            View view = iVar.f77117h;
            if (view != null) {
                view.post(new a(f13, view, iVar, animationSpeed));
                return;
            }
            return;
        }
        iVar.f77119j = true;
        BottomSheetBehavior bottomSheetBehavior2 = iVar.f77118i;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.W(0);
            bottomSheetBehavior2.X(4);
        }
        Function0 function0 = iVar.f77112c;
        if (function0 != null) {
            function0.invoke();
        }
        iVar.c(f1.BOTTOM_SHEET_SNAP_MINIMIZED, actionSource);
    }

    public final BottomSheetBehavior a() {
        return this.f77118i;
    }

    public final void c(f1 f1Var, c cVar) {
        f1 f1Var2 = this.f77122m;
        if (f1Var2 == f1Var) {
            return;
        }
        l lVar = this.f77115f;
        if (lVar != null) {
            lVar.invoke(cVar, f1Var, f1Var2);
        }
        this.f77122m = f1Var;
    }

    public final void d() {
        BottomSheetBehavior bottomSheetBehavior = this.f77118i;
        if (bottomSheetBehavior != null) {
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            bottomSheetBehavior.X.clear();
        }
        this.f77118i = null;
        e(null);
    }

    public final void e(ViewGroup viewGroup) {
        this.f77117h = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new l1(4));
            BottomSheetBehavior J2 = BottomSheetBehavior.J(viewGroup);
            J2.W(0);
            J2.C(new e(this, J2));
            this.f77118i = J2;
        }
    }
}
