package xa1;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f134490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134491b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134492c;

    /* renamed from: d, reason: collision with root package name */
    public final String f134493d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f134494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f134495f;

    public w(String avatarImageUrl, String name, String title, String subtitle, p91.v onTap, int i13) {
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        this.f134490a = avatarImageUrl;
        this.f134491b = name;
        this.f134492c = title;
        this.f134493d = subtitle;
        this.f134494e = onTap;
        this.f134495f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f134490a, wVar.f134490a) && Intrinsics.d(this.f134491b, wVar.f134491b) && Intrinsics.d(this.f134492c, wVar.f134492c) && Intrinsics.d(this.f134493d, wVar.f134493d) && Intrinsics.d(this.f134494e, wVar.f134494e) && this.f134495f == wVar.f134495f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134495f) + d7.g.b(this.f134494e, cb.d(this.f134493d, cb.d(this.f134492c, cb.d(this.f134491b, this.f134490a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SettingsProfilePreviewDisplayState(avatarImageUrl=");
        sb3.append(this.f134490a);
        sb3.append(", name=");
        sb3.append(this.f134491b);
        sb3.append(", title=");
        sb3.append(this.f134492c);
        sb3.append(", subtitle=");
        sb3.append(this.f134493d);
        sb3.append(", onTap=");
        sb3.append(this.f134494e);
        sb3.append(", avatarColorIndex=");
        return a.a.n(sb3, this.f134495f, ")");
    }
}
