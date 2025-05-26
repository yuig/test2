package yq1;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final r2 f139966j = new r2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r2 f139967k = new r2(1);

    /* renamed from: l, reason: collision with root package name */
    public static final r2 f139968l = new r2(2);

    /* renamed from: m, reason: collision with root package name */
    public static final r2 f139969m = new r2(3);

    /* renamed from: n, reason: collision with root package name */
    public static final r2 f139970n = new r2(4);

    /* renamed from: o, reason: collision with root package name */
    public static final r2 f139971o = new r2(5);

    /* renamed from: p, reason: collision with root package name */
    public static final r2 f139972p = new r2(6);

    /* renamed from: q, reason: collision with root package name */
    public static final r2 f139973q = new r2(7);

    /* renamed from: r, reason: collision with root package name */
    public static final r2 f139974r = new r2(8);

    /* renamed from: s, reason: collision with root package name */
    public static final r2 f139975s = new r2(9);

    /* renamed from: t, reason: collision with root package name */
    public static final r2 f139976t = new r2(10);

    /* renamed from: u, reason: collision with root package name */
    public static final r2 f139977u = new r2(11);

    /* renamed from: v, reason: collision with root package name */
    public static final r2 f139978v = new r2(12);

    /* renamed from: w, reason: collision with root package name */
    public static final r2 f139979w = new r2(13);

    /* renamed from: x, reason: collision with root package name */
    public static final r2 f139980x = new r2(14);

    /* renamed from: y, reason: collision with root package name */
    public static final r2 f139981y = new r2(15);

    /* renamed from: z, reason: collision with root package name */
    public static final r2 f139982z = new r2(16);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139983i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(int i13) {
        super(1);
        this.f139983i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f139983i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], vq1.d.continue_line), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = vq1.d.login;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, new u50.k0(i13, new ArrayList(0)), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    public final void e(am1.h bind) {
        switch (this.f139983i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f15541d = fm1.c.INVISIBLE;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f15541d = fm1.c.GONE;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f15541d = fm1.c.VISIBLE;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f15541d = fm1.c.GONE;
                break;
            case 15:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f15541d = fm1.c.VISIBLE;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f15541d = fm1.c.VISIBLE;
                break;
        }
    }

    public final void f(yl1.l bind) {
        switch (this.f139983i) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f139350c = fm1.c.INVISIBLE;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f139350c = fm1.c.GONE;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i13 = vq1.d.continue_facebook;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                u50.k0 text = new u50.k0(i13, new ArrayList(0));
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f139348a = text;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i14 = vq1.d.continue_line;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                u50.k0 text2 = new u50.k0(i14, new ArrayList(0));
                bind.getClass();
                Intrinsics.checkNotNullParameter(text2, "text");
                bind.f139348a = text2;
                bind.f139350c = fm1.c.VISIBLE;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f139350c = fm1.c.GONE;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f139350c = fm1.c.VISIBLE;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f139350c = fm1.c.VISIBLE;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f139983i) {
            case 0:
                e((am1.h) obj);
                break;
            case 1:
                f((yl1.l) obj);
                break;
            case 2:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
                f((yl1.l) obj);
                break;
            case 4:
                f((yl1.l) obj);
                break;
            case 5:
                f((yl1.l) obj);
                break;
            case 6:
                f((yl1.l) obj);
                break;
            case 7:
                break;
            case 8:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 9:
                break;
            case 10:
                e((am1.h) obj);
                break;
            case 11:
                e((am1.h) obj);
                break;
            case 12:
                e((am1.h) obj);
                break;
            case 13:
                f((yl1.l) obj);
                break;
            case 14:
                f((yl1.l) obj);
                break;
            case 15:
                e((am1.h) obj);
                break;
            default:
                e((am1.h) obj);
                break;
        }
        return Unit.f80348a;
    }
}
