package et1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb0.h f60043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f60044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f60045c;

    public /* synthetic */ m(tb0.h hVar, h0 h0Var, f0 f0Var) {
        this.f60043a = hVar;
        this.f60044b = h0Var;
        this.f60045c = f0Var;
    }

    public final lt1.g a(m0 muxRender, j0 sampleType, id1.a mutableComponentProvider) {
        tb0.h crashReporting = this.f60043a;
        Intrinsics.checkNotNullParameter(crashReporting, "$crashReporting");
        h0 simpleProducerFactory = this.f60044b;
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "$simpleProducerFactory");
        f0 runningMedianCalculatorFactory = this.f60045c;
        Intrinsics.checkNotNullParameter(runningMedianCalculatorFactory, "$runningMedianCalculatorFactory");
        Intrinsics.checkNotNullParameter(muxRender, "muxRender");
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(mutableComponentProvider, "mutableComponentProvider");
        Object obj = mutableComponentProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new lt1.g(crashReporting, simpleProducerFactory, muxRender, sampleType, (c) obj, runningMedianCalculatorFactory);
    }
}
