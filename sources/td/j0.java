package td;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117408a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f117409b;

    public /* synthetic */ j0(int i13, Resources resources) {
        this.f117408a = i13;
        this.f117409b = resources;
    }

    @Override // td.d0
    public final c0 a(i0 i0Var) {
        int i13 = this.f117408a;
        Resources resources = this.f117409b;
        switch (i13) {
            case 0:
                return new g0(resources, i0Var.c(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new g0(resources, i0Var.c(Uri.class, InputStream.class));
            default:
                return new g0(resources, n0.f117423a);
        }
    }
}
