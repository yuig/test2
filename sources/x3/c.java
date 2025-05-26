package x3;

import a.cb;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f131601a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131602b;

    public c(int i13, Resources.Theme theme) {
        this.f131601a = theme;
        this.f131602b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f131601a, cVar.f131601a) && this.f131602b == cVar.f131602b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131602b) + (this.f131601a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Key(theme=");
        sb3.append(this.f131601a);
        sb3.append(", id=");
        return cb.l(sb3, this.f131602b, ')');
    }
}
