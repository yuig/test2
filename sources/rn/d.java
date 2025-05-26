package rn;

import a.cb;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f108812a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d.class == obj.getClass() && this.f108812a == ((d) obj).f108812a;
    }

    public final int hashCode() {
        return this.f108812a ? 1 : 0;
    }

    public final String toString() {
        return cb.m(new StringBuilder("LineFriendshipStatus{friendFlag="), this.f108812a, '}');
    }
}
