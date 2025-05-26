package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c9 f136958a = new c9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136959b = kotlin.collections.f0.j("__typename", "id", "entityId", "pinCount", "privacy", "name", "owner", "pinThumbnailUrls", "imageCoverHdUrl", "hasCustomCover", "imageCoverUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.w9 value = (x40.w9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133608a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133609b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133610c);
        writer.M0("pinCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133611d);
        writer.M0("privacy");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f133612e);
        writer.M0("name");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f133613f);
        writer.M0("owner");
        pc.c.b(pc.c.c(b9.f136929a)).d(writer, customScalarAdapters, value.f133614g);
        writer.M0("pinThumbnailUrls");
        pc.c.b(pc.c.a(k0Var)).d(writer, customScalarAdapters, value.f133615h);
        writer.M0("imageCoverHdUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133616i);
        writer.M0("hasCustomCover");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133617j);
        writer.M0("imageCoverUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133618k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        return new x40.w9(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r14, pc.v r15) {
        /*
            r13 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        L16:
            java.util.List r0 = y40.c9.f136959b
            int r0 = r14.V1(r0)
            switch(r0) {
                case 0: goto Laa;
                case 1: goto L9f;
                case 2: goto L94;
                case 3: goto L8a;
                case 4: goto L83;
                case 5: goto L79;
                case 6: goto L67;
                case 7: goto L55;
                case 8: goto L47;
                case 9: goto L3d;
                case 10: goto L2f;
                default: goto L1f;
            }
        L1f:
            x40.w9 r14 = new x40.w9
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L2f:
            a10.e r0 = pc.c.f99520a
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            goto L16
        L3d:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r14, r15)
            r11 = r0
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            goto L16
        L47:
            a10.e r0 = pc.c.f99520a
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            goto L16
        L55:
            pc.k0 r0 = pc.c.f99524e
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r9 = r0
            java.util.List r9 = (java.util.List) r9
            goto L16
        L67:
            y40.b9 r0 = y40.b9.f136929a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r8 = r0
            x40.v9 r8 = (x40.v9) r8
            goto L16
        L79:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L16
        L83:
            pc.k0 r0 = pc.c.f99528i
            java.lang.Object r6 = r0.f(r14, r15)
            goto L16
        L8a:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r14, r15)
            r5 = r0
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L16
        L94:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L16
        L9f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L16
        Laa:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.c9.f(tc.f, pc.v):java.lang.Object");
    }
}
