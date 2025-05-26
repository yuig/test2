package a2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f441a;

    /* renamed from: b, reason: collision with root package name */
    public String f442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f444d = null;

    public i(String str, String str2) {
        this.f441a = str;
        this.f442b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f441a, iVar.f441a) && Intrinsics.d(this.f442b, iVar.f442b) && this.f443c == iVar.f443c && Intrinsics.d(this.f444d, iVar.f444d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f443c, cb.d(this.f442b, this.f441a.hashCode() * 31, 31), 31);
        e eVar = this.f444d;
        return e13 + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextSubstitution(layoutCache=");
        sb3.append(this.f444d);
        sb3.append(", isShowingSubstitution=");
        return cb.m(sb3, this.f443c, ')');
    }
}
