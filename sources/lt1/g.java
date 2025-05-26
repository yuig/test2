package lt1;

import android.media.MediaFormat;
import et1.f0;
import et1.h0;
import et1.j0;
import et1.m0;
import et1.v0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mt1.j;

/* loaded from: classes4.dex */
public final class g implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f84822a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f84823b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f84824c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f84825d;

    /* renamed from: e, reason: collision with root package name */
    public final et1.c f84826e;

    /* renamed from: f, reason: collision with root package name */
    public final nt1.f f84827f;

    /* renamed from: g, reason: collision with root package name */
    public MediaFormat f84828g;

    /* renamed from: h, reason: collision with root package name */
    public final f f84829h;

    /* renamed from: i, reason: collision with root package name */
    public final j f84830i;

    /* renamed from: j, reason: collision with root package name */
    public final j f84831j;

    /* renamed from: k, reason: collision with root package name */
    public final f f84832k;

    public g(tb0.h crashReporting, h0 simpleProducerFactory, m0 muxRender, j0 sampleType, et1.c mutableSubcomponent, f0 runningMedianCalculatorFactory) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(muxRender, "muxRender");
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(mutableSubcomponent, "mutableSubcomponent");
        Intrinsics.checkNotNullParameter(runningMedianCalculatorFactory, "runningMedianCalculatorFactory");
        this.f84822a = crashReporting;
        this.f84823b = muxRender;
        this.f84824c = sampleType;
        this.f84825d = true;
        this.f84826e = mutableSubcomponent;
        runningMedianCalculatorFactory.getClass();
        this.f84827f = new nt1.f(50);
        f fVar = new f(this, 1);
        this.f84829h = fVar;
        simpleProducerFactory.getClass();
        j jVar = new j();
        this.f84830i = jVar;
        this.f84831j = jVar;
        f fVar2 = new f(this, 0);
        this.f84832k = fVar2;
        v0 v0Var = (v0) mutableSubcomponent;
        v0Var.a(fVar2, "Mux Packet");
        v0Var.a(fVar, "Set Output Format");
        v0Var.a(jVar, "On Packet Multiplexed");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f84826e).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f84826e).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f84826e.j(callback);
    }

    public final String toString() {
        MediaFormat mediaFormat = this.f84828g;
        StringBuilder sb3 = new StringBuilder("MuxRenderNode sampleType=[");
        sb3.append(this.f84824c);
        sb3.append("] outputFormat=[");
        sb3.append(mediaFormat);
        sb3.append("] finalizeMuxerOnEndOfStream=[");
        return a.a.r(sb3, this.f84825d, "]");
    }
}
