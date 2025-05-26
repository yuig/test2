package n3;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f89107a;

    /* renamed from: b, reason: collision with root package name */
    public final long f89108b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89109c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f89110d;

    /* renamed from: e, reason: collision with root package name */
    public final float f89111e;

    /* renamed from: f, reason: collision with root package name */
    public final long f89112f;

    /* renamed from: g, reason: collision with root package name */
    public final long f89113g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f89114h;

    /* renamed from: i, reason: collision with root package name */
    public final int f89115i;

    /* renamed from: j, reason: collision with root package name */
    public final long f89116j;

    /* renamed from: k, reason: collision with root package name */
    public final List f89117k;

    /* renamed from: l, reason: collision with root package name */
    public final long f89118l;

    /* renamed from: m, reason: collision with root package name */
    public b f89119m;

    public /* synthetic */ q(long j13, long j14, long j15, float f13, long j16, long j17, boolean z13, boolean z14) {
        this(j13, j14, j15, false, f13, j16, j17, z13, z14, 1, 0L);
    }

    public static q b(q qVar, long j13, long j14, ArrayList arrayList) {
        q qVar2 = new q(qVar.f89107a, qVar.f89108b, j13, qVar.f89110d, qVar.f89111e, qVar.f89112f, j14, qVar.f89114h, qVar.f89115i, arrayList, qVar.f89116j, qVar.f89118l);
        qVar2.f89119m = qVar.f89119m;
        return qVar2;
    }

    public final void a() {
        b bVar = this.f89119m;
        bVar.f89034b = true;
        bVar.f89033a = true;
    }

    public final List c() {
        List list = this.f89117k;
        return list == null ? q0.f80391a : list;
    }

    public final long d() {
        return this.f89107a;
    }

    public final long e() {
        return this.f89109c;
    }

    public final boolean f() {
        return this.f89110d;
    }

    public final float g() {
        return this.f89111e;
    }

    public final long h() {
        return this.f89113g;
    }

    public final boolean i() {
        return this.f89114h;
    }

    public final long j() {
        return this.f89116j;
    }

    public final int k() {
        return this.f89115i;
    }

    public final long l() {
        return this.f89108b;
    }

    public final boolean m() {
        b bVar = this.f89119m;
        return bVar.f89034b || bVar.f89033a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PointerInputChange(id=");
        sb3.append((Object) p.b(this.f89107a));
        sb3.append(", uptimeMillis=");
        sb3.append(this.f89108b);
        sb3.append(", position=");
        sb3.append((Object) a3.c.j(this.f89109c));
        sb3.append(", pressed=");
        sb3.append(this.f89110d);
        sb3.append(", pressure=");
        sb3.append(this.f89111e);
        sb3.append(", previousUptimeMillis=");
        sb3.append(this.f89112f);
        sb3.append(", previousPosition=");
        sb3.append((Object) a3.c.j(this.f89113g));
        sb3.append(", previousPressed=");
        sb3.append(this.f89114h);
        sb3.append(", isConsumed=");
        sb3.append(m());
        sb3.append(", type=");
        int i13 = this.f89115i;
        sb3.append((Object) (i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb3.append(", historical=");
        sb3.append(c());
        sb3.append(",scrollDelta=");
        sb3.append((Object) a3.c.j(this.f89116j));
        sb3.append(')');
        return sb3.toString();
    }

    public q(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, int i13, List list, long j18, long j19) {
        this(j13, j14, j15, z13, f13, j16, j17, z14, false, i13, j18);
        this.f89117k = list;
        this.f89118l = j19;
    }

    public q(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, boolean z15, int i13, long j18) {
        this.f89107a = j13;
        this.f89108b = j14;
        this.f89109c = j15;
        this.f89110d = z13;
        this.f89111e = f13;
        this.f89112f = j16;
        this.f89113g = j17;
        this.f89114h = z14;
        this.f89115i = i13;
        this.f89116j = j18;
        this.f89118l = 0L;
        b bVar = new b();
        bVar.f89033a = z15;
        bVar.f89034b = z15;
        this.f89119m = bVar;
    }
}
