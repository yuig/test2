package dc;

import java.util.List;
import zb.i;
import zb.q;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final b f54305a;

    /* renamed from: b, reason: collision with root package name */
    public final b f54306b;

    public d(b bVar, b bVar2) {
        this.f54305a = bVar;
        this.f54306b = bVar2;
    }

    @Override // dc.f
    public final zb.e a() {
        return new q((i) this.f54305a.a(), (i) this.f54306b.a());
    }

    @Override // dc.f
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // dc.f
    public final boolean c() {
        return this.f54305a.c() && this.f54306b.c();
    }
}
