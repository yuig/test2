package ne2;

import a.z0;
import ak2.f;
import cd2.n;
import kotlin.jvm.internal.Intrinsics;
import m7.z;
import tk2.e;
import uj2.a0;
import uj2.q;

/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f90468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90469b;

    /* renamed from: c, reason: collision with root package name */
    public final float f90470c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f90471d;

    public a() {
        a0 scheduler = e.f118017c;
        Intrinsics.checkNotNullExpressionValue(scheduler, "io(...)");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f90468a = 5000L;
        this.f90469b = 1;
        this.f90470c = 1.0f;
        this.f90471d = scheduler;
    }

    @Override // ak2.f
    public final Object apply(Object obj) {
        q errors = (q) obj;
        Intrinsics.checkNotNullParameter(errors, "errors");
        int i13 = this.f90469b;
        q D = q.D(i13 + 1);
        z zVar = new z(null, i13, 2);
        errors.getClass();
        q t13 = q.P(errors, D, zVar).t(new z0(new n(this, 5), 23));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }
}
