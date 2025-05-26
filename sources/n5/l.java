package n5;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f89230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f89231b;

    public l(m mVar, View view) {
        this.f89230a = mVar;
        this.f89231b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f89230a.f89240f.f()) {
            return false;
        }
        this.f89231b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
