package ads_mobile_sdk;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class eq0 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.m f4919a;

    public eq0(ao2.o oVar) {
        this.f4919a = oVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f4919a.h(new kk0(e13, yx0.f14447e, null, 4), new cq0(call));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f4919a.h(new pk0(response), new dq0(call));
    }
}
