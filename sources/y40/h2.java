package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h2 f137112a = new h2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137113b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.r2 value = (x40.r2) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133132a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133133b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f133134c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133135d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(y1.f137643a)).d(writer, customScalarAdapters, value.f133136e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(g2.f137079a)).d(writer, customScalarAdapters, value.f133137f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(a2.f136884a)).d(writer, customScalarAdapters, value.f133138g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f133139h);
        writer.M0("embed");
        pc.c.b(pc.c.c(v1.f137555a)).d(writer, customScalarAdapters, value.f133140i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(e2.f137008a)).d(writer, customScalarAdapters, value.f133141j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(c2.f136946a)).d(writer, customScalarAdapters, value.f133142k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(x1.f137613a)).d(writer, customScalarAdapters, value.f133143l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(w1.f137584a)).d(writer, customScalarAdapters, value.f133144m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f133145n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133146o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133147p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133148q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.r2(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r22, pc.v r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.h2.f(tc.f, pc.v):java.lang.Object");
    }
}
