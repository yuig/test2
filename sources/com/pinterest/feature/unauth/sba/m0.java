package com.pinterest.feature.unauth.sba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48840i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f48841j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(l82.c0 c0Var, int i13) {
        super(0);
        this.f48840i = i13;
        this.f48841j = c0Var;
    }

    public final List b() {
        int i13 = this.f48840i;
        l82.c0 c0Var = this.f48841j;
        switch (i13) {
            case 0:
                List list = c0Var.f82214c;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new i0((o82.h0) it.next()));
                }
                return arrayList;
            case 1:
                List list2 = c0Var.f82214c;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new wr1.r0((o82.h0) it2.next()));
                }
                return arrayList2;
            case 2:
                List list3 = c0Var.f82214c;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new r52.p((o82.h0) it3.next()));
                }
                return arrayList3;
            default:
                List list4 = c0Var.f82214c;
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new ad2.n((o82.h0) it4.next()));
                }
                return arrayList4;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f48840i) {
        }
        return b();
    }
}
