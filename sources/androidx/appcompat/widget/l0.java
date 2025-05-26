package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l0 extends ue.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f16627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextHelper f16628d;

    public l0(AppCompatTextHelper appCompatTextHelper, int i13, int i14, WeakReference weakReference) {
        this.f16628d = appCompatTextHelper;
        this.f16625a = i13;
        this.f16626b = i14;
        this.f16627c = weakReference;
    }

    @Override // ue.c
    public final void C(int i13) {
    }

    @Override // ue.c
    public final void D(Typeface typeface) {
        int i13;
        if (Build.VERSION.SDK_INT >= 28 && (i13 = this.f16625a) != -1) {
            typeface = p0.a(typeface, i13, (this.f16626b & 2) != 0);
        }
        Typeface typeface2 = typeface;
        AppCompatTextHelper appCompatTextHelper = this.f16628d;
        if (appCompatTextHelper.f16342m) {
            appCompatTextHelper.f16341l = typeface2;
            TextView textView = (TextView) this.f16627c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new m0(appCompatTextHelper, textView, typeface2, appCompatTextHelper.f16339j, 0));
                } else {
                    textView.setTypeface(typeface2, appCompatTextHelper.f16339j);
                }
            }
        }
    }
}
