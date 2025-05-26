package pf2;

import android.os.Debug;
import io.embrace.android.embracesdk.internal.config.remote.AnrRemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f100012a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f100013b;

    /* renamed from: c, reason: collision with root package name */
    public of2.e f100014c;

    /* renamed from: d, reason: collision with root package name */
    public final f f100015d;

    /* renamed from: e, reason: collision with root package name */
    public final Thread f100016e;

    public a(sg2.a configService, og2.a clock, f state, Thread targetThread) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(targetThread, "targetThread");
        this.f100012a = configService;
        this.f100013b = clock;
        this.f100014c = null;
        this.f100015d = state;
        this.f100016e = targetThread;
    }

    public final void a(long j13) {
        Integer num;
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            return;
        }
        if (!this.f100015d.f100034e) {
            long j14 = j13 - this.f100015d.f100033d;
            long j15 = j13 - this.f100015d.f100032c;
            if (j14 > 60000) {
                long now = this.f100013b.now();
                this.f100015d.f100032c = now;
                this.f100015d.f100033d = now;
            } else {
                AnrRemoteConfig anrRemoteConfig = ((sg2.b) this.f100012a).f112881f.f117594c;
                if (j15 > ((anrRemoteConfig == null || (num = anrRemoteConfig.f72975f) == null) ? 1000 : num.intValue())) {
                    this.f100015d.f100034e = true;
                    of2.e eVar = this.f100014c;
                    if (eVar != null) {
                        eVar.a(this.f100016e, this.f100015d.f100032c);
                    }
                }
            }
        }
        if (this.f100015d.f100034e) {
            if (j13 - this.f100015d.f100033d > ((sg2.b) this.f100012a).f112881f.b() * 0.5d) {
                of2.e eVar2 = this.f100014c;
                if (eVar2 != null) {
                    eVar2.g(this.f100016e, j13);
                }
                f fVar = this.f100015d;
                this.f100013b.now();
                fVar.getClass();
            }
        }
        this.f100015d.f100033d = this.f100013b.now();
    }
}
