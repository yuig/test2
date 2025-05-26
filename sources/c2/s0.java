package c2;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25169a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25170b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25171c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25172d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25173e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25174f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25175g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25176h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25177i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25178j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25179k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25180l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25181m;

    public s0(long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23, long j24, long j25, long j26, long j27, boolean z13) {
        b3.w wVar = new b3.w(j13);
        i2.y3 y3Var = i2.y3.f71400a;
        this.f25169a = bs1.c.u1(wVar, y3Var);
        this.f25170b = bs1.c.u1(new b3.w(j14), y3Var);
        this.f25171c = bs1.c.u1(new b3.w(j15), y3Var);
        this.f25172d = bs1.c.u1(new b3.w(j16), y3Var);
        this.f25173e = bs1.c.u1(new b3.w(j17), y3Var);
        this.f25174f = bs1.c.u1(new b3.w(j18), y3Var);
        this.f25175g = bs1.c.u1(new b3.w(j19), y3Var);
        this.f25176h = bs1.c.u1(new b3.w(j23), y3Var);
        this.f25177i = bs1.c.u1(new b3.w(j24), y3Var);
        this.f25178j = bs1.c.u1(new b3.w(j25), y3Var);
        this.f25179k = bs1.c.u1(new b3.w(j26), y3Var);
        this.f25180l = bs1.c.u1(new b3.w(j27), y3Var);
        this.f25181m = bs1.c.u1(Boolean.valueOf(z13), y3Var);
    }

    public final long a() {
        return ((b3.w) this.f25173e.getValue()).f21392a;
    }

    public final long b() {
        return ((b3.w) this.f25175g.getValue()).f21392a;
    }

    public final long c() {
        return ((b3.w) this.f25179k.getValue()).f21392a;
    }

    public final long d() {
        return ((b3.w) this.f25169a.getValue()).f21392a;
    }

    public final long e() {
        return ((b3.w) this.f25174f.getValue()).f21392a;
    }

    public final boolean f() {
        return ((Boolean) this.f25181m.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Colors(primary=");
        sb3.append((Object) b3.w.i(d()));
        sb3.append(", primaryVariant=");
        jq.b.t(((b3.w) this.f25170b.getValue()).f21392a, sb3, ", secondary=");
        jq.b.t(((b3.w) this.f25171c.getValue()).f21392a, sb3, ", secondaryVariant=");
        sb3.append((Object) b3.w.i(((b3.w) this.f25172d.getValue()).f21392a));
        sb3.append(", background=");
        sb3.append((Object) b3.w.i(a()));
        sb3.append(", surface=");
        sb3.append((Object) b3.w.i(e()));
        sb3.append(", error=");
        sb3.append((Object) b3.w.i(b()));
        sb3.append(", onPrimary=");
        jq.b.t(((b3.w) this.f25176h.getValue()).f21392a, sb3, ", onSecondary=");
        jq.b.t(((b3.w) this.f25177i.getValue()).f21392a, sb3, ", onBackground=");
        sb3.append((Object) b3.w.i(((b3.w) this.f25178j.getValue()).f21392a));
        sb3.append(", onSurface=");
        sb3.append((Object) b3.w.i(c()));
        sb3.append(", onError=");
        sb3.append((Object) b3.w.i(((b3.w) this.f25180l.getValue()).f21392a));
        sb3.append(", isLight=");
        sb3.append(f());
        sb3.append(')');
        return sb3.toString();
    }
}
