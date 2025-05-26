package io;

import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import jo.n;

/* loaded from: classes3.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f73310c = new HashSet(Arrays.asList('a', 'A', 'z', 'Z', '0', '1', '9'));

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f73311d = Pattern.compile("\\d");

    @Override // io.e
    public final double a(n nVar) {
        char charAt = nVar.f77176d.charAt(0);
        double d2 = f73310c.contains(Character.valueOf(charAt)) ? 4.0d : f73311d.matcher(String.valueOf(charAt)).find() ? 10.0d : 26.0d;
        if (!nVar.f77183k) {
            d2 *= 2.0d;
        }
        return d2 * nVar.a();
    }
}
