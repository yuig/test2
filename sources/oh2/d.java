package oh2;

import io.embrace.android.embracesdk.internal.ndk.jni.JniDelegateImpl;
import java.io.File;
import kh2.g2;
import kh2.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nf2.n;
import xk2.k;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f94608a;

    /* renamed from: b, reason: collision with root package name */
    public final n f94609b;

    /* renamed from: c, reason: collision with root package name */
    public final lh2.b f94610c;

    /* renamed from: d, reason: collision with root package name */
    public final JniDelegateImpl f94611d;

    /* renamed from: e, reason: collision with root package name */
    public final ki2.a f94612e;

    /* renamed from: f, reason: collision with root package name */
    public final g f94613f;

    /* renamed from: g, reason: collision with root package name */
    public final jh2.a f94614g;

    /* renamed from: h, reason: collision with root package name */
    public final og2.a f94615h;

    /* renamed from: i, reason: collision with root package name */
    public final ai2.b f94616i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f94617j;

    /* renamed from: k, reason: collision with root package name */
    public final k f94618k;

    public d(sg2.a configService, n sharedObjectLoader, lh2.b logger, JniDelegateImpl delegate, ki2.a backgroundWorker, g nativeInstallMessage, jh2.a mainThreadHandler, og2.a clock, ai2.b sessionIdTracker, z processIdProvider, k outputDir) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(sharedObjectLoader, "sharedObjectLoader");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(nativeInstallMessage, "nativeInstallMessage");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sessionIdTracker, "sessionIdTracker");
        Intrinsics.checkNotNullParameter(processIdProvider, "processIdProvider");
        Intrinsics.checkNotNullParameter(outputDir, "outputDir");
        this.f94608a = configService;
        this.f94609b = sharedObjectLoader;
        this.f94610c = logger;
        this.f94611d = delegate;
        this.f94612e = backgroundWorker;
        this.f94613f = nativeInstallMessage;
        this.f94614g = mainThreadHandler;
        this.f94615h = clock;
        this.f94616i = sessionIdTracker;
        this.f94617j = processIdProvider;
        this.f94618k = outputDir;
    }

    public final String a() {
        long now = this.f94615h.now();
        String uuid = ((ai2.c) this.f94616i).a();
        if (uuid == null) {
            uuid = "null";
        }
        String processId = (String) this.f94617j.invoke();
        yg2.f envelopeType = yg2.f.CRASH;
        yg2.b payloadType = yg2.b.NATIVE_CRASH;
        boolean z13 = (16 & 16) != 0;
        if ((16 & 32) != 0) {
            payloadType = yg2.b.UNKNOWN;
        }
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(envelopeType, "envelopeType");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        String absolutePath = new File((File) this.f94618k.getValue(), envelopeType.getPriority() + '_' + now + '_' + uuid + '_' + processId + '_' + z13 + '_' + payloadType.getFilenameComponent() + "_v1.json").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(outputDir.value, me…ta.filename).absolutePath");
        return absolutePath;
    }

    public final void b() {
        try {
            if (this.f94609b.a()) {
                JniDelegateImpl jniDelegateImpl = this.f94611d;
                String a13 = ((ai2.c) this.f94616i).a();
                if (a13 == null) {
                    a13 = "null";
                }
                jniDelegateImpl.onSessionChange(a13, a());
                jh2.a aVar = this.f94614g;
                g2 function = new g2(this, 2);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(function, "function");
                aVar.f76238a.postAtFrontOfQueue(new p4.a(14, function));
                jh2.a aVar2 = this.f94614g;
                c runnable = new c(this, 1);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                aVar2.f76238a.postDelayed(runnable, 5000L);
                ai2.b bVar = this.f94616i;
                cd2.n listener = new cd2.n(this, 11);
                ai2.c cVar = (ai2.c) bVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                cVar.f15251c.add(listener);
                ai2.a aVar3 = cVar.f15252d;
                listener.invoke(aVar3 != null ? aVar3.f15247a : null);
            }
        } catch (Exception e13) {
            ((lh2.e) this.f94610c).b(lh2.g.NATIVE_HANDLER_INSTALL_FAIL, e13);
        }
    }
}
