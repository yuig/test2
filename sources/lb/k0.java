package lb;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.p implements kl2.o {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f82616a = new k0();

    public k0() {
        super(6, l0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // kl2.o
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context p03 = (Context) obj;
        kb.d p13 = (kb.d) obj2;
        vb.b p23 = (vb.b) obj3;
        WorkDatabase p33 = (WorkDatabase) obj4;
        rb.l p43 = (rb.l) obj5;
        o p53 = (o) obj6;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        Intrinsics.checkNotNullParameter(p23, "p2");
        Intrinsics.checkNotNullParameter(p33, "p3");
        Intrinsics.checkNotNullParameter(p43, "p4");
        Intrinsics.checkNotNullParameter(p53, "p5");
        String str = s.f82667a;
        ob.d dVar = new ob.d(p03, p33, p13);
        ub.h.a(p03, SystemJobService.class, true);
        kb.b0.e().a(s.f82667a, "Created SystemJobScheduler and enabled SystemJobService");
        Intrinsics.checkNotNullExpressionValue(dVar, "createBestAvailableBackg…kDatabase, configuration)");
        return kotlin.collections.f0.j(dVar, new mb.c(p03, p13, p43, p53, new i0(p53, p23), p23));
    }
}
