package com.facebook.login;

import android.graphics.Bitmap;
import androidx.activity.result.ActivityResult;
import com.pinterest.feature.ideaPinCreation.closeup.view.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.s0;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements g.a, o0, ou0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f30028a;

    public /* synthetic */ o(Function1 function1) {
        this.f30028a = function1;
    }

    @Override // ou0.j
    public void b(boolean z13) {
        Function1 onEvent = this.f30028a;
        Intrinsics.checkNotNullParameter(onEvent, "$onEvent");
        if (z13) {
            return;
        }
        onEvent.invoke(s0.f111788a);
    }

    @Override // g.a
    public void c(Object obj) {
        int i13 = q.f30030f;
        Function1 tmp0 = this.f30028a;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke((ActivityResult) obj);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.o0
    public void e(Bitmap bitmap) {
        Function1 onSuccess = this.f30028a;
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        if (bitmap != null) {
            onSuccess.invoke(bitmap);
        }
    }
}
