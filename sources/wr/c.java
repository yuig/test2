package wr;

import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;

/* loaded from: classes.dex */
public interface c {
    static /* synthetic */ void a(c cVar, BaseAdsPayload baseAdsPayload, Float f13, String str, int i13) {
        if ((i13 & 4) != 0) {
            f13 = Float.valueOf(1.0f);
        }
        if ((i13 & 8) != 0) {
            str = null;
        }
        ((d) cVar).c(baseAdsPayload, null, f13, str);
    }
}
