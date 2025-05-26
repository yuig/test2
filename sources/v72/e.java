package v72;

import com.pinterest.api.model.f30;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f124408j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f124409k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f124410l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f124411m = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f124412i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f124412i) {
            case 0:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return bs1.c.p0(it);
            case 1:
                i it2 = (i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.f124439c;
            case 2:
                z it3 = (z) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.f124463e;
            default:
                i it4 = (i) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return i.e(it4, q0.f80391a, false, null, 6);
        }
    }
}
