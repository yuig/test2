package r5;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class g extends f {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i13, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f106234a.b(i13, new e(accessibilityNodeInfo), str, bundle);
    }
}
