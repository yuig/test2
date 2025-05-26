package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class oo0 {

    /* renamed from: a, reason: collision with root package name */
    public f30 f40760a;

    /* renamed from: b, reason: collision with root package name */
    public List f40761b;

    /* renamed from: c, reason: collision with root package name */
    public String f40762c;

    /* renamed from: d, reason: collision with root package name */
    public om0 f40763d;

    /* renamed from: e, reason: collision with root package name */
    public om0 f40764e;

    /* renamed from: f, reason: collision with root package name */
    public String f40765f;

    /* renamed from: g, reason: collision with root package name */
    public String f40766g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f40767h;

    /* renamed from: i, reason: collision with root package name */
    public List f40768i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f40769j;

    /* renamed from: k, reason: collision with root package name */
    public ep0 f40770k;

    /* renamed from: l, reason: collision with root package name */
    public String f40771l;

    /* renamed from: m, reason: collision with root package name */
    public vq0 f40772m;

    /* renamed from: n, reason: collision with root package name */
    public String f40773n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f40774o;

    public /* synthetic */ oo0(int i13) {
        this();
    }

    public final uo0 a() {
        return new uo0(this.f40760a, this.f40761b, this.f40762c, this.f40763d, this.f40764e, this.f40765f, this.f40766g, this.f40767h, this.f40768i, this.f40769j, this.f40770k, this.f40771l, this.f40772m, this.f40773n, this.f40774o, 0);
    }

    public final void b(f30 f30Var) {
        this.f40760a = f30Var;
        boolean[] zArr = this.f40774o;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(List list) {
        this.f40761b = list;
        boolean[] zArr = this.f40774o;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public /* synthetic */ oo0(uo0 uo0Var, int i13) {
        this(uo0Var);
    }

    private oo0() {
        this.f40774o = new boolean[14];
    }

    private oo0(@NonNull uo0 uo0Var) {
        f30 f30Var;
        List list;
        String str;
        om0 om0Var;
        om0 om0Var2;
        String str2;
        String str3;
        Integer num;
        List list2;
        Boolean bool;
        ep0 ep0Var;
        String str4;
        vq0 vq0Var;
        String str5;
        f30Var = uo0Var.f42606a;
        this.f40760a = f30Var;
        list = uo0Var.f42607b;
        this.f40761b = list;
        str = uo0Var.f42608c;
        this.f40762c = str;
        om0Var = uo0Var.f42609d;
        this.f40763d = om0Var;
        om0Var2 = uo0Var.f42610e;
        this.f40764e = om0Var2;
        str2 = uo0Var.f42611f;
        this.f40765f = str2;
        str3 = uo0Var.f42612g;
        this.f40766g = str3;
        num = uo0Var.f42613h;
        this.f40767h = num;
        list2 = uo0Var.f42614i;
        this.f40768i = list2;
        bool = uo0Var.f42615j;
        this.f40769j = bool;
        ep0Var = uo0Var.f42616k;
        this.f40770k = ep0Var;
        str4 = uo0Var.f42617l;
        this.f40771l = str4;
        vq0Var = uo0Var.f42618m;
        this.f40772m = vq0Var;
        str5 = uo0Var.f42619n;
        this.f40773n = str5;
        boolean[] zArr = uo0Var.f42620o;
        this.f40774o = Arrays.copyOf(zArr, zArr.length);
    }
}
