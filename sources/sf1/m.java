package sf1;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112655i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f112656j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(s sVar, int i13) {
        super(1);
        this.f112655i = i13;
        this.f112656j = sVar;
    }

    public final void b(View view) {
        int i13 = this.f112655i;
        s sVar = this.f112656j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                sVar.removeView(view);
                w0 w0Var = sVar.C;
                if (w0Var != null) {
                    w0Var.f112788a.f112559r.Z();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                sVar.removeView(view);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                sVar.removeView(view);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f112655i;
        s sVar = this.f112656j;
        switch (i13) {
            case 0:
                b((View) obj);
                return Unit.f80348a;
            case 1:
                b((View) obj);
                return Unit.f80348a;
            case 2:
                b((View) obj);
                return Unit.f80348a;
            case 3:
                sp0.d tapPosition = (sp0.d) obj;
                Intrinsics.checkNotNullParameter(tapPosition, "tapPosition");
                Context context = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Context context2 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                hh1.d dVar = new hh1.d(context, tapPosition, hh1.l.a(context2), new hh1.r(bs1.c.f2(sVar, uq1.b.idea_pin_tooltip_board_sticker_upgrade_error)), new m(sVar, 2), hf0.b.f69002b);
                sVar.n();
                sVar.I = dVar;
                sVar.addView(dVar);
                return Unit.f80348a;
            default:
                String id3 = (String) obj;
                Intrinsics.checkNotNullParameter(id3, "id");
                zf1.e eVar = sVar.f112705l;
                if (eVar != null) {
                    return eVar.c(id3);
                }
                Intrinsics.r("fontManager");
                throw null;
        }
    }
}
