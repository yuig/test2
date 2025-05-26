package jc0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rl1.c0;
import u50.f0;
import uc0.p2;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75418i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f75419j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i13) {
        super(1);
        this.f75418i = i13;
        this.f75419j = str;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f75418i;
        String str = this.f75419j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 4:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 21:
            case 22:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.p2(str), null, null, null, null, 0, d7.b.Z(str.length() > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, e0.b(vn1.b.START), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097146);
            case 8:
                Intrinsics.f(it);
                Intrinsics.checkNotNullParameter(it, "displayState");
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                Intrinsics.f(str);
                f0 text = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, it.f108850h, it.f108851i, it.f108852j, it.f108853k, it.f108854l, visibility, it.f108856n, it.f108857o, it.f108858p, it.f108859q, it.f108860r, it.f108861s, it.f108862t, it.f108863u, it.f108864v, it.f108865w, it.f108866x, it.f108867y, it.f108868z, it.A);
            case 12:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 13:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 14:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 15:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 16:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 17:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 18:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, d7.b.Z(!kotlin.text.z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 19:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 20:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str != null ? str : ""), null, null, null, null, 0, d7.b.Z(!(str == null || str.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str != null ? str : ""), null, null, null, null, 0, d7.b.Z(!(str == null || str.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final yl1.b e(yl1.b it) {
        int i13 = this.f75418i;
        String str = this.f75419j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str == null ? "" : str), false, d7.b.Z(true ^ (str == null || str.length() == 0)), null, null, null, null, null, 0, null, 1018);
        }
    }

    public final void f(ao1.i bind) {
        int i13 = this.f75418i;
        String str = this.f75419j;
        switch (i13) {
            case 26:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(str);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(str);
                bind.f20099p = Integer.valueOf(str.length());
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(str);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean d2;
        int i13 = this.f75418i;
        String string = this.f75419j;
        switch (i13) {
            case 0:
                return e((yl1.b) obj);
            case 1:
                return e((yl1.b) obj);
            case 2:
                return e((yl1.b) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f(string);
                bind.a(e0.b(vn1.b.CENTER));
                return Unit.f80348a;
            case 5:
                p2 it = (p2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return a.a.C(string, it.f121848a);
            case 6:
                return b((rn1.a) obj);
            case 7:
                return e((yl1.b) obj);
            case 8:
                return b((rn1.a) obj);
            case 9:
                ao1.b state = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(string, "string");
                return ao1.b.e(state, new f0(string), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 10:
                sg0.e action = (sg0.e) obj;
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof sg0.c) {
                    d2 = Intrinsics.d(((sg0.c) action).f112860a.f84244a, string);
                } else if (action instanceof sg0.b) {
                    d2 = Intrinsics.d(((sg0.b) action).f112859a.f77215a, string);
                } else if (action instanceof sg0.d) {
                    d2 = Intrinsics.d(((sg0.d) action).f112861a.f108030a, string);
                } else {
                    if (!(action instanceof sg0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d2 = Intrinsics.d(((sg0.a) action).f112858a.f84693i, string);
                }
                return Boolean.valueOf(d2);
            case 11:
                return e((yl1.b) obj);
            case 12:
                return b((rn1.a) obj);
            case 13:
                return b((rn1.a) obj);
            case 14:
                return b((rn1.a) obj);
            case 15:
                return b((rn1.a) obj);
            case 16:
                return b((rn1.a) obj);
            case 17:
                return b((rn1.a) obj);
            case 18:
                return b((rn1.a) obj);
            case 19:
                return b((rn1.a) obj);
            case 20:
                return b((rn1.a) obj);
            case 21:
                c0 bind2 = (c0) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                if (string == null) {
                    string = "";
                }
                bind2.a(string);
                return Unit.f80348a;
            case 22:
                yl1.l bind3 = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                bind3.d(string);
                bind3.e(fm1.c.VISIBLE);
                return Unit.f80348a;
            case 23:
                return e((yl1.b) obj);
            case 24:
                return b((rn1.a) obj);
            case 25:
                return b((rn1.a) obj);
            case 26:
                f((ao1.i) obj);
                return Unit.f80348a;
            case 27:
                f((ao1.i) obj);
                return Unit.f80348a;
            case 28:
                f((ao1.i) obj);
                return Unit.f80348a;
            default:
                return b((rn1.a) obj);
        }
    }
}
