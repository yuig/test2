package lv0;

import com.pinterest.navigation.Navigation;
import com.pinterest.screens.d2;
import fk2.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f84980j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f84981k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f84982l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f84983m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f84984n = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f84985i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84985i) {
            case 0:
                return Unit.f80348a;
            case 1:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return m.f62459a;
            case 2:
                return Unit.f80348a;
            case 3:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), d2.m()));
            default:
                return Unit.f80348a;
        }
    }
}
