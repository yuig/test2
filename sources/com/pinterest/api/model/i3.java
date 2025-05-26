package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.f3;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public String f38611a;

    /* renamed from: b, reason: collision with root package name */
    public String f38612b;

    /* renamed from: c, reason: collision with root package name */
    public m3 f38613c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f38614d;

    /* renamed from: e, reason: collision with root package name */
    public String f38615e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f38616f;

    /* renamed from: g, reason: collision with root package name */
    public Map f38617g;

    /* renamed from: h, reason: collision with root package name */
    public e3 f38618h;

    /* renamed from: i, reason: collision with root package name */
    public f3.a f38619i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f38620j;

    /* renamed from: k, reason: collision with root package name */
    public String f38621k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f38622l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f38623m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f38624n;

    /* renamed from: o, reason: collision with root package name */
    public List f38625o;

    /* renamed from: p, reason: collision with root package name */
    public List f38626p;

    /* renamed from: q, reason: collision with root package name */
    public List f38627q;

    /* renamed from: r, reason: collision with root package name */
    public Double f38628r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f38629s;

    public /* synthetic */ i3(int i13) {
        this();
    }

    public final f3 a() {
        return new f3(this.f38611a, this.f38612b, this.f38613c, this.f38614d, this.f38615e, this.f38616f, this.f38617g, this.f38618h, this.f38619i, this.f38620j, this.f38621k, this.f38622l, this.f38623m, this.f38624n, this.f38625o, this.f38626p, this.f38627q, this.f38628r, this.f38629s, 0);
    }

    public final void b(f3 f3Var) {
        Double d2;
        List list;
        List list2;
        List list3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        Boolean bool4;
        f3.a aVar;
        e3 e3Var;
        Map map;
        Integer num;
        String str2;
        Integer num2;
        m3 m3Var;
        String str3;
        String str4;
        boolean[] zArr = f3Var.f37445s;
        int length = zArr.length;
        boolean[] zArr2 = this.f38629s;
        if (length > 0 && zArr[0]) {
            str4 = f3Var.f37427a;
            this.f38611a = str4;
            zArr2[0] = true;
        }
        boolean[] zArr3 = f3Var.f37445s;
        if (zArr3.length > 1 && zArr3[1]) {
            str3 = f3Var.f37428b;
            this.f38612b = str3;
            zArr2[1] = true;
        }
        if (zArr3.length > 2 && zArr3[2]) {
            m3Var = f3Var.f37429c;
            this.f38613c = m3Var;
            zArr2[2] = true;
        }
        if (zArr3.length > 3 && zArr3[3]) {
            num2 = f3Var.f37430d;
            this.f38614d = num2;
            zArr2[3] = true;
        }
        if (zArr3.length > 4 && zArr3[4]) {
            str2 = f3Var.f37431e;
            this.f38615e = str2;
            zArr2[4] = true;
        }
        if (zArr3.length > 5 && zArr3[5]) {
            num = f3Var.f37432f;
            this.f38616f = num;
            zArr2[5] = true;
        }
        if (zArr3.length > 6 && zArr3[6]) {
            map = f3Var.f37433g;
            this.f38617g = map;
            zArr2[6] = true;
        }
        if (zArr3.length > 7 && zArr3[7]) {
            e3Var = f3Var.f37434h;
            this.f38618h = e3Var;
            zArr2[7] = true;
        }
        if (zArr3.length > 8 && zArr3[8]) {
            aVar = f3Var.f37435i;
            this.f38619i = aVar;
            zArr2[8] = true;
        }
        if (zArr3.length > 9 && zArr3[9]) {
            bool4 = f3Var.f37436j;
            this.f38620j = bool4;
            zArr2[9] = true;
        }
        if (zArr3.length > 10 && zArr3[10]) {
            str = f3Var.f37437k;
            this.f38621k = str;
            zArr2[10] = true;
        }
        if (zArr3.length > 11 && zArr3[11]) {
            bool3 = f3Var.f37438l;
            this.f38622l = bool3;
            zArr2[11] = true;
        }
        if (zArr3.length > 12 && zArr3[12]) {
            bool2 = f3Var.f37439m;
            this.f38623m = bool2;
            zArr2[12] = true;
        }
        if (zArr3.length > 13 && zArr3[13]) {
            bool = f3Var.f37440n;
            this.f38624n = bool;
            zArr2[13] = true;
        }
        if (zArr3.length > 14 && zArr3[14]) {
            list3 = f3Var.f37441o;
            this.f38625o = list3;
            zArr2[14] = true;
        }
        if (zArr3.length > 15 && zArr3[15]) {
            list2 = f3Var.f37442p;
            this.f38626p = list2;
            zArr2[15] = true;
        }
        if (zArr3.length > 16 && zArr3[16]) {
            list = f3Var.f37443q;
            this.f38627q = list;
            zArr2[16] = true;
        }
        if (zArr3.length <= 17 || !zArr3[17]) {
            return;
        }
        d2 = f3Var.f37444r;
        this.f38628r = d2;
        zArr2[17] = true;
    }

    public final void c(Map map) {
        this.f38617g = map;
        boolean[] zArr = this.f38629s;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void d(String str) {
        this.f38621k = str;
        boolean[] zArr = this.f38629s;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    public final void e(List list) {
        this.f38625o = list;
        boolean[] zArr = this.f38629s;
        if (zArr.length > 14) {
            zArr[14] = true;
        }
    }

    public final void f(List list) {
        this.f38626p = list;
        boolean[] zArr = this.f38629s;
        if (zArr.length > 15) {
            zArr[15] = true;
        }
    }

    public final void g(List list) {
        this.f38627q = list;
        boolean[] zArr = this.f38629s;
        if (zArr.length > 16) {
            zArr[16] = true;
        }
    }

    public final void h(Double d2) {
        this.f38628r = d2;
        boolean[] zArr = this.f38629s;
        if (zArr.length > 17) {
            zArr[17] = true;
        }
    }

    public /* synthetic */ i3(f3 f3Var, int i13) {
        this(f3Var);
    }

    private i3() {
        this.f38629s = new boolean[18];
    }

    private i3(@NonNull f3 f3Var) {
        String str;
        String str2;
        m3 m3Var;
        Integer num;
        String str3;
        Integer num2;
        Map map;
        e3 e3Var;
        f3.a aVar;
        Boolean bool;
        String str4;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        List list;
        List list2;
        List list3;
        Double d2;
        str = f3Var.f37427a;
        this.f38611a = str;
        str2 = f3Var.f37428b;
        this.f38612b = str2;
        m3Var = f3Var.f37429c;
        this.f38613c = m3Var;
        num = f3Var.f37430d;
        this.f38614d = num;
        str3 = f3Var.f37431e;
        this.f38615e = str3;
        num2 = f3Var.f37432f;
        this.f38616f = num2;
        map = f3Var.f37433g;
        this.f38617g = map;
        e3Var = f3Var.f37434h;
        this.f38618h = e3Var;
        aVar = f3Var.f37435i;
        this.f38619i = aVar;
        bool = f3Var.f37436j;
        this.f38620j = bool;
        str4 = f3Var.f37437k;
        this.f38621k = str4;
        bool2 = f3Var.f37438l;
        this.f38622l = bool2;
        bool3 = f3Var.f37439m;
        this.f38623m = bool3;
        bool4 = f3Var.f37440n;
        this.f38624n = bool4;
        list = f3Var.f37441o;
        this.f38625o = list;
        list2 = f3Var.f37442p;
        this.f38626p = list2;
        list3 = f3Var.f37443q;
        this.f38627q = list3;
        d2 = f3Var.f37444r;
        this.f38628r = d2;
        boolean[] zArr = f3Var.f37445s;
        this.f38629s = Arrays.copyOf(zArr, zArr.length);
    }
}
