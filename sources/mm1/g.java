package mm1;

import android.view.View;
import android.widget.ImageView;
import br1.e0;
import br1.f0;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import do2.t2;
import do2.y1;
import dv0.q;
import h32.f1;
import i1.m0;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f87603j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i13) {
        super(3);
        this.f87602i = i13;
        this.f87603j = obj;
    }

    public final void b(View view, float f13, boolean z13) {
        int i13 = this.f87602i;
        Object obj = this.f87603j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                if (z13) {
                    ((t2) ((y1) obj)).i(Float.valueOf(f13));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                if (z13) {
                    ((Function1) ((q) obj).f56383d).invoke(new x62.q(f13));
                    break;
                }
                break;
        }
    }

    public final void e(String event, String action, String phase) {
        int i13 = this.f87602i;
        Object obj = this.f87603j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(phase, "phase");
                ((zq1.o) obj).f142723k.i(event, action, phase);
                return;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(phase, "phase");
                or1.i iVar = ((sr1.l) obj).f115121f;
                if (iVar != null) {
                    iVar.i(event, action, phase);
                    return;
                } else {
                    Intrinsics.r("authLoggingUtils");
                    throw null;
                }
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Envelope c13;
        switch (this.f87602i) {
            case 0:
                jn1.c sheetActionSource = (jn1.c) obj;
                f1 currentEvent = (f1) obj2;
                f1 previousEvent = (f1) obj3;
                Intrinsics.checkNotNullParameter(sheetActionSource, "sheetActionSource");
                Intrinsics.checkNotNullParameter(currentEvent, "currentEvent");
                Intrinsics.checkNotNullParameter(previousEvent, "previousEvent");
                ((k) this.f87603j).getClass();
                return Unit.f80348a;
            case 1:
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                GestaltTextComposer gestaltTextComposer = (GestaltTextComposer) this.f87603j;
                ImageView.ScaleType scaleType = GestaltTextComposer.f49648u;
                gestaltTextComposer.B0();
                gestaltTextComposer.K0();
                gestaltTextComposer.d0(intValue, intValue2, String.valueOf((CharSequence) obj));
                return Unit.f80348a;
            case 2:
                e((String) obj, (String) obj2, (String) obj3);
                return Unit.f80348a;
            case 3:
                m0 AnimatedVisibility = (m0) obj;
                ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                e0.g(((f0) this.f87603j).f23789j, vn1.g.HEADING_600, null, null, (i2.o) obj2, 56, 12);
                return Unit.f80348a;
            case 4:
                e((String) obj, (String) obj2, (String) obj3);
                return Unit.f80348a;
            case 5:
                b((View) obj, ((Number) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                return Unit.f80348a;
            case 6:
                b((View) obj, ((Number) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                return Unit.f80348a;
            default:
                bi2.f state = (bi2.f) obj;
                ((Number) obj2).longValue();
                yh2.c zygote = (yh2.c) obj3;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(zygote, "zygote");
                di2.j jVar = (di2.j) this.f87603j;
                synchronized (jVar.f55099k) {
                    jVar.c();
                    c13 = jVar.f55089a.c(state, zygote);
                }
                return c13;
        }
    }
}
