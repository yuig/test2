package r9;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f106799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106800b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106801c;

    /* renamed from: d, reason: collision with root package name */
    public final long f106802d;

    /* renamed from: e, reason: collision with root package name */
    public final long f106803e;

    /* renamed from: f, reason: collision with root package name */
    public final g f106804f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f106805g;

    /* renamed from: h, reason: collision with root package name */
    public final String f106806h;

    /* renamed from: i, reason: collision with root package name */
    public final String f106807i;

    /* renamed from: j, reason: collision with root package name */
    public final c f106808j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f106809k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f106810l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f106811m;

    public c(String str, String str2, long j13, long j14, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f106799a = str;
        this.f106800b = str2;
        this.f106807i = str4;
        this.f106804f = gVar;
        this.f106805g = strArr;
        this.f106801c = str2 != null;
        this.f106802d = j13;
        this.f106803e = j14;
        str3.getClass();
        this.f106806h = str3;
        this.f106808j = cVar;
        this.f106809k = new HashMap();
        this.f106810l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            c7.a aVar = new c7.a();
            aVar.f26657a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((c7.a) treeMap.get(str)).f26657a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i13) {
        ArrayList arrayList = this.f106811m;
        if (arrayList != null) {
            return (c) arrayList.get(i13);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f106811m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z13) {
        String str = this.f106799a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z13 || equals || (equals2 && this.f106807i != null)) {
            long j13 = this.f106802d;
            if (j13 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j13));
            }
            long j14 = this.f106803e;
            if (j14 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j14));
            }
        }
        if (this.f106811m == null) {
            return;
        }
        for (int i13 = 0; i13 < this.f106811m.size(); i13++) {
            ((c) this.f106811m.get(i13)).d(treeSet, z13 || equals);
        }
    }

    public final boolean f(long j13) {
        long j14 = this.f106802d;
        long j15 = this.f106803e;
        return (j14 == -9223372036854775807L && j15 == -9223372036854775807L) || (j14 <= j13 && j15 == -9223372036854775807L) || ((j14 == -9223372036854775807L && j13 < j15) || (j14 <= j13 && j13 < j15));
    }

    public final void g(long j13, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f106806h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j13) && "div".equals(this.f106799a) && (str2 = this.f106807i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i13 = 0; i13 < c(); i13++) {
            b(i13).g(j13, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r20, java.util.Map r22, java.util.Map r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.c.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j13, boolean z13, String str, TreeMap treeMap) {
        HashMap hashMap = this.f106809k;
        hashMap.clear();
        HashMap hashMap2 = this.f106810l;
        hashMap2.clear();
        String str2 = this.f106799a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f106806h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f106801c && z13) {
            SpannableStringBuilder e13 = e(str4, treeMap);
            String str5 = this.f106800b;
            str5.getClass();
            e13.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z13) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j13)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((c7.a) entry.getValue()).f26657a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i13 = 0; i13 < c(); i13++) {
                b(i13).i(j13, z13 || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e14 = e(str4, treeMap);
                int length = e14.length() - 1;
                while (length >= 0 && e14.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e14.charAt(length) != '\n') {
                    e14.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((c7.a) entry2.getValue()).f26657a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
