package lk0;

import f0.h;
import kotlin.jvm.internal.Intrinsics;
import z40.c0;
import z40.d0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83637b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83638c;

    /* renamed from: d, reason: collision with root package name */
    public final String f83639d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f83640e;

    public a(d0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        String userId = user.a();
        String initialForDefaultAvatar = h.H(user);
        String imageXLargeUrl = user.m();
        imageXLargeUrl = imageXLargeUrl == null ? "" : imageXLargeUrl;
        String imageLargeUrl = user.e();
        imageLargeUrl = imageLargeUrl == null ? "" : imageLargeUrl;
        String imageMediumUrl = user.b();
        imageMediumUrl = imageMediumUrl == null ? "" : imageMediumUrl;
        c0 i13 = user.i();
        if (i13 != null) {
            i13.a();
        }
        String l13 = user.l();
        String fullName = (l13 == null && (l13 = user.p()) == null && (l13 = user.g()) == null) ? "" : l13;
        Integer n13 = user.n();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(initialForDefaultAvatar, "initialForDefaultAvatar");
        Intrinsics.checkNotNullParameter(imageXLargeUrl, "imageXLargeUrl");
        Intrinsics.checkNotNullParameter(imageLargeUrl, "imageLargeUrl");
        Intrinsics.checkNotNullParameter(imageMediumUrl, "imageMediumUrl");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f83636a = userId;
        this.f83637b = initialForDefaultAvatar;
        this.f83638c = imageMediumUrl;
        this.f83639d = fullName;
        this.f83640e = n13;
    }
}
