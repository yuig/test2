package rl1;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class q implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f108647a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108648b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f108649c;

    /* renamed from: d, reason: collision with root package name */
    public final r f108650d;

    /* renamed from: e, reason: collision with root package name */
    public final u50.i0 f108651e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f108652f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f108653g;

    /* renamed from: h, reason: collision with root package name */
    public final fm1.c f108654h;

    /* renamed from: i, reason: collision with root package name */
    public final int f108655i;

    /* renamed from: j, reason: collision with root package name */
    public final c f108656j;

    /* renamed from: k, reason: collision with root package name */
    public final fm1.a f108657k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(java.lang.String r16, java.lang.String r17, boolean r18, rl1.r r19, u50.i0 r20, boolean r21, fm1.c r22, int r23, rl1.c r24, fm1.a r25, int r26) {
        /*
            r15 = this;
            r0 = r26
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r4 = r2
            goto Lc
        La:
            r4 = r16
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L12
            r5 = r2
            goto L14
        L12:
            r5 = r17
        L14:
            r1 = r0 & 4
            r2 = 1
            if (r1 == 0) goto L1b
            r6 = r2
            goto L1d
        L1b:
            r6 = r18
        L1d:
            r1 = r0 & 8
            if (r1 == 0) goto L25
            rl1.r r1 = com.pinterest.gestalt.avatar.GestaltAvatar.M
            r7 = r1
            goto L27
        L25:
            r7 = r19
        L27:
            r1 = r0 & 16
            if (r1 == 0) goto L2f
            u50.h0 r1 = u50.h0.f120562a
            r8 = r1
            goto L31
        L2f:
            r8 = r20
        L31:
            r1 = r0 & 32
            if (r1 == 0) goto L37
            r9 = r2
            goto L39
        L37:
            r9 = r21
        L39:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L41
            fm1.c r1 = rl1.l.f108629f
            r11 = r1
            goto L43
        L41:
            r11 = r22
        L43:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r1
            goto L4d
        L4b:
            r12 = r23
        L4d:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L55
            rl1.b r1 = rl1.b.f108524a
            r13 = r1
            goto L57
        L55:
            r13 = r24
        L57:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6c
            ps0.m r0 = com.pinterest.gestalt.avatar.GestaltAvatar.L
            int r0 = r0.f101282a
            switch(r0) {
                case 20: goto L68;
                case 21: goto L62;
                case 22: goto L65;
                default: goto L62;
            }
        L62:
            fm1.a r0 = vn1.h.f126282h
            goto L6a
        L65:
            fm1.a r0 = com.pinterest.gestalt.iconbutton.GestaltIconButton.F
            goto L6a
        L68:
            fm1.a r0 = com.pinterest.gestalt.avatar.GestaltAvatar.N
        L6a:
            r14 = r0
            goto L6e
        L6c:
            r14 = r25
        L6e:
            r10 = 0
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.q.<init>(java.lang.String, java.lang.String, boolean, rl1.r, u50.i0, boolean, fm1.c, int, rl1.c, fm1.a, int):void");
    }

    public static q e(q qVar, String str, String str2, boolean z13, r rVar, u50.i0 i0Var, boolean z14, boolean z15, fm1.c cVar, int i13, c cVar2, fm1.a aVar, int i14) {
        String imageUrl = (i14 & 1) != 0 ? qVar.f108647a : str;
        String name = (i14 & 2) != 0 ? qVar.f108648b : str2;
        boolean z16 = (i14 & 4) != 0 ? qVar.f108649c : z13;
        r size = (i14 & 8) != 0 ? qVar.f108650d : rVar;
        u50.i0 contentDescription = (i14 & 16) != 0 ? qVar.f108651e : i0Var;
        boolean z17 = (i14 & 32) != 0 ? qVar.f108652f : z14;
        boolean z18 = (i14 & 64) != 0 ? qVar.f108653g : z15;
        fm1.c visibility = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? qVar.f108654h : cVar;
        int i15 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? qVar.f108655i : i13;
        c backgroundColor = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? qVar.f108656j : cVar2;
        fm1.a importantForAccessibility = (i14 & 1024) != 0 ? qVar.f108657k : aVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        return new q(imageUrl, name, z16, size, contentDescription, z17, z18, visibility, i15, backgroundColor, importantForAccessibility);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f108647a, qVar.f108647a) && Intrinsics.d(this.f108648b, qVar.f108648b) && this.f108649c == qVar.f108649c && this.f108650d == qVar.f108650d && Intrinsics.d(this.f108651e, qVar.f108651e) && this.f108652f == qVar.f108652f && this.f108653g == qVar.f108653g && this.f108654h == qVar.f108654h && this.f108655i == qVar.f108655i && Intrinsics.d(this.f108656j, qVar.f108656j) && this.f108657k == qVar.f108657k;
    }

    public final int hashCode() {
        return this.f108657k.hashCode() + ((this.f108656j.hashCode() + ep.b.b(this.f108655i, d7.g.a(this.f108654h, ep.b.e(this.f108653g, ep.b.e(this.f108652f, ep.b.d(this.f108651e, (this.f108650d.hashCode() + ep.b.e(this.f108649c, cb.d(this.f108648b, this.f108647a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "DisplayState(imageUrl=" + this.f108647a + ", name=" + this.f108648b + ", showBorder=" + this.f108649c + ", size=" + this.f108650d + ", contentDescription=" + this.f108651e + ", showOverlayOnWhiteImage=" + this.f108652f + ", prepareForReuse=" + this.f108653g + ", visibility=" + this.f108654h + ", id=" + this.f108655i + ", backgroundColor=" + this.f108656j + ", importantForAccessibility=" + this.f108657k + ")";
    }

    public q(String imageUrl, String name, boolean z13, r size, u50.i0 contentDescription, boolean z14, boolean z15, fm1.c visibility, int i13, c backgroundColor, fm1.a importantForAccessibility) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        this.f108647a = imageUrl;
        this.f108648b = name;
        this.f108649c = z13;
        this.f108650d = size;
        this.f108651e = contentDescription;
        this.f108652f = z14;
        this.f108653g = z15;
        this.f108654h = visibility;
        this.f108655i = i13;
        this.f108656j = backgroundColor;
        this.f108657k = importantForAccessibility;
    }
}
