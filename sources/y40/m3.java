package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m3 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m3 f137272a = new m3();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137273b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.x3 value = (x40.x3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133655a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133656b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f133657c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133658d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(d3.f136979a)).d(writer, customScalarAdapters, value.f133659e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(l3.f137240a)).d(writer, customScalarAdapters, value.f133660f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(f3.f137043a)).d(writer, customScalarAdapters, value.f133661g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f133662h);
        writer.M0("embed");
        pc.c.b(pc.c.c(a3.f136886a)).d(writer, customScalarAdapters, value.f133663i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(j3.f137178a)).d(writer, customScalarAdapters, value.f133664j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(h3.f137114a)).d(writer, customScalarAdapters, value.f133665k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(c3.f136948a)).d(writer, customScalarAdapters, value.f133666l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(b3.f136918a)).d(writer, customScalarAdapters, value.f133667m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f133668n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133669o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133670p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133671q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.x3(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.m3.f(tc.f, pc.v):java.lang.Object");
    }
}
