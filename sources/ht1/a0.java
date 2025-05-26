package ht1;

import com.pinterest.mediaPipeline.PipelineException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends mt1.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ et1.e f70145e;

    public a0(et1.e eVar, int i13) {
        this.f70144d = i13;
        this.f70145e = eVar;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        int i13 = this.f70144d;
        et1.e eVar = this.f70145e;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((ft1.a) obj, "incomingPacket");
                b0 b0Var = (b0) eVar;
                throw new PipelineException("Audio packet was received before conversion pipeline was setup. Set input and output format first", kotlin.collections.f0.j(new Pair("Audio Received At ".concat(a0.class.getName()), this), new Pair("Set input format with", b0Var.f70166r), new Pair("Set output format with", b0Var.f70167s)), null, null, b0Var.f70156h, 12);
            default:
                jt1.d incomingPacket = (jt1.d) obj;
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                nt1.c cVar = ((q0) eVar).f70324b;
                if (cVar == null) {
                    return;
                }
                Integer b13 = cVar.b();
                Intrinsics.f(b13);
                e(ft1.b.b((int) nt1.d.g(incomingPacket.f77589b, nt1.d.f92294a, new nt1.e(1, b13.intValue())), cVar, incomingPacket.f77588a));
                return;
        }
    }
}
