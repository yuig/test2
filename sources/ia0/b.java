package ia0;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rl1.q f71943a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f71944b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f71945c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b(rl1.q r14, u50.f0 r15, int r16) {
        /*
            r13 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L18
            rl1.r r5 = rl1.r.SM
            rl1.q r0 = new rl1.q
            r10 = 0
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 2035(0x7f3, float:2.852E-42)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L19
        L18:
            r0 = r14
        L19:
            r1 = r16 & 2
            u50.h0 r2 = u50.h0.f120562a
            r3 = r13
            if (r1 == 0) goto L22
            r1 = r2
            goto L23
        L22:
            r1 = r15
        L23:
            r13.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.b.<init>(rl1.q, u50.f0, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(i2.o r4) {
        /*
            r3 = this;
            i2.s r4 = (i2.s) r4
            r0 = -1951848918(0xffffffff8ba9262a, float:-6.5153855E-32)
            r4.W(r0)
            rl1.q r0 = ia0.a.f71940a
            rl1.q r0 = r3.f71943a
            java.lang.String r1 = r0.f108647a
            boolean r1 = kotlin.text.z.j(r1)
            r2 = 0
            if (r1 == 0) goto L37
            java.lang.String r0 = r0.f108648b
            boolean r0 = kotlin.text.z.j(r0)
            if (r0 == 0) goto L37
            r0 = -1693275982(0xffffffff9b12a8b2, float:-1.2131345E-22)
            r4.W(r0)
            u50.i0 r0 = r3.f71944b
            java.lang.Object r0 = dl2.b.u2(r0, r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.z.j(r0)
            r1 = 1
            r0 = r0 ^ r1
            r4.r(r2)
            if (r0 != 0) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            r4.r(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.b.e(i2.o):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f71943a, bVar.f71943a) && Intrinsics.d(this.f71944b, bVar.f71944b) && Intrinsics.d(this.f71945c, bVar.f71945c);
    }

    public final int hashCode() {
        return this.f71945c.hashCode() + ep.b.d(this.f71944b, this.f71943a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageAttributionState(avatar=");
        sb3.append(this.f71943a);
        sb3.append(", name=");
        sb3.append(this.f71944b);
        sb3.append(", promotedLabel=");
        return jq.b.k(sb3, this.f71945c, ")");
    }

    public b(rl1.q avatar, i0 name, i0 promotedLabel) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(promotedLabel, "promotedLabel");
        this.f71943a = avatar;
        this.f71944b = name;
        this.f71945c = promotedLabel;
    }
}
