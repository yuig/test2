package com.pinterest.feature.todaytab.articlefeed;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f48616j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f48617k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f48618l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f48619m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f48620n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f48621o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f48622p = new i(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i f48623q = new i(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f48624i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f48624i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(!it.isEmpty());
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f48624i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.BODY_300, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097071);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.UI_400, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097071);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48624i) {
            case 0:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.k)) {
                    break;
                } else {
                    break;
                }
        }
        return e((rn1.a) obj);
    }
}
