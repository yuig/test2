package aw0;

import com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ UploadIdeaPinImageMediaWorker f20583i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ byte[] f20584j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker, byte[] bArr) {
        super(1);
        this.f20583i = uploadIdeaPinImageMediaWorker;
        this.f20584j = bArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ag1.k data = (ag1.k) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        return ag1.k.a(data, null, null, null, null, new fg1.a((String) this.f20583i.H.getValue(), this.f20584j), 63);
    }
}
