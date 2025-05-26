package vy;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.MultipartBody;

/* loaded from: classes.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f126852i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f126853j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, yk2.g gVar) {
        super(1);
        this.f126852i = mVar;
        this.f126853j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MultipartBody.Part it = (MultipartBody.Part) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f126852i.h().d(this.f126853j, it);
    }
}
