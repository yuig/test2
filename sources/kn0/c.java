package kn0;

import a.cb;
import com.pinterest.api.model.hb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final hb f80222a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80223b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80224c;

    /* renamed from: d, reason: collision with root package name */
    public final String f80225d;

    public c(hb action, String boardId, String str, String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f80222a = action;
        this.f80223b = boardId;
        this.f80224c = str;
        this.f80225d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f80222a == cVar.f80222a && Intrinsics.d(this.f80223b, cVar.f80223b) && Intrinsics.d(this.f80224c, cVar.f80224c) && Intrinsics.d(this.f80225d, cVar.f80225d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f80223b, this.f80222a.hashCode() * 31, 31);
        String str = this.f80224c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80225d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BulkActionCompletedEvent(action=");
        sb3.append(this.f80222a);
        sb3.append(", boardId=");
        sb3.append(this.f80223b);
        sb3.append(", destinationBoardId=");
        sb3.append(this.f80224c);
        sb3.append(", sectionId=");
        return a.a.p(sb3, this.f80225d, ")");
    }
}
