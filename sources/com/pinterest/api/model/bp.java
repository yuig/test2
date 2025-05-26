package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class bp {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f36144a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f36145b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("end_time")
    private Double f36146c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("error_message")
    private String f36147d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("interactive_sticker_type")
    private Integer f36148e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_valid")
    private Boolean f36149f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("start_time")
    private Double f36150g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("sticker_data")
    private yo f36151h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("sticker_type")
    private Map<String, Object> f36152i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    @om.b("type")
    private String f36153j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f36154k;

    public /* synthetic */ bp(Integer num, zk0 zk0Var, Double d2, String str, Integer num2, Boolean bool, Double d13, yo yoVar, Map map, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, d2, str, num2, bool, d13, yoVar, map, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bp bpVar = (bp) obj;
        return Objects.equals(this.f36150g, bpVar.f36150g) && Objects.equals(this.f36149f, bpVar.f36149f) && Objects.equals(this.f36148e, bpVar.f36148e) && Objects.equals(this.f36146c, bpVar.f36146c) && Objects.equals(this.f36144a, bpVar.f36144a) && Objects.equals(this.f36145b, bpVar.f36145b) && Objects.equals(this.f36147d, bpVar.f36147d) && Objects.equals(this.f36151h, bpVar.f36151h) && Objects.equals(this.f36152i, bpVar.f36152i) && Objects.equals(this.f36153j, bpVar.f36153j);
    }

    public final int hashCode() {
        return Objects.hash(this.f36144a, this.f36145b, this.f36146c, this.f36147d, this.f36148e, this.f36149f, this.f36150g, this.f36151h, this.f36152i, this.f36153j);
    }

    public final zk0 k() {
        return this.f36145b;
    }

    public final Double l() {
        Double d2 = this.f36146c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String m() {
        return this.f36147d;
    }

    public final Integer n() {
        Integer num = this.f36148e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean o() {
        Boolean bool = this.f36149f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Double p() {
        Double d2 = this.f36150g;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final yo q() {
        return this.f36151h;
    }

    public bp() {
        this.f36154k = new boolean[10];
    }

    private bp(Integer num, zk0 zk0Var, Double d2, String str, Integer num2, Boolean bool, Double d13, yo yoVar, Map<String, Object> map, @NonNull String str2, boolean[] zArr) {
        this.f36144a = num;
        this.f36145b = zk0Var;
        this.f36146c = d2;
        this.f36147d = str;
        this.f36148e = num2;
        this.f36149f = bool;
        this.f36150g = d13;
        this.f36151h = yoVar;
        this.f36152i = map;
        this.f36153j = str2;
        this.f36154k = zArr;
    }
}
