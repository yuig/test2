package f72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* renamed from: a, reason: collision with root package name */
    public final String f61234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61235b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61236c;

    public b1(int i13, String str, String str2, String str3) {
        if (7 != (i13 & 7)) {
            kg.t.b1(i13, 7, z0.f61417b);
            throw null;
        }
        this.f61234a = str;
        this.f61235b = str2;
        this.f61236c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f61234a, b1Var.f61234a) && Intrinsics.d(this.f61235b, b1Var.f61235b) && Intrinsics.d(this.f61236c, b1Var.f61236c);
    }

    public final int hashCode() {
        return this.f61236c.hashCode() + cb.d(this.f61235b, this.f61234a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleStaticAssetEntity(id=");
        sb3.append(this.f61234a);
        sb3.append(", url=");
        sb3.append(this.f61235b);
        sb3.append(", key=");
        return a.a.p(sb3, this.f61236c, ")");
    }
}
