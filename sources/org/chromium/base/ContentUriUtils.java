package org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import dp2.e;
import java.io.File;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;
import so.a;

/* loaded from: classes4.dex */
public abstract class ContentUriUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f97301a = new Object();

    public static AssetFileDescriptor a(String str) {
        ContentResolver contentResolver = a.f113317a.getContentResolver();
        Uri parse = Uri.parse(str);
        try {
            if (c(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    throw new SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new AssetFileDescriptor(openFileDescriptor, 0L, -1L);
                }
            }
        } catch (Exception e13) {
            e.h("ContentUriUtils", "Cannot open content uri: %s", str, e13);
        }
        return null;
    }

    public static String b(Context context, Uri uri) {
        String[] streamTypes;
        String extensionFromMimeType;
        if (uri == null) {
            return "";
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        int columnIndex = query.getColumnIndex("_display_name");
                        if (columnIndex == -1) {
                            query.close();
                            return "";
                        }
                        String string = query.getString(columnIndex);
                        int columnIndex2 = query.getColumnIndex("flags");
                        if (columnIndex2 > -1 && (query.getLong(columnIndex2) & 512) != 0 && (streamTypes = contentResolver.getStreamTypes(uri, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                            string = string + "." + extensionFromMimeType;
                        }
                        query.close();
                        return string;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (NullPointerException unused) {
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if ((r8.getLong(r1) & 512) != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.net.Uri r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = so.a.f113317a
            boolean r1 = android.provider.DocumentsContract.isDocumentUri(r1, r8)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            android.content.Context r1 = so.a.f113317a
            android.content.ContentResolver r2 = r1.getContentResolver()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r8
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.NullPointerException -> L53
            if (r8 == 0) goto L4e
            int r1 = r8.getCount()     // Catch: java.lang.Throwable -> L44
            r2 = 1
            if (r1 < r2) goto L4e
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "flags"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L44
            r3 = -1
            if (r1 <= r3) goto L3f
            long r3 = r8.getLong(r1)     // Catch: java.lang.Throwable -> L44
            r5 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L3f
            goto L40
        L3f:
            r2 = r0
        L40:
            r8.close()     // Catch: java.lang.NullPointerException -> L53
            return r2
        L44:
            r1 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r8 = move-exception
            r1.addSuppressed(r8)     // Catch: java.lang.NullPointerException -> L53
        L4d:
            throw r1     // Catch: java.lang.NullPointerException -> L53
        L4e:
            if (r8 == 0) goto L53
            r8.close()     // Catch: java.lang.NullPointerException -> L53
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.c(android.net.Uri):boolean");
    }

    @CalledByNative
    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a13 = a(str);
        boolean z13 = a13 != null;
        if (a13 != null) {
            try {
                a13.close();
            } catch (IOException unused) {
            }
        }
        return z13;
    }

    @CalledByNative
    public static boolean delete(String str) {
        return a.f113317a.getContentResolver().delete(Uri.parse(str), null, null) > 0;
    }

    @CalledByNative
    public static String getContentUriFromFilePath(String str) {
        try {
            new File(str);
            synchronized (f97301a) {
            }
            return null;
        } catch (IllegalArgumentException e13) {
            e.b("ContentUriUtils", "Cannot retrieve content uri from file: %s", str, e13);
            return null;
        }
    }

    @CalledByNative
    public static String getMimeType(String str) {
        ContentResolver contentResolver = a.f113317a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!c(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    @CalledByNative
    public static String maybeGetDisplayName(String str) {
        try {
            String b13 = b(a.f113317a, Uri.parse(str));
            if (TextUtils.isEmpty(b13)) {
                return null;
            }
            return b13;
        } catch (Exception e13) {
            e.h("ContentUriUtils", "Cannot open content uri: %s", str, e13);
            return null;
        }
    }

    @CalledByNative
    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a13 = a(str);
        if (a13 != null) {
            return a13.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }
}
