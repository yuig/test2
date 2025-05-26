package xe1;

import c0.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final h f134666b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134669e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f134670f;

    /* renamed from: g, reason: collision with root package name */
    public final float f134671g;

    /* renamed from: h, reason: collision with root package name */
    public final int f134672h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r4, int r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            xe1.h r0 = xe1.h.BACKGROUND
            int r1 = xe1.v.f134796k
            java.lang.String r2 = "viewType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r3.<init>(r0)
            r3.f134666b = r0
            r3.f134667c = r4
            r3.f134668d = r5
            r3.f134669e = r6
            r3.f134670f = r7
            r3.f134671g = r8
            r3.f134672h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe1.a.<init>(java.lang.String, int, int, boolean, float):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f134666b == aVar.f134666b && Intrinsics.d(this.f134667c, aVar.f134667c) && this.f134668d == aVar.f134668d && this.f134669e == aVar.f134669e && this.f134670f == aVar.f134670f && Float.compare(this.f134671g, aVar.f134671g) == 0 && this.f134672h == aVar.f134672h;
    }

    public final int hashCode() {
        int hashCode = this.f134666b.hashCode() * 31;
        String str = this.f134667c;
        return Integer.hashCode(this.f134672h) + a.a.a(this.f134671g, ep.b.e(this.f134670f, ep.b.b(this.f134669e, ep.b.b(this.f134668d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionBackgroundViewModel(viewType=");
        sb3.append(this.f134666b);
        sb3.append(", imageUrl=");
        sb3.append(this.f134667c);
        sb3.append(", cornerRadius=");
        sb3.append(this.f134668d);
        sb3.append(", backgroundColor=");
        sb3.append(this.f134669e);
        sb3.append(", isOval=");
        sb3.append(this.f134670f);
        sb3.append(", widthHeightRatio=");
        sb3.append(this.f134671g);
        sb3.append(", imageOverlayTint=");
        return a.a.n(sb3, this.f134672h, ")");
    }
}
