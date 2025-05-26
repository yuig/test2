package jo;

import com.google.android.gms.internal.measurement.x;
import e2.u;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class p extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f77197d = Pattern.compile("(.+)\\1+");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f77198e = Pattern.compile("(.+?)\\1+");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f77199f = Pattern.compile("^(.+?)\\1+$");

    /* renamed from: b, reason: collision with root package name */
    public final ho.g f77200b;

    /* renamed from: c, reason: collision with root package name */
    public final x f77201c;

    public p(u uVar) {
        super(uVar);
        this.f77200b = new ho.g(uVar);
        this.f77201c = new x(uVar, new ArrayList());
    }

    @Override // jo.c
    public final ArrayList a(CharSequence charSequence) {
        int start;
        String str;
        int length;
        ArrayList arrayList = new ArrayList();
        int length2 = charSequence.length();
        int i13 = 0;
        while (i13 < length2) {
            Matcher matcher = f77197d.matcher(charSequence);
            matcher.region(i13, length2);
            Matcher matcher2 = f77198e.matcher(charSequence);
            matcher2.region(i13, length2);
            if (!matcher.find()) {
                break;
            }
            String group = matcher.group(0);
            String group2 = matcher2.find() ? matcher2.group(0) : "";
            if (group.length() > group2.length()) {
                Matcher matcher3 = f77199f.matcher(group);
                str = matcher3.find() ? matcher3.group(1) : group;
                start = matcher.start(0);
                length = (group.length() + start) - 1;
            } else {
                String group3 = matcher2.group(1);
                start = matcher2.start(0);
                str = group3;
                group = group2;
                length = (group2.length() + start) - 1;
            }
            ho.d a13 = this.f77200b.a(str, this.f77201c.s(str));
            ho.j jVar = new ho.j(str);
            int length3 = group.length() / jVar.length();
            m mVar = new m(ho.e.Repeat, start, length, group);
            mVar.f77164m = jVar;
            mVar.f77165n = a13.f69669b;
            List list = a13.f69668a;
            if (list == null) {
                list = new ArrayList();
            }
            mVar.f77166o = list;
            mVar.f77167p = length3;
            arrayList.add(new n(mVar));
            i13 = length + 1;
        }
        return arrayList;
    }
}
