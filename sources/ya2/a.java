package ya2;

import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import pk.a0;
import uj2.q;
import uk1.d;
import yk1.c;
import yk1.r;
import za2.b;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final j f138315a;

    /* renamed from: b, reason: collision with root package name */
    public String f138316b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f138317c;

    /* renamed from: d, reason: collision with root package name */
    public String f138318d;

    /* renamed from: e, reason: collision with root package name */
    public String f138319e;

    /* renamed from: f, reason: collision with root package name */
    public String f138320f;

    /* renamed from: g, reason: collision with root package name */
    public String f138321g;

    /* renamed from: h, reason: collision with root package name */
    public String f138322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d presenterPinalytics, q networkStateStream, j storyImpressionHelper) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        this.f138315a = storyImpressionHelper;
        this.f138316b = "";
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((b) ((xa2.a) getView())).f141483d = null;
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(xa2.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        String imageUrl = this.f138318d;
        if (imageUrl == null) {
            imageUrl = "";
        }
        String titleText = this.f138319e;
        if (titleText == null) {
            titleText = "";
        }
        String str = this.f138320f;
        String buttonText = str != null ? str : "";
        b bVar = (b) view;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        ProportionalImageView proportionalImageView = bVar.f141485f;
        if (!Intrinsics.d(imageUrl, proportionalImageView.f52563o)) {
            proportionalImageView.loadUrl(imageUrl);
        }
        a0.p(bVar.f141486g, titleText);
        bVar.f141487h.d(new kw1.c(buttonText, 17));
        ((b) view).f141483d = this;
    }
}
