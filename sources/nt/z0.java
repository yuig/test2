package nt;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.r f92246a;

    public z0(lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f92246a = prefsManagerUser;
    }

    public static void a(String str, Map map, Set set, long j13, HashSet hashSet, HashSet hashSet2) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (kotlin.text.z.j(str)) {
            return;
        }
        ju.a aVar = (ju.a) new nm.o().b(ju.a.class, str);
        String str11 = aVar != null ? aVar.f77590a : null;
        String str12 = "";
        if (str11 != null && !kotlin.text.z.j(str11)) {
            i1 i1Var = i1.f92062h;
            if (set.contains(i1Var)) {
                if (c(j13, aVar != null ? aVar.f77591b : null)) {
                    hashSet.add(ju.e.FULL_NAME);
                    if (aVar == null || (str10 = aVar.f77590a) == null) {
                        str10 = "";
                    }
                    map.put(i1Var, str10);
                } else {
                    hashSet2.add(ju.e.FULL_NAME);
                }
            }
        }
        String str13 = aVar != null ? aVar.f77592c : null;
        if (str13 != null && !kotlin.text.z.j(str13)) {
            i1 i1Var2 = i1.f92061g;
            if (set.contains(i1Var2)) {
                if (c(j13, aVar != null ? aVar.f77593d : null)) {
                    hashSet.add(ju.e.FIRST_NAME);
                    if (aVar == null || (str9 = aVar.f77592c) == null) {
                        str9 = "";
                    }
                    map.put(i1Var2, str9);
                } else {
                    hashSet2.add(ju.e.FIRST_NAME);
                }
            }
        }
        String str14 = aVar != null ? aVar.f77594e : null;
        if (str14 != null && !kotlin.text.z.j(str14)) {
            i1 i1Var3 = i1.f92064j;
            if (set.contains(i1Var3)) {
                if (c(j13, aVar != null ? aVar.f77595f : null)) {
                    hashSet.add(ju.e.LAST_NAME);
                    if (aVar == null || (str8 = aVar.f77594e) == null) {
                        str8 = "";
                    }
                    map.put(i1Var3, str8);
                } else {
                    hashSet2.add(ju.e.LAST_NAME);
                }
            }
        }
        String str15 = aVar != null ? aVar.f77596g : null;
        if (str15 != null && !kotlin.text.z.j(str15)) {
            i1 i1Var4 = i1.f92060f;
            if (set.contains(i1Var4)) {
                if (c(j13, aVar != null ? aVar.f77597h : null)) {
                    hashSet.add(ju.e.EMAIL);
                    if (aVar == null || (str7 = aVar.f77596g) == null) {
                        str7 = "";
                    }
                    map.put(i1Var4, str7);
                } else {
                    hashSet2.add(ju.e.EMAIL);
                }
            }
        }
        String str16 = aVar != null ? aVar.f77598i : null;
        if (str16 != null && !kotlin.text.z.j(str16)) {
            i1 i1Var5 = i1.f92056b;
            if (set.contains(i1Var5)) {
                if (c(j13, aVar != null ? aVar.f77599j : null)) {
                    hashSet.add(ju.e.AGE);
                    if (aVar == null || (str6 = aVar.f77598i) == null) {
                        str6 = "";
                    }
                    map.put(i1Var5, str6);
                } else {
                    hashSet2.add(ju.e.AGE);
                }
            }
        }
        String str17 = aVar != null ? aVar.f77606q : null;
        if (str17 != null && !kotlin.text.z.j(str17)) {
            i1 i1Var6 = i1.f92063i;
            if (set.contains(i1Var6)) {
                if (c(j13, aVar != null ? aVar.f77607r : null)) {
                    hashSet.add(ju.e.GENDER);
                    if (aVar == null || (str5 = aVar.f77606q) == null) {
                        str5 = "";
                    }
                    map.put(i1Var6, str5);
                } else {
                    hashSet2.add(ju.e.GENDER);
                }
            }
        }
        String str18 = aVar != null ? aVar.f77600k : null;
        if (str18 != null && !kotlin.text.z.j(str18)) {
            i1 i1Var7 = i1.f92057c;
            if (set.contains(i1Var7)) {
                if (c(j13, aVar != null ? aVar.f77601l : null)) {
                    hashSet.add(ju.e.CITY);
                    if (aVar == null || (str4 = aVar.f77600k) == null) {
                        str4 = "";
                    }
                    map.put(i1Var7, str4);
                } else {
                    hashSet2.add(ju.e.CITY);
                }
            }
        }
        String str19 = aVar != null ? aVar.f77602m : null;
        if (str19 != null && !kotlin.text.z.j(str19)) {
            i1 i1Var8 = i1.f92068n;
            if (set.contains(i1Var8)) {
                if (c(j13, aVar != null ? aVar.f77603n : null)) {
                    hashSet.add(ju.e.STATE_PROVINCE);
                    if (aVar == null || (str3 = aVar.f77602m) == null) {
                        str3 = "";
                    }
                    map.put(i1Var8, str3);
                } else {
                    hashSet2.add(ju.e.STATE_PROVINCE);
                }
            }
        }
        if ((aVar != null ? aVar.f77604o : null) != null) {
            j1 j1Var = j1.f92079a;
            if (set.contains(j1Var)) {
                if (!c(j13, aVar.f77605p)) {
                    hashSet2.add(ju.e.COUNTRY);
                    return;
                }
                hashSet.add(ju.e.COUNTRY);
                m91.b bVar = aVar.f77604o;
                if (bVar != null && (str2 = bVar.f86723c) != null) {
                    str12 = str2;
                }
                map.put(j1Var, str12);
            }
        }
    }

    public static j b(ju.e eVar, h32.u0 elementType, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        if (hashSet.contains(eVar)) {
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            return new i(elementType);
        }
        if (hashSet2.contains(eVar)) {
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            return new h(elementType);
        }
        if (!hashSet3.contains(eVar)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        return new g(elementType);
    }

    public static boolean c(long j13, Long l13) {
        return l13 != null && l13.longValue() <= j13 && j13 <= l13.longValue() + 2592000000L;
    }
}
