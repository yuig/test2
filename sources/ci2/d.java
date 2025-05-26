package ci2;

import bi2.f;
import di2.k;
import e2.g0;
import io.embrace.android.embracesdk.internal.config.remote.BackgroundActivityRemoteConfig;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import th2.h;
import th2.i;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f27768a;

    /* renamed from: b, reason: collision with root package name */
    public final eh2.a f27769b;

    /* renamed from: c, reason: collision with root package name */
    public final sg2.a f27770c;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.b f27771d;

    public d(e payloadMessageCollator, eh2.a logEnvelopeSource, sg2.a configService, lh2.b logger) {
        Intrinsics.checkNotNullParameter(payloadMessageCollator, "payloadMessageCollator");
        Intrinsics.checkNotNullParameter(logEnvelopeSource, "logEnvelopeSource");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f27768a = payloadMessageCollator;
        this.f27769b = logEnvelopeSource;
        this.f27770c = configService;
        this.f27771d = logger;
    }

    public final Envelope a(f state, yh2.c initial) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(initial, "initial");
        int i13 = c.f27767a[state.ordinal()];
        e eVar = this.f27768a;
        if (i13 == 1) {
            return eVar.a(new g0(initial, k.NORMAL_END, this.f27771d, b(), null));
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (b()) {
            return eVar.a(new g0(initial, k.NORMAL_END, this.f27771d, true, null));
        }
        return null;
    }

    public final boolean b() {
        Float f13;
        tg2.f fVar = ((sg2.b) this.f27770c).f112876a;
        BackgroundActivityRemoteConfig backgroundActivityRemoteConfig = fVar.f117607c;
        return (backgroundActivityRemoteConfig == null || (f13 = backgroundActivityRemoteConfig.f72998a) == null) ? fVar.f117606b.isBackgroundActivityCaptureEnabled() : fVar.f117605a.b(f13.floatValue());
    }

    public final Envelope c(f state, yh2.c initial) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(initial, "initial");
        int i13 = c.f27767a[state.ordinal()];
        e eVar = this.f27768a;
        if (i13 == 1) {
            return eVar.a(new g0(initial, k.PERIODIC_CACHE, this.f27771d, true, null));
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (b()) {
            return eVar.a(new g0(initial, k.PERIODIC_CACHE, this.f27771d, true, null));
        }
        return null;
    }

    public final yh2.c d(f state, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = c.f27767a[state.ordinal()];
        e eVar = this.f27768a;
        if (i13 == 1) {
            return eVar.b(new b(z13, i.STATE, j13, h.FOREGROUND));
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (!b()) {
            return null;
        }
        if (!z13) {
            j13++;
        }
        return eVar.b(new b(z13, i.BKGND_STATE, j13, h.BACKGROUND));
    }
}
