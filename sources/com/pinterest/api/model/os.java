package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class os {

    /* renamed from: a, reason: collision with root package name */
    public List f40787a;

    /* renamed from: b, reason: collision with root package name */
    public List f40788b;

    /* renamed from: c, reason: collision with root package name */
    public ns f40789c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f40790d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f40791e;

    /* renamed from: f, reason: collision with root package name */
    public List f40792f;

    /* renamed from: g, reason: collision with root package name */
    public List f40793g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f40794h;

    public /* synthetic */ os(int i13) {
        this();
    }

    private os() {
        this.f40794h = new boolean[7];
    }

    private os(@NonNull rs rsVar) {
        List list;
        List list2;
        ns nsVar;
        Boolean bool;
        Boolean bool2;
        List list3;
        List list4;
        list = rsVar.f41653a;
        this.f40787a = list;
        list2 = rsVar.f41654b;
        this.f40788b = list2;
        nsVar = rsVar.f41655c;
        this.f40789c = nsVar;
        bool = rsVar.f41656d;
        this.f40790d = bool;
        bool2 = rsVar.f41657e;
        this.f40791e = bool2;
        list3 = rsVar.f41658f;
        this.f40792f = list3;
        list4 = rsVar.f41659g;
        this.f40793g = list4;
        boolean[] zArr = rsVar.f41660h;
        this.f40794h = Arrays.copyOf(zArr, zArr.length);
    }
}
