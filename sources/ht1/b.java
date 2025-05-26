package ht1;

import android.media.MediaFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements mt1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70146a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f70147b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f70148c;

    public /* synthetic */ b(int i13) {
        this.f70146a = i13;
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        switch (this.f70146a) {
            case 0:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f70147b = producePacketCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                this.f70147b = producePacketCallback;
                break;
        }
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        switch (this.f70146a) {
            case 0:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f70148c = doneProducingCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                this.f70148c = doneProducingCallback;
                break;
        }
    }

    @Override // mt1.e
    public final void e(Object obj) {
        switch (this.f70146a) {
            case 0:
                MediaFormat packet = (MediaFormat) obj;
                Intrinsics.checkNotNullParameter(packet, "packet");
                Function1 function1 = this.f70147b;
                if (function1 != null) {
                    function1.invoke(packet);
                    break;
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                Function1 function12 = this.f70147b;
                if (function12 != null) {
                    function12.invoke(Long.valueOf(longValue));
                    break;
                }
                break;
        }
    }

    @Override // mt1.e
    public final void f() {
        switch (this.f70146a) {
            case 0:
                Function0 function0 = this.f70148c;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                Function0 function02 = this.f70148c;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
        }
    }
}
