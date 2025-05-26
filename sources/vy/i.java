package vy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.MultipartBody;

/* loaded from: classes.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f126863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar) {
        super(1);
        this.f126863i = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MultipartBody.Part it = (MultipartBody.Part) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        m mVar = this.f126863i;
        return (mVar.f126881e.l() ? mVar.f126879c : mVar.f126880d).a(it);
    }
}
