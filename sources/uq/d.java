package uq;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import u50.k0;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f122986j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f122987k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f122988l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f122989m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f122990n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f122991o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f122992p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f122993q = new d(7);

    /* renamed from: r, reason: collision with root package name */
    public static final d f122994r = new d(8);

    /* renamed from: s, reason: collision with root package name */
    public static final d f122995s = new d(9);

    /* renamed from: t, reason: collision with root package name */
    public static final d f122996t = new d(10);

    /* renamed from: u, reason: collision with root package name */
    public static final d f122997u = new d(11);

    /* renamed from: v, reason: collision with root package name */
    public static final d f122998v = new d(12);

    /* renamed from: w, reason: collision with root package name */
    public static final d f122999w = new d(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123000i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f123000i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f123000i) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], fb0.f.translation_pending_title), vn1.c.INVERSE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], fb0.f.show_original_text_title), vn1.c.SHOPPING, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], fb0.f.show_translated_text_title), vn1.c.SHOPPING, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
        }
    }

    public final wn1.d e(wn1.d state) {
        om1.c cVar;
        switch (this.f123000i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                om1.c cVar2 = state.f130535v;
                return wn1.d.e(state, null, null, null, null, false, null, null, null, cVar2 != null ? om1.c.e(cVar2, null, null, null, null, null, false, t0.comment_composer_sticker_button, 767) : null, 6291455);
            case 1:
                Intrinsics.checkNotNullParameter(state, "it");
                om1.c cVar3 = state.f130533t;
                if (cVar3 != null) {
                    fm1.c cVar4 = fm1.c.VISIBLE;
                    int i13 = ob2.f.content_description_post_comment;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    cVar = om1.c.e(cVar3, null, null, null, cVar4, new k0(i13, new ArrayList(0)), false, 0, 999);
                } else {
                    cVar = null;
                }
                return wn1.d.e(state, null, null, null, null, false, null, cVar, null, null, 7864319);
            case 2:
            case 3:
            case 4:
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                om1.c cVar5 = state.f130535v;
                return wn1.d.e(state, null, null, null, null, false, null, null, null, cVar5 != null ? om1.c.e(cVar5, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015) : null, 6291455);
            case 5:
                Intrinsics.checkNotNullParameter(state, "it");
                om1.c cVar6 = state.f130534u;
                return wn1.d.e(state, null, null, null, null, false, null, null, cVar6 != null ? om1.c.e(cVar6, null, null, null, fm1.c.GONE, null, false, 0, 1015) : null, null, 7340031);
            case 6:
                Intrinsics.checkNotNullParameter(state, "it");
                om1.c cVar7 = state.f130533t;
                om1.c e13 = cVar7 != null ? om1.c.e(cVar7, null, null, null, null, null, false, 0, 991) : null;
                om1.c cVar8 = state.f130534u;
                om1.c e14 = cVar8 != null ? om1.c.e(cVar8, null, null, null, null, null, false, 0, 991) : null;
                om1.c cVar9 = state.f130535v;
                return wn1.d.e(state, null, null, null, null, false, null, e13, e14, cVar9 != null ? om1.c.e(cVar9, null, null, null, null, null, false, 0, 991) : null, 4718591);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123000i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                un1.c it2 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 9:
                Intrinsics.checkNotNullParameter((p) obj, "it");
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                ((Number) obj).intValue();
                break;
            default:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
        }
        return Unit.f80348a;
    }
}
