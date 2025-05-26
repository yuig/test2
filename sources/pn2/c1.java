package pn2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c1 extends d1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f100774c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f100775d;

    public c1(Map map, boolean z13) {
        this.f100774c = map;
        this.f100775d = z13;
    }

    @Override // pn2.l1
    public final boolean a() {
        return this.f100775d;
    }

    @Override // pn2.l1
    public final boolean f() {
        return this.f100774c.isEmpty();
    }

    @Override // pn2.d1
    public final g1 h(b1 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (g1) this.f100774c.get(key);
    }
}
