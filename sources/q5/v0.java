package q5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a */
    public static WeakHashMap f102521a = null;

    /* renamed from: b */
    public static Method f102522b = null;

    /* renamed from: c */
    public static Field f102523c = null;

    /* renamed from: d */
    public static boolean f102524d = false;

    /* renamed from: e */
    public static final int[] f102525e = {b5.c.accessibility_custom_action_0, b5.c.accessibility_custom_action_1, b5.c.accessibility_custom_action_2, b5.c.accessibility_custom_action_3, b5.c.accessibility_custom_action_4, b5.c.accessibility_custom_action_5, b5.c.accessibility_custom_action_6, b5.c.accessibility_custom_action_7, b5.c.accessibility_custom_action_8, b5.c.accessibility_custom_action_9, b5.c.accessibility_custom_action_10, b5.c.accessibility_custom_action_11, b5.c.accessibility_custom_action_12, b5.c.accessibility_custom_action_13, b5.c.accessibility_custom_action_14, b5.c.accessibility_custom_action_15, b5.c.accessibility_custom_action_16, b5.c.accessibility_custom_action_17, b5.c.accessibility_custom_action_18, b5.c.accessibility_custom_action_19, b5.c.accessibility_custom_action_20, b5.c.accessibility_custom_action_21, b5.c.accessibility_custom_action_22, b5.c.accessibility_custom_action_23, b5.c.accessibility_custom_action_24, b5.c.accessibility_custom_action_25, b5.c.accessibility_custom_action_26, b5.c.accessibility_custom_action_27, b5.c.accessibility_custom_action_28, b5.c.accessibility_custom_action_29, b5.c.accessibility_custom_action_30, b5.c.accessibility_custom_action_31};

    /* renamed from: f */
    public static final g0 f102526f = new g0();

    /* renamed from: g */
    public static final i0 f102527g = new i0();

    public static int a(View view, String str, r5.p pVar) {
        int i13;
        ArrayList f13 = f(view);
        int i14 = 0;
        while (true) {
            if (i14 >= f13.size()) {
                int i15 = -1;
                for (int i16 = 0; i16 < 32 && i15 == -1; i16++) {
                    int i17 = f102525e[i16];
                    boolean z13 = true;
                    for (int i18 = 0; i18 < f13.size(); i18++) {
                        z13 &= ((r5.d) f13.get(i18)).a() != i17;
                    }
                    if (z13) {
                        i15 = i17;
                    }
                }
                i13 = i15;
            } else {
                if (TextUtils.equals(str, ((AccessibilityNodeInfo.AccessibilityAction) ((r5.d) f13.get(i14)).f106227a).getLabel())) {
                    i13 = ((r5.d) f13.get(i14)).a();
                    break;
                }
                i14++;
            }
        }
        if (i13 != -1) {
            r5.d dVar = new r5.d(null, i13, str, pVar, null);
            View.AccessibilityDelegate a13 = Build.VERSION.SDK_INT >= 29 ? r0.a(view) : d(view);
            b bVar = a13 == null ? null : a13 instanceof a ? ((a) a13).f102396a : new b(a13);
            if (bVar == null) {
                bVar = new b();
            }
            o(view, bVar);
            l(view, dVar.a());
            f(view).add(dVar);
            i(view, 0);
        }
        return i13;
    }

    public static d1 b(View view) {
        if (f102521a == null) {
            f102521a = new WeakHashMap();
        }
        d1 d1Var = (d1) f102521a.get(view);
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(view);
        f102521a.put(view, d1Var2);
        return d1Var2;
    }

    public static a2 c(View view, a2 a2Var) {
        WindowInsets h10 = a2Var.h();
        if (h10 != null) {
            WindowInsets a13 = k0.a(view, h10);
            if (!a13.equals(h10)) {
                return a2.i(view, a13);
            }
        }
        return a2Var;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (f102524d) {
            return null;
        }
        if (f102523c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f102523c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f102524d = true;
                return null;
            }
        }
        try {
            Object obj = f102523c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f102524d = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        return (CharSequence) new h0(b5.c.tag_accessibility_pane_title, 8, 28, 1).e(view);
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(b5.c.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(b5.c.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? t0.a(view) : (String[]) view.getTag(b5.c.tag_on_receive_content_mime_types);
    }

    public static g2 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s0.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new g2(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(View view, int i13) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z13 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z13) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z13 ? 32 : 2048);
                obtain.setContentChangeTypes(i13);
                if (z13) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i13 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i13);
                        return;
                    } catch (AbstractMethodError e13) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e13);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i13);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static a2 j(View view, a2 a2Var) {
        WindowInsets h10 = a2Var.h();
        if (h10 != null) {
            WindowInsets b13 = k0.b(view, h10);
            if (!b13.equals(h10)) {
                return a2.i(view, b13);
            }
        }
        return a2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g k(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.b(view, gVar);
        }
        androidx.core.widget.m mVar = (androidx.core.widget.m) view.getTag(b5.c.tag_on_receive_content_listener);
        w wVar = f102526f;
        if (mVar == null) {
            if (view instanceof w) {
                wVar = (w) view;
            }
            return wVar.a(gVar);
        }
        g a13 = androidx.core.widget.m.a(view, gVar);
        if (a13 == null) {
            return null;
        }
        if (view instanceof w) {
            wVar = (w) view;
        }
        return wVar.a(a13);
    }

    public static void l(View view, int i13) {
        ArrayList f13 = f(view);
        for (int i14 = 0; i14 < f13.size(); i14++) {
            if (((r5.d) f13.get(i14)).a() == i13) {
                f13.remove(i14);
                return;
            }
        }
    }

    public static void m(View view, r5.d dVar, String str, r5.p pVar) {
        if (pVar == null && str == null) {
            l(view, dVar.a());
            i(view, 0);
            return;
        }
        r5.d dVar2 = new r5.d(null, dVar.f106228b, str, pVar, dVar.f106229c);
        View.AccessibilityDelegate a13 = Build.VERSION.SDK_INT >= 29 ? r0.a(view) : d(view);
        b bVar = a13 == null ? null : a13 instanceof a ? ((a) a13).f102396a : new b(a13);
        if (bVar == null) {
            bVar = new b();
        }
        o(view, bVar);
        l(view, dVar2.a());
        f(view).add(dVar2);
        i(view, 0);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i13, int i14) {
        if (Build.VERSION.SDK_INT >= 29) {
            r0.b(view, context, iArr, attributeSet, typedArray, i13, i14);
        }
    }

    public static void o(View view, b bVar) {
        if (bVar == null) {
            if ((Build.VERSION.SDK_INT >= 29 ? r0.a(view) : d(view)) instanceof a) {
                bVar = new b();
            }
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f102403b);
    }

    public static void p(View view, CharSequence charSequence) {
        new h0(b5.c.tag_accessibility_pane_title, 8, 28, true ? 1 : 0).g(view, charSequence);
        i0 i0Var = f102527g;
        if (charSequence == null) {
            i0Var.f102460a.remove(view);
            view.removeOnAttachStateChangeListener(i0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(i0Var);
        } else {
            i0Var.f102460a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(i0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(i0Var);
            }
        }
    }

    public static void q(View view, ColorStateList colorStateList) {
        m0.j(view, colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        m0.k(view, mode);
    }

    public static void s(View view, boolean z13) {
        new h0(b5.c.tag_screen_reader_focusable, 0).g(view, Boolean.valueOf(z13));
    }
}
