package uv;

import android.widget.ImageView;
import b82.k;
import com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutImageView;
import com.pinterest.feature.boardpreview.view.BaseBoardPreviewContainer;
import java.lang.Thread;
import jg1.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tb0.h;
import tb0.p;
import y90.m1;
import y90.n1;
import y90.p1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123149b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f123148a = i13;
        this.f123149b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th3) {
        int i13 = this.f123148a;
        Object obj = this.f123149b;
        switch (i13) {
            case 0:
                HeroCollagesCarouselCutoutImageView this$0 = (HeroCollagesCarouselCutoutImageView) obj;
                int i14 = HeroCollagesCarouselCutoutImageView.f35466j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h hVar = this$0.f35472f;
                if (hVar != null) {
                    hVar.q(th3, "SceneView on Carousel uncaught exception", p.COLLAGES);
                    return;
                } else {
                    Intrinsics.r("crashReporting");
                    throw null;
                }
            case 1:
                k90.e this$02 = (k90.e) obj;
                int i15 = k90.e.f78738k;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                h hVar2 = this$02.f78745g;
                if (hVar2 != null) {
                    hVar2.q(th3, "SceneView on Carousel uncaught exception", p.COLLAGES);
                    return;
                } else {
                    Intrinsics.r("crashReporting");
                    throw null;
                }
            case 2:
                p1 this$03 = (p1) obj;
                int i16 = n1.D;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.f138217f.d(th3, m1.f138204i);
                return;
            case 3:
                BaseBoardPreviewContainer this$04 = (BaseBoardPreviewContainer) obj;
                int i17 = BaseBoardPreviewContainer.f45326r;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                h hVar3 = this$04.f45330d;
                if (hVar3 != null) {
                    hVar3.q(th3, "SceneView on ShareBoardPreview uncaught exception", p.BOARD_INVITE);
                    return;
                } else {
                    Intrinsics.r("crashReporting");
                    throw null;
                }
            case 4:
                c0 this$05 = (c0) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.f75928J = th3;
                return;
            case 5:
                Function1 callback = (Function1) obj;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.f(th3);
                callback.invoke(th3);
                return;
            default:
                k this$06 = (k) obj;
                int i18 = k.C;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                h hVar4 = this$06.f22207o;
                if (hVar4 == null) {
                    Intrinsics.r("crashReporting");
                    throw null;
                }
                hVar4.q(th3, "SceneView on Closeup uncaught exception", p.COLLAGES);
                ImageView imageView = this$06.f22213u;
                imageView.setVisibility(0);
                imageView.setAlpha(1.0f);
                return;
        }
    }
}
