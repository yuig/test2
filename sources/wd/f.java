package wd;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class f implements nd.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129165a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f129166b;

    public f(int i13) {
        this.f129165a = i13;
        if (i13 == 1) {
            this.f129166b = new f(2);
        } else if (i13 != 2) {
            this.f129166b = new f(2);
        } else {
            this.f129166b = new org.chromium.net.y();
        }
    }

    @Override // nd.n
    public final /* bridge */ /* synthetic */ boolean a(Object obj, nd.l lVar) {
        switch (this.f129165a) {
            case 0:
                break;
            case 1:
                break;
            default:
                o5.d.w(obj);
                break;
        }
        return true;
    }

    @Override // nd.n
    public final pd.g0 b(Object obj, int i13, int i14, nd.l lVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        int i15 = this.f129165a;
        Object obj2 = this.f129166b;
        switch (i15) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return ((f) obj2).c(createSource, i13, i14, lVar);
            case 1:
                createSource2 = ImageDecoder.createSource(he.c.b((InputStream) obj));
                return ((f) obj2).c(createSource2, i13, i14, lVar);
            default:
                return c(o5.d.g(obj), i13, i14, lVar);
        }
    }

    public final c c(ImageDecoder.Source source, int i13, int i14, nd.l lVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new vd.b(i13, i14, lVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i13 + "x" + i14 + "]");
        }
        return new c(decodeBitmap, (qd.d) this.f129166b);
    }
}
