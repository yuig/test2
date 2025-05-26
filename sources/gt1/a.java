package gt1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements mt1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66101a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f66102b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f66103c;

    /* renamed from: d, reason: collision with root package name */
    public Object f66104d;

    public a() {
    }

    @Override // mt1.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f66101a) {
            case 0:
                h((ft1.a) obj);
                break;
            default:
                h((ft1.a) obj);
                break;
        }
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        switch (this.f66101a) {
            case 0:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f66102b = producePacketCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f66102b = producePacketCallback;
                break;
        }
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        switch (this.f66101a) {
            case 0:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f66103c = doneProducingCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f66103c = doneProducingCallback;
                break;
        }
    }

    @Override // mt1.a
    public final void g() {
        switch (this.f66101a) {
            case 0:
                if (!((c) this.f66104d).f66109c.isEmpty()) {
                    ((c) this.f66104d).a();
                    break;
                } else {
                    Function0 function0 = this.f66103c;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    ((c) this.f66104d).f66112f.f();
                    ((c) this.f66104d).f66113g.f();
                    break;
                }
            default:
                Function0 function02 = this.f66103c;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
        }
    }

    public final void h(ft1.a incomingPacket) {
        switch (this.f66101a) {
            case 0:
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                Function1 function1 = this.f66102b;
                if (function1 != null) {
                    function1.invoke(incomingPacket);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                jt1.d dVar = new jt1.d(incomingPacket.f62937e, incomingPacket.c());
                this.f66104d = dVar;
                Function1 function12 = this.f66102b;
                if (function12 != null) {
                    function12.invoke(dVar);
                    break;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f66101a) {
            case 1:
                return "Extract Audio Packet Time Span: Last span [" + ((jt1.d) this.f66104d) + "]";
            default:
                return super.toString();
        }
    }

    public a(c cVar) {
        this.f66104d = cVar;
    }
}
