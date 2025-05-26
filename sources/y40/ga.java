package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ga implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ga f137094a = new ga();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137095b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ab value = (x40.ab) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f131942a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f131943b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f131944c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f131945d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(x9.f137627a)).d(writer, customScalarAdapters, value.f131946e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(fa.f137057a)).d(writer, customScalarAdapters, value.f131947f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(z9.f137688a)).d(writer, customScalarAdapters, value.f131948g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f131949h);
        writer.M0("embed");
        pc.c.b(pc.c.c(u9.f137537a)).d(writer, customScalarAdapters, value.f131950i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(da.f136991a)).d(writer, customScalarAdapters, value.f131951j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(ba.f136931a)).d(writer, customScalarAdapters, value.f131952k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(w9.f137597a)).d(writer, customScalarAdapters, value.f131953l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(v9.f137567a)).d(writer, customScalarAdapters, value.f131954m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f131955n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f131956o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131957p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131958q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.ab(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.ga.f(tc.f, pc.v):java.lang.Object");
    }
}
