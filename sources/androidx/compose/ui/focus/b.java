package androidx.compose.ui.focus;

import a3.d;
import c2.m4;
import e.f;
import g1.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import s3.e1;
import t3.r;
import t3.t;
import t3.u;
import t3.v;
import u2.q;
import z2.a0;
import z2.c;
import z2.g;
import z2.h;
import z2.i;
import z2.j;
import z2.k;
import z2.p;
import z2.s;
import z2.z;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f17404a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17405b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f17406c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f17407d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f17408e;

    /* renamed from: g, reason: collision with root package name */
    public final h f17410g;

    /* renamed from: j, reason: collision with root package name */
    public x f17413j;

    /* renamed from: f, reason: collision with root package name */
    public final z f17409f = new z();

    /* renamed from: h, reason: collision with root package name */
    public final a0 f17411h = new a0();

    /* renamed from: i, reason: collision with root package name */
    public final q f17412i = new FocusPropertiesElement(new p()).j(new e1() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return b.this.f17409f.hashCode();
        }

        @Override // s3.e1
        public final u2.p l() {
            return b.this.f17409f;
        }

        @Override // s3.e1
        public final /* bridge */ /* synthetic */ void m(u2.p pVar) {
        }
    });

    public b(t tVar, u uVar, t tVar2, r rVar, r rVar2, v vVar) {
        this.f17404a = uVar;
        this.f17405b = tVar2;
        this.f17406c = rVar;
        this.f17407d = rVar2;
        this.f17408e = vVar;
        this.f17410g = new h(new g(this, 1), tVar);
    }

    public final void a(boolean z13) {
        b(8, z13, true);
    }

    public final boolean b(int i13, boolean z13, boolean z14) {
        boolean d2;
        a0 a0Var = this.f17411h;
        i iVar = i.f140626k;
        try {
            if (a0Var.f140603c) {
                a0.a(a0Var);
            }
            a0Var.f140603c = true;
            a0Var.f140602b.b(iVar);
            z zVar = this.f17409f;
            if (!z13) {
                int i14 = k.f140628a[a.x(zVar, i13).ordinal()];
                if (i14 == 1 || i14 == 2 || i14 == 3) {
                    d2 = false;
                    if (d2 && z14) {
                        this.f17406c.invoke();
                    }
                    return d2;
                }
            }
            d2 = a.d(zVar, z13, true);
            if (d2) {
                this.f17406c.invoke();
            }
            return d2;
        } finally {
            a0.b(a0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0399, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00a0, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x00a2, code lost:
    
        r2 = r6.c(r7);
        r4 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00aa, code lost:
    
        if (r6.f63346e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x00bd, code lost:
    
        if (((r6.f63342a[r2 >> 3] >> ((r2 & 7) << r8)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00c3, code lost:
    
        r2 = r6.f63344c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00c7, code lost:
    
        if (r2 <= 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x00c9, code lost:
    
        r9 = r6.f63345d;
        r3 = xk2.e0.f135207b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00d9, code lost:
    
        if (java.lang.Long.compareUnsigned(r9 * 32, r2 * 25) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00db, code lost:
    
        r2 = r6.f63342a;
        r3 = r6.f63344c;
        r9 = r6.f63343b;
        g1.k0.a(r2, r3);
        r10 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00e6, code lost:
    
        if (r10 == r3) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00e8, code lost:
    
        r15 = r10 >> 3;
        r20 = (r10 & 7) << 3;
        r16 = (r2[r15] >> r20) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00f8, code lost:
    
        if (r16 != r4) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0106, code lost:
    
        if (r16 == 254) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x010b, code lost:
    
        r14 = java.lang.Long.hashCode(r9[r10]) * (-862048943);
        r14 = (r14 ^ (r14 << 16)) >>> 7;
        r17 = r6.c(r14);
        r14 = r14 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0134, code lost:
    
        if ((((r17 - r14) & r3) / 8) != (((r10 - r14) & r3) / 8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0136, code lost:
    
        r2[r15] = ((r16 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r20) | (r2[r15] & (~(255 << r20)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x015c, code lost:
    
        r4 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0160, code lost:
    
        r35 = r9;
        r5 = r17 >> 3;
        r8 = r2[r5];
        r31 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0177, code lost:
    
        if (((r8 >> r31) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0179, code lost:
    
        r2[r5] = ((~(255 << r31)) & r8) | ((r16 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r31);
        r2[r15] = (r2[r15] & (~(255 << r20))) | (128 << r20);
        r35[r17] = r35[r10];
        r35[r10] = 0;
        r11 = r10;
        r37 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01c5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r9 = r35;
        r12 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x019e, code lost:
    
        r37 = r12;
        r2[r5] = ((r16 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r31) | (r8 & (~(255 << r31)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01af, code lost:
    
        if (r11 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01b1, code lost:
    
        r11 = g1.k0.b(r2, r10 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01b7, code lost:
    
        r35[r11] = r35[r17];
        r35[r17] = r35[r10];
        r35[r10] = r35[r11];
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0108, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x00fa, code lost:
    
        r11 = r10;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01df, code lost:
    
        r37 = r12;
        r6.f63346e = g1.k0.c(r6.f63344c) - r6.f63345d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0260, code lost:
    
        r5 = r6.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0267, code lost:
    
        r6.f63345d++;
        r0 = r6.f63346e;
        r1 = r6.f63342a;
        r2 = r5 >> 3;
        r3 = r1[r2];
        r7 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0282, code lost:
    
        if (((r3 >> r7) & 255) != 128) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0284, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0287, code lost:
    
        r6.f63346e = r0 - r8;
        r0 = r6.f63344c;
        r3 = (r3 & (~(255 << r7))) | (r37 << r7);
        r1[r2] = r3;
        r1[(((r5 - 7) & r0) + (r0 & 7)) >> 3] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0286, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01ee, code lost:
    
        r37 = r12;
        r0 = g1.k0.e(r6.f63344c);
        r1 = r6.f63342a;
        r2 = r6.f63343b;
        r3 = r6.f63344c;
        r6.e(r0);
        r0 = r6.f63342a;
        r4 = r6.f63343b;
        r5 = r6.f63344c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0206, code lost:
    
        if (r8 >= r3) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0218, code lost:
    
        if (((r1[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x021a, code lost:
    
        r9 = r2[r8];
        r11 = java.lang.Long.hashCode(r9) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r12 = r6.c(r11 >>> 7);
        r14 = r11 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        r11 = r12 >> 3;
        r13 = (r12 & 7) << 3;
        r20 = r1;
        r21 = r2;
        r1 = (r0[r11] & (~(255 << r13))) | (r14 << r13);
        r0[r11] = r1;
        r0[(((r12 - 7) & r5) + (r5 & 7)) >> 3] = r1;
        r4[r12] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0259, code lost:
    
        r8 = r8 + 1;
        r1 = r20;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0255, code lost:
    
        r20 = r1;
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x00bf, code lost:
    
        r37 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0266, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x032a, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x032c, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04c2  */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v20, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v21, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v41, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v47, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.KeyEvent r41, kotlin.jvm.functions.Function0 r42) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.b.c(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    public final Boolean d(int i13, d dVar, Function1 function1) {
        z zVar = this.f17409f;
        z g13 = a.g(zVar);
        Function0 function0 = this.f17408e;
        if (g13 != null) {
            s f13 = a.f(g13, i13, (n4.k) function0.invoke());
            s sVar = s.f140648b;
            if (Intrinsics.d(f13, jk.r.g())) {
                return null;
            }
            if (!Intrinsics.d(f13, jk.r.h())) {
                return Boolean.valueOf(f13.a(function1));
            }
        } else {
            g13 = null;
        }
        return a.l(zVar, i13, (n4.k) function0.invoke(), dVar, new f(g13, this, function1, 13));
    }

    public final boolean e(int i13) {
        Boolean d2;
        j0 j0Var = new j0();
        j0Var.f80434a = Boolean.FALSE;
        int i14 = 1;
        Boolean d13 = d(i13, (d) this.f17407d.invoke(), new m4(j0Var, i13, i14));
        if (d13 == null || j0Var.f80434a == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(d13, bool) && Intrinsics.d(j0Var.f80434a, bool)) {
            return true;
        }
        return a.s(i13) ? b(i13, false, false) && (d2 = d(i13, null, new r1.j0(i13, i14))) != null && d2.booleanValue() : ((Boolean) this.f17405b.invoke(c.a(i13))).booleanValue();
    }
}
