package p9;

import a.cb;
import android.graphics.Color;
import d7.u;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f99157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99158b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f99159c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f99160d;

    /* renamed from: e, reason: collision with root package name */
    public final float f99161e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f99162f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f99163g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f99164h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f99165i;

    /* renamed from: j, reason: collision with root package name */
    public final int f99166j;

    public e(String str, int i13, Integer num, Integer num2, float f13, boolean z13, boolean z14, boolean z15, boolean z16, int i14) {
        this.f99157a = str;
        this.f99158b = i13;
        this.f99159c = num;
        this.f99160d = num2;
        this.f99161e = f13;
        this.f99162f = z13;
        this.f99163g = z14;
        this.f99164h = z15;
        this.f99165i = z16;
        this.f99166j = i14;
    }

    public static int a(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                cb.u("Ignoring unknown alignment: ", str, "SsaStyle");
                return -1;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e13) {
            u.h("SsaStyle", "Failed to parse boolean value: '" + str + "'", e13);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            bf.b.i(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(d7.b.r(((parseLong >> 24) & 255) ^ 255), d7.b.r(parseLong & 255), d7.b.r((parseLong >> 8) & 255), d7.b.r((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e13) {
            u.h("SsaStyle", "Failed to parse color expression: '" + str + "'", e13);
            return null;
        }
    }
}
