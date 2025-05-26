package u9;

import android.graphics.Color;
import android.text.TextUtils;
import d7.d0;
import d7.u;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f121162a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f121163b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f121164c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f121165d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f121164c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f121165d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.text.SpannableStringBuilder r19, u9.f r20, java.lang.String r21, java.util.List r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.i.a(android.text.SpannableStringBuilder, u9.f, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, f fVar) {
        int i13;
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            c cVar = (c) list.get(i14);
            String str2 = fVar.f121145a;
            if (cVar.f121122a.isEmpty() && cVar.f121123b.isEmpty() && cVar.f121124c.isEmpty() && cVar.f121125d.isEmpty()) {
                i13 = TextUtils.isEmpty(str2);
            } else {
                int a13 = c.a(cVar.f121125d, c.a(cVar.f121123b, c.a(cVar.f121122a, 0, 1073741824, str), 2, str2), 4, fVar.f121147c);
                if (a13 != -1) {
                    if (fVar.f121148d.containsAll(cVar.f121124c)) {
                        i13 = a13 + (cVar.f121124c.size() * 4);
                    }
                }
                i13 = 0;
            }
            if (i13 > 0) {
                arrayList.add(new g(i13, cVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, f fVar) {
        ArrayList b13 = b(list, str, fVar);
        for (int i13 = 0; i13 < b13.size(); i13++) {
            int i14 = ((g) b13.get(i13)).f121150b.f121137p;
            if (i14 != -1) {
                return i14;
            }
        }
        return -1;
    }

    public static d d(String str, Matcher matcher, d0 d0Var, ArrayList arrayList) {
        h hVar = new h();
        try {
            String group = matcher.group(1);
            group.getClass();
            hVar.f121151a = j.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            hVar.f121152b = j.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, hVar);
            StringBuilder sb3 = new StringBuilder();
            String l13 = d0Var.l(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(l13)) {
                if (sb3.length() > 0) {
                    sb3.append("\n");
                }
                sb3.append(l13.trim());
                l13 = d0Var.l(StandardCharsets.UTF_8);
            }
            hVar.f121153c = f(str, sb3.toString(), arrayList);
            return new d(hVar.a().a(), hVar.f121151a, hVar.f121152b);
        } catch (IllegalArgumentException unused) {
            u.g("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        if (r7.equals("start") == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, u9.h r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.i.e(java.lang.String, u9.h):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00df, code lost:
    
        if (r11.equals("i") == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.i.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, h hVar) {
        String substring;
        int i13;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i13 = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i13 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i13 = 0;
                    break;
                default:
                    u.g("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i13 = Integer.MIN_VALUE;
                    break;
            }
            hVar.f121157g = i13;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            hVar.f121155e = j.b(str);
            hVar.f121156f = 0;
        } else {
            hVar.f121155e = Integer.parseInt(str);
            hVar.f121156f = 1;
        }
    }
}
