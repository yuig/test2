package xe1;

import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134679i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ oe1.b f134680j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f134681k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(oe1.b bVar, Function0 function0, int i13) {
        super(1);
        this.f134679i = i13;
        this.f134680j = bVar;
        this.f134681k = function0;
    }

    public final void b(String str) {
        gd1.d dVar;
        gd1.d dVar2;
        int i13 = this.f134679i;
        Function0 function0 = this.f134681k;
        oe1.b loggingData = this.f134680j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(loggingData, "loggingData");
                c0.d.j2(loggingData.f94259f, f1.TAP, loggingData.f94261h, loggingData.f94267n, u0.STRUCTURED_FEED_HEADER_THUMBNAIL, loggingData.f94272s, loggingData.f94255b);
                if (str != null && (dVar = (gd1.d) function0.invoke()) != null) {
                    dVar.O5(str, new HashMap());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(loggingData, "loggingData");
                c0.d.j2(loggingData.f94259f, f1.TAP, loggingData.f94261h, (r16 & 8) != 0 ? null : loggingData.f94267n, (r16 & 16) != 0 ? null : null, loggingData.f94272s, loggingData.f94255b);
                if (str != null && (dVar2 = (gd1.d) function0.invoke()) != null) {
                    dVar2.O5(str, new HashMap());
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f134679i) {
            case 0:
                b((String) obj);
                break;
            default:
                b((String) obj);
                break;
        }
        return Unit.f80348a;
    }
}
