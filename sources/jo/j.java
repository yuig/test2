package jo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f77145a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f77146b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77147c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77148d;

    /* renamed from: e, reason: collision with root package name */
    public final double f77149e;

    public j(String str, i iVar) {
        boolean z13;
        Iterator it;
        Map.Entry entry;
        char[] cArr;
        int i13;
        List asList;
        int i14;
        i iVar2 = iVar;
        this.f77145a = str;
        iVar.getClass();
        HashMap hashMap = new HashMap();
        kp.n nVar = i.f77143b;
        String str2 = iVar2.f77144a;
        ArrayList a13 = i.a(str2, nVar);
        int i15 = 0;
        int length = ((String) a13.get(0)).length() + 1;
        Iterator it2 = a13.iterator();
        while (it2.hasNext()) {
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        boolean z14 = false;
        int i17 = 0;
        while (i16 < length2) {
            if (str2.charAt(i16) == '\n') {
                if (z14) {
                    arrayList.add(str2.substring(i17, i16));
                    z14 = false;
                }
                i17 = i16 + 1;
                i16 = i17;
            } else {
                i16++;
                z14 = true;
            }
        }
        if (z14) {
            arrayList.add(str2.substring(i17, i16));
        }
        Iterator it3 = arrayList.iterator();
        int i18 = 1;
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            switch (((a) iVar2).f77129c) {
                case 0:
                    i14 = 0;
                    break;
                default:
                    i14 = i18 - 1;
                    break;
            }
            Iterator it4 = i.a(str3, nVar).iterator();
            while (it4.hasNext()) {
                String str4 = (String) it4.next();
                int indexOf = str3.indexOf(str4) - i14;
                int i19 = indexOf / length;
                int i23 = indexOf % length;
                hashMap.put(new h(i19, i18), str4);
            }
            i18++;
        }
        HashMap hashMap2 = new HashMap();
        Iterator it5 = hashMap.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it5.next();
            char[] charArray = ((String) entry2.getValue()).toCharArray();
            int length3 = charArray.length;
            int i24 = i15;
            while (i24 < length3) {
                char c13 = charArray[i24];
                ArrayList arrayList2 = new ArrayList();
                h hVar = (h) entry2.getKey();
                switch (((a) iVar2).f77129c) {
                    case 0:
                        it = it5;
                        entry = entry2;
                        cArr = charArray;
                        int i25 = hVar.f77141a;
                        int i26 = i25 - 1;
                        int i27 = hVar.f77142b;
                        h hVar2 = new h(i26, i27);
                        int i28 = i27 - 1;
                        h hVar3 = new h(i26, i28);
                        h hVar4 = new h(i25, i28);
                        int i29 = i25 + 1;
                        i13 = length3;
                        h hVar5 = new h(i29, i28);
                        h hVar6 = new h(i29, i27);
                        int i33 = i27 + 1;
                        asList = Arrays.asList(hVar2, hVar3, hVar4, hVar5, hVar6, new h(i29, i33), new h(i25, i33), new h(i26, i33));
                        break;
                    default:
                        int i34 = hVar.f77141a;
                        int i35 = i34 - 1;
                        int i36 = hVar.f77142b;
                        h hVar7 = new h(i35, i36);
                        int i37 = i36 - 1;
                        it = it5;
                        h hVar8 = new h(i34, i37);
                        entry = entry2;
                        int i38 = i34 + 1;
                        cArr = charArray;
                        h hVar9 = new h(i38, i37);
                        h hVar10 = new h(i38, i36);
                        int i39 = i36 + 1;
                        asList = Arrays.asList(hVar7, hVar8, hVar9, hVar10, new h(i34, i39), new h(i35, i39));
                        i13 = length3;
                        break;
                }
                Iterator it6 = asList.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(hashMap.get((h) it6.next()));
                }
                hashMap2.put(Character.valueOf(c13), arrayList2);
                i24++;
                iVar2 = iVar;
                it5 = it;
                entry2 = entry;
                charArray = cArr;
                length3 = i13;
                i15 = 0;
            }
            iVar2 = iVar;
        }
        this.f77146b = hashMap2;
        switch (((a) iVar).f77129c) {
            case 0:
                z13 = false;
                break;
            default:
                z13 = true;
                break;
        }
        this.f77147c = z13;
        this.f77148d = hashMap2.size();
        Iterator it7 = hashMap2.entrySet().iterator();
        double d2 = 0.0d;
        while (it7.hasNext()) {
            List<String> list = (List) ((Map.Entry) it7.next()).getValue();
            ArrayList arrayList3 = new ArrayList();
            for (String str5 : list) {
                if (str5 != null) {
                    arrayList3.add(str5);
                }
            }
            d2 += arrayList3.size();
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it8 = hashMap2.entrySet().iterator();
        while (it8.hasNext()) {
            arrayList4.add(((Map.Entry) it8.next()).getKey());
        }
        this.f77149e = d2 / arrayList4.size();
    }
}
