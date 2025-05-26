package jd1;

import kotlin.jvm.internal.Intrinsics;
import nk1.k;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f75531a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75532b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75533c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75534d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f75535e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f75536f;

    /* renamed from: g, reason: collision with root package name */
    public final ze0.a f75537g;

    /* renamed from: h, reason: collision with root package name */
    public final k f75538h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f75539i;

    public h(ze0.a userRepStyle, int i13) {
        userRepStyle = (i13 & 64) != 0 ? ze0.a.NoPreview : userRepStyle;
        k userFollowActionListener = new k(null, 7);
        Intrinsics.checkNotNullParameter(userRepStyle, "userRepStyle");
        Intrinsics.checkNotNullParameter(userFollowActionListener, "userFollowActionListener");
        this.f75531a = true;
        this.f75532b = false;
        this.f75533c = false;
        this.f75534d = true;
        this.f75535e = true;
        this.f75536f = true;
        this.f75537g = userRepStyle;
        this.f75538h = userFollowActionListener;
        this.f75539i = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f75531a == hVar.f75531a && this.f75532b == hVar.f75532b && this.f75533c == hVar.f75533c && this.f75534d == hVar.f75534d && this.f75535e == hVar.f75535e && this.f75536f == hVar.f75536f && this.f75537g == hVar.f75537g && Intrinsics.d(this.f75538h, hVar.f75538h) && this.f75539i == hVar.f75539i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75539i) + ((this.f75538h.hashCode() + ((this.f75537g.hashCode() + ep.b.e(this.f75536f, ep.b.e(this.f75535e, ep.b.e(this.f75534d, ep.b.e(this.f75533c, ep.b.e(this.f75532b, Boolean.hashCode(this.f75531a) * 31, 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserFeedRepViewConfig(showVerifiedMerchantIcon=");
        sb3.append(this.f75531a);
        sb3.append(", showActionButton=");
        sb3.append(this.f75532b);
        sb3.append(", showMetadata=");
        sb3.append(this.f75533c);
        sb3.append(", useCustomActions=");
        sb3.append(this.f75534d);
        sb3.append(", showAvatar=");
        sb3.append(this.f75535e);
        sb3.append(", showTitle=");
        sb3.append(this.f75536f);
        sb3.append(", userRepStyle=");
        sb3.append(this.f75537g);
        sb3.append(", userFollowActionListener=");
        sb3.append(this.f75538h);
        sb3.append(", disableAvatarClick=");
        return a.a.r(sb3, this.f75539i, ")");
    }
}
