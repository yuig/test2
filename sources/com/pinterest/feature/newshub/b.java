package com.pinterest.feature.newshub;

import c71.b0;
import df.j1;
import h32.f1;
import h32.g0;
import h32.n1;
import h32.u1;
import h32.v0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import q42.f;
import vv1.n;

/* loaded from: classes5.dex */
public final class b extends tq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46781c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f46782d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f46783e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f46784f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(nx.d0 r3, h32.f1 r4) {
        /*
            r2 = this;
            pb0.g r0 = pb0.g.f99432a
            r1 = 0
            r2.f46781c = r1
            java.lang.String r1 = "clock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            r2.<init>(r0, r3)
            r2.f46783e = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f46782d = r3
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r2.f46784f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.newshub.b.<init>(nx.d0, h32.f1):void");
    }

    @Override // tq0.b
    public final void i() {
        ArrayList arrayList = this.f46782d;
        switch (this.f46781c) {
            case 0:
                arrayList.clear();
                ((Set) this.f46784f).clear();
                break;
            default:
                arrayList.clear();
                break;
        }
    }

    @Override // tq0.b
    public final void l(Object impression) {
        String str;
        ArrayList arrayList = this.f46782d;
        switch (this.f46781c) {
            case 0:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (impression instanceof n1) {
                    if (((f1) this.f46783e) != f1.NEWS_HUB_DETAIL_IMPRESSION_ONE_PIXEL || (str = ((n1) impression).f67152a) == null || ((Set) this.f46784f).add(str)) {
                        arrayList.add(impression);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (!(impression instanceof u1)) {
                    if (impression instanceof n) {
                        arrayList.add(impression);
                        break;
                    }
                } else {
                    arrayList.add(new n((u1) impression, null));
                    break;
                }
                break;
        }
    }

    @Override // tq0.b
    public final void p() {
        b0 b0Var;
        String str;
        b0 b0Var2;
        ArrayList arrayList = this.f46782d;
        int i13 = this.f46781c;
        d0 d0Var = this.f118989b;
        Object obj = this.f46783e;
        switch (i13) {
            case 0:
                if (!arrayList.isEmpty()) {
                    d0Var.Q((f1) obj, CollectionsKt.H0(arrayList));
                    break;
                }
                break;
            default:
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n nVar = (n) it.next();
                        u1 u1Var = nVar.f126792a;
                        HashMap hashMap = nVar.f126793b;
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        v0 v0Var = new v0();
                        v0Var.G = u1Var != null ? u1Var.f67275g : null;
                        Short sh3 = u1Var.f67273e;
                        this.f46784f = (sh3 == null || sh3.shortValue() != f.STRUCTURED_GUIDE.getValue()) ? g0.ONEBAR_MODULE : g0.ONEBAR_DRAWER;
                        Function0 function0 = (Function0) obj;
                        b0 b0Var3 = (b0) function0.invoke();
                        String str2 = b0Var3 != null ? b0Var3.f26731c : null;
                        String str3 = "";
                        if (!j1.U0(str2) ? !((b0Var = (b0) function0.invoke()) == null || (str = b0Var.f26730b) == null) : !((b0Var2 = (b0) function0.invoke()) == null || (str = b0Var2.f26731c) == null)) {
                            str3 = str;
                        }
                        hashMap.put("entered_query", str3);
                        hashMap.put("onebar_module_type", String.valueOf(u1Var.f67273e));
                        hashMap.put("grid_index", String.valueOf(u1Var.f67272d));
                        String str4 = u1Var.f67274f;
                        if (str4 != null) {
                            hashMap.put("label", str4);
                        }
                        d0Var.M((g0) this.f46784f, hashMap, v0Var, f0.l(u1Var));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d0 d0Var, Function0 function0) {
        this(d0Var, function0, g0.ONEBAR_MODULE);
        this.f46781c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(nx.d0 r3, kotlin.jvm.functions.Function0 r4, h32.g0 r5) {
        /*
            r2 = this;
            pb0.g r0 = pb0.g.f99432a
            r1 = 1
            r2.f46781c = r1
            java.lang.String r1 = "clock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "searchParametersProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            r2.<init>(r0, r3)
            r2.f46783e = r4
            r2.f46784f = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f46782d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.newshub.b.<init>(nx.d0, kotlin.jvm.functions.Function0, h32.g0):void");
    }
}
