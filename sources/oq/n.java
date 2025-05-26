package oq;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f97091j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f97092k = new n(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n f97093l = new n(2);

    /* renamed from: m, reason: collision with root package name */
    public static final n f97094m = new n(3);

    /* renamed from: n, reason: collision with root package name */
    public static final n f97095n = new n(4);

    /* renamed from: o, reason: collision with root package name */
    public static final n f97096o = new n(5);

    /* renamed from: p, reason: collision with root package name */
    public static final n f97097p = new n(6);

    /* renamed from: q, reason: collision with root package name */
    public static final n f97098q = new n(7);

    /* renamed from: r, reason: collision with root package name */
    public static final n f97099r = new n(8);

    /* renamed from: s, reason: collision with root package name */
    public static final n f97100s = new n(9);

    /* renamed from: t, reason: collision with root package name */
    public static final n f97101t = new n(10);

    /* renamed from: u, reason: collision with root package name */
    public static final n f97102u = new n(11);

    /* renamed from: v, reason: collision with root package name */
    public static final n f97103v = new n(12);

    /* renamed from: w, reason: collision with root package name */
    public static final n f97104w = new n(13);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97105i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f97105i = i13;
    }

    public final rm1.d b(rm1.d it) {
        switch (this.f97105i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.ARROW_DOWN, rm1.i.SM), null, null, 0, null, 30);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.ARROW_FORWARD, rm1.i.MD), null, null, n80.c.closeup_title_module_forward_icon, null, 22);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f97105i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, kotlin.collections.e0.b(vn1.e.BOLD), null, 0, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2097015);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.START), kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_300, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096963);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, Integer.MAX_VALUE, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097119);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.SUBTLE;
                vn1.g gVar = vn1.g.BODY_300;
                List b13 = kotlin.collections.e0.b(vn1.e.BOLD);
                int id3 = p0.SHOW_TRANSLATION.getId();
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new u50.k0(id3, new ArrayList(0)), cVar, null, b13, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097124);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n nVar = f97093l;
        n nVar2 = f97095n;
        int i13 = this.f97105i;
        switch (i13) {
            case 2:
                rm1.l standard = (rm1.l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.b(rm1.i.MD);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.b(rm1.i.MD);
                        break;
                }
                break;
            case 3:
                rm1.k bind = (rm1.k) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.b(nVar);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.b(nVar2);
                        break;
                }
                break;
            case 4:
                rm1.l standard2 = (rm1.l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.b(rm1.i.MD);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.b(rm1.i.MD);
                        break;
                }
                break;
            case 5:
                rm1.k bind2 = (rm1.k) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.b(nVar);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.b(nVar2);
                        break;
                }
                break;
            case 8:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 10:
                break;
            case 11:
                rn1.k bind3 = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                bind3.h(vn1.g.BODY_200);
                bind3.f108896k = true;
                break;
        }
        return e((rn1.a) obj);
    }
}
