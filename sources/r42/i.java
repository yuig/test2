package r42;

import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.security.RecaptchaKibanaLogger$Log$Payload;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i {
    public static final void a(ox.b bVar, Throwable th3, String message, String userId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (bVar != null) {
            ms0.b bVar2 = new ms0.b();
            KibanaMetrics.Log.Metadata metadata = new KibanaMetrics.Log.Metadata(userId, null, 2, null);
            RecaptchaKibanaLogger$Log$Payload payload = new RecaptchaKibanaLogger$Log$Payload(message, th3 != null ? xk2.f.b(th3) : null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(payload, "payload");
            bVar2.b(new h("recaptcha_errors", metadata, payload, null, null, 0L, 56, null));
            ((vy.m) bVar).i(bVar2, ox.a.f97979i);
        }
    }
}
