package p9;

import a.cb;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d7.d0;
import d7.i;
import d7.n0;
import d7.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l9.k;
import l9.l;

/* loaded from: classes3.dex */
public final class b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f99135g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99136a;

    /* renamed from: b, reason: collision with root package name */
    public final a f99137b;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f99139d;

    /* renamed from: e, reason: collision with root package name */
    public float f99140e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f99141f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f99138c = new d0();

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.f99136a = false;
            this.f99137b = null;
            return;
        }
        this.f99136a = true;
        String q13 = n0.q((byte[]) list.get(0));
        bf.b.i(q13.startsWith("Format:"));
        a a13 = a.a(q13);
        a13.getClass();
        this.f99137b = a13;
        b(new d0((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j13, ArrayList arrayList, ArrayList arrayList2) {
        int i13;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j13) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j13) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, Long.valueOf(j13));
        arrayList2.add(i13, i13 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i13 - 1)));
        return i13;
    }

    public static long c(String str) {
        Matcher matcher = f99135g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i13 = n0.f53866a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // l9.l
    public final int E() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(d7.d0 r28, java.nio.charset.Charset r29) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.b.b(d7.d0, java.nio.charset.Charset):void");
    }

    @Override // l9.l
    public final void w(byte[] bArr, int i13, int i14, k kVar, i iVar) {
        Charset charset;
        a aVar;
        d0 d0Var;
        int i15;
        float f13;
        int i16;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i17;
        PointF pointF;
        int i18;
        int i19;
        float f14;
        float f15;
        float f16;
        float f17;
        int i23;
        int i24;
        float f18;
        int i25;
        int i26;
        Integer num;
        int i27;
        int i28;
        b bVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d0 d0Var2 = bVar.f99138c;
        d0Var2.I(i13 + i14, bArr);
        d0Var2.K(i13);
        Charset G = d0Var2.G();
        if (G == null) {
            G = StandardCharsets.UTF_8;
        }
        boolean z13 = bVar.f99136a;
        if (!z13) {
            bVar.b(d0Var2, G);
        }
        a aVar2 = z13 ? bVar.f99137b : null;
        while (true) {
            String l13 = d0Var2.l(G);
            if (l13 == null) {
                long j13 = kVar.f82319a;
                ArrayList arrayList3 = (j13 == -9223372036854775807L || !kVar.f82320b) ? null : new ArrayList();
                for (int i29 = 0; i29 < arrayList.size(); i29++) {
                    List list = (List) arrayList.get(i29);
                    if (!list.isEmpty() || i29 == 0) {
                        if (i29 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i29)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i29 + 1)).longValue() - ((Long) arrayList2.get(i29)).longValue();
                        if (j13 == -9223372036854775807L || longValue >= j13) {
                            iVar.accept(new l9.a(longValue, longValue2, list));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new l9.a(longValue, longValue2, list));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        iVar.accept((l9.a) it.next());
                    }
                    return;
                }
                return;
            }
            if (l13.startsWith("Format:")) {
                aVar2 = a.a(l13);
            } else {
                if (l13.startsWith("Dialogue:")) {
                    if (aVar2 == null) {
                        u.g("SsaParser", "Skipping dialogue line before complete format: ".concat(l13));
                    } else {
                        bf.b.i(l13.startsWith("Dialogue:"));
                        String substring = l13.substring(9);
                        int i33 = aVar2.f99134e;
                        String[] split = substring.split(",", i33);
                        if (split.length != i33) {
                            u.g("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(l13));
                        } else {
                            d0 d0Var3 = d0Var2;
                            long c13 = c(split[aVar2.f99130a]);
                            if (c13 == -9223372036854775807L) {
                                u.g("SsaParser", "Skipping invalid timing: ".concat(l13));
                                charset = G;
                                aVar = aVar2;
                                d0Var = d0Var3;
                            } else {
                                long c14 = c(split[aVar2.f99131b]);
                                if (c14 == -9223372036854775807L || c14 <= c13) {
                                    charset = G;
                                    aVar = aVar2;
                                    d0Var = d0Var3;
                                    u.g("SsaParser", "Skipping invalid timing: ".concat(l13));
                                } else {
                                    LinkedHashMap linkedHashMap = bVar.f99139d;
                                    charset = G;
                                    e eVar = (linkedHashMap == null || (i28 = aVar2.f99132c) == -1) ? null : (e) linkedHashMap.get(split[i28].trim());
                                    String str = split[aVar2.f99133d];
                                    Matcher matcher = d.f99153a.matcher(str);
                                    int i34 = -1;
                                    PointF pointF2 = null;
                                    while (matcher.find()) {
                                        a aVar3 = aVar2;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a13 = d.a(group);
                                            if (a13 != null) {
                                                pointF2 = a13;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = d.f99156d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i27 = e.a(group2);
                                            } else {
                                                i27 = -1;
                                            }
                                            if (i27 != -1) {
                                                i34 = i27;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        aVar2 = aVar3;
                                    }
                                    aVar = aVar2;
                                    String replace = d.f99153a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f19 = bVar.f99140e;
                                    float f23 = bVar.f99141f;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (eVar != null) {
                                        Integer num2 = eVar.f99159c;
                                        if (num2 != null) {
                                            d0Var = d0Var3;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            d0Var = d0Var3;
                                        }
                                        if (eVar.f99166j == 3 && (num = eVar.f99160d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f24 = eVar.f99161e;
                                        if (f24 == -3.4028235E38f || f23 == -3.4028235E38f) {
                                            f17 = -3.4028235E38f;
                                            i23 = Integer.MIN_VALUE;
                                        } else {
                                            f17 = f24 / f23;
                                            i23 = 1;
                                        }
                                        boolean z14 = eVar.f99163g;
                                        boolean z15 = eVar.f99162f;
                                        if (z15 && z14) {
                                            i24 = i23;
                                            f18 = f17;
                                            i25 = 0;
                                            i26 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i24 = i23;
                                            f18 = f17;
                                            i25 = 0;
                                            i26 = 33;
                                            if (z15) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z14) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (eVar.f99164h) {
                                            spannableString.setSpan(new UnderlineSpan(), i25, spannableString.length(), i26);
                                        }
                                        if (eVar.f99165i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i25, spannableString.length(), i26);
                                        }
                                        i15 = i34;
                                        f13 = f18;
                                        i16 = i24;
                                    } else {
                                        d0Var = d0Var3;
                                        i15 = i34;
                                        f13 = -3.4028235E38f;
                                        i16 = Integer.MIN_VALUE;
                                    }
                                    int i35 = -1;
                                    if (i15 != -1) {
                                        i35 = i15;
                                    } else if (eVar != null) {
                                        i35 = eVar.f99158b;
                                    }
                                    switch (i35) {
                                        case 0:
                                        default:
                                            cb.t("Unknown alignment: ", i35, "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i36 = Integer.MIN_VALUE;
                                    switch (i35) {
                                        case 0:
                                        default:
                                            cb.t("Unknown alignment: ", i35, "SsaParser");
                                        case -1:
                                            i17 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i17 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i17 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i17 = 2;
                                            break;
                                    }
                                    switch (i35) {
                                        case 0:
                                        default:
                                            cb.t("Unknown alignment: ", i35, "SsaParser");
                                        case -1:
                                            pointF = pointF2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            pointF = pointF2;
                                            i36 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            pointF = pointF2;
                                            i36 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            pointF = pointF2;
                                            i36 = 0;
                                            break;
                                    }
                                    if (pointF == null || f23 == -3.4028235E38f || f19 == -3.4028235E38f) {
                                        float f25 = 0.95f;
                                        if (i17 != 0) {
                                            i18 = 1;
                                            if (i17 != 1) {
                                                i19 = 2;
                                                f14 = i17 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i19 = 2;
                                                f14 = 0.5f;
                                            }
                                        } else {
                                            i18 = 1;
                                            i19 = 2;
                                            f14 = 0.05f;
                                        }
                                        if (i36 == 0) {
                                            f25 = 0.05f;
                                        } else if (i36 == i18) {
                                            f25 = 0.5f;
                                        } else if (i36 != i19) {
                                            f25 = -3.4028235E38f;
                                        }
                                        f15 = f25;
                                        f16 = f14;
                                    } else {
                                        float f26 = pointF.x / f19;
                                        f15 = pointF.y / f23;
                                        f16 = f26;
                                    }
                                    c7.b bVar2 = new c7.b(spannableString, alignment2, null, null, f15, 0, i36, f16, i17, i16, f13, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int a14 = a(c14, arrayList2, arrayList);
                                    for (int a15 = a(c13, arrayList2, arrayList); a15 < a14; a15++) {
                                        ((List) arrayList.get(a15)).add(bVar2);
                                    }
                                }
                            }
                            bVar = this;
                            G = charset;
                            aVar2 = aVar;
                            d0Var2 = d0Var;
                        }
                    }
                }
                charset = G;
                aVar = aVar2;
                d0Var = d0Var2;
                bVar = this;
                G = charset;
                aVar2 = aVar;
                d0Var2 = d0Var;
            }
        }
    }
}
