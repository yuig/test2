package ra0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f106905d = new c(null, 7);

    /* renamed from: a, reason: collision with root package name */
    public final String f106906a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106907b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106908c;

    public /* synthetic */ c(String str, int i13) {
        this("", (i13 & 2) != 0 ? "" : str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f106906a, cVar.f106906a) && Intrinsics.d(this.f106907b, cVar.f106907b) && Intrinsics.d(this.f106908c, cVar.f106908c);
    }

    public final int hashCode() {
        return this.f106908c.hashCode() + cb.d(this.f106907b, this.f106906a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageIds(pinId=");
        sb3.append(this.f106906a);
        sb3.append(", shuffleId=");
        sb3.append(this.f106907b);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f106908c, ")");
    }

    public c(String pinId, String shuffleId, String userId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(shuffleId, "shuffleId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f106906a = pinId;
        this.f106907b = shuffleId;
        this.f106908c = userId;
    }
}
