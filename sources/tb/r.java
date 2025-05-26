package tb;

import androidx.lifecycle.n1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kb.r0;
import kb.s0;
import kb.t0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f116997a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f116998b;

    /* renamed from: c, reason: collision with root package name */
    public final kb.l f116999c;

    /* renamed from: d, reason: collision with root package name */
    public final long f117000d;

    /* renamed from: e, reason: collision with root package name */
    public final long f117001e;

    /* renamed from: f, reason: collision with root package name */
    public final long f117002f;

    /* renamed from: g, reason: collision with root package name */
    public final kb.g f117003g;

    /* renamed from: h, reason: collision with root package name */
    public final int f117004h;

    /* renamed from: i, reason: collision with root package name */
    public final kb.a f117005i;

    /* renamed from: j, reason: collision with root package name */
    public final long f117006j;

    /* renamed from: k, reason: collision with root package name */
    public final long f117007k;

    /* renamed from: l, reason: collision with root package name */
    public final int f117008l;

    /* renamed from: m, reason: collision with root package name */
    public final int f117009m;

    /* renamed from: n, reason: collision with root package name */
    public final long f117010n;

    /* renamed from: o, reason: collision with root package name */
    public final int f117011o;

    /* renamed from: p, reason: collision with root package name */
    public final List f117012p;

    /* renamed from: q, reason: collision with root package name */
    public final List f117013q;

    public r(String id3, s0 state, kb.l output, long j13, long j14, long j15, kb.g constraints, int i13, kb.a backoffPolicy, long j16, long j17, int i14, int i15, long j18, int i16, ArrayList tags, ArrayList progress) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f116997a = id3;
        this.f116998b = state;
        this.f116999c = output;
        this.f117000d = j13;
        this.f117001e = j14;
        this.f117002f = j15;
        this.f117003g = constraints;
        this.f117004h = i13;
        this.f117005i = backoffPolicy;
        this.f117006j = j16;
        this.f117007k = j17;
        this.f117008l = i14;
        this.f117009m = i15;
        this.f117010n = j18;
        this.f117011o = i16;
        this.f117012p = tags;
        this.f117013q = progress;
    }

    public final t0 a() {
        long j13;
        List list = this.f117013q;
        kb.l lVar = list.isEmpty() ^ true ? (kb.l) list.get(0) : kb.l.f79018b;
        UUID fromString = UUID.fromString(this.f116997a);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(id)");
        HashSet hashSet = new HashSet(this.f117012p);
        long j14 = this.f117001e;
        r0 r0Var = j14 != 0 ? new r0(j14, this.f117002f) : null;
        s0 s0Var = s0.ENQUEUED;
        int i13 = this.f117004h;
        long j15 = this.f117000d;
        s0 s0Var2 = this.f116998b;
        if (s0Var2 == s0Var) {
            String str = s.f117014y;
            boolean z13 = s0Var2 == s0Var && i13 > 0;
            boolean z14 = j14 != 0;
            j13 = n1.e(z13, i13, this.f117005i, this.f117006j, this.f117007k, this.f117008l, z14, j15, this.f117002f, j14, this.f117010n);
        } else {
            j13 = Long.MAX_VALUE;
        }
        return new t0(fromString, this.f116998b, hashSet, this.f116999c, lVar, i13, this.f117009m, this.f117003g, j15, r0Var, j13, this.f117011o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f116997a, rVar.f116997a) && this.f116998b == rVar.f116998b && Intrinsics.d(this.f116999c, rVar.f116999c) && this.f117000d == rVar.f117000d && this.f117001e == rVar.f117001e && this.f117002f == rVar.f117002f && Intrinsics.d(this.f117003g, rVar.f117003g) && this.f117004h == rVar.f117004h && this.f117005i == rVar.f117005i && this.f117006j == rVar.f117006j && this.f117007k == rVar.f117007k && this.f117008l == rVar.f117008l && this.f117009m == rVar.f117009m && this.f117010n == rVar.f117010n && this.f117011o == rVar.f117011o && Intrinsics.d(this.f117012p, rVar.f117012p) && Intrinsics.d(this.f117013q, rVar.f117013q);
    }

    public final int hashCode() {
        return this.f117013q.hashCode() + ep.b.c(this.f117012p, ep.b.b(this.f117011o, a.a.c(this.f117010n, ep.b.b(this.f117009m, ep.b.b(this.f117008l, a.a.c(this.f117007k, a.a.c(this.f117006j, (this.f117005i.hashCode() + ep.b.b(this.f117004h, (this.f117003g.hashCode() + a.a.c(this.f117002f, a.a.c(this.f117001e, a.a.c(this.f117000d, (this.f116999c.hashCode() + ((this.f116998b.hashCode() + (this.f116997a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkInfoPojo(id=");
        sb3.append(this.f116997a);
        sb3.append(", state=");
        sb3.append(this.f116998b);
        sb3.append(", output=");
        sb3.append(this.f116999c);
        sb3.append(", initialDelay=");
        sb3.append(this.f117000d);
        sb3.append(", intervalDuration=");
        sb3.append(this.f117001e);
        sb3.append(", flexDuration=");
        sb3.append(this.f117002f);
        sb3.append(", constraints=");
        sb3.append(this.f117003g);
        sb3.append(", runAttemptCount=");
        sb3.append(this.f117004h);
        sb3.append(", backoffPolicy=");
        sb3.append(this.f117005i);
        sb3.append(", backoffDelayDuration=");
        sb3.append(this.f117006j);
        sb3.append(", lastEnqueueTime=");
        sb3.append(this.f117007k);
        sb3.append(", periodCount=");
        sb3.append(this.f117008l);
        sb3.append(", generation=");
        sb3.append(this.f117009m);
        sb3.append(", nextScheduleTimeOverride=");
        sb3.append(this.f117010n);
        sb3.append(", stopReason=");
        sb3.append(this.f117011o);
        sb3.append(", tags=");
        sb3.append(this.f117012p);
        sb3.append(", progress=");
        return d7.g.k(sb3, this.f117013q, ')');
    }
}
