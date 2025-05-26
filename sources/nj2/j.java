package nj2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class j implements ui2.k {

    /* renamed from: a, reason: collision with root package name */
    public final String f91021a;

    /* renamed from: b, reason: collision with root package name */
    public final zi2.a f91022b;

    /* renamed from: c, reason: collision with root package name */
    public final s f91023c;

    /* renamed from: d, reason: collision with root package name */
    public final p f91024d;

    /* renamed from: e, reason: collision with root package name */
    public vi2.b f91025e;

    /* renamed from: g, reason: collision with root package name */
    public aj2.b f91027g;

    /* renamed from: f, reason: collision with root package name */
    public final ui2.n f91026f = ui2.n.INTERNAL;

    /* renamed from: h, reason: collision with root package name */
    public long f91028h = 0;

    public j(String str, zi2.a aVar, s sVar, p pVar) {
        this.f91021a = str;
        this.f91022b = aVar;
        this.f91023c = sVar;
        this.f91024d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    @Override // ui2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ui2.j a() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.j.a():ui2.j");
    }

    @Override // ui2.k
    public final ui2.k b() {
        this.f91025e = vi2.g.f125879b.root();
        return this;
    }

    @Override // ui2.k
    public final ui2.k c(vi2.b bVar) {
        this.f91025e = bVar;
        return this;
    }

    @Override // ui2.k
    public final ui2.k d(long j13, TimeUnit timeUnit) {
        if (j13 >= 0 && timeUnit != null) {
            this.f91028h = timeUnit.toNanos(j13);
        }
        return this;
    }
}
