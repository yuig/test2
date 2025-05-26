package org.chromium.net;

import com.google.android.gms.ads.AdError;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class NetworkTrafficAnnotationTag {
    private final int mHashCode;
    public static final NetworkTrafficAnnotationTag NO_TRAFFIC_ANNOTATION_YET = createComplete(AdError.UNDEFINED_DOMAIN, "Nothing here yet.");
    public static final NetworkTrafficAnnotationTag MISSING_TRAFFIC_ANNOTATION = createComplete(AdError.UNDEFINED_DOMAIN, "Function called without traffic annotation.");
    public static final NetworkTrafficAnnotationTag TRAFFIC_ANNOTATION_FOR_TESTS = createComplete("test", "Traffic annotation for unit, browser and other tests");

    private NetworkTrafficAnnotationTag(String str) {
        this.mHashCode = iterativeHash(str);
    }

    public static NetworkTrafficAnnotationTag createComplete(String str, String str2) {
        return new NetworkTrafficAnnotationTag(str);
    }

    public static int iterativeHash(String str) {
        long j13 = 0;
        for (int i13 = 0; i13 < str.getBytes(StandardCharsets.UTF_8).length; i13++) {
            j13 = ((j13 * 31) + r7[i13]) % 138003713;
        }
        return (int) j13;
    }

    public int getHashCode() {
        return this.mHashCode;
    }
}
