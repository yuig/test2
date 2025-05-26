package m51;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk2.f;
import v32.c;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85877b;

    /* renamed from: c, reason: collision with root package name */
    public final rl1.a f85878c;

    /* renamed from: d, reason: collision with root package name */
    public final c f85879d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f85880e;

    public a(String title, String subtitle, rl1.a avatarViewModel, c reactionType, b01.c userTapAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatarViewModel, "avatarViewModel");
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        Intrinsics.checkNotNullParameter(userTapAction, "userTapAction");
        this.f85876a = title;
        this.f85877b = subtitle;
        this.f85878c = avatarViewModel;
        this.f85879d = reactionType;
        this.f85880e = userTapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85876a, aVar.f85876a) && Intrinsics.d(this.f85877b, aVar.f85877b) && Intrinsics.d(this.f85878c, aVar.f85878c) && this.f85879d == aVar.f85879d && Intrinsics.d(this.f85880e, aVar.f85880e);
    }

    public final int hashCode() {
        return this.f85880e.hashCode() + ((this.f85879d.hashCode() + ((this.f85878c.hashCode() + cb.d(this.f85877b, this.f85876a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserReactionViewModel(title=");
        sb3.append(this.f85876a);
        sb3.append(", subtitle=");
        sb3.append(this.f85877b);
        sb3.append(", avatarViewModel=");
        sb3.append(this.f85878c);
        sb3.append(", reactionType=");
        sb3.append(this.f85879d);
        sb3.append(", userTapAction=");
        return f.i(sb3, this.f85880e, ")");
    }
}
