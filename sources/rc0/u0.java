package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.tag.GestaltTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107437i;

    /* renamed from: j, reason: collision with root package name */
    public static final u0 f107420j = new u0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u0 f107421k = new u0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final u0 f107422l = new u0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final u0 f107423m = new u0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final u0 f107424n = new u0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final u0 f107425o = new u0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final u0 f107426p = new u0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final u0 f107427q = new u0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final u0 f107428r = new u0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final u0 f107429s = new u0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final u0 f107430t = new u0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final u0 f107431u = new u0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final u0 f107432v = new u0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final u0 f107433w = new u0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final u0 f107434x = new u0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final u0 f107435y = new u0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final u0 f107436z = new u0(16);
    public static final u0 A = new u0(17);
    public static final u0 B = new u0(18);
    public static final u0 C = new u0(19);
    public static final u0 D = new u0(20);
    public static final u0 E = new u0(21);
    public static final u0 F = new u0(22);
    public static final u0 G = new u0(23);
    public static final u0 H = new u0(24);
    public static final u0 I = new u0(25);

    /* renamed from: J, reason: collision with root package name */
    public static final u0 f107419J = new u0(26);
    public static final u0 K = new u0(27);
    public static final u0 L = new u0(28);
    public static final u0 M = new u0(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i13) {
        super(1);
        this.f107437i = i13;
    }

    public final View b(Context context) {
        on1.e eVar = on1.e.f96719m;
        switch (this.f107437i) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner, s0.M);
                return gestaltSpinner;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltTag gestaltTag = new GestaltTag(6, context, (AttributeSet) null);
                pe.i.h(gestaltTag, L);
                return gestaltTag;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner2 = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner2, f107421k);
                return gestaltSpinner2;
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner3 = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner3, f107423m);
                return gestaltSpinner3;
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner4 = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner4, f107425o);
                return gestaltSpinner4;
            case 8:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner5 = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner5, f107427q);
                return gestaltSpinner5;
            case 10:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner6 = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner6, f107429s);
                return gestaltSpinner6;
            case 12:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitch gestaltSwitch = new GestaltSwitch(context);
                l3.c.l(gestaltSwitch, f107431u);
                pe.i.i(gestaltSwitch, eVar);
                return gestaltSwitch;
            case 14:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitch gestaltSwitch2 = new GestaltSwitch(context);
                l3.c.l(gestaltSwitch2, f107433w);
                pe.i.i(gestaltSwitch2, eVar);
                return gestaltSwitch2;
            case 16:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitch gestaltSwitch3 = new GestaltSwitch(context);
                l3.c.l(gestaltSwitch3, f107435y);
                pe.i.i(gestaltSwitch3, eVar);
                return gestaltSwitch3;
            case 18:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitch gestaltSwitch4 = new GestaltSwitch(context);
                l3.c.l(gestaltSwitch4, A);
                pe.i.i(gestaltSwitch4, eVar);
                return gestaltSwitch4;
            case 20:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitchWithLabel gestaltSwitchWithLabel = new GestaltSwitchWithLabel(context);
                c0.d.k(gestaltSwitchWithLabel, C);
                return gestaltSwitchWithLabel;
            case 22:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitchWithLabel gestaltSwitchWithLabel2 = new GestaltSwitchWithLabel(context);
                c0.d.k(gestaltSwitchWithLabel2, E);
                return gestaltSwitchWithLabel2;
            case 24:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitchWithLabel gestaltSwitchWithLabel3 = new GestaltSwitchWithLabel(context);
                c0.d.k(gestaltSwitchWithLabel3, G);
                return gestaltSwitchWithLabel3;
            case 26:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSwitchWithLabel gestaltSwitchWithLabel4 = new GestaltSwitchWithLabel(context);
                c0.d.k(gestaltSwitchWithLabel4, I);
                return gestaltSwitchWithLabel4;
        }
    }

    public final void e(ln1.l bind) {
        switch (this.f107437i) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.LG);
                ln1.c color = ln1.c.GRAYSCALE;
                Intrinsics.checkNotNullParameter(color, "color");
                bind.f84045b = color;
                bind.a(ln1.e.LOADING);
                break;
            case 2:
            case 4:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.LG);
                Intrinsics.checkNotNullParameter("Example of a Label", "label");
                bind.f84047d = new u50.f0("Example of a Label");
                bind.a(ln1.e.LOADING);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.SM);
                ln1.c color2 = ln1.c.WHITE;
                Intrinsics.checkNotNullParameter(color2, "color");
                bind.f84045b = color2;
                bind.a(ln1.e.LOADING);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.LG);
                ln1.c color3 = ln1.c.WHITE;
                Intrinsics.checkNotNullParameter(color3, "color");
                bind.f84045b = color3;
                bind.a(ln1.e.LOADING);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(ln1.f.SM);
                Intrinsics.checkNotNullParameter("Example of a Label", "label");
                bind.f84047d = new u50.f0("Example of a Label");
                bind.a(ln1.e.LOADING);
                break;
        }
    }

    public final void f(on1.r bind) {
        switch (this.f107437i) {
            case 19:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                on1.b bVar = new on1.b(true, true, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                bind.getClass();
                Intrinsics.checkNotNullParameter(bVar, "switch");
                bind.f96754a = bVar;
                Intrinsics.checkNotNullParameter("Much longer label - label that wraps to the next line", "string");
                u50.f0 label = new u50.f0("Much longer label - label that wraps to the next line");
                Intrinsics.checkNotNullParameter(label, "label");
                bind.f96755b = label;
                break;
            case 20:
            case 22:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                on1.b bVar2 = new on1.b(true, true, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                bind.getClass();
                Intrinsics.checkNotNullParameter(bVar2, "switch");
                bind.f96754a = bVar2;
                Intrinsics.checkNotNullParameter("Show all pins", "string");
                u50.f0 label2 = new u50.f0("Show all pins");
                Intrinsics.checkNotNullParameter(label2, "label");
                bind.f96755b = label2;
                bind.f96756c = ep.b.x("All Pins will be publicly visible to you \" +\nand others when viewing your profile", "string", "All Pins will be publicly visible to you \" +\nand others when viewing your profile");
                on1.l labelPosition = on1.l.RIGHT;
                Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
                bind.f96759f = labelPosition;
                break;
            case 21:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                on1.b bVar3 = new on1.b(true, true, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                bind.getClass();
                Intrinsics.checkNotNullParameter(bVar3, "switch");
                bind.f96754a = bVar3;
                Intrinsics.checkNotNullParameter("Much longer label - label that wraps to the next line", "string");
                u50.f0 label3 = new u50.f0("Much longer label - label that wraps to the next line");
                Intrinsics.checkNotNullParameter(label3, "label");
                bind.f96755b = label3;
                on1.l labelPosition2 = on1.l.RIGHT;
                Intrinsics.checkNotNullParameter(labelPosition2, "labelPosition");
                bind.f96759f = labelPosition2;
                break;
            case 23:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                on1.b bVar4 = new on1.b(true, true, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                bind.getClass();
                Intrinsics.checkNotNullParameter(bVar4, "switch");
                bind.f96754a = bVar4;
                Intrinsics.checkNotNullParameter("Show all pins", "string");
                u50.f0 label4 = new u50.f0("Show all pins");
                Intrinsics.checkNotNullParameter(label4, "label");
                bind.f96755b = label4;
                bind.f96756c = ep.b.x("All Pins will be publicly visible to you \" +\nand others when viewing your profile", "string", "All Pins will be publicly visible to you \" +\nand others when viewing your profile");
                break;
        }
    }

    public final void h(on1.s bind) {
        switch (this.f107437i) {
            case 11:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f96761a = true;
                bind.f96762b = true;
                break;
            case 12:
            case 14:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f96761a = false;
                bind.f96762b = false;
                bind.f96763c = fm1.c.VISIBLE;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f96761a = false;
                bind.f96762b = true;
                break;
            case 15:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f96761a = true;
                bind.f96762b = false;
                break;
        }
    }

    public final void i(qn1.g bind) {
        switch (this.f107437i) {
            case 27:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b();
                bind.a(qn1.c.SMALL);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b();
                bind.a(qn1.c.LARGE);
                bind.c(qn1.d.WARNING);
                bind.f104492g = true;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f107437i) {
            case 0:
                return b((Context) obj);
            case 1:
                e((ln1.l) obj);
                return Unit.f80348a;
            case 2:
                return b((Context) obj);
            case 3:
                e((ln1.l) obj);
                return Unit.f80348a;
            case 4:
                return b((Context) obj);
            case 5:
                e((ln1.l) obj);
                return Unit.f80348a;
            case 6:
                return b((Context) obj);
            case 7:
                e((ln1.l) obj);
                return Unit.f80348a;
            case 8:
                return b((Context) obj);
            case 9:
                e((ln1.l) obj);
                return Unit.f80348a;
            case 10:
                return b((Context) obj);
            case 11:
                h((on1.s) obj);
                return Unit.f80348a;
            case 12:
                return b((Context) obj);
            case 13:
                h((on1.s) obj);
                return Unit.f80348a;
            case 14:
                return b((Context) obj);
            case 15:
                h((on1.s) obj);
                return Unit.f80348a;
            case 16:
                return b((Context) obj);
            case 17:
                h((on1.s) obj);
                return Unit.f80348a;
            case 18:
                return b((Context) obj);
            case 19:
                f((on1.r) obj);
                return Unit.f80348a;
            case 20:
                return b((Context) obj);
            case 21:
                f((on1.r) obj);
                return Unit.f80348a;
            case 22:
                return b((Context) obj);
            case 23:
                f((on1.r) obj);
                return Unit.f80348a;
            case 24:
                return b((Context) obj);
            case 25:
                f((on1.r) obj);
                return Unit.f80348a;
            case 26:
                return b((Context) obj);
            case 27:
                i((qn1.g) obj);
                return Unit.f80348a;
            case 28:
                i((qn1.g) obj);
                return Unit.f80348a;
            default:
                return b((Context) obj);
        }
    }
}
