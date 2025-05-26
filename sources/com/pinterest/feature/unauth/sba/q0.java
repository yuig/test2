package com.pinterest.feature.unauth.sba;

import kotlin.jvm.internal.Intrinsics;
import wr1.f1;

/* loaded from: classes5.dex */
public final /* synthetic */ class q0 implements o82.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48860a;

    public /* synthetic */ q0(int i13) {
        this.f48860a = i13;
    }

    @Override // o82.p
    public final String a(int i13, l82.i0 i0Var) {
        switch (this.f48860a) {
            case 0:
                y item = (y) i0Var;
                Intrinsics.checkNotNullParameter(item, "item");
                item.getClass();
                return y.f48880b;
            case 1:
                e0 item2 = (e0) i0Var;
                Intrinsics.checkNotNullParameter(item2, "item");
                return item2.getId();
            case 2:
                y item3 = (y) i0Var;
                Intrinsics.checkNotNullParameter(item3, "item");
                item3.getClass();
                return y.f48880b;
            case 3:
                f1 item4 = (f1) i0Var;
                Intrinsics.checkNotNullParameter(item4, "item");
                return String.valueOf(item4.f130967a.hashCode());
            case 4:
                s02.k item5 = (s02.k) i0Var;
                Intrinsics.checkNotNullParameter(item5, "item");
                return item5.f110322a;
            case 5:
                r52.a item6 = (r52.a) i0Var;
                Intrinsics.checkNotNullParameter(item6, "item");
                String id3 = item6.f106256a.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                return id3;
            case 6:
                s52.q item7 = (s52.q) i0Var;
                Intrinsics.checkNotNullParameter(item7, "item");
                return String.valueOf(item7.hashCode());
            default:
                ad2.j item8 = (ad2.j) i0Var;
                Intrinsics.checkNotNullParameter(item8, "item");
                return String.valueOf(item8.hashCode());
        }
    }
}
