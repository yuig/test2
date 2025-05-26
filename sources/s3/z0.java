package s3;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z0 extends q3.c1 implements q3.r0, f1 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f111012f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111013g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f111014h;

    /* renamed from: i, reason: collision with root package name */
    public final q3.m0 f111015i = new q3.m0(this, 0);

    /* renamed from: j, reason: collision with root package name */
    public g1.y f111016j;

    /* renamed from: k, reason: collision with root package name */
    public g1.y f111017k;

    public static void H0(q1 q1Var) {
        l0 l0Var;
        q1 q1Var2 = q1Var.f110900n;
        k0 k0Var = q1Var2 != null ? q1Var2.f110898l : null;
        k0 k0Var2 = q1Var.f110898l;
        if (!Intrinsics.d(k0Var, k0Var2)) {
            k0Var2.f110838z.f110984r.f110950u.g();
            return;
        }
        b f13 = k0Var2.f110838z.f110984r.f();
        if (f13 == null || (l0Var = ((t0) f13).f110950u) == null) {
            return;
        }
        l0Var.g();
    }

    public abstract z0 A0();

    public abstract q3.x B0();

    public abstract boolean C0();

    public abstract k0 D0();

    public abstract q3.q0 E0();

    public abstract z0 F0();

    public abstract long G0();

    public final void I0() {
        z0 z0Var = this;
        do {
            g1.y yVar = z0Var.f111016j;
            if (yVar != null && yVar.b()) {
                return;
            } else {
                z0Var = z0Var.F0();
            }
        } while (z0Var != null);
    }

    public abstract void J0();

    public boolean K() {
        return false;
    }

    @Override // q3.r0
    public final q3.q0 Y(int i13, int i14, Map map, Function1 function1) {
        if ((i13 & (-16777216)) == 0 && ((-16777216) & i14) == 0) {
            return new x0(i13, i14, map, function1, this);
        }
        jk.r.y("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // s3.f1
    public final void b0(boolean z13) {
        this.f111012f = z13;
    }

    @Override // q3.s0
    public final int i(q3.a aVar) {
        int y03;
        if (C0() && (y03 = y0(aVar)) != Integer.MIN_VALUE) {
            return y03 + ((int) (this.f102182e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int y0(q3.a aVar);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e5, code lost:
    
        r13 = r13 * (-862048943);
        r13 = r13 ^ (r13 << 16);
        r14 = r0.d(r13 >>> 7);
        r15 = r9;
        r8 = r13 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        r13 = r14 >> 3;
        r22 = (r14 & 7) << 3;
        r23 = r3;
        r36 = r4;
        r3 = (r1[r13] & (~(255 << r22))) | (r8 << r22);
        r1[r13] = r3;
        r1[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r3;
        r7[r14] = r12;
        r15[r14] = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0323, code lost:
    
        r11 = r11 + 1;
        r9 = r15;
        r3 = r23;
        r4 = r36;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e4, code lost:
    
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x031e, code lost:
    
        r23 = r3;
        r36 = r4;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032c, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0125, code lost:
    
        r50 = r0;
        r0 = r2;
        r33 = r3;
        r41 = r9;
        r40 = r10;
        r2 = r11;
        r46 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0108, code lost:
    
        r4 = r2.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
    
        if (r2.f63352f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        if (((r2.f63347a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
    
        r4 = r2.f63350d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
    
        if (r4 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        r6 = r2.f63351e;
        r22 = xk2.e0.f135207b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (java.lang.Long.compareUnsigned(r6 * 32, r4 * 25) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014d, code lost:
    
        r4 = r2.f63347a;
        r6 = r2.f63350d;
        r7 = r2.f63348b;
        r14 = r2.f63349c;
        g1.k0.a(r4, r6);
        r33 = r3;
        r3 = -1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015c, code lost:
    
        if (r5 == r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015e, code lost:
    
        r34 = r5 >> 3;
        r38 = (r5 & 7) << 3;
        r35 = (r4[r34] >> r38) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0170, code lost:
    
        if (r35 != 128) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        if (r35 == 254) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0183, code lost:
    
        r35 = r7[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0185, code lost:
    
        if (r35 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        r35 = r35.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018e, code lost:
    
        r35 = r35 * (-862048943);
        r15 = (r35 ^ (r35 << 16)) >>> 7;
        r39 = r2.d(r15);
        r15 = r15 & r6;
        r41 = r9;
        r40 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b5, code lost:
    
        if ((((r39 - r15) & r6) / 8) != (((r5 - r15) & r6) / 8)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b7, code lost:
    
        r50 = r0;
        r4[r34] = (r4[r34] & (~(255 << r38))) | ((r35 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r38);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r10 = r40;
        r9 = r41;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        r0 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e7, code lost:
    
        r50 = r0;
        r46 = r12;
        r0 = r39 >> 3;
        r12 = r4[r0];
        r1 = (r39 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fd, code lost:
    
        if (((r12 >> r1) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ff, code lost:
    
        r48 = r8;
        r49 = r2;
        r4[r0] = ((~(255 << r1)) & r12) | ((r35 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r1);
        r4[r34] = (r4[r34] & (~(255 << r38))) | (128 << r38);
        r7[r39] = r7[r5];
        r7[r5] = null;
        r14[r39] = r14[r5];
        r14[r5] = 0.0f;
        r3 = r5;
        r1 = "<this>";
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0266, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r11 = r2;
        r10 = r40;
        r9 = r41;
        r12 = r46;
        r8 = r48;
        r2 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022f, code lost:
    
        r49 = r2;
        r48 = r8;
        r2 = r11;
        r4[r0] = ((r35 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r1) | ((~(255 << r1)) & r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0243, code lost:
    
        if (r3 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0245, code lost:
    
        r3 = g1.k0.b(r4, r5 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024b, code lost:
    
        r7[r3] = r7[r39];
        r7[r39] = r7[r5];
        r7[r5] = r7[r3];
        r14[r3] = r14[r39];
        r14[r39] = r14[r5];
        r14[r5] = r14[r3];
        r5 = r5 - 1;
        r1 = "<this>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        r35 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0180, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0172, code lost:
    
        r52 = r5;
        r5 = r5 + 1;
        r3 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0284, code lost:
    
        r50 = r0;
        r49 = r2;
        r41 = r9;
        r40 = r10;
        r2 = r11;
        r46 = r12;
        r49.g();
        r1 = r8;
        r0 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x032e, code lost:
    
        r4 = r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0332, code lost:
    
        r0.f63351e++;
        r1 = r0.f63352f;
        r3 = r0.f63347a;
        r5 = r4 >> 3;
        r6 = r3[r5];
        r8 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x034d, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0350, code lost:
    
        r31 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0352, code lost:
    
        r0.f63352f = r1 - r31;
        r1 = r0.f63350d;
        r6 = (r6 & (~(255 << r8))) | (r50 << r8);
        r3[r5] = r6;
        r3[(((r4 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r1 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x029b, code lost:
    
        r50 = r0;
        r49 = r2;
        r33 = r3;
        r41 = r9;
        r40 = r10;
        r2 = r11;
        r46 = r12;
        r8 = 0;
        r0 = r49;
        r1 = g1.k0.e(r0.f63350d);
        r3 = r0.f63347a;
        r4 = r0.f63348b;
        r5 = r0.f63349c;
        r6 = r0.f63350d;
        r0.h(r1);
        r1 = r0.f63347a;
        r7 = r0.f63348b;
        r9 = r0.f63349c;
        r10 = r0.f63350d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02c7, code lost:
    
        if (r11 >= r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02d9, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02db, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02dd, code lost:
    
        if (r12 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02df, code lost:
    
        r13 = r12.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0(s3.e2 r54) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.z0.z0(s3.e2):void");
    }
}
