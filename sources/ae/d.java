package ae;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15009b;

    public d(e eVar, View view) {
        this.f15009b = eVar;
        this.f15008a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        he.n.f().post(new androidx.appcompat.widget.j(16, this, this));
    }
}
