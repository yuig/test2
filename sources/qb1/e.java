package qb1;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.f4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f103417j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f103418k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103419i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f103419i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103419i) {
            case 0:
                Navigation it = (Navigation) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it, Navigation.w1(f4.b())));
            default:
                vy0 it2 = (vy0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                it2.v0(Boolean.FALSE);
                wy0 a13 = it2.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
        }
    }
}
