package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final v2 f137557a = new v2();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.f3 value = (x40.f3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof x40.e3)) {
            if (value instanceof x40.g3) {
                List list = w2.f137586a;
                x40.g3 value2 = (x40.g3) value;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.M0("__typename");
                pc.c.f99520a.d(writer, customScalarAdapters, value2.f132429a);
                return;
            }
            return;
        }
        List list2 = u2.f137526a;
        x40.e3 value3 = (x40.e3) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value3, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value3.f132300a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value3.f132301b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value3.f132302c);
        writer.M0("emails");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value3.f132303d);
        writer.M0("unread");
        pc.c.f99526g.d(writer, customScalarAdapters, value3.f132304e);
        writer.M0("isEligibleForThreads");
        pc.c.f99527h.d(writer, customScalarAdapters, value3.f132305f);
        writer.M0("pinsubTopicId");
        pc.c.f99524e.d(writer, customScalarAdapters, value3.f132306g);
        writer.M0("users");
        pc.c.b(pc.c.c(t2.f137494a)).d(writer, customScalarAdapters, value3.f132307h);
        writer.M0("readTimesMs");
        pc.c.b(pc.c.a(pc.c.c(n2.f137305a))).d(writer, customScalarAdapters, value3.f132308i);
        writer.M0("lastMessage");
        pc.c.b(pc.c.c(l2.f137238a)).d(writer, customScalarAdapters, value3.f132309j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r6);
        kotlin.jvm.internal.Intrinsics.f(r7);
        kotlin.jvm.internal.Intrinsics.f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new x40.e3(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r17, pc.v r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.v2.f(tc.f, pc.v):java.lang.Object");
    }
}
