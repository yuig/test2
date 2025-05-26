package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.v2;
import ao2.m0;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import ua.b1;
import ua.e0;
import ua.k0;
import ua.m;
import ua.y0;

/* loaded from: classes3.dex */
public class ChangeTransform extends Transition {
    public static final String[] K = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final v2 L = new v2(7, float[].class, "nonTranslations");
    public static final v2 M = new v2(8, PointF.class, "translations");
    public static final boolean N = true;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final Matrix f19828J;

    public ChangeTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = true;
        this.I = true;
        this.f19828J = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121283f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.H = !m0.N(xmlPullParser, "reparentWithOverlay") ? true : obtainStyledAttributes.getBoolean(1, true);
        this.I = m0.N(xmlPullParser, "reparent") ? obtainStyledAttributes.getBoolean(0, true) : true;
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return K;
    }

    public final void U(y0 y0Var) {
        View view = y0Var.f121378b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap hashMap = y0Var.f121377a;
        hashMap.put("android:changeTransform:parent", view.getParent());
        hashMap.put("android:changeTransform:transforms", new m(view));
        Matrix matrix = view.getMatrix();
        hashMap.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.I) {
            Matrix matrix2 = new Matrix();
            b1.f121223a.l((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            hashMap.put("android:changeTransform:parentMatrix", matrix2);
            hashMap.put("android:changeTransform:intermediateMatrix", view.getTag(e0.transition_transform));
            hashMap.put("android:changeTransform:intermediateParentMatrix", view.getTag(e0.parent_matrix));
        }
    }

    @Override // androidx.transition.Transition
    public final void j(y0 y0Var) {
        U(y0Var);
    }

    @Override // androidx.transition.Transition
    public final void m(y0 y0Var) {
        U(y0Var);
        if (N) {
            return;
        }
        View view = y0Var.f121378b;
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0312, code lost:
    
        if (ua.w.a(r15) > ua.w.a(r2)) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03cd, code lost:
    
        if (r7.size() == r1) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [t5.e] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator q(android.view.ViewGroup r26, ua.y0 r27, ua.y0 r28) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.q(android.view.ViewGroup, ua.y0, ua.y0):android.animation.Animator");
    }
}
