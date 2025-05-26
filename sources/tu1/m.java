package tu1;

import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final su1.c f119416a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f119417b;

    /* renamed from: c, reason: collision with root package name */
    public volatile CronetEngine f119418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119419d;

    public m(e engineFactory, f0 engineAvailabilityRecord, m60.f0 engineInstaller, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(engineFactory, "cronetEngineFactory");
        Intrinsics.checkNotNullParameter(engineAvailabilityRecord, "engineAvailabilityRecord");
        Intrinsics.checkNotNullParameter(engineInstaller, "cronetEngineInstaller");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        Intrinsics.checkNotNullParameter(engineAvailabilityRecord, "engineAvailabilityRecord");
        Intrinsics.checkNotNullParameter(engineInstaller, "engineInstaller");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f119416a = engineFactory;
        this.f119417b = engineAvailabilityRecord;
        this.f119419d = ((Boolean) engineAvailabilityRecord.f119375b.getValue()).booleanValue() && engineAvailabilityRecord.f119376c;
    }
}
