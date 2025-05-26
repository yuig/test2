package vt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f126565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126566b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126567c;

    /* renamed from: d, reason: collision with root package name */
    public final String f126568d;

    /* renamed from: e, reason: collision with root package name */
    public final int f126569e;

    /* renamed from: f, reason: collision with root package name */
    public final int f126570f;

    /* renamed from: g, reason: collision with root package name */
    public final bc2.q f126571g;

    /* renamed from: h, reason: collision with root package name */
    public final String f126572h;

    public c(String str, String str2, String str3, String str4, int i13, int i14, bc2.q qVar, String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f126565a = str;
        this.f126566b = str2;
        this.f126567c = str3;
        this.f126568d = str4;
        this.f126569e = i13;
        this.f126570f = i14;
        this.f126571g = qVar;
        this.f126572h = link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f126565a, cVar.f126565a) && Intrinsics.d(this.f126566b, cVar.f126566b) && Intrinsics.d(this.f126567c, cVar.f126567c) && Intrinsics.d(this.f126568d, cVar.f126568d) && this.f126569e == cVar.f126569e && this.f126570f == cVar.f126570f && Intrinsics.d(this.f126571g, cVar.f126571g) && Intrinsics.d(this.f126572h, cVar.f126572h);
    }

    public final int hashCode() {
        String str = this.f126565a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f126566b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f126567c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f126568d;
        int b13 = ep.b.b(this.f126570f, ep.b.b(this.f126569e, (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        bc2.q qVar = this.f126571g;
        return this.f126572h.hashCode() + ((b13 + (qVar != null ? qVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExpandedResultsPinData(uid=");
        sb3.append(this.f126565a);
        sb3.append(", title=");
        sb3.append(this.f126566b);
        sb3.append(", description=");
        sb3.append(this.f126567c);
        sb3.append(", imageUrl=");
        sb3.append(this.f126568d);
        sb3.append(", imageHeight=");
        sb3.append(this.f126569e);
        sb3.append(", imageWidth=");
        sb3.append(this.f126570f);
        sb3.append(", videoTracks=");
        sb3.append(this.f126571g);
        sb3.append(", link=");
        return a.a.p(sb3, this.f126572h, ")");
    }
}
