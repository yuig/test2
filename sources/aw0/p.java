package aw0;

import android.media.MediaFormat;
import et1.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20577i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vd0.c f20578j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(vd0.c cVar, int i13) {
        super(2);
        this.f20577i = i13;
        this.f20578j = cVar;
    }

    public final void b(MediaFormat mediaFormat, String mimeType) {
        int i13 = 0;
        int i14 = this.f20577i;
        vd0.c cVar = this.f20578j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                if (nt1.d.d(mimeType) == j0.VIDEO) {
                    String[] strArr = mg1.b.f87148a;
                    cVar.r(Integer.valueOf((mediaFormat == null || !mediaFormat.containsKey("frame-rate")) ? 0 : mediaFormat.getInteger("frame-rate")), "fps");
                }
                if (nt1.d.e(mimeType)) {
                    cVar.r(Integer.valueOf((mediaFormat == null || !mediaFormat.containsKey("channel-count")) ? 0 : mediaFormat.getInteger("channel-count")), "num_channels");
                    if (mediaFormat != null && mediaFormat.containsKey("sample-rate")) {
                        i13 = mediaFormat.getInteger("sample-rate");
                    }
                    cVar.r(Integer.valueOf(i13), "sample_rate");
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                if (nt1.d.e(mimeType)) {
                    cVar.r(Integer.valueOf((mediaFormat == null || !mediaFormat.containsKey("channel-count")) ? 0 : mediaFormat.getInteger("channel-count")), "num_channels");
                    if (mediaFormat != null && mediaFormat.containsKey("sample-rate")) {
                        i13 = mediaFormat.getInteger("sample-rate");
                    }
                    cVar.r(Integer.valueOf(i13), "sample_rate");
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f20577i) {
            case 0:
                b((MediaFormat) obj, (String) obj2);
                break;
            default:
                b((MediaFormat) obj, (String) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
