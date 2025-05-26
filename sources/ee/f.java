package ee;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import de.k;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class f implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final int f58766c = com.bumptech.glide.i.glide_custom_view_target_tag;

    /* renamed from: a, reason: collision with root package name */
    public final e f58767a;

    /* renamed from: b, reason: collision with root package name */
    public final View f58768b;

    public f(ImageView imageView) {
        d7.b.p(imageView, "Argument must not be null");
        this.f58768b = imageView;
        this.f58767a = new e(imageView);
    }

    @Override // ee.i
    public final de.c K0() {
        Object tag = this.f58768b.getTag(f58766c);
        if (tag == null) {
            return null;
        }
        if (tag instanceof de.c) {
            return (de.c) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // ee.i
    public final void Z(de.c cVar) {
        this.f58768b.setTag(f58766c, cVar);
    }

    @Override // ae.i
    public final void b() {
    }

    @Override // ee.i
    public final void g(h hVar) {
        this.f58767a.f58764b.remove(hVar);
    }

    @Override // ee.i
    public final void j(Drawable drawable) {
    }

    @Override // ee.i
    public final void k(h hVar) {
        e eVar = this.f58767a;
        View view = eVar.f58763a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a13 = eVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = eVar.f58763a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int a14 = eVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a13 > 0 || a13 == Integer.MIN_VALUE) && (a14 > 0 || a14 == Integer.MIN_VALUE)) {
            ((k) hVar).p(a13, a14);
            return;
        }
        ArrayList arrayList = eVar.f58764b;
        if (!arrayList.contains(hVar)) {
            arrayList.add(hVar);
        }
        if (eVar.f58765c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            d dVar = new d(eVar);
            eVar.f58765c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // ee.i
    public final void m(Drawable drawable) {
        e eVar = this.f58767a;
        ViewTreeObserver viewTreeObserver = eVar.f58763a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.f58765c);
        }
        eVar.f58765c = null;
        eVar.f58764b.clear();
    }

    @Override // ae.i
    public final void onDestroy() {
    }

    public final String toString() {
        return "Target for: " + this.f58768b;
    }

    @Override // ae.i
    public final void x() {
    }
}
