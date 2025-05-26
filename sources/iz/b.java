package iz;

import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73828i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f73829j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gs0 f73830k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, gs0 gs0Var, int i13) {
        super(1);
        this.f73828i = i13;
        this.f73829j = cVar;
        this.f73830k = gs0Var;
    }

    public final void b(om1.l it) {
        int i13 = this.f73828i;
        gs0 gs0Var = this.f73830k;
        c cVar = this.f73829j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0Var = u0.ANKET_NEUTRAL_EMOJI_ANSWER;
                int i14 = c.B0;
                cVar.h8(u0Var);
                Integer num = gs0Var.f38133f;
                if (num != null) {
                    int intValue = num.intValue();
                    GestaltIconButton gestaltIconButton = cVar.f73836y0;
                    if (gestaltIconButton != null) {
                        c.j8(cVar, gestaltIconButton, intValue);
                        return;
                    } else {
                        Intrinsics.r("imgAnswerOptionMeh");
                        throw null;
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0Var2 = u0.ANKET_SAD_EMOJI_ANSWER;
                int i15 = c.B0;
                cVar.h8(u0Var2);
                Integer num2 = gs0Var.f38133f;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    GestaltIconButton gestaltIconButton2 = cVar.f73835x0;
                    if (gestaltIconButton2 != null) {
                        c.j8(cVar, gestaltIconButton2, intValue2);
                        return;
                    } else {
                        Intrinsics.r("imgAnswerOptionSad");
                        throw null;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0Var3 = u0.ANKET_HAPPY_EMOJI_ANSWER;
                int i16 = c.B0;
                cVar.h8(u0Var3);
                Integer num3 = gs0Var.f38133f;
                if (num3 != null) {
                    int intValue3 = num3.intValue();
                    GestaltIconButton gestaltIconButton3 = cVar.f73837z0;
                    if (gestaltIconButton3 != null) {
                        c.j8(cVar, gestaltIconButton3, intValue3);
                        return;
                    } else {
                        Intrinsics.r("imgAnswerOptionHappy");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f73828i) {
            case 0:
                b((om1.l) obj);
                break;
            case 1:
                b((om1.l) obj);
                break;
            default:
                b((om1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
