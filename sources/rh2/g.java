package rh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends uf2.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public final vf2.b f108358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vf2.b logWriter, lh2.b logger) {
        super(logWriter, logger, wf2.b.f129712a);
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f108358d = logWriter;
    }
}
