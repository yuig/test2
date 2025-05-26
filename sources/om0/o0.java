package om0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f96554a = new i0("", "");

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f96555b;

    static {
        ArrayList arrayList = new ArrayList(5);
        for (int i13 = 0; i13 < 5; i13++) {
            arrayList.add("");
        }
        f96555b = new k0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r17, u2.q r18, om0.m0 r19, float r20, i2.o r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.o0.a(java.lang.String, u2.q, om0.m0, float, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(om0.i0 r21, u2.q r22, om0.j0 r23, float r24, kl2.l r25, i2.o r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.o0.b(om0.i0, u2.q, om0.j0, float, kl2.l, i2.o, int, int):void");
    }

    public static final void c(k0 state, u2.q qVar, l0 l0Var, float f13, i2.o oVar, int i13, int i14) {
        int i15;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1517412743);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            l0Var = h0.c(sVar);
            i15 = i13 & (-897);
        } else {
            i15 = i13;
        }
        if ((i14 & 8) != 0) {
            f13 = h0.f96503a;
        }
        jk.v.d(l0Var.f96535a, qVar, q2.i.c(-254740201, new n0(state, f13), sVar), sVar, 384 | (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.b(state, qVar, l0Var, f13, i13, i14, 3);
        }
    }
}
