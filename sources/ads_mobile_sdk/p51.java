package ads_mobile_sdk;

import a.h4;
import a.mb;
import a.w7;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class p51 implements a.za {

    /* renamed from: a, reason: collision with root package name */
    public final k51 f9559a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9560b;

    /* renamed from: c, reason: collision with root package name */
    public final kb1 f9561c;

    public p51(k51 k51Var, List list, kb1 kb1Var) {
        this.f9559a = k51Var;
        this.f9560b = list;
        this.f9561c = kb1Var;
        if (a.qf.f151a.a()) {
            a(k51Var);
        }
    }

    public final o51 a(int i13) {
        if (i13 < 0 || i13 >= this.f9560b.size()) {
            StringBuilder s13 = a.a.s("Invalid index ", i13, " for keyset of size ");
            s13.append(this.f9560b.size());
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (this.f9560b.get(i13) != null) {
            return (o51) this.f9560b.get(i13);
        }
        throw new IllegalStateException(a.a.e("Keyset-Entry at position ", i13, " has wrong status or key parsing failed"));
    }

    public final Object b() {
        k51 k51Var = this.f9559a;
        int i13 = a.jd.f67a;
        int t13 = k51Var.t();
        int i14 = 0;
        boolean z13 = false;
        boolean z14 = true;
        for (j51 j51Var : k51Var.s()) {
            if (j51Var.u() == y41.ENABLED) {
                if (!j51Var.v()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(j51Var.s())));
                }
                if (j51Var.t() == ju1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(j51Var.s())));
                }
                if (j51Var.u() == y41.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(j51Var.s())));
                }
                if (j51Var.s() == t13) {
                    if (z13) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z13 = true;
                }
                if (j51Var.r().s() != n41.ASYMMETRIC_PUBLIC) {
                    z14 = false;
                }
                i14++;
            }
        }
        if (i14 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z13 && !z14) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i15 = 0; i15 < this.f9560b.size(); i15++) {
            if (this.f9560b.get(i15) == null) {
                j51 b13 = this.f9559a.b(i15);
                StringBuilder s13 = a.a.s("Key parsing of key with index ", i15, " and type_url ");
                s13.append(b13.r().t());
                s13.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(s13.toString());
            }
        }
        kb1 kb1Var = this.f9561c;
        g12 g12Var = (g12) bf1.f2867b.f2868a.get();
        if (g12Var.f5352b.containsKey(a.y9.class)) {
            return g12Var.a(this, kb1Var, (a.i5) g12Var.f5352b.get(a.y9.class));
        }
        throw new GeneralSecurityException(a.a.h("No wrapper found for ", a.y9.class));
    }

    public final String toString() {
        h4 h4Var;
        h4 h4Var2;
        k51 k51Var = this.f9559a;
        int i13 = a.jd.f67a;
        mb r13 = v51.r();
        int t13 = k51Var.t();
        r13.b();
        ((v51) r13.f10110b).primaryKeyId_ = t13;
        for (j51 j51Var : k51Var.s()) {
            a.jc r14 = u51.r();
            String t14 = j51Var.r().t();
            r14.b();
            u51 u51Var = (u51) r14.f10110b;
            u51Var.getClass();
            t14.getClass();
            u51Var.typeUrl_ = t14;
            y41 u13 = j51Var.u();
            r14.b();
            u51 u51Var2 = (u51) r14.f10110b;
            u51Var2.getClass();
            u51Var2.status_ = u13.a();
            ju1 t15 = j51Var.t();
            r14.b();
            u51 u51Var3 = (u51) r14.f10110b;
            u51Var3.getClass();
            u51Var3.outputPrefixType_ = t15.a();
            int s13 = j51Var.s();
            r14.b();
            ((u51) r14.f10110b).keyId_ = s13;
            u51 u51Var4 = (u51) r14.a();
            r13.b();
            v51 v51Var = (v51) r13.f10110b;
            v51Var.getClass();
            h4Var = v51Var.keyInfo_;
            if (!((j) h4Var).f6594a) {
                v51Var.keyInfo_ = e0.t.a(h4Var);
            }
            h4Var2 = v51Var.keyInfo_;
            h4Var2.add(u51Var4);
        }
        return ((v51) r13.a()).toString();
    }

    public final o51 a() {
        for (o51 o51Var : this.f9560b) {
            if (o51Var != null && o51Var.f9146d) {
                if (o51Var.f9144b == x41.f13478b) {
                    return o51Var;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public static a.i7 a(j51 j51Var) {
        i22 a13 = i22.a(j51Var.r().t(), j51Var.r().u(), j51Var.r().s(), j51Var.t(), j51Var.t() == ju1.RAW ? null : Integer.valueOf(j51Var.s()));
        cf1 cf1Var = cf1.f3890b;
        te2 te2Var = (te2) cf1Var.f3891a.get();
        te2Var.getClass();
        if (!te2Var.f11518b.containsKey(new re2(a13.f6185b, i22.class))) {
            return new w61(a13);
        }
        return cf1Var.a(a13);
    }

    public static void a(k51 k51Var) {
        HashSet hashSet = new HashSet();
        for (j51 j51Var : k51Var.s()) {
            if (!hashSet.contains(Integer.valueOf(j51Var.s()))) {
                hashSet.add(Integer.valueOf(j51Var.s()));
            } else {
                throw new GeneralSecurityException("KeyID " + j51Var.s() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        if (!hashSet.contains(Integer.valueOf(k51Var.t()))) {
            throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
        }
    }

    public static final p51 a(da daVar) {
        int i13;
        int i14;
        y41 y41Var;
        int i15;
        h4 h4Var;
        h4 h4Var2;
        n51 n51Var = new n51();
        l51 l51Var = new l51(daVar);
        l51Var.f7690c = m51.f8104a;
        l51Var.f7688a = true;
        Iterator it = n51Var.f8678a.iterator();
        while (true) {
            i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((l51) it.next()).f7688a = false;
        }
        n51Var.f8678a.add(l51Var);
        if (!n51Var.f8680c) {
            n51Var.f8680c = true;
            a.s4 u13 = k51.u();
            ArrayList arrayList = new ArrayList(n51Var.f8678a.size());
            ArrayList arrayList2 = n51Var.f8678a;
            for (int i16 = 0; i16 < arrayList2.size() - 1; i16++) {
                m51 m51Var = ((l51) arrayList2.get(i16)).f7690c;
                m51 m51Var2 = m51.f8104a;
                if (m51Var == m51Var2 && ((l51) arrayList2.get(i16 + 1)).f7690c != m51Var2) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = n51Var.f8678a.iterator();
            Integer num = null;
            while (it2.hasNext()) {
                l51 l51Var2 = (l51) it2.next();
                l51Var2.getClass();
                m51 m51Var3 = l51Var2.f7690c;
                if (m51Var3 != null) {
                    if (m51Var3 == m51.f8104a) {
                        i14 = i13;
                        while (true) {
                            if (i14 != 0 && !hashSet.contains(Integer.valueOf(i14))) {
                                break;
                            }
                            int i17 = sx2.f11275a;
                            i14 = i13;
                            while (i14 == 0) {
                                byte[] bArr = new byte[4];
                                ((SecureRandom) a.c0.f27a.get()).nextBytes(bArr);
                                i14 = (bArr[3] & 255) | ((bArr[i13] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
                            }
                        }
                    } else {
                        i14 = i13;
                    }
                    if (!hashSet.contains(Integer.valueOf(i14))) {
                        hashSet.add(Integer.valueOf(i14));
                        a.i7 a13 = ve1.f12474b.a(l51Var2.f7689b, l51Var2.f7689b.a() ? Integer.valueOf(i14) : null);
                        x41 x41Var = x41.f13478b;
                        o51 o51Var = new o51(a13, x41Var, i14, l51Var2.f7688a);
                        i22 i22Var = (i22) cf1.f3890b.a(a13);
                        Integer num2 = i22Var.f6189f;
                        if (num2 != null && num2.intValue() != i14) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        if (x41Var.equals(x41Var)) {
                            y41Var = y41.ENABLED;
                        } else if (x41.f13479c.equals(x41Var)) {
                            y41Var = y41.DISABLED;
                        } else if (x41.f13480d.equals(x41Var)) {
                            y41Var = y41.DESTROYED;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        a.l5 w13 = j51.w();
                        w7 v13 = o41.v();
                        String str = i22Var.f6184a;
                        v13.b();
                        o41 o41Var = (o41) v13.f10110b;
                        o41Var.getClass();
                        str.getClass();
                        o41Var.typeUrl_ = str;
                        il ilVar = i22Var.f6186c;
                        v13.b();
                        o41 o41Var2 = (o41) v13.f10110b;
                        o41Var2.getClass();
                        ilVar.getClass();
                        o41Var2.value_ = ilVar;
                        n41 n41Var = i22Var.f6187d;
                        v13.b();
                        o41 o41Var3 = (o41) v13.f10110b;
                        o41Var3.getClass();
                        o41Var3.keyMaterialType_ = n41Var.a();
                        w13.b();
                        j51 j51Var = (j51) w13.f10110b;
                        o41 o41Var4 = (o41) v13.a();
                        j51Var.getClass();
                        j51Var.keyData_ = o41Var4;
                        i15 = j51Var.bitField0_;
                        j51Var.bitField0_ = i15 | 1;
                        w13.b();
                        j51 j51Var2 = (j51) w13.f10110b;
                        j51Var2.getClass();
                        j51Var2.status_ = y41Var.a();
                        w13.b();
                        ((j51) w13.f10110b).keyId_ = i14;
                        ju1 ju1Var = i22Var.f6188e;
                        w13.b();
                        j51 j51Var3 = (j51) w13.f10110b;
                        j51Var3.getClass();
                        j51Var3.outputPrefixType_ = ju1Var.a();
                        j51 j51Var4 = (j51) w13.a();
                        u13.b();
                        k51 k51Var = (k51) u13.f10110b;
                        k51Var.getClass();
                        h4Var = k51Var.key_;
                        if (!((j) h4Var).f6594a) {
                            k51Var.key_ = e0.t.a(h4Var);
                        }
                        h4Var2 = k51Var.key_;
                        h4Var2.add(j51Var4);
                        if (l51Var2.f7688a) {
                            if (num == null) {
                                num = Integer.valueOf(i14);
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(o51Var);
                        i13 = 0;
                    } else {
                        throw new GeneralSecurityException(a.a.e("Id ", i14, " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                u13.b();
                ((k51) u13.f10110b).primaryKeyId_ = intValue;
                k51 k51Var2 = (k51) u13.a();
                if (k51Var2.r() > 0) {
                    return new p51(k51Var2, arrayList, n51Var.f8679b);
                }
                throw new GeneralSecurityException("empty keyset");
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
