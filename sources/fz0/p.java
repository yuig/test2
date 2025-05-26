package fz0;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f63146a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f63147b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63148c;

    public p(i0 context, String id3, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f63146a = context;
        this.f63147b = auxData;
        this.f63148c = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f63146a, pVar.f63146a) && Intrinsics.d(this.f63147b, pVar.f63147b) && Intrinsics.d(this.f63148c, pVar.f63148c);
    }

    public final int hashCode() {
        return this.f63148c.hashCode() + a.c.d(this.f63147b, this.f63146a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogQuizAnswer(context=");
        sb3.append(this.f63146a);
        sb3.append(", auxData=");
        sb3.append(this.f63147b);
        sb3.append(", id=");
        return a.a.p(sb3, this.f63148c, ")");
    }
}
