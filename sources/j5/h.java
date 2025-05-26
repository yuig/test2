package j5;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f74679b = new h(new j(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final i f74680a;

    public h(j jVar) {
        this.f74680a = jVar;
    }

    public static h a(String str) {
        if (str == null || str.isEmpty()) {
            return c();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i13 = 0; i13 < length; i13++) {
            String str2 = split[i13];
            int i14 = g.f74678a;
            localeArr[i13] = Locale.forLanguageTag(str2);
        }
        return new h(new j(new LocaleList(localeArr)));
    }

    public static h c() {
        return f74679b;
    }

    public final Locale b(int i13) {
        return ((j) this.f74680a).f74681a.get(i13);
    }

    public final boolean d() {
        return ((j) this.f74680a).f74681a.isEmpty();
    }

    public final int e() {
        return ((j) this.f74680a).f74681a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f74680a.equals(((h) obj).f74680a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f74680a.hashCode();
    }

    public final String toString() {
        return this.f74680a.toString();
    }
}
