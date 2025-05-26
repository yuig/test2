package xe1;

import i1.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f134773a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f134774b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f134775c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f134776d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f134777e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f134778f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f134779g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f134780h;

    public u(v0 bubbleRepNavigator, ed1.m userRepNavigator, ic1.c userProfileNavigator, gv0.b ideaPinRepNavigator, com.pinterest.feature.ideaPinCreation.closeup.view.d0 moreIdeasUpsellNavigator, b0 imageThumbnailNavigator, b0 attributionNavigator, px0.g storyFeedNavigator) {
        Intrinsics.checkNotNullParameter(bubbleRepNavigator, "bubbleRepNavigator");
        Intrinsics.checkNotNullParameter(userRepNavigator, "userRepNavigator");
        Intrinsics.checkNotNullParameter(userProfileNavigator, "userProfileNavigator");
        Intrinsics.checkNotNullParameter(ideaPinRepNavigator, "ideaPinRepNavigator");
        Intrinsics.checkNotNullParameter(moreIdeasUpsellNavigator, "moreIdeasUpsellNavigator");
        Intrinsics.checkNotNullParameter(imageThumbnailNavigator, "imageThumbnailNavigator");
        Intrinsics.checkNotNullParameter(attributionNavigator, "attributionNavigator");
        Intrinsics.checkNotNullParameter(storyFeedNavigator, "storyFeedNavigator");
        this.f134773a = bubbleRepNavigator;
        this.f134774b = userRepNavigator;
        this.f134775c = userProfileNavigator;
        this.f134776d = ideaPinRepNavigator;
        this.f134777e = moreIdeasUpsellNavigator;
        this.f134778f = imageThumbnailNavigator;
        this.f134779g = attributionNavigator;
        this.f134780h = storyFeedNavigator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f134773a, uVar.f134773a) && Intrinsics.d(this.f134774b, uVar.f134774b) && Intrinsics.d(this.f134775c, uVar.f134775c) && Intrinsics.d(this.f134776d, uVar.f134776d) && Intrinsics.d(this.f134777e, uVar.f134777e) && Intrinsics.d(this.f134778f, uVar.f134778f) && Intrinsics.d(this.f134779g, uVar.f134779g) && Intrinsics.d(this.f134780h, uVar.f134780h);
    }

    public final int hashCode() {
        return this.f134780h.hashCode() + d7.g.c(this.f134779g, d7.g.c(this.f134778f, d7.g.c(this.f134777e, (this.f134776d.hashCode() + d7.g.c(this.f134775c, d7.g.c(this.f134774b, this.f134773a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "StoryNavigators(bubbleRepNavigator=" + this.f134773a + ", userRepNavigator=" + this.f134774b + ", userProfileNavigator=" + this.f134775c + ", ideaPinRepNavigator=" + this.f134776d + ", moreIdeasUpsellNavigator=" + this.f134777e + ", imageThumbnailNavigator=" + this.f134778f + ", attributionNavigator=" + this.f134779g + ", storyFeedNavigator=" + this.f134780h + ")";
    }
}
