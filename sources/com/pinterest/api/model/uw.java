package com.pinterest.api.model;

import com.appsflyer.AdRevenueScheme;
import java.util.Objects;

/* loaded from: classes.dex */
public class uw {

    /* renamed from: a, reason: collision with root package name */
    @om.b("colorHex")
    private String f42651a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("envMappingIntensity")
    private Integer f42652b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("glitter")
    private Integer f42653c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("glitterBaseReflectivity")
    private Integer f42654d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("glitterColorVariation")
    private Integer f42655e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("glitterDensity")
    private Integer f42656f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("glitterHex")
    private String f42657g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("glitterSize")
    private Integer f42658h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("glitterSizeVariation")
    private Integer f42659i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("gloss")
    private Integer f42660j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("glossDetail")
    private Integer f42661k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("opacity")
    private Integer f42662l;

    /* renamed from: m, reason: collision with root package name */
    @om.b(AdRevenueScheme.PLACEMENT)
    private String f42663m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("shadeName")
    private String f42664n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("wetness")
    private Integer f42665o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f42666p;

    public /* synthetic */ uw(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str3, String str4, Integer num11, boolean[] zArr, int i13) {
        this(str, num, num2, num3, num4, num5, str2, num6, num7, num8, num9, num10, str3, str4, num11, zArr);
    }

    public final Integer A() {
        Integer num = this.f42662l;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String B() {
        return this.f42663m;
    }

    public final Integer C() {
        Integer num = this.f42665o;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uw uwVar = (uw) obj;
        return Objects.equals(this.f42665o, uwVar.f42665o) && Objects.equals(this.f42662l, uwVar.f42662l) && Objects.equals(this.f42661k, uwVar.f42661k) && Objects.equals(this.f42660j, uwVar.f42660j) && Objects.equals(this.f42659i, uwVar.f42659i) && Objects.equals(this.f42658h, uwVar.f42658h) && Objects.equals(this.f42656f, uwVar.f42656f) && Objects.equals(this.f42655e, uwVar.f42655e) && Objects.equals(this.f42654d, uwVar.f42654d) && Objects.equals(this.f42653c, uwVar.f42653c) && Objects.equals(this.f42652b, uwVar.f42652b) && Objects.equals(this.f42651a, uwVar.f42651a) && Objects.equals(this.f42657g, uwVar.f42657g) && Objects.equals(this.f42663m, uwVar.f42663m) && Objects.equals(this.f42664n, uwVar.f42664n);
    }

    public final int hashCode() {
        return Objects.hash(this.f42651a, this.f42652b, this.f42653c, this.f42654d, this.f42655e, this.f42656f, this.f42657g, this.f42658h, this.f42659i, this.f42660j, this.f42661k, this.f42662l, this.f42663m, this.f42664n, this.f42665o);
    }

    public final String p() {
        return this.f42651a;
    }

    public final Integer q() {
        Integer num = this.f42652b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer r() {
        Integer num = this.f42653c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer s() {
        Integer num = this.f42654d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer t() {
        Integer num = this.f42655e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer u() {
        Integer num = this.f42656f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String v() {
        return this.f42657g;
    }

    public final Integer w() {
        Integer num = this.f42658h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer x() {
        Integer num = this.f42659i;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer y() {
        Integer num = this.f42660j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer z() {
        Integer num = this.f42661k;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public uw() {
        this.f42666p = new boolean[15];
    }

    private uw(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str3, String str4, Integer num11, boolean[] zArr) {
        this.f42651a = str;
        this.f42652b = num;
        this.f42653c = num2;
        this.f42654d = num3;
        this.f42655e = num4;
        this.f42656f = num5;
        this.f42657g = str2;
        this.f42658h = num6;
        this.f42659i = num7;
        this.f42660j = num8;
        this.f42661k = num9;
        this.f42662l = num10;
        this.f42663m = str3;
        this.f42664n = str4;
        this.f42665o = num11;
        this.f42666p = zArr;
    }
}
