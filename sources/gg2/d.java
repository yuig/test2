package gg2;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f64976a;

    /* renamed from: b, reason: collision with root package name */
    public final k f64977b;

    /* renamed from: c, reason: collision with root package name */
    public final sg2.a f64978c;

    /* renamed from: d, reason: collision with root package name */
    public final uh2.b f64979d;

    /* renamed from: e, reason: collision with root package name */
    public final ki2.a f64980e;

    /* renamed from: f, reason: collision with root package name */
    public final og2.a f64981f;

    /* renamed from: g, reason: collision with root package name */
    public final lh2.b f64982g;

    /* renamed from: h, reason: collision with root package name */
    public final v f64983h;

    /* renamed from: i, reason: collision with root package name */
    public final v f64984i;

    /* renamed from: j, reason: collision with root package name */
    public volatile b f64985j;

    public d(v resourceSource, Context context, v storageStatsManager, sg2.a configService, uh2.b preferencesService, ki2.a metadataBackgroundWorker, og2.a clock, lh2.b logger) {
        Intrinsics.checkNotNullParameter(resourceSource, "resourceSource");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storageStatsManager, "storageStatsManager");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(metadataBackgroundWorker, "metadataBackgroundWorker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f64976a = context;
        this.f64977b = storageStatsManager;
        this.f64978c = configService;
        this.f64979d = preferencesService;
        this.f64980e = metadataBackgroundWorker;
        this.f64981f = clock;
        this.f64982g = logger;
        this.f64983h = m.b(new s52.m(resourceSource, 7));
        this.f64984i = m.b(c.f64975i);
    }
}
