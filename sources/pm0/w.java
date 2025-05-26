package pm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements b {

    /* renamed from: a, reason: collision with root package name */
    public final l f100705a;

    public w(l collaborators) {
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        this.f100705a = collaborators;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f100705a, ((w) obj).f100705a);
    }

    public final int hashCode() {
        return this.f100705a.hashCode();
    }

    public final String toString() {
        return "CollaboratorsLoaded(collaborators=" + this.f100705a + ")";
    }
}
