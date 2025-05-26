package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d00 {

    /* renamed from: a, reason: collision with root package name */
    public String f36596a;

    /* renamed from: b, reason: collision with root package name */
    public String f36597b;

    /* renamed from: c, reason: collision with root package name */
    public k00 f36598c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f36599d;

    /* renamed from: e, reason: collision with root package name */
    public Map f36600e;

    /* renamed from: f, reason: collision with root package name */
    public o00 f36601f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f36602g;

    /* renamed from: h, reason: collision with root package name */
    public String f36603h;

    /* renamed from: i, reason: collision with root package name */
    public String f36604i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f36605j;

    public /* synthetic */ d00(int i13) {
        this();
    }

    public final g00 a() {
        return new g00(this.f36596a, this.f36597b, this.f36598c, this.f36599d, this.f36600e, this.f36601f, this.f36602g, this.f36603h, this.f36604i, this.f36605j, 0);
    }

    public final void b(k00 k00Var) {
        this.f36598c = k00Var;
        boolean[] zArr = this.f36605j;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(o00 o00Var) {
        this.f36601f = o00Var;
        boolean[] zArr = this.f36605j;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public /* synthetic */ d00(g00 g00Var, int i13) {
        this(g00Var);
    }

    private d00() {
        this.f36605j = new boolean[9];
    }

    private d00(@NonNull g00 g00Var) {
        String str;
        String str2;
        k00 k00Var;
        Integer num;
        Map map;
        o00 o00Var;
        Integer num2;
        String str3;
        String str4;
        str = g00Var.f37889a;
        this.f36596a = str;
        str2 = g00Var.f37890b;
        this.f36597b = str2;
        k00Var = g00Var.f37891c;
        this.f36598c = k00Var;
        num = g00Var.f37892d;
        this.f36599d = num;
        map = g00Var.f37893e;
        this.f36600e = map;
        o00Var = g00Var.f37894f;
        this.f36601f = o00Var;
        num2 = g00Var.f37895g;
        this.f36602g = num2;
        str3 = g00Var.f37896h;
        this.f36603h = str3;
        str4 = g00Var.f37897i;
        this.f36604i = str4;
        boolean[] zArr = g00Var.f37898j;
        this.f36605j = Arrays.copyOf(zArr, zArr.length);
    }
}
