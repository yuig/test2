package o90;

import com.pinterest.navigation.Navigation;
import com.pinterest.screens.l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f93779j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f93780k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93781i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f93781i = i13;
    }

    public final Boolean b(Navigation it) {
        switch (this.f93781i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "navigation");
                break;
        }
        return Boolean.valueOf(Intrinsics.d(it.getF49939a(), l0.a()));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f93781i) {
        }
        return b((Navigation) obj);
    }
}
