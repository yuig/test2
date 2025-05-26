package la;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f82352a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82353b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82354c;

    /* renamed from: d, reason: collision with root package name */
    public final String f82355d;

    public c(String from, int i13, int i14, String to3) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to3, "to");
        this.f82352a = i13;
        this.f82353b = i14;
        this.f82354c = from;
        this.f82355d = to3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i13 = this.f82352a - other.f82352a;
        return i13 == 0 ? this.f82353b - other.f82353b : i13;
    }
}
