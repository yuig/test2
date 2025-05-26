package q5;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final b f102396a;

    public a(b bVar) {
        this.f102396a = bVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f102396a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        androidx.recyclerview.widget.y1 b13 = this.f102396a.b(view);
        if (b13 != null) {
            return (AccessibilityNodeProvider) b13.f19715a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f102396a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        r5.e eVar = new r5.e(accessibilityNodeInfo);
        WeakHashMap weakHashMap = v0.f102521a;
        Boolean bool = (Boolean) new h0(b5.c.tag_screen_reader_focusable, 0).e(view);
        boolean z13 = bool != null && bool.booleanValue();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z13);
        } else {
            eVar.n(1, z13);
        }
        Boolean bool2 = (Boolean) new h0(b5.c.tag_accessibility_heading, 3).e(view);
        boolean z14 = bool2 != null && bool2.booleanValue();
        int i14 = 2;
        if (i13 >= 28) {
            accessibilityNodeInfo.setHeading(z14);
        } else {
            eVar.n(2, z14);
        }
        CharSequence e13 = v0.e(view);
        if (i13 >= 28) {
            accessibilityNodeInfo.setPaneTitle(e13);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e13);
        }
        CharSequence charSequence = (CharSequence) new h0(b5.c.tag_state_description, 64, 30, i14).e(view);
        if (i13 >= 30) {
            j5.a.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f102396a.d(view, eVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(b5.c.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            eVar.b((r5.d) list.get(i15));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f102396a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f102396a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i13, Bundle bundle) {
        return this.f102396a.g(view, i13, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i13) {
        this.f102396a.h(view, i13);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f102396a.i(view, accessibilityEvent);
    }
}
