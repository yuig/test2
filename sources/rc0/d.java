package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107292i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c1 f107293j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c1 c1Var, int i13) {
        super(1);
        this.f107292i = i13;
        this.f107293j = c1Var;
    }

    public final View b(Context context) {
        int i13 = this.f107292i;
        c1 c1Var = this.f107293j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, ql1.f.VERIFIED_PINNER, false, false, 20);
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, ql1.f.VERIFIED_MERCHANT, false, false, 20);
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, ql1.f.VERIFIED_PINNER, false, false, 16);
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, ql1.f.VERIFIED_MERCHANT, false, false, 16);
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, ql1.f.PINNER, true, false, 16);
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, ql1.f.PINNER, false, false, 16);
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, null, false, true, 22);
            case 7:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.g(this.f107293j, context, null, false, true, 6);
            case 8:
                Intrinsics.checkNotNullParameter(context, "context");
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(c1.a(c1Var, context, "View 1"));
                linearLayout.addView(new GestaltDivider(6, context, (AttributeSet) null));
                linearLayout.addView(c1.a(c1Var, context, "View 2"));
                return linearLayout;
            case 9:
                Intrinsics.checkNotNullParameter(context, "context");
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.addView(c1.a(c1Var, context, "View 1"));
                GestaltDivider gestaltDivider = new GestaltDivider(6, context, (AttributeSet) null);
                pe.i.g(gestaltDivider, n0.f107334l);
                gestaltDivider.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                linearLayout2.addView(gestaltDivider);
                linearLayout2.addView(c1.a(c1Var, context, "View 2"));
                return linearLayout2;
            case 10:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.c(c1Var, context, new GestaltIndicator(6, context, (AttributeSet) null));
            case 11:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.c(c1Var, context, new GestaltIndicator(6, context, (AttributeSet) null).i(o0.F));
            case 12:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.c(c1Var, context, new GestaltIndicator(6, context, (AttributeSet) null).i(o0.G));
            case 13:
                Intrinsics.checkNotNullParameter(context, "context");
                return c1.c(c1Var, context, new GestaltIndicator(6, context, (AttributeSet) null).i(o0.H));
            case 14:
            case 16:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSelectList gestaltSelectList = new GestaltSelectList(context);
                kg.p.n(gestaltSelectList, new d(c1Var, 20));
                return gestaltSelectList;
            case 15:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSelectList gestaltSelectList2 = new GestaltSelectList(context);
                kg.p.n(gestaltSelectList2, new d(c1Var, 14));
                return gestaltSelectList2;
            case 17:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSelectList gestaltSelectList3 = new GestaltSelectList(context);
                kg.p.n(gestaltSelectList3, new d(c1Var, 16));
                return gestaltSelectList3;
            case 19:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSelectList gestaltSelectList4 = new GestaltSelectList(context);
                kg.p.n(gestaltSelectList4, new d(c1Var, 18));
                return gestaltSelectList4;
        }
    }

    public final void e(fn1.o bind) {
        int i13 = this.f107292i;
        c1 c1Var = this.f107293j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f62714b = c1.b(c1Var);
                bind.f62718f = new u50.k0(oc0.q.component_select_list_hint);
                bind.f62716d = new u50.k0(oc0.q.component_text_field_helper_text);
                bind.f62715c = new u50.k0(oc0.q.component_select_list_label_text);
                break;
            case 15:
            case 17:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f62713a = 2;
                bind.f62714b = c1.b(c1Var);
                bind.f62718f = new u50.k0(oc0.q.component_select_list_hint);
                bind.f62716d = new u50.k0(oc0.q.component_select_list_error_text);
                bind.f62715c = new u50.k0(oc0.q.component_select_list_label_text);
                fn1.f variant = fn1.f.ERROR;
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f62719g = variant;
                break;
            case 16:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f62713a = 3;
                bind.f62714b = c1.b(c1Var);
                bind.f62718f = new u50.k0(oc0.q.component_select_list_hint);
                bind.f62716d = new u50.k0(oc0.q.component_text_field_helper_text);
                bind.f62715c = new u50.k0(oc0.q.component_select_list_label_text);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f62714b = c1.b(c1Var);
                bind.f62718f = new u50.k0(oc0.q.component_select_list_hint);
                bind.f62716d = new u50.k0(oc0.q.component_text_field_helper_text);
                bind.f62715c = new u50.k0(oc0.q.component_select_list_label_text);
                bind.f62720h = false;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f107292i) {
            case 0:
                return b((Context) obj);
            case 1:
                return b((Context) obj);
            case 2:
                return b((Context) obj);
            case 3:
                return b((Context) obj);
            case 4:
                return b((Context) obj);
            case 5:
                return b((Context) obj);
            case 6:
                return b((Context) obj);
            case 7:
                return b((Context) obj);
            case 8:
                return b((Context) obj);
            case 9:
                return b((Context) obj);
            case 10:
                return b((Context) obj);
            case 11:
                return b((Context) obj);
            case 12:
                return b((Context) obj);
            case 13:
                return b((Context) obj);
            case 14:
                e((fn1.o) obj);
                return Unit.f80348a;
            case 15:
                return b((Context) obj);
            case 16:
                e((fn1.o) obj);
                return Unit.f80348a;
            case 17:
                return b((Context) obj);
            case 18:
                e((fn1.o) obj);
                return Unit.f80348a;
            case 19:
                return b((Context) obj);
            case 20:
                e((fn1.o) obj);
                return Unit.f80348a;
            default:
                return b((Context) obj);
        }
    }
}
