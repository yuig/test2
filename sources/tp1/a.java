package tp1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f118770j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f118771k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f118772l = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118773i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f118773i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f118773i) {
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
