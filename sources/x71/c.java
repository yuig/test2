package x71;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import z71.i;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f134117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134118b;

    /* renamed from: c, reason: collision with root package name */
    public final i f134119c;

    public c(i iVar, String id3, String draftId) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f134117a = id3;
        this.f134118b = draftId;
        this.f134119c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f134117a, cVar.f134117a) && Intrinsics.d(this.f134118b, cVar.f134118b) && Intrinsics.d(this.f134119c, cVar.f134119c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f134118b, this.f134117a.hashCode() * 31, 31);
        i iVar = this.f134119c;
        return d2 + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "CollagePageEntity(id=" + this.f134117a + ", draftId=" + this.f134118b + ", backgroundImage=" + this.f134119c + ")";
    }
}
