package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107313i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f107296j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f107297k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f107298l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f107299m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f107300n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f107301o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f107302p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f107303q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f107304r = new e(8);

    /* renamed from: s, reason: collision with root package name */
    public static final e f107305s = new e(9);

    /* renamed from: t, reason: collision with root package name */
    public static final e f107306t = new e(10);

    /* renamed from: u, reason: collision with root package name */
    public static final e f107307u = new e(11);

    /* renamed from: v, reason: collision with root package name */
    public static final e f107308v = new e(12);

    /* renamed from: w, reason: collision with root package name */
    public static final e f107309w = new e(13);

    /* renamed from: x, reason: collision with root package name */
    public static final e f107310x = new e(14);

    /* renamed from: y, reason: collision with root package name */
    public static final e f107311y = new e(15);

    /* renamed from: z, reason: collision with root package name */
    public static final e f107312z = new e(16);
    public static final e A = new e(17);
    public static final e B = new e(18);
    public static final e C = new e(19);
    public static final e D = new e(20);
    public static final e E = new e(21);
    public static final e F = new e(22);
    public static final e G = new e(23);
    public static final e H = new e(24);
    public static final e I = new e(25);

    /* renamed from: J, reason: collision with root package name */
    public static final e f107295J = new e(26);
    public static final e K = new e(27);
    public static final e L = new e(28);
    public static final e M = new e(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f107313i = i13;
    }

    public final View b(Context context) {
        switch (this.f107313i) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup, f107296j);
                return gestaltButtonGroup;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup2 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup2, f107312z);
                return gestaltButtonGroup2;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup3 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup3, f107298l);
                gestaltButtonGroup3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return gestaltButtonGroup3;
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup4 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup4, f107300n);
                return gestaltButtonGroup4;
            case 7:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup5 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup5, f107302p);
                return gestaltButtonGroup5;
            case 9:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup6 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup6, f107304r);
                gestaltButtonGroup6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return gestaltButtonGroup6;
            case 11:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup7 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup7, f107306t);
                return gestaltButtonGroup7;
            case 13:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup8 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup8, f107308v);
                return gestaltButtonGroup8;
            case 15:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonGroup gestaltButtonGroup9 = new GestaltButtonGroup(6, context, (AttributeSet) null);
                kh2.d.k(gestaltButtonGroup9, f107310x);
                return gestaltButtonGroup9;
        }
    }

    public final void e(cm1.i bind) {
        switch (this.f107313i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                yl1.b primaryButton = new yl1.b(new u50.f0("Primary action button"), false, null, null, null, null, null, null, 0, null, 1022);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
                bind.f28024a = primaryButton;
                yl1.b secondaryButton = new yl1.b(new u50.f0("Secondary"), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
                Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
                bind.f28025b = secondaryButton;
                bind.f28026c = new yl1.b(new u50.f0("Tertiary"), false, null, null, yl1.i.d(), null, null, null, 0, null, 1006);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                yl1.b primaryButton2 = new yl1.b(new u50.f0("Primary action"), false, null, null, null, null, null, null, 0, null, 1022);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton2, "primaryButton");
                bind.f28024a = primaryButton2;
                yl1.b secondaryButton2 = new yl1.b(new u50.f0("Button"), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
                Intrinsics.checkNotNullParameter(secondaryButton2, "secondaryButton");
                bind.f28025b = secondaryButton2;
                bind.f28026c = new yl1.b(new u50.f0("Button"), false, null, null, yl1.i.d(), null, null, null, 0, null, 1006);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                u50.f0 f0Var = new u50.f0("Primary action button");
                yl1.e eVar = yl1.e.FULL_WIDTH;
                yl1.b primaryButton3 = new yl1.b(f0Var, false, null, null, null, null, null, null, 0, eVar, 510);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton3, "primaryButton");
                bind.f28024a = primaryButton3;
                yl1.b secondaryButton3 = new yl1.b(new u50.f0("Secondary"), false, null, null, yl1.i.b(), null, null, null, 0, eVar, 494);
                Intrinsics.checkNotNullParameter(secondaryButton3, "secondaryButton");
                bind.f28025b = secondaryButton3;
                bind.f28026c = new yl1.b(new u50.f0("Tertiary"), false, null, null, yl1.i.d(), null, null, null, 0, eVar, 494);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                yl1.b primaryButton4 = new yl1.b(new u50.f0("Primary action button"), false, null, null, null, null, null, null, 0, null, 1022);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton4, "primaryButton");
                bind.f28024a = primaryButton4;
                yl1.b secondaryButton4 = new yl1.b(new u50.f0("Secondary"), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
                Intrinsics.checkNotNullParameter(secondaryButton4, "secondaryButton");
                bind.f28025b = secondaryButton4;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                yl1.b primaryButton5 = new yl1.b(new u50.f0("Primary action"), false, null, null, null, null, null, null, 0, null, 1022);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton5, "primaryButton");
                bind.f28024a = primaryButton5;
                yl1.b secondaryButton5 = new yl1.b(new u50.f0("Secondary"), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
                Intrinsics.checkNotNullParameter(secondaryButton5, "secondaryButton");
                bind.f28025b = secondaryButton5;
                bind.f28026c = new yl1.b(new u50.f0("Button"), false, null, null, yl1.i.d(), null, null, null, 0, null, 1006);
                yl1.c size = yl1.c.LARGE;
                Intrinsics.checkNotNullParameter(size, "size");
                bind.f28027d = size;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                u50.f0 f0Var2 = new u50.f0("Primary Action");
                yl1.e eVar2 = yl1.e.FULL_WIDTH;
                yl1.b primaryButton6 = new yl1.b(f0Var2, false, null, null, null, null, null, null, 0, eVar2, 510);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton6, "primaryButton");
                bind.f28024a = primaryButton6;
                yl1.b secondaryButton6 = new yl1.b(new u50.f0("Secondary"), false, null, null, yl1.i.b(), null, null, null, 0, eVar2, 494);
                Intrinsics.checkNotNullParameter(secondaryButton6, "secondaryButton");
                bind.f28025b = secondaryButton6;
                bind.f28026c = new yl1.b(new u50.f0("Tertiary"), false, null, null, yl1.i.d(), null, null, null, 0, eVar2, 494);
                yl1.c size2 = yl1.c.LARGE;
                Intrinsics.checkNotNullParameter(size2, "size");
                bind.f28027d = size2;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                yl1.b primaryButton7 = new yl1.b(new u50.f0("Primary action button"), false, null, null, null, null, null, null, 0, null, 1022);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton7, "primaryButton");
                bind.f28024a = primaryButton7;
                yl1.b secondaryButton7 = new yl1.b(new u50.f0("Secondary action button"), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
                Intrinsics.checkNotNullParameter(secondaryButton7, "secondaryButton");
                bind.f28025b = secondaryButton7;
                yl1.c size3 = yl1.c.LARGE;
                Intrinsics.checkNotNullParameter(size3, "size");
                bind.f28027d = size3;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                yl1.b primaryButton8 = new yl1.b(new u50.f0("Primary action button"), false, null, null, null, null, null, null, 0, null, 1022);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton8, "primaryButton");
                bind.f28024a = primaryButton8;
                yl1.b secondaryButton8 = new yl1.b(new u50.f0("Secondary action button"), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
                Intrinsics.checkNotNullParameter(secondaryButton8, "secondaryButton");
                bind.f28025b = secondaryButton8;
                bind.f28026c = new yl1.b(new u50.f0("Tertiary"), false, null, null, yl1.i.d(), null, null, null, 0, null, 1006);
                cm1.e orientation = cm1.e.VERTICAL;
                Intrinsics.checkNotNullParameter(orientation, "orientation");
                bind.f28028e = orientation;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                u50.f0 f0Var3 = new u50.f0("Primary action button");
                yl1.e eVar3 = yl1.e.FULL_WIDTH;
                yl1.b primaryButton9 = new yl1.b(f0Var3, false, null, null, null, null, null, null, 0, eVar3, 510);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton9, "primaryButton");
                bind.f28024a = primaryButton9;
                yl1.b secondaryButton9 = new yl1.b(new u50.f0("Secondary action button"), false, null, null, yl1.i.b(), null, null, null, 0, eVar3, 494);
                Intrinsics.checkNotNullParameter(secondaryButton9, "secondaryButton");
                bind.f28025b = secondaryButton9;
                bind.f28026c = new yl1.b(new u50.f0("Tertiary"), false, null, null, yl1.i.d(), null, null, null, 0, eVar3, 494);
                cm1.e orientation2 = cm1.e.VERTICAL;
                Intrinsics.checkNotNullParameter(orientation2, "orientation");
                bind.f28028e = orientation2;
                break;
        }
    }

    public final void f(yl1.l bind) {
        switch (this.f107313i) {
            case 18:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Large Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Small Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Large Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Small Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Large Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Small Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Button");
                bind.f139354g = rm1.q.SPARKLE;
                break;
            case 25:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Button");
                bind.f139355h = rm1.q.ARROW_DOWN;
                bind.f139349b = false;
                break;
            case 26:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Button");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Button");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Large Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Small Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f107313i) {
            case 0:
                e((cm1.i) obj);
                break;
            case 1:
                break;
            case 2:
                e((cm1.i) obj);
                break;
            case 3:
                break;
            case 4:
                e((cm1.i) obj);
                break;
            case 5:
                break;
            case 6:
                e((cm1.i) obj);
                break;
            case 7:
                break;
            case 8:
                e((cm1.i) obj);
                break;
            case 9:
                break;
            case 10:
                e((cm1.i) obj);
                break;
            case 11:
                break;
            case 12:
                e((cm1.i) obj);
                break;
            case 13:
                break;
            case 14:
                e((cm1.i) obj);
                break;
            case 15:
                break;
            case 16:
                e((cm1.i) obj);
                break;
            case 17:
                break;
            case 18:
                f((yl1.l) obj);
                break;
            case 19:
                f((yl1.l) obj);
                break;
            case 20:
                f((yl1.l) obj);
                break;
            case 21:
                f((yl1.l) obj);
                break;
            case 22:
                f((yl1.l) obj);
                break;
            case 23:
                f((yl1.l) obj);
                break;
            case 24:
                f((yl1.l) obj);
                break;
            case 25:
                f((yl1.l) obj);
                break;
            case 26:
                f((yl1.l) obj);
                break;
            case 27:
                f((yl1.l) obj);
                break;
            case 28:
                f((yl1.l) obj);
                break;
            default:
                f((yl1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
