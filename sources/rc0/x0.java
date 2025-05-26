package rc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107479i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rm1.q f107480j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ om1.e f107481k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ om1.f f107482l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i13, om1.e eVar, om1.f fVar, rm1.q qVar) {
        super(1);
        this.f107479i = i13;
        this.f107480j = qVar;
        this.f107481k = eVar;
        this.f107482l = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f107479i;
        om1.f fVar = this.f107482l;
        rm1.q qVar = this.f107480j;
        om1.e eVar = this.f107481k;
        switch (i13) {
            case 0:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(qVar);
                bind.c(eVar);
                bind.d(fVar);
                bind.b();
                bind.f96679d = fm1.c.VISIBLE;
                return Unit.f80348a;
            case 1:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
                g3.y(gestaltIconButton, new x0(0, eVar, fVar, qVar));
                return gestaltIconButton;
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, this.f107480j, this.f107481k, this.f107482l, null, null, false, 0, 1016);
        }
    }
}
