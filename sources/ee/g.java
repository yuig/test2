package ee;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import de.k;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class g extends a implements fe.c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f58769d = com.bumptech.glide.i.glide_custom_view_target_tag;

    /* renamed from: a, reason: collision with root package name */
    public final View f58770a;

    /* renamed from: b, reason: collision with root package name */
    public final j f58771b;

    /* renamed from: c, reason: collision with root package name */
    public Animatable f58772c;

    public g(ImageView imageView) {
        d7.b.p(imageView, "Argument must not be null");
        this.f58770a = imageView;
        this.f58771b = new j(imageView);
    }

    @Override // ee.i
    /* renamed from: K0 */
    public final de.c getE() {
        Object tag = this.f58770a.getTag(f58769d);
        if (tag == null) {
            return null;
        }
        if (tag instanceof de.c) {
            return (de.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // ee.i
    public final void Z(de.c cVar) {
        this.f58770a.setTag(f58769d, cVar);
    }

    public final void a(Object obj) {
        b bVar = (b) this;
        int i13 = bVar.f58756e;
        View view = bVar.f58770a;
        switch (i13) {
            case 0:
                ((ImageView) view).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) view).setImageDrawable((Drawable) obj);
                break;
        }
        if (!(obj instanceof Animatable)) {
            this.f58772c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f58772c = animatable;
        animatable.start();
    }

    @Override // ae.i
    public final void b() {
        Animatable animatable = this.f58772c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f58770a;
    }

    @Override // ee.i
    public final void g(h hVar) {
        this.f58771b.f58775b.remove(hVar);
    }

    @Override // ee.i
    public final void j(Drawable drawable) {
        a(null);
        ((ImageView) this.f58770a).setImageDrawable(drawable);
    }

    @Override // ee.i
    public final void k(h hVar) {
        j jVar = this.f58771b;
        View view = jVar.f58774a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a13 = jVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = jVar.f58774a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int a14 = jVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a13 > 0 || a13 == Integer.MIN_VALUE) && (a14 > 0 || a14 == Integer.MIN_VALUE)) {
            ((k) hVar).p(a13, a14);
            return;
        }
        ArrayList arrayList = jVar.f58775b;
        if (!arrayList.contains(hVar)) {
            arrayList.add(hVar);
        }
        if (jVar.f58776c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            d dVar = new d(jVar);
            jVar.f58776c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // ee.i
    public final void m(Drawable drawable) {
        j jVar = this.f58771b;
        ViewTreeObserver viewTreeObserver = jVar.f58774a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(jVar.f58776c);
        }
        jVar.f58776c = null;
        jVar.f58775b.clear();
        Animatable animatable = this.f58772c;
        if (animatable != null) {
            animatable.stop();
        }
        a(null);
        ((ImageView) this.f58770a).setImageDrawable(drawable);
    }

    @Override // ee.i
    public final void s(Drawable drawable) {
        a(null);
        ((ImageView) this.f58770a).setImageDrawable(drawable);
    }

    @Override // ae.i
    public final void x() {
        Animatable animatable = this.f58772c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // ee.i
    public final void z(Object obj, fe.d dVar) {
        if (dVar == null || !dVar.a(obj, this)) {
            a(obj);
        } else {
            if (!(obj instanceof Animatable)) {
                this.f58772c = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.f58772c = animatable;
            animatable.start();
        }
    }
}
