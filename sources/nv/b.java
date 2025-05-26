package nv;

import es.h;
import g1.r;
import kotlin.jvm.internal.Intrinsics;
import lh0.j;
import lh0.o;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j f92337a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.c f92338b;

    /* renamed from: c, reason: collision with root package name */
    public final h f92339c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f92340d;

    /* renamed from: e, reason: collision with root package name */
    public final o f92341e;

    /* renamed from: f, reason: collision with root package name */
    public final v f92342f;

    /* renamed from: g, reason: collision with root package name */
    public final r f92343g;

    /* renamed from: h, reason: collision with root package name */
    public final v f92344h;

    public b(j adsLibraryExperiments, wr.d adFormatsLogger, h adsCommonDisplay, es.a adFormats, o baseExperimentsHelper) {
        Intrinsics.checkNotNullParameter(adsLibraryExperiments, "adsLibraryExperiments");
        Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(baseExperimentsHelper, "baseExperimentsHelper");
        this.f92337a = adsLibraryExperiments;
        this.f92338b = adFormatsLogger;
        this.f92339c = adsCommonDisplay;
        this.f92340d = adFormats;
        this.f92341e = baseExperimentsHelper;
        this.f92342f = m.b(new a(this, 1));
        this.f92343g = new r(1024);
        this.f92344h = m.b(new a(this, 0));
    }
}
