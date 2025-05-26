package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public String f43878a;

    /* renamed from: b, reason: collision with root package name */
    public String f43879b;

    /* renamed from: c, reason: collision with root package name */
    public f30 f43880c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f43881d;

    /* renamed from: e, reason: collision with root package name */
    public f30 f43882e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f43883f;

    /* renamed from: g, reason: collision with root package name */
    public Date f43884g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f43885h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f43886i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f43887j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f43888k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f43889l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f43890m;

    /* renamed from: n, reason: collision with root package name */
    public sd f43891n;

    /* renamed from: o, reason: collision with root package name */
    public f30 f43892o;

    /* renamed from: p, reason: collision with root package name */
    public String f43893p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f43894q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f43895r;

    /* renamed from: s, reason: collision with root package name */
    public Map f43896s;

    /* renamed from: t, reason: collision with root package name */
    public List f43897t;

    /* renamed from: u, reason: collision with root package name */
    public List f43898u;

    /* renamed from: v, reason: collision with root package name */
    public List f43899v;

    /* renamed from: w, reason: collision with root package name */
    public String f43900w;

    /* renamed from: x, reason: collision with root package name */
    public String f43901x;

    /* renamed from: y, reason: collision with root package name */
    public wy0 f43902y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f43903z;

    public /* synthetic */ y2(int i13) {
        this();
    }

    public final z2 a() {
        return new z2(this.f43878a, this.f43879b, this.f43880c, this.f43881d, this.f43882e, this.f43883f, this.f43884g, this.f43885h, this.f43886i, this.f43887j, this.f43888k, this.f43889l, this.f43890m, this.f43891n, this.f43892o, this.f43893p, this.f43894q, this.f43895r, this.f43896s, this.f43897t, this.f43898u, this.f43899v, this.f43900w, this.f43901x, this.f43902y, this.f43903z, 0);
    }

    public final void b(Integer num) {
        this.f43881d = num;
        boolean[] zArr = this.f43903z;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public /* synthetic */ y2(z2 z2Var, int i13) {
        this(z2Var);
    }

    private y2() {
        this.f43903z = new boolean[25];
    }

    private y2(@NonNull z2 z2Var) {
        String str;
        String str2;
        f30 f30Var;
        Integer num;
        f30 f30Var2;
        Integer num2;
        Date date;
        Integer num3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        sd sdVar;
        f30 f30Var3;
        String str3;
        Boolean bool6;
        Integer num4;
        Map map;
        List list;
        List list2;
        List list3;
        String str4;
        String str5;
        wy0 wy0Var;
        str = z2Var.f44177a;
        this.f43878a = str;
        str2 = z2Var.f44178b;
        this.f43879b = str2;
        f30Var = z2Var.f44179c;
        this.f43880c = f30Var;
        num = z2Var.f44180d;
        this.f43881d = num;
        f30Var2 = z2Var.f44181e;
        this.f43882e = f30Var2;
        num2 = z2Var.f44182f;
        this.f43883f = num2;
        date = z2Var.f44183g;
        this.f43884g = date;
        num3 = z2Var.f44184h;
        this.f43885h = num3;
        bool = z2Var.f44185i;
        this.f43886i = bool;
        bool2 = z2Var.f44186j;
        this.f43887j = bool2;
        bool3 = z2Var.f44187k;
        this.f43888k = bool3;
        bool4 = z2Var.f44188l;
        this.f43889l = bool4;
        bool5 = z2Var.f44189m;
        this.f43890m = bool5;
        sdVar = z2Var.f44190n;
        this.f43891n = sdVar;
        f30Var3 = z2Var.f44191o;
        this.f43892o = f30Var3;
        str3 = z2Var.f44192p;
        this.f43893p = str3;
        bool6 = z2Var.f44193q;
        this.f43894q = bool6;
        num4 = z2Var.f44194r;
        this.f43895r = num4;
        map = z2Var.f44195s;
        this.f43896s = map;
        list = z2Var.f44196t;
        this.f43897t = list;
        list2 = z2Var.f44197u;
        this.f43898u = list2;
        list3 = z2Var.f44198v;
        this.f43899v = list3;
        str4 = z2Var.f44199w;
        this.f43900w = str4;
        str5 = z2Var.f44200x;
        this.f43901x = str5;
        wy0Var = z2Var.f44201y;
        this.f43902y = wy0Var;
        boolean[] zArr = z2Var.f44202z;
        this.f43903z = Arrays.copyOf(zArr, zArr.length);
    }
}
