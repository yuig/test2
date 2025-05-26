package sg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import kotlin.jvm.internal.Intrinsics;
import tg2.c;
import tg2.e;
import tg2.f;
import tg2.i;
import tg2.j;
import tg2.l;
import tg2.m;
import tg2.n;
import tg2.o;
import tg2.q;
import tg2.r;
import tg2.t;
import th2.g;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final f f112876a;

    /* renamed from: b, reason: collision with root package name */
    public final e f112877b;

    /* renamed from: c, reason: collision with root package name */
    public final i f112878c;

    /* renamed from: d, reason: collision with root package name */
    public final q f112879d;

    /* renamed from: e, reason: collision with root package name */
    public final l f112880e;

    /* renamed from: f, reason: collision with root package name */
    public final tg2.a f112881f;

    /* renamed from: g, reason: collision with root package name */
    public final r f112882g;

    /* renamed from: h, reason: collision with root package name */
    public final m f112883h;

    /* renamed from: i, reason: collision with root package name */
    public final j f112884i;

    /* renamed from: j, reason: collision with root package name */
    public final o f112885j;

    /* renamed from: k, reason: collision with root package name */
    public final c f112886k;

    /* renamed from: l, reason: collision with root package name */
    public final t f112887l;

    /* renamed from: m, reason: collision with root package name */
    public final n f112888m;

    /* renamed from: n, reason: collision with root package name */
    public final String f112889n;

    /* renamed from: o, reason: collision with root package name */
    public final g f112890o;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public b(sh2.j openTelemetryCfg, uh2.b preferencesService, g suppliedFramework, InstrumentedConfigImpl instrumentedConfig, RemoteConfig remoteConfig) {
        g gVar;
        tg2.g thresholdCheck = new tg2.g(new nd2.a(preferencesService, 19));
        Intrinsics.checkNotNullParameter(openTelemetryCfg, "openTelemetryCfg");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(suppliedFramework, "suppliedFramework");
        Intrinsics.checkNotNullParameter(instrumentedConfig, "instrumentedConfig");
        Intrinsics.checkNotNullParameter(thresholdCheck, "thresholdCheck");
        this.f112876a = new f(thresholdCheck, instrumentedConfig, remoteConfig);
        this.f112877b = new e(thresholdCheck, instrumentedConfig, remoteConfig);
        this.f112878c = new i(instrumentedConfig, remoteConfig);
        this.f112879d = new q(instrumentedConfig);
        this.f112880e = new l(remoteConfig);
        this.f112881f = new tg2.a(thresholdCheck, instrumentedConfig, remoteConfig);
        this.f112882g = new r(instrumentedConfig, remoteConfig);
        this.f112883h = new m(instrumentedConfig, remoteConfig);
        this.f112884i = new j(remoteConfig);
        this.f112885j = new o(thresholdCheck, remoteConfig);
        this.f112886k = new c(thresholdCheck, instrumentedConfig, remoteConfig);
        this.f112887l = new t(thresholdCheck, remoteConfig);
        this.f112888m = new n(thresholdCheck, instrumentedConfig, remoteConfig);
        String appId = instrumentedConfig.getProject().getAppId();
        Intrinsics.checkNotNullParameter(openTelemetryCfg, "openTelemetryCfg");
        if ((appId == null || appId.length() == 0) && !(!openTelemetryCfg.f112980e.isEmpty()) && !(!openTelemetryCfg.f112979d.isEmpty())) {
            throw new IllegalArgumentException("No appId supplied in embrace-config.json. This is required if you want to send data to Embrace, unless you configure an OTel exporter and add embrace.disableMappingFileUpload=true to gradle.properties.".toString());
        }
        this.f112889n = appId;
        String appFramework = instrumentedConfig.getProject().getAppFramework();
        if (appFramework != null) {
            g.Companion.getClass();
            switch (appFramework.hashCode()) {
                case -2040817961:
                    if (appFramework.equals("react_native")) {
                        gVar = g.REACT_NATIVE;
                        break;
                    }
                    gVar = null;
                    break;
                case -1052618729:
                    if (appFramework.equals("native")) {
                        gVar = g.NATIVE;
                        break;
                    }
                    gVar = null;
                    break;
                case -760334308:
                    if (appFramework.equals("flutter")) {
                        gVar = g.FLUTTER;
                        break;
                    }
                    gVar = null;
                    break;
                case 111433589:
                    if (appFramework.equals("unity")) {
                        gVar = g.UNITY;
                        break;
                    }
                    gVar = null;
                    break;
                default:
                    gVar = null;
                    break;
            }
            if (gVar != null) {
                suppliedFramework = gVar;
            }
        }
        this.f112890o = suppliedFramework;
    }

    public final boolean a() {
        String str = this.f112889n;
        return str == null || str.length() == 0;
    }
}
