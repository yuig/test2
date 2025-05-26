package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107414i;

    /* renamed from: j, reason: collision with root package name */
    public static final s0 f107397j = new s0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final s0 f107398k = new s0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final s0 f107399l = new s0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final s0 f107400m = new s0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final s0 f107401n = new s0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final s0 f107402o = new s0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final s0 f107403p = new s0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final s0 f107404q = new s0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final s0 f107405r = new s0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final s0 f107406s = new s0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final s0 f107407t = new s0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final s0 f107408u = new s0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final s0 f107409v = new s0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final s0 f107410w = new s0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final s0 f107411x = new s0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final s0 f107412y = new s0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final s0 f107413z = new s0(16);
    public static final s0 A = new s0(17);
    public static final s0 B = new s0(18);
    public static final s0 C = new s0(19);
    public static final s0 D = new s0(20);
    public static final s0 E = new s0(21);
    public static final s0 F = new s0(22);
    public static final s0 G = new s0(23);
    public static final s0 H = new s0(24);
    public static final s0 I = new s0(25);

    /* renamed from: J, reason: collision with root package name */
    public static final s0 f107396J = new s0(26);
    public static final s0 K = new s0(27);
    public static final s0 L = new s0(28);
    public static final s0 M = new s0(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i13) {
        super(1);
        this.f107414i = i13;
    }

    public final View b(Context context) {
        switch (this.f107414i) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSearchField gestaltSearchField = new GestaltSearchField(6, context, (AttributeSet) null);
                c0.d.j(gestaltSearchField, r0.M);
                return gestaltSearchField;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSearchField gestaltSearchField2 = new GestaltSearchField(6, context, (AttributeSet) null);
                c0.d.j(gestaltSearchField2, f107399l);
                return gestaltSearchField2;
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltStaticSearchBar gestaltStaticSearchBar = new GestaltStaticSearchBar(6, context, (AttributeSet) null);
                oe.f.n(gestaltStaticSearchBar, f107402o);
                return gestaltStaticSearchBar;
            case 11:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltStaticSearchBar gestaltStaticSearchBar2 = new GestaltStaticSearchBar(6, context, (AttributeSet) null);
                oe.f.n(gestaltStaticSearchBar2, f107407t);
                return gestaltStaticSearchBar2;
            case 12:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSearchField gestaltSearchField3 = new GestaltSearchField(6, context, (AttributeSet) null);
                c0.d.j(gestaltSearchField3, f107406s);
                return gestaltSearchField3;
            case 15:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSearchField gestaltSearchField4 = new GestaltSearchField(6, context, (AttributeSet) null);
                c0.d.j(gestaltSearchField4, f107411x);
                return gestaltSearchField4;
            case 20:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSearchField gestaltSearchField5 = new GestaltSearchField(6, context, (AttributeSet) null);
                c0.d.j(gestaltSearchField5, A);
                return gestaltSearchField5.g0(new t0(gestaltSearchField5, 0));
            case 23:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSearchField gestaltSearchField6 = new GestaltSearchField(6, context, (AttributeSet) null);
                c0.d.j(gestaltSearchField6, F);
                return gestaltSearchField6;
            case 26:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner, I);
                return gestaltSpinner;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner2 = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner2, K);
                return gestaltSpinner2;
        }
    }

    public final Boolean e(Context $receiver) {
        switch (this.f107414i) {
            case 1:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 4:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 7:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 8:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 13:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 16:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 21:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            default:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
        }
        return Boolean.valueOf(!dl2.b.T1($receiver));
    }

    public final void f(cn1.n bind) {
        switch (this.f107414i) {
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                Intrinsics.checkNotNullParameter("Entered text", "text");
                bind.f28209a = new u50.f0("Entered text");
                bind.d(oc0.q.component_text_field_label_text);
                Intrinsics.checkNotNullParameter("Error text", "helperText");
                bind.f28211c = new u50.f0("Error text");
                bind.e(dn1.e.LEADING_ICON_BUTTON);
                bind.f28217i = new cn1.c(rm1.q.ARROW_BACK, (om1.f) null, (u50.i0) null, dn1.a.LEADING_ICON_BUTTON, 22);
                bind.f28227s = true;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c();
                bind.d(oc0.q.component_text_field_label_text);
                bind.b(oc0.q.component_text_field_helper_text);
                bind.f28214f = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c();
                bind.d(oc0.q.component_text_field_label_text);
                bind.b(oc0.q.component_text_field_helper_text);
                bind.f28214f = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                bind.f28215g = new cn1.f(ep.b.x("Open voice search", "string", "Open voice search"), rm1.q.MICROPHONE);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c();
                bind.d(oc0.q.component_text_field_label_text);
                bind.b(oc0.q.component_text_field_helper_text);
                bind.f28214f = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                bind.f28215g = new cn1.f(ep.b.x("Open voice search", "string", "Open voice search"), rm1.q.MICROPHONE);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f28216h = new cn1.e();
                bind.f28212d = ep.b.x("Listening...", "string", "Listening...");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Intrinsics.checkNotNullParameter("Search your pins", "string");
                bind.f28212d = new u50.f0("Search your pins");
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                Intrinsics.checkNotNullParameter("Search your pins", "text");
                bind.f28209a = new u50.f0("Search your pins");
                bind.d(oc0.q.component_text_field_label_text);
                bind.b(oc0.q.component_text_field_helper_text);
                break;
        }
    }

    public final void h(cn1.d0 bind) {
        switch (this.f107414i) {
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                Intrinsics.checkNotNullParameter("Search your pins", "hint");
                bind.f28172b = new u50.f0("Search your pins");
                dn1.d style = dn1.d.TRANSPARENT;
                Intrinsics.checkNotNullParameter(style, "style");
                bind.f28176f = style;
                bind.f28174d = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                Intrinsics.checkNotNullParameter("Search your pins", "hint");
                bind.f28172b = new u50.f0("Search your pins");
                bind.f28174d = new cn1.f(ep.b.x("Open camera", "string", "Open camera"), rm1.q.CAMERA);
                bind.f28175e = new cn1.f(ep.b.x("Open voice search", "string", "Open voice search"), rm1.q.MICROPHONE);
                break;
        }
    }

    public final void i(ln1.l bind) {
        switch (this.f107414i) {
            case 25:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.SM);
                bind.a(ln1.e.LOADING);
                break;
            case 26:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.SM);
                ln1.c color = ln1.c.GRAYSCALE;
                Intrinsics.checkNotNullParameter(color, "color");
                bind.f84045b = color;
                bind.a(ln1.e.LOADING);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.LG);
                bind.a(ln1.e.LOADING);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f107414i) {
            case 0:
                return b((Context) obj);
            case 1:
                return e((Context) obj);
            case 2:
                f((cn1.n) obj);
                return Unit.f80348a;
            case 3:
                return b((Context) obj);
            case 4:
                return e((Context) obj);
            case 5:
                h((cn1.d0) obj);
                return Unit.f80348a;
            case 6:
                return b((Context) obj);
            case 7:
                return e((Context) obj);
            case 8:
                return e((Context) obj);
            case 9:
                f((cn1.n) obj);
                return Unit.f80348a;
            case 10:
                h((cn1.d0) obj);
                return Unit.f80348a;
            case 11:
                return b((Context) obj);
            case 12:
                return b((Context) obj);
            case 13:
                return e((Context) obj);
            case 14:
                f((cn1.n) obj);
                return Unit.f80348a;
            case 15:
                return b((Context) obj);
            case 16:
                return e((Context) obj);
            case 17:
                f((cn1.n) obj);
                return Unit.f80348a;
            case 18:
                f((cn1.n) obj);
                return Unit.f80348a;
            case 19:
                f((cn1.n) obj);
                return Unit.f80348a;
            case 20:
                return b((Context) obj);
            case 21:
                return e((Context) obj);
            case 22:
                f((cn1.n) obj);
                return Unit.f80348a;
            case 23:
                return b((Context) obj);
            case 24:
                return e((Context) obj);
            case 25:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 26:
                return b((Context) obj);
            case 27:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 28:
                return b((Context) obj);
            default:
                i((ln1.l) obj);
                return Unit.f80348a;
        }
    }
}
