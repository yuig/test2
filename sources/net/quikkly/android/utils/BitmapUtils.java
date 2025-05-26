package net.quikkly.android.utils;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Pair;
import bp2.a;

/* loaded from: classes4.dex */
public class BitmapUtils {
    public static final int BITMAP_TO_JPEG_QUALITY = 85;
    public static final int BITMAP_TO_JPEG_SIZE = 512;

    public static byte[] argbPixelsToRgbaBytes(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        byte[] bArr = new byte[length * 4];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 4;
            int i15 = iArr[i13];
            bArr[i14] = (byte) ((i15 >> 16) & 255);
            bArr[i14 + 1] = (byte) ((i15 >> 8) & 255);
            bArr[i14 + 2] = (byte) (i15 & 255);
            bArr[i14 + 3] = (byte) ((i15 >> 24) & 255);
        }
        return bArr;
    }

    public static String bitmapToDataUri(Bitmap bitmap) {
        float min = Math.min(512.0f / bitmap.getWidth(), 512.0f / bitmap.getHeight());
        if (min > 1.0f) {
            min = 1.0f;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * min), Math.round(min * bitmap.getHeight()), true);
        a aVar = new a();
        if (!createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 85, aVar)) {
            throw new IllegalArgumentException("Unable to compress bitmap to JPEG image data.");
        }
        return "data:image/jpeg;base64," + Base64.encodeToString(aVar.c(), 0);
    }

    public static Pair<byte[], Pair<Integer, Integer>> bitmapToRGBA(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return new Pair<>(argbPixelsToRgbaBytes(iArr), new Pair(Integer.valueOf(width), Integer.valueOf(height)));
    }
}
