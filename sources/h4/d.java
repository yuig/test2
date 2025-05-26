package h4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f67529j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f67530k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f67531l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f67532i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f67532i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f67532i) {
            case 0:
                float[] fArr = ((b3.i0) obj).f21330a;
                break;
            case 1:
                break;
            default:
                int i13 = ((n) obj).f67594a;
                break;
        }
        return Unit.f80348a;
    }
}
