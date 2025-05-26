package aj;

import kh2.n3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Laj/a;", "", "", "a", "I", "width", "b", "height", "", "c", "Z", "isFluid", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("width")
    public final int width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("height")
    public final int height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("is_fluid_height")
    public final boolean isFluid;

    public a(int i13, int i14, boolean z13) {
        this.width = i13;
        this.height = i14;
        this.isFluid = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.width == aVar.width && this.height == aVar.height && this.isFluid == aVar.isFluid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f13 = n3.f(this.height, Integer.hashCode(this.width) * 31);
        boolean z13 = this.isFluid;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return f13 + i13;
    }

    public final String toString() {
        int i13 = this.width;
        int i14 = this.height;
        return a.a.r(a.a.t("AdSizeBundle(width=", i13, ", height=", i14, ", isFluid="), this.isFluid, ")");
    }
}
