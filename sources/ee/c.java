package ee;

import android.graphics.drawable.Drawable;
import de.k;
import he.n;

/* loaded from: classes3.dex */
public abstract class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f58757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58758b;

    /* renamed from: c, reason: collision with root package name */
    public de.c f58759c;

    public c() {
        if (!n.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f58757a = Integer.MIN_VALUE;
        this.f58758b = Integer.MIN_VALUE;
    }

    @Override // ee.i
    public final de.c K0() {
        return this.f58759c;
    }

    @Override // ee.i
    public final void Z(de.c cVar) {
        this.f58759c = cVar;
    }

    @Override // ae.i
    public final void b() {
    }

    @Override // ee.i
    public final void g(h hVar) {
    }

    @Override // ee.i
    public void j(Drawable drawable) {
    }

    @Override // ee.i
    public final void k(h hVar) {
        ((k) hVar).p(this.f58757a, this.f58758b);
    }

    @Override // ae.i
    public final void onDestroy() {
    }

    @Override // ee.i
    public void s(Drawable drawable) {
    }

    @Override // ae.i
    public final void x() {
    }
}
