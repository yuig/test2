package rm2;

import am2.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends f {

    /* renamed from: c, reason: collision with root package name */
    public final am2.d0 f108764c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.messaging.q f108765d;

    /* renamed from: e, reason: collision with root package name */
    public final tb.l f108766e;

    /* renamed from: f, reason: collision with root package name */
    public xm2.g f108767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dm2.i0 module, com.google.firebase.messaging.q notFoundClasses, on2.q storageManager, fm2.d kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f108764c = module;
        this.f108765d = notFoundClasses;
        this.f108766e = new tb.l(module, notFoundClasses);
        this.f108767f = xm2.g.f135403g;
    }

    public static final dn2.g t(o oVar, ym2.g gVar, Object obj) {
        dn2.g b13 = dn2.h.f55624a.b(obj, oVar.f108764c);
        if (b13 != null) {
            return b13;
        }
        return i0.a("Unsupported annotation argument: " + gVar);
    }

    @Override // rm2.f
    public final n p(ym2.b annotationClassId, w0 source, List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        return new n(this, lb.l0.e0(this.f108764c, annotationClassId, this.f108765d), annotationClassId, result, source);
    }
}
