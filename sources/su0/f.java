package su0;

import a.m2;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115193i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f115194j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i13) {
        super(0);
        this.f115193i = i13;
        this.f115194j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f115193i;
        i iVar = this.f115194j;
        switch (i13) {
            case 0:
                Navigation navigation = iVar.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_IDEA_PIN_OVERLAY_BLOCK_ID") : null;
                return v03 == null ? "" : v03;
            default:
                return new m2(iVar, 11);
        }
    }
}
