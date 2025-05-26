package androidx.appcompat.widget;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16685b;

    public /* synthetic */ t(Object obj, int i13) {
        this.f16684a = i13;
        this.f16685b = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        switch (this.f16684a) {
            case 2:
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(event, "event");
                super.onInitializeAccessibilityEvent(host, event);
                if (event.getEventType() == 32768) {
                    yq1.s2 s2Var = (yq1.s2) this.f16685b;
                    if (s2Var.f139997k0) {
                        GestaltTextField gestaltTextField = s2Var.f140001o0;
                        if (gestaltTextField == null) {
                            Intrinsics.r("passwordEditText");
                            throw null;
                        }
                        gestaltTextField.g0();
                        s2Var.f139997k0 = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityEvent(host, event);
                return;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f16684a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCanOpenPopup(true);
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((com.google.android.material.textfield.q) this.f16685b).f33288h.f33167d;
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                break;
        }
    }
}
