package com.pinterest.feature.settings.notifications;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final t f48264j = new t(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t f48265k = new t(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48266i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13) {
        super(1);
        this.f48266i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48266i) {
            case 0:
                jm1.b it = (jm1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = eo1.c.space_400;
                return jm1.b.e(it, null, new u50.b0(i13), new u50.b0(eo1.c.space_800), new u50.b0(i13), new u50.b0(i13), 97);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, null, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.HEADING_400, 0, null, null, null, null, false, 0, null, null, null, null, null, true, null, null, 1966055);
        }
    }
}
