package g21;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import z32.o;

/* loaded from: classes5.dex */
public final class a extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f63386h;

    /* renamed from: i, reason: collision with root package name */
    public final String f63387i;

    /* renamed from: j, reason: collision with root package name */
    public final o f63388j;

    public a(String text, String actionUri, o style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actionUri, "actionUri");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f63386h = text;
        this.f63387i = actionUri;
        this.f63388j = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f63386h, aVar.f63386h) && Intrinsics.d(this.f63387i, aVar.f63387i) && this.f63388j == aVar.f63388j;
    }

    public final int hashCode() {
        return this.f63388j.hashCode() + cb.d(this.f63387i, this.f63386h.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ActionButtonViewModel(text=" + this.f63386h + ", actionUri=" + this.f63387i + ", style=" + this.f63388j + ")";
    }
}
