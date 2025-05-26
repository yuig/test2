package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final double f108043c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108044d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108045e;

    /* renamed from: f, reason: collision with root package name */
    public final String f108046f;

    /* renamed from: g, reason: collision with root package name */
    public final String f108047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(vd0.c cVar) {
        super(null, null);
        double i13 = cVar.i("video_aspect_ratio", Double.NaN);
        String videoUrl = cVar.o("video_url", "");
        videoUrl = videoUrl == null ? "" : videoUrl;
        vd0.c m13 = cVar.m("complete_button");
        String completeButton = (m13 == null || (completeButton = m13.o("text", "")) == null) ? "" : completeButton;
        String thumbnail = cVar.o("thumbnail", "");
        thumbnail = thumbnail == null ? "" : thumbnail;
        String d2 = cVar.d("board_preview_id");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(completeButton, "completeButton");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        this.f108043c = i13;
        this.f108044d = videoUrl;
        this.f108045e = completeButton;
        this.f108046f = thumbnail;
        this.f108047g = d2;
        String o13 = cVar.o("title_text", "");
        this.f15163a = o13 == null ? "" : o13;
        String o14 = cVar.o("detailed_text", "");
        this.f15164b = o14 != null ? o14 : "";
    }

    public final String c() {
        return this.f108046f;
    }

    public final double d() {
        return this.f108043c;
    }

    public final String e() {
        return this.f108044d;
    }
}
