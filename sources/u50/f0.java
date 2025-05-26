package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f120559a;

    public f0(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120559a = text;
    }

    @Override // u50.a0
    public final CharSequence a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f120559a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f120559a, ((f0) obj).f120559a);
    }

    public final int hashCode() {
        return this.f120559a.hashCode();
    }

    public final String toString() {
        return "StringLiteral(text=" + ((Object) this.f120559a) + ")";
    }
}
