package nq1;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f91816j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f91817k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f91818l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91819i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f91819i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f91819i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.REGULAR), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91819i) {
            case 0:
                om1.c state = (om1.c) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                break;
        }
        return b((rn1.a) obj);
    }
}
