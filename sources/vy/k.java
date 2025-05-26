package vy;

import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.MultipartBody;

/* loaded from: classes.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f126865i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(1);
        this.f126865i = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MultipartBody.Part it = (MultipartBody.Part) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f126865i.h().d(z0.d(), it);
    }
}
