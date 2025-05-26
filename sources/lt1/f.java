package lt1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import et1.k;
import et1.m0;
import ht1.w0;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements mt1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84819a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ et1.e f84821c;

    public /* synthetic */ f(et1.e eVar, int i13) {
        this.f84819a = i13;
        this.f84821c = eVar;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        int i13 = this.f84819a;
        et1.e eVar = this.f84821c;
        switch (i13) {
            case 0:
                k incomingPacket = (k) obj;
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                g gVar = (g) eVar;
                gVar.getClass();
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.flags = incomingPacket.f60039c ? 1 : 0;
                ByteBuffer byteBuffer = incomingPacket.f60038b;
                bufferInfo.offset = byteBuffer.position();
                bufferInfo.size = byteBuffer.remaining();
                long j13 = incomingPacket.f60040d;
                bufferInfo.presentationTimeUs = j13;
                gVar.f84823b.b(gVar.f84824c, byteBuffer, bufferInfo);
                gVar.f84830i.e(Long.valueOf(j13));
                break;
            case 1:
                MediaFormat incomingPacket2 = (MediaFormat) obj;
                Intrinsics.checkNotNullParameter(incomingPacket2, "incomingPacket");
                g gVar2 = (g) eVar;
                gVar2.f84828g = incomingPacket2;
                gVar2.f84823b.a(gVar2.f84824c, incomingPacket2);
                break;
            default:
                ((w0) eVar).f70368b = (float) Math.pow(10.0d, Math.log(((-10069.049997948498d) / (Math.pow(((Number) obj).floatValue() / 1.012373E8d, 0.5000346d) + 1.0d)) + 10069.05d) / Math.log(2.0d));
                break;
        }
    }

    @Override // mt1.a
    public final void g() {
        switch (this.f84819a) {
            case 0:
                this.f84820b = true;
                g gVar = (g) this.f84821c;
                if (gVar.f84825d) {
                    m0 m0Var = gVar.f84823b;
                    if (!m0Var.f60050e) {
                        gVar.f84822a.h("Muxing was stopped before it was started MuxRenderAutoSetup=[" + m0Var + "]");
                    }
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    bufferInfo.flags = 4;
                    bufferInfo.offset = 0;
                    bufferInfo.size = 0;
                    Long l13 = (Long) gVar.f84827f.a();
                    bufferInfo.presentationTimeUs = l13 != null ? l13.longValue() : 0L;
                    m0Var.b(gVar.f84824c, nt1.d.a(0), bufferInfo);
                    gVar.f84830i.f();
                    break;
                }
                break;
            case 1:
                this.f84820b = true;
                break;
            default:
                this.f84820b = true;
                break;
        }
    }

    public final String toString() {
        switch (this.f84819a) {
            case 0:
                return "Mux Packet receivedEndOfInput=[" + this.f84820b + "]";
            case 1:
                return "Set Output Format receivedEndOfInput=[" + this.f84820b + "]";
            default:
                return "Set Volume receivedEndOfInput=[" + this.f84820b + "]";
        }
    }
}
