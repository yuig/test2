package ht1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import so.aa;

/* loaded from: classes4.dex */
public final class p0 implements f0, et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f70301a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f70302b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f70303c;

    /* renamed from: d, reason: collision with root package name */
    public final f f70304d;

    public p0(gt1.a extractAudioPacketTimeSpan, aa timeSpanGapDetectorFactory, et1.g silentAudioGeneratorProvider, et1.d0 passThroughNodeFactory, n extractAudioPacketFormat, et1.c component, jt1.d entireStreamTimeSpan, long j13) {
        Intrinsics.checkNotNullParameter(extractAudioPacketTimeSpan, "extractAudioPacketTimeSpan");
        Intrinsics.checkNotNullParameter(timeSpanGapDetectorFactory, "timeSpanGapDetectorFactory");
        Intrinsics.checkNotNullParameter(silentAudioGeneratorProvider, "silentAudioGeneratorProvider");
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(extractAudioPacketFormat, "extractAudioPacketFormat");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(entireStreamTimeSpan, "entireStreamTimeSpan");
        this.f70301a = component;
        v0 a13 = et1.d0.a(passThroughNodeFactory);
        v0 a14 = et1.d0.a(passThroughNodeFactory);
        et1.v0 v0Var = (et1.v0) component;
        q0 q0Var = (q0) silentAudioGeneratorProvider.a(v0Var.b());
        this.f70302b = a13;
        this.f70303c = a14;
        f fVar = q0Var.f70325c;
        this.f70304d = fVar;
        Object obj = v0Var.b().get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        lt1.i iVar = new lt1.i((et1.h0) timeSpanGapDetectorFactory.f113336a.f113568a.f113948ua.get(), (et1.c) obj, entireStreamTimeSpan, j13);
        v0Var.a(extractAudioPacketFormat, "Extract Format from AudioPacket");
        v0Var.a(a13, "Input Port");
        v0Var.a(q0Var, "Silent Audio Generator");
        v0Var.a(iVar, "Gap Detector");
        ((et1.u0) a()).a(extractAudioPacketFormat, a13);
        ((et1.u0) a()).a(fVar, extractAudioPacketFormat);
        v0Var.a(extractAudioPacketTimeSpan, "Get the timestamp and duration from AudioPackets");
        ((et1.u0) a()).a(extractAudioPacketTimeSpan, a13);
        ((et1.u0) a()).a(iVar.f84842d, extractAudioPacketTimeSpan);
        et1.u0 u0Var = (et1.u0) a();
        a0 a0Var = q0Var.f70326d;
        u0Var.a(a0Var, iVar.f84841c);
        ((et1.u0) a()).a(a14, a0Var);
        v0Var.a(a14, "Output Port");
        ((et1.u0) a()).a(a14, a13);
    }

    public final et1.d a() {
        return ((et1.v0) this.f70301a).f60109a;
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70301a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70301a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70301a.j(callback);
    }
}
