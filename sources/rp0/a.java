package rp0;

import a.cb;
import h32.a4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f109049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f109050b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109051c;

    /* renamed from: d, reason: collision with root package name */
    public final a4 f109052d;

    public a(String commentId, String commentType, boolean z13, a4 a4Var) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(commentType, "commentType");
        this.f109049a = commentId;
        this.f109050b = commentType;
        this.f109051c = z13;
        this.f109052d = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f109049a, aVar.f109049a) && Intrinsics.d(this.f109050b, aVar.f109050b) && this.f109051c == aVar.f109051c && this.f109052d == aVar.f109052d;
    }

    public final int hashCode() {
        int e13 = ep.b.e(false, ep.b.e(this.f109051c, cb.d(this.f109050b, this.f109049a.hashCode() * 31, 31), 31), 31);
        a4 a4Var = this.f109052d;
        return e13 + (a4Var != null ? a4Var.hashCode() : 0);
    }

    public final String toString() {
        return "CommentReactionListModalConfiguration(commentId=" + this.f109049a + ", commentType=" + this.f109050b + ", isReply=" + this.f109051c + ", isFromPreview=false, viewParameterType=" + this.f109052d + ")";
    }
}
