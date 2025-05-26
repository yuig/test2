package kh2;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class j2 {
    public d3 A;
    public o0 B;
    public x C;
    public h0 D;
    public e E;
    public h1 F;
    public k2 G;
    public n2 H;
    public d0 I;

    /* renamed from: J, reason: collision with root package name */
    public t0 f79548J;
    public z2 K;
    public s L;
    public v2 M;
    public volatile AtomicBoolean N;

    /* renamed from: a, reason: collision with root package name */
    public final lh2.b f79549a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f79550b;

    /* renamed from: c, reason: collision with root package name */
    public final q2 f79551c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f79552d;

    /* renamed from: e, reason: collision with root package name */
    public final kl2.o f79553e;

    /* renamed from: f, reason: collision with root package name */
    public final Function2 f79554f;

    /* renamed from: g, reason: collision with root package name */
    public final Function2 f79555g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f79556h;

    /* renamed from: i, reason: collision with root package name */
    public final kl2.l f79557i;

    /* renamed from: j, reason: collision with root package name */
    public final kl2.a f79558j;

    /* renamed from: k, reason: collision with root package name */
    public final kl2.r f79559k;

    /* renamed from: l, reason: collision with root package name */
    public final Function2 f79560l;

    /* renamed from: m, reason: collision with root package name */
    public final kl2.o f79561m;

    /* renamed from: n, reason: collision with root package name */
    public final kl2.c f79562n;

    /* renamed from: o, reason: collision with root package name */
    public final kl2.l f79563o;

    /* renamed from: p, reason: collision with root package name */
    public final kl2.q f79564p;

    /* renamed from: q, reason: collision with root package name */
    public final kl2.b f79565q;

    /* renamed from: r, reason: collision with root package name */
    public final kl2.p f79566r;

    /* renamed from: s, reason: collision with root package name */
    public final kl2.a f79567s;

    /* renamed from: t, reason: collision with root package name */
    public final kl2.n f79568t;

    /* renamed from: u, reason: collision with root package name */
    public final kl2.b f79569u;

    /* renamed from: v, reason: collision with root package name */
    public o f79570v;

    /* renamed from: w, reason: collision with root package name */
    public k f79571w;

    /* renamed from: x, reason: collision with root package name */
    public l3 f79572x;

    /* renamed from: y, reason: collision with root package name */
    public h3 f79573y;

    /* renamed from: z, reason: collision with root package name */
    public a f79574z;

    public j2() {
        try {
            c0.d.M2("logger-init");
            lh2.e logger = new lh2.e();
            c0.d.N();
            try {
                c0.d.M2("init-module");
                d1 initModule = f0.h.y(logger);
                c0.d.N();
                try {
                    c0.d.M2("otel-module");
                    Intrinsics.checkNotNullParameter(initModule, "initModule");
                    s2 openTelemetryModule = new s2(initModule);
                    c0.d.N();
                    w1 coreModuleSupplier = w1.f79729a;
                    x1 configModuleSupplier = x1.f79736a;
                    y1 systemServiceModuleSupplier = y1.f79749a;
                    z1 androidServicesModuleSupplier = z1.f79778a;
                    a2 workerThreadModuleSupplier = a2.f79429a;
                    b2 storageModuleSupplier = b2.f79439a;
                    k1 essentialServiceModuleSupplier = k1.f79583a;
                    l1 featureModuleSupplier = l1.f79598a;
                    m1 dataSourceModuleSupplier = m1.f79616a;
                    n1 dataCaptureServiceModuleSupplier = n1.f79627a;
                    o1 deliveryModuleSupplier = o1.f79630a;
                    p1 anrModuleSupplier = p1.f79640a;
                    q1 logModuleSupplier = q1.f79661a;
                    r1 nativeCoreModuleSupplier = r1.f79681a;
                    s1 nativeFeatureModuleSupplier = s1.f79685a;
                    t1 sessionOrchestrationModuleSupplier = t1.f79706a;
                    u1 crashModuleSupplier = u1.f79714a;
                    v1 payloadSourceModuleSupplier = v1.f79725a;
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    Intrinsics.checkNotNullParameter(initModule, "initModule");
                    Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
                    Intrinsics.checkNotNullParameter(coreModuleSupplier, "coreModuleSupplier");
                    Intrinsics.checkNotNullParameter(configModuleSupplier, "configModuleSupplier");
                    Intrinsics.checkNotNullParameter(systemServiceModuleSupplier, "systemServiceModuleSupplier");
                    Intrinsics.checkNotNullParameter(androidServicesModuleSupplier, "androidServicesModuleSupplier");
                    Intrinsics.checkNotNullParameter(workerThreadModuleSupplier, "workerThreadModuleSupplier");
                    Intrinsics.checkNotNullParameter(storageModuleSupplier, "storageModuleSupplier");
                    Intrinsics.checkNotNullParameter(essentialServiceModuleSupplier, "essentialServiceModuleSupplier");
                    Intrinsics.checkNotNullParameter(featureModuleSupplier, "featureModuleSupplier");
                    Intrinsics.checkNotNullParameter(dataSourceModuleSupplier, "dataSourceModuleSupplier");
                    Intrinsics.checkNotNullParameter(dataCaptureServiceModuleSupplier, "dataCaptureServiceModuleSupplier");
                    Intrinsics.checkNotNullParameter(deliveryModuleSupplier, "deliveryModuleSupplier");
                    Intrinsics.checkNotNullParameter(anrModuleSupplier, "anrModuleSupplier");
                    Intrinsics.checkNotNullParameter(logModuleSupplier, "logModuleSupplier");
                    Intrinsics.checkNotNullParameter(nativeCoreModuleSupplier, "nativeCoreModuleSupplier");
                    Intrinsics.checkNotNullParameter(nativeFeatureModuleSupplier, "nativeFeatureModuleSupplier");
                    Intrinsics.checkNotNullParameter(sessionOrchestrationModuleSupplier, "sessionOrchestrationModuleSupplier");
                    Intrinsics.checkNotNullParameter(crashModuleSupplier, "crashModuleSupplier");
                    Intrinsics.checkNotNullParameter(payloadSourceModuleSupplier, "payloadSourceModuleSupplier");
                    this.f79549a = logger;
                    this.f79550b = initModule;
                    this.f79551c = openTelemetryModule;
                    this.f79552d = coreModuleSupplier;
                    this.f79553e = configModuleSupplier;
                    this.f79554f = systemServiceModuleSupplier;
                    this.f79555g = androidServicesModuleSupplier;
                    this.f79556h = workerThreadModuleSupplier;
                    this.f79557i = storageModuleSupplier;
                    this.f79558j = essentialServiceModuleSupplier;
                    this.f79559k = featureModuleSupplier;
                    this.f79560l = dataSourceModuleSupplier;
                    this.f79561m = dataCaptureServiceModuleSupplier;
                    this.f79562n = deliveryModuleSupplier;
                    this.f79563o = anrModuleSupplier;
                    this.f79564p = logModuleSupplier;
                    this.f79565q = nativeCoreModuleSupplier;
                    this.f79566r = nativeFeatureModuleSupplier;
                    this.f79567s = sessionOrchestrationModuleSupplier;
                    this.f79568t = crashModuleSupplier;
                    this.f79569u = payloadSourceModuleSupplier;
                    this.N = new AtomicBoolean(false);
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
    }

    public static Object n(rl2.d dVar, Function0 function0) {
        try {
            c0.d.M2(p(dVar).concat("-init"));
            return function0.invoke();
        } finally {
        }
    }

    public static void o(rl2.d dVar, Function0 function0) {
        try {
            c0.d.M2(p(dVar).concat("-post-init"));
            function0.invoke();
        } finally {
        }
    }

    public static String p(rl2.d dVar) {
        String S;
        Locale locale;
        String l13;
        String f13 = dVar.f();
        return (f13 == null || (S = StringsKt.S("Module", f13)) == null || (l13 = ep.b.l((locale = Locale.ENGLISH), "ENGLISH", S, locale, "toLowerCase(...)")) == null) ? "module" : l13;
    }

    public final a a() {
        a aVar = this.f79574z;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("androidServicesModule");
        throw null;
    }

    public final e b() {
        e eVar = this.E;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("anrModule");
        throw null;
    }

    public final k c() {
        k kVar = this.f79571w;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("configModule");
        throw null;
    }

    public final o d() {
        o oVar = this.f79570v;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.r("coreModule");
        throw null;
    }

    public final x e() {
        x xVar = this.C;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.r("dataCaptureServiceModule");
        throw null;
    }

    public final h0 f() {
        h0 h0Var = this.D;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.r("deliveryModule");
        throw null;
    }

    public final o0 g() {
        o0 o0Var = this.B;
        if (o0Var != null) {
            return o0Var;
        }
        Intrinsics.r("essentialServiceModule");
        throw null;
    }

    public final t0 h() {
        t0 t0Var = this.f79548J;
        if (t0Var != null) {
            return t0Var;
        }
        Intrinsics.r("featureModule");
        throw null;
    }

    public final h1 i() {
        h1 h1Var = this.F;
        if (h1Var != null) {
            return h1Var;
        }
        Intrinsics.r("logModule");
        throw null;
    }

    public final n2 j() {
        n2 n2Var = this.H;
        if (n2Var != null) {
            return n2Var;
        }
        Intrinsics.r("nativeFeatureModule");
        throw null;
    }

    public final v2 k() {
        v2 v2Var = this.M;
        if (v2Var != null) {
            return v2Var;
        }
        Intrinsics.r("payloadSourceModule");
        throw null;
    }

    public final z2 l() {
        z2 z2Var = this.K;
        if (z2Var != null) {
            return z2Var;
        }
        Intrinsics.r("sessionOrchestrationModule");
        throw null;
    }

    public final l3 m() {
        l3 l3Var = this.f79572x;
        if (l3Var != null) {
            return l3Var;
        }
        Intrinsics.r("workerThreadModule");
        throw null;
    }
}
