package a10;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import x40.cj;

/* loaded from: classes.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f249j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f250k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f251l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f252m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f253i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f253i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f253i;
        switch (i13) {
            case 0:
                cj it = (cj) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.f132180f;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.f132181g;
                }
            case 1:
                wy0 it2 = (wy0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.F2();
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.j4();
                }
            case 2:
                cj it3 = (cj) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3.f132180f;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3.f132181g;
                }
            default:
                wy0 it4 = (wy0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return it4.F2();
                    default:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return it4.j4();
                }
        }
    }
}
