package kb;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b */
    public static final l f79018b;

    /* renamed from: a */
    public final HashMap f79019a;

    static {
        l lVar = new l(new LinkedHashMap());
        bk.f.e0(lVar);
        f79018b = lVar;
    }

    public l(Map values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f79019a = new HashMap(values);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: ClassNotFoundException -> 0x0060, IOException -> 0x0062, TRY_LEAVE, TryCatch #6 {IOException -> 0x0062, ClassNotFoundException -> 0x0060, blocks: (B:10:0x0018, B:12:0x002f, B:15:0x0036, B:17:0x003c, B:25:0x005c, B:33:0x0066, B:34:0x0069, B:35:0x006a, B:43:0x0091, B:49:0x0097, B:50:0x009a), top: B:9:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a A[Catch: ClassNotFoundException -> 0x0060, IOException -> 0x0062, TRY_LEAVE, TryCatch #6 {IOException -> 0x0062, ClassNotFoundException -> 0x0060, blocks: (B:10:0x0018, B:12:0x002f, B:15:0x0036, B:17:0x003c, B:25:0x005c, B:33:0x0066, B:34:0x0069, B:35:0x006a, B:43:0x0091, B:49:0x0097, B:50:0x009a), top: B:9:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kb.l a(byte[] r8) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            int r1 = r8.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto Lb4
            int r1 = r8.length
            if (r1 != 0) goto L13
            kb.l r8 = kb.l.f79018b
            goto Lb3
        L13:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r2.<init>(r8)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r8 = 2
            byte[] r8 = new byte[r8]     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r2.read(r8)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r3 = -21267(0xffffffffffffaced, float:NaN)
            byte r3 = (byte) r3     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r4 = 16777132(0xffffac, float:2.350977E-38)
            byte r4 = (byte) r4     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r5 = 0
            r6 = r8[r5]     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            if (r6 != r4) goto L35
            r4 = 1
            r8 = r8[r4]     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            if (r8 != r3) goto L35
            goto L36
        L35:
            r4 = r5
        L36:
            r2.reset()     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r8 = 0
            if (r4 == 0) goto L6a
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r3.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L5a
        L45:
            if (r5 >= r2) goto L5c
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = "readUTF()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r3.readObject()     // Catch: java.lang.Throwable -> L5a
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> L5a
            int r5 = r5 + 1
            goto L45
        L5a:
            r8 = move-exception
            goto L64
        L5c:
            dl2.b.J(r3, r8)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            goto Lae
        L60:
            r8 = move-exception
            goto L9b
        L62:
            r8 = move-exception
            goto La5
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r2 = move-exception
            dl2.b.J(r3, r8)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            throw r2     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
        L6a:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            r3.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            bk.f.K(r3)     // Catch: java.lang.Throwable -> L8f
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L8f
        L76:
            if (r5 >= r2) goto L91
            byte r4 = r3.readByte()     // Catch: java.lang.Throwable -> L8f
            java.io.Serializable r4 = bk.f.L(r4, r3)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r6 = r3.readUTF()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Throwable -> L8f
            r1.put(r6, r4)     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 + 1
            goto L76
        L8f:
            r8 = move-exception
            goto L95
        L91:
            dl2.b.J(r3, r8)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            goto Lae
        L95:
            throw r8     // Catch: java.lang.Throwable -> L96
        L96:
            r2 = move-exception
            dl2.b.J(r3, r8)     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
            throw r2     // Catch: java.lang.ClassNotFoundException -> L60 java.io.IOException -> L62
        L9b:
            java.lang.String r2 = kb.m.f79020a
            kb.b0 r3 = kb.b0.e()
            r3.d(r2, r0, r8)
            goto Lae
        La5:
            java.lang.String r2 = kb.m.f79020a
            kb.b0 r3 = kb.b0.e()
            r3.d(r2, r0, r8)
        Lae:
            kb.l r8 = new kb.l
            r8.<init>(r1)
        Lb3:
            return r8
        Lb4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.l.a(byte[]):kb.l");
    }

    public final boolean b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = Boolean.FALSE;
        Object obj2 = this.f79019a.get(key);
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final boolean[] c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f79019a.get(key);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                i1.i iVar = new i1.i(obj, 5);
                boolean[] zArr = new boolean[length];
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = ((Boolean) iVar.invoke(Integer.valueOf(i13))).booleanValue();
                }
                return zArr;
            }
        }
        return null;
    }

    public final int d(String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object valueOf = Integer.valueOf(i13);
        Object obj = this.f79019a.get(key);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final int[] e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f79019a.get(key);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                i1.i iVar = new i1.i(obj, 6);
                int[] iArr = new int[length];
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[i13] = ((Number) iVar.invoke(Integer.valueOf(i13))).intValue();
                }
                return iArr;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L64
            java.lang.Class r2 = r9.getClass()
            java.lang.Class<kb.l> r3 = kb.l.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r3, r2)
            if (r2 != 0) goto L14
            goto L64
        L14:
            kb.l r9 = (kb.l) r9
            java.util.HashMap r2 = r8.f79019a
            java.util.Set r3 = r2.keySet()
            java.util.HashMap r9 = r9.f79019a
            java.util.Set r4 = r9.keySet()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r4 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5f
            if (r4 != 0) goto L46
            goto L5f
        L46:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L58
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L58
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = kotlin.collections.x.c(r6, r4)
            goto L5c
        L58:
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r5, r4)
        L5c:
            if (r4 != 0) goto L2d
            goto L62
        L5f:
            if (r5 != r4) goto L62
            goto L2d
        L62:
            return r1
        L63:
            return r0
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.l.equals(java.lang.Object):boolean");
    }

    public final Map f() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.f79019a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(values)");
        return unmodifiableMap;
    }

    public final long g(String key, long j13) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object valueOf = Long.valueOf(j13);
        Object obj = this.f79019a.get(key);
        if (obj instanceof Long) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    public final String h(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f79019a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final int hashCode() {
        int i13 = 0;
        for (Map.Entry entry : this.f79019a.entrySet()) {
            Object value = entry.getValue();
            i13 += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ kotlin.collections.w.a((Object[]) value) : entry.hashCode();
        }
        return i13 * 31;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f79019a.get(key);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                i1.i iVar = new i1.i(obj, 7);
                String[] strArr = new String[length];
                for (int i13 = 0; i13 < length; i13++) {
                    strArr[i13] = iVar.invoke(Integer.valueOf(i13));
                }
                return strArr;
            }
        }
        return null;
    }

    public final boolean j(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(String.class, "klass");
        Object obj = this.f79019a.get(key);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final String toString() {
        String str = "Data {" + CollectionsKt.Z(this.f79019a.entrySet(), null, null, null, 0, null, k.f79011i, 31) + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public l(l other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f79019a = new HashMap(other.f79019a);
    }
}
