package ads_mobile_sdk;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k80 implements a.b, a.ce {

    /* renamed from: a, reason: collision with root package name */
    public final ym0 f7159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ce f7160b;

    public k80(ym0 gmaWebView) {
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        this.f7159a = gmaWebView;
        this.f7160b = gmaWebView.b();
    }

    @Override // a.b
    public final ym0 a() {
        return this.f7159a;
    }

    @Override // a.ce
    public final Object a(ym0 ym0Var, Uri uri, bl2.c cVar) {
        return this.f7160b.a(ym0Var, uri, cVar);
    }

    @Override // a.ce
    public final Object a(ym0 ym0Var, String str, bl2.c cVar) {
        return this.f7160b.a(ym0Var, str, cVar);
    }

    @Override // a.ce
    public final Object a(String str, a.cd cdVar, bl2.c cVar) {
        return this.f7160b.a(str, cdVar, cVar);
    }

    @Override // a.ce
    public final Object a(String str, ao2.v vVar, fm0 fm0Var) {
        return this.f7160b.a(str, vVar, fm0Var);
    }
}
