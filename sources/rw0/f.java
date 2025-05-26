package rw0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Pair;
import df.f0;
import df.j1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import m60.a0;
import m60.x0;
import tb0.g;
import tb0.h;
import tb0.p;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f110112b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f110113c = new f0(6);

    /* renamed from: a, reason: collision with root package name */
    public String f110114a;

    public static Uri a(Context context, Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        h hVar;
        File file = e().f110108a;
        Uri uri = null;
        if (file == null) {
            return null;
        }
        File file2 = new File(file.toString(), a.a.C(str, ".jpg"));
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
            fileOutputStream.flush();
            MediaStore.Images.Media.insertImage(context.getContentResolver(), file2.getAbsolutePath(), file2.getName(), file2.getName());
            uri = Uri.fromFile(file2);
            try {
                fileOutputStream.close();
            } catch (Exception e13) {
                e = e13;
                HashSet hashSet = h.f117076w;
                hVar = g.f117075a;
                hVar.q(e, "", p.MEDIA_GALLERY);
                bitmap.recycle();
                return uri;
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                HashSet hashSet2 = h.f117076w;
                g.f117075a.q(th, "", p.MEDIA_GALLERY);
                c0.d.z2(bitmap);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e14) {
                        e = e14;
                        hVar = g.f117075a;
                        hVar.q(e, "", p.MEDIA_GALLERY);
                        bitmap.recycle();
                        return uri;
                    }
                }
                bitmap.recycle();
                return uri;
            } catch (Throwable th5) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e15) {
                        HashSet hashSet3 = h.f117076w;
                        g.f117075a.q(e15, "", p.MEDIA_GALLERY);
                    }
                }
                bitmap.recycle();
                throw th5;
            }
        }
        bitmap.recycle();
        return uri;
    }

    public static void b(Uri uri) {
        a0 h10 = h();
        h10.put(uri.toString(), Long.valueOf(System.currentTimeMillis()));
        lb0.g.h("SILENCED_SCREENSHOT", h10);
    }

    public static boolean c(File file, f0 f0Var) {
        String absolutePath = file.getAbsolutePath();
        long lastModified = file.lastModified();
        HashMap hashMap = f110112b;
        if (hashMap.containsKey(absolutePath)) {
            Pair pair = (Pair) hashMap.get(absolutePath);
            if (lastModified == ((Long) pair.first).longValue()) {
                return ((Boolean) pair.second).booleanValue();
            }
        }
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        boolean z13 = false;
        for (String str : list) {
            z13 = f0Var.accept(file, str);
            if (z13) {
                break;
            }
        }
        hashMap.put(absolutePath, new Pair(Long.valueOf(lastModified), Boolean.valueOf(z13)));
        return z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File d(android.content.Context r8, android.net.Uri r9, java.lang.String r10, android.graphics.RectF r11, android.graphics.RectF r12) {
        /*
            android.content.ContentResolver r0 = r8.getContentResolver()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L24
        L9:
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch: java.lang.OutOfMemoryError -> L12 java.io.IOException -> L14
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r0, r9)     // Catch: java.lang.OutOfMemoryError -> L12 java.io.IOException -> L14
            goto L24
        L12:
            r0 = move-exception
            goto L16
        L14:
            r0 = move-exception
            goto L20
        L16:
            java.util.HashSet r2 = tb0.h.f117076w
            tb0.h r2 = tb0.g.f117075a
            java.lang.String r3 = "Failed to allocate memory in CameraBitmapUtil"
            r2.o(r3, r0)
            goto L7
        L20:
            r0.getMessage()
            goto L7
        L24:
            if (r0 == 0) goto L2e
            java.lang.String r2 = r9.getPath()
            android.graphics.Bitmap r0 = c0.d.p2(r0, r2)
        L2e:
            if (r0 != 0) goto L31
            goto L6f
        L31:
            float r1 = r12.width()
            float r2 = r12.height()
            float r3 = r11.left
            float r4 = r12.left
            float r3 = r3 - r4
            float r4 = r11.top
            float r12 = r12.top
            float r4 = r4 - r12
            float r12 = r11.width()
            float r11 = r11.height()
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r5 / r1
            float r2 = r5 / r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            int r7 = r0.getHeight()
            float r7 = (float) r7
            float r3 = r3 * r1
            float r3 = r3 / r5
            float r3 = r3 * r6
            float r4 = r4 * r2
            float r4 = r4 / r5
            float r4 = r4 * r7
            float r1 = r1 * r12
            float r1 = r1 / r5
            float r1 = r1 * r6
            float r2 = r2 * r11
            float r2 = r2 / r5
            float r2 = r2 * r7
            int r11 = (int) r3
            int r12 = (int) r4
            int r1 = (int) r1
            int r2 = (int) r2
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r11, r12, r1, r2)
        L6f:
            java.io.File r11 = new java.io.File
            r7 = 1
            r6 = 0
            r2 = r8
            r3 = r9
            r4 = r1
            r5 = r10
            java.lang.String r8 = qb0.b.c(r2, r3, r4, r5, r6, r7)
            r11.<init>(r8)
            if (r1 == 0) goto L83
            r1.recycle()
        L83:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rw0.f.d(android.content.Context, android.net.Uri, java.lang.String, android.graphics.RectF, android.graphics.RectF):java.io.File");
    }

    public static d e() {
        d dVar = new d();
        dVar.f110108a = null;
        dVar.f110109b = null;
        if (Environment.getExternalStorageState().equals("mounted")) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            String str = File.separator;
            Context context = kb0.a.f79058b;
            dVar.f110108a = new File(externalStoragePublicDirectory, j1.V("100PINT%s%s", str, m60.f0.W().getResources().getString(x0.pins)));
        } else {
            dVar.f110109b = c.MEDIA_NOT_MOUNTED;
        }
        File file = dVar.f110108a;
        if (file != null && !file.exists() && !dVar.f110108a.mkdirs()) {
            dVar.f110109b = c.DIRECTORY_CANNOT_BE_CREATED;
        }
        return dVar;
    }

    public static f f() {
        return e.f110110a;
    }

    public static a0 h() {
        Object f13 = lb0.g.f("SILENCED_SCREENSHOT");
        return f13 != null ? (a0) f13 : new a0();
    }

    public static Bitmap i(int i13, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int max = Math.max(width, height);
        if (max <= i13) {
            return bitmap;
        }
        float f13 = (i13 * 1.0f) / max;
        return Bitmap.createScaledBitmap(bitmap, Math.round(width * f13), Math.round(f13 * height), true);
    }

    public static String j(File file) {
        boolean contains = file.getName().toLowerCase().contains("screenshot");
        f0 f0Var = f110113c;
        if (contains && c(file, f0Var)) {
            return file.getAbsolutePath();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory() && !file2.isHidden() && file2.getName().toLowerCase().contains("screenshot") && c(file2, f0Var)) {
                return file2.getAbsolutePath();
            }
        }
        return null;
    }

    public final String g() {
        if (this.f110114a == null) {
            String j13 = j(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath()));
            if (pk.a0.x0(j13)) {
                j13 = j(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath()));
                if (pk.a0.x0(j13)) {
                    j13 = j(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath()));
                    if (pk.a0.x0(j13)) {
                        j13 = j(Environment.getExternalStorageDirectory());
                        if (pk.a0.x0(j13)) {
                            j13 = "";
                        }
                    }
                }
            }
            this.f110114a = j13;
        }
        return this.f110114a;
    }
}
