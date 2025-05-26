package il2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f72566b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f72567c;

    /* renamed from: d, reason: collision with root package name */
    public int f72568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f72569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f72569e = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r0.length == 0) goto L31;
     */
    @Override // il2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File a() {
        /*
            r11 = this;
            boolean r0 = r11.f72566b
            r1 = 0
            il2.g r2 = r11.f72569e
            java.io.File r3 = r11.f72573a
            if (r0 != 0) goto L20
            il2.i r0 = r2.f72572d
            kotlin.jvm.functions.Function1 r0 = r0.f72576c
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            return r1
        L1c:
            r0 = 1
            r11.f72566b = r0
            return r3
        L20:
            java.io.File[] r0 = r11.f72567c
            if (r0 == 0) goto L37
            int r4 = r11.f72568d
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L2d
            goto L37
        L2d:
            il2.i r0 = r2.f72572d
            kotlin.jvm.functions.Function1 r0 = r0.f72577d
            if (r0 == 0) goto L36
            r0.invoke(r3)
        L36:
            return r1
        L37:
            java.io.File[] r0 = r11.f72567c
            if (r0 != 0) goto L6d
            java.io.File[] r0 = r3.listFiles()
            r11.f72567c = r0
            if (r0 != 0) goto L59
            il2.i r0 = r2.f72572d
            kotlin.jvm.functions.Function2 r0 = r0.f72578e
            if (r0 == 0) goto L59
            kotlin.io.AccessDeniedException r10 = new kotlin.io.AccessDeniedException
            r8 = 2
            r9 = 0
            java.io.File r5 = r11.f72573a
            r6 = 0
            java.lang.String r7 = "Cannot list files in a directory"
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.invoke(r3, r10)
        L59:
            java.io.File[] r0 = r11.f72567c
            if (r0 == 0) goto L63
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r0 = r0.length
            if (r0 != 0) goto L6d
        L63:
            il2.i r0 = r2.f72572d
            kotlin.jvm.functions.Function1 r0 = r0.f72577d
            if (r0 == 0) goto L6c
            r0.invoke(r3)
        L6c:
            return r1
        L6d:
            java.io.File[] r0 = r11.f72567c
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r1 = r11.f72568d
            int r2 = r1 + 1
            r11.f72568d = r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.e.a():java.io.File");
    }
}
