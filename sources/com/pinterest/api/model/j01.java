package com.pinterest.api.model;

import android.media.MediaMetadataRetriever;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j01 {
    private j01() {
    }

    public /* synthetic */ j01(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static xk2.w a(int i13, int i14, int i15) {
        return (i15 == 90 || i15 == 270) ? new xk2.w(Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i15)) : new xk2.w(Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    public static float b(String path) {
        xk2.w wVar;
        Intrinsics.checkNotNullParameter(path, "path");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(path);
            wVar = a(e(path, 18, mediaMetadataRetriever), e(path, 19, mediaMetadataRetriever), e(path, 24, mediaMetadataRetriever));
            mediaMetadataRetriever.release();
        } catch (RuntimeException unused) {
            mediaMetadataRetriever.release();
            wVar = null;
        } catch (Throwable th3) {
            mediaMetadataRetriever.release();
            throw th3;
        }
        if (wVar != null) {
            return ((Number) wVar.f135234a).intValue() / ((Number) wVar.f135235b).intValue();
        }
        return -1.0f;
    }

    public static long c(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(path);
            long f13 = f(path, mediaMetadataRetriever);
            mediaMetadataRetriever.release();
            return f13;
        } catch (RuntimeException unused) {
            mediaMetadataRetriever.release();
            return -1L;
        } catch (Throwable th3) {
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    public static String d(String str, int i13, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return mediaMetadataRetriever.extractMetadata(i13);
        } catch (IllegalStateException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(e13, df.j1.U("Metadata not found in media file: %s", new Object[]{str}), tb0.p.MEDIA_GALLERY);
            return null;
        }
    }

    public static int e(String path, int i13, MediaMetadataRetriever retriever) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(retriever, "retriever");
        String d2 = d(path, i13, retriever);
        if (d2 != null) {
            return Integer.parseInt(d2);
        }
        return -1;
    }

    public static long f(String path, MediaMetadataRetriever retriever) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(retriever, "retriever");
        String d2 = d(path, 9, retriever);
        if (d2 != null) {
            return Long.parseLong(d2);
        }
        return -1L;
    }

    public static int g(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(path);
            int e13 = e(path, 24, mediaMetadataRetriever);
            mediaMetadataRetriever.release();
            return e13;
        } catch (RuntimeException unused) {
            mediaMetadataRetriever.release();
            return -1;
        } catch (Throwable th3) {
            mediaMetadataRetriever.release();
            throw th3;
        }
    }
}
