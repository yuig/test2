package jo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class o extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f77196b;

    static {
        HashMap hashMap = new HashMap();
        f77196b = hashMap;
        hashMap.put("recent_year", Pattern.compile("19\\d\\d|200\\d|201\\d|202\\d"));
    }

    @Override // jo.c
    public final ArrayList a(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : f77196b.entrySet()) {
            String str = (String) entry.getKey();
            Matcher matcher = ((Pattern) entry.getValue()).matcher(charSequence);
            while (matcher.find()) {
                m mVar = new m(ho.e.Regex, matcher.start(), (r4.length() + matcher.start()) - 1, new ho.j(matcher.group()));
                mVar.f77163l = str;
                arrayList.add(new n(mVar));
            }
        }
        c.b(arrayList);
        return arrayList;
    }
}
