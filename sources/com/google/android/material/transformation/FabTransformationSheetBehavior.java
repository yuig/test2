package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import bh.b;
import gj.f;
import gj.h;
import java.util.HashMap;
import java.util.WeakHashMap;
import q5.v0;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    public HashMap f33385i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void C(View view, View view2, boolean z13, boolean z14) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z13) {
                this.f33385i = new HashMap(childCount);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                boolean z15 = (childAt.getLayoutParams() instanceof c) && (((c) childAt.getLayoutParams()).f17900a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z15) {
                    if (z13) {
                        this.f33385i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = v0.f102521a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap hashMap = this.f33385i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f33385i.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = v0.f102521a;
                            childAt.setImportantForAccessibility(intValue);
                        }
                    }
                }
            }
            if (!z13) {
                this.f33385i = null;
            }
        }
        super.C(view, view2, z13, z14);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final b J(Context context, boolean z13) {
        int i13 = z13 ? fj.b.mtrl_fab_transformation_sheet_expand_spec : fj.b.mtrl_fab_transformation_sheet_collapse_spec;
        b bVar = new b(11);
        bVar.f22798b = f.b(context, i13);
        bVar.f22799c = new h();
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
