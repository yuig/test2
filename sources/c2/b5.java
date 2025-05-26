package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import org.chromium.net.NetError;

/* loaded from: classes2.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public static final b5 f24567a = new b5();

    /* renamed from: b, reason: collision with root package name */
    public static final float f24568b = 1;

    public final void a(u2.q qVar, float f13, long j13, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        float f14;
        long j14;
        u2.q qVar3;
        float f15;
        long b13;
        float f16;
        int i16;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(910934799);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 6) == 0) {
            qVar2 = qVar;
            i15 = (sVar.h(qVar2) ? 4 : 2) | i13;
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                f14 = f13;
                if (sVar.e(f14)) {
                    i16 = 32;
                    i15 |= i16;
                }
            } else {
                f14 = f13;
            }
            i16 = 16;
            i15 |= i16;
        } else {
            f14 = f13;
        }
        if ((i13 & 384) == 0) {
            j14 = j13;
            i15 |= ((i14 & 4) == 0 && sVar.g(j14)) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } else {
            j14 = j13;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= sVar.h(this) ? 2048 : 1024;
        }
        if ((i15 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            f16 = f14;
            b13 = j14;
        } else {
            sVar.S();
            if ((i13 & 1) == 0 || sVar.y()) {
                qVar3 = i17 != 0 ? u2.n.f120041b : qVar2;
                if ((i14 & 2) != 0) {
                    i15 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    f15 = f24568b;
                } else {
                    f15 = f14;
                }
                if ((i14 & 4) != 0) {
                    b13 = b3.w.b(((b3.w) sVar.m(c1.f24577a)).f21392a, 0.12f);
                    i15 &= -897;
                    sVar.s();
                    j1.c(qVar3, b13, f15, 0.0f, sVar, (i15 & 14) | ((i15 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | ((i15 << 3) & 896), 8);
                    f16 = f15;
                    qVar2 = qVar3;
                }
            } else {
                sVar.Q();
                if ((i14 & 2) != 0) {
                    i15 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                qVar3 = qVar2;
                f15 = f14;
            }
            b13 = j14;
            sVar.s();
            j1.c(qVar3, b13, f15, 0.0f, sVar, (i15 & 14) | ((i15 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | ((i15 << 3) & 896), 8);
            f16 = f15;
            qVar2 = qVar3;
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new a5(this, qVar2, f16, b13, i13, i14);
        }
    }
}
