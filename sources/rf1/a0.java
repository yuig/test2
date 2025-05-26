package rf1;

import h32.a4;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f107731j = new a0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f107732k = new a0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f107733l = new a0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107734i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i13) {
        super(0);
        this.f107734i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f107734i) {
            case 0:
                return new a4[]{a4.FEED_CREATOR_BUBBLE, a4.FEED_NOTIFICATION_CREATOR_BUBBLE};
            case 1:
                return r0.f107894c;
            default:
                return r0.f107895d;
        }
    }
}
