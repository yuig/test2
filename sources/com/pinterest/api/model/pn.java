package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pn {

    /* renamed from: a, reason: collision with root package name */
    public String f41028a;

    /* renamed from: b, reason: collision with root package name */
    public Map f41029b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f41030c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41031d;

    public /* synthetic */ pn(int i13) {
        this();
    }

    private pn() {
        this.f41031d = new boolean[3];
    }

    private pn(@NonNull sn snVar) {
        String str;
        Map map;
        Boolean bool;
        str = snVar.f41944a;
        this.f41028a = str;
        map = snVar.f41945b;
        this.f41029b = map;
        bool = snVar.f41946c;
        this.f41030c = bool;
        boolean[] zArr = snVar.f41947d;
        this.f41031d = Arrays.copyOf(zArr, zArr.length);
    }
}
