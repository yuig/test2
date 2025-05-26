package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f137399a = new q1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137400b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a2 value = (x40.a2) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f131895a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f131896b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f131897c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f131898d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(h1.f137110a)).d(writer, customScalarAdapters, value.f131899e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(p1.f137368a)).d(writer, customScalarAdapters, value.f131900f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(j1.f137174a)).d(writer, customScalarAdapters, value.f131901g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f131902h);
        writer.M0("embed");
        pc.c.b(pc.c.c(e1.f137006a)).d(writer, customScalarAdapters, value.f131903i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(n1.f137303a)).d(writer, customScalarAdapters, value.f131904j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(l1.f137236a)).d(writer, customScalarAdapters, value.f131905k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(g1.f137077a)).d(writer, customScalarAdapters, value.f131906l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(f1.f137039a)).d(writer, customScalarAdapters, value.f131907m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f131908n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f131909o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131910p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131911q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.a2(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.q1.f(tc.f, pc.v):java.lang.Object");
    }
}
