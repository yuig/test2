package jn1;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h32.f1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kj.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f77100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f77101b;

    public e(i iVar, BottomSheetBehavior bottomSheetBehavior) {
        this.f77100a = iVar;
        this.f77101b = bottomSheetBehavior;
    }

    @Override // kj.b
    public final void b(View bottomSheet, float f13) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        i iVar = this.f77100a;
        Function1 function1 = iVar.f77116g;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f13));
        }
        c cVar = c.USER_DRAGGED;
        if (f13 >= 1.0f) {
            int i13 = iVar.f77110a;
            iVar.f77119j = false;
            BottomSheetBehavior bottomSheetBehavior = iVar.f77118i;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.W(i13);
            }
            Function0 function0 = iVar.f77114e;
            if (function0 != null) {
                function0.invoke();
            }
            iVar.c(f1.BOTTOM_SHEET_SNAP_FULLY_OPEN, cVar);
        }
        if (f13 > 0.0f || iVar.f77119j || !iVar.f77120k) {
            return;
        }
        int i14 = this.f77101b.L;
        if (i14 == 1 || i14 == 4) {
            i.b(iVar, cVar);
        }
    }

    @Override // kj.b
    public final void c(View bottomSheet, int i13) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Function1 function1 = this.f77100a.f77111b;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i13));
        }
    }
}
