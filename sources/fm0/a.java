package fm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import om1.q;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f62568j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f62569k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62570i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f62570i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62570i;
        switch (i13) {
            case 0:
                q bind = (q) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(rm1.q.MAGIC_PEN);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(rm1.q.SPEECH_OUTLINE);
                        break;
                }
                break;
            default:
                q bind2 = (q) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(rm1.q.MAGIC_PEN);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(rm1.q.SPEECH_OUTLINE);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
