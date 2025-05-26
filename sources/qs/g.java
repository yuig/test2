package qs;

import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;
import lh0.j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final wr.c f105084a;

    /* renamed from: b, reason: collision with root package name */
    public final j f105085b;

    /* renamed from: c, reason: collision with root package name */
    public final LruCache f105086c;

    public g(wr.d jsonLogger, j adsLibraryExperiments) {
        Intrinsics.checkNotNullParameter(jsonLogger, "jsonLogger");
        Intrinsics.checkNotNullParameter(adsLibraryExperiments, "adsLibraryExperiments");
        this.f105084a = jsonLogger;
        this.f105085b = adsLibraryExperiments;
        this.f105086c = new LruCache(10);
    }
}
