package ht1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.d0 f70149a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.b0 f70150b;

    /* renamed from: c, reason: collision with root package name */
    public final gt1.e f70151c;

    /* renamed from: d, reason: collision with root package name */
    public final gt1.f f70152d;

    /* renamed from: e, reason: collision with root package name */
    public final gt1.d f70153e;

    /* renamed from: f, reason: collision with root package name */
    public final wk2.a f70154f;

    /* renamed from: g, reason: collision with root package name */
    public final et1.c f70155g;

    /* renamed from: h, reason: collision with root package name */
    public final et1.d f70156h;

    /* renamed from: i, reason: collision with root package name */
    public mt1.a f70157i;

    /* renamed from: j, reason: collision with root package name */
    public mt1.d f70158j;

    /* renamed from: k, reason: collision with root package name */
    public et1.c f70159k;

    /* renamed from: l, reason: collision with root package name */
    public nt1.c f70160l;

    /* renamed from: m, reason: collision with root package name */
    public nt1.c f70161m;

    /* renamed from: n, reason: collision with root package name */
    public final v0 f70162n;

    /* renamed from: o, reason: collision with root package name */
    public final v0 f70163o;

    /* renamed from: p, reason: collision with root package name */
    public final v0 f70164p;

    /* renamed from: q, reason: collision with root package name */
    public final v0 f70165q;

    /* renamed from: r, reason: collision with root package name */
    public final z f70166r;

    /* renamed from: s, reason: collision with root package name */
    public final z f70167s;

    public b0(et1.d0 passThroughNodeFactory, et1.b0 linearPipelineBuilderFactory, gt1.e audioTypeConverterFactory, gt1.f channelConverterFactory, gt1.d audioResamplerFactory, wk2.a subcomponentProvider) {
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(linearPipelineBuilderFactory, "linearPipelineBuilderFactory");
        Intrinsics.checkNotNullParameter(audioTypeConverterFactory, "audioTypeConverterFactory");
        Intrinsics.checkNotNullParameter(channelConverterFactory, "channelConverterFactory");
        Intrinsics.checkNotNullParameter(audioResamplerFactory, "audioResamplerFactory");
        Intrinsics.checkNotNullParameter(subcomponentProvider, "subcomponentProvider");
        this.f70149a = passThroughNodeFactory;
        this.f70150b = linearPipelineBuilderFactory;
        this.f70151c = audioTypeConverterFactory;
        this.f70152d = channelConverterFactory;
        this.f70153e = audioResamplerFactory;
        this.f70154f = subcomponentProvider;
        et1.c cVar = (et1.c) subcomponentProvider.get();
        this.f70155g = cVar;
        et1.v0 v0Var = (et1.v0) cVar;
        et1.d dVar = v0Var.f60109a;
        this.f70156h = dVar;
        v0 a13 = et1.d0.a(passThroughNodeFactory);
        this.f70162n = a13;
        this.f70163o = a13;
        v0 a14 = et1.d0.a(passThroughNodeFactory);
        this.f70164p = a14;
        this.f70165q = a14;
        z zVar = new z(this, 0);
        this.f70166r = zVar;
        z zVar2 = new z(this, 1);
        this.f70167s = zVar2;
        a0 a0Var = new a0(this, 0);
        Object obj = subcomponentProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        this.f70159k = (et1.c) obj;
        v0Var.a(a13, "Convert Audio");
        v0Var.a(a14, "On Audio Converted");
        v0Var.a(zVar, "Set Input Format");
        v0Var.a(zVar2, "Set Output Format");
        v0Var.a(this.f70159k, "Pre-setup implementation");
        ((et1.v0) this.f70159k).a(a0Var, "Always throw (audio pipeline not setup)");
        this.f70157i = a0Var;
        this.f70158j = a0Var;
        et1.u0 u0Var = (et1.u0) dVar;
        u0Var.a(a0Var, a13);
        u0Var.a(a14, a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(ht1.b0 r28, nt1.c r29, nt1.c r30) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ht1.b0.a(ht1.b0, nt1.c, nt1.c):void");
    }

    public final void b(et1.c node, mt1.a aVar, mt1.d dVar) {
        dVar.d(y.f70374i);
        ((et1.u0) this.f70156h).c(aVar);
        node.j(new jq1.b(this, 4));
        et1.v0 v0Var = (et1.v0) this.f70155g;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(node, "node");
        v0Var.f60110b.remove(node);
        v0Var.f60111c.remove(node);
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70155g).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70155g).h(callback);
    }

    public final String toString() {
        return "DynamicAudioConverter inputFormat=[" + this.f70160l + "] outputFormat=[" + this.f70161m + "]";
    }
}
