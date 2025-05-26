package a11;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f280i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f281j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Navigation f282k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f283l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(n nVar, Navigation navigation, int i13, int i14) {
        super(1);
        this.f280i = i14;
        this.f281j = nVar;
        this.f282k = navigation;
        this.f283l = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f280i;
        int i14 = this.f283l;
        Navigation navigation = this.f282k;
        n nVar = this.f281j;
        switch (i13) {
            case 0:
                nVar.f321b.d(new NavigationImpl(navigation.getF49939a(), ((wy0) obj).getId(), i14, navigation.getF49942d()));
                break;
            default:
                nVar.f321b.d(new NavigationImpl(navigation.getF49939a(), ((v7) obj).getId(), i14, navigation.getF49942d()));
                break;
        }
        return Unit.f80348a;
    }
}
