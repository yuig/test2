package e10;

import a.cb;
import com.pinterest.analytics.kibana.KibanaMetrics;
import fk2.d0;
import gk2.x0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import lr.v;
import m60.f0;
import org.jetbrains.annotations.NotNull;
import uk2.p;
import vy.m;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final m f56789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56790b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56791c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f56792d;

    /* renamed from: e, reason: collision with root package name */
    public final p f56793e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f56794f;

    /* renamed from: g, reason: collision with root package name */
    public final i f56795g;

    /* renamed from: h, reason: collision with root package name */
    private uj2.h f56796h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ak2.e f56797i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ak2.e f56798j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ak2.a f56799k;

    public j(m analyticsApi, f0 devUtils, int i13) {
        TimeUnit batchTimeUnit = TimeUnit.SECONDS;
        uk2.f logQueue = cb.r("create(...)");
        devUtils = (i13 & 32) != 0 ? vb0.j.f125466a : devUtils;
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(batchTimeUnit, "batchTimeUnit");
        Intrinsics.checkNotNullParameter(logQueue, "logQueue");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        this.f56789a = analyticsApi;
        this.f56790b = 10;
        this.f56791c = 3;
        this.f56792d = batchTimeUnit;
        this.f56793e = logQueue;
        this.f56794f = devUtils;
        this.f56795g = new i();
        final int i14 = 0;
        this.f56797i = new ak2.e(this) { // from class: e10.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f56788b;

            {
                this.f56788b = this;
            }

            @Override // ak2.e
            public final void accept(Object obj) {
                int i15 = i14;
                j this$0 = this.f56788b;
                switch (i15) {
                    case 0:
                        List list = (List) obj;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.f(list);
                        this$0.getClass();
                        if (!list.isEmpty()) {
                            i iVar = this$0.f56795g;
                            iVar.c(list);
                            this$0.f56789a.i(iVar, new v(this$0, 20));
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.b();
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f56798j = new ak2.e(this) { // from class: e10.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f56788b;

            {
                this.f56788b = this;
            }

            @Override // ak2.e
            public final void accept(Object obj) {
                int i152 = i15;
                j this$0 = this.f56788b;
                switch (i152) {
                    case 0:
                        List list = (List) obj;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.f(list);
                        this$0.getClass();
                        if (!list.isEmpty()) {
                            i iVar = this$0.f56795g;
                            iVar.c(list);
                            this$0.f56789a.i(iVar, new v(this$0, 20));
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.b();
                        break;
                }
            }
        };
        this.f56799k = new f00.c(this, i15);
        b();
    }

    public final void a(KibanaMetrics.Log log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.f56793e.c(log);
    }

    public final void b() {
        xp2.a a13 = new g(this.f56791c, this.f56792d, this.f56790b).a(this.f56793e.N(uj2.a.BUFFER));
        uj2.h d0Var = a13 instanceof uj2.h ? (uj2.h) a13 : new d0(a13, 2);
        Intrinsics.checkNotNullExpressionValue(d0Var, "compose(...)");
        this.f56796h = d0Var;
        d0Var.k(this.f56797i, this.f56798j, this.f56799k, x0.INSTANCE);
    }
}
