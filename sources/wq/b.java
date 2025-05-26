package wq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f130769j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f130770k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f130771l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130772i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f130772i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130772i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
