package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i7 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i7 f137152a = new i7();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137153b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.b8 value = (x40.b8) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132019a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132020b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f132021c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132022d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(z6.f137683a)).d(writer, customScalarAdapters, value.f132023e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(h7.f137121a)).d(writer, customScalarAdapters, value.f132024f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(b7.f136925a)).d(writer, customScalarAdapters, value.f132025g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f132026h);
        writer.M0("embed");
        pc.c.b(pc.c.c(w6.f137592a)).d(writer, customScalarAdapters, value.f132027i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(f7.f137051a)).d(writer, customScalarAdapters, value.f132028j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(d7.f136985a)).d(writer, customScalarAdapters, value.f132029k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(y6.f137653a)).d(writer, customScalarAdapters, value.f132030l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(x6.f137622a)).d(writer, customScalarAdapters, value.f132031m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f132032n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f132033o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132034p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132035q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.b8(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.i7.f(tc.f, pc.v):java.lang.Object");
    }
}
