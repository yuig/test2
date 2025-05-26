package g21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f63395h;

    /* renamed from: i, reason: collision with root package name */
    public final String f63396i;

    /* renamed from: j, reason: collision with root package name */
    public final a f63397j;

    public e(String str, String str2, a aVar) {
        this.f63395h = str;
        this.f63396i = str2;
        this.f63397j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f63395h, eVar.f63395h) && Intrinsics.d(this.f63396i, eVar.f63396i) && Intrinsics.d(this.f63397j, eVar.f63397j);
    }

    public final int hashCode() {
        String str = this.f63395h;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63396i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.f63397j;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinCarouselViewModel(title=" + this.f63395h + ", subtitle=" + this.f63396i + ", actionButtonViewModel=" + this.f63397j + ")";
    }
}
