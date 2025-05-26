package yb1;

import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138578i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSwitch f138579j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f138580k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(GestaltSwitch gestaltSwitch, boolean z13, int i13) {
        super(1);
        this.f138578i = i13;
        this.f138579j = gestaltSwitch;
        this.f138580k = z13;
    }

    public final void b(boolean z13) {
        int i13 = this.f138578i;
        boolean z14 = this.f138580k;
        GestaltSwitch gestaltSwitch = this.f138579j;
        switch (i13) {
            case 0:
                if (z13) {
                    z14 = !gestaltSwitch.l().f96708a;
                }
                gestaltSwitch.i(new u81.h(z14, 26));
                break;
            default:
                if (z13) {
                    z14 = !gestaltSwitch.l().f96708a;
                }
                gestaltSwitch.i(new u81.h(z14, 27));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f138578i) {
            case 0:
                b(((Boolean) obj).booleanValue());
                break;
            default:
                b(((Boolean) obj).booleanValue());
                break;
        }
        return Unit.f80348a;
    }
}
