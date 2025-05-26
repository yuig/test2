package om1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.m f96639a;

    /* renamed from: b, reason: collision with root package name */
    public final e f96640b;

    /* renamed from: c, reason: collision with root package name */
    public final f f96641c;

    /* renamed from: d, reason: collision with root package name */
    public final fm1.c f96642d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f96643e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f96644f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f96645g;

    /* renamed from: h, reason: collision with root package name */
    public final int f96646h;

    /* renamed from: i, reason: collision with root package name */
    public final int f96647i;

    /* renamed from: j, reason: collision with root package name */
    public final fm1.a f96648j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(rm1.m r14, om1.e r15, om1.f r16, fm1.c r17, u50.i0 r18, boolean r19, int r20, int r21) {
        /*
            r13 = this;
            r0 = r21
            r1 = r0 & 2
            if (r1 == 0) goto La
            om1.e r1 = com.pinterest.gestalt.iconbutton.GestaltIconButton.B
            r4 = r1
            goto Lb
        La:
            r4 = r15
        Lb:
            r1 = r0 & 8
            if (r1 == 0) goto L17
            ps0.m r1 = com.pinterest.gestalt.iconbutton.GestaltIconButton.A
            fm1.c r1 = r1.e()
            r6 = r1
            goto L19
        L17:
            r6 = r17
        L19:
            r1 = r0 & 16
            if (r1 == 0) goto L20
            r1 = 0
            r7 = r1
            goto L22
        L20:
            r7 = r18
        L22:
            r1 = r0 & 32
            if (r1 == 0) goto L29
            r1 = 1
            r8 = r1
            goto L2b
        L29:
            r8 = r19
        L2b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L33
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r0
            goto L35
        L33:
            r11 = r20
        L35:
            ps0.m r0 = com.pinterest.gestalt.iconbutton.GestaltIconButton.A
            int r0 = r0.f101282a
            switch(r0) {
                case 20: goto L43;
                case 21: goto L3c;
                case 22: goto L40;
                default: goto L3c;
            }
        L3c:
            fm1.a r0 = vn1.h.f126282h
        L3e:
            r12 = r0
            goto L46
        L40:
            fm1.a r0 = com.pinterest.gestalt.iconbutton.GestaltIconButton.F
            goto L3e
        L43:
            fm1.a r0 = com.pinterest.gestalt.avatar.GestaltAvatar.N
            goto L3e
        L46:
            r9 = 0
            r10 = 0
            r2 = r13
            r3 = r14
            r5 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: om1.c.<init>(rm1.m, om1.e, om1.f, fm1.c, u50.i0, boolean, int, int):void");
    }

    public static c e(c cVar, rm1.m mVar, e eVar, f fVar, fm1.c cVar2, i0 i0Var, boolean z13, int i13, int i14) {
        rm1.m icon = (i14 & 1) != 0 ? cVar.f96639a : mVar;
        e size = (i14 & 2) != 0 ? cVar.f96640b : eVar;
        f style = (i14 & 4) != 0 ? cVar.f96641c : fVar;
        fm1.c visibility = (i14 & 8) != 0 ? cVar.f96642d : cVar2;
        i0 i0Var2 = (i14 & 16) != 0 ? cVar.f96643e : i0Var;
        boolean z14 = (i14 & 32) != 0 ? cVar.f96644f : z13;
        i0 i0Var3 = cVar.f96645g;
        int i15 = cVar.f96646h;
        int i16 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? cVar.f96647i : i13;
        fm1.a importantForAccessibility = cVar.f96648j;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        return new c(icon, size, style, visibility, i0Var2, z14, i0Var3, i15, i16, importantForAccessibility);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f96639a, cVar.f96639a) && this.f96640b == cVar.f96640b && this.f96641c == cVar.f96641c && this.f96642d == cVar.f96642d && Intrinsics.d(this.f96643e, cVar.f96643e) && this.f96644f == cVar.f96644f && Intrinsics.d(this.f96645g, cVar.f96645g) && this.f96646h == cVar.f96646h && this.f96647i == cVar.f96647i && this.f96648j == cVar.f96648j;
    }

    public final int hashCode() {
        int a13 = d7.g.a(this.f96642d, (this.f96641c.hashCode() + ((this.f96640b.hashCode() + (this.f96639a.hashCode() * 31)) * 31)) * 31, 31);
        i0 i0Var = this.f96643e;
        int e13 = ep.b.e(this.f96644f, (a13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31);
        i0 i0Var2 = this.f96645g;
        return this.f96648j.hashCode() + ep.b.b(this.f96647i, ep.b.b(this.f96646h, (e13 + (i0Var2 != null ? i0Var2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "DisplayState(icon=" + this.f96639a + ", size=" + this.f96640b + ", style=" + this.f96641c + ", visibility=" + this.f96642d + ", contentDescription=" + this.f96643e + ", enabled=" + this.f96644f + ", labelText=" + this.f96645g + ", numberOnBadge=" + this.f96646h + ", id=" + this.f96647i + ", importantForAccessibility=" + this.f96648j + ")";
    }

    public c(rm1.m icon, e size, f style, fm1.c visibility, i0 i0Var, boolean z13, i0 i0Var2, int i13, int i14, fm1.a importantForAccessibility) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        this.f96639a = icon;
        this.f96640b = size;
        this.f96641c = style;
        this.f96642d = visibility;
        this.f96643e = i0Var;
        this.f96644f = z13;
        this.f96645g = i0Var2;
        this.f96646h = i13;
        this.f96647i = i14;
        this.f96648j = importantForAccessibility;
    }
}
