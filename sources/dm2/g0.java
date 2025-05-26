package dm2;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f55422a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f55423b;

    /* renamed from: c, reason: collision with root package name */
    public final List f55424c;

    public g0(List allDependencies, kotlin.collections.s0 modulesWhoseInternalsAreVisible, kotlin.collections.q0 directExpectedByDependencies, kotlin.collections.s0 allExpectedByDependencies) {
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.f55422a = allDependencies;
        this.f55423b = modulesWhoseInternalsAreVisible;
        this.f55424c = directExpectedByDependencies;
    }
}
