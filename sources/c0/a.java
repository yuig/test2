package c0;

import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class a implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Image.Plane f24193a;

    public a(Image.Plane plane) {
        this.f24193a = plane;
    }

    @Override // c0.m0
    public final ByteBuffer l() {
        return this.f24193a.getBuffer();
    }

    @Override // c0.m0
    public final int m() {
        return this.f24193a.getRowStride();
    }

    @Override // c0.m0
    public final int n() {
        return this.f24193a.getPixelStride();
    }
}
