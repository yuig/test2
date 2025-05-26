package et1;

import android.media.MediaExtractor;
import android.os.Build;
import android.util.LruCache;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final LruCache f60033d = new LruCache(50);

    /* renamed from: b, reason: collision with root package name */
    public String f60035b;

    /* renamed from: a, reason: collision with root package name */
    public final MediaExtractor f60034a = new MediaExtractor();

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f60036c = xk2.m.b(i.f60025j);

    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        r4 = d4.c.g(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0114, code lost:
    
        r6 = r3.getOutputFormat();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "getOutputFormat(...)");
        r4.setInteger("sample-rate", l3.c.I(r6));
        r6 = r3.getOutputFormat();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "getOutputFormat(...)");
        r4.setInteger("channel-count", l3.c.z(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
    
        r3.stop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[Catch: all -> 0x00cf, Exception -> 0x00d3, TryCatch #5 {Exception -> 0x00d3, blocks: (B:31:0x00c9, B:32:0x00f4, B:34:0x00fb, B:36:0x0108, B:39:0x010e, B:59:0x0144, B:69:0x013a, B:76:0x00d6), top: B:30:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.MediaFormat a(int r28) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: et1.j.a(int):android.media.MediaFormat");
    }

    public final void b() {
        this.f60034a.release();
    }

    public final void c(int i13) {
        try {
            this.f60034a.selectTrack(i13);
        } catch (Exception e13) {
            tb0.h hVar = (tb0.h) this.f60036c.getValue();
            String str = this.f60035b;
            if (str == null) {
                Intrinsics.r("dataSource");
                throw null;
            }
            hVar.h("Failed to select track: trackIndex=" + i13 + " source=" + str);
            throw new gi.c(6, "MediaExtractor2 selectTrack failed", e13);
        }
    }

    public final void d(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f60035b = path;
        try {
            this.f60034a.setDataSource(path);
        } catch (Exception e13) {
            File file = new File(path);
            ((tb0.h) this.f60036c.getValue()).h("Failed to set data source path=" + path + " exists=" + file.exists() + " size=" + file.length());
            throw new gi.c(7, "MediaExtractor2 setDataSource failed", e13);
        }
    }

    public final void e(int i13) {
        try {
            this.f60034a.unselectTrack(i13);
        } catch (Exception e13) {
            tb0.h hVar = (tb0.h) this.f60036c.getValue();
            String str = this.f60035b;
            if (str == null) {
                Intrinsics.r("dataSource");
                throw null;
            }
            hVar.h("Failed to unselect track trackIndex=" + i13 + " source=" + str);
            throw new gi.c(8, "MediaExtractor2 unselectTrack failed", e13);
        }
    }

    public final String toString() {
        long sampleSize;
        StringBuilder sb3 = new StringBuilder();
        MediaExtractor mediaExtractor = this.f60034a;
        sb3.append("a [trackCount=[" + mediaExtractor.getTrackCount() + "] ");
        sb3.append("Current track index [" + mediaExtractor.getSampleTrackIndex() + "] ");
        sb3.append("Current sample time [" + mediaExtractor.getSampleTime() + "] ");
        if (Build.VERSION.SDK_INT >= 28) {
            sampleSize = mediaExtractor.getSampleSize();
            sb3.append("Current sample size [" + sampleSize + "] ");
        }
        int trackCount = mediaExtractor.getTrackCount();
        for (int i13 = 0; i13 < trackCount; i13++) {
            sb3.append(" Track " + i13 + " format=[" + mediaExtractor.getTrackFormat(i13) + "]");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
