package bz;

import h32.i0;
import h32.v0;
import kotlin.jvm.internal.Intrinsics;
import nx.z0;

/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: h, reason: collision with root package name */
    public final i0 f24174h;

    /* renamed from: i, reason: collision with root package name */
    public final String f24175i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f24176j;

    public e(i0 context, String pinId, z0 auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f24174h = context;
        this.f24175i = pinId;
        this.f24176j = auxData;
    }

    @Override // bz.b
    public final void a(z0 auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        auxData.putAll(this.f24176j);
    }

    @Override // bz.b
    public final void b(v0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.f67285h = this.f24174h;
        builder.f67295r = this.f24175i;
    }
}
