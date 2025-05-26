package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f61137a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61138b = kotlin.collections.f0.j("backgroundColorHex", "displayText", "icon", "iconUrl", "selectedBackgroundColorHex", "selectedTextColorHex", "textColorHex");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.h0 value = (e50.h0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("backgroundColorHex");
        pc.k0 k0Var = pc.c.f99524e;
        pc.c.b(pc.c.a(k0Var)).d(writer, customScalarAdapters, value.f57355a);
        writer.M0("displayText");
        k0Var.d(writer, customScalarAdapters, value.f57356b);
        writer.M0("icon");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f57357c);
        writer.M0("iconUrl");
        k0Var.d(writer, customScalarAdapters, value.f57358d);
        writer.M0("selectedBackgroundColorHex");
        pc.c.b(pc.c.a(k0Var)).d(writer, customScalarAdapters, value.f57359e);
        writer.M0("selectedTextColorHex");
        pc.c.b(pc.c.a(k0Var)).d(writer, customScalarAdapters, value.f57360f);
        writer.M0("textColorHex");
        pc.c.b(pc.c.a(k0Var)).d(writer, customScalarAdapters, value.f57361g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        return new e50.h0(r2, r3, r4, r5, r6, r7, r8);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r10, pc.v r11) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L12:
            java.util.List r0 = f50.g0.f61138b
            int r0 = r10.V1(r0)
            switch(r0) {
                case 0: goto L76;
                case 1: goto L6c;
                case 2: goto L62;
                case 3: goto L58;
                case 4: goto L46;
                case 5: goto L34;
                case 6: goto L22;
                default: goto L1b;
            }
        L1b:
            e50.h0 r10 = new e50.h0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L22:
            pc.k0 r0 = pc.c.f99524e
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            goto L12
        L34:
            pc.k0 r0 = pc.c.f99524e
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r7 = r0
            java.util.List r7 = (java.util.List) r7
            goto L12
        L46:
            pc.k0 r0 = pc.c.f99524e
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            goto L12
        L58:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L12
        L62:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r10, r11)
            r4 = r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L12
        L6c:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        L76:
            pc.k0 r0 = pc.c.f99524e
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.g0.f(tc.f, pc.v):java.lang.Object");
    }
}
