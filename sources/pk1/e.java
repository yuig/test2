package pk1;

import com.pinterest.api.model.wy0;
import ey.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f100541j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f100542k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(2);
        this.f100543i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f100543i) {
            case 0:
                Intrinsics.checkNotNullParameter((wy0) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((Function0) obj2, "<anonymous parameter 1>");
                break;
            default:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((wy0) obj, "<anonymous parameter 0>");
                new h0(0, 0).i();
                break;
        }
        return Unit.f80348a;
    }
}
