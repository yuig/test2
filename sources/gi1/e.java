package gi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface e {
    static com.pinterest.feature.video.model.d a(e eVar, String str, int i13) {
        String str2 = (i13 & 1) != 0 ? null : str;
        com.pinterest.feature.video.model.e state = com.pinterest.feature.video.model.e.FAILURE;
        int i14 = pt1.c.notification_upload_failure;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        return new com.pinterest.feature.video.model.d(state, str2, i14, null, 0.0f, 0.0f, 0L, null, null, null, null, 2040);
    }

    static com.pinterest.feature.video.model.d b(e eVar, String str) {
        com.pinterest.feature.video.model.e state = com.pinterest.feature.video.model.e.SUCCESS;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        return new com.pinterest.feature.video.model.d(state, str, 0, null, 0.0f, 0.0f, 0L, null, null, null, null, 2044);
    }

    static com.pinterest.feature.video.model.d c(e eVar, String str, int i13, int i14) {
        com.pinterest.feature.video.model.e state = com.pinterest.feature.video.model.e.IDEA_PIN_UPLOAD_FAILURE;
        String str2 = (i14 & 4) != 0 ? null : str;
        int i15 = (i14 & 8) != 0 ? pt1.c.pin_creation_error_pin_upload : i13;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        return new com.pinterest.feature.video.model.d(state, null, i15, str2, 0.0f, 0.0f, 0L, null, null, null, null, 2032);
    }
}
