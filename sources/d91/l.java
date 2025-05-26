package d91;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.c0;
import u50.f0;
import wm1.k0;
import wm1.q;
import wm1.w;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f54099j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i13) {
        super(1);
        this.f54098i = i13;
        this.f54099j = str;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f54098i;
        String str = this.f54099j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f54098i;
        String str = this.f54099j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(String.valueOf(str)), null, null, null, null, 0, d7.b.Z(!(str == null || str.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 8:
                Intrinsics.checkNotNullParameter(it, "displayState");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
                return rn1.a.y(it, bs1.c.h2(spannableStringBuilder), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 12:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), vn1.c.SUBTLE, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, e0.b(vn1.b.CENTER_HORIZONTAL), null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, new f0(str), vn1.c.SUBTLE, null, null, vn1.g.BODY_100, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096972);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, new f0(str), null, null, e0.b(vn1.e.BOLD), vn1.g.HEADING_700, 2, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096966);
            case 20:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, e0.b(vn1.b.CENTER_HORIZONTAL), e0.b(vn1.e.BOLD), vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097122);
            case 21:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, e0.b(vn1.b.CENTER_HORIZONTAL), null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, e0.b(vn1.e.BOLD), null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097078);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final yl1.b f(yl1.b it) {
        int i13 = this.f54098i;
        String string = this.f54099j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(string, "string");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                yl1.c cVar = yl1.c.SMALL;
                break;
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, bs1.c.h2(string), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
    }

    public final void h(k0 bind) {
        int i13 = this.f54098i;
        String string = this.f54099j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                w startItem = new w(new u50.w(string));
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind.f130311b = startItem;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Intrinsics.checkNotNullParameter(string, "string");
                q middleItem = new q(new f0(string), null, false, 6);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Intrinsics.checkNotNullExpressionValue(string, "$image");
                w startItem2 = new w(new u50.w(string));
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem2, "startItem");
                bind.f130311b = startItem2;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                w startItem3 = new w(new u50.w(string));
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem3, "startItem");
                bind.f130311b = startItem3;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f54098i;
        String str = this.f54099j;
        switch (i13) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                vy0 it = (vy0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.E(str);
                wy0 a13 = it.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            case 2:
                return b((ao1.b) obj);
            case 3:
                v91.a it2 = (v91.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return v91.a.e(it2, false, new u50.k0(new String[]{str}, c52.e.connected_to), null, false, 12);
            case 4:
                h((k0) obj);
                return Unit.f80348a;
            case 5:
                h((k0) obj);
                return Unit.f80348a;
            case 6:
                h((k0) obj);
                return Unit.f80348a;
            case 7:
                h((k0) obj);
                return Unit.f80348a;
            case 8:
                return e((rn1.a) obj);
            case 9:
                return b((ao1.b) obj);
            case 10:
                return b((ao1.b) obj);
            case 11:
                return f((yl1.b) obj);
            case 12:
                return e((rn1.a) obj);
            case 13:
                return e((rn1.a) obj);
            case 14:
                c0 bind = (c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(str != null ? str : "");
                return Unit.f80348a;
            case 15:
                return f((yl1.b) obj);
            case 16:
                return e((rn1.a) obj);
            case 17:
                return f((yl1.b) obj);
            case 18:
                return e((rn1.a) obj);
            case 19:
                return e((rn1.a) obj);
            case 20:
                return e((rn1.a) obj);
            case 21:
                return e((rn1.a) obj);
            case 22:
                rn1.k bind2 = (rn1.k) obj;
                switch (i13) {
                    case 22:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f(str);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f(str);
                        break;
                }
                return Unit.f80348a;
            case 23:
                rn1.k bind3 = (rn1.k) obj;
                switch (i13) {
                    case 22:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f(str);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f(str);
                        break;
                }
                return Unit.f80348a;
            case 24:
                rl1.q it3 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                String str2 = str == null ? "" : str;
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                Integer q23 = f13 != null ? f13.q2() : null;
                return rl1.q.e(it3, str2, null, false, null, null, false, false, null, 0, q23 == null ? rl1.b.f108524a : new rl1.d(q23.intValue()), null, 1534);
            case 25:
                return f((yl1.b) obj);
            case 26:
                return e((rn1.a) obj);
            case 27:
                return f((yl1.b) obj);
            case 28:
                return e((rn1.a) obj);
            default:
                ((Number) obj).intValue();
                HashMap hashMap = new HashMap();
                hashMap.put("user_id", str);
                return hashMap;
        }
    }
}
