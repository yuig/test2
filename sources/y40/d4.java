package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d4 f136981a = new d4();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136982b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.o4 value = (x40.o4) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132923a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132924b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f132925c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132926d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(u3.f137527a)).d(writer, customScalarAdapters, value.f132927e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(c4.f136950a)).d(writer, customScalarAdapters, value.f132928f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(w3.f137587a)).d(writer, customScalarAdapters, value.f132929g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f132930h);
        writer.M0("embed");
        pc.c.b(pc.c.c(r3.f137435a)).d(writer, customScalarAdapters, value.f132931i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(a4.f136888a)).d(writer, customScalarAdapters, value.f132932j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(y3.f137647a)).d(writer, customScalarAdapters, value.f132933k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(t3.f137495a)).d(writer, customScalarAdapters, value.f132934l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(s3.f137462a)).d(writer, customScalarAdapters, value.f132935m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f132936n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f132937o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132938p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132939q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return new x40.o4(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.d4.f(tc.f, pc.v):java.lang.Object");
    }
}
