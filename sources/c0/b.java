package c0;

import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.impl.u2;

/* loaded from: classes2.dex */
public final class b implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Image f24197a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f24198b;

    /* renamed from: c, reason: collision with root package name */
    public final g f24199c;

    public b(Image image) {
        this.f24197a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f24198b = new a[planes.length];
            for (int i13 = 0; i13 < planes.length; i13++) {
                this.f24198b[i13] = new a(planes[i13]);
            }
        } else {
            this.f24198b = new a[0];
        }
        this.f24199c = new g(u2.f16976b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // c0.n0
    public final j0 H1() {
        return this.f24199c;
    }

    @Override // c0.n0
    public final int S0() {
        return this.f24197a.getFormat();
    }

    @Override // c0.n0
    public final m0[] W0() {
        return this.f24198b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f24197a.close();
    }

    @Override // c0.n0
    public final Image getImage() {
        return this.f24197a;
    }

    @Override // c0.n0
    public final int i() {
        return this.f24197a.getHeight();
    }

    @Override // c0.n0
    public final int j() {
        return this.f24197a.getWidth();
    }
}
