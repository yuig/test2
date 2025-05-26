package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vo {

    /* renamed from: a, reason: collision with root package name */
    public Integer f42932a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f42933b;

    /* renamed from: c, reason: collision with root package name */
    public Double f42934c;

    /* renamed from: d, reason: collision with root package name */
    public String f42935d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f42936e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f42937f;

    /* renamed from: g, reason: collision with root package name */
    public Double f42938g;

    /* renamed from: h, reason: collision with root package name */
    public yo f42939h;

    /* renamed from: i, reason: collision with root package name */
    public Map f42940i;

    /* renamed from: j, reason: collision with root package name */
    public String f42941j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f42942k;

    public /* synthetic */ vo(int i13) {
        this();
    }

    private vo() {
        this.f42942k = new boolean[10];
    }

    private vo(@NonNull bp bpVar) {
        Integer num;
        zk0 zk0Var;
        Double d2;
        String str;
        Integer num2;
        Boolean bool;
        Double d13;
        yo yoVar;
        Map map;
        String str2;
        num = bpVar.f36144a;
        this.f42932a = num;
        zk0Var = bpVar.f36145b;
        this.f42933b = zk0Var;
        d2 = bpVar.f36146c;
        this.f42934c = d2;
        str = bpVar.f36147d;
        this.f42935d = str;
        num2 = bpVar.f36148e;
        this.f42936e = num2;
        bool = bpVar.f36149f;
        this.f42937f = bool;
        d13 = bpVar.f36150g;
        this.f42938g = d13;
        yoVar = bpVar.f36151h;
        this.f42939h = yoVar;
        map = bpVar.f36152i;
        this.f42940i = map;
        str2 = bpVar.f36153j;
        this.f42941j = str2;
        boolean[] zArr = bpVar.f36154k;
        this.f42942k = Arrays.copyOf(zArr, zArr.length);
    }
}
