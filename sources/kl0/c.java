package kl0;

import com.pinterest.api.model.m40;
import com.pinterest.api.model.rq;
import df.j1;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80067i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f80068j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i13) {
        super(1);
        this.f80067i = i13;
        this.f80068j = str;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f80067i;
        String string = this.f80068j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(string), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 6:
                Intrinsics.checkNotNullParameter(it, "state");
                Intrinsics.checkNotNullParameter(it, "displayState");
                u50.i0 i0Var = it.f20030a;
                u50.f0 text = bs1.c.h2(string);
                Intrinsics.checkNotNullParameter(text, "text");
                Integer valueOf = Integer.valueOf(string.length());
                yn1.f variant = yn1.f.DEFAULT;
                Intrinsics.checkNotNullParameter(variant, "variant");
                return new ao1.b(text, it.f20031b, it.f20032c, it.f20033d, it.f20034e, variant, it.f20036g, it.f20037h, it.f20038i, it.f20039j, it.f20040k, it.f20041l, it.f20042m, it.f20043n, it.f20044o, valueOf, it.f20046q, it.f20047r, it.f20048s, it.f20049t, it.f20050u, it.f20051v);
            case 7:
                Intrinsics.checkNotNullParameter(it, "state");
                Intrinsics.checkNotNullParameter(it, "displayState");
                u50.i0 i0Var2 = it.f20030a;
                u50.f0 helperText = bs1.c.h2(string);
                Intrinsics.checkNotNullParameter(helperText, "helperText");
                yn1.f variant2 = yn1.f.ERROR;
                Intrinsics.checkNotNullParameter(variant2, "variant");
                return new ao1.b(i0Var2, it.f20031b, helperText, it.f20033d, it.f20034e, variant2, it.f20036g, it.f20037h, it.f20038i, it.f20039j, it.f20040k, it.f20041l, it.f20042m, it.f20043n, it.f20044o, it.f20045p, it.f20046q, it.f20047r, it.f20048s, it.f20049t, it.f20050u, it.f20051v);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(string, "string");
                return ao1.b.e(it, new u50.f0(string), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
        }
    }

    public final rn1.a e(rn1.a state) {
        int i13 = this.f80067i;
        String str = this.f80068j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.p2(str != null ? str : ""), null, null, null, null, 0, d7.b.Z(j1.U0(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 2:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 3:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.p2(str != null ? str : ""), null, null, null, null, 0, d7.b.Z(j1.U0(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 10:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 11:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.h2(str != null ? str : ""), null, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097122);
            case 13:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.h2(str != null ? str : ""), null, null, null, null, 0, (str == null || str.length() == 0) ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 15:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.h2(str), null, null, null, null, 0, kotlin.text.z.j(str) ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 17:
                Intrinsics.checkNotNullParameter(state, "it");
                String str2 = str != null ? str : "";
                return rn1.a.y(state, ep.b.x(str2, "string", str2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 19:
                return rn1.a.y(state, jq.b.p(state, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 22:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, str != null ? bs1.c.p2(str) : u50.h0.f120562a, null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 23:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.p2(str), null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 24:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.p2(str), null, null, kotlin.collections.e0.b(vn1.e.UNDERLINED), vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.h2(str), vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097120);
        }
    }

    public final yl1.b f(yl1.b it) {
        int i13 = this.f80067i;
        String str = this.f80068j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = str != null ? str : "";
                break;
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f80067i;
        String str = this.f80068j;
        switch (i13) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return b((ao1.b) obj);
            case 2:
                return e((rn1.a) obj);
            case 3:
                return e((rn1.a) obj);
            case 4:
                return f((yl1.b) obj);
            case 5:
                return f((yl1.b) obj);
            case 6:
                return b((ao1.b) obj);
            case 7:
                return b((ao1.b) obj);
            case 8:
                un1.c it = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                u50.i0 p23 = str != null ? bs1.c.p2(str) : u50.h0.f120562a;
                fm1.c Z = d7.b.Z(true ^ (str == null || kotlin.text.z.j(str)));
                String b23 = bs1.c.b2(x0.more_no_dot);
                Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
                String lowerCase = b23.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return un1.c.y(it, p23, null, 0, Z, true, null, null, 0, bs1.c.p2(lowerCase), false, 458174);
            case 9:
                return b((ao1.b) obj);
            case 10:
                return e((rn1.a) obj);
            case 11:
                return e((rn1.a) obj);
            case 12:
                return f((yl1.b) obj);
            case 13:
                return e((rn1.a) obj);
            case 14:
                rl1.c0 bind = (rl1.c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(str);
                return Unit.f80348a;
            case 15:
                return e((rn1.a) obj);
            case 16:
                return f((yl1.b) obj);
            case 17:
                return e((rn1.a) obj);
            case 18:
                wn1.d state = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return wn1.d.e(state, null, null, null, this.f80068j, false, null, null, null, null, 8388095);
            case 19:
                return e((rn1.a) obj);
            case 20:
                return f((yl1.b) obj);
            case 21:
                return f((yl1.b) obj);
            case 22:
                return e((rn1.a) obj);
            case 23:
                return e((rn1.a) obj);
            case 24:
                return e((rn1.a) obj);
            case 25:
                rn1.k bind2 = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.f(str);
                bind2.h(vn1.g.UI_400);
                return Unit.f80348a;
            case 26:
                return e((rn1.a) obj);
            case 27:
                rq blockConfig = (rq) obj;
                Intrinsics.checkNotNullParameter(blockConfig, "blockConfig");
                return rq.a(blockConfig, str, null, null, 27);
            case 28:
                rl1.q it2 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rl1.q.e(it2, this.f80068j, null, false, null, null, false, false, null, 0, rl1.b.f108524a, null, 1534);
            default:
                m40 tag = (m40) obj;
                Intrinsics.checkNotNullParameter(tag, "tag");
                return Boolean.valueOf(Intrinsics.d(tag.getUid(), str));
        }
    }
}
