package hz;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70610i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f70611j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(1);
        this.f70610i = i13;
        this.f70611j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h hVar = this.f70611j;
        int i13 = this.f70610i;
        switch (i13) {
            case 0:
                xl1.a event = (xl1.a) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(event, "event");
                        h.j8(hVar, event);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(event, "event");
                        h.j8(hVar, event);
                        break;
                }
                break;
            case 1:
                xl1.a event2 = (xl1.a) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(event2, "event");
                        h.j8(hVar, event2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(event2, "event");
                        h.j8(hVar, event2);
                        break;
                }
                break;
            default:
                om1.l event3 = (om1.l) obj;
                Intrinsics.checkNotNullParameter(event3, "event");
                h.j8(hVar, event3);
                break;
        }
        return Unit.f80348a;
    }
}
