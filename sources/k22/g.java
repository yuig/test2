package k22;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f78213d;

    /* renamed from: e, reason: collision with root package name */
    public final String f78214e;

    /* renamed from: f, reason: collision with root package name */
    public final String f78215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String uid, String value) {
        super(uid, 2);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter("email", "fieldApiKey");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f78213d = uid;
        this.f78214e = "email";
        this.f78215f = value;
    }

    @Override // dl1.u
    public final String a() {
        return this.f78213d;
    }

    @Override // dl1.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f78213d, gVar.f78213d) && Intrinsics.d(this.f78214e, gVar.f78214e) && Intrinsics.d(this.f78215f, gVar.f78215f);
    }

    @Override // dl1.u
    public final int hashCode() {
        return this.f78215f.hashCode() + cb.d(this.f78214e, this.f78213d.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserSettingsRequestParams(uid=");
        sb3.append(this.f78213d);
        sb3.append(", fieldApiKey=");
        sb3.append(this.f78214e);
        sb3.append(", value=");
        return a.a.p(sb3, this.f78215f, ")");
    }
}
