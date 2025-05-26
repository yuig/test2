package ip1;

import bf2.d;
import ey.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f73369a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f73370b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f73371c;

    /* renamed from: d, reason: collision with root package name */
    public c f73372d;

    /* renamed from: e, reason: collision with root package name */
    public t4 f73373e;

    public b(b60.b activeUserManager, d profilePrefetchTaskProvider, d searchLandingPrefetchTaskProvider) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(profilePrefetchTaskProvider, "profilePrefetchTaskProvider");
        Intrinsics.checkNotNullParameter(searchLandingPrefetchTaskProvider, "searchLandingPrefetchTaskProvider");
        this.f73369a = activeUserManager;
        this.f73370b = profilePrefetchTaskProvider;
        this.f73371c = searchLandingPrefetchTaskProvider;
    }

    public final void a() {
        c cVar = this.f73372d;
        if (cVar != null) {
            cVar.b();
        }
    }
}
