package kh2;

import android.content.pm.ApplicationInfo;
import android.view.WindowManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79737i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2 f79738j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f79739k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f79740l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h3 f79741m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f79742n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l3 f79743o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b1 f79744p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(o oVar, k kVar, a aVar, l3 l3Var, b1 b1Var, y2 y2Var, h3 h3Var) {
        super(0);
        this.f79739k = oVar;
        this.f79740l = kVar;
        this.f79742n = aVar;
        this.f79743o = l3Var;
        this.f79744p = b1Var;
        this.f79738j = y2Var;
        this.f79741m = h3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ki2.g gVar = ki2.g.f79814f;
        int i13 = this.f79737i;
        b1 b1Var = this.f79744p;
        l3 l3Var = this.f79743o;
        a aVar = this.f79742n;
        h3 h3Var = this.f79741m;
        k kVar = this.f79740l;
        o oVar = this.f79739k;
        y2 y2Var = this.f79738j;
        switch (i13) {
            case 0:
                try {
                    c0.d.M2("metadata-service-init");
                    return new gg2.d(xk2.m.b(new w2(y2Var, 0)), ((q) oVar).b(), xk2.m.b(new y0(h3Var, 2)), ((m) kVar).b(), ((c) aVar).a(), ((m3) l3Var).a(gVar), ((d1) b1Var).f79455a, ((d1) b1Var).f79456b);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                try {
                    c0.d.M2("resource-source");
                    fh2.c b13 = y2Var.b();
                    q qVar = (q) oVar;
                    ApplicationInfo appInfo = qVar.b().getApplicationInfo();
                    Intrinsics.checkNotNullExpressionValue(appInfo, "coreModule.context.applicationInfo");
                    Intrinsics.checkNotNullParameter(appInfo, "appInfo");
                    gg2.a aVar2 = (appInfo.flags & 2) != 0 ? gg2.a.DEV : gg2.a.PROD;
                    try {
                        c0.d.M2("buildInfo");
                        yf2.a aVar3 = (yf2.a) ((yf2.c) ((yf2.b) qVar.f79657f.getValue())).f139003d.getValue();
                        c0.d.N();
                        try {
                            c0.d.M2("packageInfo");
                            t2 t2Var = (t2) qVar.f79653b.a(qVar, q.f79651g[1]);
                            c0.d.N();
                            th2.g gVar2 = ((sg2.b) ((m) kVar).b()).f112890o;
                            nf2.b a13 = y2Var.a();
                            try {
                                c0.d.M2("deviceImpl");
                                j3 j3Var = (j3) h3Var;
                                gh2.c cVar = new gh2.c((WindowManager) j3Var.f79581f.a(j3Var, j3.f79575g[4]), ((c) aVar).a(), ((m3) l3Var).a(gVar), ((d1) b1Var).f79457c, ((d1) b1Var).f79456b);
                                c0.d.N();
                                return new gh2.d(b13, aVar2, aVar3, t2Var, gVar2, a13, cVar, (gg2.f) y2Var.f79751a.a(y2Var, y2.f79750l[0]));
                            } finally {
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var, o oVar, k kVar, h3 h3Var, a aVar, l3 l3Var, b1 b1Var) {
        super(0);
        this.f79738j = y2Var;
        this.f79739k = oVar;
        this.f79740l = kVar;
        this.f79741m = h3Var;
        this.f79742n = aVar;
        this.f79743o = l3Var;
        this.f79744p = b1Var;
    }
}
