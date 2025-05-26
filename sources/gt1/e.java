package gt1;

import et1.d0;
import et1.h0;
import ft1.i;
import ht1.l0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f66116a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f66117b;

    public e(d0 passThroughNodeFactory, h0 simpleProducerFactory) {
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        this.f66116a = passThroughNodeFactory;
        this.f66117b = simpleProducerFactory;
    }

    public final mt1.b a(nt1.c sourceAudioFormat, nt1.c targetAudioFormat) {
        Intrinsics.checkNotNullParameter(sourceAudioFormat, "sourceAudioFormat");
        Intrinsics.checkNotNullParameter(targetAudioFormat, "targetAudioFormat");
        i g13 = sourceAudioFormat.g();
        Intrinsics.f(g13);
        i g14 = targetAudioFormat.g();
        Intrinsics.f(g14);
        if (g13 == g14) {
            return d0.a(this.f66116a);
        }
        i iVar = i.Short;
        h0 h0Var = this.f66117b;
        if (g13 == iVar && g14 == i.Float) {
            return new l0(sourceAudioFormat, h0Var, 1);
        }
        if (g13 == i.Float && g14 == iVar) {
            return new ht1.d0(sourceAudioFormat, h0Var);
        }
        throw new RuntimeException("Unsupported PCM conversion from [" + g13 + "] to [" + g14 + "]");
    }
}
