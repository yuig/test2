package jo;

import e2.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class k extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final Map f77150c;

    /* renamed from: b, reason: collision with root package name */
    public final Map f77151b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('a', Arrays.asList('4', '@'));
        hashMap.put('b', Collections.singletonList('8'));
        hashMap.put('c', Arrays.asList('(', '{', '[', '<'));
        hashMap.put('e', Collections.singletonList('3'));
        hashMap.put('g', Arrays.asList('6', '9'));
        hashMap.put('i', Arrays.asList('1', '!', '|'));
        hashMap.put('l', Arrays.asList('1', '|', '7'));
        hashMap.put('o', Collections.singletonList('0'));
        hashMap.put('s', Arrays.asList('$', '5'));
        hashMap.put('t', Arrays.asList('+', '7'));
        hashMap.put('x', Collections.singletonList('%'));
        hashMap.put('z', Collections.singletonList('2'));
        f77150c = Collections.unmodifiableMap(hashMap);
    }

    public k(u uVar, Map map) {
        super(uVar);
        this.f77151b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jo.c
    public final ArrayList a(CharSequence charSequence) {
        Iterator it;
        CharSequence charSequence2 = charSequence;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i13 = 0;
        for (int i14 = 0; i14 < charSequence.length(); i14++) {
            hashSet.add(Character.valueOf(charSequence2.charAt(i14)));
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : f77150c.entrySet()) {
            Character ch3 = (Character) entry.getKey();
            List<Character> list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Character ch4 : list) {
                if (hashSet.contains(ch4)) {
                    arrayList2.add(ch4);
                }
            }
            if (!arrayList2.isEmpty()) {
                hashMap.put(ch3, arrayList2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new ArrayList());
        Set<List> b13 = l.b(hashMap, hashMap.keySet().iterator(), linkedHashSet);
        ArrayList arrayList3 = new ArrayList();
        for (List<CharSequence> list2 : b13) {
            HashMap hashMap2 = new HashMap();
            for (CharSequence charSequence3 : list2) {
                hashMap2.put(Character.valueOf(charSequence3.charAt(0)), Character.valueOf(charSequence3.charAt(1)));
            }
            arrayList3.add(hashMap2);
        }
        g gVar = new g(this.f77131a, this.f77151b, 0);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            if (map.isEmpty()) {
                break;
            }
            StringBuilder sb3 = new StringBuilder(charSequence.length());
            for (int i15 = i13; i15 < charSequence.length(); i15++) {
                char charAt = charSequence2.charAt(i15);
                Character ch5 = (Character) map.get(Character.valueOf(charAt));
                if (ch5 != null) {
                    charAt = ch5.charValue();
                }
                sb3.append(charAt);
            }
            ho.j jVar = new ho.j(sb3);
            if (sb3 instanceof ho.j) {
                ((ho.j) sb3).f();
            } else {
                for (int i16 = i13; i16 < sb3.length(); i16++) {
                    sb3.setCharAt(i16, ' ');
                }
                sb3.setLength(i13);
            }
            Iterator it3 = gVar.a(jVar).iterator();
            while (it3.hasNext()) {
                n nVar = (n) it3.next();
                int i17 = nVar.f77174b;
                int i18 = nVar.f77175c;
                ho.j jVar2 = new ho.j(charSequence2.subSequence(i17, i18 + 1));
                ho.j a13 = ho.j.a(jVar2);
                CharSequence charSequence4 = nVar.f77177e;
                if (a13.equals(charSequence4)) {
                    jVar2.f();
                    a13.f();
                } else {
                    HashMap hashMap3 = new HashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        Character ch6 = (Character) entry2.getKey();
                        Character ch7 = (Character) entry2.getValue();
                        char charValue = ch6.charValue();
                        g gVar2 = gVar;
                        int i19 = 0;
                        while (true) {
                            char[] cArr = jVar2.f69677a;
                            it = it2;
                            if (i19 >= cArr.length) {
                                break;
                            }
                            if (cArr[i19] != charValue) {
                                i19++;
                                it2 = it;
                            } else if (i19 != -1) {
                                hashMap3.put(ch6, ch7);
                            }
                        }
                        gVar = gVar2;
                        it2 = it;
                    }
                    g gVar3 = gVar;
                    Iterator it4 = it2;
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : hashMap3.entrySet()) {
                        arrayList4.add(((Character) entry3.getKey()) + " -> " + ((Character) entry3.getValue()));
                    }
                    Arrays.toString(arrayList4.toArray(new String[0]));
                    m mVar = new m(ho.e.Dictionary, nVar.f77174b, i18, jVar2);
                    mVar.f77156e = charSequence4;
                    mVar.f77157f = nVar.f77178f;
                    mVar.f77158g = nVar.f77179g;
                    mVar.f77159h = nVar.f77180h;
                    mVar.f77161j = hashMap3;
                    mVar.f77160i = true;
                    arrayList.add(new n(mVar));
                    a13.f();
                    charSequence2 = charSequence;
                    i13 = 0;
                    gVar = gVar3;
                    it2 = it4;
                }
            }
            charSequence2 = charSequence;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            n nVar2 = (n) it5.next();
            if (nVar2.a() > 1) {
                arrayList5.add(nVar2);
            }
        }
        c.b(arrayList5);
        return arrayList5;
    }
}
