package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x8 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x8 f137626a = new x8();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.r9 value = (x40.r9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof x40.rb)) {
            if (value instanceof x40.t9) {
                List list = z8.f137687a;
                z8.b(writer, customScalarAdapters, (x40.t9) value);
                return;
            } else {
                if (value instanceof x40.u9) {
                    List list2 = a9.f136897a;
                    a9.b(writer, customScalarAdapters, (x40.u9) value);
                    return;
                }
                return;
            }
        }
        List list3 = xa.f137629a;
        x40.rb value2 = (x40.rb) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value2.f133179d);
        writer.M0("connection");
        pc.c.b(pc.c.c(wa.f137599a)).d(writer, customScalarAdapters, value2.f133180e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r2.equals("IllegalBookmarkCharacter") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r2.equals("BookmarkPageSizeExceedsMaximum") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0079, code lost:
    
        return y40.z8.a(r5, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2.equals("BookmarkDoesNotExist") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r5, pc.v r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r5, r0, r6, r1, r5)
            int r3 = r2.hashCode()
            switch(r3) {
                case -1668571683: goto L68;
                case 397769698: goto L22;
                case 706192883: goto L19;
                case 1822377511: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L70
        L10:
            java.lang.String r0 = "BookmarkPageSizeExceedsMaximum"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L75
            goto L70
        L19:
            java.lang.String r0 = "BookmarkDoesNotExist"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L75
            goto L70
        L22:
            java.lang.String r3 = "V3GetConversationsDataConnectionContainer"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2b
            goto L70
        L2b:
            java.util.List r3 = y40.xa.f137629a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r0 = "typename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
        L39:
            java.util.List r1 = y40.xa.f137629a
            int r1 = r5.V1(r1)
            if (r1 == 0) goto L5e
            r3 = 1
            if (r1 == r3) goto L4d
            x40.rb r5 = new x40.rb
            kotlin.jvm.internal.Intrinsics.f(r2)
            r5.<init>(r2, r0)
            goto L79
        L4d:
            y40.wa r0 = y40.wa.f137599a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r5, r6)
            x40.qb r0 = (x40.qb) r0
            goto L39
        L5e:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r5, r6)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L39
        L68:
            java.lang.String r0 = "IllegalBookmarkCharacter"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L75
        L70:
            x40.u9 r5 = y40.a9.a(r5, r6, r2)
            goto L79
        L75:
            x40.t9 r5 = y40.z8.a(r5, r6, r2)
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.x8.f(tc.f, pc.v):java.lang.Object");
    }
}
