package pp1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends c92.n {

    /* renamed from: b, reason: collision with root package name */
    public final int f100934b;

    /* renamed from: c, reason: collision with root package name */
    public final List f100935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i13, List sections) {
        super(true);
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f100934b = i13;
        this.f100935c = sections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f100934b == mVar.f100934b && Intrinsics.d(this.f100935c, mVar.f100935c);
    }

    public final int hashCode() {
        return this.f100935c.hashCode() + (Integer.hashCode(this.f100934b) * 31);
    }

    public final String toString() {
        return "Variant2(layoutId=" + this.f100934b + ", sections=" + this.f100935c + ")";
    }
}
