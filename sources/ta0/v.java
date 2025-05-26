package ta0;

import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import x02.b1;

/* loaded from: classes5.dex */
public final class v implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f116913a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f116914b;

    /* renamed from: c, reason: collision with root package name */
    public final n82.b f116915c;

    /* renamed from: d, reason: collision with root package name */
    public final l20.b f116916d;

    /* renamed from: e, reason: collision with root package name */
    public final rw0.f f116917e;

    /* renamed from: f, reason: collision with root package name */
    public final ny1.w f116918f;

    /* renamed from: g, reason: collision with root package name */
    public final lh0.j0 f116919g;

    public v(b1 collageRepository, tb0.h crashReporting, n82.b currentActivityProvider, l20.b imageDownloadService, rw0.f mediaUtils, ny1.w permissionsManager, lh0.j0 experiments) {
        Intrinsics.checkNotNullParameter(collageRepository, "collageRepository");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        Intrinsics.checkNotNullParameter(imageDownloadService, "imageDownloadService");
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f116913a = collageRepository;
        this.f116914b = crashReporting;
        this.f116915c = currentActivityProvider;
        this.f116916d = imageDownloadService;
        this.f116917e = mediaUtils;
        this.f116918f = permissionsManager;
        this.f116919g = experiments;
    }

    public static void j(u50.r rVar, int i13) {
        rVar.a(new m(i13));
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        x request = (x) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new t(request, this, eventIntake, scope, null), 2);
    }
}
