package yq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import nx.j0;

/* loaded from: classes3.dex */
public final class d extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f139631a;

    /* renamed from: b, reason: collision with root package name */
    public final n f139632b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139633c;

    /* renamed from: d, reason: collision with root package name */
    public final String f139634d;

    /* renamed from: e, reason: collision with root package name */
    public final lu1.b f139635e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f139636f;

    public d(String id3, n pincodeType, String str, String str2, lu1.b baseActivityHelper, f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(pincodeType, "pincodeType");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f139631a = id3;
        this.f139632b = pincodeType;
        this.f139633c = str;
        this.f139634d = str2;
        this.f139635e = baseActivityHelper;
        this.f139636f = ((nx.m) pinalyticsFactory).a(this);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.t(new i(context, this.f139634d, this.f139631a, this.f139632b, this.f139633c, this.f139636f));
        return modalViewWrapper;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.PINCODE, null, null, null, null, null);
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // jc0.a0
    public final void onActivityResult(int i13, int i14, Intent intent) {
        String stringExtra;
        if (i14 != 975 || intent == null || (stringExtra = intent.getStringExtra("com.pinterest.EXTRA_PHOTO_PATH")) == null) {
            return;
        }
        Context context = getModalViewWrapper().getContext();
        Intrinsics.f(context);
        lu1.c cVar = (lu1.c) this.f139635e;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intent b13 = cVar.f84972b.b(context, lu1.a.USER_SET_ACTIVITY);
        b13.setFlags(603979776);
        b13.putExtra("com.pinterest.EXTRA_PHOTO_PATH", stringExtra);
        context.startActivity(b13);
    }
}
