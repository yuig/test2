package h72;

import android.content.Context;
import ao2.q0;
import c72.c0;
import g4.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class l implements o72.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f67986a;

    /* renamed from: b, reason: collision with root package name */
    public final k72.c f67987b;

    /* renamed from: c, reason: collision with root package name */
    public final k72.d f67988c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f67989d;

    /* renamed from: e, reason: collision with root package name */
    public final y f67990e;

    /* renamed from: f, reason: collision with root package name */
    public final n72.a f67991f;

    /* renamed from: g, reason: collision with root package name */
    public final n72.m f67992g;

    /* renamed from: h, reason: collision with root package name */
    public final u f67993h;

    /* renamed from: i, reason: collision with root package name */
    public final q0 f67994i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f67995j;

    /* renamed from: k, reason: collision with root package name */
    public List f67996k;

    public l(Context context, k72.c fileService, k72.d resourcesService, c0 typeFaceInMemoryDataSource, y entityMapperFontData, n72.a dispatcherProvider, m72.a logger, u statsTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileService, "fileService");
        Intrinsics.checkNotNullParameter(resourcesService, "resourcesService");
        Intrinsics.checkNotNullParameter(typeFaceInMemoryDataSource, "typeFaceInMemoryDataSource");
        Intrinsics.checkNotNullParameter(entityMapperFontData, "entityMapperFontData");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(statsTracker, "statsTracker");
        this.f67986a = context;
        this.f67987b = fileService;
        this.f67988c = resourcesService;
        this.f67989d = typeFaceInMemoryDataSource;
        this.f67990e = entityMapperFontData;
        this.f67991f = dispatcherProvider;
        this.f67992g = logger;
        this.f67993h = statsTracker;
        ho2.c b13 = dl2.b.b(kotlin.coroutines.g.d(dispatcherProvider.f89707c, ue.c.b()));
        this.f67994i = kotlin.jvm.internal.j.d(b13, null, new j(this, null), 3);
        this.f67995j = kotlin.jvm.internal.j.d(b13, null, new c(this, null), 3);
    }
}
