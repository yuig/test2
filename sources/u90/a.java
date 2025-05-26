package u90;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.m0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f121170j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f121171k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121172i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f121172i = i13;
    }

    public final Boolean b(Navigation navigation) {
        switch (this.f121172i) {
            case 0:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), (ScreenLocation) m0.f51118b.getValue()));
            default:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), (ScreenLocation) m0.f51119c.getValue()));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f121172i) {
        }
        return b((Navigation) obj);
    }
}
