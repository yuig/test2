package qw0;

import android.content.Context;
import com.pinterest.api.model.bh;
import com.pinterest.feature.mediagallery.view.MediaDirectoryView;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import qv0.d0;
import u50.f0;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public bh f105267a;

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        MediaDirectoryView view = (MediaDirectoryView) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        p3();
    }

    public final void p3() {
        bh bhVar;
        if (isBound() && (bhVar = this.f105267a) != null) {
            MediaDirectoryView mediaDirectoryView = (MediaDirectoryView) getView();
            mediaDirectoryView.getClass();
            String path = bhVar.f36103c;
            Intrinsics.checkNotNullParameter(path, "path");
            ProportionalImageView proportionalImageView = mediaDirectoryView.f46736b;
            proportionalImageView.w1();
            File file = new File(path);
            int i13 = mediaDirectoryView.f46735a;
            proportionalImageView.P0(file, i13, i13);
            String name = bhVar.f36104d;
            Intrinsics.checkNotNullParameter(name, "name");
            if (name.length() == 0) {
                name = mediaDirectoryView.getResources().getString(dt1.d.all_photos);
                Intrinsics.checkNotNullExpressionValue(name, "getString(...)");
            }
            f0 h23 = bs1.c.h2(name);
            a0.q(mediaDirectoryView.f46737c, h23);
            Context context = mediaDirectoryView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            mediaDirectoryView.setContentDescription(h23.a(context));
            a0.q(mediaDirectoryView.f46738d, bs1.c.h2(String.valueOf(bhVar.f36105e)));
            String path2 = bhVar.e();
            Intrinsics.checkNotNullParameter(path2, "path");
            mediaDirectoryView.setOnClickListener(new d0(2, mediaDirectoryView, path2));
        }
    }
}
