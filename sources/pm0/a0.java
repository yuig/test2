package pm0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends l {

    /* renamed from: a, reason: collision with root package name */
    public final r f100633a;

    /* renamed from: b, reason: collision with root package name */
    public final List f100634b;

    /* renamed from: c, reason: collision with root package name */
    public final List f100635c;

    public a0(r context, List collaborators, List pendingCollaboratorIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        Intrinsics.checkNotNullParameter(pendingCollaboratorIds, "pendingCollaboratorIds");
        this.f100633a = context;
        this.f100634b = collaborators;
        this.f100635c = pendingCollaboratorIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f100633a, a0Var.f100633a) && Intrinsics.d(this.f100634b, a0Var.f100634b) && Intrinsics.d(this.f100635c, a0Var.f100635c);
    }

    public final int hashCode() {
        return this.f100635c.hashCode() + ep.b.c(this.f100634b, this.f100633a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HasCollaborators(context=");
        sb3.append(this.f100633a);
        sb3.append(", collaborators=");
        sb3.append(this.f100634b);
        sb3.append(", pendingCollaboratorIds=");
        return a.c.j(sb3, this.f100635c, ")");
    }
}
