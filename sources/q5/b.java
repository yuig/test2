package q5;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f102401c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f102402a;

    /* renamed from: b, reason: collision with root package name */
    public final a f102403b;

    public b() {
        this(f102401c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f102402a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.recyclerview.widget.y1 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f102402a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new androidx.recyclerview.widget.y1(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f102402a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, r5.e eVar) {
        this.f102402a.onInitializeAccessibilityNodeInfo(view, eVar.f106231a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f102402a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f102402a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i13, Bundle bundle) {
        boolean z13;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(b5.c.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z14 = false;
        int i14 = 0;
        while (true) {
            if (i14 >= list.size()) {
                break;
            }
            r5.d dVar = (r5.d) list.get(i14);
            if (dVar.a() == i13) {
                r5.p pVar = dVar.f106230d;
                if (pVar != null) {
                    Class cls = dVar.f106229c;
                    if (cls != null) {
                        try {
                            ep.b.A(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e13) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e13);
                        }
                    }
                    z13 = pVar.l(view);
                }
            } else {
                i14++;
            }
        }
        z13 = false;
        if (!z13) {
            z13 = this.f102402a.performAccessibilityAction(view, i13, bundle);
        }
        if (z13 || i13 != b5.c.accessibility_action_clickable_span || bundle == null) {
            return z13;
        }
        int i15 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(b5.c.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i15)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i16 = 0;
            while (true) {
                if (clickableSpanArr == null || i16 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i16])) {
                    clickableSpan.onClick(view);
                    z14 = true;
                    break;
                }
                i16++;
            }
        }
        return z14;
    }

    public void h(View view, int i13) {
        this.f102402a.sendAccessibilityEvent(view, i13);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f102402a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f102402a = accessibilityDelegate;
        this.f102403b = new a(this);
    }
}
