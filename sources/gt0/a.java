package gt0;

import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f66081j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f66082k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66083i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f66083i = i13;
    }

    public final v7 b(v7 board) {
        switch (this.f66083i) {
            case 0:
                Intrinsics.checkNotNullParameter(board, "board");
                u7 G1 = board.G1();
                G1.b(Boolean.valueOf(!board.z0().booleanValue()));
                v7 a13 = G1.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            default:
                Intrinsics.checkNotNullParameter(board, "board");
                u7 G12 = board.G1();
                G12.b(board.z0());
                v7 a14 = G12.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f66083i) {
        }
        return b((v7) obj);
    }
}
