package c71;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f26760j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f26761k = new f(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(2);
        this.f26762i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26762i) {
            case 0:
                String str = (String) obj;
                String message = (String) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                return str != null ? a.a.D(str, " - ", message) : message;
            default:
                return Unit.f80348a;
        }
    }
}
