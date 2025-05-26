package ek1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59300i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f59301j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u50.n f59302k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f59303l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f59304m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u50.n f59305n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u50.n f59306o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f59307p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f59308q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ cs.c f59309r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v1 f59310s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(int i13, ArrayList arrayList, u50.n nVar, boolean z13, int i14, u50.n nVar2, u50.n nVar3, boolean z14, boolean z15, cs.c cVar, v1 v1Var) {
        super(1);
        this.f59300i = i13;
        this.f59301j = arrayList;
        this.f59302k = nVar;
        this.f59303l = z13;
        this.f59304m = i14;
        this.f59305n = nVar2;
        this.f59306o = nVar3;
        this.f59307p = z14;
        this.f59308q = z15;
        this.f59309r = cVar;
        this.f59310s = v1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r state = (r) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        return r.e(state, CollectionsKt.m0(new zi1.c(this.f59300i, new zi1.e(this.f59301j, this.f59302k, this.f59303l, this.f59304m, this.f59305n, this.f59306o, this.f59307p, this.f59308q), this.f59309r, ((s1) this.f59310s).f59372e), state.f59328a), null, null, false, null, 30);
    }
}
