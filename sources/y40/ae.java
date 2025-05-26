package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ae implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f136905a = new ae();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ff value = (x40.ff) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof x40.dg)) {
            if (value instanceof x40.gf) {
                List list = be.f136936a;
                be.b(writer, customScalarAdapters, (x40.gf) value);
                return;
            }
            return;
        }
        List list2 = ye.f137667a;
        x40.dg value2 = (x40.dg) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value2.f132250a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value2.f132251b);
        writer.M0("title");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value2.f132252c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value2.f132253d);
        writer.M0("pinnedToBoard");
        pc.c.b(pc.c.c(ne.f137326a)).d(writer, customScalarAdapters, value2.f132254e);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.f132255f);
        writer.M0("storyPinDataId");
        k0Var.d(writer, customScalarAdapters, value2.f132256g);
        writer.M0("storyPinData");
        pc.c.b(pc.c.c(ve.f137576a)).d(writer, customScalarAdapters, value2.f132257h);
        writer.M0("embed");
        pc.c.b(pc.c.c(ce.f136966a)).d(writer, customScalarAdapters, value2.f132258i);
        writer.M0("richMetadata");
        pc.c.b(pc.c.c(re.f137451a)).d(writer, customScalarAdapters, value2.f132259j);
        writer.M0("richSummary");
        pc.c.b(pc.c.c(te.f137514a)).d(writer, customScalarAdapters, value2.f132260k);
        writer.M0("imageMediumSizePixels");
        pc.c.b(pc.c.c(ee.f137029a)).d(writer, customScalarAdapters, value2.f132261l);
        writer.M0("imageLargeSizePixels");
        pc.c.b(pc.c.c(de.f136997a)).d(writer, customScalarAdapters, value2.f132262m);
        writer.M0("nativeCreator");
        pc.c.b(pc.c.c(me.f137291a)).d(writer, customScalarAdapters, value2.f132263n);
        writer.M0("pinner");
        pc.c.b(pc.c.c(pe.f137390a)).d(writer, customScalarAdapters, value2.f132264o);
        writer.M0("thirdPartyPinOwner");
        pc.c.b(pc.c.c(xe.f137635a)).d(writer, customScalarAdapters, value2.f132265p);
        writer.M0("linkUserWebsite");
        pc.c.b(pc.c.c(ke.f137227a)).d(writer, customScalarAdapters, value2.f132266q);
        writer.M0("linkDomain");
        pc.c.b(pc.c.c(he.f137133a)).d(writer, customScalarAdapters, value2.f132267r);
        writer.M0("commentCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value2.f132268s);
        writer.M0("imageSignature");
        k0Var.d(writer, customScalarAdapters, value2.f132269t);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.f132270u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r6);
        kotlin.jvm.internal.Intrinsics.f(r7);
        kotlin.jvm.internal.Intrinsics.f(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new x40.dg(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r28, pc.v r29) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.ae.f(tc.f, pc.v):java.lang.Object");
    }
}
