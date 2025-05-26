package p02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f98433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98434b;

    public k(String fileContent, String fileType) {
        Intrinsics.checkNotNullParameter(fileContent, "fileContent");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.f98433a = fileContent;
        this.f98434b = fileType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f98433a, kVar.f98433a) && Intrinsics.d(this.f98434b, kVar.f98434b);
    }

    public final int hashCode() {
        return this.f98434b.hashCode() + (this.f98433a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PdfDownloadedEvent(fileContent=");
        sb3.append(this.f98433a);
        sb3.append(", fileType=");
        return a.a.p(sb3, this.f98434b, ")");
    }
}
