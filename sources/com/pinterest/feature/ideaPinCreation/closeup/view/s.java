package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ic2.d dVar, int i13) {
        super(2, dVar, ic2.d.class, "onInitialPlayerReady", "onInitialPlayerReady(JJ)V", 0);
        this.f46297a = i13;
        if (i13 == 1) {
            super(2, dVar, ic2.d.class, "onPlaybackPositionChanged", "onPlaybackPositionChanged(JJ)V", 0);
        } else if (i13 != 2) {
        } else {
            super(2, dVar, ic2.d.class, "onPollingError", "onPollingError(Ljava/lang/Exception;I)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f46297a;
        switch (i13) {
            case 0:
                long longValue = ((Number) obj).longValue();
                long longValue2 = ((Number) obj2).longValue();
                switch (i13) {
                    case 0:
                        ((ic2.d) this.receiver).z(longValue, longValue2);
                        break;
                    default:
                        ((ic2.d) this.receiver).X(longValue);
                        break;
                }
                break;
            case 1:
                long longValue3 = ((Number) obj).longValue();
                long longValue4 = ((Number) obj2).longValue();
                switch (i13) {
                    case 0:
                        ((ic2.d) this.receiver).z(longValue3, longValue4);
                        break;
                    default:
                        ((ic2.d) this.receiver).X(longValue3);
                        break;
                }
                break;
            default:
                Exception p03 = (Exception) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ic2.d) this.receiver).d0(intValue, p03);
                break;
        }
        return Unit.f80348a;
    }
}
