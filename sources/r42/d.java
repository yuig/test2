package r42;

import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.api.model.wy0;
import com.pinterest.security.DataEncryptionSRKibanaLogger$Log$Payload;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements kg0.b {

    /* renamed from: a, reason: collision with root package name */
    public final se2.a f106184a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f106185b;

    public d(se2.a analyticsApiProvider, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(analyticsApiProvider, "analyticsApiProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f106184a = analyticsApiProvider;
        this.f106185b = activeUserManager;
    }

    public final void a(String str, String str2) {
        ox.b bVar = (ox.b) ((bf2.b) this.f106184a).get();
        ms0.b bVar2 = new ms0.b();
        wy0 f13 = ((b60.d) this.f106185b).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        KibanaMetrics.Log.Metadata metadata = new KibanaMetrics.Log.Metadata(uid, null, 2, null);
        DataEncryptionSRKibanaLogger$Log$Payload payload = new DataEncryptionSRKibanaLogger$Log$Payload(str, str2);
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bVar2.b(new c("data_encryption_success_rate", metadata, payload, null, null, 0L, 56, null));
        Intrinsics.f(bVar);
        ((vy.m) bVar).i(bVar2, ox.a.f97979i);
    }
}
