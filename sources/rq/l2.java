package rq;

import android.graphics.Color;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s80.n6;
import s80.t6;
import s80.v6;

/* loaded from: classes3.dex */
public final class l2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109363i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f109364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(String str, int i13) {
        super(1);
        this.f109363i = i13;
        this.f109364j = str;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f109363i;
        String string = this.f109364j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(string), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(string, "string");
                return ao1.b.e(it, new u50.f0(string), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f109363i;
        String str = this.f109364j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = "\"\"... " + str;
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 2:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 3:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DEFAULT, kotlin.collections.e0.b(vn1.b.START), null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DEFAULT, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097124);
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 14:
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                return rn1.a.y(it, bs1.c.p2(str), null, null, null, null, 0, d7.b.Z(df.j1.U0(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str != null ? str : ""), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str != null ? str : ""), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final s80.j f(s80.j it) {
        ra0.y yVar;
        Boolean bool = null;
        switch (this.f109363i) {
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                l62.a aVar = it.f111592a;
                String colorString = this.f109364j;
                l62.a a13 = l62.a.a(aVar, null, false, false, colorString, false, null, 55);
                t6 t6Var = it.f111596e;
                ra0.u uVar = t6Var.f111805a;
                if (colorString != null) {
                    Intrinsics.checkNotNullParameter(colorString, "colorString");
                    yVar = new ra0.x(new u50.h(colorString));
                } else {
                    yVar = ra0.w.f107019a;
                }
                t6 e13 = t6.e(t6Var, ra0.u.e(uVar, yVar), false, 2);
                if (colorString != null) {
                    bool = Boolean.valueOf(androidx.compose.ui.graphics.a.u(ra0.h0.f106939k) == Color.parseColor(colorString));
                }
                boolean o03 = com.bumptech.glide.d.o0(bool);
                s80.h hVar = it.f111595d;
                boolean z13 = hVar.f111563a;
                hVar.getClass();
                return s80.j.e(it, a13, null, null, new s80.h(z13, o03), e13, null, null, null, null, null, null, null, false, false, false, null, 131046);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                String colorString2 = this.f109364j;
                Intrinsics.checkNotNullParameter(colorString2, "color");
                v6 e14 = v6.e(it.f111600i, colorString2, null, false, 6);
                t6 t6Var2 = it.f111596e;
                ra0.u uVar2 = t6Var2.f111805a;
                Intrinsics.checkNotNullParameter(colorString2, "colorString");
                return s80.j.e(it, null, null, null, null, t6.e(t6Var2, ra0.u.e(uVar2, new ra0.x(new u50.h(colorString2))), false, 2), null, null, null, e14, null, null, null, false, false, false, null, 130799);
        }
    }

    public final yl1.b h(yl1.b it) {
        int i13 = this.f109363i;
        String str = this.f109364j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109363i;
        String str = this.f109364j;
        switch (i13) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return e((rn1.a) obj);
            case 2:
                return e((rn1.a) obj);
            case 3:
                return e((rn1.a) obj);
            case 4:
                return e((rn1.a) obj);
            case 5:
                return e((rn1.a) obj);
            case 6:
                wn1.d it = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = ob2.f.comment_composer_reply_placeholder;
                String[] strArr = new String[1];
                if (str == null) {
                    str = "";
                }
                strArr[0] = str;
                return wn1.d.e(it, null, bs1.c.j2(strArr, i14), null, null, false, null, null, null, null, 8388605);
            case 7:
                un1.c it2 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return un1.c.y(it2, null, null, 0, null, true, null, null, 2, bs1.c.h2(str), false, 425471);
            case 8:
                return h((yl1.b) obj);
            case 9:
                return e((rn1.a) obj);
            case 10:
                return b((ao1.b) obj);
            case 11:
                em1.d it3 = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return em1.d.e(it3, null, null, null, new u50.f0(str), null, null, 0, null, false, 0, 1015);
            case 12:
                return e((rn1.a) obj);
            case 13:
                return e((rn1.a) obj);
            case 14:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f(str);
                bind.f108892g = fm1.c.VISIBLE;
                return Unit.f80348a;
            case 15:
                return e((rn1.a) obj);
            case 16:
                return e((rn1.a) obj);
            case 17:
                return e((rn1.a) obj);
            case 18:
                return e((rn1.a) obj);
            case 19:
                return e((rn1.a) obj);
            case 20:
                return b((ao1.b) obj);
            case 21:
                ((Throwable) obj).getMessage();
                return Unit.f80348a;
            case 22:
                return f((s80.j) obj);
            case 23:
                n6 it4 = (n6) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return n6.b(it4, null, null, false, false, false, false, null, null, null, null, this.f109364j, null, null, null, false, null, false, null, 2095103);
            case 24:
                return f((s80.j) obj);
            case 25:
                dl1.s0 it5 = (dl1.s0) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return Boolean.valueOf(Intrinsics.d(((f30) it5.f55286b).getUid(), str));
            case 26:
                z3.y semantics = (z3.y) obj;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                z3.w.f(semantics, str);
                return Unit.f80348a;
            case 27:
                StackTraceElement stackTraceElement = (StackTraceElement) obj;
                Intrinsics.checkNotNullParameter(stackTraceElement, "stackTraceElement");
                String className = stackTraceElement.getClassName();
                if (str == null) {
                    return Boolean.FALSE;
                }
                Intrinsics.f(className);
                return Boolean.valueOf(!StringsKt.E(className, str, false));
            case 28:
                WebImageView view = (WebImageView) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                if (!Intrinsics.d(view.f52563o, str)) {
                    view.w1();
                    view.V1(this.f109364j, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                }
                return Unit.f80348a;
            default:
                return h((yl1.b) obj);
        }
    }
}
