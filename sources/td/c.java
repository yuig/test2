package td;

import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class c implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f117375a;

    /* renamed from: b, reason: collision with root package name */
    public final a f117376b;

    public c(AssetManager assetManager, a aVar) {
        this.f117375a = assetManager;
        this.f117376b = aVar;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        com.bumptech.glide.load.data.k kVar;
        Uri uri = (Uri) obj;
        String substring = uri.toString().substring(22);
        ge.d dVar = new ge.d(uri);
        int i15 = ((b) this.f117376b).f117370a;
        AssetManager assetManager = this.f117375a;
        switch (i15) {
            case 0:
                kVar = new com.bumptech.glide.load.data.k(assetManager, substring, 0);
                break;
            default:
                kVar = new com.bumptech.glide.load.data.k(assetManager, substring, 1);
                break;
        }
        return new b0(dVar, kVar);
    }
}
