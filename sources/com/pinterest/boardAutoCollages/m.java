package com.pinterest.boardAutoCollages;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f44580i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f44581j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, int i13) {
        super(0);
        this.f44580i = i13;
        this.f44581j = qVar;
    }

    public final String b() {
        int i13 = this.f44580i;
        q qVar = this.f44581j;
        switch (i13) {
            case 0:
                return com.bumptech.glide.d.Z(qVar, "com.pinterest.EXTRA_BOARD_ID", "");
            case 1:
                return com.bumptech.glide.d.Z(qVar, "com.pinterest.EXTRA_BOARD_SESSION_ID", "");
            default:
                return com.bumptech.glide.d.Z(qVar, "com.pinterest.EXTRA_REQUEST_PARAMS", "");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44580i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                q qVar = this.f44581j;
                Context requireContext = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                a82.b bVar = qVar.L0;
                if (bVar != null) {
                    return new xa0.p(requireContext, bVar);
                }
                Intrinsics.r("offscreenRenderer");
                throw null;
            default:
                return b();
        }
    }
}
