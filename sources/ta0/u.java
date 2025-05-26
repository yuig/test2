package ta0;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements gw0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f116912c;

    public /* synthetic */ u(int i13, Object obj, Object obj2) {
        this.f116910a = i13;
        this.f116911b = obj;
        this.f116912c = obj2;
    }

    @Override // gw0.e
    public final void a(Uri uri) {
        int i13 = this.f116910a;
        Object obj = this.f116911b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(uri, "uri");
                ((u50.r) obj).a(o.f116891a);
                break;
            default:
                Intrinsics.checkNotNullParameter(uri, "uri");
                String path = uri.getPath();
                if (path != null) {
                    Context context = (Context) obj;
                    android.support.v4.media.a aVar = (android.support.v4.media.a) this.f116912c;
                    String uri2 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                    if (kotlin.text.z.p(uri2, "file:///", false)) {
                        uri = kg.p.B(context, new File(path), (m60.e) aVar.f15843g);
                    }
                    Function1 function1 = (Function1) aVar.f15838b;
                    Intrinsics.f(uri);
                    ((Boolean) function1.invoke(uri)).getClass();
                    break;
                }
                break;
        }
    }

    @Override // gw0.e
    public final void onError(Throwable t13) {
        int i13 = this.f116910a;
        Object obj = this.f116912c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(t13, "t");
                v vVar = (v) obj;
                u50.r rVar = (u50.r) this.f116911b;
                int i14 = qa0.f.collage_download_failed;
                vVar.getClass();
                v.j(rVar, i14);
                vVar.f116914b.q(t13, "Failed to store image to gallery", tb0.p.COLLAGES);
                break;
            default:
                Intrinsics.checkNotNullParameter(t13, "t");
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(t13, "Failed to store image to gallery", tb0.p.SHARING);
                ((i92.k) ((android.support.v4.media.a) obj).f15842f).h(a62.e.export_failed);
                break;
        }
    }
}
