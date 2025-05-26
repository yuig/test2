package com.pinterest.feature.search.results.view;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f47769j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f47770k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f47771l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f47772m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f47773n = new d(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f47774i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f47774i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.START), null, vn1.g.BODY_300, 0, fm1.c.GONE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096043);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.UI_400, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097071);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47774i) {
            case 0:
                break;
            case 1:
                cn1.y it = (cn1.y) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                break;
        }
        return b((rn1.a) obj);
    }
}
