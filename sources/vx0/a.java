package vx0;

import com.pinterest.feature.newshub.view.content.NewsHubBoardImageView;
import com.pinterest.ui.imageview.GrayWebImageView;
import hs1.c;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GrayWebImageView f126816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewsHubBoardImageView f126817c;

    public a(GrayWebImageView grayWebImageView, NewsHubBoardImageView newsHubBoardImageView, int i13) {
        this.f126815a = i13;
        this.f126816b = grayWebImageView;
        this.f126817c = newsHubBoardImageView;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        int i13 = this.f126815a;
        GrayWebImageView grayWebImageView = this.f126816b;
        NewsHubBoardImageView newsHubBoardImageView = this.f126817c;
        switch (i13) {
            case 0:
                grayWebImageView.F0(newsHubBoardImageView.f46816a);
                break;
            default:
                grayWebImageView.F0(newsHubBoardImageView.f46816a);
                break;
        }
    }
}
