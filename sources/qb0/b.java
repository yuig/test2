package qb0;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import df.j1;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import lb0.n;
import tb0.p;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f103389a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f103390b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f103391c = new int[3];

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f103392d = new int[3];

    public static byte[] a(int i13, Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i13, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e13) {
            e13.printStackTrace();
            return null;
        }
    }

    public static Pair b(Context context, Uri uri, BitmapFactory.Options options) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            if (inputStream == null) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return null;
            }
            try {
                Pair pair = new Pair(options, BitmapFactory.decodeStream(inputStream, null, options));
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
                return pair;
            } catch (IOException unused3) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (IOException unused6) {
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r3.getMessage() == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r3.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r3.getMessage() == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r3, android.net.Uri r4, android.graphics.Bitmap r5, java.lang.String r6, java.io.File r7, boolean r8) {
        /*
            if (r4 == 0) goto Lb
            if (r5 == 0) goto L5
            goto Lb
        L5:
            r5 = 720(0x2d0, float:1.009E-42)
            android.graphics.Bitmap r5 = k(r3, r4, r5, r5)
        Lb:
            java.lang.String r0 = ""
            if (r5 != 0) goto L10
            return r0
        L10:
            if (r6 != 0) goto L21
            if (r4 == 0) goto L19
            java.lang.String r6 = r4.getLastPathSegment()
            goto L21
        L19:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = java.lang.Long.toString(r1)
        L21:
            if (r7 != 0) goto L27
            java.io.File r7 = r3.getCacheDir()
        L27:
            if (r8 == 0) goto L34
            java.lang.String r3 = "%s.jpg"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = df.j1.V(r3, r6)
            goto L3e
        L34:
            java.lang.String r3 = "%s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = df.j1.V(r3, r6)
        L3e:
            java.io.File r6 = new java.io.File
            r6.<init>(r7, r3)
            r3 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6e
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r8 = 90
            r5.compress(r3, r8, r7)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r7.flush()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            java.lang.String r0 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r7.close()     // Catch: java.io.IOException -> L5b
            goto L8d
        L5b:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            if (r4 == 0) goto L8d
        L62:
            r3.getMessage()
            goto L8d
        L66:
            r3 = move-exception
            goto L8e
        L68:
            r3 = move-exception
            goto L71
        L6a:
            r4 = move-exception
            r7 = r3
            r3 = r4
            goto L8e
        L6e:
            r5 = move-exception
            r7 = r3
            r3 = r5
        L71:
            if (r4 == 0) goto L76
            r4.getPath()     // Catch: java.lang.Throwable -> L66
        L76:
            java.lang.String r4 = r3.getMessage()     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L7f
            r3.getMessage()     // Catch: java.lang.Throwable -> L66
        L7f:
            if (r7 == 0) goto L8d
            r7.close()     // Catch: java.io.IOException -> L85
            goto L8d
        L85:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            if (r4 == 0) goto L8d
            goto L62
        L8d:
            return r0
        L8e:
            if (r7 == 0) goto L9e
            r7.close()     // Catch: java.io.IOException -> L94
            goto L9e
        L94:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L9e
            r4.getMessage()
        L9e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qb0.b.c(android.content.Context, android.net.Uri, android.graphics.Bitmap, java.lang.String, java.io.File, boolean):java.lang.String");
    }

    public static boolean d(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return false;
        }
        int height = bitmap.getHeight() - 1;
        int width = bitmap.getWidth() - 1;
        if (width < 0 || height < 0) {
            ((tb0.h) ob0.b.f93978b).q(new RuntimeException("Invalid image dimensions"), a.a.f("ImageUtils#doesImageHaveWhiteEdges: imageWidth=", width, " imageHeight=", height), p.IMAGE_LOADING);
            return false;
        }
        int i13 = width / 2;
        int[] iArr = f103391c;
        iArr[0] = 0;
        iArr[1] = i13;
        iArr[2] = width;
        int i14 = height / 2;
        int[] iArr2 = f103392d;
        iArr2[0] = 0;
        iArr2[1] = i14;
        iArr2[2] = height;
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = iArr[i15];
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = iArr2[i17];
                if (i16 != i13 || i18 != i14) {
                    i16 = Math.min(i16, width);
                    if (n(bitmap.getPixel(i16, Math.min(i18, height)))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String e(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String str2 = null;
        try {
            str = telephonyManager.getSimCountryIso();
        } catch (Exception unused) {
            str = null;
        }
        if (str != null && str.length() > 0) {
            return str;
        }
        try {
            str2 = telephonyManager.getNetworkCountryIso();
        } catch (Exception unused2) {
        }
        if (str2 != null && str2.length() > 0) {
            return str2;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "also(...)");
        return country;
    }

    public static long f() {
        return Runtime.getRuntime().freeMemory() / 1048576;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r5 = r2.outHeight;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair g(android.content.Context r5, android.net.Uri r6) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch: java.lang.Exception -> L60
            java.io.InputStream r1 = r1.openInputStream(r6)     // Catch: java.lang.Exception -> L60
            if (r1 != 0) goto L11
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.Exception -> L60
        L10:
            return r0
        L11:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L2f
            android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L2f
            int r5 = j(r5, r6)     // Catch: java.lang.Throwable -> L2f
            r4 = 90
            if (r5 == r4) goto L2a
            r4 = 270(0x10e, float:3.78E-43)
            if (r5 != r4) goto L29
            goto L2a
        L29:
            r3 = 0
        L2a:
            if (r3 == 0) goto L31
            int r5 = r2.outHeight     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r5 = move-exception
            goto L57
        L31:
            int r5 = r2.outWidth     // Catch: java.lang.Throwable -> L2f
        L33:
            if (r3 == 0) goto L38
            int r2 = r2.outWidth     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L38:
            int r2 = r2.outHeight     // Catch: java.lang.Throwable -> L2f
        L3a:
            r3 = -1
            if (r5 == r3) goto L50
            if (r2 == r3) goto L50
            android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L2f
            r1.close()     // Catch: java.lang.Exception -> L60
            return r6
        L50:
            r6.getPath()     // Catch: java.lang.Throwable -> L2f
            r1.close()     // Catch: java.lang.Exception -> L60
            return r0
        L57:
            r1.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Exception -> L60
        L5f:
            throw r5     // Catch: java.lang.Exception -> L60
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qb0.b.g(android.content.Context, android.net.Uri):android.util.Pair");
    }

    public static int h() {
        int i13 = f103389a;
        if (i13 != -1) {
            return i13;
        }
        int f13 = ((lb0.b) n.b()).f("PREF_MAX_TEXTURE_SIZE", 2048);
        f103390b = f13;
        return f13;
    }

    public static String i(FragmentActivity fragmentActivity, Uri uri) {
        Cursor cursor = null;
        String string = null;
        try {
            Cursor query = fragmentActivity.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                    query.moveToFirst();
                    string = query.getString(columnIndexOrThrow);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return string;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int j(android.content.Context r2, android.net.Uri r3) {
        /*
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = pk.a0.N(r0, r1)
            r1 = 0
            if (r0 == 0) goto L32
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            k6.g r3 = new k6.g     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L2c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L2c
            r2.close()     // Catch: java.io.IOException -> L1d
        L1d:
            r1 = r3
            goto L48
        L1f:
            r3 = move-exception
            r1 = r2
            goto L26
        L22:
            r3 = move-exception
            goto L26
        L24:
            r2 = r1
            goto L2c
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
        L2b:
            throw r3
        L2c:
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.io.IOException -> L48
            goto L48
        L32:
            java.lang.String r2 = r3.getScheme()
            java.lang.String r0 = "file"
            boolean r2 = pk.a0.N(r2, r0)
            if (r2 == 0) goto L48
            k6.g r2 = new k6.g     // Catch: java.io.IOException -> L48
            java.lang.String r3 = r3.getPath()     // Catch: java.io.IOException -> L48
            r2.<init>(r3)     // Catch: java.io.IOException -> L48
            r1 = r2
        L48:
            r2 = 0
            if (r1 == 0) goto L64
            java.lang.String r3 = "Orientation"
            r0 = 1
            int r3 = r1.f(r0, r3)
            r0 = 6
            if (r3 != r0) goto L58
            r2 = 90
            goto L64
        L58:
            r0 = 3
            if (r3 != r0) goto L5e
            r2 = 180(0xb4, float:2.52E-43)
            goto L64
        L5e:
            r0 = 8
            if (r3 != r0) goto L64
            r2 = 270(0x10e, float:3.78E-43)
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qb0.b.j(android.content.Context, android.net.Uri):int");
    }

    public static Bitmap k(Context context, Uri uri, int i13, int i14) {
        Object obj;
        Object obj2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inDensity = 0;
        options.inPurgeable = true;
        options.inInputShareable = true;
        Pair b13 = b(context, uri, options);
        if (b13 != null && (obj = b13.first) != null) {
            BitmapFactory.Options options2 = (BitmapFactory.Options) obj;
            float f13 = options2.outWidth;
            int i15 = 0;
            for (float f14 = options2.outHeight; f13 >= i13 && f14 >= i14; f14 /= 2.0f) {
                i15 = i15 == 0 ? 1 : i15 * 2;
                f13 /= 2.0f;
            }
            BitmapFactory.Options options3 = new BitmapFactory.Options();
            options3.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options3.inDensity = 0;
            options3.inPurgeable = true;
            options3.inInputShareable = true;
            options3.inSampleSize = i15;
            Pair b14 = b(context, uri, options3);
            if (b14 != null && (obj2 = b14.second) != null) {
                Bitmap bitmap = (Bitmap) obj2;
                int j13 = j(context, uri);
                if (j13 == 0) {
                    return bitmap;
                }
                Matrix matrix = new Matrix();
                matrix.preRotate(j13);
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return createBitmap;
                } catch (NullPointerException | OutOfMemoryError e13) {
                    if (e13.getMessage() == null) {
                        return bitmap;
                    }
                    e13.getMessage();
                    return bitmap;
                }
            }
        }
        return null;
    }

    public static void l(Canvas canvas) {
        if (f103389a == -1) {
            int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
            f103389a = maximumBitmapHeight;
            if (maximumBitmapHeight != f103390b) {
                ((lb0.b) n.b()).l("PREF_MAX_TEXTURE_SIZE", f103389a);
                f103390b = f103389a;
            }
        }
    }

    public static boolean m(Integer num, Integer num2) {
        int h10 = h();
        return num2 == null || num.intValue() > h10 || num2.intValue() > h10;
    }

    public static boolean n(int i13) {
        return Color.red(i13) >= 210 && Color.blue(i13) >= 210 && Color.green(i13) >= 210;
    }

    public static final boolean o(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean p(Collection collection) {
        return !o(collection);
    }

    public static File q(Bitmap bitmap, String str, File file) {
        BufferedOutputStream bufferedOutputStream;
        File file2;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            file2 = new File(file, j1.V("%s.png", str));
            fileOutputStream = new FileOutputStream(file2);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        } catch (IOException unused) {
            bufferedOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            fileOutputStream.close();
            bufferedOutputStream.close();
            bitmap.recycle();
            try {
                bufferedOutputStream.close();
            } catch (Exception unused2) {
            }
            return file2;
        } catch (IOException unused3) {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }
}
