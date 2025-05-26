package x72;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.pinterest.shuffles.scene.composer.LegacySceneView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public static f a(ViewStub stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        stub.setLayoutResource(a.view_legacy_scene_view);
        stub.setInflatedId(stub.getId());
        View inflate = stub.inflate();
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.shuffles.scene.composer.LegacySceneView");
        return new f((LegacySceneView) inflate);
    }

    public static g b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new g(context, null);
    }
}
