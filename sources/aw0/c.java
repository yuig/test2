package aw0;

import com.pinterest.api.model.UploadStatus;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f20545j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f20546k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20547i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f20547i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20547i) {
            case 0:
                UploadStatus uploadStatus = (UploadStatus) obj;
                Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
                String valueOf = String.valueOf(uploadStatus.getId());
                String status = uploadStatus.getStatus();
                if (status == null) {
                    status = "";
                }
                return g3.M(valueOf, status);
            default:
                return Unit.f80348a;
        }
    }
}
