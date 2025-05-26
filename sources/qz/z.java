package qz;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class z extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ResponseBody f105464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo2.l f105465e;

    public z(ResponseBody responseBody, wo2.y yVar) {
        this.f105464d = responseBody;
        this.f105465e = yVar;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF95752e() {
        return this.f105464d.getF95752e();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF95751d() {
        return this.f105464d.getF95751d();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final wo2.l getF95753f() {
        return this.f105465e;
    }
}
