package qs1;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f105095a = h1.f("https://www.pinterest.com/about/copyright/dmca-pin/", "https://www.pinterest.com/about/trademark/form/", "https://policy.pinterest.com/trademark", "https://policy.pinterest.com/privacy-policy", "https://policy.pinterest.com/netzdg", "https://help.pinterest.com/contact?current_page=overview&features_settings=search", "https://help.pinterest.com/article/search-by-body-type-ranges");

    /* renamed from: b, reason: collision with root package name */
    public static final Set f105096b = h1.f(new Regex("https://policy\\.pinterest\\.com/advertising-guidelines(#[a-z-]*)?"), new Regex("https://www.pinterest.com/about/copyright/dmca-pin/.*"), new Regex("https://www.pinterest.com/about/trademark/form/.*"));

    public static final boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (f105095a.contains(str)) {
            return true;
        }
        Iterator it = f105096b.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).e(str)) {
                return true;
            }
        }
        return false;
    }
}
