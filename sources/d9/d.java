package d9;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54008b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f54009c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f54010d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f54011e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f54012f;

    public d(String str, boolean z13, boolean z14, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f54008b = str;
        this.f54009c = z13;
        this.f54010d = z14;
        this.f54011e = strArr;
        this.f54012f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f54009c == dVar.f54009c && this.f54010d == dVar.f54010d && Objects.equals(this.f54008b, dVar.f54008b) && Arrays.equals(this.f54011e, dVar.f54011e) && Arrays.equals(this.f54012f, dVar.f54012f);
    }

    public final int hashCode() {
        int i13 = (((527 + (this.f54009c ? 1 : 0)) * 31) + (this.f54010d ? 1 : 0)) * 31;
        String str = this.f54008b;
        return i13 + (str != null ? str.hashCode() : 0);
    }
}
