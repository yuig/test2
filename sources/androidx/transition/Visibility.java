package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ao2.m0;
import java.util.HashMap;
import ua.b1;
import ua.e0;
import ua.k0;
import ua.l1;
import ua.m1;
import ua.n1;
import ua.x0;
import ua.y0;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public int H;

    public Visibility() {
        this.H = 3;
    }

    public static void U(y0 y0Var) {
        int visibility = y0Var.f121378b.getVisibility();
        HashMap hashMap = y0Var.f121377a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = y0Var.f121378b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ua.n1 V(ua.y0 r8, ua.y0 r9) {
        /*
            ua.n1 r0 = new ua.n1
            r0.<init>()
            r1 = 0
            r0.f121328a = r1
            r0.f121329b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f121377a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f121330c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f121332e = r6
            goto L33
        L2f:
            r0.f121330c = r3
            r0.f121332e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f121377a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f121331d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f121333f = r2
            goto L56
        L52:
            r0.f121331d = r3
            r0.f121333f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f121330c
            int r9 = r0.f121331d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f121332e
            android.view.ViewGroup r4 = r0.f121333f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f121329b = r1
            r0.f121328a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f121329b = r2
            r0.f121328a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f121333f
            if (r8 != 0) goto L81
            r0.f121329b = r1
            r0.f121328a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f121332e
            if (r8 != 0) goto L9f
            r0.f121329b = r2
            r0.f121328a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f121331d
            if (r8 != 0) goto L95
            r0.f121329b = r2
            r0.f121328a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f121330c
            if (r8 != 0) goto L9f
            r0.f121329b = r1
            r0.f121328a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.V(ua.y0, ua.y0):ua.n1");
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return I;
    }

    @Override // androidx.transition.Transition
    public final boolean D(y0 y0Var, y0 y0Var2) {
        if (y0Var == null && y0Var2 == null) {
            return false;
        }
        if (y0Var != null && y0Var2 != null && y0Var2.f121377a.containsKey("android:visibility:visibility") != y0Var.f121377a.containsKey("android:visibility:visibility")) {
            return false;
        }
        n1 V = V(y0Var, y0Var2);
        if (V.f121328a) {
            return V.f121330c == 0 || V.f121331d == 0;
        }
        return false;
    }

    public Animator W(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        return null;
    }

    public Animator X(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        return null;
    }

    public final void Y(int i13) {
        if ((i13 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.H = i13;
    }

    @Override // androidx.transition.Transition
    public void j(y0 y0Var) {
        U(y0Var);
    }

    @Override // androidx.transition.Transition
    public void m(y0 y0Var) {
        U(y0Var);
    }

    @Override // androidx.transition.Transition
    public final Animator q(ViewGroup viewGroup, y0 y0Var, y0 y0Var2) {
        View view;
        boolean z13;
        boolean z14;
        View view2;
        n1 V = V(y0Var, y0Var2);
        if (!V.f121328a) {
            return null;
        }
        if (V.f121332e == null && V.f121333f == null) {
            return null;
        }
        if (V.f121329b) {
            if ((this.H & 1) != 1 || y0Var2 == null) {
                return null;
            }
            View view3 = y0Var2.f121378b;
            if (y0Var == null) {
                View view4 = (View) view3.getParent();
                if (V(x(view4, false), B(view4, false)).f121328a) {
                    return null;
                }
            }
            return W(viewGroup, view3, y0Var, y0Var2);
        }
        int i13 = V.f121331d;
        if ((this.H & 2) != 2 || y0Var == null) {
            return null;
        }
        View view5 = y0Var2 != null ? y0Var2.f121378b : null;
        int i14 = e0.save_overlay_view;
        View view6 = y0Var.f121378b;
        View view7 = (View) view6.getTag(i14);
        if (view7 != null) {
            view2 = null;
            z14 = true;
        } else {
            if (view5 == null || view5.getParent() == null) {
                if (view5 != null) {
                    view = null;
                    z13 = false;
                }
                view5 = null;
                view = null;
                z13 = true;
            } else {
                if (i13 == 4 || view6 == view5) {
                    view = view5;
                    view5 = null;
                    z13 = false;
                }
                view5 = null;
                view = null;
                z13 = true;
            }
            if (z13) {
                if (view6.getParent() == null) {
                    z14 = false;
                    view2 = view;
                    view7 = view6;
                } else if (view6.getParent() instanceof View) {
                    View view8 = (View) view6.getParent();
                    if (V(B(view8, true), x(view8, true)).f121328a) {
                        int id3 = view8.getId();
                        if (view8.getParent() == null && id3 != -1) {
                            viewGroup.findViewById(id3);
                        }
                    } else {
                        view5 = x0.a(viewGroup, view6, view8);
                    }
                }
            }
            z14 = false;
            View view9 = view;
            view7 = view5;
            view2 = view9;
        }
        if (view7 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            b1.e(view2, 0);
            Animator X = X(viewGroup, view2, y0Var, y0Var2);
            if (X != null) {
                l1 l1Var = new l1(view2, i13);
                X.addListener(l1Var);
                y().a(l1Var);
            } else {
                b1.e(view2, visibility);
            }
            return X;
        }
        if (!z14) {
            int[] iArr = (int[]) y0Var.f121377a.get("android:visibility:screenLocation");
            int i15 = iArr[0];
            int i16 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view7.offsetLeftAndRight((i15 - iArr2[0]) - view7.getLeft());
            view7.offsetTopAndBottom((i16 - iArr2[1]) - view7.getTop());
            viewGroup.getOverlay().add(view7);
        }
        Animator X2 = X(viewGroup, view7, y0Var, y0Var2);
        if (z14) {
            return X2;
        }
        if (X2 == null) {
            viewGroup.getOverlay().remove(view7);
            return X2;
        }
        view6.setTag(e0.save_overlay_view, view7);
        m1 m1Var = new m1(this, viewGroup, view7, view6);
        X2.addListener(m1Var);
        X2.addPauseListener(m1Var);
        y().a(m1Var);
        return X2;
    }

    public Visibility(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121281d);
        int D = m0.D(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (D != 0) {
            Y(D);
        }
    }
}
