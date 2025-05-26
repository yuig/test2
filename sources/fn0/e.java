package fn0;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.pinterest.feature.boardpreview.export.watermark.exception.ExtractorException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import xk2.v;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final MediaExtractor f62614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62615b;

    /* renamed from: c, reason: collision with root package name */
    public final v f62616c;

    public e(String filePath) {
        Object obj;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        int i13 = -1;
        this.f62615b = -1;
        this.f62616c = xk2.m.b(new d(this, 0));
        xk2.m.b(new d(this, 1));
        xk2.m.b(new d(this, 2));
        try {
            xk2.q qVar = xk2.s.f135225b;
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(filePath);
            obj = mediaExtractor;
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            obj = ue.c.m(th3);
        }
        Throwable throwable = xk2.s.a(obj);
        if (throwable != null) {
            Uri uri = Uri.parse(filePath);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            throw new ExtractorException.DataSource("data source error", uri, throwable);
        }
        MediaExtractor mediaExtractor2 = (MediaExtractor) obj;
        this.f62614a = mediaExtractor2;
        Uri uri2 = Uri.parse(filePath);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        Objects.toString(uri2);
        Intrinsics.checkNotNullParameter(mediaExtractor2, "<this>");
        Intrinsics.checkNotNullParameter("video/", "mimePrefix");
        int trackCount = mediaExtractor2.getTrackCount();
        int i14 = 0;
        while (true) {
            if (i14 >= trackCount) {
                break;
            }
            MediaFormat trackFormat = mediaExtractor2.getTrackFormat(i14);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            Intrinsics.f(string);
            if (z.p(string, "video/", false)) {
                i13 = i14;
                break;
            }
            i14++;
        }
        this.f62615b = i13;
        if (i13 < 0) {
            mediaExtractor2.release();
            Intrinsics.checkNotNullParameter(uri2, "uri");
            throw new ExtractorException.NoVideoTrack("no video track", uri2, 4);
        }
        mediaExtractor2.selectTrack(i13);
        if (((Number) this.f62616c.getValue()).longValue() > 0) {
            mediaExtractor2.seekTo(0L, 0);
            return;
        }
        mediaExtractor2.release();
        Throwable throwable2 = new Throwable("Duration of video track is undefined or equal to 0");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(throwable2, "throwable");
        throw new ExtractorException.NoDuration("video track duration is undefined", uri2, throwable2);
    }

    public final MediaFormat a() {
        MediaFormat trackFormat = this.f62614a.getTrackFormat(this.f62615b);
        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
        return trackFormat;
    }
}
