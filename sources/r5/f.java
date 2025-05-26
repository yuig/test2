package r5;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.recyclerview.widget.y1;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f106234a;

    public f(y1 y1Var) {
        this.f106234a = y1Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i13) {
        e c13 = this.f106234a.c(i13);
        if (c13 == null) {
            return null;
        }
        return c13.f106231a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i13) {
        this.f106234a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i13) {
        e e13 = this.f106234a.e(i13);
        if (e13 == null) {
            return null;
        }
        return e13.f106231a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i13, int i14, Bundle bundle) {
        return this.f106234a.m(i13, i14, bundle);
    }
}
