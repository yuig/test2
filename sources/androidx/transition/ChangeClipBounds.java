package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.HashMap;
import ua.b1;
import ua.e0;
import ua.f;
import ua.f0;
import ua.y0;

/* loaded from: classes3.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] H = {"android:clipBounds:clip"};
    public static final Rect I = new Rect();

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void U(y0 y0Var, boolean z13) {
        View view = y0Var.f121378b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rect = z13 ? (Rect) view.getTag(e0.transition_clip) : null;
        if (rect == null) {
            rect = view.getClipBounds();
        }
        Rect rect2 = rect != I ? rect : null;
        HashMap hashMap = y0Var.f121377a;
        hashMap.put("android:clipBounds:clip", rect2);
        if (rect2 == null) {
            hashMap.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return H;
    }

    @Override // androidx.transition.Transition
    public final void j(y0 y0Var) {
        U(y0Var, false);
    }

    @Override // androidx.transition.Transition
    public final void m(y0 y0Var) {
        U(y0Var, true);
    }

    @Override // androidx.transition.Transition
    public final Animator q(ViewGroup viewGroup, y0 y0Var, y0 y0Var2) {
        if (y0Var != null && y0Var2 != null) {
            HashMap hashMap = y0Var.f121377a;
            if (hashMap.containsKey("android:clipBounds:clip")) {
                HashMap hashMap2 = y0Var2.f121377a;
                if (hashMap2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) hashMap.get("android:clipBounds:clip");
                    Rect rect2 = (Rect) hashMap2.get("android:clipBounds:clip");
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    Rect rect3 = rect == null ? (Rect) hashMap.get("android:clipBounds:bounds") : rect;
                    Rect rect4 = rect2 == null ? (Rect) hashMap2.get("android:clipBounds:bounds") : rect2;
                    if (rect3.equals(rect4)) {
                        return null;
                    }
                    View view = y0Var2.f121378b;
                    view.setClipBounds(rect);
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, b1.f121225c, new f0(0, new Rect()), rect3, rect4);
                    f fVar = new f(view, rect, rect2);
                    ofObject.addListener(fVar);
                    a(fVar);
                    return ofObject;
                }
            }
        }
        return null;
    }
}
