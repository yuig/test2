package cc;

import a.cb;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f27428a;

    /* renamed from: b, reason: collision with root package name */
    public final char f27429b;

    /* renamed from: c, reason: collision with root package name */
    public final double f27430c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27431d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27432e;

    public e(ArrayList arrayList, char c13, double d2, String str, String str2) {
        this.f27428a = arrayList;
        this.f27429b = c13;
        this.f27430c = d2;
        this.f27431d = str;
        this.f27432e = str2;
    }

    public static int a(char c13, String str, String str2) {
        return str2.hashCode() + cb.d(str, c13 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f27429b, this.f27432e, this.f27431d);
    }
}
