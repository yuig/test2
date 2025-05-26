package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final gg f137104a = new gg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137105b = kotlin.collections.f0.j("__typename", "id", "title", "entityId", "pinnedToBoard", "storyPinData", "pinner", "storyPinDataId", "embed", "richSummary", "richMetadata", "imageMediumSizePixels", "imageLargeSizePixels", "imageSignature", "commentCount", "imageMediumUrl", "imageLargeUrl", "nativeCreator", "thirdPartyPinOwner", "linkUserWebsite", "linkDomain", "imageMediumDetails", "imageLargeDetails");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.mh value = (x40.mh) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132830a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132831b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f132832c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132833d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(vf.f137578a)).d(writer, customScalarAdapters, value.f132834e);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(dg.f137000a)).d(writer, customScalarAdapters, value.f132835f);
        writer.M0("pinner");
        pc.c.b(pc.c.c(xf.f137637a)).d(writer, customScalarAdapters, value.f132836g);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value.f132837h);
        writer.M0("embed");
        pc.c.b(pc.c.c(Cif.f137167a)).d(writer, customScalarAdapters, value.f132838i);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(bg.f136938a)).d(writer, customScalarAdapters, value.f132839j);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(zf.f137699a)).d(writer, customScalarAdapters, value.f132840k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(mf.f137293a)).d(writer, customScalarAdapters, value.f132841l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(kf.f137229a)).d(writer, customScalarAdapters, value.f132842m);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value.f132843n);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f132844o);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132845p);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132846q);
        writer.M0("nativeCreator");
        pc.c.b(pc.c.c(uf.f137548a)).d(writer, customScalarAdapters, value.f132847r);
        writer.M0("thirdPartyPinOwner");
        pc.c.b(pc.c.c(fg.f137069a)).d(writer, customScalarAdapters, value.f132848s);
        writer.M0("linkUserWebsite");
        pc.c.b(pc.c.c(sf.f137482a)).d(writer, customScalarAdapters, value.f132849t);
        writer.M0("linkDomain");
        pc.c.b(pc.c.c(pf.f137392a)).d(writer, customScalarAdapters, value.f132850u);
        writer.M0("imageMediumDetails");
        pc.c.b(pc.c.c(lf.f137260a)).d(writer, customScalarAdapters, value.f132851v);
        writer.M0("imageLargeDetails");
        pc.c.b(pc.c.c(jf.f137198a)).d(writer, customScalarAdapters, value.f132852w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        return new x40.mh(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r28, pc.v r29) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.gg.f(tc.f, pc.v):java.lang.Object");
    }
}
