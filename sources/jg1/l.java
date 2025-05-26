package jg1;

import et1.h0;
import et1.u0;
import et1.w0;
import ht1.j0;
import ht1.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import so.y9;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76013i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f76014j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(q qVar, int i13) {
        super(0);
        this.f76013i = i13;
        this.f76014j = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f76013i;
        q qVar = this.f76014j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (et1.g) ((oa) q.a(qVar)).f113773kb.get();
                    default:
                        return a02.e.d2((h0) ((oa) q.a(qVar)).f113948ua.get());
                }
            case 1:
                return (et1.n) ((oa) q.a(qVar)).f113703gb.get();
            case 2:
                switch (i13) {
                    case 0:
                        return (et1.g) ((oa) q.a(qVar)).f113773kb.get();
                    default:
                        return a02.e.d2((h0) ((oa) q.a(qVar)).f113948ua.get());
                }
            case 3:
                return (y9) ((oa) q.a(qVar)).Ea.get();
            case 4:
                return (t.a) ((oa) q.a(qVar)).f113739ib.get();
            case 5:
                return (j0) ((oa) q.a(qVar)).Oa.get();
            case 6:
                return (et1.c0) ((oa) q.a(qVar)).f113791lb.get();
            case 7:
                oa oaVar = (oa) q.a(qVar);
                w0 w0Var = new w0(new g4.u(), (vy.m) oaVar.M1.get(), (b60.b) oaVar.f113850p0.get());
                a02.e.S3(w0Var);
                return new u0(w0Var, (t.a) oaVar.f113930ta.get());
            case 8:
                return (tb0.h) ((oa) q.a(qVar)).f113797m0.get();
            case 9:
                oa oaVar2 = (oa) q.a(qVar);
                w0 w0Var2 = new w0(new g4.u(), (vy.m) oaVar2.M1.get(), (b60.b) oaVar2.f113850p0.get());
                a02.e.S3(w0Var2);
                return w0Var2;
            case 10:
                g gVar = qVar.f76041a;
                if (gVar != null) {
                    gVar.a();
                }
                qVar.f76041a = null;
                g gVar2 = qVar.f76042b;
                if (gVar2 != null) {
                    gVar2.a();
                }
                qVar.f76042b = null;
                return Unit.f80348a;
            case 11:
                return (r0) ((oa) q.a(qVar)).Sa.get();
            case 12:
                return (et1.r) ((oa) q.a(qVar)).f113721hb.get();
            case 13:
                return ((oa) q.a(qVar)).f113844ob;
            default:
                tb0.h crashReporting = (tb0.h) ((oa) q.a(qVar)).f113797m0.get();
                vt1.a decoderSurfaceFactory = new vt1.a();
                Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
                Intrinsics.checkNotNullParameter(decoderSurfaceFactory, "decoderSurfaceFactory");
                return new vt1.b(crashReporting, decoderSurfaceFactory);
        }
    }
}
