package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public final String f131959a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131960b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131961c;

    /* renamed from: d, reason: collision with root package name */
    public final String f131962d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131963e;

    public ac(String __typename, String id3, String entityId, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f131959a = __typename;
        this.f131960b = id3;
        this.f131961c = entityId;
        this.f131962d = str;
        this.f131963e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return Intrinsics.d(this.f131959a, acVar.f131959a) && Intrinsics.d(this.f131960b, acVar.f131960b) && Intrinsics.d(this.f131961c, acVar.f131961c) && Intrinsics.d(this.f131962d, acVar.f131962d) && Intrinsics.d(this.f131963e, acVar.f131963e);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f131961c, a.cb.d(this.f131960b, this.f131959a.hashCode() * 31, 31), 31);
        String str = this.f131962d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131963e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InvitedByUser(__typename=");
        sb3.append(this.f131959a);
        sb3.append(", id=");
        sb3.append(this.f131960b);
        sb3.append(", entityId=");
        sb3.append(this.f131961c);
        sb3.append(", fullName=");
        sb3.append(this.f131962d);
        sb3.append(", imageMediumUrl=");
        return a.a.p(sb3, this.f131963e, ")");
    }
}
