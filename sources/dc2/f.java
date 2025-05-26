package dc2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class f extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object obj, int i13) {
        super(2, obj, ic2.c.class, "onInitialPlayerReady", "onInitialPlayerReady(JJ)V", 0);
        this.f54406a = i13;
        if (i13 == 1) {
            super(2, obj, ic2.c.class, "onPlaybackPositionChanged", "onPlaybackPositionChanged(JJ)V", 0);
        } else if (i13 != 2) {
        } else {
            super(2, obj, ic2.c.class, "onPollingError", "onPollingError(Ljava/lang/Exception;I)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f54406a;
        switch (i13) {
            case 0:
                long longValue = ((Number) obj).longValue();
                long longValue2 = ((Number) obj2).longValue();
                switch (i13) {
                    case 0:
                        ((ic2.c) this.receiver).z(longValue, longValue2);
                        break;
                    default:
                        ((ic2.c) this.receiver).X(longValue);
                        break;
                }
                break;
            case 1:
                long longValue3 = ((Number) obj).longValue();
                long longValue4 = ((Number) obj2).longValue();
                switch (i13) {
                    case 0:
                        ((ic2.c) this.receiver).z(longValue3, longValue4);
                        break;
                    default:
                        ((ic2.c) this.receiver).X(longValue3);
                        break;
                }
                break;
            default:
                Exception p03 = (Exception) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ic2.c) this.receiver).d0(intValue, p03);
                break;
        }
        return Unit.f80348a;
    }
}
