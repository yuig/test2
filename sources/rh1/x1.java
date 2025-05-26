package rh1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrh1/x1;", "Lnl1/d;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class x1 extends c1 {

    /* renamed from: c0, reason: collision with root package name */
    public WebImageView f108330c0;

    public x1() {
        this.E = db0.d.photo_comment_viewer_fragment;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF68302m1() {
        return d4.PIN_COMMENTS;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ob2.c.photo_detail_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f108330c0 = (WebImageView) findViewById;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.DID_IT_IMAGE_URI") : null;
        if (v03 == null) {
            v03 = "";
        }
        if (v03.length() > 0) {
            WebImageView webImageView = this.f108330c0;
            if (webImageView == null) {
                Intrinsics.r("commentPhotoImageView");
                throw null;
            }
            Navigation navigation2 = this.I;
            String v04 = navigation2 != null ? navigation2.v0("com.pinterest.DID_IT_IMAGE_URI") : null;
            webImageView.loadUrl(v04 != null ? v04 : "");
        }
    }
}
