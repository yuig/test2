package e10;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import uj2.a0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f56783a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f56784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56785c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f56786d;

    public g(int i13, TimeUnit timeUnit, int i14) {
        a0 scheduler = tk2.e.f118016b;
        Intrinsics.checkNotNullExpressionValue(scheduler, "computation(...)");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f56783a = i13;
        this.f56784b = timeUnit;
        this.f56785c = i14;
        this.f56786d = scheduler;
    }

    public final xp2.a a(final uj2.h upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return new xp2.a() { // from class: e10.c
            @Override // xp2.a
            public final void b(xp2.b s13) {
                uj2.h upstream2 = uj2.h.this;
                Intrinsics.checkNotNullParameter(upstream2, "$upstream");
                g this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(s13, "s");
                upstream2.b(new f(this$0, s13));
            }
        };
    }
}
