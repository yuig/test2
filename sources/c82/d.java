package c82;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f26959a;

    /* renamed from: b, reason: collision with root package name */
    public final gz1.b f26960b;

    public d(e siteService, gz1.b googlePlayServices) {
        Intrinsics.checkNotNullParameter(siteService, "siteService");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f26959a = siteService;
        this.f26960b = googlePlayServices;
    }

    public final void a(String url, String pinUid, String str, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new c(hashMap, this, str, url, pinUid, z13).b();
    }
}
