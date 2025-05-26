package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes2.dex */
public final class e82 implements a.vg {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f4754a;

    public e82(ExecutorService executorService) {
        this.f4754a = executorService;
    }

    @Override // a.vg
    public final UploadDataProvider a(RequestBody requestBody, int i13) {
        return new d82(requestBody, new yw2(), this.f4754a, i13);
    }
}
