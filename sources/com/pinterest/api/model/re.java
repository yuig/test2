package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class re {

    /* renamed from: a, reason: collision with root package name */
    public String f41557a;

    /* renamed from: b, reason: collision with root package name */
    public String f41558b;

    /* renamed from: c, reason: collision with root package name */
    public List f41559c;

    /* renamed from: d, reason: collision with root package name */
    public List f41560d;

    /* renamed from: e, reason: collision with root package name */
    public Date f41561e;

    /* renamed from: f, reason: collision with root package name */
    public List f41562f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f41563g;

    /* renamed from: h, reason: collision with root package name */
    public mv f41564h;

    /* renamed from: i, reason: collision with root package name */
    public String f41565i;

    /* renamed from: j, reason: collision with root package name */
    public String f41566j;

    /* renamed from: k, reason: collision with root package name */
    public Map f41567k;

    /* renamed from: l, reason: collision with root package name */
    public Map f41568l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f41569m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f41570n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f41571o;

    /* renamed from: p, reason: collision with root package name */
    public List f41572p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f41573q;

    public /* synthetic */ re(int i13) {
        this();
    }

    public final ue a() {
        return new ue(this.f41557a, this.f41558b, this.f41559c, this.f41560d, this.f41561e, this.f41562f, this.f41563g, this.f41564h, this.f41565i, this.f41566j, this.f41567k, this.f41568l, this.f41569m, this.f41570n, this.f41571o, this.f41572p, this.f41573q, 0);
    }

    public final void b(ue ueVar) {
        List list;
        Integer num;
        Integer num2;
        Integer num3;
        Map map;
        Map map2;
        String str;
        String str2;
        mv mvVar;
        Boolean bool;
        List list2;
        Date date;
        List list3;
        List list4;
        String str3;
        String str4;
        boolean[] zArr = ueVar.f42540q;
        int length = zArr.length;
        boolean[] zArr2 = this.f41573q;
        if (length > 0 && zArr[0]) {
            str4 = ueVar.f42524a;
            this.f41557a = str4;
            zArr2[0] = true;
        }
        boolean[] zArr3 = ueVar.f42540q;
        if (zArr3.length > 1 && zArr3[1]) {
            str3 = ueVar.f42525b;
            this.f41558b = str3;
            zArr2[1] = true;
        }
        if (zArr3.length > 2 && zArr3[2]) {
            list4 = ueVar.f42526c;
            this.f41559c = list4;
            zArr2[2] = true;
        }
        if (zArr3.length > 3 && zArr3[3]) {
            list3 = ueVar.f42527d;
            this.f41560d = list3;
            zArr2[3] = true;
        }
        if (zArr3.length > 4 && zArr3[4]) {
            date = ueVar.f42528e;
            this.f41561e = date;
            zArr2[4] = true;
        }
        if (zArr3.length > 5 && zArr3[5]) {
            list2 = ueVar.f42529f;
            this.f41562f = list2;
            zArr2[5] = true;
        }
        if (zArr3.length > 6 && zArr3[6]) {
            bool = ueVar.f42530g;
            this.f41563g = bool;
            zArr2[6] = true;
        }
        if (zArr3.length > 7 && zArr3[7]) {
            mvVar = ueVar.f42531h;
            this.f41564h = mvVar;
            zArr2[7] = true;
        }
        if (zArr3.length > 8 && zArr3[8]) {
            str2 = ueVar.f42532i;
            this.f41565i = str2;
            zArr2[8] = true;
        }
        if (zArr3.length > 9 && zArr3[9]) {
            str = ueVar.f42533j;
            this.f41566j = str;
            zArr2[9] = true;
        }
        if (zArr3.length > 10 && zArr3[10]) {
            map2 = ueVar.f42534k;
            this.f41567k = map2;
            zArr2[10] = true;
        }
        if (zArr3.length > 11 && zArr3[11]) {
            map = ueVar.f42535l;
            this.f41568l = map;
            zArr2[11] = true;
        }
        if (zArr3.length > 12 && zArr3[12]) {
            num3 = ueVar.f42536m;
            this.f41569m = num3;
            zArr2[12] = true;
        }
        if (zArr3.length > 13 && zArr3[13]) {
            num2 = ueVar.f42537n;
            this.f41570n = num2;
            zArr2[13] = true;
        }
        if (zArr3.length > 14 && zArr3[14]) {
            num = ueVar.f42538o;
            this.f41571o = num;
            zArr2[14] = true;
        }
        if (zArr3.length <= 15 || !zArr3[15]) {
            return;
        }
        list = ueVar.f42539p;
        this.f41572p = list;
        zArr2[15] = true;
    }

    public final void c(List list) {
        this.f41560d = list;
        boolean[] zArr = this.f41573q;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void d(List list) {
        this.f41562f = list;
        boolean[] zArr = this.f41573q;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void e(mv mvVar) {
        this.f41564h = mvVar;
        boolean[] zArr = this.f41573q;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void f(Map map) {
        this.f41568l = map;
        boolean[] zArr = this.f41573q;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    public final void g(List list) {
        this.f41572p = list;
        boolean[] zArr = this.f41573q;
        if (zArr.length > 15) {
            zArr[15] = true;
        }
    }

    public /* synthetic */ re(ue ueVar, int i13) {
        this(ueVar);
    }

    private re() {
        this.f41573q = new boolean[16];
    }

    private re(@NonNull ue ueVar) {
        String str;
        String str2;
        List list;
        List list2;
        Date date;
        List list3;
        Boolean bool;
        mv mvVar;
        String str3;
        String str4;
        Map map;
        Map map2;
        Integer num;
        Integer num2;
        Integer num3;
        List list4;
        str = ueVar.f42524a;
        this.f41557a = str;
        str2 = ueVar.f42525b;
        this.f41558b = str2;
        list = ueVar.f42526c;
        this.f41559c = list;
        list2 = ueVar.f42527d;
        this.f41560d = list2;
        date = ueVar.f42528e;
        this.f41561e = date;
        list3 = ueVar.f42529f;
        this.f41562f = list3;
        bool = ueVar.f42530g;
        this.f41563g = bool;
        mvVar = ueVar.f42531h;
        this.f41564h = mvVar;
        str3 = ueVar.f42532i;
        this.f41565i = str3;
        str4 = ueVar.f42533j;
        this.f41566j = str4;
        map = ueVar.f42534k;
        this.f41567k = map;
        map2 = ueVar.f42535l;
        this.f41568l = map2;
        num = ueVar.f42536m;
        this.f41569m = num;
        num2 = ueVar.f42537n;
        this.f41570n = num2;
        num3 = ueVar.f42538o;
        this.f41571o = num3;
        list4 = ueVar.f42539p;
        this.f41572p = list4;
        boolean[] zArr = ueVar.f42540q;
        this.f41573q = Arrays.copyOf(zArr, zArr.length);
    }
}
