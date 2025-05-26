package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import c0.a0;
import c0.c1;
import c0.e1;
import c0.l0;
import c0.n0;
import com.bumptech.glide.d;
import java.nio.ByteBuffer;
import java.util.Locale;
import kh2.m0;

/* loaded from: classes2.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    public static int f16788a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static n0 a(c1 c1Var, byte[] bArr) {
        d.h(c1Var.m() == 256);
        bArr.getClass();
        Surface z13 = c1Var.z();
        z13.getClass();
        if (nativeWriteJpegToSurface(bArr, z13) != 0) {
            m0.s("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        n0 l13 = c1Var.l();
        if (l13 == null) {
            m0.s("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return l13;
    }

    public static Bitmap b(n0 n0Var) {
        if (n0Var.S0() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int j13 = n0Var.j();
        int i13 = n0Var.i();
        int m13 = n0Var.W0()[0].m();
        int m14 = n0Var.W0()[1].m();
        int m15 = n0Var.W0()[2].m();
        int n13 = n0Var.W0()[0].n();
        int n14 = n0Var.W0()[1].n();
        Bitmap createBitmap = Bitmap.createBitmap(n0Var.j(), n0Var.i(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(n0Var.W0()[0].l(), m13, n0Var.W0()[1].l(), m14, n0Var.W0()[2].l(), m15, n13, n14, createBitmap, createBitmap.getRowBytes(), j13, i13) == 0) {
            return createBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static e1 c(final n0 n0Var, c1 c1Var, ByteBuffer byteBuffer, int i13) {
        if (n0Var.S0() != 35 || n0Var.W0().length != 3) {
            m0.s("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i13 != 0 && i13 != 90 && i13 != 180 && i13 != 270) {
            m0.s("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if ((nativeConvertAndroid420ToABGR(n0Var.W0()[0].l(), n0Var.W0()[0].m(), n0Var.W0()[1].l(), n0Var.W0()[1].m(), n0Var.W0()[2].l(), n0Var.W0()[2].m(), n0Var.W0()[0].n(), n0Var.W0()[1].n(), c1Var.z(), byteBuffer, n0Var.j(), n0Var.i(), 0, 0, 0, i13) != 0 ? l0.ERROR_CONVERSION : l0.SUCCESS) == l0.ERROR_CONVERSION) {
            m0.s("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            m0.p("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + f16788a);
            f16788a = f16788a + 1;
        }
        final n0 l13 = c1Var.l();
        if (l13 == null) {
            m0.s("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        e1 e1Var = new e1(l13);
        e1Var.a(new a0() { // from class: c0.k0
            @Override // c0.a0
            public final void a(n0 n0Var2) {
                n0 n0Var3;
                int i14 = ImageProcessingUtil.f16788a;
                if (n0.this == null || (n0Var3 = n0Var) == null) {
                    return;
                }
                n0Var3.close();
            }
        });
        return e1Var;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i13) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i13, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i13) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i13, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            m0.s("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(@NonNull ByteBuffer byteBuffer, int i13, @NonNull ByteBuffer byteBuffer2, int i14, @NonNull ByteBuffer byteBuffer3, int i15, int i16, int i17, Surface surface, ByteBuffer byteBuffer4, int i18, int i19, int i23, int i24, int i25, int i26);

    private static native int nativeConvertAndroid420ToBitmap(@NonNull ByteBuffer byteBuffer, int i13, @NonNull ByteBuffer byteBuffer2, int i14, @NonNull ByteBuffer byteBuffer3, int i15, int i16, int i17, @NonNull Bitmap bitmap, int i18, int i19, int i23);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i13, int i14, int i15, int i16, boolean z13);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);
}
