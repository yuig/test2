package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.v2;
import ao2.m0;
import java.util.HashMap;
import ua.e0;
import ua.f0;
import ua.k0;
import ua.y0;

/* loaded from: classes3.dex */
public class ChangeBounds extends Transition {

    /* renamed from: J, reason: collision with root package name */
    public static final v2 f19826J;
    public static final v2 K;
    public static final v2 L;
    public static final v2 M;
    public static final v2 N;
    public final boolean H;
    public static final String[] I = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final f0 O = new f0();

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        f19826J = new v2(1, cls, str);
        String str2 = "bottomRight";
        K = new v2(2, cls, str2);
        L = new v2(3, cls, str2);
        M = new v2(4, cls, str);
        N = new v2(5, cls, "position");
    }

    public ChangeBounds() {
        this.H = false;
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return I;
    }

    public final void U(y0 y0Var) {
        View view = y0Var.f121378b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = y0Var.f121377a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", y0Var.f121378b.getParent());
        if (this.H) {
            hashMap.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    public final void j(y0 y0Var) {
        U(y0Var);
    }

    @Override // androidx.transition.Transition
    public final void m(y0 y0Var) {
        Rect rect;
        U(y0Var);
        if (!this.H || (rect = (Rect) y0Var.f121378b.getTag(e0.transition_clip)) == null) {
            return;
        }
        y0Var.f121377a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d0  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator q(android.view.ViewGroup r25, ua.y0 r26, ua.y0 r27) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeBounds.q(android.view.ViewGroup, ua.y0, ua.y0):android.animation.Animator");
    }

    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121280c);
        boolean z13 = m0.N((XmlResourceParser) attributeSet, "resizeClip") ? obtainStyledAttributes.getBoolean(0, false) : false;
        obtainStyledAttributes.recycle();
        this.H = z13;
    }
}
