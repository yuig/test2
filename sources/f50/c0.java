package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f61118a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61119b = kotlin.collections.f0.j("id", "imageUrl", "isSelected", "isVerified", "label", "numericValue", "rules", "searchType", "stringValue", "trackingParams", "type", "unit");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.d0 value = (e50.d0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("id");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f57300a);
        writer.M0("imageUrl");
        pc.c.b(pc.c.f99520a).d(writer, customScalarAdapters, value.f57301b);
        writer.M0("isSelected");
        pc.k0 k0Var2 = pc.c.f99527h;
        k0Var2.d(writer, customScalarAdapters, value.f57302c);
        writer.M0("isVerified");
        k0Var2.d(writer, customScalarAdapters, value.f57303d);
        writer.M0("label");
        k0Var.d(writer, customScalarAdapters, value.f57304e);
        writer.M0("numericValue");
        pc.c.f99525f.d(writer, customScalarAdapters, value.f57305f);
        writer.M0("rules");
        pc.c.b(pc.c.a(pc.c.f99521b)).d(writer, customScalarAdapters, value.f57306g);
        writer.M0("searchType");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f57307h);
        writer.M0("stringValue");
        k0Var.d(writer, customScalarAdapters, value.f57308i);
        writer.M0("trackingParams");
        k0Var.d(writer, customScalarAdapters, value.f57309j);
        writer.M0("type");
        k0Var.d(writer, customScalarAdapters, value.f57310k);
        writer.M0("unit");
        k0Var.d(writer, customScalarAdapters, value.f57311l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return new e50.d0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r17, pc.v r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L1b:
            java.util.List r2 = f50.c0.f61119b
            int r2 = r0.V1(r2)
            switch(r2) {
                case 0: goto La3;
                case 1: goto L94;
                case 2: goto L8a;
                case 3: goto L80;
                case 4: goto L76;
                case 5: goto L6c;
                case 6: goto L5a;
                case 7: goto L53;
                case 8: goto L49;
                case 9: goto L3f;
                case 10: goto L35;
                case 11: goto L2b;
                default: goto L24;
            }
        L24:
            e50.d0 r0 = new e50.d0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L2b:
            pc.k0 r2 = pc.c.f99524e
            java.lang.Object r2 = r2.f(r0, r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            goto L1b
        L35:
            pc.k0 r2 = pc.c.f99524e
            java.lang.Object r2 = r2.f(r0, r1)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            goto L1b
        L3f:
            pc.k0 r2 = pc.c.f99524e
            java.lang.Object r2 = r2.f(r0, r1)
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            goto L1b
        L49:
            pc.k0 r2 = pc.c.f99524e
            java.lang.Object r2 = r2.f(r0, r1)
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            goto L1b
        L53:
            pc.k0 r2 = pc.c.f99528i
            java.lang.Object r11 = r2.f(r0, r1)
            goto L1b
        L5a:
            a10.e r2 = pc.c.f99521b
            pc.d r2 = pc.c.a(r2)
            pc.k0 r2 = pc.c.b(r2)
            java.lang.Object r2 = r2.f(r0, r1)
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            goto L1b
        L6c:
            pc.k0 r2 = pc.c.f99525f
            java.lang.Object r2 = r2.f(r0, r1)
            r9 = r2
            java.lang.Double r9 = (java.lang.Double) r9
            goto L1b
        L76:
            pc.k0 r2 = pc.c.f99524e
            java.lang.Object r2 = r2.f(r0, r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            goto L1b
        L80:
            pc.k0 r2 = pc.c.f99527h
            java.lang.Object r2 = r2.f(r0, r1)
            r7 = r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L1b
        L8a:
            pc.k0 r2 = pc.c.f99527h
            java.lang.Object r2 = r2.f(r0, r1)
            r6 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L1b
        L94:
            a10.e r2 = pc.c.f99520a
            pc.k0 r2 = pc.c.b(r2)
            java.lang.Object r2 = r2.f(r0, r1)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            goto L1b
        La3:
            pc.k0 r2 = pc.c.f99524e
            java.lang.Object r2 = r2.f(r0, r1)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.c0.f(tc.f, pc.v):java.lang.Object");
    }
}
