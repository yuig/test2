package gk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class t extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f65623c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f65624d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.a0 f65625e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65626f;

    public t(uj2.h hVar, long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        super(hVar);
        this.f65623c = j13;
        this.f65624d = timeUnit;
        this.f65625e = a0Var;
        this.f65626f = false;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        this.f65321b.l(new s(this.f65626f ? bVar : new vk2.a(bVar), this.f65623c, this.f65624d, this.f65625e.a(), this.f65626f));
    }
}
