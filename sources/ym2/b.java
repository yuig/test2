package ym2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f139463a;

    /* renamed from: b, reason: collision with root package name */
    public final c f139464b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f139465c;

    public b(c cVar, c cVar2, boolean z13) {
        if (cVar == null) {
            a(1);
            throw null;
        }
        if (cVar2 == null) {
            a(2);
            throw null;
        }
        this.f139463a = cVar;
        this.f139464b = cVar2;
        this.f139465c = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r10) {
        /*
            r0 = 9
            r1 = 7
            r2 = 6
            r3 = 5
            if (r10 == r3) goto L13
            if (r10 == r2) goto L13
            if (r10 == r1) goto L13
            if (r10 == r0) goto L13
            switch(r10) {
                case 13: goto L13;
                case 14: goto L13;
                case 15: goto L13;
                case 16: goto L13;
                default: goto L10;
            }
        L10:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L15
        L13:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L15:
            r5 = 2
            if (r10 == r3) goto L23
            if (r10 == r2) goto L23
            if (r10 == r1) goto L23
            if (r10 == r0) goto L23
            switch(r10) {
                case 13: goto L23;
                case 14: goto L23;
                case 15: goto L23;
                case 16: goto L23;
                default: goto L21;
            }
        L21:
            r6 = 3
            goto L24
        L23:
            r6 = r5
        L24:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/name/ClassId"
            r8 = 0
            switch(r10) {
                case 1: goto L51;
                case 2: goto L4c;
                case 3: goto L51;
                case 4: goto L46;
                case 5: goto L43;
                case 6: goto L43;
                case 7: goto L43;
                case 8: goto L3e;
                case 9: goto L43;
                case 10: goto L38;
                case 11: goto L32;
                case 12: goto L32;
                case 13: goto L43;
                case 14: goto L43;
                case 15: goto L43;
                case 16: goto L43;
                default: goto L2c;
            }
        L2c:
            java.lang.String r9 = "topLevelFqName"
            r6[r8] = r9
            goto L55
        L32:
            java.lang.String r9 = "string"
            r6[r8] = r9
            goto L55
        L38:
            java.lang.String r9 = "segment"
            r6[r8] = r9
            goto L55
        L3e:
            java.lang.String r9 = "name"
            r6[r8] = r9
            goto L55
        L43:
            r6[r8] = r7
            goto L55
        L46:
            java.lang.String r9 = "topLevelName"
            r6[r8] = r9
            goto L55
        L4c:
            java.lang.String r9 = "relativeClassName"
            r6[r8] = r9
            goto L55
        L51:
            java.lang.String r9 = "packageFqName"
            r6[r8] = r9
        L55:
            r8 = 1
            if (r10 == r3) goto L7d
            if (r10 == r2) goto L78
            if (r10 == r1) goto L73
            if (r10 == r0) goto L6e
            switch(r10) {
                case 13: goto L69;
                case 14: goto L69;
                case 15: goto L64;
                case 16: goto L64;
                default: goto L61;
            }
        L61:
            r6[r8] = r7
            goto L81
        L64:
            java.lang.String r7 = "asFqNameString"
            r6[r8] = r7
            goto L81
        L69:
            java.lang.String r7 = "asString"
            r6[r8] = r7
            goto L81
        L6e:
            java.lang.String r7 = "asSingleFqName"
            r6[r8] = r7
            goto L81
        L73:
            java.lang.String r7 = "getShortClassName"
            r6[r8] = r7
            goto L81
        L78:
            java.lang.String r7 = "getRelativeClassName"
            r6[r8] = r7
            goto L81
        L7d:
            java.lang.String r7 = "getPackageFqName"
            r6[r8] = r7
        L81:
            switch(r10) {
                case 1: goto L9a;
                case 2: goto L9a;
                case 3: goto L9a;
                case 4: goto L9a;
                case 5: goto L9e;
                case 6: goto L9e;
                case 7: goto L9e;
                case 8: goto L95;
                case 9: goto L9e;
                case 10: goto L8f;
                case 11: goto L8a;
                case 12: goto L8a;
                case 13: goto L9e;
                case 14: goto L9e;
                case 15: goto L9e;
                case 16: goto L9e;
                default: goto L84;
            }
        L84:
            java.lang.String r7 = "topLevel"
            r6[r5] = r7
            goto L9e
        L8a:
            java.lang.String r7 = "fromString"
            r6[r5] = r7
            goto L9e
        L8f:
            java.lang.String r7 = "startsWith"
            r6[r5] = r7
            goto L9e
        L95:
            java.lang.String r7 = "createNestedClassId"
            r6[r5] = r7
            goto L9e
        L9a:
            java.lang.String r7 = "<init>"
            r6[r5] = r7
        L9e:
            java.lang.String r4 = java.lang.String.format(r4, r6)
            if (r10 == r3) goto Lb3
            if (r10 == r2) goto Lb3
            if (r10 == r1) goto Lb3
            if (r10 == r0) goto Lb3
            switch(r10) {
                case 13: goto Lb3;
                case 14: goto Lb3;
                case 15: goto Lb3;
                case 16: goto Lb3;
                default: goto Lad;
            }
        Lad:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
            goto Lb8
        Lb3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
        Lb8:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ym2.b.a(int):void");
    }

    public static b e(String str, boolean z13) {
        String str2;
        if (str == null) {
            a(12);
            throw null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new b(new c(str2), new c(str), z13);
    }

    public static b j(c cVar) {
        if (cVar != null) {
            return new b(cVar.e(), cVar.f());
        }
        a(0);
        throw null;
    }

    public final c b() {
        c cVar = this.f139463a;
        boolean d2 = cVar.d();
        c cVar2 = this.f139464b;
        if (d2) {
            if (cVar2 != null) {
                return cVar2;
            }
            a(9);
            throw null;
        }
        return new c(cVar.b() + "." + cVar2.b());
    }

    public final String c() {
        c cVar = this.f139463a;
        boolean d2 = cVar.d();
        c cVar2 = this.f139464b;
        if (d2) {
            String b13 = cVar2.b();
            if (b13 != null) {
                return b13;
            }
            a(13);
            throw null;
        }
        String str = cVar.b().replace('.', '/') + "/" + cVar2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final b d(g gVar) {
        if (gVar != null) {
            return new b(g(), this.f139464b.c(gVar), this.f139465c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f139463a.equals(bVar.f139463a) && this.f139464b.equals(bVar.f139464b) && this.f139465c == bVar.f139465c;
    }

    public final b f() {
        c e13 = this.f139464b.e();
        if (e13.d()) {
            return null;
        }
        return new b(g(), e13, this.f139465c);
    }

    public final c g() {
        c cVar = this.f139463a;
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public final c h() {
        c cVar = this.f139464b;
        if (cVar != null) {
            return cVar;
        }
        a(6);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f139465c).hashCode() + ((this.f139464b.hashCode() + (this.f139463a.hashCode() * 31)) * 31);
    }

    public final g i() {
        g f13 = this.f139464b.f();
        if (f13 != null) {
            return f13;
        }
        a(7);
        throw null;
    }

    public final String toString() {
        if (!this.f139463a.d()) {
            return c();
        }
        return "/" + c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, g gVar) {
        this(cVar, c.j(gVar), false);
        if (cVar == null) {
            a(3);
            throw null;
        }
        if (gVar != null) {
        } else {
            a(4);
            throw null;
        }
    }
}
