package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.SessionConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.SessionRemoteConfig;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfig f117625a;

    /* renamed from: b, reason: collision with root package name */
    public final SessionConfig f117626b;

    public r(InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117625a = remoteConfig;
        this.f117626b = local.getSession();
    }

    public final Set a() {
        Collection sessionComponents;
        SessionRemoteConfig sessionRemoteConfig;
        RemoteConfig remoteConfig = this.f117625a;
        if (remoteConfig == null || (sessionRemoteConfig = remoteConfig.f73052g) == null || (sessionComponents = sessionRemoteConfig.f73082b) == null) {
            sessionComponents = this.f117626b.getSessionComponents();
        }
        Collection collection = sessionComponents;
        if (collection != null) {
            return CollectionsKt.J0(collection);
        }
        return null;
    }

    public final boolean b(String str) {
        if (a() != null) {
            return !r0.contains(str);
        }
        return false;
    }
}
