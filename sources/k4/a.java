package k4;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import i4.b;
import i4.c;
import j4.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.g0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f78262a = new a();

    @NotNull
    public final Object a(@NotNull c cVar) {
        ArrayList arrayList = new ArrayList(g0.q(cVar, 10));
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).f71502a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(@NotNull e eVar, @NotNull c cVar) {
        ArrayList arrayList = new ArrayList(g0.q(cVar, 10));
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).f71502a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        eVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
