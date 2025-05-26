package ht1;

import android.media.MediaFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements mt1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70284a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f70285b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f70286c;

    @Override // mt1.a
    public final void a(Object obj) {
        switch (this.f70284a) {
            case 0:
                h((ft1.a) obj);
                break;
            case 1:
                h((ft1.a) obj);
                break;
            case 2:
                h((ft1.a) obj);
                break;
            default:
                MediaFormat incomingPacket = (MediaFormat) obj;
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                Function1 function1 = this.f70285b;
                if (function1 != null) {
                    function1.invoke(e0.t.r(incomingPacket));
                    break;
                }
                break;
        }
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        switch (this.f70284a) {
            case 0:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f70285b = producePacketCallback;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f70285b = producePacketCallback;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f70285b = producePacketCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f70285b = producePacketCallback;
                break;
        }
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        switch (this.f70284a) {
            case 0:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f70286c = doneProducingCallback;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f70286c = doneProducingCallback;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f70286c = doneProducingCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f70286c = doneProducingCallback;
                break;
        }
    }

    @Override // mt1.a
    public final void g() {
        switch (this.f70284a) {
            case 0:
                Function0 function0 = this.f70286c;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                Function0 function02 = this.f70286c;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
            case 2:
                Function0 function03 = this.f70286c;
                if (function03 != null) {
                    function03.invoke();
                    break;
                }
                break;
            default:
                Function0 function04 = this.f70286c;
                if (function04 != null) {
                    function04.invoke();
                    break;
                }
                break;
        }
    }

    public final void h(ft1.a incomingPacket) {
        switch (this.f70284a) {
            case 0:
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                Function1 function1 = this.f70285b;
                if (function1 != null) {
                    function1.invoke(new et1.k(incomingPacket.f62934b, incomingPacket.f62935c, incomingPacket.f62936d, incomingPacket.f62937e));
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                Function1 function12 = this.f70285b;
                if (function12 != null) {
                    function12.invoke(incomingPacket.f62934b);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                Function1 function13 = this.f70285b;
                if (function13 != null) {
                    function13.invoke(Long.valueOf(incomingPacket.f62937e));
                    break;
                }
                break;
        }
    }
}
