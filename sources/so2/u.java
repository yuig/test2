package so2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends s {

    /* renamed from: j, reason: collision with root package name */
    public final ro2.c0 f114819j;

    /* renamed from: k, reason: collision with root package name */
    public final List f114820k;

    /* renamed from: l, reason: collision with root package name */
    public final int f114821l;

    /* renamed from: m, reason: collision with root package name */
    public int f114822m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ro2.c json, ro2.c0 value) {
        super(json, value, null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f114819j = value;
        List F0 = CollectionsKt.F0(value.f108979a.keySet());
        this.f114820k = F0;
        this.f114821l = F0.size() * 2;
        this.f114822m = -1;
    }

    @Override // so2.s, qo2.r0
    public final String O(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f114820k.get(i13 / 2);
    }

    @Override // so2.s, so2.a
    public final ro2.n R(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f114822m % 2 == 0 ? ro2.o.b(tag) : (ro2.n) z0.e(tag, this.f114819j);
    }

    @Override // so2.s, so2.a
    public final ro2.n U() {
        return this.f114819j;
    }

    @Override // so2.s
    /* renamed from: W */
    public final ro2.c0 U() {
        return this.f114819j;
    }

    @Override // so2.s, so2.a, po2.a
    public final void a(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // so2.s, po2.a
    public final int o(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i13 = this.f114822m;
        if (i13 >= this.f114821l - 1) {
            return -1;
        }
        int i14 = i13 + 1;
        this.f114822m = i14;
        return i14;
    }
}
