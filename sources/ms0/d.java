package ms0;

import android.os.Build;
import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.gridactions.utils.logging.PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import vy.m;
import yq0.k;

/* loaded from: classes5.dex */
public interface d {
    static void a(b bVar, c pinImageDownloadFailureReason, String userId, String pinId, String imageUrl, String str, String str2, Long l13, Long l14, m analyticsApi, int i13) {
        String l15;
        String l16;
        String str3 = (i13 & 16) != 0 ? null : str;
        String str4 = (i13 & 32) != 0 ? null : str2;
        Long l17 = (i13 & 64) != 0 ? null : l13;
        Long l18 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : l14;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pinImageDownloadFailureReason, "pinImageDownloadFailureReason");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        String lowerCase = pinImageDownloadFailureReason.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (str4 == null) {
            str4 = "";
        }
        PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload payload = new PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload(lowerCase, str4, pinId, imageUrl, str3 == null ? "" : str3, (l17 == null || (l16 = l17.toString()) == null) ? "" : l16, (l18 == null || (l15 = l18.toString()) == null) ? "" : l15, Build.VERSION.SDK_INT);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bVar.b(new a("pin_image_downloader", new KibanaMetrics.Log.Metadata(userId, null, 2, null), payload, null, null, 0L, 56, null));
        analyticsApi.i(bVar, new k(bVar, 22));
    }
}
