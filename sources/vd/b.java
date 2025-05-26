package vd;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import nd.k;
import nd.l;
import wd.m;
import wd.o;
import wd.u;

/* loaded from: classes3.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final u f125610a = u.b();

    /* renamed from: b, reason: collision with root package name */
    public final int f125611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125612c;

    /* renamed from: d, reason: collision with root package name */
    public final nd.b f125613d;

    /* renamed from: e, reason: collision with root package name */
    public final m f125614e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125615f;

    /* renamed from: g, reason: collision with root package name */
    public final nd.m f125616g;

    public b(int i13, int i14, l lVar) {
        this.f125611b = i13;
        this.f125612c = i14;
        this.f125613d = (nd.b) lVar.c(o.f129190f);
        this.f125614e = (m) lVar.c(m.f129188f);
        k kVar = o.f129193i;
        this.f125615f = lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue();
        this.f125616g = (nd.m) lVar.c(o.f129191g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        if (this.f125610a.e(this.f125611b, this.f125612c, this.f125615f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f125613d == nd.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i13 = this.f125611b;
        if (i13 == Integer.MIN_VALUE) {
            i13 = size.getWidth();
        }
        int i14 = this.f125612c;
        if (i14 == Integer.MIN_VALUE) {
            i14 = size.getHeight();
        }
        float b13 = this.f125614e.b(size.getWidth(), size.getHeight(), i13, i14);
        int round = Math.round(size.getWidth() * b13);
        int round2 = Math.round(size.getHeight() * b13);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b13);
        }
        imageDecoder.setTargetSize(round, round2);
        nd.m mVar = this.f125616g;
        if (mVar != null) {
            if (Build.VERSION.SDK_INT < 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            if (mVar == nd.m.DISPLAY_P3) {
                colorSpace = imageInfo.getColorSpace();
                if (colorSpace != null) {
                    colorSpace2 = imageInfo.getColorSpace();
                    if (colorSpace2.isWideGamut()) {
                        named = ColorSpace.Named.DISPLAY_P3;
                        imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                    }
                }
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
