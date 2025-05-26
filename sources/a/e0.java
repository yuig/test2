package a;

import ads_mobile_sdk.a82;
import java.io.IOException;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes2.dex */
public final class e0 implements vg {
    @Override // a.vg
    public final UploadDataProvider a(RequestBody requestBody, int i13) {
        long a13 = requestBody.a();
        if (a13 < 0 || a13 > 1048576) {
            throw new IOException(a.g("Expected definite length less than 1048576but got ", a13));
        }
        return new a82(a13, requestBody);
    }
}
