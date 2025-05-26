package ht1;

import android.media.MediaFormat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements mt1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ et1.e f70211b;

    public /* synthetic */ f(et1.e eVar, int i13) {
        this.f70210a = i13;
        this.f70211b = eVar;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        int i13 = this.f70210a;
        et1.e eVar = this.f70211b;
        switch (i13) {
            case 0:
                MediaFormat formatToDecode = (MediaFormat) obj;
                Intrinsics.checkNotNullParameter(formatToDecode, "incomingPacket");
                g gVar = (g) eVar;
                if (gVar.f70214c != null) {
                    throw new RuntimeException("Decoder input format can only be set once");
                }
                gVar.f70214c = formatToDecode;
                Intrinsics.f(formatToDecode);
                et1.v0 v0Var = (et1.v0) gVar.f70213b;
                id1.a mutableComponentProvider = v0Var.b();
                et1.x xVar = gVar.f70212a;
                tb0.h crashReporting = xVar.f60117a;
                Intrinsics.checkNotNullParameter(crashReporting, "$crashReporting");
                et1.h0 simpleProducerFactory = xVar.f60118b;
                Intrinsics.checkNotNullParameter(simpleProducerFactory, "$simpleProducerFactory");
                t.a mediaFormatToImmutableFactory = xVar.f60119c;
                Intrinsics.checkNotNullParameter(mediaFormatToImmutableFactory, "$mediaFormatToImmutableFactory");
                et1.b mediaCodecInputBufferCopier = xVar.f60120d;
                Intrinsics.checkNotNullParameter(mediaCodecInputBufferCopier, "$mediaCodecInputBufferCopier");
                Intrinsics.checkNotNullParameter(formatToDecode, "formatToDecode");
                Intrinsics.checkNotNullParameter(mutableComponentProvider, "mutableComponentProvider");
                h0 h0Var = new h0(formatToDecode, crashReporting, mediaCodecInputBufferCopier, mediaFormatToImmutableFactory, simpleProducerFactory, mutableComponentProvider);
                v0Var.a(h0Var, "Audio Decoder");
                et1.u0 u0Var = (et1.u0) gVar.a();
                l lVar = gVar.f70221j;
                u0Var.a(lVar, h0Var.f70234c);
                et1.u0 u0Var2 = (et1.u0) gVar.a();
                w wVar = gVar.f70218g;
                u0Var2.a(wVar, lVar);
                et1.u0 u0Var3 = (et1.u0) gVar.a();
                v vVar = gVar.f70219h;
                u0Var3.a(vVar, wVar);
                et1.u0 u0Var4 = (et1.u0) gVar.a();
                s0 s0Var = gVar.f70220i;
                u0Var4.a(s0Var, vVar);
                ((et1.u0) gVar.a()).a(h0Var.f70233b, gVar.f70215d);
                ((et1.u0) gVar.a()).a(gVar.f70216e, s0Var);
                ((et1.u0) gVar.a()).a(gVar.f70217f, h0Var.f70235d);
                return;
            case 1:
                nt1.c incomingPacket = (nt1.c) obj;
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                ((q0) eVar).f70324b = incomingPacket;
                return;
            default:
                ((mt1.k) eVar).f88165b = Long.valueOf(((Number) obj).longValue());
                return;
        }
    }

    @Override // mt1.a
    public final void g() {
        switch (this.f70210a) {
            case 0:
            case 1:
                break;
            default:
                mt1.k kVar = (mt1.k) this.f70211b;
                kVar.f88165b = null;
                kVar.f88166c = true;
                break;
        }
    }
}
