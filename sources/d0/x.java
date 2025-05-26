package d0;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.camera.core.ImageProcessingUtil;
import c0.j0;
import c0.m0;
import c0.n0;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class x implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f53580a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53581b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53582c;

    /* renamed from: d, reason: collision with root package name */
    public m0[] f53583d;

    /* renamed from: e, reason: collision with root package name */
    public final w f53584e;

    public x(l0.b bVar) {
        Bitmap bitmap = (Bitmap) bVar.f81194a;
        long h10 = bVar.f81201h.h();
        com.bumptech.glide.d.g("Only accept Bitmap with ARGB_8888 format for now.", bitmap.getConfig() == Bitmap.Config.ARGB_8888);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.d(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f53580a = new Object();
        this.f53581b = width;
        this.f53582c = height;
        this.f53584e = new w(h10);
        allocateDirect.rewind();
        this.f53583d = new m0[]{new v(width * 4, allocateDirect)};
    }

    @Override // c0.n0
    public final j0 H1() {
        w wVar;
        synchronized (this.f53580a) {
            a();
            wVar = this.f53584e;
        }
        return wVar;
    }

    @Override // c0.n0
    public final int S0() {
        synchronized (this.f53580a) {
            a();
        }
        return 1;
    }

    @Override // c0.n0
    public final m0[] W0() {
        m0[] m0VarArr;
        synchronized (this.f53580a) {
            a();
            m0[] m0VarArr2 = this.f53583d;
            Objects.requireNonNull(m0VarArr2);
            m0VarArr = m0VarArr2;
        }
        return m0VarArr;
    }

    public final void a() {
        synchronized (this.f53580a) {
            com.bumptech.glide.d.v("The image is closed.", this.f53583d != null);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f53580a) {
            a();
            this.f53583d = null;
        }
    }

    @Override // c0.n0
    public final Image getImage() {
        synchronized (this.f53580a) {
            a();
        }
        return null;
    }

    @Override // c0.n0
    public final int i() {
        int i13;
        synchronized (this.f53580a) {
            a();
            i13 = this.f53582c;
        }
        return i13;
    }

    @Override // c0.n0
    public final int j() {
        int i13;
        synchronized (this.f53580a) {
            a();
            i13 = this.f53581b;
        }
        return i13;
    }
}
