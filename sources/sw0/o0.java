package sw0;

import android.view.View;
import com.pinterest.api.model.pu;
import com.pinterest.feature.mediagallery.view.MediaThumbnailView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaThumbnailView f115530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pu f115531c;

    public /* synthetic */ o0(MediaThumbnailView mediaThumbnailView, pu puVar, int i13) {
        this.f115529a = i13;
        this.f115530b = mediaThumbnailView;
        this.f115531c = puVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f115529a;
        pu mediaItem = this.f115531c;
        MediaThumbnailView this$0 = this.f115530b;
        switch (i13) {
            case 0:
                int i14 = MediaThumbnailView.f46740s;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(mediaItem, "$mediaItem");
                pw0.y yVar = this$0.f46741a;
                if (yVar != null) {
                    ((qw0.j) yVar).L3(mediaItem);
                    break;
                }
                break;
            default:
                int i15 = MediaThumbnailView.f46740s;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(mediaItem, "$mediaItem");
                pw0.r rVar = this$0.f46742b;
                if (rVar != null) {
                    ((qw0.j) rVar).I3(mediaItem);
                    break;
                }
                break;
        }
    }
}
