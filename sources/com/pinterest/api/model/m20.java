package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class m20 {

    /* renamed from: a, reason: collision with root package name */
    public String f39977a;

    /* renamed from: b, reason: collision with root package name */
    public String f39978b;

    /* renamed from: c, reason: collision with root package name */
    public String f39979c;

    /* renamed from: d, reason: collision with root package name */
    public List f39980d;

    /* renamed from: e, reason: collision with root package name */
    public String f39981e;

    /* renamed from: f, reason: collision with root package name */
    public String f39982f;

    /* renamed from: g, reason: collision with root package name */
    public List f39983g;

    /* renamed from: h, reason: collision with root package name */
    public String f39984h;

    /* renamed from: i, reason: collision with root package name */
    public String f39985i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f39986j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f39987k;

    public /* synthetic */ m20(int i13) {
        this();
    }

    public final p20 a() {
        return new p20(this.f39977a, this.f39978b, this.f39979c, this.f39980d, this.f39981e, this.f39982f, this.f39983g, this.f39984h, this.f39985i, this.f39986j, this.f39987k, 0);
    }

    public /* synthetic */ m20(p20 p20Var, int i13) {
        this(p20Var);
    }

    private m20() {
        this.f39987k = new boolean[10];
    }

    private m20(@NonNull p20 p20Var) {
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        String str5;
        List list2;
        String str6;
        String str7;
        Integer num;
        str = p20Var.f40857a;
        this.f39977a = str;
        str2 = p20Var.f40858b;
        this.f39978b = str2;
        str3 = p20Var.f40859c;
        this.f39979c = str3;
        list = p20Var.f40860d;
        this.f39980d = list;
        str4 = p20Var.f40861e;
        this.f39981e = str4;
        str5 = p20Var.f40862f;
        this.f39982f = str5;
        list2 = p20Var.f40863g;
        this.f39983g = list2;
        str6 = p20Var.f40864h;
        this.f39984h = str6;
        str7 = p20Var.f40865i;
        this.f39985i = str7;
        num = p20Var.f40866j;
        this.f39986j = num;
        boolean[] zArr = p20Var.f40867k;
        this.f39987k = Arrays.copyOf(zArr, zArr.length);
    }
}
