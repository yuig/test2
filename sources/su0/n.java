package su0;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function0;
import pu0.z;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115205i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f115206j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(0);
        this.f115205i = i13;
        this.f115206j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f115205i;
        o oVar = this.f115206j;
        switch (i13) {
            case 0:
                Navigation navigation = oVar.I;
                return (navigation == null || navigation.S("IntentExtra.KEY_ENTER_TRANSITION_SELECTION", true)) ? z.Enter : z.Exit;
            default:
                Navigation navigation2 = oVar.I;
                String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_IDEA_PIN_OVERLAY_BLOCK_ID") : null;
                return v03 == null ? "" : v03;
        }
    }
}
