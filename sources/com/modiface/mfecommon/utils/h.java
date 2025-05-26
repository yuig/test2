package com.modiface.mfecommon.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34315a = "MFEGeneralUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f34316b = new i0();

    /* renamed from: c, reason: collision with root package name */
    private static final int f34317c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public static final char f34318d = '.';

    /* renamed from: e, reason: collision with root package name */
    private static final char f34319e = '/';

    /* renamed from: f, reason: collision with root package name */
    private static final char f34320f = '\\';

    public static boolean a() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    public static void a(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static boolean a(Bitmap bitmap) {
        return bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || bitmap.getConfig() != Bitmap.Config.ARGB_8888;
    }

    public static Bitmap a(int i13, int i14, Bitmap.Config config) {
        if (config == null) {
            Log.w(f34315a, "Bitmap config is null. Setting it to default ARGB_8888");
            config = Bitmap.Config.ARGB_8888;
        }
        if (i13 <= 0) {
            throw new IllegalArgumentException("width must be > 0: given " + i13);
        }
        if (i14 > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(i13, i14, config);
            if (createBitmap != null) {
                return createBitmap;
            }
            throw new OutOfMemoryError("Echoing silent out of memory error");
        }
        throw new IllegalArgumentException("height must be > 0: given " + i14);
    }

    public static int a(Context context, int i13) {
        return Math.round(i13 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static RectF a(float f13, float f14, float f15, float f16) {
        if (Math.round(f13) <= 0 || Math.round(f14) <= 0 || Math.round(f15) <= 0 || Math.round(f16) <= 0) {
            return new RectF();
        }
        float f17 = f15 / f16;
        if (f13 / f14 >= f17) {
            float f18 = f17 * f14;
            float f19 = (f13 - f18) / 2.0f;
            return new RectF(f19, 0.0f, f18 + f19, f14);
        }
        float f23 = f13 / f17;
        float f24 = (f14 - f23) / 2.0f;
        return new RectF(0.0f, f24, f13, f23 + f24);
    }

    public static Rect a(int i13, int i14, int i15, int i16) {
        if (i13 <= 0 || i14 <= 0 || i15 <= 0 || i16 <= 0) {
            return new Rect();
        }
        float f13 = i13 / i14;
        float f14 = i15;
        float f15 = i16;
        if (f13 >= f14 / f15) {
            int round = Math.round(f14 / f13);
            int i17 = (i16 - round) / 2;
            return new Rect(0, i17, i15, round + i17);
        }
        int round2 = Math.round(f15 * f13);
        int i18 = (i15 - round2) / 2;
        return new Rect(i18, 0, round2 + i18, i16);
    }

    public static float[] a(RectF rectF, int i13, int i14) {
        if (i13 > 0 && i14 > 0) {
            float f13 = i13;
            float f14 = rectF.left / f13;
            float f15 = i14;
            float f16 = rectF.top / f15;
            float f17 = rectF.right / f13;
            float f18 = rectF.bottom / f15;
            return new float[]{f14, f18, f17, f18, f14, f16, f17, f16};
        }
        throw new IllegalArgumentException("Cannot convert rect to texture coordinate when the width or height is less than or equal to zero");
    }

    public static float[] a(Rect rect, int i13, int i14) {
        if (i13 > 0 && i14 > 0) {
            float f13 = i13;
            float f14 = ((rect.left / f13) * 2.0f) - 1.0f;
            float f15 = i14;
            float f16 = ((rect.top / f15) * 2.0f) - 1.0f;
            float f17 = ((rect.right / f13) * 2.0f) - 1.0f;
            float f18 = ((rect.bottom / f15) * 2.0f) - 1.0f;
            return new float[]{f14, f16, f17, f16, f14, f18, f17, f18};
        }
        throw new IllegalArgumentException("Cannot convert rect to vertices when the width or height is less than or equal to zero");
    }

    public static String a(Exception exc) {
        String str;
        str = "";
        if (exc == null) {
            return "";
        }
        try {
            String obj = exc.toString();
            str = obj != null ? obj.concat("\n") : "";
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            exc.printStackTrace(printWriter);
            printWriter.flush();
            str = str + stringWriter.toString();
            printWriter.close();
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean a(File file) {
        File[] listFiles;
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public static long a(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        byte[] bArr = new byte[f34317c];
        long j13 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j13;
            }
            outputStream.write(bArr, 0, read);
            j13 += read;
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf >= 0 && str.lastIndexOf(47) <= lastIndexOf && str.lastIndexOf(92) <= lastIndexOf) ? str.substring(lastIndexOf + 1) : "";
    }

    public static <T> T a(Future<T> future) {
        try {
            return future.get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
