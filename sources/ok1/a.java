package ok1;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j */
    public static final a f95450j = new a(0);

    /* renamed from: k */
    public static final a f95451k = new a(1);

    /* renamed from: i */
    public final /* synthetic */ int f95452i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f95452i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f95452i) {
            case 0:
                Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
                return Unit.f80348a;
            default:
                wy0 it = (wy0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
        }
    }
}
