package ht1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends mt1.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70265d;

    public l(int i13) {
        this.f70265d = i13;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        switch (this.f70265d) {
            case 0:
                nt1.c incomingPacket = (nt1.c) obj;
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                ft1.i pcmType = ft1.i.Float;
                Intrinsics.checkNotNullParameter(pcmType, "pcmType");
                int i13 = ft1.c.f62941a[pcmType.ordinal()];
                int i14 = 3;
                if (i13 != 1) {
                    if (i13 == 2) {
                        i14 = 2;
                    } else if (i13 != 3) {
                        i14 = 4;
                        if (i13 == 4) {
                            i14 = 22;
                        } else if (i13 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i14 = 21;
                    }
                }
                e(ft1.b.a(incomingPacket, false, y0.b(new Pair("pcm-encoding", Integer.valueOf(i14))), 26));
                return;
            case 1:
                et1.k incomingPacket2 = (et1.k) obj;
                Intrinsics.checkNotNullParameter(incomingPacket2, "incomingPacket");
                String c13 = incomingPacket2.f60037a.c();
                if (c13 == null) {
                    throw new NullPointerException("MediaFormat is missing a MIME-type");
                }
                if (!nt1.d.e(c13)) {
                    throw new RuntimeException(a.a.k("\"MIME-type must be audio, but is [", c13, "]"));
                }
                int remaining = incomingPacket2.f60038b.remaining();
                nt1.c cVar = incomingPacket2.f60037a;
                e(new ft1.a(l3.c.x(remaining, cVar), cVar, incomingPacket2.f60038b, incomingPacket2.f60039c, incomingPacket2.f60040d));
                return;
            default:
                e(obj);
                return;
        }
    }

    @Override // mt1.i, mt1.a
    public final void g() {
        switch (this.f70265d) {
            case 2:
                break;
            default:
                super.g();
                break;
        }
    }

    @Override // mt1.i
    public final String toString() {
        switch (this.f70265d) {
            case 1:
                return "MediaPacket -> AudioPacket Converter";
            case 2:
                return "DoNotSendDoneProducingCallback";
            default:
                return super.toString();
        }
    }
}
