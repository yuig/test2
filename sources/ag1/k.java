package ag1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f15146a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15147b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15148c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15149d;

    /* renamed from: e, reason: collision with root package name */
    public final fg1.b f15150e;

    /* renamed from: f, reason: collision with root package name */
    public final i f15151f;

    /* renamed from: g, reason: collision with root package name */
    public final fg1.a f15152g;

    public k(String sessionId, String entryType, boolean z13, String freeformInterestTag, fg1.b flowType, i iVar, fg1.a aVar) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(freeformInterestTag, "freeformInterestTag");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f15146a = sessionId;
        this.f15147b = entryType;
        this.f15148c = z13;
        this.f15149d = freeformInterestTag;
        this.f15150e = flowType;
        this.f15151f = iVar;
        this.f15152g = aVar;
    }

    public static k a(k kVar, String str, String str2, fg1.b bVar, i iVar, fg1.a aVar, int i13) {
        if ((i13 & 1) != 0) {
            str = kVar.f15146a;
        }
        String sessionId = str;
        String entryType = kVar.f15147b;
        boolean z13 = (i13 & 4) != 0 ? kVar.f15148c : false;
        if ((i13 & 8) != 0) {
            str2 = kVar.f15149d;
        }
        String freeformInterestTag = str2;
        if ((i13 & 16) != 0) {
            bVar = kVar.f15150e;
        }
        fg1.b flowType = bVar;
        if ((i13 & 32) != 0) {
            iVar = kVar.f15151f;
        }
        i iVar2 = iVar;
        if ((i13 & 64) != 0) {
            aVar = kVar.f15152g;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(freeformInterestTag, "freeformInterestTag");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return new k(sessionId, entryType, z13, freeformInterestTag, flowType, iVar2, aVar);
    }

    public final fg1.b b() {
        return this.f15150e;
    }

    public final String c() {
        return this.f15146a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f15146a, kVar.f15146a) && Intrinsics.d(this.f15147b, kVar.f15147b) && this.f15148c == kVar.f15148c && Intrinsics.d(this.f15149d, kVar.f15149d) && this.f15150e == kVar.f15150e && this.f15151f == kVar.f15151f && Intrinsics.d(this.f15152g, kVar.f15152g);
    }

    public final int hashCode() {
        int hashCode = (this.f15150e.hashCode() + cb.d(this.f15149d, ep.b.e(this.f15148c, cb.d(this.f15147b, this.f15146a.hashCode() * 31, 31), 31), 31)) * 31;
        i iVar = this.f15151f;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        fg1.a aVar = this.f15152g;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionId=" + this.f15146a + ", entryType=" + this.f15147b + ", isDraft=" + this.f15148c + ", freeformInterestTag=" + this.f15149d + ", flowType=" + this.f15150e + ", mediaType=" + this.f15151f + ", extractedImageMetadata=" + this.f15152g + ")";
    }

    public /* synthetic */ k() {
        this("", ou1.e.UNKNOWN.getValue(), false, "", fg1.b.EDITOR_FIRST, null, null);
    }
}
