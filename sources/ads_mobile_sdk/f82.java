package ads_mobile_sdk;

import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes2.dex */
public final class f82 implements a.vg {

    /* renamed from: a, reason: collision with root package name */
    public final a.e0 f5087a;

    /* renamed from: b, reason: collision with root package name */
    public final e82 f5088b;

    public f82(a.e0 e0Var, e82 e82Var) {
        this.f5087a = e0Var;
        this.f5088b = e82Var;
    }

    @Override // a.vg
    public final UploadDataProvider a(RequestBody requestBody, int i13) {
        long a13 = requestBody.a();
        return (a13 == -1 || a13 > 1048576) ? this.f5088b.a(requestBody, i13) : this.f5087a.a(requestBody, i13);
    }
}
