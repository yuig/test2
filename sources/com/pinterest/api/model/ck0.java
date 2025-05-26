package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.dk0;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class ck0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36444a;

    /* renamed from: b, reason: collision with root package name */
    public String f36445b;

    /* renamed from: c, reason: collision with root package name */
    public Map f36446c;

    /* renamed from: d, reason: collision with root package name */
    public String f36447d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f36448e;

    /* renamed from: f, reason: collision with root package name */
    public dk0.a f36449f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f36450g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f36451h;

    /* renamed from: i, reason: collision with root package name */
    public String f36452i;

    /* renamed from: j, reason: collision with root package name */
    public dk0.b f36453j;

    /* renamed from: k, reason: collision with root package name */
    public String f36454k;

    /* renamed from: l, reason: collision with root package name */
    public String f36455l;

    /* renamed from: m, reason: collision with root package name */
    public wy0 f36456m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f36457n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f36458o;

    public /* synthetic */ ck0(int i13) {
        this();
    }

    public final void a(Map map) {
        this.f36446c = map;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void b(String str) {
        this.f36447d = str;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void c(Integer num) {
        this.f36448e = num;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void d(dk0.a aVar) {
        this.f36449f = aVar;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void e(String str) {
        this.f36445b = str;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void f(Integer num) {
        this.f36450g = num;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void g(Integer num) {
        this.f36451h = num;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void h(String str) {
        this.f36452i = str;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void i(dk0.b bVar) {
        this.f36453j = bVar;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    public final void j(String str) {
        this.f36454k = str;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    public final void k(String str) {
        this.f36444a = str;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void l(String str) {
        this.f36455l = str;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    public final void m(wy0 wy0Var) {
        this.f36456m = wy0Var;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 12) {
            zArr[12] = true;
        }
    }

    public final void n(Integer num) {
        this.f36457n = num;
        boolean[] zArr = this.f36458o;
        if (zArr.length > 13) {
            zArr[13] = true;
        }
    }

    private ck0() {
        this.f36458o = new boolean[14];
    }

    private ck0(@NonNull dk0 dk0Var) {
        String str;
        String str2;
        Map map;
        String str3;
        Integer num;
        dk0.a aVar;
        Integer num2;
        Integer num3;
        String str4;
        dk0.b bVar;
        String str5;
        String str6;
        wy0 wy0Var;
        Integer num4;
        str = dk0Var.f36862a;
        this.f36444a = str;
        str2 = dk0Var.f36863b;
        this.f36445b = str2;
        map = dk0Var.f36864c;
        this.f36446c = map;
        str3 = dk0Var.f36865d;
        this.f36447d = str3;
        num = dk0Var.f36866e;
        this.f36448e = num;
        aVar = dk0Var.f36867f;
        this.f36449f = aVar;
        num2 = dk0Var.f36868g;
        this.f36450g = num2;
        num3 = dk0Var.f36869h;
        this.f36451h = num3;
        str4 = dk0Var.f36870i;
        this.f36452i = str4;
        bVar = dk0Var.f36871j;
        this.f36453j = bVar;
        str5 = dk0Var.f36872k;
        this.f36454k = str5;
        str6 = dk0Var.f36873l;
        this.f36455l = str6;
        wy0Var = dk0Var.f36874m;
        this.f36456m = wy0Var;
        num4 = dk0Var.f36875n;
        this.f36457n = num4;
        boolean[] zArr = dk0Var.f36876o;
        this.f36458o = Arrays.copyOf(zArr, zArr.length);
    }
}
