package a6;

import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(a6.i r5, java.util.List r6, a6.b0 r7, bl2.c r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof a6.d
            if (r0 == 0) goto L16
            r0 = r8
            a6.d r0 = (a6.d) r0
            int r1 = r0.f811v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f811v = r1
            goto L1b
        L16:
            a6.d r0 = new a6.d
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r5 = r0.f809t
            cl2.a r8 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r0.f811v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.util.Iterator r6 = r0.f808s
            java.io.Serializable r7 = r0.f807r
            kotlin.jvm.internal.j0 r7 = (kotlin.jvm.internal.j0) r7
            ue.c.H(r5)     // Catch: java.lang.Throwable -> L33
            goto L6b
        L33:
            r5 = move-exception
            goto L84
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            java.io.Serializable r6 = r0.f807r
            java.util.List r6 = (java.util.List) r6
            ue.c.H(r5)
            goto L5f
        L45:
            ue.c.H(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            a6.f r1 = new a6.f
            r4 = 0
            r1.<init>(r6, r5, r4)
            r0.f807r = r5
            r0.f811v = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r8) goto L5e
            goto L99
        L5e:
            r6 = r5
        L5f:
            kotlin.jvm.internal.j0 r5 = new kotlin.jvm.internal.j0
            r5.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L6b:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L91
            java.lang.Object r5 = r6.next()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.f807r = r7     // Catch: java.lang.Throwable -> L33
            r0.f808s = r6     // Catch: java.lang.Throwable -> L33
            r0.f811v = r2     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L33
            if (r5 != r8) goto L6b
            goto L99
        L84:
            java.lang.Object r1 = r7.f80434a
            if (r1 != 0) goto L8b
            r7.f80434a = r5
            goto L6b
        L8b:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            xk2.f.a(r1, r5)
            goto L6b
        L91:
            java.lang.Object r5 = r7.f80434a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L9a
            kotlin.Unit r8 = kotlin.Unit.f80348a
        L99:
            return r8
        L9a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.i.a(a6.i, java.util.List, a6.b0, bl2.c):java.lang.Object");
    }

    public static j0 b(l serializer, b6.a aVar, ho2.c scope, Function0 produceFile, int i13) {
        a aVar2 = aVar;
        if ((i13 & 2) != 0) {
            aVar2 = null;
        }
        q0 migrations = q0.f80391a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        a aVar3 = aVar2;
        if (aVar2 == null) {
            aVar3 = new bk.f();
        }
        a aVar4 = aVar3;
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new j0(produceFile, serializer, kotlin.collections.e0.b(new c(migrations, null)), aVar4, scope);
    }
}
