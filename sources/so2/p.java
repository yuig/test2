package so2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends a {

    /* renamed from: e, reason: collision with root package name */
    public final ro2.n f114806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ro2.c json, ro2.n value) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f114806e = value;
        this.f104615a.add("primitive");
    }

    @Override // so2.a
    public final ro2.n R(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return this.f114806e;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // so2.a
    public final ro2.n U() {
        return this.f114806e;
    }

    @Override // po2.a
    public final int o(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }
}
