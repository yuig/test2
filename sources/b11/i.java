package b11;

import android.app.Activity;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21017i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f21000j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f21001k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f21002l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f21003m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f21004n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f21005o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f21006p = new i(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i f21007q = new i(7);

    /* renamed from: r, reason: collision with root package name */
    public static final i f21008r = new i(8);

    /* renamed from: s, reason: collision with root package name */
    public static final i f21009s = new i(9);

    /* renamed from: t, reason: collision with root package name */
    public static final i f21010t = new i(10);

    /* renamed from: u, reason: collision with root package name */
    public static final i f21011u = new i(11);

    /* renamed from: v, reason: collision with root package name */
    public static final i f21012v = new i(12);

    /* renamed from: w, reason: collision with root package name */
    public static final i f21013w = new i(13);

    /* renamed from: x, reason: collision with root package name */
    public static final i f21014x = new i(14);

    /* renamed from: y, reason: collision with root package name */
    public static final i f21015y = new i(15);

    /* renamed from: z, reason: collision with root package name */
    public static final i f21016z = new i(16);
    public static final i A = new i(17);
    public static final i B = new i(18);
    public static final i C = new i(19);
    public static final i D = new i(20);
    public static final i E = new i(21);
    public static final i F = new i(22);
    public static final i G = new i(23);
    public static final i H = new i(24);
    public static final i I = new i(25);

    /* renamed from: J, reason: collision with root package name */
    public static final i f20999J = new i(26);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f21017i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f21017i) {
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = x0.pin_overflow_content_description;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return om1.c.e(it, null, null, null, null, new u50.k0(i13, new ArrayList(0)), false, 0, 1007);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, om1.e.LG, null, null, null, false, 0, 1021);
        }
    }

    public final rm1.d e(rm1.d it) {
        switch (this.f21017i) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.SPEECH_OUTLINE, rm1.i.XXL), null, null, 0, null, 30);
            case 12:
            case 13:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, rm1.c.DISABLED, null, 0, null, 29);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, rm1.c.DEFAULT, null, 0, null, 29);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, rm1.c.SUBTLE, null, 0, null, 29);
        }
    }

    public final yl1.b f(yl1.b it) {
        switch (this.f21017i) {
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, u50.g0.b(new String[0], x0.saved), false, null, u50.g0.b(new String[0], x0.saved), yl1.i.c(), null, null, null, 0, null, 998);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, u50.g0.b(new String[0], x0.save_pin), false, null, u50.g0.b(new String[0], x0.save_pin), yl1.i.a(), null, null, null, 0, null, 998);
            case 20:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.k0 j23 = bs1.c.j2(new String[0], x0.save_pin);
                yl1.g a13 = yl1.i.a();
                int i13 = x0.save_pin;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, j23, false, null, new u50.k0(i13, new ArrayList(0)), a13, null, null, null, 0, null, 998);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, yl1.c.LARGE, null, null, 0, null, 991);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.save_pin), false, fm1.c.VISIBLE, null, null, yl1.c.LARGE, null, null, 0, null, 986);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, yl1.c.LARGE, null, null, 0, null, 987);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.k0 j24 = bs1.c.j2(new String[0], x0.saved);
                yl1.g c13 = yl1.i.c();
                int i14 = x0.saved;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return yl1.b.f(it, j24, false, null, new u50.k0(i14, new ArrayList(0)), c13, null, null, null, 0, null, 998);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        int i13 = this.f21017i;
        switch (i13) {
            case 0:
                Activity it = (Activity) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(ig1.b.e1(it));
            case 1:
                cm1.d it2 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return cm1.d.e(it2, null, yl1.b.f(it2.f28013b, null, false, null, null, null, yl1.c.LARGE, null, null, 0, null, 991), null, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            case 2:
                return Unit.f80348a;
            case 3:
                return Unit.f80348a;
            case 4:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "pair");
                Object obj2 = pair.f80346a;
                Intrinsics.checkNotNullExpressionValue(obj2, "<get-first>(...)");
                if (((Boolean) obj2).booleanValue()) {
                    Object obj3 = pair.f80347b;
                    Intrinsics.checkNotNullExpressionValue(obj3, "<get-second>(...)");
                    if (((Boolean) obj3).booleanValue()) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            case 5:
                ln1.l bind = (ln1.l) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.LOADING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.LOADED);
                        break;
                }
                return Unit.f80348a;
            case 6:
                ln1.l bind2 = (ln1.l) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.LOADING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.LOADED);
                        break;
                }
                return Unit.f80348a;
            case 7:
                return Unit.f80348a;
            case 8:
                return Boolean.valueOf(obj instanceof PinCloseupBaseModule);
            case 9:
                return b((om1.c) obj);
            case 10:
                return b((om1.c) obj);
            case 11:
                return e((rm1.d) obj);
            case 12:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "closeup");
                return Unit.f80348a;
            case 13:
                v32.c it3 = (v32.c) obj;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                }
                return Unit.f80348a;
            case 14:
                return e((rm1.d) obj);
            case 15:
                return e((rm1.d) obj);
            case 16:
                return Unit.f80348a;
            case 17:
                return Unit.f80348a;
            case 18:
                return f((yl1.b) obj);
            case 19:
                return f((yl1.b) obj);
            case 20:
                v32.c it4 = (v32.c) obj;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                }
                return Unit.f80348a;
            case 21:
                return f((yl1.b) obj);
            case 22:
                return f((yl1.b) obj);
            case 23:
                return f((yl1.b) obj);
            case 24:
                return f((yl1.b) obj);
            case 25:
                return f((yl1.b) obj);
            default:
                return e((rm1.d) obj);
        }
    }
}
