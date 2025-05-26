package xe1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f134705a;

    /* renamed from: b, reason: collision with root package name */
    public final List f134706b;

    /* renamed from: c, reason: collision with root package name */
    public final a f134707c;

    /* renamed from: d, reason: collision with root package name */
    public final j f134708d;

    /* renamed from: e, reason: collision with root package name */
    public final g f134709e;

    /* renamed from: f, reason: collision with root package name */
    public final g f134710f;

    /* renamed from: g, reason: collision with root package name */
    public final b f134711g;

    public f(e itemSpec, List viewTypes, a aVar, j jVar, g gVar, g gVar2, b bVar, int i13) {
        jVar = (i13 & 8) != 0 ? null : jVar;
        gVar = (i13 & 16) != 0 ? null : gVar;
        gVar2 = (i13 & 32) != 0 ? null : gVar2;
        bVar = (i13 & 64) != 0 ? null : bVar;
        Intrinsics.checkNotNullParameter(itemSpec, "itemSpec");
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        this.f134705a = itemSpec;
        this.f134706b = viewTypes;
        this.f134707c = aVar;
        this.f134708d = jVar;
        this.f134709e = gVar;
        this.f134710f = gVar2;
        this.f134711g = bVar;
    }
}
