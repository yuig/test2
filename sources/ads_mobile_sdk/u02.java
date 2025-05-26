package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class u02 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v02 f11784a;

    public u02(v02 v02Var) {
        this.f11784a = v02Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            za0 za0Var = za0.f14688c;
            Mac mac = (Mac) za0Var.f14689a.a(this.f11784a.f12278b);
            mac.init(this.f11784a.f12279c);
            return mac;
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException(e13);
        }
    }
}
