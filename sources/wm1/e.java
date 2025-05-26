package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends n {

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f130279c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f130280d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f130281e;

    /* renamed from: f, reason: collision with root package name */
    public final yl1.g f130282f;

    /* renamed from: g, reason: collision with root package name */
    public final u50.i0 f130283g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(u50.i0 r2, boolean r3, fm1.c r4, yl1.g r5, int r6) {
        /*
            r1 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r3 = 1
        L5:
            r0 = r6 & 4
            if (r0 == 0) goto Lb
            fm1.c r4 = fm1.c.VISIBLE
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L15
            yl1.d r5 = com.pinterest.gestalt.listAction.GestaltListAction.V
            yl1.g r5 = r5.getColorPalette()
        L15:
            java.lang.String r6 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            java.lang.String r6 = "visibility"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "colorPalette"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.String r6 = "contentDescription"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            wm1.o r6 = wm1.o.BUTTON
            r1.<init>(r6, r3)
            r1.f130279c = r2
            r1.f130280d = r3
            r1.f130281e = r4
            r1.f130282f = r5
            r1.f130283g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wm1.e.<init>(u50.i0, boolean, fm1.c, yl1.g, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f130279c, eVar.f130279c) && this.f130280d == eVar.f130280d && this.f130281e == eVar.f130281e && Intrinsics.d(this.f130282f, eVar.f130282f) && Intrinsics.d(this.f130283g, eVar.f130283g);
    }

    public final int hashCode() {
        return this.f130283g.hashCode() + ((this.f130282f.hashCode() + d7.g.a(this.f130281e, ep.b.e(this.f130280d, this.f130279c.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ButtonDisplayState(text=");
        sb3.append(this.f130279c);
        sb3.append(", enabled=");
        sb3.append(this.f130280d);
        sb3.append(", visibility=");
        sb3.append(this.f130281e);
        sb3.append(", colorPalette=");
        sb3.append(this.f130282f);
        sb3.append(", contentDescription=");
        return jq.b.k(sb3, this.f130283g, ")");
    }
}
