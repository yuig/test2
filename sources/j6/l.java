package j6;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import h6.m;

/* loaded from: classes.dex */
public final class l implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f74816a;

    public l(TransformationMethod transformationMethod) {
        this.f74816a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f74816a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || m.a().b() != 1) {
            return charSequence;
        }
        m a13 = m.a();
        a13.getClass();
        return a13.g(0, charSequence.length(), charSequence, 0);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z13, int i13, Rect rect) {
        TransformationMethod transformationMethod = this.f74816a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z13, i13, rect);
        }
    }
}
