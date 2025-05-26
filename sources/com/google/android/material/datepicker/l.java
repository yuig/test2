package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes3.dex */
public final class l extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32547e;

    public /* synthetic */ l(Object obj, int i13) {
        this.f32546d = i13;
        this.f32547e = obj;
    }

    @Override // q5.b
    public final void d(View view, r5.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        switch (this.f32546d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                eVar.t(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                eVar.C(false);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                s sVar = (s) this.f32547e;
                eVar.y(sVar.f32569n.getVisibility() == 0 ? sVar.getString(fj.k.mtrl_picker_toggle_to_year_selection) : sVar.getString(fj.k.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                eVar.t(null);
                break;
        }
    }
}
