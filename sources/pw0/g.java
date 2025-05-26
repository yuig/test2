package pw0;

import android.os.Bundle;
import androidx.fragment.app.w0;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.feature.mediagallery.MediaGalleryActivity;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sw0.j0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101518i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MediaGalleryActivity f101519j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MediaGalleryActivity mediaGalleryActivity, int i13) {
        super(1);
        this.f101518i = i13;
        this.f101519j = mediaGalleryActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101518i;
        MediaGalleryActivity mediaGalleryActivity = this.f101519j;
        switch (i13) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Intrinsics.f(bundle);
                wk2.a aVar = mediaGalleryActivity.f46717j;
                if (aVar == null) {
                    Intrinsics.r("mediaGalleryFragmentProvider");
                    throw null;
                }
                j0 j0Var = (j0) aVar.get();
                bundle.putString("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE", mediaGalleryActivity.getIntent().getStringExtra("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE"));
                bundle.putBoolean("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", mediaGalleryActivity.getIntent().getBooleanExtra("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false));
                bundle.putString("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", mediaGalleryActivity.getIntent().getStringExtra("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE"));
                bundle.putBoolean("com.pinterest.REMOVE_PROFILE_COVER", mediaGalleryActivity.getIntent().getBooleanExtra("com.pinterest.REMOVE_PROFILE_COVER", false));
                bundle.putString("com.pinterest.EXTRA_COMMENT_ID", mediaGalleryActivity.getIntent().getStringExtra("com.pinterest.EXTRA_COMMENT_ID"));
                bundle.putString("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME", mediaGalleryActivity.getIntent().getStringExtra("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME"));
                bundle.putString("com.pinterest.EXTRA_COMMENT_TEXT", mediaGalleryActivity.getIntent().getStringExtra("com.pinterest.EXTRA_COMMENT_TEXT"));
                bundle.putString("com.pinterest.EXTRA_COMMENT_PIN_ID", mediaGalleryActivity.getIntent().getStringExtra("com.pinterest.EXTRA_COMMENT_PIN_ID"));
                bundle.putString("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH", mediaGalleryActivity.getIntent().getStringExtra("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH"));
                bundle.putInt("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", mediaGalleryActivity.getIntent().getIntExtra("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", 0));
                j0Var.setArguments(bundle);
                w0 supportFragmentManager = mediaGalleryActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                mo1.c.c(supportFragmentManager, ct1.b.fragment_wrapper, j0Var, false, null, 48);
                PinterestLoadingLayout pinterestLoadingLayout = mediaGalleryActivity.f46712e;
                if (pinterestLoadingLayout != null) {
                    pinterestLoadingLayout.showLoadingSpinner(false);
                    return Unit.f80348a;
                }
                Intrinsics.r("loadingView");
                throw null;
            default:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q((Throwable) obj, "Unknown error loading MediaGallery", tb0.p.MEDIA_GALLERY);
                PinterestLoadingLayout pinterestLoadingLayout2 = mediaGalleryActivity.f46712e;
                if (pinterestLoadingLayout2 == null) {
                    Intrinsics.r("loadingView");
                    throw null;
                }
                pinterestLoadingLayout2.showLoadingSpinner(false);
                mediaGalleryActivity.finish();
                return Unit.f80348a;
        }
    }
}
