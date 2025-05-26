package r9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import d7.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class h implements l9.d {

    /* renamed from: a, reason: collision with root package name */
    public final c f106855a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f106856b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f106857c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f106858d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f106859e;

    public h(c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f106855a = cVar;
        this.f106858d = hashMap2;
        this.f106859e = hashMap3;
        this.f106857c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i13 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i13] = ((Long) it.next()).longValue();
            i13++;
        }
        this.f106856b = jArr;
    }

    @Override // l9.d
    public final int a(long j13) {
        long[] jArr = this.f106856b;
        int a13 = n0.a(jArr, j13, false);
        if (a13 < jArr.length) {
            return a13;
        }
        return -1;
    }

    @Override // l9.d
    public final List b(long j13) {
        c cVar = this.f106855a;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        cVar.g(j13, cVar.f106806h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j13, false, cVar.f106806h, treeMap);
        Map map = this.f106857c;
        Map map2 = this.f106858d;
        cVar.h(j13, map, map2, cVar.f106806h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.f106859e.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                f fVar = (f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new c7.b(null, null, null, decodeByteArray, fVar.f106826c, 0, fVar.f106828e, fVar.f106825b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f106829f, fVar.f106830g, false, -16777216, fVar.f106833j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) map2.get(entry.getKey());
            fVar2.getClass();
            c7.a aVar = (c7.a) entry.getValue();
            CharSequence charSequence = aVar.f26657a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length(); i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (i15 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i15) == ' ') {
                        i15++;
                    }
                    int i16 = i15 - i14;
                    if (i16 > 0) {
                        spannableStringBuilder.delete(i13, i16 + i13);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    int i18 = i17 + 1;
                    if (spannableStringBuilder.charAt(i18) == ' ') {
                        spannableStringBuilder.delete(i18, i17 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i19 = 0; i19 < spannableStringBuilder.length() - 1; i19++) {
                if (spannableStringBuilder.charAt(i19) == ' ') {
                    int i23 = i19 + 1;
                    if (spannableStringBuilder.charAt(i23) == '\n') {
                        spannableStringBuilder.delete(i19, i23);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f26661e = fVar2.f106826c;
            aVar.f26662f = fVar2.f106827d;
            aVar.f26663g = fVar2.f106828e;
            aVar.f26664h = fVar2.f106825b;
            aVar.f26668l = fVar2.f106829f;
            aVar.f26667k = fVar2.f106832i;
            aVar.f26666j = fVar2.f106831h;
            aVar.f26672p = fVar2.f106833j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // l9.d
    public final long c(int i13) {
        return this.f106856b[i13];
    }

    @Override // l9.d
    public final int d() {
        return this.f106856b.length;
    }
}
