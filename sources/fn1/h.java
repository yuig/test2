package fn1;

import android.content.Context;
import android.widget.AutoCompleteTextView;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62689i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSelectList f62690j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f62691k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(GestaltSelectList gestaltSelectList, b bVar, int i13) {
        super(1);
        this.f62689i = i13;
        this.f62690j = gestaltSelectList;
        this.f62691k = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
    
        if (r1 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(u50.i0 r25) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fn1.h.b(u50.i0):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        int intValue;
        int i13 = this.f62689i;
        GestaltSelectList gestaltSelectList = this.f62690j;
        b bVar = this.f62691k;
        switch (i13) {
            case 0:
                b newState = (b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                f fVar = GestaltSelectList.f49556m;
                gestaltSelectList.a0(bVar, newState);
                break;
            case 1:
                b((i0) obj);
                break;
            case 2:
                ((Boolean) obj).getClass();
                boolean z13 = bVar.f62683h;
                f fVar2 = GestaltSelectList.f49556m;
                boolean isEnabled = gestaltSelectList.T().isEnabled();
                gestaltSelectList.T().setEnabled(z13);
                if (!z13) {
                    int i14 = p.select_list_box_stroke_color;
                    int i15 = eo1.a.comp_selectlist_disabled_border_weight;
                    int i16 = eo1.a.comp_selectlist_disabled_field_icon_color;
                    int i17 = eo1.a.comp_selectlist_disabled_background_color;
                    int i18 = eo1.a.comp_selectlist_disabled_field_text_color;
                    rm1.n nVar = GestaltSelectList.f49558o.f108700a;
                    Context context = gestaltSelectList.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int drawableRes = nVar.drawableRes(context);
                    int i19 = eo1.a.comp_selectlist_disabled_field_text_color;
                    gestaltSelectList.k0(Integer.valueOf(i17), Integer.valueOf(i14), Integer.valueOf(drawableRes), Integer.valueOf(i16), Integer.valueOf(i18), Integer.valueOf(i15), i19, Integer.valueOf(i19));
                } else if (!isEnabled) {
                    gestaltSelectList.d0();
                }
                break;
            case 3:
                f it = (f) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f fVar3 = GestaltSelectList.f49556m;
                gestaltSelectList.getClass();
                int i23 = g.f62687a[bVar.f62682g.ordinal()];
                if (i23 == 1) {
                    gestaltSelectList.d0();
                    gestaltSelectList.g0(vn1.c.SUBTLE, rm1.c.DEFAULT, null);
                } else if (i23 == 2) {
                    int i24 = p.select_list_box_stroke_error;
                    int i25 = eo1.a.comp_selectlist_error_field_text_color;
                    int i26 = eo1.a.comp_selectlist_error_border_weight;
                    int i27 = eo1.a.comp_selectlist_error_background_color;
                    rm1.n nVar2 = GestaltSelectList.f49558o.f108700a;
                    Context context2 = gestaltSelectList.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltSelectList.o0(gestaltSelectList, Integer.valueOf(i27), Integer.valueOf(i24), Integer.valueOf(nVar2.drawableRes(context2)), null, Integer.valueOf(i25), Integer.valueOf(i26), 200);
                    gestaltSelectList.g0(vn1.c.ERROR, rm1.c.ERROR, new rm1.e(rm1.n.WORKFLOW_STATUS_PROBLEM));
                }
                break;
            case 4:
                ((Number) obj).intValue();
                gestaltSelectList.setId(bVar.f62686k);
                break;
            case 5:
                fm1.c it2 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gestaltSelectList.setVisibility(bVar.f62684i.getVisibility());
                break;
            case 6:
                List list = bVar.f62677b;
                if (list != null && (num = bVar.f62676a) != null && (intValue = num.intValue()) >= 0 && intValue < list.size()) {
                    f fVar4 = GestaltSelectList.f49556m;
                    AutoCompleteTextView X = gestaltSelectList.X();
                    i0 i0Var = (i0) list.get(num.intValue());
                    Context context3 = gestaltSelectList.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    X.setText((CharSequence) i0Var.a(context3).toString(), false);
                }
                break;
            case 7:
                b((i0) obj);
                break;
            case 8:
                b((i0) obj);
                break;
            default:
                b((i0) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, GestaltSelectList gestaltSelectList) {
        super(1);
        this.f62689i = 6;
        this.f62691k = bVar;
        this.f62690j = gestaltSelectList;
    }
}
