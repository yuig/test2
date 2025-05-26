package oe2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public final class d0 extends AbstractMap implements Serializable {

    /* renamed from: i */
    public static final sw0.u f94309i = new sw0.u(17);

    /* renamed from: g */
    public a0 f94316g;

    /* renamed from: h */
    public a0 f94317h;

    /* renamed from: d */
    public int f94313d = 0;

    /* renamed from: e */
    public int f94314e = 0;

    /* renamed from: a */
    public final Comparator f94310a = f94309i;

    /* renamed from: c */
    public final c0 f94312c = new c0();

    /* renamed from: b */
    public c0[] f94311b = new c0[16];

    /* renamed from: f */
    public int f94315f = 12;

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final c0 a(Object obj, boolean z13) {
        c0 c0Var;
        int i13;
        c0 c0Var2;
        c0 c0Var3;
        c0 c0Var4;
        c0 c0Var5;
        c0 c0Var6;
        c0 c0Var7;
        c0[] c0VarArr = this.f94311b;
        int hashCode = obj.hashCode();
        int i14 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i15 = ((i14 >>> 7) ^ i14) ^ (i14 >>> 4);
        int length = i15 & (c0VarArr.length - 1);
        c0 c0Var8 = c0VarArr[length];
        sw0.u uVar = f94309i;
        c0 c0Var9 = null;
        Comparator comparator = this.f94310a;
        if (c0Var8 != null) {
            Comparable comparable = comparator == uVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c0Var8.f94298f;
                int compareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (compareTo == 0) {
                    return c0Var8;
                }
                c0 c0Var10 = compareTo < 0 ? c0Var8.f94294b : c0Var8.f94295c;
                if (c0Var10 == null) {
                    i13 = compareTo;
                    c0Var = c0Var8;
                    break;
                }
                c0Var8 = c0Var10;
            }
        } else {
            c0Var = c0Var8;
            i13 = 0;
        }
        if (!z13) {
            return null;
        }
        c0 c0Var11 = this.f94312c;
        if (c0Var != null) {
            c0 c0Var12 = new c0(c0Var, obj, i15, c0Var11, c0Var11.f94297e);
            if (i13 < 0) {
                c0Var.f94294b = c0Var12;
            } else {
                c0Var.f94295c = c0Var12;
            }
            b(c0Var, true);
            c0Var2 = c0Var12;
        } else {
            if (comparator == uVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c0Var2 = new c0(c0Var, obj, i15, c0Var11, c0Var11.f94297e);
            c0VarArr[length] = c0Var2;
        }
        int i16 = this.f94313d;
        this.f94313d = i16 + 1;
        if (i16 > this.f94315f) {
            c0[] c0VarArr2 = this.f94311b;
            int length2 = c0VarArr2.length;
            int i17 = length2 * 2;
            c0[] c0VarArr3 = new c0[i17];
            n9.d dVar = new n9.d();
            n9.d dVar2 = new n9.d();
            int i18 = 0;
            while (i18 < length2) {
                c0 c0Var13 = c0VarArr2[i18];
                if (c0Var13 == null) {
                    c0Var4 = c0Var9;
                } else {
                    c0 c0Var14 = c0Var9;
                    for (c0 c0Var15 = c0Var13; c0Var15 != null; c0Var15 = c0Var15.f94294b) {
                        c0Var15.f94293a = c0Var14;
                        c0Var14 = c0Var15;
                    }
                    int i19 = 0;
                    int i23 = 0;
                    while (true) {
                        if (c0Var14 != null) {
                            c0 c0Var16 = c0Var14.f94293a;
                            c0Var14.f94293a = c0Var9;
                            c0 c0Var17 = c0Var14.f94295c;
                            while (true) {
                                c0 c0Var18 = c0Var16;
                                c0Var16 = c0Var17;
                                c0Var3 = c0Var18;
                                if (c0Var16 == null) {
                                    break;
                                }
                                c0Var16.f94293a = c0Var3;
                                c0Var17 = c0Var16.f94294b;
                            }
                        } else {
                            c0 c0Var19 = c0Var14;
                            c0Var14 = c0Var9;
                            c0Var3 = c0Var19;
                        }
                        if (c0Var14 == null) {
                            break;
                        }
                        if ((c0Var14.f94299g & length2) == 0) {
                            i19++;
                        } else {
                            i23++;
                        }
                        c0Var14 = c0Var3;
                        c0Var9 = null;
                    }
                    dVar.f89951a = ((Integer.highestOneBit(i19) * 2) - 1) - i19;
                    dVar.f89953c = 0;
                    dVar.f89952b = 0;
                    c0Var4 = null;
                    dVar.f89954d = null;
                    dVar2.f89951a = ((Integer.highestOneBit(i23) * 2) - 1) - i23;
                    dVar2.f89953c = 0;
                    dVar2.f89952b = 0;
                    dVar2.f89954d = null;
                    c0 c0Var20 = null;
                    while (c0Var13 != null) {
                        c0Var13.f94293a = c0Var20;
                        c0Var20 = c0Var13;
                        c0Var13 = c0Var13.f94294b;
                    }
                    while (true) {
                        if (c0Var20 != null) {
                            c0 c0Var21 = c0Var20.f94293a;
                            c0Var20.f94293a = null;
                            c0 c0Var22 = c0Var20.f94295c;
                            while (true) {
                                c0 c0Var23 = c0Var22;
                                c0Var5 = c0Var21;
                                c0Var21 = c0Var23;
                                if (c0Var21 == null) {
                                    break;
                                }
                                c0Var21.f94293a = c0Var5;
                                c0Var22 = c0Var21.f94294b;
                            }
                        } else {
                            c0Var5 = c0Var20;
                            c0Var20 = null;
                        }
                        if (c0Var20 == null) {
                            break;
                        }
                        if ((c0Var20.f94299g & length2) == 0) {
                            dVar.a(c0Var20);
                        } else {
                            dVar2.a(c0Var20);
                        }
                        c0Var20 = c0Var5;
                    }
                    if (i19 > 0) {
                        c0Var6 = (c0) dVar.f89954d;
                        if (c0Var6.f94293a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c0Var6 = null;
                    }
                    c0VarArr3[i18] = c0Var6;
                    int i24 = i18 + length2;
                    if (i23 > 0) {
                        c0Var7 = (c0) dVar2.f89954d;
                        if (c0Var7.f94293a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c0Var7 = null;
                    }
                    c0VarArr3[i24] = c0Var7;
                }
                i18++;
                c0Var9 = c0Var4;
            }
            this.f94311b = c0VarArr3;
            this.f94315f = (i17 / 4) + (i17 / 2);
        }
        this.f94314e++;
        return c0Var2;
    }

    public final void b(c0 c0Var, boolean z13) {
        while (c0Var != null) {
            c0 c0Var2 = c0Var.f94294b;
            c0 c0Var3 = c0Var.f94295c;
            int i13 = c0Var2 != null ? c0Var2.f94301i : 0;
            int i14 = c0Var3 != null ? c0Var3.f94301i : 0;
            int i15 = i13 - i14;
            if (i15 == -2) {
                c0 c0Var4 = c0Var3.f94294b;
                c0 c0Var5 = c0Var3.f94295c;
                int i16 = (c0Var4 != null ? c0Var4.f94301i : 0) - (c0Var5 != null ? c0Var5.f94301i : 0);
                if (i16 != -1 && (i16 != 0 || z13)) {
                    f(c0Var3);
                }
                e(c0Var);
                if (z13) {
                    return;
                }
            } else if (i15 == 2) {
                c0 c0Var6 = c0Var2.f94294b;
                c0 c0Var7 = c0Var2.f94295c;
                int i17 = (c0Var6 != null ? c0Var6.f94301i : 0) - (c0Var7 != null ? c0Var7.f94301i : 0);
                if (i17 != 1 && (i17 != 0 || z13)) {
                    e(c0Var2);
                }
                f(c0Var);
                if (z13) {
                    return;
                }
            } else if (i15 == 0) {
                c0Var.f94301i = i13 + 1;
                if (z13) {
                    return;
                }
            } else {
                c0Var.f94301i = Math.max(i13, i14) + 1;
                if (!z13) {
                    return;
                }
            }
            c0Var = c0Var.f94293a;
        }
    }

    public final void c(c0 c0Var, boolean z13) {
        c0 c0Var2;
        c0 c0Var3;
        int i13;
        if (z13) {
            c0 c0Var4 = c0Var.f94297e;
            c0Var4.f94296d = c0Var.f94296d;
            c0Var.f94296d.f94297e = c0Var4;
            c0Var.f94297e = null;
            c0Var.f94296d = null;
        }
        c0 c0Var5 = c0Var.f94294b;
        c0 c0Var6 = c0Var.f94295c;
        c0 c0Var7 = c0Var.f94293a;
        int i14 = 0;
        if (c0Var5 == null || c0Var6 == null) {
            if (c0Var5 != null) {
                d(c0Var, c0Var5);
                c0Var.f94294b = null;
            } else if (c0Var6 != null) {
                d(c0Var, c0Var6);
                c0Var.f94295c = null;
            } else {
                d(c0Var, null);
            }
            b(c0Var7, false);
            this.f94313d--;
            this.f94314e++;
            return;
        }
        if (c0Var5.f94301i > c0Var6.f94301i) {
            c0 c0Var8 = c0Var5.f94295c;
            while (true) {
                c0 c0Var9 = c0Var8;
                c0Var3 = c0Var5;
                c0Var5 = c0Var9;
                if (c0Var5 == null) {
                    break;
                } else {
                    c0Var8 = c0Var5.f94295c;
                }
            }
        } else {
            c0 c0Var10 = c0Var6.f94294b;
            while (true) {
                c0Var2 = c0Var6;
                c0Var6 = c0Var10;
                if (c0Var6 == null) {
                    break;
                } else {
                    c0Var10 = c0Var6.f94294b;
                }
            }
            c0Var3 = c0Var2;
        }
        c(c0Var3, false);
        c0 c0Var11 = c0Var.f94294b;
        if (c0Var11 != null) {
            i13 = c0Var11.f94301i;
            c0Var3.f94294b = c0Var11;
            c0Var11.f94293a = c0Var3;
            c0Var.f94294b = null;
        } else {
            i13 = 0;
        }
        c0 c0Var12 = c0Var.f94295c;
        if (c0Var12 != null) {
            i14 = c0Var12.f94301i;
            c0Var3.f94295c = c0Var12;
            c0Var12.f94293a = c0Var3;
            c0Var.f94295c = null;
        }
        c0Var3.f94301i = Math.max(i13, i14) + 1;
        d(c0Var, c0Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f94311b, (Object) null);
        this.f94313d = 0;
        this.f94314e++;
        c0 c0Var = this.f94312c;
        c0 c0Var2 = c0Var.f94296d;
        while (c0Var2 != c0Var) {
            c0 c0Var3 = c0Var2.f94296d;
            c0Var2.f94297e = null;
            c0Var2.f94296d = null;
            c0Var2 = c0Var3;
        }
        c0Var.f94297e = c0Var;
        c0Var.f94296d = c0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        c0 c0Var = null;
        if (obj != null) {
            try {
                c0Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c0Var != null;
    }

    public final void d(c0 c0Var, c0 c0Var2) {
        c0 c0Var3 = c0Var.f94293a;
        c0Var.f94293a = null;
        if (c0Var2 != null) {
            c0Var2.f94293a = c0Var3;
        }
        if (c0Var3 == null) {
            this.f94311b[c0Var.f94299g & (r0.length - 1)] = c0Var2;
        } else if (c0Var3.f94294b == c0Var) {
            c0Var3.f94294b = c0Var2;
        } else {
            c0Var3.f94295c = c0Var2;
        }
    }

    public final void e(c0 c0Var) {
        c0 c0Var2 = c0Var.f94294b;
        c0 c0Var3 = c0Var.f94295c;
        c0 c0Var4 = c0Var3.f94294b;
        c0 c0Var5 = c0Var3.f94295c;
        c0Var.f94295c = c0Var4;
        if (c0Var4 != null) {
            c0Var4.f94293a = c0Var;
        }
        d(c0Var, c0Var3);
        c0Var3.f94294b = c0Var;
        c0Var.f94293a = c0Var3;
        int max = Math.max(c0Var2 != null ? c0Var2.f94301i : 0, c0Var4 != null ? c0Var4.f94301i : 0) + 1;
        c0Var.f94301i = max;
        c0Var3.f94301i = Math.max(max, c0Var5 != null ? c0Var5.f94301i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        a0 a0Var = this.f94316g;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this, 0);
        this.f94316g = a0Var2;
        return a0Var2;
    }

    public final void f(c0 c0Var) {
        c0 c0Var2 = c0Var.f94294b;
        c0 c0Var3 = c0Var.f94295c;
        c0 c0Var4 = c0Var2.f94294b;
        c0 c0Var5 = c0Var2.f94295c;
        c0Var.f94294b = c0Var5;
        if (c0Var5 != null) {
            c0Var5.f94293a = c0Var;
        }
        d(c0Var, c0Var2);
        c0Var2.f94295c = c0Var;
        c0Var.f94293a = c0Var2;
        int max = Math.max(c0Var3 != null ? c0Var3.f94301i : 0, c0Var5 != null ? c0Var5.f94301i : 0) + 1;
        c0Var.f94301i = max;
        c0Var2.f94301i = Math.max(max, c0Var4 != null ? c0Var4.f94301i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            oe2.c0 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f94300h
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.d0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        a0 a0Var = this.f94317h;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this, 1);
        this.f94317h = a0Var2;
        return a0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        c0 a13 = a(obj, true);
        Object obj3 = a13.f94300h;
        a13.f94300h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            oe2.c0 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f94300h
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.d0.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f94313d;
    }
}
