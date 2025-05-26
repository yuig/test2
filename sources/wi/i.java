package wi;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f129943a;

    /* renamed from: b, reason: collision with root package name */
    public final long f129944b;

    /* renamed from: c, reason: collision with root package name */
    public final s f129945c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f129946d;

    /* renamed from: e, reason: collision with root package name */
    public final String f129947e;

    /* renamed from: f, reason: collision with root package name */
    public final String f129948f;

    /* renamed from: g, reason: collision with root package name */
    public final String f129949g;

    /* renamed from: h, reason: collision with root package name */
    public final String f129950h;

    public i(String adapterClassName, long j13, s sVar, Bundle credentials, String name, String id3, String instanceName, String instanceId) {
        Intrinsics.checkNotNullParameter(adapterClassName, "adapterClassName");
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f129943a = adapterClassName;
        this.f129944b = j13;
        this.f129945c = sVar;
        this.f129946d = credentials;
        this.f129947e = name;
        this.f129948f = id3;
        this.f129949g = instanceName;
        this.f129950h = instanceId;
    }
}
