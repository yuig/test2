package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z7 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z7 f137685a = new z7();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137686b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.s8 value = (x40.s8) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133242a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133243b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f133244c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133245d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(q7.f137410a)).d(writer, customScalarAdapters, value.f133246e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(y7.f137655a)).d(writer, customScalarAdapters, value.f133247f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(s7.f137468a)).d(writer, customScalarAdapters, value.f133248g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f133249h);
        writer.M0("embed");
        pc.c.b(pc.c.c(n7.f137315a)).d(writer, customScalarAdapters, value.f133250i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(w7.f137594a)).d(writer, customScalarAdapters, value.f133251j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(u7.f137534a)).d(writer, customScalarAdapters, value.f133252k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(p7.f137379a)).d(writer, customScalarAdapters, value.f133253l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(o7.f137345a)).d(writer, customScalarAdapters, value.f133254m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f133255n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133256o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133257p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133258q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.s8(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.z7.f(tc.f, pc.v):java.lang.Object");
    }
}
