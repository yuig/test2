package jo;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class r extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f77202b = Pattern.compile("^[a-z]+$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f77203c = Pattern.compile("^[A-Z]+$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f77204d = Pattern.compile("^\\d+$");

    public static void c(CharSequence charSequence, ArrayList arrayList, int i13, int i14, int i15) {
        n nVar;
        if ((i14 - i13 > 1 || Math.abs(i15) == 1) && Math.abs(i15) <= 5) {
            ho.j jVar = new ho.j(charSequence.subSequence(i13, i14 + 1));
            q qVar = f77202b.matcher(jVar).matches() ? q.LOWER : f77203c.matcher(jVar).matches() ? q.UPPER : f77204d.matcher(jVar).matches() ? q.DIGITS : q.UNICODE;
            qVar.getName();
            qVar.getSpace();
            boolean z13 = i15 > 0;
            m mVar = new m(ho.e.Sequence, i13, i14, jVar);
            mVar.f77162k = z13;
            nVar = new n(mVar);
        } else {
            nVar = null;
        }
        if (nVar != null) {
            arrayList.add(nVar);
        }
    }

    @Override // jo.c
    public final ArrayList a(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() != 1) {
            ho.j jVar = new ho.j(charSequence);
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 1; i15 < charSequence.length(); i15++) {
                if (i15 >= 0) {
                    char[] cArr = jVar.f69677a;
                    if (i15 < cArr.length) {
                        int codePointAt = Character.codePointAt(cArr, i15, cArr.length);
                        int i16 = i15 - 1;
                        if (i16 >= 0) {
                            char[] cArr2 = jVar.f69677a;
                            if (i16 < cArr2.length) {
                                int codePointAt2 = codePointAt - Character.codePointAt(cArr2, i16, cArr2.length);
                                if (i15 == 1) {
                                    i14 = codePointAt2;
                                }
                                if (codePointAt2 != i14) {
                                    c(charSequence, arrayList, i13, i16, i14);
                                    i14 = codePointAt2;
                                    i13 = i16;
                                }
                            }
                        }
                        throw new StringIndexOutOfBoundsException(i16);
                    }
                }
                throw new StringIndexOutOfBoundsException(i15);
            }
            jVar.f();
            c(charSequence, arrayList, i13, charSequence.length() - 1, i14);
        }
        return arrayList;
    }
}
