package rl1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f108574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f108576c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f108577d;

    /* renamed from: e, reason: collision with root package name */
    public final o f108578e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f108579f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f108580g;

    /* renamed from: h, reason: collision with root package name */
    public final String f108581h;

    /* renamed from: i, reason: collision with root package name */
    public final fm1.c f108582i;

    /* renamed from: j, reason: collision with root package name */
    public final int f108583j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f108584k;

    /* renamed from: l, reason: collision with root package name */
    public final fm1.a f108585l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(int r28, java.lang.String r29, int r30, boolean r31, rl1.o r32, rl1.m0 r33, rl1.h0 r34, java.lang.String r35, fm1.c r36, int r37, fm1.a r38, int r39) {
        /*
            r27 = this;
            r0 = r39
            r1 = r0 & 32
            if (r1 == 0) goto L1c
            rl1.m0 r1 = new rl1.m0
            int r4 = rl1.l.f108626c
            int r12 = rl1.l.f108627d
            r10 = -1
            r11 = 1
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = -1
            r13 = -1
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r20 = r1
            goto L1e
        L1c:
            r20 = r33
        L1e:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L27
            java.lang.String r1 = ""
            r22 = r1
            goto L29
        L27:
            r22 = r35
        L29:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L32
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r24 = r0
            goto L34
        L32:
            r24 = r37
        L34:
            int r0 = rl1.l.f108624a
            r25 = 0
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r21 = r34
            r23 = r36
            r26 = r38
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.g.<init>(int, java.lang.String, int, boolean, rl1.o, rl1.m0, rl1.h0, java.lang.String, fm1.c, int, fm1.a, int):void");
    }

    public static g a(g gVar, int i13, String str, o oVar, m0 m0Var, h0 h0Var, Integer num, int i14) {
        int i15 = (i14 & 1) != 0 ? gVar.f108574a : i13;
        String imageUrl = (i14 & 2) != 0 ? gVar.f108575b : str;
        int i16 = gVar.f108576c;
        boolean z13 = gVar.f108577d;
        o borderViewModel = (i14 & 16) != 0 ? gVar.f108578e : oVar;
        m0 verifiedIconViewModel = (i14 & 32) != 0 ? gVar.f108579f : m0Var;
        h0 nameViewModel = (i14 & 64) != 0 ? gVar.f108580g : h0Var;
        String contentDescription = gVar.f108581h;
        fm1.c visibility = gVar.f108582i;
        int i17 = gVar.f108583j;
        Integer num2 = (i14 & 1024) != 0 ? gVar.f108584k : num;
        fm1.a importantForAccessibility = gVar.f108585l;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(borderViewModel, "borderViewModel");
        Intrinsics.checkNotNullParameter(verifiedIconViewModel, "verifiedIconViewModel");
        Intrinsics.checkNotNullParameter(nameViewModel, "nameViewModel");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        return new g(i15, imageUrl, i16, z13, borderViewModel, verifiedIconViewModel, nameViewModel, contentDescription, visibility, i17, num2, importantForAccessibility);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f108574a == gVar.f108574a && Intrinsics.d(this.f108575b, gVar.f108575b) && this.f108576c == gVar.f108576c && this.f108577d == gVar.f108577d && Intrinsics.d(this.f108578e, gVar.f108578e) && Intrinsics.d(this.f108579f, gVar.f108579f) && Intrinsics.d(this.f108580g, gVar.f108580g) && Intrinsics.d(this.f108581h, gVar.f108581h) && this.f108582i == gVar.f108582i && this.f108583j == gVar.f108583j && Intrinsics.d(this.f108584k, gVar.f108584k) && this.f108585l == gVar.f108585l;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f108583j, d7.g.a(this.f108582i, cb.d(this.f108581h, (this.f108580g.hashCode() + ((this.f108579f.hashCode() + ((this.f108578e.hashCode() + ep.b.e(this.f108577d, ep.b.b(this.f108576c, cb.d(this.f108575b, Integer.hashCode(this.f108574a) * 31, 31), 31), 31)) * 31)) * 31)) * 31, 31), 31), 31);
        Integer num = this.f108584k;
        return this.f108585l.hashCode() + ((b13 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "AvatarComponentViewModel(size=" + this.f108574a + ", imageUrl=" + this.f108575b + ", backgroundColor=" + this.f108576c + ", applyOverlayOnWhite=" + this.f108577d + ", borderViewModel=" + this.f108578e + ", verifiedIconViewModel=" + this.f108579f + ", nameViewModel=" + this.f108580g + ", contentDescription=" + this.f108581h + ", visibility=" + this.f108582i + ", id=" + this.f108583j + ", avatarColorIndex=" + this.f108584k + ", importantForAccessibility=" + this.f108585l + ")";
    }

    public g(int i13, String imageUrl, int i14, boolean z13, o borderViewModel, m0 verifiedIconViewModel, h0 nameViewModel, String contentDescription, fm1.c visibility, int i15, Integer num, fm1.a importantForAccessibility) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(borderViewModel, "borderViewModel");
        Intrinsics.checkNotNullParameter(verifiedIconViewModel, "verifiedIconViewModel");
        Intrinsics.checkNotNullParameter(nameViewModel, "nameViewModel");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        this.f108574a = i13;
        this.f108575b = imageUrl;
        this.f108576c = i14;
        this.f108577d = z13;
        this.f108578e = borderViewModel;
        this.f108579f = verifiedIconViewModel;
        this.f108580g = nameViewModel;
        this.f108581h = contentDescription;
        this.f108582i = visibility;
        this.f108583j = i15;
        this.f108584k = num;
        this.f108585l = importantForAccessibility;
    }
}
