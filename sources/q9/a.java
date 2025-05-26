package q9;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c7.b;
import d7.d0;
import d7.i;
import d7.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l9.k;
import l9.l;
import pk.c1;

/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f103021d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f103022e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f103023a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f103024b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final d0 f103025c = new d0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static b a(Spanned spanned, String str) {
        char c13;
        char c14;
        float f13;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c13 = 0;
                    break;
                }
                c13 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c13 = 6;
                    break;
                }
                c13 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c13 = 3;
                    break;
                }
                c13 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c13 = 1;
                    break;
                }
                c13 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c13 = 7;
                    break;
                }
                c13 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c13 = 4;
                    break;
                }
                c13 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c13 = 2;
                    break;
                }
                c13 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c13 = '\b';
                    break;
                }
                c13 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c13 = 5;
                    break;
                }
                c13 = 65535;
                break;
            default:
                c13 = 65535;
                break;
        }
        int i13 = (c13 == 0 || c13 == 1 || c13 == 2) ? 0 : (c13 == 3 || c13 == 4 || c13 == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c14 = 0;
                    break;
                }
                c14 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c14 = 1;
                    break;
                }
                c14 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c14 = 2;
                    break;
                }
                c14 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c14 = 6;
                    break;
                }
                c14 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c14 = 7;
                    break;
                }
                c14 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c14 = '\b';
                    break;
                }
                c14 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c14 = 3;
                    break;
                }
                c14 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c14 = 4;
                    break;
                }
                c14 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c14 = 5;
                    break;
                }
                c14 = 65535;
                break;
            default:
                c14 = 65535;
                break;
        }
        int i14 = (c14 == 0 || c14 == 1 || c14 == 2) ? 2 : (c14 == 3 || c14 == 4 || c14 == 5) ? 0 : 1;
        float f14 = 0.92f;
        if (i13 == 0) {
            f13 = 0.08f;
        } else if (i13 == 1) {
            f13 = 0.5f;
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException();
            }
            f13 = 0.92f;
        }
        if (i14 == 0) {
            f14 = 0.08f;
        } else if (i14 == 1) {
            f14 = 0.5f;
        } else if (i14 != 2) {
            throw new IllegalArgumentException();
        }
        return new b(spanned, null, null, null, f14, 0, i14, f13, i13, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long b(Matcher matcher, int i13) {
        String group = matcher.group(i13 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i13 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i13 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i13 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // l9.l
    public final int E() {
        return 1;
    }

    @Override // l9.l
    public final void w(byte[] bArr, int i13, int i14, k kVar, i iVar) {
        i iVar2;
        String l13;
        String str;
        i iVar3;
        a aVar = this;
        i iVar4 = iVar;
        String str2 = "SubripParser";
        d0 d0Var = aVar.f103025c;
        d0Var.I(i13 + i14, bArr);
        d0Var.K(i13);
        Charset G = d0Var.G();
        if (G == null) {
            G = StandardCharsets.UTF_8;
        }
        long j13 = kVar.f82319a;
        ArrayList arrayList = (j13 == -9223372036854775807L || !kVar.f82320b) ? null : new ArrayList();
        while (true) {
            String l14 = d0Var.l(G);
            if (l14 == null) {
                break;
            }
            if (l14.length() != 0) {
                try {
                    Integer.parseInt(l14);
                    l13 = d0Var.l(G);
                } catch (NumberFormatException unused) {
                    iVar2 = iVar4;
                    u.g(str2, "Skipping invalid index: ".concat(l14));
                }
                if (l13 == null) {
                    u.g(str2, "Unexpected end");
                    break;
                }
                Matcher matcher = f103021d.matcher(l13);
                if (matcher.matches()) {
                    long b13 = b(matcher, 1);
                    long b14 = b(matcher, 6);
                    StringBuilder sb3 = aVar.f103023a;
                    sb3.setLength(0);
                    ArrayList arrayList2 = aVar.f103024b;
                    arrayList2.clear();
                    for (String l15 = d0Var.l(G); !TextUtils.isEmpty(l15); l15 = d0Var.l(G)) {
                        if (sb3.length() > 0) {
                            sb3.append("<br>");
                        }
                        String trim = l15.trim();
                        StringBuilder sb4 = new StringBuilder(trim);
                        Matcher matcher2 = f103022e.matcher(trim);
                        int i15 = 0;
                        while (matcher2.find()) {
                            String str3 = str2;
                            String group = matcher2.group();
                            arrayList2.add(group);
                            Matcher matcher3 = matcher2;
                            int start = matcher2.start() - i15;
                            int length = group.length();
                            sb4.replace(start, start + length, "");
                            i15 += length;
                            matcher2 = matcher3;
                            b14 = b14;
                            str2 = str3;
                        }
                        sb3.append(sb4.toString());
                        b14 = b14;
                        str2 = str2;
                    }
                    String str4 = str2;
                    long j14 = b14;
                    Spanned fromHtml = Html.fromHtml(sb3.toString());
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i16);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    if (j13 == -9223372036854775807L || b13 >= j13) {
                        l9.a aVar2 = new l9.a(b13, j14 - b13, c1.v(a(fromHtml, str)));
                        iVar3 = iVar;
                        iVar3.accept(aVar2);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new l9.a(b13, j14 - b13, c1.v(a(fromHtml, str))));
                        }
                        iVar3 = iVar;
                    }
                    iVar4 = iVar3;
                    str2 = str4;
                    aVar = this;
                } else {
                    iVar2 = iVar4;
                    u.g(str2, "Skipping invalid timing: ".concat(l13));
                    iVar4 = iVar2;
                    aVar = this;
                }
            }
        }
        i iVar5 = iVar4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iVar5.accept((l9.a) it.next());
            }
        }
    }
}
