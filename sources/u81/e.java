package u81;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.PipelineThreadListener;
import net.quikkly.core.ScanResult;
import net.quikkly.core.Tag;

/* loaded from: classes5.dex */
public final class e implements PipelineThreadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f121021a;

    public e(i iVar) {
        this.f121021a = iVar;
    }

    @Override // net.quikkly.android.PipelineThreadListener
    public final void onFreeBuffer(byte[] buffer) {
        Camera camera;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!fa2.c.i() || (camera = fa2.c.f61593a) == null) {
            return;
        }
        camera.addCallbackBuffer(buffer);
    }

    @Override // net.quikkly.android.ScanResultListener
    public final void onScanResult(ScanResult scanResult) {
        Tag[] tags;
        Tag tag;
        if (scanResult != null) {
            i iVar = this.f121021a;
            if (iVar.f121037h == null || (tags = scanResult.tags) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(tags, "tags");
            if (tags.length == 0 || (tag = scanResult.tags[0]) == null) {
                return;
            }
            long j13 = tag.dataLong;
            String id3 = String.valueOf(j13);
            m81.e eVar = iVar.f121040k;
            if (eVar != null) {
                s81.b bVar = (s81.b) eVar;
                Intrinsics.checkNotNullParameter(id3, "id");
                if (bVar.f111892h) {
                    return;
                }
                bVar.f111892h = true;
                bVar.f111894j.post(new l7.j(bVar, j13, id3));
            }
        }
    }
}
