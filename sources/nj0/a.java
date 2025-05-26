package nj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f90970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90971b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90972c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90973d;

    /* renamed from: e, reason: collision with root package name */
    public final String f90974e;

    public a(String boardId, String str, String str2, String str3, int i13) {
        str = (i13 & 2) != 0 ? null : str;
        str2 = (i13 & 4) != 0 ? null : str2;
        str3 = (i13 & 8) != 0 ? null : str3;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f90970a = boardId;
        this.f90971b = str;
        this.f90972c = str2;
        this.f90973d = str3;
        this.f90974e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f90970a, aVar.f90970a) && Intrinsics.d(this.f90971b, aVar.f90971b) && Intrinsics.d(this.f90972c, aVar.f90972c) && Intrinsics.d(this.f90973d, aVar.f90973d) && Intrinsics.d(this.f90974e, aVar.f90974e);
    }

    public final int hashCode() {
        int hashCode = this.f90970a.hashCode() * 31;
        String str = this.f90971b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90972c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90973d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90974e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f90974e;
        StringBuilder sb3 = new StringBuilder("MoreIdeasData(boardId=");
        sb3.append(this.f90970a);
        sb3.append(", boardSectionId=");
        sb3.append(this.f90971b);
        sb3.append(", fromNewsHubId=");
        sb3.append(this.f90972c);
        sb3.append(", requestParams=");
        return a.a.q(sb3, this.f90973d, ", style=", str, ")");
    }
}
