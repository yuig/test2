package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p9 f137382a = new p9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137383b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ja value = (x40.ja) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132597a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132598b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f132599c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132600d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(g9.f137092a)).d(writer, customScalarAdapters, value.f132601e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(o9.f137349a)).d(writer, customScalarAdapters, value.f132602f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(i9.f137156a)).d(writer, customScalarAdapters, value.f132603g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f132604h);
        writer.M0("embed");
        pc.c.b(pc.c.c(d9.f136989a)).d(writer, customScalarAdapters, value.f132605i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(m9.f137284a)).d(writer, customScalarAdapters, value.f132606j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(k9.f137219a)).d(writer, customScalarAdapters, value.f132607k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(f9.f137055a)).d(writer, customScalarAdapters, value.f132608l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(e9.f137020a)).d(writer, customScalarAdapters, value.f132609m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f132610n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f132611o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132612p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132613q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.ja(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.p9.f(tc.f, pc.v):java.lang.Object");
    }
}
