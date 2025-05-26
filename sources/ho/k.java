package ho;

import e2.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import jo.n;
import kh2.g3;
import kh2.j1;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final u f69679a;

    public k() {
        try {
            this.f69679a = j1.S();
        } catch (IOException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public final i a(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("Password is null.");
        }
        List emptyList = Collections.emptyList();
        System.nanoTime();
        u uVar = this.f69679a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Collections.unmodifiableMap(uVar.f56906a));
        linkedHashMap.put("user_inputs", new jo.f("user_inputs", emptyList));
        HashMap hashMap = new HashMap();
        for (jo.f fVar : linkedHashMap.values()) {
            hashMap.put(fVar.f77136a, fVar.f77138c);
        }
        d a13 = new g(uVar).a(charSequence, new jo.g(uVar, hashMap, 2).a(charSequence));
        System.nanoTime();
        i iVar = new i();
        double d2 = a13.f69669b;
        Math.log(d2);
        Math.log(10.0d);
        List list = a13.f69668a;
        if (list == null) {
            list = new ArrayList();
        }
        iVar.f69676b = list;
        g3.P(g3.Q(d2, 0.027777777777777776d));
        g3.P(d2 / 10.0d);
        g3.P(d2 / 10000.0d);
        g3.P(d2 / 1.0E10d);
        int i13 = d2 < 1005.0d ? 0 : d2 < 1000005.0d ? 1 : d2 < 1.00000005E8d ? 2 : d2 < 1.0000000005E10d ? 3 : 4;
        iVar.f69675a = i13;
        int i14 = a.f69665a;
        if (list.isEmpty()) {
            List list2 = c.f69667a;
        } else if (i13 <= 2) {
            n nVar = (n) list.get(0);
            if (list.size() > 1) {
                for (n nVar2 : list.subList(1, list.size())) {
                    if (nVar2.a() > nVar.a()) {
                        nVar = nVar2;
                    }
                }
            }
            boolean z13 = list.size() == 1;
            List list3 = c.f69667a;
            switch (b.f69666a[nVar.f77173a.ordinal()]) {
                case 1:
                    String str = nVar.f77179g;
                    boolean equals = "passwords".equals(str);
                    boolean z14 = nVar.f77180h;
                    boolean z15 = nVar.f77181i;
                    if (equals) {
                        if (!z13 || z15 || z14) {
                            nVar.f77195w.getClass();
                        }
                    } else if (!"english_wikipedia".equals(str) || !z13) {
                        c.f69667a.contains(str);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("feedback.extra.suggestions.addAnotherWord");
                    CharSequence charSequence2 = nVar.f77176d;
                    j a14 = j.a(charSequence2);
                    if (io.c.f72908c.matcher(charSequence2).find()) {
                        arrayList.add("feedback.dictionary.suggestions.capitalization");
                    }
                    if (io.c.f72910e.matcher(charSequence2).find() && !a14.equals(charSequence2)) {
                        arrayList.add("feedback.dictionary.suggestions.allUppercase");
                    }
                    if (z14 && nVar.a() >= 4) {
                        arrayList.add("feedback.dictionary.suggestions.reversed");
                    }
                    if (z15) {
                        arrayList.add("feedback.dictionary.suggestions.l33t");
                    }
                    a14.f();
                    break;
                case 3:
                    nVar.f77185m.length();
                    break;
                case 5:
                    "recent_year".equals(nVar.f77184l);
                    break;
            }
        } else {
            List list4 = c.f69667a;
        }
        return iVar;
    }
}
