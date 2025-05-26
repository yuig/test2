package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107394i;

    /* renamed from: j, reason: collision with root package name */
    public static final r0 f107377j = new r0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r0 f107378k = new r0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final r0 f107379l = new r0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final r0 f107380m = new r0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final r0 f107381n = new r0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final r0 f107382o = new r0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final r0 f107383p = new r0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final r0 f107384q = new r0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final r0 f107385r = new r0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final r0 f107386s = new r0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final r0 f107387t = new r0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final r0 f107388u = new r0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final r0 f107389v = new r0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final r0 f107390w = new r0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final r0 f107391x = new r0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final r0 f107392y = new r0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final r0 f107393z = new r0(16);
    public static final r0 A = new r0(17);
    public static final r0 B = new r0(18);
    public static final r0 C = new r0(19);
    public static final r0 D = new r0(20);
    public static final r0 E = new r0(21);
    public static final r0 F = new r0(22);
    public static final r0 G = new r0(23);
    public static final r0 H = new r0(24);
    public static final r0 I = new r0(25);

    /* renamed from: J, reason: collision with root package name */
    public static final r0 f107376J = new r0(26);
    public static final r0 K = new r0(27);
    public static final r0 L = new r0(28);
    public static final r0 M = new r0(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i13) {
        super(1);
        this.f107394i = i13;
    }

    public final View b(Context ctx) {
        switch (this.f107394i) {
            case 1:
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                return new GestaltModalAlert(ctx, new xm1.e(u50.g0.b(new String[0], oc0.q.component_modal_alert_component_title), u50.g0.b(new String[0], oc0.q.component_modal_alert_component_body), u50.g0.b(new String[0], oc0.q.component_modal_alert_action_bt_text), false, null, null, false, null, false, 1016, 0));
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 20:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(ctx, "context");
                GestaltSearchField gestaltSearchField = new GestaltSearchField(6, ctx, (AttributeSet) null);
                c0.d.j(gestaltSearchField, f107376J);
                return gestaltSearchField;
            case 3:
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                return new GestaltModalAlert(ctx, new xm1.e(u50.g0.b(new String[0], oc0.q.component_modal_alert_component_title), u50.g0.b(new String[0], oc0.q.component_modal_alert_component_body), u50.g0.b(new String[0], oc0.q.component_modal_alert_action_bt_text), false, null, null, false, null, false, 1008, 0));
            case 5:
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                return new GestaltModalAlert(ctx, new xm1.e(u50.g0.b(new String[0], oc0.q.component_modal_alert_component_title), u50.g0.b(new String[0], oc0.q.component_modal_alert_component_body), u50.g0.b(new String[0], oc0.q.component_modal_alert_action_bt_text), false, xm1.d.VERTICAL, null, false, null, false, 1000, 0));
            case 7:
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                return new GestaltModalAlert(ctx, new xm1.e(u50.g0.b(new String[0], oc0.q.component_modal_alert_component_title), u50.g0.b(new String[0], oc0.q.component_modal_alert_component_body), u50.g0.b(new String[0], oc0.q.component_modal_alert_action_bt_text), false, null, null, true, null, false, 952, 0));
            case 10:
                Intrinsics.checkNotNullParameter(ctx, "context");
                return new GestaltPopoverMessage(6, ctx, (AttributeSet) null).T(f107386s);
            case 12:
                Intrinsics.checkNotNullParameter(ctx, "context");
                return new GestaltPopoverMessage(6, ctx, (AttributeSet) null).T(f107388u);
            case 14:
                Intrinsics.checkNotNullParameter(ctx, "context");
                return new GestaltPopoverMessage(6, ctx, (AttributeSet) null).T(f107390w);
            case 16:
                Intrinsics.checkNotNullParameter(ctx, "context");
                return new GestaltPopoverMessage(6, ctx, (AttributeSet) null).T(f107392y);
            case 18:
                Intrinsics.checkNotNullParameter(ctx, "context");
                return new GestaltPopoverMessage(6, ctx, (AttributeSet) null).T(A);
            case 19:
                Intrinsics.checkNotNullParameter(ctx, "context");
                GestaltPopoverMessage gestaltPopoverMessage = new GestaltPopoverMessage(6, ctx, (AttributeSet) null);
                kh2.b0.P(gestaltPopoverMessage, new q0.d(ctx, 5));
                return gestaltPopoverMessage;
            case 21:
                Intrinsics.checkNotNullParameter(ctx, "context");
                GestaltPopoverMessage gestaltPopoverMessage2 = new GestaltPopoverMessage(6, ctx, (AttributeSet) null);
                kh2.b0.P(gestaltPopoverMessage2, D);
                return gestaltPopoverMessage2;
            case 22:
                Intrinsics.checkNotNullParameter(ctx, "context");
                GestaltPopoverMessage gestaltPopoverMessage3 = new GestaltPopoverMessage(6, ctx, (AttributeSet) null);
                kh2.b0.P(gestaltPopoverMessage3, new q0.d(ctx, 6));
                return gestaltPopoverMessage3;
            case 24:
                Intrinsics.checkNotNullParameter(ctx, "context");
                GestaltSearchField gestaltSearchField2 = new GestaltSearchField(6, ctx, (AttributeSet) null);
                c0.d.j(gestaltSearchField2, G);
                return gestaltSearchField2;
        }
    }

    public final Boolean e(Context $receiver) {
        switch (this.f107394i) {
            case 0:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 2:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 4:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 6:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 8:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 25:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            default:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
        }
        return Boolean.valueOf(!dl2.b.T1($receiver));
    }

    public final ym1.c f(ym1.c state) {
        switch (this.f107394i) {
            case 9:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter("This is a popover message", "string");
                List b13 = kotlin.collections.e0.b(new u50.f0("This is a popover message"));
                Intrinsics.checkNotNullParameter("Got it", "string");
                return ym1.c.e(state, b13, new ym1.d(new u50.f0("Got it"), fm1.c.VISIBLE), null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
            case 10:
            case 12:
            case 14:
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter("This is a popover message, it's a floating container that can be used to educate users", "string");
                List b14 = kotlin.collections.e0.b(new u50.f0("This is a popover message, it's a floating container that can be used to educate users"));
                Intrinsics.checkNotNullParameter("Got it", "string");
                return ym1.c.e(state, b14, new ym1.d(new u50.f0("Got it"), fm1.c.VISIBLE), ym1.e.LEFT_CENTER, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
            case 11:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter("This is a popover message", "string");
                return ym1.c.e(state, kotlin.collections.f0.j(new u50.f0("This is a popover message"), ep.b.x("It's a floating container", "string", "It's a floating container")), null, ym1.e.RIGHT_BOTTOM, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN);
            case 13:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter("This is a popover message", "string");
                List b15 = kotlin.collections.e0.b(new u50.f0("This is a popover message"));
                Intrinsics.checkNotNullParameter("Got it", "string");
                return ym1.c.e(state, b15, new ym1.d(new u50.f0("Got it"), fm1.c.VISIBLE), ym1.e.TOP_RIGHT, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
            case 15:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter("This is a popover message", "string");
                u50.f0 f0Var = new u50.f0("This is a popover message");
                Intrinsics.checkNotNullParameter("It's a floating container", "string");
                u50.f0 f0Var2 = new u50.f0("It's a floating container");
                Intrinsics.checkNotNullParameter("That can be used to educate users", "string");
                List j13 = kotlin.collections.f0.j(f0Var, f0Var2, new u50.f0("That can be used to educate users"));
                Intrinsics.checkNotNullParameter("Got it", "string");
                return ym1.c.e(state, j13, new ym1.d(new u50.f0("Got it"), fm1.c.VISIBLE), ym1.e.BOTTOM_RIGHT, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
        }
    }

    public final void h(cn1.n bind) {
        switch (this.f107394i) {
            case 23:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c();
                bind.d(oc0.q.component_text_field_label_text);
                bind.b(oc0.q.component_text_field_helper_text);
                bind.f28214f = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                bind.e(dn1.e.LEADING_ICON_BUTTON);
                bind.f28217i = new cn1.c(rm1.q.ARROW_BACK, (om1.f) null, (u50.i0) null, dn1.a.LEADING_ICON_BUTTON, 22);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c();
                bind.d(oc0.q.component_text_field_label_text);
                bind.b(oc0.q.component_text_field_helper_text);
                bind.f28214f = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                bind.e(dn1.e.TRAILING_BUTTON);
                Intrinsics.checkNotNullParameter("Cancel", "string");
                bind.f28218j = new cn1.g(new u50.f0("Cancel"));
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c();
                bind.d(oc0.q.component_text_field_label_text);
                bind.b(oc0.q.component_text_field_helper_text);
                bind.f28214f = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                bind.e(dn1.e.END_ACTION_BUTTONS_DEFAULT);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107394i) {
            case 0:
                return e((Context) obj);
            case 1:
                return b((Context) obj);
            case 2:
                return e((Context) obj);
            case 3:
                return b((Context) obj);
            case 4:
                return e((Context) obj);
            case 5:
                return b((Context) obj);
            case 6:
                return e((Context) obj);
            case 7:
                return b((Context) obj);
            case 8:
                return e((Context) obj);
            case 9:
                return f((ym1.c) obj);
            case 10:
                return b((Context) obj);
            case 11:
                return f((ym1.c) obj);
            case 12:
                return b((Context) obj);
            case 13:
                return f((ym1.c) obj);
            case 14:
                return b((Context) obj);
            case 15:
                return f((ym1.c) obj);
            case 16:
                return b((Context) obj);
            case 17:
                return f((ym1.c) obj);
            case 18:
                return b((Context) obj);
            case 19:
                return b((Context) obj);
            case 20:
                ym1.p bind = (ym1.p) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Intrinsics.checkNotNullParameter("This is a popover message", "string");
                List mainText = kotlin.collections.e0.b(new u50.f0("This is a popover message"));
                bind.getClass();
                Intrinsics.checkNotNullParameter(mainText, "mainText");
                bind.f139442b = mainText;
                ym1.g variant = ym1.g.NOTIFICATION;
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f139445e = variant;
                return Unit.f80348a;
            case 21:
                return b((Context) obj);
            case 22:
                return b((Context) obj);
            case 23:
                h((cn1.n) obj);
                return Unit.f80348a;
            case 24:
                return b((Context) obj);
            case 25:
                return e((Context) obj);
            case 26:
                h((cn1.n) obj);
                return Unit.f80348a;
            case 27:
                return b((Context) obj);
            case 28:
                return e((Context) obj);
            default:
                h((cn1.n) obj);
                return Unit.f80348a;
        }
    }
}
