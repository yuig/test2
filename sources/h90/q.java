package h90;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f68283j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f68284k = new q(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q f68285l = new q(2);

    /* renamed from: m, reason: collision with root package name */
    public static final q f68286m = new q(3);

    /* renamed from: n, reason: collision with root package name */
    public static final q f68287n = new q(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68288i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(1);
        this.f68288i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f68288i;
        switch (i13) {
            case 0:
                m0 vmState = (m0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        return vmState.f68274a;
                    default:
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        return vmState.f68274a;
                }
            case 1:
                m0 vmState2 = (m0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(vmState2, "vmState");
                        return vmState2.f68274a;
                    default:
                        Intrinsics.checkNotNullParameter(vmState2, "vmState");
                        return vmState2.f68274a;
                }
            case 2:
                l0 vmState3 = (l0) obj;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                return vmState3.f68270a;
            case 3:
                b vmState4 = (b) obj;
                Intrinsics.checkNotNullParameter(vmState4, "vmState");
                return vmState4.f68237a;
            default:
                a vmState5 = (a) obj;
                Intrinsics.checkNotNullParameter(vmState5, "vmState");
                return vmState5.f68232a;
        }
    }
}
