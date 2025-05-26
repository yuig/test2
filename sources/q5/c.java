package q5;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ContentInfo.Builder f102410a;

    public c(ClipData clipData, int i13) {
        this.f102410a = n7.g0.j(clipData, i13);
    }

    @Override // q5.d
    public final void a(Bundle bundle) {
        this.f102410a.setExtras(bundle);
    }

    @Override // q5.d
    public final g build() {
        ContentInfo build;
        build = this.f102410a.build();
        return new g(new gc.c(build));
    }

    @Override // q5.d
    public final void d(Uri uri) {
        this.f102410a.setLinkUri(uri);
    }

    @Override // q5.d
    public final void e(int i13) {
        this.f102410a.setFlags(i13);
    }
}
