package ei2;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xf2.k0;

/* loaded from: classes4.dex */
public final class g implements pj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final x f58987a;

    /* renamed from: b, reason: collision with root package name */
    public final pj2.c f58988b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f58989c;

    public g(x spanSink, pj2.c externalSpanExporter, sh2.i exportCheck) {
        Intrinsics.checkNotNullParameter(spanSink, "spanSink");
        Intrinsics.checkNotNullParameter(externalSpanExporter, "externalSpanExporter");
        Intrinsics.checkNotNullParameter(exportCheck, "exportCheck");
        this.f58987a = spanSink;
        this.f58988b = externalSpanExporter;
        this.f58989c = exportCheck;
    }

    @Override // pj2.c
    public final synchronized zi2.c b(ArrayList spans) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        if (!((Boolean) this.f58989c.invoke()).booleanValue()) {
            zi2.c cVar = zi2.c.f142036e;
            Intrinsics.checkNotNullExpressionValue(cVar, "ofSuccess()");
            return cVar;
        }
        zi2.c b13 = this.f58987a.b(CollectionsKt.F0(spans));
        if (!Intrinsics.d(b13, zi2.c.f142036e)) {
            return b13;
        }
        pj2.c cVar2 = this.f58988b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            nj2.r rVar = (nj2.r) obj;
            k0 fixedAttribute = k0.f134870a;
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            Intrinsics.checkNotNullParameter(fixedAttribute, "fixedAttribute");
            rVar.getClass();
            if (!Intrinsics.d(((nj2.b) rVar).f90986d.a().get(k0.f134871b.f134856b), k0.f134872c)) {
                arrayList.add(obj);
            }
        }
        zi2.c b14 = cVar2.b(arrayList);
        Intrinsics.checkNotNullExpressionValue(b14, "externalSpanExporter.exp…Attribute(PrivateSpan) })");
        return b14;
    }

    @Override // pj2.c
    public final synchronized zi2.c shutdown() {
        zi2.c cVar;
        cVar = zi2.c.f142036e;
        Intrinsics.checkNotNullExpressionValue(cVar, "ofSuccess()");
        return cVar;
    }
}
