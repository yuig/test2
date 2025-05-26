package so2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends a {

    /* renamed from: e, reason: collision with root package name */
    public final ro2.e f114816e;

    /* renamed from: f, reason: collision with root package name */
    public final int f114817f;

    /* renamed from: g, reason: collision with root package name */
    public int f114818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ro2.c json, ro2.e value) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f114816e = value;
        this.f114817f = value.f108981a.size();
        this.f114818g = -1;
    }

    @Override // qo2.r0
    public final String O(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i13);
    }

    @Override // so2.a
    public final ro2.n R(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (ro2.n) this.f114816e.f108981a.get(Integer.parseInt(tag));
    }

    @Override // so2.a
    public final ro2.n U() {
        return this.f114816e;
    }

    @Override // po2.a
    public final int o(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i13 = this.f114818g;
        if (i13 >= this.f114817f - 1) {
            return -1;
        }
        int i14 = i13 + 1;
        this.f114818g = i14;
        return i14;
    }
}
