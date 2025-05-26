package iz;

import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73843i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f73844j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gs0 f73845k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButton f73846l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, gs0 gs0Var, GestaltIconButton gestaltIconButton, int i13) {
        super(1);
        this.f73843i = i13;
        this.f73844j = hVar;
        this.f73845k = gs0Var;
        this.f73846l = gestaltIconButton;
    }

    public final void b(om1.l it) {
        int i13 = this.f73843i;
        GestaltIconButton gestaltIconButton = this.f73846l;
        gs0 gs0Var = this.f73845k;
        h hVar = this.f73844j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0Var = u0.ANKET_DISLIKE_ANSWER;
                int i14 = h.C0;
                hVar.h8(u0Var);
                Integer num = gs0Var.f38133f;
                if (num != null) {
                    h.j8(hVar, gestaltIconButton, num.intValue());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0Var2 = u0.ANKET_LIKE_ANSWER;
                int i15 = h.C0;
                hVar.h8(u0Var2);
                Integer num2 = gs0Var.f38133f;
                if (num2 != null) {
                    h.j8(hVar, gestaltIconButton, num2.intValue());
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f73843i) {
            case 0:
                b((om1.l) obj);
                break;
            default:
                b((om1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
