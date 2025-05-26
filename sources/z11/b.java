package z11;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk2.f;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f140596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f140597b;

    /* renamed from: c, reason: collision with root package name */
    public final rl1.a f140598c;

    /* renamed from: d, reason: collision with root package name */
    public final v32.c f140599d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f140600e;

    public b(String title, String subtitle, rl1.a avatarViewModel, v32.c reactionType, b01.c userTapAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatarViewModel, "avatarViewModel");
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        Intrinsics.checkNotNullParameter(userTapAction, "userTapAction");
        this.f140596a = title;
        this.f140597b = subtitle;
        this.f140598c = avatarViewModel;
        this.f140599d = reactionType;
        this.f140600e = userTapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f140596a, bVar.f140596a) && Intrinsics.d(this.f140597b, bVar.f140597b) && Intrinsics.d(this.f140598c, bVar.f140598c) && this.f140599d == bVar.f140599d && Intrinsics.d(this.f140600e, bVar.f140600e);
    }

    public final int hashCode() {
        return this.f140600e.hashCode() + ((this.f140599d.hashCode() + ((this.f140598c.hashCode() + cb.d(this.f140597b, this.f140596a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserReactionViewModel(title=");
        sb3.append(this.f140596a);
        sb3.append(", subtitle=");
        sb3.append(this.f140597b);
        sb3.append(", avatarViewModel=");
        sb3.append(this.f140598c);
        sb3.append(", reactionType=");
        sb3.append(this.f140599d);
        sb3.append(", userTapAction=");
        return f.i(sb3, this.f140600e, ")");
    }
}
