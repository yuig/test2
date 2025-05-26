package ol0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f96402f = new m(null, Integer.valueOf(a70.c.board_header_image_empty), rm1.q.CAMERA_ROLL, 17);

    /* renamed from: g, reason: collision with root package name */
    public static final m f96403g = new m(null, Integer.valueOf(a70.c.board_header_image_processing), rm1.q.CLOCK, 1);

    /* renamed from: a, reason: collision with root package name */
    public final String f96404a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f96405b;

    /* renamed from: c, reason: collision with root package name */
    public final rm1.q f96406c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96407d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96408e;

    public m(String str, Integer num, rm1.q qVar, int i13) {
        str = (i13 & 1) != 0 ? null : str;
        num = (i13 & 2) != 0 ? null : num;
        qVar = (i13 & 4) != 0 ? null : qVar;
        boolean z13 = (i13 & 8) != 0;
        boolean z14 = (i13 & 16) != 0;
        this.f96404a = str;
        this.f96405b = num;
        this.f96406c = qVar;
        this.f96407d = z13;
        this.f96408e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f96404a, mVar.f96404a) && Intrinsics.d(this.f96405b, mVar.f96405b) && this.f96406c == mVar.f96406c && this.f96407d == mVar.f96407d && this.f96408e == mVar.f96408e;
    }

    public final int hashCode() {
        String str = this.f96404a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f96405b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        rm1.q qVar = this.f96406c;
        return Boolean.hashCode(this.f96408e) + ep.b.e(this.f96407d, (hashCode2 + (qVar != null ? qVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardHeaderImagePreviewDisplayState(imageUrl=");
        sb3.append(this.f96404a);
        sb3.append(", imageOverlayText=");
        sb3.append(this.f96405b);
        sb3.append(", imageOverlayIcon=");
        sb3.append(this.f96406c);
        sb3.append(", showDeleteButton=");
        sb3.append(this.f96407d);
        sb3.append(", showEditButton=");
        return a.a.r(sb3, this.f96408e, ")");
    }
}
