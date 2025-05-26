package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.graphics.Bitmap;
import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class x implements o0, qa2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f46365b;

    public /* synthetic */ x(int i13, Function0 function0) {
        this.f46364a = i13;
        this.f46365b = function0;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.o0
    public void e(Bitmap bitmap) {
        int i13 = this.f46364a;
        Function0 function0 = this.f46365b;
        switch (i13) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }

    @Override // qa2.d0
    public void onOpenPinCloseup(f30 it) {
        int i13 = this.f46364a;
        Function0 handleClick = this.f46365b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(handleClick, "$handleClick");
                Intrinsics.checkNotNullParameter(it, "it");
                handleClick.invoke();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(handleClick, "$clickEvent");
                Intrinsics.checkNotNullParameter(it, "it");
                handleClick.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(handleClick, "$clickEvent");
                Intrinsics.checkNotNullParameter(it, "it");
                handleClick.invoke();
                break;
        }
    }
}
