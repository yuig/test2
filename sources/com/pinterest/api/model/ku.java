package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ku {

    /* renamed from: a, reason: collision with root package name */
    @om.b("colorHex")
    private String f39530a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("envMappingIntensity")
    private Integer f39531b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("glitter")
    private Integer f39532c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("glitterBaseReflectivity")
    private Integer f39533d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("glitterColorVariation")
    private Integer f39534e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("glitterDensity")
    private Integer f39535f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("glitterHex")
    private String f39536g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("glitterSize")
    private Integer f39537h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("glitterSizeVariation")
    private Integer f39538i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("gloss")
    private Integer f39539j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("glossDetail")
    private Integer f39540k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("opacity")
    private Integer f39541l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("wetness")
    private Integer f39542m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f39543n;

    public /* synthetic */ ku(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, boolean[] zArr, int i13) {
        this(str, num, num2, num3, num4, num5, str2, num6, num7, num8, num9, num10, num11, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ku kuVar = (ku) obj;
        return Objects.equals(this.f39542m, kuVar.f39542m) && Objects.equals(this.f39541l, kuVar.f39541l) && Objects.equals(this.f39540k, kuVar.f39540k) && Objects.equals(this.f39539j, kuVar.f39539j) && Objects.equals(this.f39538i, kuVar.f39538i) && Objects.equals(this.f39537h, kuVar.f39537h) && Objects.equals(this.f39535f, kuVar.f39535f) && Objects.equals(this.f39534e, kuVar.f39534e) && Objects.equals(this.f39533d, kuVar.f39533d) && Objects.equals(this.f39532c, kuVar.f39532c) && Objects.equals(this.f39531b, kuVar.f39531b) && Objects.equals(this.f39530a, kuVar.f39530a) && Objects.equals(this.f39536g, kuVar.f39536g);
    }

    public final int hashCode() {
        return Objects.hash(this.f39530a, this.f39531b, this.f39532c, this.f39533d, this.f39534e, this.f39535f, this.f39536g, this.f39537h, this.f39538i, this.f39539j, this.f39540k, this.f39541l, this.f39542m);
    }

    private ku(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, boolean[] zArr) {
        this.f39530a = str;
        this.f39531b = num;
        this.f39532c = num2;
        this.f39533d = num3;
        this.f39534e = num4;
        this.f39535f = num5;
        this.f39536g = str2;
        this.f39537h = num6;
        this.f39538i = num7;
        this.f39539j = num8;
        this.f39540k = num9;
        this.f39541l = num10;
        this.f39542m = num11;
        this.f39543n = zArr;
    }
}
