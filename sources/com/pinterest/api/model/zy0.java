package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.az0;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zy0 {

    /* renamed from: a, reason: collision with root package name */
    public String f44509a;

    /* renamed from: b, reason: collision with root package name */
    public String f44510b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f44511c;

    /* renamed from: d, reason: collision with root package name */
    public String f44512d;

    /* renamed from: e, reason: collision with root package name */
    public az0.a f44513e;

    /* renamed from: f, reason: collision with root package name */
    public String f44514f;

    /* renamed from: g, reason: collision with root package name */
    public Date f44515g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f44516h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f44517i;

    /* renamed from: j, reason: collision with root package name */
    public List f44518j;

    /* renamed from: k, reason: collision with root package name */
    public List f44519k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f44520l;

    /* renamed from: m, reason: collision with root package name */
    public List f44521m;

    /* renamed from: n, reason: collision with root package name */
    public f30 f44522n;

    /* renamed from: o, reason: collision with root package name */
    public az0.b f44523o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f44524p;

    /* renamed from: q, reason: collision with root package name */
    public Map f44525q;

    /* renamed from: r, reason: collision with root package name */
    public Double f44526r;

    /* renamed from: s, reason: collision with root package name */
    public Map f44527s;

    /* renamed from: t, reason: collision with root package name */
    public List f44528t;

    /* renamed from: u, reason: collision with root package name */
    public String f44529u;

    /* renamed from: v, reason: collision with root package name */
    public wy0 f44530v;

    /* renamed from: w, reason: collision with root package name */
    public List f44531w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f44532x;

    public /* synthetic */ zy0(int i13) {
        this();
    }

    public final az0 a() {
        return new az0(this.f44509a, this.f44510b, this.f44511c, this.f44512d, this.f44513e, this.f44514f, this.f44515g, this.f44516h, this.f44517i, this.f44518j, this.f44519k, this.f44520l, this.f44521m, this.f44522n, this.f44523o, this.f44524p, this.f44525q, this.f44526r, this.f44527s, this.f44528t, this.f44529u, this.f44530v, this.f44531w, this.f44532x, 0);
    }

    public final void b(Integer num) {
        this.f44511c = num;
        boolean[] zArr = this.f44532x;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public /* synthetic */ zy0(az0 az0Var, int i13) {
        this(az0Var);
    }

    private zy0() {
        this.f44532x = new boolean[23];
    }

    private zy0(@NonNull az0 az0Var) {
        String str;
        String str2;
        Integer num;
        String str3;
        az0.a aVar;
        String str4;
        Date date;
        Integer num2;
        Boolean bool;
        List list;
        List list2;
        Boolean bool2;
        List list3;
        f30 f30Var;
        az0.b bVar;
        Integer num3;
        Map map;
        Double d2;
        Map map2;
        List list4;
        String str5;
        wy0 wy0Var;
        List list5;
        str = az0Var.f35907a;
        this.f44509a = str;
        str2 = az0Var.f35908b;
        this.f44510b = str2;
        num = az0Var.f35909c;
        this.f44511c = num;
        str3 = az0Var.f35910d;
        this.f44512d = str3;
        aVar = az0Var.f35911e;
        this.f44513e = aVar;
        str4 = az0Var.f35912f;
        this.f44514f = str4;
        date = az0Var.f35913g;
        this.f44515g = date;
        num2 = az0Var.f35914h;
        this.f44516h = num2;
        bool = az0Var.f35915i;
        this.f44517i = bool;
        list = az0Var.f35916j;
        this.f44518j = list;
        list2 = az0Var.f35917k;
        this.f44519k = list2;
        bool2 = az0Var.f35918l;
        this.f44520l = bool2;
        list3 = az0Var.f35919m;
        this.f44521m = list3;
        f30Var = az0Var.f35920n;
        this.f44522n = f30Var;
        bVar = az0Var.f35921o;
        this.f44523o = bVar;
        num3 = az0Var.f35922p;
        this.f44524p = num3;
        map = az0Var.f35923q;
        this.f44525q = map;
        d2 = az0Var.f35924r;
        this.f44526r = d2;
        map2 = az0Var.f35925s;
        this.f44527s = map2;
        list4 = az0Var.f35926t;
        this.f44528t = list4;
        str5 = az0Var.f35927u;
        this.f44529u = str5;
        wy0Var = az0Var.f35928v;
        this.f44530v = wy0Var;
        list5 = az0Var.f35929w;
        this.f44531w = list5;
        boolean[] zArr = az0Var.f35930x;
        this.f44532x = Arrays.copyOf(zArr, zArr.length);
    }
}
