package lp0;

import android.content.res.Resources;
import androidx.viewpager2.widget.k;
import g90.p;
import hp0.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class a extends k {

    /* renamed from: a, reason: collision with root package name */
    public final jp0.b f84234a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f84235b;

    /* renamed from: c, reason: collision with root package name */
    public final v f84236c;

    /* renamed from: d, reason: collision with root package name */
    public float f84237d;

    /* renamed from: e, reason: collision with root package name */
    public int f84238e;

    public a(jp0.b qcmDrawerCarousel, int i13, Resources resources, r rVar) {
        Intrinsics.checkNotNullParameter(qcmDrawerCarousel, "qcmDrawerCarousel");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f84234a = qcmDrawerCarousel;
        this.f84235b = rVar;
        this.f84236c = m.b(new p(1, resources));
        this.f84237d = i13;
        this.f84238e = i13;
    }

    @Override // androidx.viewpager2.widget.k
    public final void b(int i13, float f13, int i14) {
        Function1 function1;
        float f14 = i13 + f13;
        jp0.b bVar = this.f84234a;
        if (f13 <= 0.001f || f13 >= 0.999f) {
            int rint = (int) Math.rint(f14);
            int i15 = this.f84238e;
            if (rint != i15 && (function1 = this.f84235b) != null) {
                function1.invoke(rint > i15 ? c.LEFT : c.RIGHT);
            }
            bVar.getPinterestRecyclerView().f52531a.G2(rint);
            this.f84238e = rint;
            f14 = rint;
        } else {
            bVar.getPinterestRecyclerView().f52531a.scrollBy(ml2.c.c(((Number) this.f84236c.getValue()).intValue() * (f14 - this.f84237d)), 0);
        }
        this.f84237d = f14;
    }
}
