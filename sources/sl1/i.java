package sl1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class i implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f113176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113177b;

    /* renamed from: c, reason: collision with root package name */
    public final h f113178c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f113179d;

    /* renamed from: e, reason: collision with root package name */
    public final f f113180e;

    /* renamed from: f, reason: collision with root package name */
    public final fm1.c f113181f;

    /* renamed from: g, reason: collision with root package name */
    public final int f113182g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f113183h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(java.util.List r10, int r11, sl1.h r12, boolean r13, int r14, int r15) {
        /*
            r9 = this;
            r0 = r15 & 4
            if (r0 == 0) goto L6
            sl1.h r12 = com.pinterest.gestalt.avatargroup.GestaltAvatarGroup.f49252f
        L6:
            r3 = r12
            r12 = r15 & 8
            if (r12 == 0) goto Lc
            r13 = 0
        Lc:
            r4 = r13
            sl1.f r5 = com.pinterest.gestalt.avatargroup.GestaltAvatarGroup.f49253g
            al1.n r12 = com.pinterest.gestalt.avatargroup.GestaltAvatarGroup.f49251e
            int r12 = r12.f15494a
            switch(r12) {
                case 4: goto L1a;
                default: goto L16;
            }
        L16:
            fm1.c r12 = com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay.f49306o
        L18:
            r6 = r12
            goto L1d
        L1a:
            fm1.c r12 = com.pinterest.gestalt.avatargroup.GestaltAvatarGroup.f49254h
            goto L18
        L1d:
            r12 = r15 & 64
            if (r12 == 0) goto L23
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
        L23:
            r7 = r14
            u50.h0 r8 = u50.h0.f120562a
            r0 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.i.<init>(java.util.List, int, sl1.h, boolean, int, int):void");
    }

    public static i e(i iVar, List list, int i13, h hVar, boolean z13, f fVar, fm1.c cVar, int i14) {
        List avatarInfo = (i14 & 1) != 0 ? iVar.f113176a : list;
        int i15 = (i14 & 2) != 0 ? iVar.f113177b : i13;
        h size = (i14 & 4) != 0 ? iVar.f113178c : hVar;
        boolean z14 = (i14 & 8) != 0 ? iVar.f113179d : z13;
        f maxUserAvatarCount = (i14 & 16) != 0 ? iVar.f113180e : fVar;
        fm1.c visibility = (i14 & 32) != 0 ? iVar.f113181f : cVar;
        int i16 = iVar.f113182g;
        i0 contentDescription = iVar.f113183h;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(avatarInfo, "avatarInfo");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(maxUserAvatarCount, "maxUserAvatarCount");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return new i(avatarInfo, i15, size, z14, maxUserAvatarCount, visibility, i16, contentDescription);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f113176a, iVar.f113176a) && this.f113177b == iVar.f113177b && this.f113178c == iVar.f113178c && this.f113179d == iVar.f113179d && this.f113180e == iVar.f113180e && this.f113181f == iVar.f113181f && this.f113182g == iVar.f113182g && Intrinsics.d(this.f113183h, iVar.f113183h);
    }

    public final int hashCode() {
        return this.f113183h.hashCode() + ep.b.b(this.f113182g, d7.g.a(this.f113181f, (this.f113180e.hashCode() + ep.b.e(this.f113179d, (this.f113178c.hashCode() + ep.b.b(this.f113177b, this.f113176a.hashCode() * 31, 31)) * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "DisplayState(avatarInfo=" + this.f113176a + ", totalNumOfGroupMembers=" + this.f113177b + ", size=" + this.f113178c + ", showAddUserIcon=" + this.f113179d + ", maxUserAvatarCount=" + this.f113180e + ", visibility=" + this.f113181f + ", viewId=" + this.f113182g + ", contentDescription=" + this.f113183h + ")";
    }

    public i(List avatarInfo, int i13, h size, boolean z13, f maxUserAvatarCount, fm1.c visibility, int i14, i0 contentDescription) {
        Intrinsics.checkNotNullParameter(avatarInfo, "avatarInfo");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(maxUserAvatarCount, "maxUserAvatarCount");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f113176a = avatarInfo;
        this.f113177b = i13;
        this.f113178c = size;
        this.f113179d = z13;
        this.f113180e = maxUserAvatarCount;
        this.f113181f = visibility;
        this.f113182g = i14;
        this.f113183h = contentDescription;
    }
}
