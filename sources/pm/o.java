package pm;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class o extends AbstractMap implements Serializable {

    /* renamed from: i */
    public static final s3.o f100615i = new s3.o(5);

    /* renamed from: a */
    public final Comparator f100616a;

    /* renamed from: b */
    public final boolean f100617b;

    /* renamed from: c */
    public n f100618c;

    /* renamed from: d */
    public int f100619d;

    /* renamed from: e */
    public int f100620e;

    /* renamed from: f */
    public final n f100621f;

    /* renamed from: g */
    public l f100622g;

    /* renamed from: h */
    public l f100623h;

    public o() {
        this(true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final n a(Object obj, boolean z13) {
        int i13;
        n nVar;
        n nVar2 = this.f100618c;
        s3.o oVar = f100615i;
        Comparator comparator = this.f100616a;
        if (nVar2 != null) {
            Comparable comparable = comparator == oVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = nVar2.f100611f;
                i13 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i13 == 0) {
                    return nVar2;
                }
                n nVar3 = i13 < 0 ? nVar2.f100607b : nVar2.f100608c;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            i13 = 0;
        }
        if (!z13) {
            return null;
        }
        n nVar4 = this.f100621f;
        if (nVar2 != null) {
            nVar = new n(this.f100617b, nVar2, obj, nVar4, nVar4.f100610e);
            if (i13 < 0) {
                nVar2.f100607b = nVar;
            } else {
                nVar2.f100608c = nVar;
            }
            b(nVar2, true);
        } else {
            if (comparator == oVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.f100617b, nVar2, obj, nVar4, nVar4.f100610e);
            this.f100618c = nVar;
        }
        this.f100619d++;
        this.f100620e++;
        return nVar;
    }

    public final void b(n nVar, boolean z13) {
        while (nVar != null) {
            n nVar2 = nVar.f100607b;
            n nVar3 = nVar.f100608c;
            int i13 = nVar2 != null ? nVar2.f100614i : 0;
            int i14 = nVar3 != null ? nVar3.f100614i : 0;
            int i15 = i13 - i14;
            if (i15 == -2) {
                n nVar4 = nVar3.f100607b;
                n nVar5 = nVar3.f100608c;
                int i16 = (nVar4 != null ? nVar4.f100614i : 0) - (nVar5 != null ? nVar5.f100614i : 0);
                if (i16 == -1 || (i16 == 0 && !z13)) {
                    e(nVar);
                } else {
                    f(nVar3);
                    e(nVar);
                }
                if (z13) {
                    return;
                }
            } else if (i15 == 2) {
                n nVar6 = nVar2.f100607b;
                n nVar7 = nVar2.f100608c;
                int i17 = (nVar6 != null ? nVar6.f100614i : 0) - (nVar7 != null ? nVar7.f100614i : 0);
                if (i17 == 1 || (i17 == 0 && !z13)) {
                    f(nVar);
                } else {
                    e(nVar2);
                    f(nVar);
                }
                if (z13) {
                    return;
                }
            } else if (i15 == 0) {
                nVar.f100614i = i13 + 1;
                if (z13) {
                    return;
                }
            } else {
                nVar.f100614i = Math.max(i13, i14) + 1;
                if (!z13) {
                    return;
                }
            }
            nVar = nVar.f100606a;
        }
    }

    public final void c(n nVar, boolean z13) {
        n nVar2;
        n nVar3;
        int i13;
        if (z13) {
            n nVar4 = nVar.f100610e;
            nVar4.f100609d = nVar.f100609d;
            nVar.f100609d.f100610e = nVar4;
        }
        n nVar5 = nVar.f100607b;
        n nVar6 = nVar.f100608c;
        n nVar7 = nVar.f100606a;
        int i14 = 0;
        if (nVar5 == null || nVar6 == null) {
            if (nVar5 != null) {
                d(nVar, nVar5);
                nVar.f100607b = null;
            } else if (nVar6 != null) {
                d(nVar, nVar6);
                nVar.f100608c = null;
            } else {
                d(nVar, null);
            }
            b(nVar7, false);
            this.f100619d--;
            this.f100620e++;
            return;
        }
        if (nVar5.f100614i > nVar6.f100614i) {
            n nVar8 = nVar5.f100608c;
            while (true) {
                n nVar9 = nVar8;
                nVar3 = nVar5;
                nVar5 = nVar9;
                if (nVar5 == null) {
                    break;
                } else {
                    nVar8 = nVar5.f100608c;
                }
            }
        } else {
            n nVar10 = nVar6.f100607b;
            while (true) {
                nVar2 = nVar6;
                nVar6 = nVar10;
                if (nVar6 == null) {
                    break;
                } else {
                    nVar10 = nVar6.f100607b;
                }
            }
            nVar3 = nVar2;
        }
        c(nVar3, false);
        n nVar11 = nVar.f100607b;
        if (nVar11 != null) {
            i13 = nVar11.f100614i;
            nVar3.f100607b = nVar11;
            nVar11.f100606a = nVar3;
            nVar.f100607b = null;
        } else {
            i13 = 0;
        }
        n nVar12 = nVar.f100608c;
        if (nVar12 != null) {
            i14 = nVar12.f100614i;
            nVar3.f100608c = nVar12;
            nVar12.f100606a = nVar3;
            nVar.f100608c = null;
        }
        nVar3.f100614i = Math.max(i13, i14) + 1;
        d(nVar, nVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f100618c = null;
        this.f100619d = 0;
        this.f100620e++;
        n nVar = this.f100621f;
        nVar.f100610e = nVar;
        nVar.f100609d = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nVar != null;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.f100606a;
        nVar.f100606a = null;
        if (nVar2 != null) {
            nVar2.f100606a = nVar3;
        }
        if (nVar3 == null) {
            this.f100618c = nVar2;
        } else if (nVar3.f100607b == nVar) {
            nVar3.f100607b = nVar2;
        } else {
            nVar3.f100608c = nVar2;
        }
    }

    public final void e(n nVar) {
        n nVar2 = nVar.f100607b;
        n nVar3 = nVar.f100608c;
        n nVar4 = nVar3.f100607b;
        n nVar5 = nVar3.f100608c;
        nVar.f100608c = nVar4;
        if (nVar4 != null) {
            nVar4.f100606a = nVar;
        }
        d(nVar, nVar3);
        nVar3.f100607b = nVar;
        nVar.f100606a = nVar3;
        int max = Math.max(nVar2 != null ? nVar2.f100614i : 0, nVar4 != null ? nVar4.f100614i : 0) + 1;
        nVar.f100614i = max;
        nVar3.f100614i = Math.max(max, nVar5 != null ? nVar5.f100614i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f100622g;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.f100622g = lVar2;
        return lVar2;
    }

    public final void f(n nVar) {
        n nVar2 = nVar.f100607b;
        n nVar3 = nVar.f100608c;
        n nVar4 = nVar2.f100607b;
        n nVar5 = nVar2.f100608c;
        nVar.f100607b = nVar5;
        if (nVar5 != null) {
            nVar5.f100606a = nVar;
        }
        d(nVar, nVar2);
        nVar2.f100608c = nVar;
        nVar.f100606a = nVar2;
        int max = Math.max(nVar3 != null ? nVar3.f100614i : 0, nVar5 != null ? nVar5.f100614i : 0) + 1;
        nVar.f100614i = max;
        nVar2.f100614i = Math.max(max, nVar4 != null ? nVar4.f100614i : 0) + 1;
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
            pm.n r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f100613h
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.o.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        l lVar = this.f100623h;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.f100623h = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f100617b) {
            throw new NullPointerException("value == null");
        }
        n a13 = a(obj, true);
        Object obj3 = a13.f100613h;
        a13.f100613h = obj2;
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
            pm.n r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f100613h
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.o.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f100619d;
    }

    public o(boolean z13) {
        s3.o oVar = f100615i;
        this.f100619d = 0;
        this.f100620e = 0;
        this.f100616a = oVar;
        this.f100617b = z13;
        this.f100621f = new n(z13);
    }
}
