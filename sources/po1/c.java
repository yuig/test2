package po1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r40;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wz;
import es.l;
import java.util.List;
import kh2.n;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.f0;
import u50.i0;
import u50.k0;
import u50.o0;

/* loaded from: classes2.dex */
public abstract class c {
    public static final wz.a a(f30 f30Var) {
        wz u13;
        r40 A = b40.A(f30Var);
        if (A instanceof s10.a) {
            wz wzVar = ((s10.a) A).f110573b;
            if (wzVar != null) {
                return wzVar.m();
            }
            return null;
        }
        we0 w13 = n.w(f30Var.g6());
        if (w13 == null || (u13 = w13.u()) == null) {
            return null;
        }
        return u13.m();
    }

    public static final String b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        wz j13 = j(pin);
        if (j13 == null) {
            return null;
        }
        return h(j13);
    }

    public static final i0 c(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        wz offer = j(pin);
        if (offer == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(offer, "offer");
        String p13 = offer.p();
        String o13 = offer.o();
        String r13 = offer.r();
        if (r13 == null && p13 != null && o13 != null && Intrinsics.d(p13, o13)) {
            r13 = p13;
        }
        if (p13 != null && o13 != null && !Intrinsics.d(o13, p13)) {
            return new k0(new String[]{p13, o13}, x0.product_price_range);
        }
        if (r13 != null) {
            return new f0(r13);
        }
        return null;
    }

    public static final SpannableStringBuilder d(wz offer, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        String h10 = h(offer);
        if (h10 == null || h10.length() == 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h10);
        if (k(offer) && offer.s() != null) {
            String s13 = offer.s();
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) s13);
            spannableStringBuilder.setSpan(new StrikethroughSpan(), length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), 0, length, 17);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), length, spannableStringBuilder.length(), 17);
        } else if (i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), 0, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final o0 e(wz offer, int i13, int i14, Integer num) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        String h10 = h(offer);
        if (h10 == null || h10.length() == 0) {
            return null;
        }
        String s13 = offer.s();
        return (!k(offer) || s13 == null) ? num != null ? com.bumptech.glide.c.j1(new b(num, h10, 0)) : com.bumptech.glide.c.j1(new dl1.i0(h10, 3)) : com.bumptech.glide.c.j1(new l(i14, i13, 1, h10, s13));
    }

    public static o0 f(wz offer, int i13, int i14) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        String h10 = h(offer);
        if (h10 == null || h10.length() == 0) {
            return null;
        }
        String s13 = offer.s();
        return (!k(offer) || s13 == null) ? com.bumptech.glide.c.j1(new dl1.i0(h10, 4)) : com.bumptech.glide.c.j1(new l(i14, i13, 2, h10, s13));
    }

    public static final SpannableStringBuilder g(int i13, int i14, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        wz j13 = j(pin);
        if (j13 == null) {
            return null;
        }
        return d(j13, i13, i14, -1);
    }

    public static final String h(wz offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        String p13 = offer.p();
        String o13 = offer.o();
        String r13 = offer.r();
        if (r13 == null && p13 != null && o13 != null && Intrinsics.d(p13, o13)) {
            r13 = p13;
        }
        if (p13 == null || o13 == null || Intrinsics.d(o13, p13)) {
            if (r13 != null) {
                return r13;
            }
            return null;
        }
        int i13 = x0.product_price_range;
        Object[] objArr = {p13, o13};
        Context context = kb0.a.f79058b;
        return m60.f0.X().getResources().getString(i13, objArr);
    }

    public static final wz i(int i13, f30 pin) {
        s10.a aVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (b40.k(pin).size() <= i13 || b40.M(i13, pin) == null) {
            aVar = null;
        } else {
            String uid = pin.getUid();
            Intrinsics.checkNotNullParameter(pin, "<this>");
            se0 M = b40.M(i13, pin);
            List y13 = M != null ? M.y() : null;
            if (y13 == null) {
                y13 = q0.f80391a;
            }
            aVar = new s10.a(uid, y13);
        }
        if (aVar != null) {
            return aVar.f110573b;
        }
        return null;
    }

    public static final wz j(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        r40 A = b40.A(pin);
        boolean z13 = A instanceof s10.a;
        if (!b40.I0(pin) && !z13) {
            return null;
        }
        s10.a aVar = z13 ? (s10.a) A : (pin.g6() == null || !(b40.Z(pin).isEmpty() ^ true)) ? null : new s10.a(pin.getUid(), b40.Z(pin));
        if (aVar != null) {
            return aVar.f110573b;
        }
        return null;
    }

    public static final boolean k(wz offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        return (offer.r() == null || offer.s() == null || Intrinsics.d(offer.r(), offer.s())) ? false : true;
    }
}
